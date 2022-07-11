package com.example.expensetracker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.expensetracker.database.expense.Expense


class ExpenseAdapter(private var expenses : ArrayList<Expense>) :RecyclerView.Adapter<ExpenseAdapter.ExpenseHolder>() {

    class ExpenseHolder(view: View): RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.expense_title)
        val exp:TextView = view.findViewById(R.id.expense)
        val `when`:TextView = view.findViewById(R.id.`when`)
        val category:TextView= view.findViewById(R.id.category)
        val edit_Button : Button = view.findViewById(R.id.edit_button)
        val deleteButton:Button = view.findViewById(R.id.delete_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.expense_view,parent,false)
        return ExpenseHolder(view)
    }

    override fun onBindViewHolder(holder: ExpenseHolder, position: Int) {
         val expense : Expense = expenses[position]
        holder.title.text = expense.expenseTitle
        holder.exp.setText( expense.expense)
        holder.`when`.text = expense.`when`
        holder.category.text = expense.category

        holder.edit_Button.setOnClickListener {
            //goto edit page

        }
        holder.deleteButton.setOnClickListener{
            //dlt from DB
        }
    }

    override fun getItemCount(): Int {
        return expenses.size
    }

    fun setData(expenses: List<Expense>){
        this.expenses = expenses as ArrayList<Expense>
        notifyDataSetChanged()
    }

}
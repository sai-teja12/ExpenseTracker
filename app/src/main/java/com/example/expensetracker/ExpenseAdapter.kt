package com.example.expensetracker

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.expensetracker.database.expense.Expense
import java.nio.file.Files.size

class ExpenseAdapter(private val context: Context, private val data : exp): RecyclerView.Adapter<ExpenseAdapter.ExpenseviewHolder>() {
    var expData = arrayOf<exp>()
        set (value){
            field = value
            notifyDataSetChanged()
        }
    class ExpenseviewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val expense_title: TextView = view.findViewById(R.id.expense_title)
        val expense :TextView= view.findViewById(R.id.expense)
        val whn : TextView = view.findViewById(R.id.`when`)
        val button: Button = view.findViewById(R.id.add_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseviewHolder {
        val adapterLayout  = LayoutInflater.from(parent.context).inflate(R.layout.expense_view,parent,false)
        return  ExpenseviewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ExpenseviewHolder, position: Int) {
        with(holder){
            expense_title.text = expData[position].expense_title
            expense.setText(expData[position].expense)
            whn.text = expData[position].`when`

        }
        holder.button.setOnClickListener {

//            val action = ListDisplayDirections.action_listDisplay_to_addEdit()
//            // Navigate using that action
//            holder.view.findNavController().navigate(action)
        }
        //have implemented
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return expData.size
    }
}
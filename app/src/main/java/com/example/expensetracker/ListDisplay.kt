package com.example.expensetracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expensetracker.database.expense.Expense
import com.example.expensetracker.databinding.FragmentListDisplayBinding

class ListDisplay : Fragment() {

    private val expenses = arrayListOf<Expense>(
        Expense(1,"at Barber Shop",200,"12June","Needs") ,
        Expense(2,"Grocery",500,"2June","Needs"),
        Expense(3,"Bus",150,"9June","Travel"),
        Expense(4,"Tshirt",600,"10June","Shopping"),
        Expense(5,"Shirt & Pant",2500,"28June","Shopping")
    )
    private var _binding: FragmentListDisplayBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListDisplayBinding.inflate(inflater, container, false)
        return binding.root
    }

    private var recyclerView: RecyclerView = binding.recyclerView

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        binding.recyclerView.layoutManager = LinearLayoutManager(this.context)
//        binding.addButton.setOnClickListener {
//
//            val action = ListDisplayDirections.actionListDisplayToAddEdit(
//                getString(R.string.)
//            )
//            this.findNavController().navigate(action)
//        }
//    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = ExpenseAdapter(expenses)
    }


}
package com.example.expensetracker

import android.os.Bundle
import android.view.*
import android.view.View.inflate
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expensetracker.databinding.FragmentListDisplayBinding


val expenses = arrayOf(exp("at barber Shop" ,200,"12June"),
    exp("at Baker",150,"3June"),
    exp("Petrol",150,"2June"),
    exp("Bus",450,"4June"),
    exp("Lunch",200,"3June")
)


class ListDisplay : Fragment() {
    private var _binding: FragmentListDisplayBinding ? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val expList  = binding.recyclerView.apply{
            layoutManager = LinearLayoutManager(this@ListDisplay)
            adapter = ExpenseAdapter().apply {
                setHasStableIds(true)
            }
            setHasFixedSize(true)
        }


        setHasOptionsMenu(true)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListDisplayBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    private lateinit var recyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}
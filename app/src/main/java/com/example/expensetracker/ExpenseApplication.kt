package com.example.expensetracker

import android.app.Application
import com.example.expensetracker.database.expense.ExpenseDatabase

class ExpenseApplication :Application() {
    val database: ExpenseDatabase by lazy { ExpenseDatabase.getDatabase(this) }
}
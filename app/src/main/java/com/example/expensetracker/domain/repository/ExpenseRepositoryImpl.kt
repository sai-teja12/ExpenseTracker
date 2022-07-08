package com.example.expensetracker.domain.repository

import com.example.expensetracker.database.expense.Expense
import com.example.expensetracker.database.expense.ExpenseDao
import io.reactivex.Completable
import io.reactivex.Single

class ExpenseRepositoryImpl(
    private val dao:ExpenseDao
) : ExpenseRepository{
    override fun updateExpense(exp: Expense): Completable {
        dao.updateExpense(exp)
    }

    override fun insertExpense(exp: Expense): Completable {
        dao.insertExpense(exp)
    }

    override fun deleteExpense(exp: Expense): Completable {
        dao.deleteExpense(exp)
    }

    override fun getAll(): Single<List<Expense>> {
        dao.getAll()
    }

    override fun getById(id: Int): Single<Expense> {
        dao.getById(id)
    }


}
package com.example.expensetracker.database.expense

import androidx.room.*
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface ExpenseDao {
    @Update
    fun updateExpense(exp: Expense) : Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertExpense(exp:Expense) : Completable

    @Delete
    fun deleteExpense(exp : Expense) : Completable

    @Query("SELECT * FROM Expense ORDER BY `when` ASC")
    fun getAll(): Single<List<Expense>>

    @Query("SELECT * FROM Expense WHERE Id = :id ")
            fun getById(id : Int) : Single<Expense>
}

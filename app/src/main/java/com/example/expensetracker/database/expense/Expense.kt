package com.example.expensetracker.database.expense

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.time.OffsetDateTime

@Entity
data class Expense(
    @PrimaryKey(autoGenerate = true) val Id: Int,
    @NotNull @ColumnInfo(name = "expense_title") val expenseTitle : String,
    @NotNull @ColumnInfo(name = "expense") val expense : Int,
    @NotNull @ColumnInfo(name = "when") val `when` :String,
    @NotNull @ColumnInfo(name = "category") val category: String
)

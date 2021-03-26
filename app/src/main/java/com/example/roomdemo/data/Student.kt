package com.example.roomdemo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "student_table") //to tell system this is database
data class Student (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name:String,
    val programme:String

)
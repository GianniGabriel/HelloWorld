package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Scanner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello, world!")
        val name = "Gianni"
        println("My name is $name")
    }
}
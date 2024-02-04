package com.cupp.msu.countapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.cupp.msu.countapp.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //Model
    private lateinit var btn: Button

    //View
    private var display: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        class Counter {
            private var count: Int = 0
            fun addCount() {
                count++
            }

            fun getCount(): Int {
                return count
            }
        }

        var count: Counter = Counter()
        display = binding.tv1

        btn = binding.btn1

        btn.setOnClickListener {
            count.addCount()

            display?.text = count.getCount().toString()

        }

    }
}
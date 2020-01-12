package com.example.section1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val resetButton: Button = findViewById(R.id.reset_button)

        rollButton.setOnClickListener { rollDice() }
        resetButton.setOnClickListener { resetLabel() }
    }

    private fun rollDice() {
        val resultLabel: TextView = findViewById(R.id.result_text)

        resultLabel.text = getString(R.string.newresult_text)
        Toast.makeText(this, getString(R.string.dice_was_rolled), Toast.LENGTH_SHORT).show()
    }

    private fun resetLabel(){
        val resultLabel: TextView = findViewById(R.id.result_text)

        resultLabel.text = getString(R.string.resetlabel_text)
    }
}

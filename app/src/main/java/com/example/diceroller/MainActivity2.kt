package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme) // Make sure this is a descendant of Theme.AppCompat
        setContentView(R.layout.activity_main2)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollButton.setOnClickListener {
                rollDice()
            }
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            toast.show()
        }

    // other initialization code
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}
class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }

}
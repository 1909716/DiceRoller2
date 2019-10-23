package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        //Toast.makeText(this, "button_clicked",
            //Toast.LENGTH_SHORT).show()

        val randomInt1 = Random().nextInt(6) + 1
        //val randomInt2 = Random().nextInt(6) + 1
        //val randomInt3 = Random().nextInt(6) + 1

        //val resultText1: TextView = findViewById(R.id.result_text1)
        //val resultText2: TextView = findViewById(R.id.result_text2)
        //val resultText3: TextView = findViewById(R.id.result_text3)
        //val totalText: TextView = findViewById(R.id.total_message)

        //resultText1.text = randomInt1.toString()
        //resultText2.text = randomInt2.toString()
        //resultText3.text = randomInt3.toString()

        //val total = randomInt1 + randomInt2 + randomInt3

        //totalText.text = total.toString()

        //val diceImage: ImageView = findViewById(R.id.dice_image)

        val drawableResource = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }
}

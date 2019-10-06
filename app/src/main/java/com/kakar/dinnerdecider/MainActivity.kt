package com.kakar.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var food = arrayListOf("Dosa")
        addFoodButton.setOnClickListener{
            if (addFoodText.text.count()!=0)
                food.add(addFoodText.text.toString())
            addFoodText.text.clear()

        }
        decideButton.setOnClickListener {
            var r = Random()
            var rI = r.nextInt(food.size)
            selectedFoodTxt.text = food[rI]
        }

        rmvBtn.setOnClickListener {
            food.remove(selectedFoodTxt.text)
            selectedFoodTxt.text = "Removed !!"
        }
    }
}

class ABC{
    var a=""
    
}
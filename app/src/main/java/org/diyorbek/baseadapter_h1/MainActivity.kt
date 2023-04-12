package org.diyorbek.baseadapter_h1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ListView
import androidx.core.view.isVisible
import org.diyorbek.baseadapter_h1.adapterFood.FoodAdapter
import org.diyorbek.baseadapter_h1.model.FoodInfo

class MainActivity : AppCompatActivity() {
    private val foodadapter by lazy { FoodAdapter(this, foodList()) }
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        listView = findViewById(R.id.listView)
        listView.adapter = foodadapter


        val layotut: Button = findViewById(R.id.btn)
        Handler(Looper.getMainLooper()).postDelayed({
            layotut.isVisible = true
        }, 5000)
        layotut.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    private fun foodList(): MutableList<FoodInfo> {
        val list = mutableListOf<FoodInfo>()
        list.add(FoodInfo(R.drawable.pizza_picture, "Pizza", "Spicy chicken Pizza", "R.S 310.00"))
        list.add(FoodInfo(R.drawable.burger_image, "Burger", "Beef Burger", "R.S 350.00"))
        list.add(FoodInfo(R.drawable.chicken_pizza_picture, "Pizza", "Chicken Pizza", "R.S 250.00"))
        list.add(
            FoodInfo(
                R.drawable.chicken_burger_picture,
                "Burger",
                "Chicken Burger",
                "R.S 350.00"
            )
        )
        list.add(FoodInfo(R.drawable.fish_burger_picture, "Burger", "Fish Burger", "R.S 310.00"))
        list.add(FoodInfo(R.drawable.mango_juice_picture, "Mange", "Mango Juice", "R.S 250.00"))
        return list
    }
}
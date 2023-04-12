package org.diyorbek.baseadapter_h1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import org.diyorbek.baseadapter_h1.adapterFood.FoodAdapter
import org.diyorbek.baseadapter_h1.model.FoodInfo

class SecondActivity : AppCompatActivity() {
    private val foodDapter by lazy { FoodAdapter(this, listFood()) }
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        listView = findViewById(R.id.listView2)
        listView.adapter = foodDapter

    }

    private fun listFood(): MutableList<FoodInfo> {
        val list = mutableListOf<FoodInfo>()
        list.add(FoodInfo(R.drawable.london, "London", "https://en.wikipedia.org/wiki/London", ""))
        list.add(FoodInfo(R.drawable.rome, "Rome", "https://en.wikipedia.org/wiki/Rome", ""))
        list.add(FoodInfo(R.drawable.paris, "Paris", "https://en.wikipedia.org/wiki/Paris", ""))
        return list
    }
}
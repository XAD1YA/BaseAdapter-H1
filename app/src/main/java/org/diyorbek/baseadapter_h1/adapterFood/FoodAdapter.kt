package org.diyorbek.baseadapter_h1.adapterFood

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.diyorbek.baseadapter_h1.R
import org.diyorbek.baseadapter_h1.model.FoodInfo

class FoodAdapter(context: Context, private val foodList: MutableList<FoodInfo>) : BaseAdapter() {
    private val layoutInflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return foodList.size
    }

    override fun getItem(p0: Int): FoodInfo {
        return foodList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(posit: Int, p1: View?, p2: ViewGroup?): View {
        val view = layoutInflater.inflate(R.layout.list_example, p2, false)
        val image: ImageView = view.findViewById(R.id.foodPicture)
        val foodType: TextView = view.findViewById(R.id.typeOfFood)
        val foodName: TextView = view.findViewById(R.id.foodName)
        val foodPrize: TextView = view.findViewById(R.id.foodPrize)
        val food = getItem(posit)
        image.setImageResource(food.foodImage)
        foodType.text = food.foodType
        foodName.text = food.foodName
        foodPrize.text = food.foodPrize
        return view
    }
}
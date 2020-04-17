package com.work.lab3

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.work.lab3.SecondActivity.Companion.EXTRA_DESCRIPTION
import com.work.lab3.SecondActivity.Companion.EXTRA_IMAGE
import com.work.lab3.SecondActivity.Companion.EXTRA_NAME
import kotlinx.android.synthetic.main.item_layout.view.*

class ListAdapter(val context: Context, val dataList: List<Data>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        with(view) {
            name.text = dataList[position].name
            description.text = dataList[position].description
            image.setImageResource(dataList[position].image)
            info.setOnClickListener {
                val intent = Intent(context, SecondActivity::class.java)
                intent.putExtra(EXTRA_NAME, dataList[position].name)
                intent.putExtra(EXTRA_DESCRIPTION, dataList[position].description)
                intent.putExtra(EXTRA_IMAGE, dataList[position].image)
                context.startActivity(intent)
            }
        }
        return view
    }

    override fun getItem(position: Int) = dataList[position]

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount() = dataList.size
}
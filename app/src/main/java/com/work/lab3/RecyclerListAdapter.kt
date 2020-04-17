package com.work.lab3

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class RecyclerListAdapter(private val data: List<Data>) :
    RecyclerView.Adapter<RecyclerListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder.itemView) {
            image.setImageResource(data[position].image)
            name.text = data[position].name
            description.text = data[position].description
            info.setOnClickListener {
                val intent = Intent(context, SecondActivity::class.java)
                intent.putExtra(SecondActivity.EXTRA_NAME, data[position].name)
                intent.putExtra(SecondActivity.EXTRA_DESCRIPTION, data[position].description)
                intent.putExtra(SecondActivity.EXTRA_IMAGE, data[position].image)
                context.startActivity(intent)
            }
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}
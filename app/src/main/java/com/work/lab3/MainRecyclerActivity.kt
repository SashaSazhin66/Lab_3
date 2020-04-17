package com.work.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main_recycler.*

class MainRecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycler)
        with(list) {
            layoutManager = LinearLayoutManager(this@MainRecyclerActivity)
            adapter = RecyclerListAdapter(Data.getData())
        }
    }
}

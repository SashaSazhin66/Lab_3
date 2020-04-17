package com.work.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "EXTRA_NAME"
        const val EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION"
        const val EXTRA_IMAGE = "EXTRA_IMAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initData()
        back.setOnClickListener { finish() }
    }

    private fun initData() {
        name.text = intent.getStringExtra(EXTRA_NAME)
        description.text = intent.getStringExtra(EXTRA_DESCRIPTION)
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))
    }
}

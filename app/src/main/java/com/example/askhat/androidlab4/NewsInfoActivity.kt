package com.example.askhat.androidlab4

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import com.example.askhat.androidlab4.entities.Post
import kotlinx.android.synthetic.main.activity_news_info.*

class NewsInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_info)
        val news= intent.getSerializableExtra("object") as Post
        setSupportActionBar(toolbarInfo)
        val actionbar: ActionBar? = supportActionBar
        actionbar?.apply {
            title = news.title
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)

        }
    }
}

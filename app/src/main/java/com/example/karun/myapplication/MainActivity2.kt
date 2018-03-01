package com.example.karun.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

import technolifestyle.com.imageslider.FlipperLayout
import technolifestyle.com.imageslider.FlipperView

class MainActivity2 : AppCompatActivity() {

   private lateinit var flipperLayout: FlipperLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        flipperLayout = findViewById(R.id.flipper_layout)

        setLayout()
    }

    private fun setLayout() {
        val url = arrayOf("http://images.indianexpress.com/2017/12/national-anthem-lead.jpg",
                "https://studentcareercoach.files.wordpress.com/2012/06/bigstock_portrait_of_happy_teens_lookin_13855142.jpg",
                "https://static.socialpost.news/wp-content/uploads/2018/02/students.jpg",
                "http://cdn.odishatv.in/wp-content/uploads/2017/11/school-student.jpg",
                "https://i.ytimg.com/vi/2NM5Vdtoy1o/maxresdefault.jpg",
                "http://images.newindianexpress.com/uploads/user/imagelibrary/2017/4/18/original/Where4.jpg")

        for (i in 0..5) {
            val view = FlipperView(baseContext)
            view.imageUrl = url[i]
            // .setDescription("Cool" + (i + 1));
            flipperLayout.addFlipperView(view)
            view.setOnFlipperClickListener { Toast.makeText(this@MainActivity2,
                    "Here " + (flipperLayout.currentPagePosition + 1),
                    Toast.LENGTH_SHORT).show() }
        }
    }
}
package com.achek.urlsviewfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class
MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val urls = arrayOf(
            "https://mobimg.b-cdn.net/pic/v2/gallery/preview/eda-fon-golubika-rasteniya-660.jpg",
            "https://mobimg.b-cdn.net/pic/v2/gallery/preview/apelsiny-eda-frukty-kapli-9308.jpg",
            "https://mobimg.b-cdn.net/pic/v2/gallery/preview/arbuzy-eda-frukty-36722.jpg",
            "https://mobimg.b-cdn.net/pic/v2/gallery/preview/eda-ereshnya-frukty-30896.jpg",
            "https://mobimg.b-cdn.net/pic/v2/gallery/preview/bloki-eda-frukty-kapli-13400.jpg")

        supportFragmentManager.beginTransaction().add(R.id.main_container, PhotoViewerFragment.NewInstance(urls)).commit()
    }
}

package com.example.servis001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.content.Intent
import android.media.MediaPlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btn facebook jika diklik akan menampilkan  halaman facebook.com

        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/rizkyagunglesmana"))
            startActivity(i)
        })
        //button instagram jika diklik akan menampilkan halaman instagram.com
        btn_instagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/@rizkyagunglesmana"))
            startActivity(i)
        })
        //Mendeklarasikan variabel MediaPlayer dan memanggil data mp3
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.indonesia_raya)

        //button yang berfungsi untuk memutar mp3
        btn_play.setOnClickListener {
            MediaPlayer?.start()
        }
        //button yang berfungsi untuk melakukan pause mp3
        btn_pause.setOnClickListener {
            MediaPlayer?.pause()
        }
        //button yang berfungsi untuk melakukan stop mp3
        btn_stop.setOnClickListener {
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}


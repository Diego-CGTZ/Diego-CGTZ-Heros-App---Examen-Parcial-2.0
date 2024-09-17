package com.example.herosapp_examenparcial.activities

import PublisherAdapter
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.herosapp_examenparcial.MainActivity
import com.example.herosapp_examenparcial.R
import com.example.herosapp_examenparcial.models.Publisher
import com.bumptech.glide.Glide

class PublisherActivity : AppCompatActivity() {
    lateinit var usernameTV: TextView
    lateinit var logoutBtn: ImageView
    lateinit var publisherRecyclerView: RecyclerView
    lateinit var gif: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        usernameTV = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutBtn)
        gif = findViewById(R.id.gif_bg)
        publisherRecyclerView = findViewById(R.id.publisher_recicleview)
        publisherRecyclerView.adapter = PublisherAdapter(Publisher.categories){ publisher ->
            Log.i("publisher desde home", publisher.name)
            val intent = Intent(this@PublisherActivity, UniverseActivity::class.java)
            intent.putExtra("publisherId", publisher.id)
            startActivity(intent)
        }

        publisherRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
//        val user = User.users[1]
//        usernameTV.text = user.computedName
        Glide.with(this)
            .asGif()
            .load(R.drawable.stannlee)
            .into(gif)

        logoutBtn.setOnClickListener {
            Log.i("LOGOUT", "Cerrando sesion")
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@PublisherActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

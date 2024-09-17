    package com.example.herosapp_examenparcial.activities

    import android.content.Intent
    import android.os.Bundle
    import android.util.Log
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.activity.enableEdgeToEdge
    import androidx.appcompat.app.AppCompatActivity
    import androidx.recyclerview.widget.GridLayoutManager
    import androidx.recyclerview.widget.LinearLayoutManager
    import androidx.recyclerview.widget.RecyclerView
    import com.example.herosapp_examenparcial.R
    import com.example.herosapp_examenparcial.adapters.UniverseAdapter
    import com.example.herosapp_examenparcial.models.Universe
    import com.example.herosapp_examenparcial.models.Publisher
    import com.squareup.picasso.Picasso

    class UniverseActivity : AppCompatActivity() {
        lateinit var universeTitle: TextView
        lateinit var universeRecyclerView: RecyclerView
        lateinit var universeImage: ImageView
        lateinit var universe_background: ImageView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_universe)
            universeTitle = findViewById(R.id.universe_name)
            universeRecyclerView = findViewById(R.id.universe_recicleview)
            universeImage = findViewById(R.id.universe_logo)
            universe_background = findViewById(R.id.universe_background)


            val publisherId = intent.getIntExtra("publisherId",0)

            val publisher = Publisher.categories.firstOrNull{ publisher ->
                publisher.id == publisherId
            }

            universeTitle.text = publisher?.name
            Picasso.get().load(publisher?.image).into(universeImage)
            Picasso.get().load(publisher?.background).into(universe_background)

            universeRecyclerView.layoutManager = LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,false)

            val sups = Universe.sups.filter { sups ->
                sups.universeid == publisherId
            }

//            universeRecyclerView.adapter = UniverseAdapter(sups)
//            universeRecyclerView.layoutManager = GridLayoutManager(this, 2)


        }
    }
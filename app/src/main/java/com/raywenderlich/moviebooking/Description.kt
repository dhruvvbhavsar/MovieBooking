package com.raywenderlich.moviebooking

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raywenderlich.moviebooking.movie_fragments.*


class Description : AppCompatActivity() {
    var interStellarr = Interstellarr()
    var spiderman = Spiderman()
    var nowyouseeme = Nowyouseeme()
    var catchme = catchMe()
    var coco = Coco()
    var Greatest = greatest()
    var tommorow = Tommorow()
    var playerone = Playerone()
    var lucy = Lucy()

    var id: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        id = intent.getIntExtra("movieId", 0)
        setContentView(R.layout.activity_description)
        when (id) {
            1 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, interStellarr)
                commit()
            }

            2 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, spiderman)
                commit()
            }

            3 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, nowyouseeme)
                commit()
            }

            4 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, catchme)
                commit()
            }

            5 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,coco)
                commit()
            }

            6 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,Greatest)
                commit()
            }

            7 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,tommorow)
                commit()
            }

            8 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,playerone)
                commit()
            }

            9 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,lucy)
                commit()
            }

        }
    }
}
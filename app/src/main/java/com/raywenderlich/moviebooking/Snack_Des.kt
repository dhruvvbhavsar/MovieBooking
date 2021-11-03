package com.raywenderlich.moviebooking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raywenderlich.moviebooking.snack_fragments.beverges
import com.raywenderlich.moviebooking.snack_fragments.more_sncaks
import com.raywenderlich.moviebooking.snack_fragments.popcorn

class Snack_Des : AppCompatActivity() {

    var pop = popcorn()
    var cold = beverges()
    var more = more_sncaks()

    var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_des)
        id = intent.getIntExtra("snackId", 0)

        when (id) {
            1 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerVieww, pop)
                commit()
            }

            2 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerVieww, cold)
                commit()
            }

            3 -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerVieww, more)
                commit()
            }
        }
    }
}
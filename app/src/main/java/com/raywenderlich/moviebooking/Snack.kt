package com.raywenderlich.moviebooking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raywenderlich.moviebooking.databinding.ActivitySnackBinding

class Snack : AppCompatActivity() {

    private lateinit var binding: ActivitySnackBinding
    var snackId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySnackBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButton5.setOnClickListener {
            snackId = 1
            Intent(this, Snack_Des::class.java).putExtra("snackId", snackId).also {
                startActivity(it)
            }

        }

        binding.imageButton8.setOnClickListener {
            snackId = 2
            Intent(this, Snack_Des::class.java).putExtra("snackId", snackId).also {
                startActivity(it)
            }

        }

        binding.imageButton13.setOnClickListener {
            snackId = 3
            Intent(this, Snack_Des::class.java).putExtra("snackId", snackId).also {
                startActivity(it)
            }

        }

    }
}
package com.raywenderlich.moviebooking

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raywenderlich.moviebooking.R
import com.raywenderlich.moviebooking.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var movieId: Int = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.imageButton1.setOnClickListener {
            movieId = 1
            Intent(this,Description::class.java).putExtra("movieId",movieId).also {
                startActivity(it)
            }

        }


        binding.imageButton2.setOnClickListener {
            movieId = 2
            Intent(this,Description::class.java).putExtra("movieId",movieId).also {
                startActivity(it)
            }
        }

        binding.imageButton3.setOnClickListener {
            movieId = 3
            Intent(this,Description::class.java).putExtra("movieId",movieId).also {
                startActivity(it)
            }
        }

        binding.imageButton4.setOnClickListener {
            movieId = 4
            Intent(this,Description::class.java).putExtra("movieId",movieId).also {
                startActivity(it)
            }
        }

        binding.imageButton5.setOnClickListener {
            movieId = 5
            Intent(this,Description::class.java).putExtra("movieId",movieId).also {
                startActivity(it)
            }
        }

        binding.imageButton6.setOnClickListener {
            movieId = 6
            Intent(this,Description::class.java).putExtra("movieId",movieId).also {
                startActivity(it)
            }
        }

        binding.imageButton7.setOnClickListener {
            movieId = 7
            Intent(this,Description::class.java).putExtra("movieId",movieId).also {
                startActivity(it)
            }
        }

        binding.imageButton8.setOnClickListener {
            movieId = 8
            Intent(this,Description::class.java).putExtra("movieId",movieId).also {
                startActivity(it)
            }
        }

        binding.imageButton9.setOnClickListener {
            movieId = 9
            Intent(this,Description::class.java).putExtra("movieId",movieId).also {
                startActivity(it)
            }
        }


    }
}
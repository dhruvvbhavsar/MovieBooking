package com.raywenderlich.moviebooking.movie_fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.raywenderlich.moviebooking.Snack
import com.raywenderlich.moviebooking.databinding.FragmentCatchMeBinding


class catchMe : Fragment() {

    private var _binding: FragmentCatchMeBinding? = null

    // with the backing property of the kotlin
    // we extract
    // the non null value of the _binding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCatchMeBinding.inflate(inflater,container,false)
        binding.button4.setOnClickListener {
            Toast.makeText(activity, "Snack Booking", Toast.LENGTH_SHORT).show()

            Intent(activity, Snack::class.java).also {
                startActivity(it)
            }
        }

        binding.button3.setOnClickListener {
            Toast.makeText(activity, "Finish", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }

}
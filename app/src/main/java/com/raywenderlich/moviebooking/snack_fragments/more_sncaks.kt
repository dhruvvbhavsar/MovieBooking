package com.raywenderlich.moviebooking.snack_fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.raywenderlich.moviebooking.R
import com.raywenderlich.moviebooking.Snack
import com.raywenderlich.moviebooking.databinding.FragmentMoreSncaksBinding
import com.raywenderlich.moviebooking.databinding.FragmentPopcornBinding


class more_sncaks : Fragment() {

    private var _binding: FragmentMoreSncaksBinding? = null

    // with the backing property of the kotlin
    // we extract
    // the non null value of the _binding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMoreSncaksBinding.inflate(inflater,container,false)

        binding.button24.setOnClickListener {
            Toast.makeText(activity, "More Snacks", Toast.LENGTH_SHORT).show()

            Intent(activity, Snack::class.java).also {
                startActivity(it)
            }
        }

        return binding.root
    }

}
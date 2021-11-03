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
import com.raywenderlich.moviebooking.databinding.FragmentInterstellarrBinding
import com.raywenderlich.moviebooking.databinding.FragmentPopcornBinding


class popcorn : Fragment() {

    private var _binding: FragmentPopcornBinding? = null

    // with the backing property of the kotlin
    // we extract
    // the non null value of the _binding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPopcornBinding.inflate(inflater,container,false)

        return binding.root
    }

}
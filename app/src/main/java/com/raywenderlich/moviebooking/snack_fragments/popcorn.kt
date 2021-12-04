package com.raywenderlich.moviebooking.snack_fragments

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast
import com.raywenderlich.moviebooking.R
import com.raywenderlich.moviebooking.Snack
import com.raywenderlich.moviebooking.databinding.FragmentInterstellarrBinding
import com.raywenderlich.moviebooking.databinding.FragmentPopcornBinding


class popcorn : Fragment() {

    private var _binding: FragmentPopcornBinding? = null
    lateinit var spinner: Spinner
    var snackkk: String =""

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

        spinner = binding.spinner
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var string1 = parent?.getItemAtPosition(position).toString()
                snackkk = string1
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        var nos = binding.editTextNumber.text

        binding.button2.setOnClickListener {
            Intent(activity, Snack::class.java).also {
                startActivity(it)
            }
        }

        binding.button.setOnClickListener {
            val dilog = AlertDialog.Builder(activity)
                .setTitle("Snack Details")
                .setMessage("$snackkk x$nos Added \nWill be Delivered to your Seat!")
                .setPositiveButton("Thanks") {_,_ ->
                    Toast.makeText(activity, "Happy Eating!" , Toast.LENGTH_SHORT).show()
                }
            dilog.show()
        }

        return binding.root
    }

}
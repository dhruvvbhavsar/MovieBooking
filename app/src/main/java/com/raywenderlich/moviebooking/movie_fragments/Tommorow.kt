package com.raywenderlich.moviebooking.movie_fragments

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
import com.raywenderlich.moviebooking.Snack
import com.raywenderlich.moviebooking.databinding.FragmentTommorowBinding


class Tommorow : Fragment() {

    private var _binding: FragmentTommorowBinding? = null
    lateinit var spinner1: Spinner
    lateinit var spinner2: Spinner
    lateinit var spinner3: Spinner
    var datt: String = ""
    var timee: String = ""
    var seatt: String = ""

    // with the backing property of the kotlin
    // we extract
    // the non null value of the _binding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTommorowBinding.inflate(inflater,container,false)

        spinner1 = binding.spinnerDate9
        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var string1 = parent?.getItemAtPosition(position).toString()
                datt = string1
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        spinner2 = binding.spinnerTime
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var string2 = parent?.getItemAtPosition(position).toString()
                timee = string2
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        spinner3 = binding.spinnerSeat
        spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var string3 = parent?.getItemAtPosition(position).toString()
                seatt = string3
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        binding.button20.setOnClickListener {
            val dilog = AlertDialog.Builder(activity)
                .setTitle("Booking Details")
                .setMessage("Movie Name: Tommorow Land\nDate: $datt\nTime: $timee\nSeat Type: $seatt")
                .setPositiveButton("Cool") {_,_ ->
                    Toast.makeText(activity, "Go have some snacks" , Toast.LENGTH_SHORT).show()
                    Intent(activity, Snack::class.java).also {
                        startActivity(it)
                    }
                }
                .create()
            dilog.show()
        }

        binding.button19.setOnClickListener {
            val dilog = AlertDialog.Builder(activity)
                .setTitle("Booking Details")
                .setMessage("Movie Name: Tommorow Land\nDate: $datt\nTime: $timee\nSeat Type: $seatt")
                .setPositiveButton("Cool") {_,_ ->
                    Toast.makeText(activity, "Enjoy the Movie ;)" , Toast.LENGTH_SHORT).show()
                }
                .create()
            dilog.show()

        }

        return binding.root
    }

}
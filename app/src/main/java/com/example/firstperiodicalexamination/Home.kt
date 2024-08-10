package com.example.firstperiodicalexamination

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.firstperiodicalexamination.databinding.FragmentHomeBinding

class Home : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val schools = listOf("Select a School","School A", "School B", "School C") // Example list of schools

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        val schoolsAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, schools)
        schoolsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerSchool.adapter = schoolsAdapter



        binding.btnSave.setOnClickListener{

            val school = binding.spinnerSchool.selectedItem

            if (school == "Select a School"){
                Toast.makeText(requireContext(), "Select a school", Toast.LENGTH_LONG)
            }
        }





        return binding.root
    }


}

package com.example.firstperiodicalexamination

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.firstperiodicalexamination.databinding.FragmentProfileBinding

class Profile : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    private val schools = listOf("Select a School", "School A", "School B", "School C") // Example list of schools

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)

        val schoolsAdapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item, schools)
        schoolsAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        binding.spinnerSchool.adapter = schoolsAdapter

        binding.btnSave.setOnClickListener {
            val school = binding.spinnerSchool.selectedItem.toString()

            if (school == "Select a School") {
                Toast.makeText(requireContext(), "Please select a school", Toast.LENGTH_LONG).show()
            } else {
                // Handle the save action
                Toast.makeText(requireContext(), "School selected: $school", Toast.LENGTH_LONG).show()
            }
        }

        return binding.root
    }
}

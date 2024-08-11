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

    private val schools = listOf("Select a School", "Urdaneta Campus", "Dagupan Campus")

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

            val name = binding.etName
            val email = binding.etEmail
            val course = binding.etCourse
            val mobile = binding.etMobile
            val address = binding.etAddress
            val agree = binding.termsCheckBox

            if (!agree.isChecked) {
                Toast.makeText(requireContext(), "Please click the checkbox", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (name.text.toString().isEmpty()) {
                name.error = "Name section is Empty"
            } else if (email.text.toString().isEmpty()) {
                email.error = "Email section is Empty"
            } else if (course.text.toString().isEmpty()) {
                course.error = "Course section is Empty"
            } else if (mobile.text.toString().isEmpty()) {
                mobile.error = "Mobile section is Empty"
            } else if (address.text.toString().isEmpty()) {
                address.error = "Address section is Empty"
            } else {
                name.text.clear()
                email.text.clear()
                course.text.clear()
                mobile.text.clear()
                address.text.clear()

                binding.spinnerSchool.setSelection(0)

                agree.isChecked = false

                Toast.makeText(requireContext(), "Your profile was already saved", Toast.LENGTH_LONG).show()
            }
        }

        return binding.root
    }
}

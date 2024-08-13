package com.example.firstperiodicalexamination

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.firstperiodicalexamination.databinding.FragmentProfileBinding

class Profile : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    private val schools = listOf("Select a School", "Urdaneta Campus", "Dagupan Campus")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)

        var isEditing = false
        val schoolsAdapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item, schools)
        val viewModel = ViewModelProvider(requireActivity())[ProfileViewModel::class.java]
        schoolsAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        binding.spinnerSchool.adapter = schoolsAdapter

        binding.twName.text = "Name: ${viewModel.name}"
        binding.twEmail.text = "Email: ${viewModel.email}"
        binding.twCourse.text = "Course: ${viewModel.course}"
        binding.twMobile.text = "Mobile: ${viewModel.mobile}"
        binding.twAddress.text = "Address: ${viewModel.address}"
        binding.spinnerSchooltw.text = "School: ${viewModel.school}"

        binding.btnSave.setOnClickListener {

            if (isEditing){

                val school = binding.spinnerSchool.selectedItem.toString()


                val name = binding.etName
                val email = binding.etEmail
                val course = binding.etCourse
                val mobile = binding.etMobile
                val address = binding.etAddress

                val agree = binding.termsCheckBox



                if (name.text.toString().isEmpty()) {
                    name.error = "Name section is Empty"
                    return@setOnClickListener
                } else if (email.text.toString().isEmpty()) {
                    email.error = "Email section is Empty"
                    return@setOnClickListener
                } else if (course.text.toString().isEmpty()) {
                    course.error = "Course section is Empty"
                    return@setOnClickListener
                } else if (mobile.text.toString().isEmpty()) {
                    mobile.error = "Mobile section is Empty"
                    return@setOnClickListener
                } else if (address.text.toString().isEmpty()) {
                    address.error = "Address section is Empty"
                    return@setOnClickListener
                } else if (school== "Select a School") {
                    Toast.makeText(requireContext(), "Please select a School", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }else if (!agree.isChecked) {
                    Toast.makeText(requireContext(), "Please click the checkbox", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }
                else {

                    viewModel.name = name.text.toString()
                    viewModel.email = email.text.toString()
                    viewModel.course = course.text.toString()
                    viewModel.mobile = mobile.text.toString()
                    viewModel.address = address.text.toString()
                    viewModel.school = school

                    agree.isChecked = false

                    Toast.makeText(requireContext(), "Your profile was already saved", Toast.LENGTH_LONG).show()
                    binding.twName.text = "Name: ${viewModel.name}"
                    binding.twEmail.text = "Email: ${viewModel.email}"
                    binding.twCourse.text = "Course: ${viewModel.course}"
                    binding.twMobile.text = "Mobile: ${viewModel.mobile}"
                    binding.twAddress.text = "Address: ${viewModel.address}"
                    binding.spinnerSchooltw.text = "School: ${viewModel.school}"

                    binding.btnSave.setText("Edit Profile")
                    binding.textview.visibility = View.VISIBLE
                    binding.edittext.visibility = View.GONE
                isEditing = false
                }


            }else{
                binding.btnSave.setText("Save")
                binding.edittext.visibility = View.VISIBLE
                binding.textview.visibility = View.GONE
                isEditing = true

            }


        }

        return binding.root
    }

}

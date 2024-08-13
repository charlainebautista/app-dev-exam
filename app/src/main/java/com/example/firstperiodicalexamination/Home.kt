package com.example.firstperiodicalexamination

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.firstperiodicalexamination.databinding.FragmentHomeBinding

class Home : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.edituserButton.setOnClickListener { findNavController().navigate(R.id.profile) }
        binding.seeMapsButton.setOnClickListener { findNavController().navigate(R.id.map) }
        binding.helpButton.setOnClickListener{findNavController().navigate(R.id.modalityHelp)}
        binding.scholarButton.setOnClickListener{findNavController().navigate(R.id.action_home2_to_scholarship2)}


        return binding.root
    }


}

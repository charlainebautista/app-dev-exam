package com.example.firstperiodicalexamination

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.firstperiodicalexamination.databinding.FragmentMapBinding


class Map : Fragment() {

    private lateinit var binding: FragmentMapBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMapBinding.inflate(inflater, container, false)
        binding.urdamapButton.setOnClickListener { findNavController().navigate(R.id.urdanetaMap) }
        binding.dagupanmapButton.setOnClickListener { findNavController().navigate(R.id.dagupanMap) }


        return binding.root

    }


}
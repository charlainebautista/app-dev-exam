package com.example.firstperiodicalexamination

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firstperiodicalexamination.databinding.FragmentArchitectureBinding

class Architecture : Fragment() {

    private lateinit var binding: FragmentArchitectureBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentArchitectureBinding.inflate(inflater, container, false)



        return binding.root
    }


}
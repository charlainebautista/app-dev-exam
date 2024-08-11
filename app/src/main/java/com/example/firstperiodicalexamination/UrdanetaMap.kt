package com.example.firstperiodicalexamination

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firstperiodicalexamination.databinding.FragmentUrdanetaMapBinding

class UrdanetaMap : Fragment() {

    private lateinit var binding: FragmentUrdanetaMapBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUrdanetaMapBinding.inflate(inflater, container, false)



        return binding.root
    }

}
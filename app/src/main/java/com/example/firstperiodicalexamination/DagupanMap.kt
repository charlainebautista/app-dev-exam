package com.example.firstperiodicalexamination

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firstperiodicalexamination.databinding.FragmentDagupanMapBinding

class DagupanMap : Fragment() {

    private lateinit var binding: FragmentDagupanMapBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDagupanMapBinding.inflate(inflater, container, false)




        return binding.root
    }


}
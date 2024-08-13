package com.example.firstperiodicalexamination

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firstperiodicalexamination.databinding.FragmentRadBinding


class Rad : Fragment() {

    private lateinit var binding: FragmentRadBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRadBinding.inflate(inflater, container, false)



        return binding.root
    }


}
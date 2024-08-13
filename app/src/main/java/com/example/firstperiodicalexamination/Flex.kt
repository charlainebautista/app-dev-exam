package com.example.firstperiodicalexamination

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firstperiodicalexamination.databinding.FragmentFlexBinding

class Flex : Fragment() {

    private lateinit var binding: FragmentFlexBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFlexBinding.inflate(inflater, container, false)




        return binding.root
    }


}
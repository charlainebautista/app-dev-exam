package com.example.firstperiodicalexamination

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.firstperiodicalexamination.databinding.FragmentModalityHelpBinding

class ModalityHelp : Fragment() {

    private lateinit var binding: FragmentModalityHelpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentModalityHelpBinding.inflate(inflater, container, false)




        return binding.root
    }


}
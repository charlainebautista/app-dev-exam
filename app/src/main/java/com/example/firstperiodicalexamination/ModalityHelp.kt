package com.example.firstperiodicalexamination

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.firstperiodicalexamination.databinding.FragmentModalityHelpBinding

class ModalityHelp : Fragment() {

    private lateinit var binding: FragmentModalityHelpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentModalityHelpBinding.inflate(inflater, container, false)

        binding.btnCMA.setOnClickListener { findNavController().navigate(R.id.accountancy) }
        binding.btnCELA.setOnClickListener { findNavController().navigate(R.id.education2) }
        binding.btnCAHS.setOnClickListener { findNavController().navigate(R.id.medical) }
        binding.btnCITE.setOnClickListener { findNavController().navigate(R.id.computer) }
        binding.btnCCJE.setOnClickListener { findNavController().navigate(R.id.computer) }
        binding.btnCEA.setOnClickListener { findNavController().navigate(R.id.architecture) }
        binding.btnFLEXProgram.setOnClickListener{findNavController().navigate(R.id.flex)}
        binding.btnRADProgram.setOnClickListener{findNavController().navigate(R.id.rad)}


        return binding.root
    }


}
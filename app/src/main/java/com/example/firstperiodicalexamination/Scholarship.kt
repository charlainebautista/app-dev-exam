package com.example.firstperiodicalexamination

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.firstperiodicalexamination.databinding.FragmentScholarshipBinding

class Scholarship : Fragment() {

    private lateinit var binding: FragmentScholarshipBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScholarshipBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up click listeners for each header
        setupAccordion(binding.hkAHeader, binding.hkAContent)
        setupAccordion(binding.hkBHeader, binding.hkBContent)
        setupAccordion(binding.hkCHeader, binding.hkCContent)
        setupAccordion(binding.hkDHeader, binding.hkDContent)
        setupAccordion(binding.hkEHeader, binding.hkEContent)
    }

    private fun setupAccordion(header: View, content: View) {
        header.setOnClickListener {
            if (content.visibility == View.GONE) {
                // Collapse all sections
                collapseAllSections()
                // Expand the clicked section
                content.visibility = View.VISIBLE
            } else {
                // Collapse the clicked section
                content.visibility = View.GONE
            }
        }
    }

    private fun collapseAllSections() {
        binding.hkAContent.visibility = View.GONE
        binding.hkBContent.visibility = View.GONE
        binding.hkCContent.visibility = View.GONE
        binding.hkDContent.visibility = View.GONE
        binding.hkEContent.visibility = View.GONE
    }
}

package com.example.android.ui_training

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.ui_training.databinding.SecondCardBinding

class SecondCard : Fragment() {
    private lateinit var binding: SecondCardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SecondCardBinding.inflate(layoutInflater)

        return binding.root
    }
}
package com.example.android.ui_training

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.ui_training.databinding.ThirdCardBinding

class ThirdCard : Fragment() {
    private lateinit var binding: ThirdCardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ThirdCardBinding.inflate(layoutInflater)

        return binding.root
    }
}
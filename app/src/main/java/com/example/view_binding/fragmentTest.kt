package com.example.view_binding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.view_binding.databinding.ActivityMainBinding
import com.example.view_binding.databinding.FragmentTestBinding

class fragmentTest : Fragment(R.layout.fragment_test) {

    private lateinit var binding:FragmentTestBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTestBinding.bind(view)
    }

}
package com.example.androidimpltemplate.ui

import com.example.androidimpltemplate.base.BaseFragment
import com.example.androidimpltemplate.databinding.FragmentExampleBinding
import com.example.androidimpltemplate.manager.sharedprefs.DefaultSharedPrefs
import com.example.androidimpltemplate.manager.sharedprefs.clickCount

class ExampleFragment : BaseFragment<FragmentExampleBinding>(FragmentExampleBinding::inflate) {

    override fun setup() {
        binding.tvCount.text = "Click Count: ${DefaultSharedPrefs.clickCount}"
        binding.btnPlus.setOnClickListener {
            handleButtonClick()
        }

    }

    private fun handleButtonClick() {
        binding.tvCount.text = "Click Count: ${++DefaultSharedPrefs.clickCount}"
    }

    companion object {
        @JvmStatic
        fun newInstance() = ExampleFragment()
    }
}
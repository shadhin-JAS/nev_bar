package com.cscomer.fragment_use

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.convertTo
import androidx.navigation.fragment.findNavController
import com.cscomer.fragment_use.databinding.FragmentProfileBinding


class profileFragment : Fragment() {

    lateinit var binding:FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      binding= FragmentProfileBinding.inflate(layoutInflater,container,false)


        binding.logBtn.setOnClickListener(){

            findNavController().navigate(R.id.action_profileFragment_to_loginFragment)

        }
        return binding.root
    }

}
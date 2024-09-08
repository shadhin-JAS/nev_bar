package com.cscomer.fragment_use

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.cscomer.fragment_use.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomeBinding.inflate(layoutInflater,container,false)


        binding.loginBtn.setOnClickListener(){
            findNavController().navigate(R.id.action_homeFragment_to_loginFragment)



        }



        binding.profileBtn.setOnClickListener(){

            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)




        }


        return binding.root
    }


}
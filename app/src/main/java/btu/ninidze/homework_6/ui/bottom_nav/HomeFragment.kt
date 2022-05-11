package btu.ninidze.homework_6.ui.bottom_nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import btu.ninidze.homework_6.BaseFragment
import btu.ninidze.homework_6.R
import btu.ninidze.homework_6.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val inflate: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

    override fun init(savedInstanceState: Bundle?) = with(binding) {

        btnSend.setOnClickListener {
            if (editTextNumber.text.isNotEmpty()) {
                findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToNotificationFragment(editTextNumber.text.toString().toInt())
                )
            }
        }

        btnAuth.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_auth_navigation)
        }
    }
}
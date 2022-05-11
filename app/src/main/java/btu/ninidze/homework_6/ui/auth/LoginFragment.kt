package btu.ninidze.homework_6.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import btu.ninidze.homework_6.BaseFragment
import btu.ninidze.homework_6.R
import btu.ninidze.homework_6.databinding.LoginFragmentBinding

class LoginFragment : BaseFragment<LoginFragmentBinding>() {

    override val inflate: (LayoutInflater, ViewGroup?, Boolean) -> LoginFragmentBinding
        get() = LoginFragmentBinding::inflate

    override fun init(savedInstanceState: Bundle?) = with(binding) {
        registerBtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        resetBtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_resetFragment)
        }
    }

}
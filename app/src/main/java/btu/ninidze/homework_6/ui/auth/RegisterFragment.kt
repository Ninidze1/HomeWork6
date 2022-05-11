package btu.ninidze.homework_6.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import btu.ninidze.homework_6.BaseFragment
import btu.ninidze.homework_6.R
import btu.ninidze.homework_6.databinding.RegisterFragmentBinding

class RegisterFragment : BaseFragment<RegisterFragmentBinding>() {

    override val inflate: (LayoutInflater, ViewGroup?, Boolean) -> RegisterFragmentBinding
        get() = RegisterFragmentBinding::inflate

    override fun init(savedInstanceState: Bundle?) = with(binding) {
        backToLoginBtn.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}
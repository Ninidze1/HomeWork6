package btu.ninidze.homework_6.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import btu.ninidze.homework_6.BaseFragment
import btu.ninidze.homework_6.R
import btu.ninidze.homework_6.databinding.ResetFragmentBinding

class ResetFragment : BaseFragment<ResetFragmentBinding>() {

    override val inflate: (LayoutInflater, ViewGroup?, Boolean) -> ResetFragmentBinding
        get() = ResetFragmentBinding::inflate

    override fun init(savedInstanceState: Bundle?) = with(binding) {
        resetBtn.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}
package btu.ninidze.homework_6.ui.bottom_nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import btu.ninidze.homework_6.BaseFragment
import btu.ninidze.homework_6.databinding.FragmentSettingsBinding

class SettingsFragment: BaseFragment<FragmentSettingsBinding>() {
    override val inflate: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSettingsBinding
        get() = FragmentSettingsBinding::inflate

    override fun init(savedInstanceState: Bundle?) {

    }
}
package btu.ninidze.homework_6.ui.bottom_nav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import btu.ninidze.homework_6.BaseFragment
import btu.ninidze.homework_6.databinding.FragmentNotificationBinding

class NotificationFragment: BaseFragment<FragmentNotificationBinding>() {

    override val inflate: (LayoutInflater, ViewGroup?, Boolean) -> FragmentNotificationBinding
        get() = FragmentNotificationBinding::inflate

    override fun init(savedInstanceState: Bundle?) = with(binding) {

        val age = NotificationFragmentArgs.fromBundle(requireArguments()).age
        textView.text = age.toString()
    }
}
package com.example.android_6.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android_6.R

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {
    private lateinit var textView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView)

        val amount = DashboardFragmentArgs.fromBundle(requireArguments()).amount

        textView.text = amount.toString()
    }
}
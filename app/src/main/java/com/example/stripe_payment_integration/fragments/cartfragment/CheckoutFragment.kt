package com.example.stripe_payment_integration.fragments.cartfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stripe_payment_integration.R
import com.example.stripe_payment_integration.databinding.FragmentCheckoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class CheckoutFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentCheckoutBinding ?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCheckoutBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}
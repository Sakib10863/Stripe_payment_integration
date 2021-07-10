package com.example.stripe_payment_integration.fragments.cartfragment

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stripe_payment_integration.R
import com.example.stripe_payment_integration.databinding.FragmentCartBinding
import com.example.stripe_payment_integration.model.CartItem


class CartFragment : Fragment() {

    private var _binding: FragmentCartBinding ? = null
    private val binding get() = _binding!!

    private val adapter: CartItemAdapter by lazy {
        CartItemAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCartBinding.inflate(inflater, container, false)

        setupRecyclerView()
        setAdapterData()

        binding.checkoutButton.setOnClickListener {
            findNavController().navigate(R.id.action_cartFragment_to_checkoutFragment)
        }

        return binding.root
    }

    private fun setAdapterData() {
        val image1 = BitmapFactory.decodeResource(resources, R.drawable.dummy_image_1)
        val image2 = BitmapFactory.decodeResource(resources, R.drawable.dummy_image_2)

        val item1 = CartItem("Nicon Shoes", 1, 120.0, image1)
        val item2 = CartItem("Apex Premium", 2, 90.0, image2)

        val allItems = listOf(item1, item2)

        adapter.setData(allItems)

    }

    private fun setupRecyclerView() {
        val recyclerView = binding.itemRecycler
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        //Just for a show
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}
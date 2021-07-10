package com.example.stripe_payment_integration.model

import android.graphics.Bitmap

data class CartItem(
    val productName: String,
    val productCount: Int,
    val productBasePrice: Double,
    val productCover: Bitmap
)

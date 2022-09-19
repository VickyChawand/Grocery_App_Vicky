package com.vicky.grocery_app_vicky.dataclasses

data class Item(val name: String?, val price: Float, val image: String?,var quantity: Int=1, var totalPrice:Float=quantity*price)

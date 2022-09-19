package com.vicky.grocery_app_vicky.dataclasses.products

data class Grocery(
    override var name: String,
    override var description: String,
    override var sku: String,
    override var price: Float,
    override var image: String
): Product()

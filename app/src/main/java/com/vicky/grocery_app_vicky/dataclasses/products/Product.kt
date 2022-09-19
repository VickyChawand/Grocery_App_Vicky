package com.vicky.grocery_app_vicky.dataclasses.products

abstract class Product {
    abstract var name: String
    abstract var description: String
    abstract var sku: String
    abstract var price: Float
    abstract var image: String
}
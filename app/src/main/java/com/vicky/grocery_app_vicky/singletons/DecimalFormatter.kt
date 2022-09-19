package com.vicky.grocery_app_vicky.singletons

object DecimalFormatter {
    fun format(num :Float?): String{
        return String.format("%.2f", num)
    }
}
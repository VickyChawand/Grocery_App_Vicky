package com.vicky.grocery_app_vicky.singletons

import java.util.*

object Capitalizer {
    fun capitalized(str:String): String {
        return str.replaceFirstChar {
            if (it.isLowerCase())
                it.titlecase(Locale.getDefault())
            else it.toString()
        }
    }
}
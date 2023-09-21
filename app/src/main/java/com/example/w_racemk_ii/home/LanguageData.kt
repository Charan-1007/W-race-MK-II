package com.example.w_racemk_ii.home

data class LanguageData(
    val title: String,
    val logo: Int,
    val desc: String,
    var isExpandable: Boolean = false
)
package com.example.heroes1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


// add @Parcelize above your data class declaration
// make your data class implement
@Parcelize
data class Hero (
    val name: String,
    val description: String,
    val superpower: String,
    val ranking: Int,
    val image: String
) : Parcelable
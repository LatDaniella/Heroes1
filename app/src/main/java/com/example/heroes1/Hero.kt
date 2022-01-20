package com.example.heroes1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


// add @Parcelize above your data class declaration
// make your data class implement

// "s".compareTo("t") - returns a negative number
// "s" < "t"

// to access compareTo, we need an interface Comparable

@Parcelize
data class Hero (
    val name: String,
    val description: String,
    val superpower: String,
    val ranking: Int,
    val image: String
) : Parcelable, Comparable<Hero> {
    override fun compareTo(other: Hero): Int {
        // we decide the sorting order of our object
        // make it the ranking
        // this (current object), other (one we compare to)
        // negative if this comes before other
        // positive if this comes after other
        // zero if this and other are the same
        // .sorted for ascending
        // .sortedDescending
        // https://kotlinlang.org/docs/collection-ordering.html#custom-orders
        return this.ranking //|| other.ranking
    }
}
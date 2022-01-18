package com.example.heroes1

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.heroes1.databinding.ActivityHeroesDetailBinding
import com.example.heroes1.databinding.ActivityHeroesListBinding

class HeroesDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHeroesDetailBinding

    companion object{
        val EXTRA_HERO = "The hero"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeroesDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // extract our Hero object from the intent
        val hero = intent.getParcelableExtra<Hero>(EXTRA_HERO)
        // put each field of the Hero object into the respective widgets
        binding.textViewDetailSuperheroName.text = hero?.name ?: "Generic Hero"
        binding.imageViewDetailSuperheroImage.setImageDrawable(
            getDrawable(resources.getIdentifier(hero?.image, "drawable", packageName))
        )
        // package name is short for the name of the package : "package com.example.heroes1" at the top
        binding.textViewDetailSuperheroDescription.text = hero?.description ?: "Generic Description"
        binding.textViewDetailSuperpowerDescription.text = hero?.name ?: "Generic Superpower"
        binding.textViewDetailSuperheroRankingNumber.text = (hero?.ranking ?: 100).toString()


    }
}
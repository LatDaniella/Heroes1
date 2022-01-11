package com.example.heroes1

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.heroes1.databinding.ActivityHeroesDetailBinding
import com.example.heroes1.databinding.ActivityHeroesListBinding


class HeroesListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHeroesListBinding

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeroesListBinding.inflate(layoutInflater)
        setContentView(binding.root)

         val inputStream = resources.openRawResource(R.raw.heroes)
         val jsonText = inputStream.bufferedReader().use{
             it.readText()
         }
         Log.d(TAG, "onCreate: $jsonText")

         // TODO: Make a Hero.kt model class
         // TODO: Load heroes.json into a List<Hero> using Gson
         // TODO: Make a item_hero.xml layout file in the layout folder
         //     this is the template for what eac item in the list will
         //     look like
         //     make the root element a constraint layout
         //     make some textViews for the ranking, name, and desc
         // TODO: Make a HeroAdapter.kt class modeled after the CustomAdapter from documentation


    }
}
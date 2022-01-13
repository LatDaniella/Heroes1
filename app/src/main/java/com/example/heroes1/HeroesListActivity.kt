package com.example.heroes1

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.heroes1.databinding.ActivityHeroesDetailBinding
import com.example.heroes1.databinding.ActivityHeroesListBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class HeroesListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHeroesListBinding
    lateinit var adapter: HeroAdapter

    companion object {
        val TAG = "HeroesListActivity"
    }


     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeroesListBinding.inflate(layoutInflater)
        setContentView(binding.root)

         // TODO: Load heroes.json into a List<Hero> using Gson
         val inputStream = resources.openRawResource(R.raw.heroes)
         val jsonString = inputStream.bufferedReader().use{
             it.readText()
         }
         val gson = Gson()
         val type = object : TypeToken<List<Hero>>(){ }.type
         val heroesList = gson.fromJson<List<Hero>>(jsonString, type)
         Log.d(TAG, "onCreate: \$heroesList")

         //Create our adapter and fill the recycler view
         adapter = HeroAdapter(heroesList)
         binding.recyclerViewHerosList.adapter = adapter
         binding.recyclerViewHerosList.layoutManager = LinearLayoutManager(this)





         // TODO: Make a Hero.kt model class
         // TODO: Load heroes.json into a List<Hero> using Gson
         // TODO: Make a item_hero.xml layout file in the layout folder
         //     this is the template for what each item in the list will
         //     look like
         //     make the root element a constraint layout
         //     make some textViews for the ranking, name, and desc
         // TODO: Make a HeroAdapter.kt class modeled after the CustomAdapter from documentation


    }
}
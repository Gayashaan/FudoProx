package com.example.fudoprox

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fudoprox.adapters.PropertyAdapter
import com.example.fudoprox.model.Property
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : BaseActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var propertyList: ArrayList<Property>
    private lateinit var propertyAdapter: PropertyAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        propertyList = ArrayList()
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)


        propertyList.add(Property(R.drawable.image2, "5 BedRooms, 4 Bathrooms", "Rs.11 million", "12000 sqF", "Colombo"))
        propertyList.add(Property(R.drawable.image1, "2 BedRooms, 2 Bathrooms", "Rs.5.5 million", "12000 sqF", "Kadana"))
        propertyList.add(Property(R.drawable.image3, "3 BedRooms, 4 Bathrooms", "Rs.6.3 million", "12000 sqF", "Colombo"))
        propertyList.add(Property(R.drawable.image4, "6 BedRooms, 8 Bathrooms", "Rs.21 million", "15000 sqF", "Negombo"))
        propertyList.add(Property(R.drawable.image5, "2 BedRooms, 3 Bathrooms", "Rs.4.1 million", "12000 sqF", "Ragama"))
        propertyList.add(Property(R.drawable.image6, "3 BedRooms, 3 Bathrooms", "Rs.3.1 million", "12000 sqF", "Panadura"))
        propertyList.add(Property(R.drawable.image2, "2 BedRooms, 3 Bathrooms", "Rs.9.1 million", "12000 sqF", "Colombo"))



        propertyAdapter = PropertyAdapter(propertyList)
        recyclerView.adapter = propertyAdapter



        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.bottom_home

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> true
                R.id.bottom_search -> {
                    startActivity(Intent(applicationContext, SearchActivity::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                R.id.bottom_add -> {
                    startActivity(Intent(applicationContext, PropertyAddActivity::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                R.id.bottom_list -> {
                    startActivity(Intent(applicationContext, AgentListActivity::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }

                R.id.bottom_profile -> {
                    startActivity(Intent(applicationContext, ProfileActivity::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }
                else -> false
            }
        }

    }


}
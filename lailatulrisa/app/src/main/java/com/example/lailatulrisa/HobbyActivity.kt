package com.example.lailatulrisa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HobbyActivity : AppCompatActivity() {

    lateinit var HobbyView: RecyclerView
    lateinit var HobbyAdapter: HobbyAdapter
    val list = ArrayList<HobbyData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        HobbyView = findViewById(R.id.rvHobby)
        HobbyView.layoutManager = LinearLayoutManager(this)

        list.add(HobbyData("Game", "Bermain Game"))
        list.add(HobbyData("__", "___"))

        HobbyAdapter = HobbyAdapter(list)
        HobbyView.adapter = HobbyAdapter
    }
}
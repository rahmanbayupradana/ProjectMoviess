package com.bayupradana.projectmovies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bayupradana.projectmovies.adapter.MoviesAdapterHorizontal
import com.bayupradana.projectmovies.data.MoviesData
import com.bayupradana.projectmovies.model.MoviesModel

class HomeActivity : AppCompatActivity() {

    lateinit var rvMovies: RecyclerView
    lateinit var tvViewAll: TextView
    private var listMovies: ArrayList<MoviesModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvMovies = findViewById(R.id.recyclerView)
        tvViewAll = findViewById(R.id.tv_viewAll)
        tvViewAll.setOnClickListener {
            val gotoall = Intent(this, ViewAllActivity::class.java)
            startActivity(gotoall)
        }

        rvMovies.setHasFixedSize(true)
        listMovies.addAll(MoviesData.listMovies)
        setMovies()

    }

    private fun setMovies() {
        rvMovies.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val adapter = MoviesAdapterHorizontal(listMovies)
        rvMovies.adapter = adapter

    }
}

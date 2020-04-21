package com.bayupradana.projectmovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bayupradana.projectmovies.adapter.MoviesAllAdapter
import com.bayupradana.projectmovies.data.MoviesData
import com.bayupradana.projectmovies.model.MoviesModel

class ViewAllActivity : AppCompatActivity() {

    private lateinit var rvAll: RecyclerView
    private var moviesAll: ArrayList<MoviesModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all)

        rvAll = findViewById(R.id.rv_viewAll)
        rvAll.setHasFixedSize(true)
        moviesAll.addAll(MoviesData.listMovies)

        rvAll.layoutManager = LinearLayoutManager(this)
        val adapter = MoviesAllAdapter(moviesAll)
        rvAll.adapter = adapter

    }
}

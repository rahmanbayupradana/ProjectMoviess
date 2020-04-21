package com.bayupradana.projectmovies.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bayupradana.projectmovies.DetailActivity
import com.bayupradana.projectmovies.R
import com.bayupradana.projectmovies.model.MoviesModel
import com.bumptech.glide.Glide

class MoviesAdapterHorizontal(private val listMovies: ArrayList<MoviesModel>) :
    RecyclerView.Adapter<MoviesAdapterHorizontal.MoviesViewHolder>() {

    inner class MoviesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var title: TextView = itemView.findViewById(R.id.tv_title)
        private var image: ImageView = itemView.findViewById(R.id.img_movies)


        fun bind(movies: MoviesModel) {
            Glide.with(itemView.context)
                .load(movies.posterMovies)
                .into(image)
            title.text = movies.titleMovies

            itemView.setOnClickListener {
                val movie = MoviesModel(
                    movies.titleMovies,
                    movies.releasedMovies,
                    movies.ratingMovies,
                    movies.timeMovies,
                    movies.genresMovies,
                    movies.overviewMovies,
                    movies.posterMovies
                )

                val goToDetail = Intent(itemView.context, DetailActivity::class.java)
                goToDetail.putExtra(DetailActivity.EXTRA_MOVIES, movie)
                itemView.context.startActivity(goToDetail)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movies_horizontal, parent, false)
        return MoviesViewHolder(view)
    }

    override fun getItemCount(): Int = listMovies.size


    // menggabungkan class holder dengan adapter
    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind(listMovies[position])

    }
}
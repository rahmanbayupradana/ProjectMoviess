package com.bayupradana.projectmovies.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bayupradana.projectmovies.R
import com.bayupradana.projectmovies.model.MoviesModel
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class MoviesAllAdapter(private val viewMovies: ArrayList<MoviesModel>) :
    RecyclerView.Adapter<MoviesAllAdapter.allViewHolder>() {

    inner class allViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var tvTitle: TextView = itemView.findViewById(R.id.tv_titleMoviesAll)
        private var tvReleased: TextView = itemView.findViewById(R.id.tv_releasedMoviesAll)
        private var imgMovies: ImageView = itemView.findViewById(R.id.img_moviesAll)
        private var tvTime: TextView = itemView.findViewById(R.id.tv_timeMoviesAll)
        private var ratingMov: RatingBar = itemView.findViewById(R.id.rb_ratingMoviesAll)

        fun bind(movies: MoviesModel) {
            Glide.with(itemView.context)
                .load(movies.posterMovies)
                .into(imgMovies)

            tvTitle.text = movies.titleMovies
            tvReleased.text = movies.releasedMovies
            tvTime.text = movies.timeMovies
            ratingMov.rating = movies.ratingMovies
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): allViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_movies_all, parent, false)
        return allViewHolder(view)
    }

    override fun getItemCount(): Int {
        return viewMovies.size
    }

    override fun onBindViewHolder(holder: allViewHolder, position: Int) {
        holder.bind(viewMovies[position])
    }

}
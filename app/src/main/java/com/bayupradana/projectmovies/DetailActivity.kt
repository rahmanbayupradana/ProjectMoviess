package com.bayupradana.projectmovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.bayupradana.projectmovies.model.MoviesModel
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    // sebuah fungsi atau member variabel di suatu kelas agar bisa dipanggil tanpa melalui sebuah objek
    companion object {
        const val EXTRA_MOVIES = "extra_movies"
    }

    private lateinit var imgMovies: ImageView
    private lateinit var tvTitleMovies: TextView
    private lateinit var tvReleasedMovies: TextView
    private lateinit var tvTimeMovies: TextView
    private lateinit var rbRating: RatingBar
    private lateinit var tvGenresMovies: TextView
    private lateinit var tvOverviewMovies: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        imgMovies = findViewById(R.id.img_movies)
        tvTitleMovies = findViewById(R.id.tv_titleMovies)
        tvReleasedMovies = findViewById(R.id.tv_releasedMovies)
        tvTimeMovies = findViewById(R.id.tv_timeMovies)
        rbRating = findViewById(R.id.rb_ratingMovies)
        tvGenresMovies = findViewById(R.id.tv_genresMovies)
        tvOverviewMovies = findViewById(R.id.tv_overviewMovies)


        val movies = intent.getParcelableExtra<MoviesModel>(EXTRA_MOVIES)

        Glide.with(this)
            .load(movies.posterMovies)
            .into(imgMovies)

        tvTitleMovies.text = movies.titleMovies
        tvReleasedMovies.text = movies.releasedMovies
        tvTimeMovies.text = movies.timeMovies
        rbRating.rating = movies.ratingMovies
        tvGenresMovies.text = movies.genresMovies
        tvOverviewMovies.text = movies.overviewMovies

    }
}

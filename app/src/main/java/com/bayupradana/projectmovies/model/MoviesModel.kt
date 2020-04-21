package com.bayupradana.projectmovies.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MoviesModel(
    var titleMovies: String = "",
    var releasedMovies: String = "",
    var ratingMovies: Float = 0.0F,
    var timeMovies: String = "",
    var genresMovies: String = "",
    var overviewMovies: String = "",
    var posterMovies: Int = 0
) : Parcelable

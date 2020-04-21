package com.bayupradana.projectmovies.data

import com.bayupradana.projectmovies.R
import com.bayupradana.projectmovies.model.MoviesModel

object MoviesData {
    private val titleMovies = arrayOf(
        "Joker",
        "Aladdin",
        "Ant-man and the Wasp",
        "Captain Marvel",
        "Midway"
    )

    private val releasedMovies = arrayOf(
        "Released",
        "Released",
        "Released",
        "Released",
        "Released"
    )

    private val ratingMovies = floatArrayOf(
        4.5F,
        3.5F,
        3.5F,
        5.0F,
        2.5F
    )


    private val timeMovies = arrayOf(
        "2h 2m",
        "2h 8m",
        "1h 59m",
        "2h 4m",
        "2h 18m"
    )

    private val genresMovies = arrayOf(
        "Crime, Thriller, Drama",
        "Adventure, Fantasy, Romance, Comedy, Family",
        "Action, Adventure, Science Fiction, Comedy",
        "Action, Adventure, Science Fiction",
        "War, History, Action, Drama"
    )

    private val overviewMovies = arrayOf(
        "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
        "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp that has the power to make their deepest wishes come true.",
        "Just when his time under house arrest is about to end, Scott Lang once again puts his freedom at risk to help Hope van Dyne and Dr. Hank Pym dive into the quantum realm and try to accomplish, against time and any chance of success, a very dangerous rescue mission.",
        "The story follows Carol Danvers as she becomes one of the universe’s most powerful heroes when Earth is caught in the middle of a galactic war between two alien races. Set in the 1990s, Captain Marvel is an all-new adventure from a previously unseen period in the history of the Marvel Cinematic Universe.",
        "The story of the Battle of Midway, and the leaders and soldiers who used their instincts, fortitude and bravery to overcome massive odds."
    )

    private val posterMovies = intArrayOf(
        R.drawable.img_joker,
        R.drawable.img_aladdin,
        R.drawable.img_ant,
        R.drawable.img_captain,
        R.drawable.img_midway
    )

    val listMovies: ArrayList<MoviesModel>
        get() {
            val list = arrayListOf<MoviesModel>()
            for (position in titleMovies.indices) {
                val movie = MoviesModel()
                movie.titleMovies = titleMovies[position]
                movie.releasedMovies = releasedMovies[position]
                movie.ratingMovies = ratingMovies[position]
                movie.timeMovies = timeMovies[position]
                movie.genresMovies = genresMovies[position]
                movie.overviewMovies = overviewMovies[position]
                movie.posterMovies = posterMovies[position]
                list.add(movie)
            }
            return list
        }
}
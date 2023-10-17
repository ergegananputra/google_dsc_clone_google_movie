package com.latihanbyrg.googlemoviewclone

class MovieModelSeeder(private val movieViewModel: MovieModel) {

    fun seed(){

        movieViewModel.insertMovie(
            Movie(
                title = "The Tomorrow War",
                description = "In The Tomorrow War, the world is stunned when a group of time travelers arrive from the year 2051 to deliver an urgent message: Thirty years in the future mankind is losing a global war against a deadly alien species. The only hope for survival is for soldiers and civilians from the present to be transported to the future and join the fight. Among those recruited is high school teacher and family man Dan Forester (Chris Pratt). Determined to save the world for his young daughter, Dan teams up with a brilliant scientist (Yvonne Strahovski) and his estranged father (J.K. Simmons) in a desperate quest to rewrite the fate of the planet.",
                starring = "Chris Pratt, Yvonne Strahovski, J.K. Simmons",
                director = "Chris McKay",
                price = "IDR 100.000",
                imageURL = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/34nDCQZwaEvsy4CFO5hkGRFDCVU.jpg",
                yearOfRelease = "2021",
                rating = "52%",
                false
            )
        )

    }

}
package com.latihanbyrg.googlemoviewclone

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.latihanbyrg.googlemoviewclone.databinding.FragmentHomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment(private val movieViewModel: MovieModel) : Fragment(), MovieCardClickListener {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setAllRecyclerView()
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    private fun setAllRecyclerView() {
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        // Top Picks
        movieViewModel.movieLists.observe(viewLifecycleOwner) {
            binding.topPicksRecyclerView.apply {
                this.layoutManager = layoutManager
                adapter = MovieCardAdapter(it, this@HomeFragment)
                Log.d("Card", "setAllRecyclerView: $it")
            }
        }

//        // Popular Movies
//        movieViewModel.popularMovies.observe(viewLifecycleOwner) {
//            binding.popularMoviesRecyclerView.apply {
//                this.layoutManager = layoutManager
//                adapter = MovieCardAdapter(it, this@HomeFragment)
//                Log.d("Card", "setPopularRecyclerView: $it")
//            }
//        }
//
//        // New Movie
//        movieViewModel.latestMovies.observe(viewLifecycleOwner) {
//            binding.newMoviesRecyclerView.apply {
//                this.layoutManager = layoutManager
//                adapter = MovieCardAdapter(it, this@HomeFragment)
//                Log.d("Card", "latestPopularRecyclerView: $it")
//            }
//        }




    }

    override fun onMovieCardClicked(movie: Movie) {
        TODO("Membuka Detail Movie")
    }

    override fun onRemoveMovieFromWatchlistClicked(movie: Movie) {
        TODO("Not yet implemented")
    }


}
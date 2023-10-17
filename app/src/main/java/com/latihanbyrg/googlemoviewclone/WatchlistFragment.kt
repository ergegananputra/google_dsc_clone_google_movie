package com.latihanbyrg.googlemoviewclone

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.latihanbyrg.googlemoviewclone.databinding.FragmentWatchlistBinding



/**
 * A simple [Fragment] subclass.
 * Use the [WatchlistFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WatchlistFragment(movieViewModel: MovieModel) : Fragment(), MovieCardClickListener {
    // TODO: Rename and change types of parameters

    private lateinit var binding: FragmentWatchlistBinding
    private val movieViewModel = movieViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentWatchlistBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val watchListFragment = this
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

//        movieViewModel.movieLists.observe(viewLifecycleOwner) {
//            binding.watchlistRecyclerView.apply {
//                this.layoutManager = layoutManager
//                adapter = MovieCardAdapter(it, watchListFragment)
//                Log.d("Card", "setAllRecyclerView: $it")
//            }
//        }

        return inflater.inflate(R.layout.fragment_watchlist, container, false)
    }

    override fun onMovieCardClicked(movie: Movie) {
        TODO("Not yet implemented")
    }

    override fun onRemoveMovieFromWatchlistClicked(movie: Movie) {
        TODO("Not yet implemented")
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment WatchlistFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            WatchlistFragment(movieViewModel).apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}
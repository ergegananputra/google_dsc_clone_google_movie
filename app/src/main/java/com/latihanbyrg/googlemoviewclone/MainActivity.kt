package com.latihanbyrg.googlemoviewclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.latihanbyrg.googlemoviewclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val movieViewModel : MovieModel by viewModels {
        MovieModelFactory((application as GoogleTVApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        movieViewModel.factorySeeder.seed()

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.bottomNavigation.menu.findItem(R.id.home_menu).setIcon(R.drawable.baseline_home_24)
        replaceFragment(HomeFragment(movieViewModel))

        with(binding) {

            bottomNavigation.setOnItemSelectedListener {

                // Make every icon outline
                bottomNavigation.menu.findItem(R.id.home_menu).setIcon(R.drawable.outline_home_24)
                bottomNavigation.menu.findItem(R.id.library_menu).setIcon(R.drawable.outline_video_library_24)
                bottomNavigation.menu.findItem(R.id.watchlist_menu).setIcon(R.drawable.outline_bookmark_border_24)

                // Update
                when(it.itemId) {
                    R.id.home_menu -> {
                        replaceFragment(HomeFragment(movieViewModel))
                        it.setIcon(R.drawable.baseline_home_24)
                    }
                    R.id.library_menu -> {
                        replaceFragment(LibraryFragment(movieViewModel))
                        it.setIcon(R.drawable.baseline_video_library_24)
                    }
                    R.id.watchlist_menu -> {
                        replaceFragment(WatchlistFragment(movieViewModel))
                        it.setIcon(R.drawable.bookmark_filled_24)
                    }

                    else -> {
                        replaceFragment(HomeFragment(movieViewModel))
                        it.setIcon(R.drawable.baseline_home_24)
                    }
                }

                true
            }
        }
    }


    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()

    }



}
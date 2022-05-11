package btu.ninidze.homework_6

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import btu.ninidze.homework_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        navController = (supportFragmentManager
            .findFragmentById(R.id.navHostFragment) as NavHostFragment).navController


        setupActionBarWithNavController(navController, AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.notificationFragment,
                R.id.settingsFragment
            )
        ))
        binding.bottomNavView.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            hideIfAuth(destination)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return super.onOptionsItemSelected(item)
    }


    private fun hideIfAuth(destination: NavDestination) {
        if (destination.id == R.id.loginFragment ||
            destination.id == R.id.registerFragment ||
            destination.id == R.id.resetFragment) {
            binding.bottomNavView.visibility = View.GONE
        } else {
            binding.bottomNavView.visibility = View.VISIBLE
        }
    }
}
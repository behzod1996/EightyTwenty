package uz.behzoddev.eightytwenty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint
import uz.behzoddev.eightytwenty.databinding.ActivityMainBinding
import uz.behzoddev.feature_onboarding.databinding.ActivityOnboardingBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navHost: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setFullContent()

        setContentView(binding.root)

        setupNavHost()
    }

    private fun setupNavHost() {
        val navController = supportFragmentManager.findFragmentById(R.id.eighty_twenty_nav_host)
        navHost = navController as NavHostFragment?
            ?: return

    }

    private fun setFullContent() {
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        supportActionBar?.hide()
    }
}
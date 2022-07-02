package uz.behzoddev.feature_onboarding

import android.os.Bundle
import android.os.PersistableBundle
import android.view.Window
import android.view.WindowManager
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import uz.behzoddev.common_ui.hide
import uz.behzoddev.common_ui.show
import uz.behzoddev.feature_onboarding.databinding.ActivityOnboardingBinding
import javax.inject.Inject

@AndroidEntryPoint
class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding
    private lateinit var mViewPager: OnboardingViewPagerAdapter

    private val viewModel: OnboardingViewModel by viewModels()

    private var position = 0

    @Inject
    lateinit var navigator: OnboardingNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)

        setFullContent()

        setContentView(binding.root)

        setupUI()

        observeEvents()

    }

    private fun setFullContent() {
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        supportActionBar?.hide()
    }

    private fun setupUI() {
        mViewPager = OnboardingViewPagerAdapter(this, viewModel.lists)

        binding.apply {
            viewPager.adapter = mViewPager

            btnNext.setOnClickListener {
                viewModel.onEvent(OnboardingEvent.NextEvent)
            }

            tvSkip.setOnClickListener {
                viewModel.onEvent(OnboardingEvent.SkipEvent)
            }

            btnBecomeProductivity.setOnClickListener {
                viewModel.onEvent(OnboardingEvent.GetStartedEvent)
            }

        }

    }

    private fun observeEvents() = lifecycleScope.launch {
        repeatOnLifecycle(Lifecycle.State.CREATED) {
            viewModel.viewEffect.collect {
                observerEffects(it)
            }
        }
    }

    private fun observerEffects(effect: OnboardingViewEffect) {
        when (effect) {
            OnboardingViewEffect.GetStartedViewEffect -> {
                navigateToBecomeProductivity()
            }
            OnboardingViewEffect.NextViewEffect -> {
                navigateToNext()
            }
            OnboardingViewEffect.SkipViewEffect -> {
                navigateToSkip()
            }
        }
    }

    private fun navigateToNext() {
        position = binding.viewPager.currentItem

        if (position < viewModel.lists.size) {
            position++
            binding.viewPager.currentItem = position
        }

        if (binding.viewPager.currentItem == viewModel.lists.size - 1) {
            setVisible()
        }

    }

    private fun navigateToSkip() {
        binding.viewPager.currentItem = viewModel.lists.size - 1
        setVisible()
    }

    private fun navigateToBecomeProductivity() {
        navigator.navigateToNote()
    }

    private fun setVisible() {
        binding.apply {
            btnNext.hide()
            tvSkip.hide()

            ivRight.hide()

            btnBecomeProductivity.show()
        }
    }

}
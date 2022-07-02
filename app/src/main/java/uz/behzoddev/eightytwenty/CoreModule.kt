package uz.behzoddev.eightytwenty

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import uz.behzoddev.feature_onboarding.OnboardingNavigator

@Module
@InstallIn(ActivityComponent::class)
interface CoreModule {

    @Binds
    fun providesOnboardingNav(
        navigator: OnboardingNavigatorImpl
    ): OnboardingNavigator
}
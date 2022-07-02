package uz.behzoddev.feature_onboarding

sealed class OnboardingViewEffect {
    object GetStartedViewEffect: OnboardingViewEffect()
    object SkipViewEffect: OnboardingViewEffect()
    object NextViewEffect: OnboardingViewEffect()
}
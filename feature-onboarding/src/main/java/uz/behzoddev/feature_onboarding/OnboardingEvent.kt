package uz.behzoddev.feature_onboarding

sealed class OnboardingEvent {
    object GetStartedEvent: OnboardingEvent()
    object SkipEvent: OnboardingEvent()
    object NextEvent: OnboardingEvent()
}
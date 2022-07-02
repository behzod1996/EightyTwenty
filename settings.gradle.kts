pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "EightyTwenty"
include (":app")
include (":common-ui")
include (":feature-onboarding")
include (":feature-note")
include (":feature-task")
include (":feature-habit")
include (":feature-calendar")
include (":feature-category-note")
include (":data-caching")

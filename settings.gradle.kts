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
include (":core-common")
include (":core-ui")
include (":core-data")
include (":feature-onboarding")
include (":feature-note")
include (":feature-task")
include (":feature-habit")
include (":feature-calendar")
include (":feature-search-note")
include (":feature-new-note")
include (":feature-category-note")
include (":data-caching")

include (":domain")

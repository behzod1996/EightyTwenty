plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "uz.behzoddev.eightytwenty"
        minSdk = 31
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    viewBinding.isEnabled = true
}

dependencies {

    implementation(
        fileTree(
            mapOf(
                "dir" to "libs", "include" to
                        listOf("*.jar", "*.arr")
            )
        )
    )

    coreKtx()
    appCompat()
    materialDesign()
    constraintLayout()
    junit()
    junitTest()

    hilt()
    hiltKapt()

    navigationUi()
    navigationFragment()
    
    implementation(project(":feature-onboarding"))
    implementation(project(":feature-note"))
    implementation(project(":feature-task"))
    implementation(project(":feature-habit"))
    implementation(project(":feature-calendar"))
    implementation(project(":data-caching"))
    implementation(project(":feature-category-note"))
    implementation(project(":feature-search-note"))
    implementation(project(":feature-new-note"))
    implementation(project(":core-ui"))
}

kapt {
    correctErrorTypes = true
}

hilt {
    enableExperimentalClasspathAggregation = true
}


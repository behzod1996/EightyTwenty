plugins {
    id ("com.android.library")
    id ("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

    android {
    compileSdk = 32

    defaultConfig {
    minSdk = 26
    targetSdk = 32

      testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
      consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
       release {
           isMinifyEnabled = false
           proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
       }
    }
    }

  dependencies {
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
  }

kapt {
    correctErrorTypes = true
}
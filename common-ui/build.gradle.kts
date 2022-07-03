plugins {
    id ("com.android.library")
    id ("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 31
        targetSdk = 32

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

    implementation(fileTree(mapOf("dir" to "libs", "include" to
            listOf("*.jar", "*.arr"))))

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
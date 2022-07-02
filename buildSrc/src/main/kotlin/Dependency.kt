object Dependency {
    const val gradle = "com.android.tools.build:gradle:${Version.gradleVersion}"
    const val kotlinGradle =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlinGradleVersion}"
    const val googlePlayService =
        "com.google.gms:google-services:${Version.googlePlayServiceVersion}"
    const val hiltGradle =
        "com.google.dagger:hilt-android-gradle-plugin:${Version.hiltGradleVersion}"
    const val coreKtx = "androidx.core:core-ktx:${Version.coreKtxVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Version.appCompatVersion}"
    const val materialDesign = "com.google.android.material:material:${Version.materialVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Version.constraintLayoutVersion}"
    const val legacy = "androidx.legacy:legacy-support-v4:${Version.legacyVersion}"
    const val junit = "junit:junit:${Version.junitVersion}"
    const val juniTest = "androidx.test.ext:junit:${Version.junitTestVersion}"
    const val espresso = "androidx.test.espresso:espresso-core:${Version.espressoVersion}"
    const val firebaseAuthKtx =
        "com.google.firebase:firebase-auth-ktx:${Version.firebaseAuthKtxVersion}"
    const val firebaseAuthUi = "com.firebaseui:firebase-ui-auth:${Version.firebaseAuthUiVersion}"
    const val firebaseMessaging =
        "com.google.firebase:firebase-messaging-ktx:${Version.firebaseMessagingVersion}"
    const val firebaseDynamicLinks =
        "com.google.firebase:firebase-dynamic-links-ktx:${Version.firebaseDynamicLinksVersion}"
    const val firebaseAnalytics =
        "com.google.firebase:firebase-analytics:${Version.firebaseAnalyticsVersion}"
    const val coroutineCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutineVersion}"
    const val coroutineAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutineVersion}"
    const val coroutinePlayServices =
        "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Version.coroutineVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofitVersion}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Version.retrofitVersion}"
    const val interceptor =
        "com.squareup.okhttp3:logging-interceptor:${Version.interceptorVersion}"
    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Version.navigationVersion}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Version.navigationVersion}"
    const val location = "com.google.android.gms:play-services-location:${Version.locationVersion}"
    const val glide = "com.github.bumptech.glide:glide:${Version.glideVersion}"
    const val hilt = "com.google.dagger:hilt-android:${Version.hiltVersion}"
    const val hiltKapt = "com.google.dagger:hilt-compiler:${Version.hiltVersion}"
    const val timber = "com.jakewharton.timber:timber:${Version.timberVersion}"
    const val logger = "com.orhanobut:logger:${Version.loggerVersion}"
    const val lifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycleKtxVersion}"
    const val lifecycleLiveData =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycleKtxVersion}"
    const val lifecycleRuntime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycleKtxVersion}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Version.fragmentKtxVersion}"

    const val dataStorePreferences =
        "androidx.datastore:datastore-preferences:${Version.dataStoreVersion}"
    const val dataStoreCore = "androidx.datastore:datastore-core:${Version.dataStoreVersion}"
    const val leakCanary =
        "com.squareup.leakcanary:leakcanary-android:${Version.leakCanaryVersion}"
    const val coil = "io.coil-kt:coil:${Version.coilVersion}"
    const val serialization =
        "org.jetbrains.kotlinx:kotlinx-serialization-json:${Version.serializationVersion}"
    const val viewPager = "androidx.viewpager2:viewpager2:${Version.viewPagerVersion}"
    const val roundImageView = "com.makeramen:roundedimageview:${Version.roundImageViewVersion}"
    const val room = "androidx.room:room-runtime:${Version.roomVersion}"
    const val roomKapt = "androidx.room:room-compiler:${Version.roomVersion}"
    const val roomCoroutine = "androidx.room:room-ktx:${Version.roomVersion}"
}
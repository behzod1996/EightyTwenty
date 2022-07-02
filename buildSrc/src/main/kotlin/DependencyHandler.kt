import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.gradle() {
    classpath(Dependency.gradle)
}

fun DependencyHandler.kotlinGradle() {
    classpath(Dependency.kotlinGradle)
}

fun DependencyHandler.googlePlayServices() {
    classpath(Dependency.googlePlayService)
}


fun DependencyHandler.hiltGradle() {
    classpath(Dependency.hiltGradle)
}


fun DependencyHandler.coreKtx() {
    implementation(Dependency.coreKtx)
}

fun DependencyHandler.appCompat() {
    implementation(Dependency.appCompat)
}

fun DependencyHandler.materialDesign() {
    implementation(Dependency.materialDesign)
}

fun DependencyHandler.constraintLayout() {
    implementation(Dependency.constraintLayout)
}

fun DependencyHandler.legacy() {
    implementation(Dependency.legacy)
}

fun DependencyHandler.junit() {
    testImplementation(Dependency.junit)
}

fun DependencyHandler.junitTest() {
    androidTestImplementation(Dependency.juniTest)
}

fun DependencyHandler.espresso() {
    androidTestImplementation(Dependency.espresso)
}

fun DependencyHandler.firebaseAuthKtx() {
    implementation(Dependency.firebaseAuthKtx)
}

fun DependencyHandler.firebaseAuthUi() {
    implementation(Dependency.firebaseAuthUi)
}

fun DependencyHandler.firebaseMessaging() {
    implementation(Dependency.firebaseMessaging)
}

fun DependencyHandler.firebaseDynamicLinks() {
    implementation(Dependency.firebaseDynamicLinks)
}

fun DependencyHandler.firebaseAnalytics() {
    implementation(Dependency.firebaseAnalytics)
}

fun DependencyHandler.coroutineCore() {
    implementation(Dependency.coroutineCore)
}

fun DependencyHandler.coroutineAndroid() {
    implementation(Dependency.coroutineAndroid)
}

fun DependencyHandler.coroutinePlayServices() {
    implementation(Dependency.coroutinePlayServices)
}

fun DependencyHandler.retrofit() {
    implementation(Dependency.retrofit)
}

fun DependencyHandler.gson() {
    implementation(Dependency.gson)
}

fun DependencyHandler.interceptor() {
    implementation(Dependency.interceptor)
}

fun DependencyHandler.navigationFragment() {
    implementation(Dependency.navigationFragment)
}

fun DependencyHandler.navigationUi() {
    implementation(Dependency.navigationUi)
}

fun DependencyHandler.location() {
    implementation(Dependency.location)
}

fun DependencyHandler.glide() {
    implementation(Dependency.glide)
}

fun DependencyHandler.hilt() {
    implementation(Dependency.hilt)
}

fun DependencyHandler.hiltKapt() {
    kapt(Dependency.hiltKapt)
}

fun DependencyHandler.timber() {
    implementation(Dependency.timber)
}

fun DependencyHandler.logger() {
    implementation(Dependency.logger)
}

fun DependencyHandler.lifecycleViewModel() {
    implementation(Dependency.lifecycleViewModel)
}

fun DependencyHandler.lifecycleRuntime() {
    implementation(Dependency.lifecycleRuntime)
}

fun DependencyHandler.lifecycleLiveData() {
    implementation(Dependency.lifecycleLiveData)
}

fun DependencyHandler.fragmentKtx() {
    implementation(Dependency.fragmentKtx)
}

fun DependencyHandler.dataStorePreferences() {
    implementation(Dependency.dataStorePreferences)
}

fun DependencyHandler.dataStoreCore() {
    implementation(Dependency.dataStoreCore)
}

fun DependencyHandler.leakCanary() {
    debugImplementation(Dependency.leakCanary)
}

fun DependencyHandler.coil(){
    implementation(Dependency.coil)
}

fun DependencyHandler.serialization() {
    implementation(Dependency.serialization)
}

fun DependencyHandler.viewPager2() {
    implementation(Dependency.viewPager)
}

fun DependencyHandler.roundImageView() {
    implementation(Dependency.roundImageView)
}

fun DependencyHandler.room() {
    implementation(Dependency.room)
    implementation(Dependency.roomCoroutine)
    kapt(Dependency.roomKapt)
}

private fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}

private fun DependencyHandler.kapt(depName: String) {
    add("kapt", depName)
}

private fun DependencyHandler.androidTestImplementation(depName: String) {
    add("androidTestImplementation", depName)
}

private fun DependencyHandler.testImplementation(depName: String) {
    add("testImplementation", depName)
}

private fun DependencyHandler.classpath(depName: String) {
    add("classpath", depName)
}

private fun DependencyHandler.debugImplementation(depName: String) {
    add("debugImplementation",depName)
}

plugins {
    alias(libs.plugins.android.application)
}


android {
    namespace = "com.example.learningmate"

    compileSdk = 35

    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // 앱 모듈은 다 알고 있어야 함
    implementation(project(":data"))
    implementation(project(":domain"))
    implementation(project(":presentation"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    // glide
    implementation(libs.glide)
    implementation(libs.androidx.paging.common.android)
    annotationProcessor (libs.compiler)

    // viewpager
    implementation(libs.androidx.viewpager2)

    // indicator
    implementation (libs.relex.circleindicator)

    // kakao
    implementation (libs.com.kakao.sdk.v2.all)

    // datastore
    implementation (libs.androidx.datastore.preferences)

    // okHttp
    implementation(libs.okhttp)
    implementation(platform(libs.okhttp.bom))
    implementation (libs.logging.interceptor)
    implementation (libs.okhttp.urlconnection)

    // retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    // gson
    implementation(libs.gson)

    // splash
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // drag and drop
    implementation(libs.androidx.draganddrop)

    // coroutines
    implementation(libs.kotlinx.coroutines.android)

    //lottie
    implementation (libs.lottie)

    //room
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
}
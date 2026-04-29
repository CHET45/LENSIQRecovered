plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
//    id("com.google.gms.google-services")
//    id("com.google.firebase.crashlytics")
}

android {
    namespace = "com.eyevue.glassapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.eyevue.glassapp"
        minSdk = 26
        targetSdk = 35
        versionCode = 51
        versionName = "1.0.51-gp"

        buildConfigField(
            "String",
            "DEFAULT_PRIVACY_HTML",
            "\"https://platform.eyevue-glass.com/app-about-h5?code=privacy_policy_us\""
        )

        buildConfigField(
            "String",
            "DEFAULT_USER_AGREEMENT_HTML",
            "\"https://platform.eyevue-glass.com/app-about-h5?code=user_agreement_us\""
        )

        buildConfigField(
            "String",
            "MAPS_API_KEY",
            "\"AIzaSyDWl9G0XlYSslc9sWXKfrz2-WIPXBMqeM0\""
        )

    }
    useLibrary("org.apache.http.legacy")

    buildFeatures {
        dataBinding = true
        buildConfig = true
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlin {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
        }
    }

}

dependencies {
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.7")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
    implementation("androidx.lifecycle:lifecycle-process:2.8.7")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("androidx.viewpager2:viewpager2:1.1.0")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("androidx.startup:startup-runtime:1.2.0")
    implementation("androidx.work:work-runtime-ktx:2.9.1")
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")
    implementation("androidx.credentials:credentials:1.3.0")
    implementation("androidx.credentials:credentials-play-services-auth:1.3.0")

    implementation("com.google.android.gms:play-services-auth:20.7.0")
    implementation("com.google.android.gms:play-services-auth-api-phone:18.0.2")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("com.google.android.gms:play-services-ads-identifier:18.0.0")

    implementation("com.google.firebase:firebase-auth:24.0.1")
    implementation("com.google.firebase:firebase-firestore:25.1.4")
    implementation("com.google.firebase:firebase-firestore-ktx:25.1.4")
    implementation("com.google.firebase:firebase-analytics:23.0.0")
    implementation("com.google.firebase:firebase-crashlytics:20.0.3")
    implementation("com.google.firebase:firebase-crashlytics-ndk:20.0.3")
    implementation("com.google.firebase:firebase-sessions:3.0.3")

    implementation("com.google.android.libraries.identity.googleid:googleid:1.1.0")
    implementation("com.google.android.play:integrity:1.3.0")
    implementation("com.google.android.recaptcha:recaptcha:18.6.1")

    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.21")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")

    implementation("com.airbnb.android:lottie:6.4.0")
    implementation("com.google.zxing:core:3.5.3")
    implementation("com.journeyapps:zxing-android-embedded:4.3.0")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    kapt("com.github.bumptech.glide:compiler:4.16.0")
    implementation("jp.wasabeef:glide-transformations:4.3.0")
    implementation("pl.droidsonroids.gif:android-gif-drawable:1.2.29")
    implementation("com.github.chrisbanes:PhotoView:2.3.0")

    implementation("com.blankj:utilcodex:1.30.6")
    implementation("com.liulishuo.okdownload:okdownload:1.0.7")
    implementation("com.liulishuo.okdownload:okhttp:1.0.7")
    implementation("io.github.cymchad:BaseRecyclerViewAdapterHelper:3.0.14")

    implementation("com.tencent:mmkv:1.3.9")
    implementation("org.tensorflow:tensorflow-lite:2.16.1")
    implementation("org.tensorflow:tensorflow-lite-support:0.4.4")
    implementation("org.videolan.android:libvlc-all:3.6.0")
    implementation("com.arthenica:ffmpeg-kit-full:6.0-2")

    implementation("androidx.viewpager:viewpager:1.0.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("io.github.scwang90:refresh-layout-kernel:3.0.0-alpha")
    implementation("io.github.scwang90:refresh-header-classics:3.0.0-alpha")
    implementation("io.github.scwang90:refresh-footer-classics:3.0.0-alpha")
    implementation("androidx.mediarouter:mediarouter:1.8.1")
    implementation("com.google.android.exoplayer:exoplayer:2.19.1")
    implementation("com.google.android.exoplayer:exoplayer-ui:2.19.1")
//    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))
}

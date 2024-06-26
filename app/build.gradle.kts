plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.smumc.smumc_6th_teamc_android"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.smumc.smumc_6th_teamc_android"
        minSdk = 30
        targetSdk = 34
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

    buildFeatures {
        viewBinding = true
        buildConfig = true
        compose = true
    }

    viewBinding {
        enable = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.compose.runtime:runtime-android:1.6.7")
    implementation("androidx.compose.animation:animation-android:1.6.7")
    implementation("androidx.compose.foundation:foundation-layout-android:1.6.7")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Google Map
    implementation("com.google.android.gms:play-services-maps:18.2.0") // Android용 Google Maps SDK
    implementation("com.google.android.gms:play-services-location:21.2.0") // Android용 위치 서비스

    // Material (아이콘 라이브러리)
    implementation("androidx.compose.material:material:1.6.7")
    implementation("androidx.compose.material3:material3:1.2.1")

    // Accompanist-permissions (권한 요청 라이브러리)
    implementation("com.google.accompanist:accompanist-permissions:0.34.0")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2")

    // OkHttp
    implementation("com.squareup.okhttp3:okhttp:4.9.1")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.1")

    // WebSocket
    implementation("org.java-websocket:Java-WebSocket:1.5.2")

    // RoomDB
    implementation("androidx.room:room-ktx:2.6.1")
    implementation("androidx.room:room-runtime:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")

    // RxJava
    implementation("io.reactivex.rxjava2:rxjava:2.2.21")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")

    // Stomp
    implementation("com.github.NaikSoftware:StompProtocolAndroid:1.6.6")
    
    // lottie 애니메이션
    implementation ("com.airbnb.android:lottie:6.3.0")
    kapt("androidx.room:room-compiler:2.6.1")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.9.0")
}

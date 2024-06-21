plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
<<<<<<< HEAD
}

android {
    namespace = "com.sameer.multiscreen"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sameer.multiscreen"
        minSdk = 22
=======
<<<<<<< HEAD
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.sameer.signup2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sameer.signup2"
        minSdk = 21
=======
}

android {
<<<<<<< HEAD
    namespace = "com.sameer.myroughth2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sameer.myroughth2"
        minSdk = 24
>>>>>>> ddd14147b41b53a07df447c9782f2fe9b0a2868d
>>>>>>> 16284ccb47df06d0f8dd03ebef05b1a3686e36ea
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
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
<<<<<<< HEAD
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
=======
<<<<<<< HEAD
    implementation(libs.firebase.database)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
=======
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
=======

    namespace = "com.sameer.rough1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sameer.rough1"

        namespace = "com.sameer.changecolor"
        compileSdk = 34

        defaultConfig {
            applicationId = "com.sameer.changecolor"

            minSdk = 22
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
    }

    dependencies {

        implementation(libs.androidx.core.ktx)
        implementation(libs.androidx.appcompat)
        implementation(libs.material)
        implementation(libs.androidx.activity)
        implementation(libs.androidx.constraintlayout)
        testImplementation(libs.junit)
        androidTestImplementation(libs.androidx.junit)
        androidTestImplementation(libs.androidx.espresso.core)
    }
>>>>>>> 12a6c98d9f8c2f93d4dc7619390326cf2de7bb0c
>>>>>>> ddd14147b41b53a07df447c9782f2fe9b0a2868d
>>>>>>> 16284ccb47df06d0f8dd03ebef05b1a3686e36ea
}
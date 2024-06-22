plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
<<<<<<< HEAD
}

android {
    namespace = "com.sameer.letcurer1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sameer.letcurer1"
        minSdk = 22
=======
    alias(libs.plugins.google.gms.google.services)
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sameer.myroughth2" // Use the main application's ID
        minSdk = 21
>>>>>>> 9e6a600b86c9e6fa602c954cbabf80d7e16d1712
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
<<<<<<< HEAD
=======

>>>>>>> 9e6a600b86c9e6fa602c954cbabf80d7e16d1712
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
<<<<<<< HEAD
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

=======

    kotlinOptions {
        jvmTarget = "1.8"
    }

    // Define namespaces for different modules or features
    sourceSets {
        getByName("main") {
            java.srcDir("src/main/java/com/sameer/splanishscreen")
            res.srcDir("src/main/res/com/sameer/splanishscreen")
            manifest.srcFile("src/main/AndroidManifest.xml")
        }
        create("multiScreen") {
            java.srcDir("src/multiScreen/java/com/sameer/multiscreen")
            res.srcDir("src/multiScreen/res/com/sameer/multiscreen")
            manifest.srcFile("src/multiScreen/AndroidManifest.xml")
        }
        create("signup2") {
            java.srcDir("src/signup2/java/com/sameer/signup2")
            res.srcDir("src/signup2/res/com/sameer/signup2")
            manifest.srcFile("src/signup2/AndroidManifest.xml")
        }
        create("changeColor") {
            java.srcDir("src/changeColor/java/com/sameer/changecolor")
            res.srcDir("src/changeColor/res/com/sameer/changecolor")
            manifest.srcFile("src/changeColor/AndroidManifest.xml")
        }
        create("rough1") {
            java.srcDir("src/rough1/java/com/sameer/rough1")
            res.srcDir("src/rough1/res/com/sameer/rough1")
            manifest.srcFile("src/rough1/AndroidManifest.xml")
        }
    }
}

dependencies {
>>>>>>> 9e6a600b86c9e6fa602c954cbabf80d7e16d1712
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
<<<<<<< HEAD
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
=======
    implementation(libs.firebase.database)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
>>>>>>> 9e6a600b86c9e6fa602c954cbabf80d7e16d1712

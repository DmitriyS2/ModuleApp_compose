plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.hilt)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.sd.moduleapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sd.moduleapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":data:api"))
    implementation(project(":data:impl"))
    implementation(project(":domain:api"))
    implementation(project(":domain:impl"))
    implementation(project(":core:common"))
    implementation(project(":features:plusOne"))

    // Kotlin coroutines with lifecycle
    implementation(libs.bundles.lifecycle)

    // Dagger Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)

    // Room
    implementation(libs.androidx.room.ktx)
    annotationProcessor(libs.androidx.room.annotation.processor)
    ksp(libs.androidx.room.annotation.processor)

    // navigation
    implementation(libs.androidx.navigation.compose)

    // dependencies for Java 8+ API desugaring support (for the new language APIs)
    coreLibraryDesugaring(libs.desugar.jdk.libs)

    // Compose
    implementation(libs.compose.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.tooling.preview)
    androidTestImplementation(platform(libs.compose.bom))
    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.ui.test.manifest)
    implementation(libs.compose.material3)
    androidTestImplementation(libs.compose.ui.test.junit4)

    implementation(libs.androidx.core.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
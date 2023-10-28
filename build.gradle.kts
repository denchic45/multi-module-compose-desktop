plugins {
    kotlin("multiplatform") version "1.8.20" apply false
    kotlin("plugin.serialization") version "1.8.20"
    id("org.jetbrains.compose")  version "1.5.3" apply false
}

buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
        maven(url = "https://jitpack.io")
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven(url = "https://mvn.mchv.eu/repository/mchv/")
    }
}
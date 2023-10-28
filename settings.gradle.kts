pluginManagement {
    val kotlinVersion: String by settings
    val jetbrainsComposeVersion: String by settings
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven(url = "https://mvn.mchv.eu/repository/mchv/")
    }
    plugins {
        kotlin("jvm") version kotlinVersion
        id("org.jetbrains.compose") version jetbrainsComposeVersion
        id("com.google.devtools.ksp") version "1.8.20-1.0.11"
    }
}

rootProject.name = "multi-module-compose-desktop"

include("app1")
include("app2")
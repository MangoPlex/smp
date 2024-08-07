pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/") {
            name = "Fabric"
        }
        gradlePluginPortal()
    }

    plugins {
        id("fabric-loom") version "1.7-SNAPSHOT"
    }
}

rootProject.name = "circussmp"

include("circussmp-mod")
include("circussmp-proxy")

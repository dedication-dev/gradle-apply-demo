plugins {
    kotlin("jvm") version "1.9.23"
    id("maven-publish")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

apply(from = "applied.gradle.kts")

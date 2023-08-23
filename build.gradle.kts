val daggerVersion = "2.44"

plugins {
    kotlin("jvm") version("1.9.0")

    id("io.gitlab.arturbosch.detekt") version("1.23.1")
}

group = "com.lfscheidegger"
version = "1.0.0"

repositories {
    mavenCentral()
}
dependencies {
    "detektPlugins"(project(":custom-rules"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}
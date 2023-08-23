plugins {
    kotlin("jvm") version "1.9.0"
}

group = "com.lfscheidegger"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("io.gitlab.arturbosch.detekt:detekt-api:1.23.1")
}

tasks.test {
    useJUnitPlatform()
}
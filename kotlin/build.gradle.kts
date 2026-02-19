plugins {
    kotlin("jvm") version "1.9.24"
    application
}

group = "fizzbuzz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("fizzbuzz.MainKt")
}

kotlin {
    jvmToolchain(17)
}

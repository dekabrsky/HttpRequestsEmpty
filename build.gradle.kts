plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(group = "com.fasterxml.jackson.core", name = "jackson-databind", version = "2.12.7.1")
}

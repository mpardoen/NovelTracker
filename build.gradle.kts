import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.2.1.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
    id("org.jetbrains.kotlin.plugin.spring") version "1.4.21"
    //id("org.flywaydb.flyway") version "7.3.2"
    kotlin("jvm") version "1.4.10"
    application
}
group = "com.stazie"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test-junit"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.h2database:h2")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    //implementation("org.flywaydb:flyway-core")
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
application {
    mainClassName = "com.stazie.noveltracker.MainKt"
}
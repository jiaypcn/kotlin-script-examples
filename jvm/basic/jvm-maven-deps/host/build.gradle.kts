plugins {
    kotlin("jvm")
    application
}

val kotlinVersion: String by rootProject.extra

dependencies {
    implementation(project(":jvm:basic:jvm-maven-deps:script"))
    implementation("org.jetbrains.kotlin:kotlin-scripting-common:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm-host:$kotlinVersion")
    testImplementation("junit:junit:4.13.1")
    testRuntimeOnly("org.slf4j:slf4j-nop:1.7.28")
}

application {
    mainClass.set("org.jetbrains.kotlin.script.examples.jvm.resolve.maven.host.HostKt")
}


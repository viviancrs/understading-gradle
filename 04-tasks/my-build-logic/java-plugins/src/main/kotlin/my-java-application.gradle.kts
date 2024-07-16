import gradle.kotlin.dsl.accessors._272b7390582f4cf8bb9f6f57d5913699.kotlin

plugins {
    id("application")
    id("org.jetbrains.kotlin.jvm")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    //
}
plugins {
    id("application")
}

java {
    java.toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

dependencies {
    implementation(project(":business-logic"))
}
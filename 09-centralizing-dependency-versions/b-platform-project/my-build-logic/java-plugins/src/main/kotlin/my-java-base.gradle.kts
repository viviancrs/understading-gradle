plugins {
    id("java")
}

group = "org.example.my-app"

dependencies {
    implementation(platform("org.example.my-app:shared-platform"))
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

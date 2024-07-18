plugins {
    id("java-platform")
}

group = "org.example.my-app"

javaPlatform.allowDependencies()

dependencies {
    api(platform("org.apache.commons:commons-lang3:3.9"))
    api(platform("com.google.errorprone:error_prone_annotations:2.9.0"))
    api(platform("org.slf4j:slf4j-api:1.7.32"))
    api(platform("org.slf4j:slf4j-simple:1.7.32"))
}

dependencies.constraints {
    api("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20")
}
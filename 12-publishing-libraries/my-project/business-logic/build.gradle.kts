plugins {
    id("my-java-library")
}

dependencies {
    implementation("org.slf4j:slf4j-api")
    implementation("org.example.my-app:shared-utils")

    api(project(":data-model"))
}
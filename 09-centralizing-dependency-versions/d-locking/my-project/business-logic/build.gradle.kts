plugins {
    id("my-java-library")
}

dependencies {
    implementation("org.apache.commons:commons-lang3:latest.release")
    implementation("org.slf4j:slf4j-api:latest.release")
    implementation("org.example.my-app:shared-utils")

    api(project(":data-model"))
}
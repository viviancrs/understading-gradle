plugins {
    id("my-java-library")
}

dependencies {

    implementation(libs.commons.lang3)
    implementation(libs.slf4j.api)
    implementation("org.example.my-app:shared-utils")

    api(project(":data-model"))
}
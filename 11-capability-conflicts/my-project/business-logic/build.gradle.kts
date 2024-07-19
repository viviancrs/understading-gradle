plugins {
    id("my-java-library")
}

dependencies {
    implementation("org.slf4j:slf4j-api")

    api(project(":data-model"))
}
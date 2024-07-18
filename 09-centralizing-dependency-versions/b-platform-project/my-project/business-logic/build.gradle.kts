plugins {
    id("my-java-library")
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.9")
    implementation("org.slf4j:slf4j-api")
    implementation("org.example.my-app:shared-utils")

    api(project(":data-model"))

    compileOnlyApi("com.google.errorprone:error_prone_annotations")
}
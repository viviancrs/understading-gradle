plugins {
    id("my-java-base")
    id("java-library")
    id("maven-publish")
}

publishing {
    publications.create<MavenPublication>("lib").from(components["java"])

    repositories.maven("/tmp/test-repo")
}
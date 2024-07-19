plugins {
    id("my-java-application")
}

application {
    mainClass.set("myproject.MyApplication")
}

dependencies {
    implementation(project(":business-logic"))

    implementation("io.dropwizard:dropwizard-core")
    runtimeOnly("org.slf4j:slf4j-simple")
}
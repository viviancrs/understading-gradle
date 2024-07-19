plugins {
    id("my-java-application")
}

application {
    mainClass.set("myproject.MyApplication")
}

dependencies {
    implementation(project(":business-logic"))

    implementation("org.apache.commons:commons-text")
}
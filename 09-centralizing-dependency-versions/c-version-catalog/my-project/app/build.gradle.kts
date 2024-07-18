plugins {
    id("my-java-application")
}

myApp {
    mainClass.set("myproject.MyApplication")
}

dependencies {
    implementation(project(":business-logic"))

    runtimeOnly(libs.slf4j.simple)
}
plugins {
    id("my-java-application")
}

myApp {
    mainClass.set("myproject.MyApplication")
}

dependencies {
    implementation(project(":business-logic"))

    runtimeOnly("org.slf4j:slf4j-simple")
}
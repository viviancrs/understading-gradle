import gradle.kotlin.dsl.accessors._fa7f94d12aa30f8de9950944bf07b9ca.application

plugins {
    id("java")
}

group = "org.example.my-app"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

dependencies.constraints {
    implementation("org.apache.commons:commons-lang3:3.6")
    implementation("org.apache.commons:commons-text:1.5")
}

val applicationRunTimeClasspath = configurations.create("applicationRuntimeClasspath") {
    isCanBeResolved = true
    isCanBeConsumed = false
    attributes {
        attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_RUNTIME))
    }
}

dependencies {
    applicationRunTimeClasspath("org.example.my-app:app")
}

configurations {
    runtimeClasspath.get().shouldResolveConsistentlyWith(applicationRunTimeClasspath)
    compileClasspath.get().shouldResolveConsistentlyWith(applicationRunTimeClasspath)
    testRuntimeClasspath.get().shouldResolveConsistentlyWith(applicationRunTimeClasspath)
    testCompileClasspath.get().shouldResolveConsistentlyWith(applicationRunTimeClasspath)
}
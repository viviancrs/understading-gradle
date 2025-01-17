plugins {
    id("java")
    id("metadata-rules")
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
    implementation("org.slf4j:slf4j-api:1.7.32")
    implementation("org.slf4j:slf4j-simple:1.7.32")
    implementation("io.dropwizard:dropwizard-core:2.0.25")
}

configurations.all {
    resolutionStrategy.capabilitiesResolution.withCapability("org.slf4j", "slf4j-impl") {
        select("ch.qos.logback:logback-classic:0")
    }
}
plugins {
    id("java")
    id("checkstyle")
}

val myBuildGroup = "my project build"
tasks.named<TaskReportTask>("tasks") {
    displayGroup = myBuildGroup
}

tasks.build {
    group = myBuildGroup
}
tasks.check {
    group = myBuildGroup
    description = "Run checks."
}
tasks.register("qualityCheck") {
    group = myBuildGroup
    description = "Runs quality checks."
    dependsOn(tasks.classes, tasks.checkstyleMain)
    dependsOn(tasks.testClasses, tasks.checkstyleTest)
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks.test {
    useJUnitPlatform()
    testLogging.showStandardStreams = true
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
}
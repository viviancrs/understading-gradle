val globalBuildGroup = "My global build"
val ciBuildGroup = "My CI build"

tasks.named<TaskReportTask>("tasks") {
    displayGroup = globalBuildGroup
}

tasks.register("qualityCheckAll") {
    group = globalBuildGroup
    description = "Runs global checks."
    dependsOn(subprojects.map { ":${it.name}:qualityCheck" })
}

tasks.register("checkAll") {
    group = ciBuildGroup
    description = "Runs global"
    dependsOn(subprojects.map { ":${it.name}:check" })
    dependsOn(gradle.includedBuilds.map { it.task(":checkAll") })
}
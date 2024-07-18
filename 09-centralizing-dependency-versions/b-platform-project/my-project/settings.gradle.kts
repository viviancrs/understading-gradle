rootProject.name = "my-project"

pluginManagement {
    repositories.gradlePluginPortal()
    repositories.google()
    includeBuild("../my-build-logic")
}

dependencyResolutionManagement {
    repositories.mavenCentral()
    includeBuild("../my-other-project")
    includeBuild("../my-platform")
    includeBuild(".")
}

include("app")
include("business-logic")
include("data-model")
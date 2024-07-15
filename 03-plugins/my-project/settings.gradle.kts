rootProject.name = "my-project"

pluginManagement {
    repositories.gradlePluginPortal()
    repositories.google()
    includeBuild("../my-build-logic")
}

dependencyResolutionManagement {
    repositories.mavenCentral()
    includeBuild("../my-other-project")
}

rootDir.listFiles()?.filter { it.isDirectory && !it.isHidden }?.forEach {
    include(it.name)
}

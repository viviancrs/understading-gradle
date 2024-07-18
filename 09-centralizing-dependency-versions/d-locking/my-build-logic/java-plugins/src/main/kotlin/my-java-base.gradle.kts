plugins {
    id("java")
}

group = "org.example.my-app"

configurations {
    compileClasspath {
        resolutionStrategy.activateDependencyLocking()
    }

    runtimeClasspath {
        resolutionStrategy.activateDependencyLocking()
    }

    testCompileClasspath {
        resolutionStrategy.activateDependencyLocking()
    }

    testRuntimeClasspath {
        resolutionStrategy.activateDependencyLocking()
    }
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

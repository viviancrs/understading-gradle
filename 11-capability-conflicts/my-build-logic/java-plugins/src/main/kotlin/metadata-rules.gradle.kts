import myproject.metadatarules.Slf4JImplRule
import org.gradle.kotlin.dsl.withModule

dependencies.components {
    withModule<Slf4JImplRule>("org.slf4j:slf4j-simple")
    withModule<Slf4JImplRule>("ch.qos.logback:logback-classic")
}
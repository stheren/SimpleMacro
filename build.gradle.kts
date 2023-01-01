import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow")
    application
    id("org.openjfx.javafxplugin")
}


repositories {
    mavenCentral()
}

dependencies {

}

javafx {
    modules("javafx.controls", "javafx.fxml", "javafx.web")
}

application {
    mainClass.set("Window")
}

tasks.getByName<ShadowJar>("shadowJar") {
    archiveClassifier.set("fat")
    archiveVersion.set(project.version.toString())
    archiveBaseName.set(project.name)
}

pluginManagement {
    repositories {
        google();
        mavenCentral();
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS);
    repositories {
        maven { url = uri("https://verve.jfrog.io/artifactory/verve-gradle-release/") }
        maven("https://jitpack.io")
        maven("https://maven.zego.im")
        google();
        mavenCentral()
    }
}
rootProject.name = "LENSIQRecovered"
include(":app")

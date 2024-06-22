pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

<<<<<<< HEAD
rootProject.name = "letcurer1"
=======
rootProject.name = "Splanishscreen"

rootProject.name = "MultiScreen"


rootProject.name = "Sign up2"

rootProject.name = "my roughth2"

rootProject.name = "rough1"

rootProject.name = "changecolor"

>>>>>>> 9e6a600b86c9e6fa602c954cbabf80d7e16d1712
include(":app")
 
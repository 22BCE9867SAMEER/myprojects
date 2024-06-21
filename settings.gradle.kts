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
rootProject.name = "Sign up2"
=======
<<<<<<< HEAD
rootProject.name = "my roughth2"
=======

rootProject.name = "rough1"

rootProject.name = "changecolor"
>>>>>>> 12a6c98d9f8c2f93d4dc7619390326cf2de7bb0c
>>>>>>> ddd14147b41b53a07df447c9782f2fe9b0a2868d
include(":app")
 
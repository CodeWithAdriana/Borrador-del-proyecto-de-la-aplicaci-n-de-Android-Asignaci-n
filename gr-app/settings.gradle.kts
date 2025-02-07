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
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS) // Cambiar FAIL_ON_PROJECT_REPOS a PREFER_SETTINGS
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "gr-app" 
include(":app")

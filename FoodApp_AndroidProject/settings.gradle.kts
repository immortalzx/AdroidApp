pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()

    }


}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven {
            url= uri("https://maven.zohodl.com")
        }


    }

}



rootProject.name = "FoodApp_AndroidProject"
include(":app")
 
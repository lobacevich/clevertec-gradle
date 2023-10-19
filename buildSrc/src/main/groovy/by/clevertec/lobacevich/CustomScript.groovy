package by.clevertec.lobacevich

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomScript implements Plugin<Project> {

    @Override
    void apply(Project target) {
        println("Custom script")
    }
}
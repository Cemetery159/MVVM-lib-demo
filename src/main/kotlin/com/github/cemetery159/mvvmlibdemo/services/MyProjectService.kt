package com.github.cemetery159.mvvmlibdemo.services

import com.github.cemetery159.mvvmlibdemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

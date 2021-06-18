package com.dywx.plugins.astemplate.services

import com.dywx.plugins.astemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

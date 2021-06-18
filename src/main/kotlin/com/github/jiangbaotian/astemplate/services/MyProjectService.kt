package com.github.jiangbaotian.astemplate.services

import com.github.jiangbaotian.astemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

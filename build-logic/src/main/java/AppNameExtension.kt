package com.learningmate.app

import org.gradle.api.Project

fun Project.setNamespace(name: String) {
    androidExtension.apply {
        namespace = "com.learningmate.app.$name"
    }
}
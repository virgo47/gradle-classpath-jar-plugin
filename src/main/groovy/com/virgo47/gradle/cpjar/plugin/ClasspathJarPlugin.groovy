package com.virgo47.gradle.cpjar.plugin

import com.virgo47.gradle.cpjar.listener.JavaExecActionListener
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Adds JavaExec listener to Gradle project
 * @author Viswa Ramamoorthy
 */
class ClasspathJarPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        def ext = project.extensions.create("ClasspathJar", ClasspathJarPluginExtension)
        project.gradle.addListener(new JavaExecActionListener(extension: ext))
    }
}



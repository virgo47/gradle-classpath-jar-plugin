package com.virgo47.gradle.cpjar.plugin

import org.apache.tools.ant.taskdefs.condition.Os

/**
 * Extension class for ClasspathJarPlugin to provide parameter to customize.
 */
class ClasspathJarPluginExtension {

    boolean enableForAllOS = false

    def shouldApplyClasspathJar() {
        this.enableForAllOS || Os.isFamily(Os.FAMILY_WINDOWS)
    }
}



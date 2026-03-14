import gg.meza.stonecraft.mod

plugins {
    id("gg.meza.stonecraft")
}

modSettings {
    clientOptions {
        fov = 90
        guiScale = 3
        narrator = false
        darkBackground = true
        musicVolume = 0.0
    }

}

if (mod.isForge) {
    afterEvaluate {
        // Use findByName to avoid the crash if the task is missing
        tasks.findByName("net.fabricmc.devlaunchinjector.Main.main()")?.let { fabricTask ->
            fabricTask.dependsOn(tasks.named("generatePackMCMetaJson"))
        }
    }
}

java {
    withSourcesJar()
 //   withJavadocJar()
}

// Example of overriding publishing settings
publishMods {
    modrinth {
        if (mod.isFabric) requires("fabric-api")
    }

    curseforge {
        clientRequired = true // Set as needed
        serverRequired = false // Set as needed
        if (mod.isFabric) requires("fabric-api")
    }
}

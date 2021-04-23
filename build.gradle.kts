plugins {
    application
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("streams.App")
}

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "streams.App"
    }
}

val createZip = tasks.register<Zip>("createZip") {
    group = "build"
    description = "creates a zip file"

    archiveBaseName.set("myTask")
    from(projectDir.resolve("src/main"))
}

//publishing.publications.register<MavenPublication>("mavenJava") {
//    artifact(createZip)
//}

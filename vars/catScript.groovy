def call(Map config = [:]){
    def scriptcontents = libraryResource "org/${config.name}"
    scriptcontents.replace('<FIRST>',"${config.replacement}")
    writeFile file: "${config.name}", text: scriptcontents
    sh "ls"
}
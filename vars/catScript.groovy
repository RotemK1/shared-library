def call(Map config = [:]){
    def scriptcontents = libraryResource "org/${config.name}"
    scriptcontents.replace('<FIRST>',"${config.name}")
    writeFile file: "${config.name}", text: scriptcontents
    sh "cat scriptcontents"
}
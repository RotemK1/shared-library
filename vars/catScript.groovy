def call(Map config = [:]){
    def scriptcontents = libraryResource "org/${config.name}"
    scriptcontents.replace('<FIRST>',"${config.name}")
    sh "cat scriptcontents"
}
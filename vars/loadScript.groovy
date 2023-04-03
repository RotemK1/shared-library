def call(Map config = [:]){
    def scriptcontents = libraryResource "org/${config.name}"
    template.replace('<FIRST>',"${config.name}")
    sh "cat scriptcontents"
    //writeFile file: "${config.name}", text: scriptcontents
    // sh "chmod a+x ./${config.name}"
}
def call(Map config = [:]){
    def scriptcontents = libraryResource "org/${config.name}"
    sh "echo $config"
    scriptcontents = scriptcontents.replace('<REP-ONE>',"${config.replacement}")
    writeFile file: "${config.name}", text: scriptcontents
    sh "cat ${config.name}"
}
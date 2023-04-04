def call(Map config = [:]){
    sh "ls"
    def scriptcontents = libraryResource "org/${config.name}"
    sh "ls"
    sh "echo $config"
    scriptcontents = scriptcontents.replace('<REP-ONE>',"${config.replacement}")
    sh "ls"
    writeFile file: "${config.name}", text: scriptcontents
    sh "ls"
    sh "cat ${config.name}"
}
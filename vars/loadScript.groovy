def call(Map config = [:]){
    def request = libraryResource "org/${config.name}"
    writeFile file: "${config.name}", text: scriptcontents
    sh "chmod a+x ./${config.name}"
}
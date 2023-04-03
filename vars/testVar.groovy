def call(Map config = [:]){
    sh "echo hello ${config.name}, using ${config.script}"
    loadScript(name: "${config.script}")
    sh "./hello-world.sh ${config.name}"
}
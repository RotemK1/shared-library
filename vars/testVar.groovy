def call(Map config = [:]){
    sh "echo hello ${config.name}"
    loadScript(name: "${config.script}")
    sh "./hello-world.sh ${config.name}"
}
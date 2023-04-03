def call(Map config = [:]){
    sh "echo hello ${config.name}"
    // loadScript(name: 'hello-world.sh')
    // sh "./hello-world.sh ${config.name}"
}

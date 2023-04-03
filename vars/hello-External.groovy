def call(Map config = [:]){
    loadScript(name: 'hello-world.sh')
    sh "./hello-world.sh ${config.name}"
}

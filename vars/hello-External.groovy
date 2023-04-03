def call(String name = 'name') {
    loadScript(name: 'hello-world.sh')
    sh "./hello-world.sh ${name}"
}

def call(Map config = [:]){
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    justEcho(build: "${config.build}")
                }
            }
        }
    }
}
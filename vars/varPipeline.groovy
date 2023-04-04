def call(Map config = [:]){
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    script{
                        
                        justEcho(currentBuild.getNumber())
                    }
                }
            }
        }
    }
}
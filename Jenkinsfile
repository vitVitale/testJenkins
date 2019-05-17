pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                withMaven(maven : 'maven_3.6.0') {
                    sh 'mvn clean'
                }
            }
        }
    }
}
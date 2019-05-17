pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                bat "echo 'This is a minimal pipeline.'"
                withMaven(maven : 'maven_3.6.0') {
                    bat 'mvn clean test'
                }
            }
        }
    }
}
pipeline {
    agent any

    stages {
        stage('Initial') {
            steps {
                bat "echo 'This is a minimal pipeline.'"
                withMaven(maven : 'maven_3.6.0') {
                    bat 'mvn clean'
                }
            }
        }
        stage('Test') {
            steps {
                bat "echo 'go to test it.'"
                withMaven(maven : 'maven_3.6.0') {
                    bat 'mvn test'
                }
            }
        }
        stage('Deploy') {
            steps {
                bat "echo 'This is place for deploy script'"
            }
        }
    }
}
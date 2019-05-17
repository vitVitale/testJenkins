pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                withMaven(maven : 'maven_3.6.0') {
                    sh 'mvn clean compile'
                }
            }
        }
        stage('Test') {
            steps {
                withMaven(maven : 'maven_3.6.0') {
                    sh 'mvn test'
                }
            }
        }
    }
}
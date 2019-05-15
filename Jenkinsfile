pipeline {
    agent any
    tools {
        maven 'maven_3.6.0'
        jdk 'jdk_1.8'
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn test'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}
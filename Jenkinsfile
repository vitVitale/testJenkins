pipeline {
    agent any
    tools {
        maven 'maven_3.6.0'
        jdk 'jdk_1.8'
    }
    stages {
        stage ('Initialize') {
            steps {

            }
        }
        stage ('Build') {
            steps {
                sh 'mvn clean install -Dtest=TestClazz'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}
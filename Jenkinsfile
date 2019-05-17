pipeline {
    agent any
    tools {
        maven 'maven_3.6.0'
        jdk 'jdk_1.8'
    }
    stages {
        stage('Initialize') {
            steps {
                def mvnHome = tool name: 'Maven_3.6.0_local', type: 'maven'
                sh "${mvnHome}/bin/mvn clean test"
            }
        }
    }
}
pipeline {
    agent any
    tools {
        maven 'maven_3.6.0'
        jdk 'jdk_1.8'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "JAVA_HOME = ${JAVA_HOME}"
                    
                '''
            }
        }
        stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'
            }
        }
    }
}
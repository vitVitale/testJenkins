pipeline {
    agent any

    stages {
        stage('InitialPreparing') {
            steps {
                bat "echo 'This is a minimal pipeline.'"
                withMaven(maven : 'maven_3.6.0') {
                    bat 'mvn clean'
                }
            }
        }
        stage('Build') {
            steps {
                bat "echo 'Lets build this sh*t.'"
                withMaven(maven : 'maven_3.6.0') {
                    bat 'mvn -Dmaven.test.skip=true package'
                }
            }
        }
        stage('Delivering') {
            steps {
                bat "echo 'We have to push our app to remote server'"

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
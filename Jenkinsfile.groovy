pipeline {
    agent any

    stages {
        stage('InitialPreparing') {
            steps {
                sh "echo 'This is a minimal pipeline.'"
                withMaven(maven : 'maven_3.6.0') {
                    sh 'mvn clean'
                }
            }
        }
        stage('Build') {
            steps {
                sh "echo 'Lets build this sh*t.'"
                withMaven(maven : 'maven_3.6.0') {
                    sh 'mvn -Dmaven.test.skip=true package'
                }
            }
        }
        stage('Delivering') {
            steps {
                sh "echo 'We have to push our app to remote server'"

            }
        }
        stage('Test') {
            steps {
                sh "echo 'go to test it.'"
                withMaven(maven : 'maven_3.6.0') {
                    sh 'mvn test'
                }
            }
        }
        stage('Deploy') {
            steps {
                sh "echo 'This is place for deploy script'"
            }
        }
    }
}
pipeline {
    agent any
    
    environment {
        PATH = "C:\\Windows\\System32;${env.PATH}"
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                bat 'mvn -B clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn -B test'
            }
        }
    }
}
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
                bat 'echo "Simulation du Build (Maven pas encore installé)"'
            }
        }
        stage('Test') {
            steps {
                bat 'echo "Simulation des Tests (Maven pas encore installé)"'
            }
        }
    }
}
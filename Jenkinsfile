pipeline {
    agent any
    stages {
        stage('Build'){
            steps{
                echo 'Build'
                //sh 'mvn -version'
            }
        }        
        stage('Test'){
            steps{
                sh 'mvn -version || true'
                junit '**/target/*.xml'
            }
        }
    } //end of stages
} //end of pipeline

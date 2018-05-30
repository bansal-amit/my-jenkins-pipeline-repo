pipeline {
    
    agent any
    stages {
        field username = "Jenkins"
        stage('Build'){
            steps{
                echo 'Build'
            }
        }        
        stage('Test'){
            steps{
                sh 'mvn -version || true'
                echo "Hello Mr. ${username}"
            }
        }
    } //end of stages
} //end of pipeline

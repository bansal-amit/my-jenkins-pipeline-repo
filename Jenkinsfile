pipeline {
    
    agent any
    stages {
        stage('Build'){
            steps{
                echo 'Build'
            }
        }        
        stage('Test'){
            steps{
                def username = "Jenkins"
                sh 'mvn -version || true'
                echo "Hello Mr. ${username}"
            }
        }
    } //end of stages
} //end of pipeline

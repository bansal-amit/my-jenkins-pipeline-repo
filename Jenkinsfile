pipeline {
    
    agent any
    stages {
        def username = "Jenkins"
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

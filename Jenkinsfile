pipeline {
    
    agent any
    stages {
        stage('Build'){
            steps{
                echo 'Build'
            }
        }        
        stage('Test'){
            def username = "Jenkins"
            steps{
                sh 'mvn -version || true'
                echo "Hello Mrs. ${username}"
            }
        }
    } //end of stages
} //end of pipeline

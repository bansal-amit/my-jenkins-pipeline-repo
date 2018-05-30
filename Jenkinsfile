pipeline {
    
    def username = "Jenkins"
    agent any
    stages {
        stage('Build'){
            steps{
                echo 'Build'
                username = "Testing"
            }
        }        
        stage('Test'){
            steps{
                sh 'mvn -version || true'
                echo "Hello Mr. ${Testing}"
            }
        }
    } //end of stages
} //end of pipeline

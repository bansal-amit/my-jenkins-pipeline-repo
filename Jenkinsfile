pipeline {
    agent any
    stages {
        def username = "Jenkins"
        
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

pipeline {
    
    agent any
    stages {
        stage('Example'){
            input{
                message "Should we continue?"
                ok "Yes, we should"
            }
            steps{
                echo "${BUILD_NUMBER}"
            }
        }
        stage('Build'){
            steps{
                echo 'Building'
                echo currentBuild.result
            }
        }
    } //end of stages
    post{
        success{
            echo 'Good going!'
        }
    }           
    } //end of pipeline

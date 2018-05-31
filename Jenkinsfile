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
                def username = 'Jenkins'
                echo 'Building'
                echo currentBuild.result
                echo 'Hello Mr. ${username}'
                echo "I said, Hello Mr. ${username}"
            }
        }
    } //end of stages
    post{
        success{
            echo 'Good going!'
        }
    }           
    } //end of pipeline

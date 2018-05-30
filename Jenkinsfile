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
        }           
    } //end of pipeline

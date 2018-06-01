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
                echo "${env.JOB_NAME}"
                //echo "${AWS_SECRET_KEY_ID}"
            }
        }
        stage('DEV Deploy'){
            echo "deployin to DEV tomcat"
        }
        stage('DEV Approve'){
            echo "Taking approval from DEV"
            timeout(time: 60,unit:'MINS'){
                input message: 'Do you want to deplo?', submitter:'admin'
            }
            }
        }
    }
    post{
        success{
            echo 'Good going!'
        }
    }          
    } //end of pipeline

pipeline {
    
    agent any
<<<<<<< HEAD
   
=======
    environment{
        //AWS_SECRET_KEY_ID = credentials('amitb1126@gmail.com')
    }
>>>>>>> 748dd6ca0e713b0161545531bf3830416b38a312
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
    }
    post{
        success{
            echo 'Good going!'
        }
    }          
    } //end of pipeline

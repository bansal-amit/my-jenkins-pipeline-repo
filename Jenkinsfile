pipeline {
    
    agent any
    parameters{
        string(name:Greeting,defaultValue:'Hello',description:'How should I greet the world?')
    }
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
            steps{
                echo "deployin to DEV tomcat"
                echo "${env.Greeting}"
            }
        }
        stage('DEV Approve'){
            steps{
                echo "Taking approval from DEV"
                timeout(time: 60,unit:'MINUTES'){
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

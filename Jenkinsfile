pipeline {
    
    agent none
    parameters {
        string(name:'Greeting' , defaultValue:'Hello' , description:'How should I greet the world?')
    }
    stages {
        stage('Example'){
            agent any
            input{
                message "Should we continue?"
                ok "Yes, we should"
            }
            steps{
                echo "${BUILD_NUMBER}"
                echo "testing integration"
            }
        }
        stage('Build'){
            agent any
            steps{
                echo 'Building'
                echo currentBuild.result
                echo "${env.JOB_NAME}"
                //echo "${AWS_SECRET_KEY_ID}"
            }
        }
        stage('Test on Linux'){
            agent {
                    label 'linux'
            }
            steps{
                echo "using linux agent"
                echo "deployin to DEV tomcat"
                params.Greeting = "Namaste"
                echo "${params.Greeting}"
            }
        }
        stage('Test on Windows'){
            agent {
                label 'windows'
            }
            steps{
                echo "on windows agent"
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

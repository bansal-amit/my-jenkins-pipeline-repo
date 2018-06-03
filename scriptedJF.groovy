//This is the scripted pipeline

#!groovy

node ('Builder'){
    stage('Build') {
        checkout scm
        echo 'Building....'
    }
    stage('Test') {
        echo 'Testing....'
    }
    stage('Deploy') {
        echo 'Deploying....'
        echo "Running ${env.BUILD_ID} on ${JENKINS_URL}"
    }
}
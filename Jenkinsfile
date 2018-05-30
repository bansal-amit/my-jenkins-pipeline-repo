pipeline {
    
    agent any
    stages {
        stage('Example'){
            input{
                message "Should we continue?"
                ok "Yes, we should."
                submitter "alice, bob"
                parameters{
                    name:'PERSON',defaultValue: 'Mr. Jenkins',description: 'Who should I say hello to?')
                }
                steps{
                    echo "Hello, ${PERSON}, nice to meet you."
                }
            }
        }        
        
    } //end of stages
} //end of pipeline

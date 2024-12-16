
def gv

pipeline {

    agent any
    parameters {
        
        choice(name: 'VERSION', choices: ['1.2.1', '1.2.2', '1.2.3'], description: 'Choose the Version from below:')
        booleanParam(name: 'VERIFIED', defaultValue: true, description: 'Compliance Verification')
    }
    stages {

        stage("init") {

            steps {
                script {
                    gv = load "script.groovy"
                }
            }

        }
        
        stage("build") {

            steps {
                script {
                    gv.buildFunction()
                }
               
            }

        }

        stage("test") {
            when {
                expression {
                    params.VERIFIED
                }
            }

            steps {
                script {
                    gv.testFunction()
                }
                
            }

        }

        stage("deploy") {

            steps {
                script {
                    gv.deployFunction()
                }

            }

        }

    }

}

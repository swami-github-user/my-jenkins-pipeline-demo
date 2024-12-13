pipeline {

    agent any
    parameters {
        
        choice(name: 'VERSION', choices: ['1.2.1', '1.2.2', '1.2.3'], description: 'Choose the Version from below:')
        booleanParam(name: 'VERIFIED', defaultValue: true, description: 'Compliance Verification')
    }
    stages {

        stage("build") {

            steps {
                echo 'in this stage we build the application'
            }

        }

        stage("test") {
            when {
                expression {
                    params.VERIFIED
                }
            }

            steps {
                echo 'In this stage we test our application which is compliance verified'
            }

        }

        stage("deploy") {

            steps {
                echo "In this stage we deploy our application with version ${params.VERSION}"

            }

        }

    }

}

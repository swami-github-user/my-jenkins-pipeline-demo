pipeline {

    agent any

    stages {

        stage("build") {

            steps {
                echo 'in this stage we build the application'
            }

        }

        stage("test1") {

            steps {
                echo 'In this stage we test our application'
            }

        }

        stage("deploy") {

            steps {
                echo 'In this stage we deploy our application'
            }

        }

    }

    post {

        always{

        }
        success{

        }
        failure{
            
        }
    }

}
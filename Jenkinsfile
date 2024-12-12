pipeline {

    agent any

    stages {

        stage("build") {

            steps {
                echo 'in this stage we build the application'
                nodejs('NodeJS-23.4.0'){
                    sh 'yarn install'
                }
            }

        }

        stage("test") {

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

}

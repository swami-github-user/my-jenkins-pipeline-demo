pipeline {

    agent any
    tools {
        gradle 'Gradle-8.11.1'
        
    }

    stages {

        stage("build") {

            steps {
                echo 'in this stage we build the application'
                sh './gradlew --version'
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

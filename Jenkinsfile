pipeline {

    agent any
    tools {
        gradle 'Gradle-6.2'
        
    }

    stages {

        stage("build") {

            steps {
                echo 'in this stage we build the application'
                sh './gradlew -v'
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

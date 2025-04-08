pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'Hello build'
            }
        }
        stage('test') {
            steps {
                echo 'Hello test'
            }
        }
        stage('deploy') {
            steps {
                echo 'Hello deploy'
            }
        }
       
    }
     post{
            failure{
                emailext body: 'summary', subject: 'summary report of jenkins', to: 'anujan0005@gmail.com'
            }
        }
}

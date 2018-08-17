pipeline {

  agent any
  tools {
        maven 'M3'
   }

    stages {
        stage ('Checkout') {
            steps {
                checkout scm
             }
        }
        stage ('Build') {
            steps {
              sh "echo ${env.JOB_NAME}"
              sh "echo ${env.NAME}"
                sh "mvn  clean install -DskipTests=true"
            }
        }
         stage ('Test') {
            steps {
                sh "mvn test"
            }
         }
           stage ('Deploy to cf') {
            steps {
              sh "cf login -a ${env.CF_API} -u ${env.CF_USERNAME} -p ${env.CF_PASSWORD} -o ${env.CF_ORG} -s ${env.CF_SPACE}"
              sh "cf apps"
              sh "cf push"
              sh 'cf logs product-nodejs-app --recent'
            }
        }
    }

}


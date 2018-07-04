pipeline {


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
                sh "mvn  clean install -DskipTests=true"
            }
        }
         stage ('Test') {
            steps {
                sh "mvn test"
            }
        }
    }

}

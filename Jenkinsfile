pipeline {
agent any
stages {
   stage('Checkout') {
       steps {
         echo "CheckOut"  
         git credentialsId: 'githubcred', url: 'https://github.com/ravinawale/helloworld.git', branch: 'main'
       }
    }
    stage('Build') {
        steps {
           echo "Build"      
           bat 'mvn -B -DskipTests clean package'
        }
    }
    stage('Test') {
        steps {
           echo "Test"    
           bat 'mvn test'
        }
    }
  }
}

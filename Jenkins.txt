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
    #stage('Sonar') {
       # steps {
           #echo "Sonar"     
          # bat 'mvn sonar:sonar -Dsonar.projectKey=HelloWorldJava \
		       # -Dsonar.projectName=HelloWorldJava \
		       # -Dsonar.host.url=http://localhost:9000 \
		       # -Dsonar.login=c5dbe56f2221f8e23b43db981e9decfcb9b1b9e5 \
		       # -Dsonar.java.coveragePlugin=jacoco \
                #-Dsonar.jacoco.reportPaths=target\\jacoco.exec'
                
	    #}
    #}
    #stage('Uploading artifacts to Jfrog') {
       # steps {
          # echo "Uploading artifacts to Jfrog"
          # bat 'mvn deploy'
       #}
    #}
    #stage('Deploy to Local') {
       # steps {
           #echo "Deploy To Local"
           #bat '%CATALINA_HOME%\\scripts\\TomcatService.bat start'
           #bat 'mvn tomcat7:redeploy -Dtomcaturl="http://localhost:9090/manager/text" -Dtomcatid=tomcat9'
        #}
   # }
  }
}

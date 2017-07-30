pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8'
      args '-v /Users/fiallega/.m2'
    }
    
  }
  stages {
    stage('hello') {
      steps {
        echo 'Hello'
      }
    }
    stage('build') {
      steps {
        sh '''echo PATH = ${PATH}
echo M2_HOME = ${M2_HOME}
mvn clean'''
      }
    }
    stage('bye') {
      steps {
        echo 'Good Bye'
      }
    }
  }
}
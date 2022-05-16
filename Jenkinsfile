pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		git 'https://github.com/subrata75/MTour'    
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
        stage('Release') {
            steps {
                echo 'Releasing....'
            }
        }
	}
}

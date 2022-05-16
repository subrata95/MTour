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
		git 'https://github.com/subrata75/MTour'      
            }
        }
        stage('Release') {
            steps {
                echo 'Releasing....'
		git 'https://github.com/subrata75/MTour'      
            }
        }
	}
}

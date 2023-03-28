def call(Map config = [:]) {
    withSonarQubeEnv(credentialsId: 'sonar-token') {
    // some block
    sh 'mvn clean package sonar:sonar
    echo "sonar quality check"
    }
}

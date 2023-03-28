def call(Map config = [:]) {
    waitForQualityGate abortPipeline: false, credentialsId: 'sonar-token'
}

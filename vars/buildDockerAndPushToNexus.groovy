def call (Map config=[:]) {
    sh "ls -l"
    sh '''
    docker build -t 192.168.56.1:8083/springapp:${VERSION} .
    docker login -u admin -p admin 192.168.56.1:8083
    docker push 192.168.56.1:8083/springapp:${VERSION}
    docker rmi 192.168.56.1:8083/springapp:${VERSION}
}

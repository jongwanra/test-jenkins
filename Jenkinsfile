pipeline {
    // 어떤 Jenkins를 쓸껀지
    agent any

    triggers {
        // 2분 주기로 확인 Git 변경사항 확인
        pollSCM('*/2 * * * *')
    }

    stages {
        stage('Source') {
            steps {
                git branch: 'main', credentialsId: 'jongwanra', url: 'https://github.com/jongwanra/test-jenkins'
                echo 'Hello World'
            }
        }

        stage('Gradle Build') {
            steps {
                echo 'Gradle Build!'
                sh './gradlew build'
                echo 'Gradle Build Finished!'
            }
        }

        stage('Restart Application') {
            steps {
                script {
                    // 현재 실행 중인 애플리케이션 프로세스 중지
                    sh 'pkill -f "java -jar /var/lib/jenkins/workspace/test-pipeline/build/libs/demo-0.0.1-SNAPSHOT.jar" || true'

                    // nohup으로 애플리케이션 실행 (예시: myapp.jar)
                    // https://jellybeanz.medium.com/jenkins-pipeline-background-process-82af369e0e2d
                    // https://kjw1313.tistory.com/84
                    sh 'JENKINS_NODE_COOKIE=dontKillMe && nohup java -jar /var/lib/jenkins/workspace/test-pipeline/build/libs/demo-0.0.1-SNAPSHOT.jar &'
                }
            }
        }
    }
}
pipelineJob('selenium') {
    parameters {
        stringParam('backendDockerTag', 'latest', 'Backend docker image tag')
        stringParam('frontendDockerTag', 'latest', 'Frontend docker image tag')
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/KoRnZYSIEK/np-app")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
pipelineJob('deploy') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/KoRnZYSIEK/np-app")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile_azure')
                }
            }
        }
    }
}

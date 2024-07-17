FROM jenkins/ssh-agent:5.12.0-jdk17
ENV DEBIAN_FRONTEND noninteractive
USER root 
RUN apt-get update && apt-get install -y curl git python3 python3-pip wget gradle
# Group ID is taken from the group ID set on host.
RUN groupadd -g 997 docker && usermod -aG docker jenkins
RUN curl -fsSL https://get.docker.com/ | sh
RUN curl -L "https://github.com/docker/compose/releases/download/1.29.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose && chmod +x /usr/local/bin/docker-compose
RUN curl -sL https://aka.ms/InstallAzureCLIDeb | bash

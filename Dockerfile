FROM payara/server-web

COPY target/PayaraFullDocker.war /opt/payara41/glassfish/domains/domain1/autodeploy


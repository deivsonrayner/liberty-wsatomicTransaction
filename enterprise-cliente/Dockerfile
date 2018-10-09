FROM websphere-liberty:javaee7
ENV KEYSTORE_REQUIRED "false"

COPY liberty/config/server.xml /config/server.xml
COPY target/mock-enterprise-client.ear /config/apps/mock-enterprise-client.ear
COPY liberty/config/server.env /config/server.env


#FEATURES: Install any features that are required
#RUN apt-get update && apt-get dist-upgrade -y && apt-get install -y \
#&& rm -rf /var/lib/apt/lists/*
RUN /opt/ibm/wlp/bin/installUtility install  --acceptLicense \
	mpJwt-1.0 \
	mpRestClient-1.0 \
	apiDiscovery-1.0 \
	adminCenter-1.0 \
	wsAtomicTransaction-1.2 \
	mpConfig-1.2; exit 0



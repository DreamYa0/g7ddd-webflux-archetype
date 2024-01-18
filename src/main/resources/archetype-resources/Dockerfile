FROM xxxx
MAINTAINER xxxx
COPY  build/libs/${rootArtifactId}.jar .
ENTRYPOINT exec java -server -Xmx4G -XX:+UnlockExperimentalVMOptions -XX:+UseZGC -XX:ConcGCThreads=4 -XX:ParallelGCThreads=8 --add-opens java.base/java.lang=ALL-UNNAMED -jar ${rootArtifactId}.jar
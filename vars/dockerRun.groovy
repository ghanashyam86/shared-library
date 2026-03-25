def call(String containerName, String imageName, String portMapping) {

    echo "Running docker container: ${containerName}"

     // stop and remove existing container
     sh "docker rm -f ${containerName} || true"

     //run new container
     sh "docker run -itd -p ${portMapping} --name ${containerName} ${imageName}"
}



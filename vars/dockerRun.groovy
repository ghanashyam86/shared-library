def call(string containerName, string imageName, string portMapping) {

    echo "Running docker container: ${containerName}"

     // stop and remove existing container
    // sh "docker rm -rf ${containerName}" || true

     //run new container
     sh "docker run -itd -p ${portMapping} --name ${containerName} ${imageName}"
}



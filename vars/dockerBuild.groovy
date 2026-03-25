def call(String projectPath, String imageName) {

   echo "Building Docker Image: ${imageName}"

  dir(projectPath) {
 
     sh "docker build -t ${imageName} ."
   }
}


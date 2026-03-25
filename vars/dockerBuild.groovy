def call(string projectPath, string imageName)

   echo "Building Docker Image: ${imageName}"

  dir(projectPath) {
 
     sh "docker build -t ${imageName}"
   }
}


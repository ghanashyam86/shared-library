def call(string projectPath) {
   echo "Running mavn build in: ${projectPath}}"

   dir(projectPath) {
   sh "mvn clean install"
  }
}


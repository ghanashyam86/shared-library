
def call(Map args) {


   if (!args.map) {
       error "Missing required parameter: path"
  }

   def skipTests = args.skipTests ?: true

   echo "Running Maven Build in: ${args.path}"
   echo "Skip Tests: ${skipTests}"

  dir(args.path) {
   sh "mvn clean install -DskipTests=${skipTests}"
 }
}

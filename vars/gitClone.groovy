
def call(String repoUrl) {
  echo "cloning repository: ${repoUrl}"

  dir('/mnt/') {
     sh 'rm -rf /mnt/hello-world-2'
     sh "git clone ${repoUrl}"
}
}


def call(Map args) {
   if (!args.repo) {
      error "Missing required parameter: repo"

      def target = args.target ?: "/mnt/project"
      def branch = args.branch ?: "main"

      echo "Cloning repository: ${args.repo}"
      echo "Branch: ${branch}"
      echo "Target Directory: ${target}"

     dir(target) {
       sh "rm -rf *"
       sh "git clone -b ${branch} ${args.repo} ."
  }
}

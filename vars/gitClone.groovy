def call(string repoUrl) {
  echo "Cloning repository: ${repoUrl}"

  dir('/mnt') {
    // sh 'rm -rf /mnt/hello-world-2'
     sh "git clone ${repoUrl}"

   }
}


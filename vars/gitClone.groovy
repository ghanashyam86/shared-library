
def call(String repoUrl) {
  echo "cloning repository: ${repoUrl}"

  dir('/mnt/') {
     sh 'rm -rf /mnt/hello-world-2'
     sh "git clone ${repoUrl}"
}

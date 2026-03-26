
def call(Map args) {
  def userName = args.name ?: "Guest"
  def environment = args.env ?: "uat"

  echo "User: ${userName}"
  echo "Environment: ${environment}"
}

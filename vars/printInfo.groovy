
def call(Map args) {
  def userName = args.name ?: "Guest"
  def environment = args.env ?: "qa"

  echo "User: ${userName}"
  echo "Environment: ${environment}"
}

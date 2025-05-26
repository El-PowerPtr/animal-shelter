import scala.util.matching.Regex
case class ServiceProvider(
    name: String,
    email: String,
    address: String,
    phone: Long
)

object ServiceProvider:
  def apply(
      name: String,
      email: String,
      address: String,
      phone: Long
  ): ServiceProvider =
    require(validateEmail(email), "Formato de correo inválido")
    ServiceProvider(name, email, address, phone)

def validateEmail(address: String): Boolean =
  val pattern: Regex =
    "((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W_])$".r
  pattern.matches(address)

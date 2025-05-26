import scala.util.matching.Regex

def validateEmail(address: String): Boolean =
  val pattern: Regex =
    "((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W_])$".r
  pattern.matches(address)

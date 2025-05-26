import java.sql.Date
import scala.util.matching.Regex
import scala.util.Failure

trait Contract:
  def price: Double
  def serviceProvider: ServiceProvider
  def responsableName: String
  def conciliationDate: Date
  def endDate: Date
  def startDate: Date

object Contract:
  def validDates(
      conciliationDate: Date,
      startDate: Date,
      endDate: Date
  ): Option[String] =
    if conciliationDate.compareTo(startDate) > 0 then
      Some(
        "La fecha de conciliación no puede ser posterior a la fecha de inicio"
      )
    else if startDate.compareTo(endDate) > 0 then
      Some(
        "La fecha de inicio no puede ser posterior a la fecha de terminación"
      )
    else None
  def validPrice(price: Double): Option[String] =
    if (price < 0) then Some("El valor del precio no puede ser menor que 0")
    else None

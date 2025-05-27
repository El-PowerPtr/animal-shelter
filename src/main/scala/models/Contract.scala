import java.sql.Date
import scala.util.matching.Regex
import scala.util.Failure

trait Contract(
    serviceProvider: ServiceProvider,
    responsableName: String,
    conciliationDate: Date,
    endDate: Date,
    startDate: Date,
    description: String,
    recharge: Double
):
  def price: Double

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

enum ServiceType:
  case Medical, Feeding, Other

case class Service(name: String, serviceType: ServiceType, basePrice: Double)

object Service:
  def apply(
      name: String,
      serviceType: ServiceType,
      basePrice: Double
  ): Service =
    require(basePrice >= 0, "El precio del servicio no puede ser negativo")
    Service(name, serviceType, basePrice)

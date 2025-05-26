case class Animal(
    name: String,
    specie: String,
    age: Int,
    weight: Double,
    daysInShelter: Int
)

object Animal:
  def apply(
      name: String,
      specie: String,
      age: Int,
      weight: Double,
      daysInShelter: Int
  ): Animal =
    require(age >= 0, "La edad del animal no puede ser negativa")
    require(
      daysInShelter >= 0,
      "La cantidad de días de estancia del animal no puede ser negativa"
    )
    require(weight > 0, "El peso del animal debe ser mayor que 0")
    Animal(name, specie, age, weight, daysInShelter)

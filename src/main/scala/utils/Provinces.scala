package utils.provinces

enum Province(val name: String):
  override def toString(): String = name

  case Camaguey extends Province("Camagüey")
  case CiegoDeAvila extends Province("Ciego de Ávila")
  case Cienfuegos extends Province("Cienfuegos")
  case LaHabana extends Province("La Habana")
  case Granma extends Province("Granma")
  case Guantanamo extends Province("Guantánamo")
  case Holguin extends Province("Holguín")
  case LasTunas extends Province("Tunas")
  case Matanzas extends Province("Matanzas")
  case PinarDelRio extends Province("Pinar del Río")
  case SanctiSpiritus extends Province("Sancti Spiritus")
  case SantiagoDeCuba extends Province("Santiago de Cuba")
  case VillaClara extends Province("Villa Clara")
  case Mayabeque extends Province("Mayabeque")
  case Artemisa extends Province("Artemisa")

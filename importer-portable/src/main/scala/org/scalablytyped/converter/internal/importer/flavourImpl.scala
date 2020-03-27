package org.scalablytyped.converter.internal.importer

import org.scalablytyped.converter.Flavour
import org.scalablytyped.converter.internal.scalajs.Name
import org.scalablytyped.converter.internal.scalajs.flavours.{FlavourImpl, SlinkyFlavour}

object flavourImpl {
  def apply(
      flavour:                  Flavour,
      shouldUseScalaJsDomTypes: Boolean,
      outputPackage:            Name,
  ): FlavourImpl =
    flavour match {
      case Flavour.Normal =>
        FlavourImpl.Normal(
          shouldGenerateComponents = true,
          shouldUseScalaJsDomTypes = shouldUseScalaJsDomTypes,
          outputPkg                = outputPackage,
        )
      case Flavour.Slinky =>
        SlinkyFlavour(outputPkg = outputPackage)
      case Flavour.SlinkyNative =>
        FlavourImpl.SlinkyNative(outputPkg = outputPackage)
      case Flavour.Japgolly =>
        FlavourImpl.Japgolly(outputPkg = outputPackage)
    }

  def fromInput(co: ConversionOptions): FlavourImpl =
    apply(co.flavour, co.useScalaJsDomTypes, co.outputPackage)
}

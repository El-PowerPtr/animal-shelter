val scala3Version = "3.7.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Gesti�n de Refugio de Animales",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= {
      // Determine OS version of JavaFX binaries
      lazy val osName = System.getProperty("os.name") match {
        case n if n.startsWith("Linux")   => "linux"
        case n if n.startsWith("Mac")     => "mac"
        case n if n.startsWith("Windows") => "win"
        case _ => throw new Exception("Unknown platform!")
      }
      Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
        .map(m => "org.openjfx" % s"javafx-$m" % "16" classifier osName)
    },
    libraryDependencies ++= Seq(
      "org.scalafx" %% "scalafx" % "16.0.0-R24",
      "com.augustnagro" %% "magnum" % "1.3.1",
      "org.postgresql" % "postgresql" % "42.7.5",
      "net.sf.jasperreports" % "jasperreports" % "7.0.3",
      "com.zaxxer" % "HikariCP" % "6.3.0"
    )
  )

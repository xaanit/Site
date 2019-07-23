package it.xaan.site

import io.javalin.Javalin
import io.javalin.http.staticfiles.Location

object Main {
  def main(args: Array[String]): Unit = {
    Javalin.create { cfg =>
      cfg.defaultContentType = "application/json"
      cfg.addStaticFiles("./site", Location.EXTERNAL)
      cfg.prefer405over404 = true
    }.routes(() => {})
      .start(8080)
  }
}

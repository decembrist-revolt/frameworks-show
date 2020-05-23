// @GENERATOR:play-routes-compiler
// @SOURCE:C:/projects/framework-show/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Sat May 23 20:03:15 MSK 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

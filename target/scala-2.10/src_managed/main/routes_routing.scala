// @SOURCE:C:/Users/Nicolas/Documents/playProject/conf/routes
// @HASH:1751fcf7a9ef22db38ea19d4aceb724d2ea7f3c2
// @DATE:Tue Feb 11 20:35:59 CET 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_ConvEnRomain_blank1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("romain"))))
        

// @LINE:10
private[this] lazy val controllers_ConvEnRomain_submit2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("romain"))))
        

// @LINE:13
private[this] lazy val controllers_ConvEnDecimal_blank3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("decimal"))))
        

// @LINE:14
private[this] lazy val controllers_ConvEnDecimal_submit4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("decimal"))))
        

// @LINE:17
private[this] lazy val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """romain""","""controllers.ConvEnRomain.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """romain""","""controllers.ConvEnRomain.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """decimal""","""controllers.ConvEnDecimal.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """decimal""","""controllers.ConvEnDecimal.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_ConvEnRomain_blank1(params) => {
   call { 
        invokeHandler(controllers.ConvEnRomain.blank(), HandlerDef(this, "controllers.ConvEnRomain", "blank", Nil,"GET", """ Convertisseur de nombre décimal en nombre romain""", Routes.prefix + """romain"""))
   }
}
        

// @LINE:10
case controllers_ConvEnRomain_submit2(params) => {
   call { 
        invokeHandler(controllers.ConvEnRomain.submit(), HandlerDef(this, "controllers.ConvEnRomain", "submit", Nil,"POST", """""", Routes.prefix + """romain"""))
   }
}
        

// @LINE:13
case controllers_ConvEnDecimal_blank3(params) => {
   call { 
        invokeHandler(controllers.ConvEnDecimal.blank(), HandlerDef(this, "controllers.ConvEnDecimal", "blank", Nil,"GET", """ Convertisseur de nombre romain en nombre décimal""", Routes.prefix + """decimal"""))
   }
}
        

// @LINE:14
case controllers_ConvEnDecimal_submit4(params) => {
   call { 
        invokeHandler(controllers.ConvEnDecimal.submit(), HandlerDef(this, "controllers.ConvEnDecimal", "submit", Nil,"POST", """""", Routes.prefix + """decimal"""))
   }
}
        

// @LINE:17
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     
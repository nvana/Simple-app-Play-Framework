// @SOURCE:C:/Users/Nicolas/Documents/playProject/conf/routes
// @HASH:1751fcf7a9ef22db38ea19d4aceb724d2ea7f3c2
// @DATE:Tue Feb 11 20:35:59 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:10
// @LINE:9
class ReverseConvEnRomain {
    

// @LINE:9
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "romain")
}
                                                

// @LINE:10
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "romain")
}
                                                
    
}
                          

// @LINE:14
// @LINE:13
class ReverseConvEnDecimal {
    

// @LINE:13
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "decimal")
}
                                                

// @LINE:14
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "decimal")
}
                                                
    
}
                          

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:10
// @LINE:9
class ReverseConvEnRomain {
    

// @LINE:9
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConvEnRomain.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "romain"})
      }
   """
)
                        

// @LINE:10
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConvEnRomain.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "romain"})
      }
   """
)
                        
    
}
              

// @LINE:14
// @LINE:13
class ReverseConvEnDecimal {
    

// @LINE:13
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConvEnDecimal.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "decimal"})
      }
   """
)
                        

// @LINE:14
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ConvEnDecimal.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "decimal"})
      }
   """
)
                        
    
}
              

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:10
// @LINE:9
class ReverseConvEnRomain {
    

// @LINE:9
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ConvEnRomain.blank(), HandlerDef(this, "controllers.ConvEnRomain", "blank", Seq(), "GET", """ Convertisseur de nombre décimal en nombre romain""", _prefix + """romain""")
)
                      

// @LINE:10
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ConvEnRomain.submit(), HandlerDef(this, "controllers.ConvEnRomain", "submit", Seq(), "POST", """""", _prefix + """romain""")
)
                      
    
}
                          

// @LINE:14
// @LINE:13
class ReverseConvEnDecimal {
    

// @LINE:13
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ConvEnDecimal.blank(), HandlerDef(this, "controllers.ConvEnDecimal", "blank", Seq(), "GET", """ Convertisseur de nombre romain en nombre décimal""", _prefix + """decimal""")
)
                      

// @LINE:14
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ConvEnDecimal.submit(), HandlerDef(this, "controllers.ConvEnDecimal", "submit", Seq(), "POST", """""", _prefix + """decimal""")
)
                      
    
}
                          

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    
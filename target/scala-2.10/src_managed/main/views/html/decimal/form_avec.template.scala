
package views.html.decimal

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object form_avec extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[NombreRomain],String,Int,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(formulaire: Form[NombreRomain], romain: String, decimal: Int):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.64*/("""

"""),_display_(Seq[Any](/*3.2*/form(formulaire)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    <div class="alert-message info">
      """),_display_(Seq[Any](/*5.8*/romain)),format.raw/*5.14*/(""" = """),_display_(Seq[Any](/*5.18*/decimal)),format.raw/*5.25*/("""
    </div>
""")))})),format.raw/*7.2*/("""
"""))}
    }
    
    def render(formulaire:Form[NombreRomain],romain:String,decimal:Int): play.api.templates.HtmlFormat.Appendable = apply(formulaire,romain,decimal)
    
    def f:((Form[NombreRomain],String,Int) => play.api.templates.HtmlFormat.Appendable) = (formulaire,romain,decimal) => apply(formulaire,romain,decimal)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 11 20:36:00 CET 2014
                    SOURCE: C:/Users/Nicolas/Documents/playProject/app/views/decimal/form_avec.scala.html
                    HASH: 5354f495683da362f5e4e6d39bf049e0f64a5397
                    MATRIX: 809->1|965->63|1002->66|1026->82|1065->84|1144->129|1171->135|1210->139|1238->146|1281->159
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|35->7
                    -- GENERATED --
                */
            
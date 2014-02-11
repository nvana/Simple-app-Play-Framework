
package views.html.romain

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
object form_avec extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[NombreDecimal],Int,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(formulaire: Form[NombreDecimal], decimal: Int, romain: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.65*/("""

"""),_display_(Seq[Any](/*3.2*/form(formulaire)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
    <div class="alert-message info">
      """),_display_(Seq[Any](/*5.8*/decimal)),format.raw/*5.15*/(""" = """),_display_(Seq[Any](/*5.19*/romain)),format.raw/*5.25*/("""
    </div>
""")))})),format.raw/*7.2*/("""
"""))}
    }
    
    def render(formulaire:Form[NombreDecimal],decimal:Int,romain:String): play.api.templates.HtmlFormat.Appendable = apply(formulaire,decimal,romain)
    
    def f:((Form[NombreDecimal],Int,String) => play.api.templates.HtmlFormat.Appendable) = (formulaire,decimal,romain) => apply(formulaire,decimal,romain)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 11 20:36:00 CET 2014
                    SOURCE: C:/Users/Nicolas/Documents/playProject/app/views/romain/form_avec.scala.html
                    HASH: 7ff24fbd9f6c03a1398ca1814d8408a74640188b
                    MATRIX: 809->1|966->64|1003->67|1027->83|1066->85|1145->130|1173->137|1212->141|1239->147|1282->160
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|35->7
                    -- GENERATED --
                */
            
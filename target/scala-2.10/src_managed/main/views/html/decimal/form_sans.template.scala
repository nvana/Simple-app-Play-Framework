
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
object form_sans extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[NombreRomain],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(formulaire: Form[NombreRomain]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),_display_(Seq[Any](/*3.2*/form(formulaire)/*3.18*/(Html("")))),format.raw/*3.28*/("""
"""))}
    }
    
    def render(formulaire:Form[NombreRomain]): play.api.templates.HtmlFormat.Appendable = apply(formulaire)
    
    def f:((Form[NombreRomain]) => play.api.templates.HtmlFormat.Appendable) = (formulaire) => apply(formulaire)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 11 20:36:00 CET 2014
                    SOURCE: C:/Users/Nicolas/Documents/playProject/app/views/decimal/form_sans.scala.html
                    HASH: 6ab4fa79cb56b34492eab2cf40b315b2bf32fb9f
                    MATRIX: 798->1|924->33|961->36|985->52|1016->62
                    LINES: 26->1|29->1|31->3|31->3|31->3
                    -- GENERATED --
                */
            

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
object form_sans extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[NombreDecimal],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(formulaire: Form[NombreDecimal]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.35*/("""

"""),_display_(Seq[Any](/*3.2*/form(formulaire)/*3.18*/(Html("")))),format.raw/*3.28*/("""
"""))}
    }
    
    def render(formulaire:Form[NombreDecimal]): play.api.templates.HtmlFormat.Appendable = apply(formulaire)
    
    def f:((Form[NombreDecimal]) => play.api.templates.HtmlFormat.Appendable) = (formulaire) => apply(formulaire)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 11 20:36:00 CET 2014
                    SOURCE: C:/Users/Nicolas/Documents/playProject/app/views/romain/form_sans.scala.html
                    HASH: 8763a4b6fee56d2474f0642e68060835780b1b60
                    MATRIX: 798->1|925->34|962->37|986->53|1017->63
                    LINES: 26->1|29->1|31->3|31->3|31->3
                    -- GENERATED --
                */
            
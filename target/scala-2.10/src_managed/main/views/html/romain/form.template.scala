
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
object form extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[NombreDecimal],Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(formulaire: Form[NombreDecimal])(reponse: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
    décimal en romain
""")))};
Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "romain")/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""

    """),_display_(Seq[Any](/*12.6*/if(formulaire.hasErrors)/*12.30*/ {_display_(Seq[Any](format.raw/*12.32*/("""
        <div class="alert-message error">
            <p>Corrigez cette erreur que je ne saurais voir!<br>
	      Par de pareils objets les âmes sont blessées,<br>
	      Et cela fait venir de coupables pensées!</p>
        </div>
    """)))})),format.raw/*18.6*/("""

    """),_display_(Seq[Any](/*20.6*/reponse)),format.raw/*20.13*/("""

    """),_display_(Seq[Any](/*22.6*/helper/*22.12*/.form(action = routes.ConvEnRomain.submit)/*22.54*/ {_display_(Seq[Any](format.raw/*22.56*/("""
	"""),_display_(Seq[Any](/*23.3*/inputText(
	    formulaire("valeur"),
	    '_label -> "Valeur",
	    '_help  -> "Entrez un entier > 0"
	))),format.raw/*27.3*/("""
        
        <div class="actions">
            <input type="submit" class="btn primary" value="Convertir">
        </div>
    """)))})),format.raw/*32.6*/("""

""")))})),format.raw/*34.2*/("""
"""))}
    }
    
    def render(formulaire:Form[NombreDecimal],reponse:Html): play.api.templates.HtmlFormat.Appendable = apply(formulaire)(reponse)
    
    def f:((Form[NombreDecimal]) => (Html) => play.api.templates.HtmlFormat.Appendable) = (formulaire) => (reponse) => apply(formulaire)(reponse)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 11 20:36:00 CET 2014
                    SOURCE: C:/Users/Nicolas/Documents/playProject/app/views/romain/form.scala.html
                    HASH: 66b85e85b9199a01a611e92dd8c737ba671c0bfe
                    MATRIX: 798->1|973->104|985->109|1069->113|1132->49|1160->102|1187->137|1225->140|1261->167|1301->169|1343->176|1376->200|1416->202|1684->439|1726->446|1755->453|1797->460|1812->466|1863->508|1903->510|1941->513|2067->618|2230->750|2264->753
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|43->12|49->18|51->20|51->20|53->22|53->22|53->22|53->22|54->23|58->27|63->32|65->34
                    -- GENERATED --
                */
            
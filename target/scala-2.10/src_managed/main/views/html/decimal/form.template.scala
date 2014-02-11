
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
object form extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[NombreRomain],Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(formulaire: Form[NombreRomain])(reponse: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
    Saisissez vos résultats à la belotte ! 
""")))};
Seq[Any](format.raw/*1.49*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "decimal")/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""

    """),_display_(Seq[Any](/*12.6*/if(formulaire.hasErrors)/*12.30*/ {_display_(Seq[Any](format.raw/*12.32*/("""
        <div class="alert-message error">
            <p>Corrigez cette erreur que je ne saurais voir!<br>
	      Par de pareils objets les âmes sont blessées,<br>
	      Et cela fait venir de coupables pensées!</p>
        </div>
    """)))})),format.raw/*18.6*/("""

    """),_display_(Seq[Any](/*20.6*/reponse)),format.raw/*20.13*/("""

    """),_display_(Seq[Any](/*22.6*/helper/*22.12*/.form(action = routes.ConvEnDecimal.submit)/*22.55*/ {_display_(Seq[Any](format.raw/*22.57*/("""
    <table BORDER="1 solid black">
        <tr>
        <td>
            <p> Couleur </p>
        </td>
            <td>
	"""),_display_(Seq[Any](/*29.3*/inputText(
	    formulaire("As"),
	    '_label -> "As"
	))),format.raw/*32.3*/("""
            </td>
            <td>

    """),_display_(Seq[Any](/*36.6*/inputText(
        formulaire("Dix"),
        '_label -> "Dix"
      
    ))),format.raw/*40.6*/("""
        </td>
            <td>

    """),_display_(Seq[Any](/*44.6*/inputText(
        formulaire("Roi"),
        '_label -> "Roi"
      
    ))),format.raw/*48.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*52.6*/inputText(
        formulaire("Dame"),
        '_label -> "Dame"
       
    ))),format.raw/*56.6*/("""
    </td>
            <td>
    """),_display_(Seq[Any](/*59.6*/inputText(
        formulaire("Valet"),
        '_label -> "Valet"
      
    ))),format.raw/*63.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*67.6*/inputText(
        formulaire("9"),
        '_label -> "9"
    
    ))),format.raw/*71.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*75.6*/inputText(
        formulaire("8"),
        '_label -> "8"
     
    ))),format.raw/*79.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*83.6*/inputText(
        formulaire("7"),
        '_label -> "7"
      
    ))),format.raw/*87.6*/("""
    </td>
            
        </tr>

          <tr>
        <td>
            <p> Atout </p>
        </td>
            <td>
    """),_display_(Seq[Any](/*97.6*/inputText(
        formulaire("As"),
        '_label -> "As"
    ))),format.raw/*100.6*/("""
            </td>
            <td>

    """),_display_(Seq[Any](/*104.6*/inputText(
        formulaire("Dix"),
        '_label -> "Dix"
      
    ))),format.raw/*108.6*/("""
        </td>
            <td>

    """),_display_(Seq[Any](/*112.6*/inputText(
        formulaire("Roi"),
        '_label -> "Roi"
      
    ))),format.raw/*116.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*120.6*/inputText(
        formulaire("Dame"),
        '_label -> "Dame"
       
    ))),format.raw/*124.6*/("""
    </td>
            <td>
    """),_display_(Seq[Any](/*127.6*/inputText(
        formulaire("Valet"),
        '_label -> "Valet"
      
    ))),format.raw/*131.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*135.6*/inputText(
        formulaire("9"),
        '_label -> "9"
    
    ))),format.raw/*139.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*143.6*/inputText(
        formulaire("8"),
        '_label -> "8"
     
    ))),format.raw/*147.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*151.6*/inputText(
        formulaire("7"),
        '_label -> "7"
      
    ))),format.raw/*155.6*/("""
    </td>
            
        </tr>
    </table>
        
        <div class="actions">
            <input type="submit" class="btn primary" value="Convertir">
        </div>
    """)))})),format.raw/*164.6*/("""

""")))})),format.raw/*166.2*/("""
"""))}
    }
    
    def render(formulaire:Form[NombreRomain],reponse:Html): play.api.templates.HtmlFormat.Appendable = apply(formulaire)(reponse)
    
    def f:((Form[NombreRomain]) => (Html) => play.api.templates.HtmlFormat.Appendable) = (formulaire) => (reponse) => apply(formulaire)(reponse)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 11 21:13:32 CET 2014
                    SOURCE: C:/Users/Nicolas/Documents/playProject/app/views/decimal/form.scala.html
                    HASH: cad0727b3a3ce6c898b483e6a35e5bccf4ac637c
                    MATRIX: 798->1|972->103|984->108|1068->112|1153->48|1181->101|1208->158|1246->161|1283->189|1323->191|1365->198|1398->222|1438->224|1706->461|1748->468|1777->475|1819->482|1834->488|1886->531|1926->533|2085->657|2163->714|2240->756|2336->831|2409->869|2505->944|2574->978|2673->1056|2741->1089|2841->1168|2910->1202|3000->1271|3069->1305|3160->1375|3229->1409|3321->1480|3486->1610|3574->1676|3652->1718|3749->1793|3823->1831|3920->1906|3990->1940|4090->2018|4159->2051|4260->2130|4330->2164|4421->2233|4491->2267|4583->2337|4653->2371|4746->2442|4960->2624|4995->2627
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|43->12|49->18|51->20|51->20|53->22|53->22|53->22|53->22|60->29|63->32|67->36|71->40|75->44|79->48|83->52|87->56|90->59|94->63|98->67|102->71|106->75|110->79|114->83|118->87|128->97|131->100|135->104|139->108|143->112|147->116|151->120|155->124|158->127|162->131|166->135|170->139|174->143|178->147|182->151|186->155|195->164|197->166
                    -- GENERATED --
                */
            
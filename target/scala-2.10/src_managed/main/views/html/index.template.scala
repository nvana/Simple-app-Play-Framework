
package views.html

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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Hello],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(helloForm: Form[Application.Hello]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(title = "The 'helloworld' application")/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
    
    <h1>Configure your 'Hello world':</h1>
    
    """),_display_(Seq[Any](/*9.6*/form(action = routes.Application.sayHello, args = 'id -> "helloform")/*9.75*/ {_display_(Seq[Any](format.raw/*9.77*/("""
        
        
<table BORDER="1 solid black">
        <tr>
        <td>
            <p> Couleur </p>
        </td>
            <td>
    """),_display_(Seq[Any](/*18.6*/inputText(
        helloForm("as"),
        '_label -> "As"
    ))),format.raw/*21.6*/("""
            </td>
            <td>

    """),_display_(Seq[Any](/*25.6*/inputText(
        helloForm("Dix"),
        '_label -> "Dix"
      
    ))),format.raw/*29.6*/("""
        </td>
            <td>

    """),_display_(Seq[Any](/*33.6*/inputText(
        helloForm("Roi"),
        '_label -> "Roi"
      
    ))),format.raw/*37.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*41.6*/inputText(
        helloForm("Dame"),
        '_label -> "Dame"
       
    ))),format.raw/*45.6*/("""
    </td>
            <td>
    """),_display_(Seq[Any](/*48.6*/inputText(
        helloForm("Valet"),
        '_label -> "Valet"
      
    ))),format.raw/*52.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*56.6*/inputText(
        helloForm("9"),
        '_label -> "9"
    
    ))),format.raw/*60.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*64.6*/inputText(
        helloForm("8"),
        '_label -> "8"
     
    ))),format.raw/*68.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*72.6*/inputText(
        helloForm("7"),
        '_label -> "7"
      
    ))),format.raw/*76.6*/("""
    </td>
            
        </tr>

          <tr>
        <td>
            <p> Atout </p>
        </td>
            <td>
    """),_display_(Seq[Any](/*86.6*/inputText(
        helloForm("AsA"),
        '_label -> "As"
    ))),format.raw/*89.6*/("""
            </td>
            <td>

    """),_display_(Seq[Any](/*93.6*/inputText(
        helloForm("DixA"),
        '_label -> "Dix"
      
    ))),format.raw/*97.6*/("""
        </td>
            <td>

    """),_display_(Seq[Any](/*101.6*/inputText(
        helloForm("RoiA"),
        '_label -> "Roi"
      
    ))),format.raw/*105.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*109.6*/inputText(
        helloForm("DameA"),
        '_label -> "Dame"
       
    ))),format.raw/*113.6*/("""
    </td>
            <td>
    """),_display_(Seq[Any](/*116.6*/inputText(
        helloForm("ValetA"),
        '_label -> "Valet"
      
    ))),format.raw/*120.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*124.6*/inputText(
        helloForm("9A"),
        '_label -> "9"
    
    ))),format.raw/*128.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*132.6*/inputText(
        helloForm("8A"),
        '_label -> "8"
     
    ))),format.raw/*136.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*140.6*/inputText(
        helloForm("7A"),
        '_label -> "7"
      
    ))),format.raw/*144.6*/("""
    </td>
            
        </tr>
    </table>
        
        
        <p class="buttons">
            <input type="submit">
        <p>
        
    """)))})),format.raw/*155.6*/("""
    
""")))})))}
    }
    
    def render(helloForm:Form[Application.Hello]): play.api.templates.HtmlFormat.Appendable = apply(helloForm)
    
    def f:((Form[Application.Hello]) => play.api.templates.HtmlFormat.Appendable) = (helloForm) => apply(helloForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Wed Feb 12 21:17:34 CET 2014
                    SOURCE: C:/Users/Nicolas/Documents/playProject/app/views/index.scala.html
=======
                    DATE: Wed Feb 12 21:28:14 CET 2014
                    SOURCE: C:/Users/Oriana/Documents/playProject/app/views/index.scala.html
>>>>>>> 6a57673923a2a6bf76cabf02457638b20a8a10b9
                    HASH: 9490738a65e957dd1537dfc934501a26e9170096
                    MATRIX: 791->1|937->37|965->56|1001->58|1053->102|1092->104|1185->163|1262->232|1301->234|1477->375|1563->440|1640->482|1735->556|1808->594|1903->668|1972->702|2070->779|2138->812|2237->890|2306->924|2395->992|2464->1026|2554->1095|2623->1129|2714->1199|2879->1329|2966->1395|3043->1437|3139->1512|3213->1550|3310->1625|3380->1659|3480->1737|3549->1770|3650->1849|3720->1883|3811->1952|3881->1986|3973->2056|4043->2090|4136->2161|4325->2318
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|46->18|49->21|53->25|57->29|61->33|65->37|69->41|73->45|76->48|80->52|84->56|88->60|92->64|96->68|100->72|104->76|114->86|117->89|121->93|125->97|129->101|133->105|137->109|141->113|144->116|148->120|152->124|156->128|160->132|164->136|168->140|172->144|183->155
                    -- GENERATED --
                */
            
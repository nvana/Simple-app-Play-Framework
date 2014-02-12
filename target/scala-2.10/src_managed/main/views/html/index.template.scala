
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
        
        """),_display_(Seq[Any](/*11.10*/inputText(
            field = helloForm("name"),
            args = '_label -> "What's your name?", 'placeholder -> "World"
        ))),format.raw/*14.10*/("""
        
        """),_display_(Seq[Any](/*16.10*/inputText(
            field = helloForm("repeat"),
            args = '_label -> "How many times?", 'size -> 3, 'placeholder -> 10
        ))),format.raw/*19.10*/("""
        
<table BORDER="1 solid black">
        <tr>
        <td>
            <p> Couleur </p>
        </td>
            <td>
    """),_display_(Seq[Any](/*27.6*/inputText(
        helloForm("as"),
        '_label -> "As"
    ))),format.raw/*30.6*/("""
            </td>
            <td>

    """),_display_(Seq[Any](/*34.6*/inputText(
        helloForm("Dix"),
        '_label -> "Dix"
      
    ))),format.raw/*38.6*/("""
        </td>
            <td>

    """),_display_(Seq[Any](/*42.6*/inputText(
        helloForm("Roi"),
        '_label -> "Roi"
      
    ))),format.raw/*46.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*50.6*/inputText(
        helloForm("Dame"),
        '_label -> "Dame"
       
    ))),format.raw/*54.6*/("""
    </td>
            <td>
    """),_display_(Seq[Any](/*57.6*/inputText(
        helloForm("Valet"),
        '_label -> "Valet"
      
    ))),format.raw/*61.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*65.6*/inputText(
        helloForm("9"),
        '_label -> "9"
    
    ))),format.raw/*69.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*73.6*/inputText(
        helloForm("8"),
        '_label -> "8"
     
    ))),format.raw/*77.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*81.6*/inputText(
        helloForm("7"),
        '_label -> "7"
      
    ))),format.raw/*85.6*/("""
    </td>
            
        </tr>

          <tr>
        <td>
            <p> Atout </p>
        </td>
            <td>
    """),_display_(Seq[Any](/*95.6*/inputText(
        helloForm("AsA"),
        '_label -> "As"
    ))),format.raw/*98.6*/("""
            </td>
            <td>

    """),_display_(Seq[Any](/*102.6*/inputText(
        helloForm("DixA"),
        '_label -> "Dix"
      
    ))),format.raw/*106.6*/("""
        </td>
            <td>

    """),_display_(Seq[Any](/*110.6*/inputText(
        helloForm("RoiA"),
        '_label -> "Roi"
      
    ))),format.raw/*114.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*118.6*/inputText(
        helloForm("DameA"),
        '_label -> "Dame"
       
    ))),format.raw/*122.6*/("""
    </td>
            <td>
    """),_display_(Seq[Any](/*125.6*/inputText(
        helloForm("ValetA"),
        '_label -> "Valet"
      
    ))),format.raw/*129.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*133.6*/inputText(
        helloForm("9A"),
        '_label -> "9"
    
    ))),format.raw/*137.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*141.6*/inputText(
        helloForm("8A"),
        '_label -> "8"
     
    ))),format.raw/*145.6*/("""
    </td>
            <td>

    """),_display_(Seq[Any](/*149.6*/inputText(
        helloForm("7A"),
        '_label -> "7"
      
    ))),format.raw/*153.6*/("""
    </td>
            
        </tr>
    </table>
        
        
        <p class="buttons">
            <input type="submit">
        <p>
        
    """)))})),format.raw/*164.6*/("""
    
""")))})))}
    }
    
    def render(helloForm:Form[Application.Hello]): play.api.templates.HtmlFormat.Appendable = apply(helloForm)
    
    def f:((Form[Application.Hello]) => play.api.templates.HtmlFormat.Appendable) = (helloForm) => apply(helloForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 12 21:16:28 CET 2014
                    SOURCE: C:/Users/Nicolas/Documents/playProject/app/views/index.scala.html
                    HASH: d7f067e2bc43d7c6ae9098e6493a353dbab8dcc3
                    MATRIX: 791->1|937->37|965->56|1001->58|1053->102|1092->104|1185->163|1262->232|1301->234|1356->253|1512->387|1567->406|1730->547|1897->679|1983->744|2060->786|2155->860|2228->898|2323->972|2392->1006|2490->1083|2558->1116|2657->1194|2726->1228|2815->1296|2884->1330|2974->1399|3043->1433|3134->1503|3299->1633|3386->1699|3464->1741|3561->1816|3635->1854|3732->1929|3802->1963|3902->2041|3971->2074|4072->2153|4142->2187|4233->2256|4303->2290|4395->2360|4465->2394|4558->2465|4747->2622
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|39->11|42->14|44->16|47->19|55->27|58->30|62->34|66->38|70->42|74->46|78->50|82->54|85->57|89->61|93->65|97->69|101->73|105->77|109->81|113->85|123->95|126->98|130->102|134->106|138->110|142->114|146->118|150->122|153->125|157->129|161->133|165->137|169->141|173->145|177->149|181->153|192->164
                    -- GENERATED --
                */
            
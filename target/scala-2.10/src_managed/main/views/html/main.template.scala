
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <style type="text/css">
    .row"""),format.raw/*14.9*/("""{"""),format.raw/*14.10*/("""
        margin:auto;
    """),format.raw/*16.5*/("""}"""),format.raw/*16.6*/("""
        .container """),format.raw/*17.20*/("""{"""),format.raw/*17.21*/("""
            width: 70%;
            margin:auto;
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""
        footer"""),format.raw/*21.15*/("""{"""),format.raw/*21.16*/("""
            position: fixed;
            bottom: 0px;
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""
        table tr td.input """),format.raw/*25.27*/("""{"""),format.raw/*25.28*/("""
            width: 100px;
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/("""
        input """),format.raw/*28.15*/("""{"""),format.raw/*28.16*/("""
            width: 50px;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""

        form .clearfix """),format.raw/*32.24*/("""{"""),format.raw/*32.25*/("""
            margin-bottom: 18px;
            zoom: 1;
            width: 200px;
            margin-left: -100px;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""
    </style> 

    <body>
        
        <div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*45.45*/routes/*45.51*/.Application.index())),format.raw/*45.71*/("""">Convertisseurs</a>
                    <ul class="nav">
                        <li class=""""),_display_(Seq[Any](/*47.37*/("active".when(nav == "romain")))),format.raw/*47.69*/("""">
                            <a href=""""),_display_(Seq[Any](/*48.39*/routes/*48.45*/.ConvEnRomain.blank())),format.raw/*48.66*/("""">En Romain</a>Jsuis un bg
                        </li>
                        <li class=""""),_display_(Seq[Any](/*50.37*/("active".when(nav == "decimal")))),format.raw/*50.70*/("""">
                            <a href=""""),_display_(Seq[Any](/*51.39*/routes/*51.45*/.ConvEnDecimal.blank())),format.raw/*51.67*/("""">En Décimal</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="container">
"""),_display_(Seq[Any](/*59.2*/if(! nav.equals(""))/*59.22*/ {_display_(Seq[Any](format.raw/*59.24*/("""                
            <div class="content">
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*62.26*/title)),format.raw/*62.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*67.26*/content)),format.raw/*67.33*/("""
                    </div>
                </div>
            </div>
""")))})),format.raw/*71.2*/("""
            <footer>
                <p>
                    Made by  Nicolas Vanalderweireldt & Oriana Meril <a href="http://www.playframework.com">www.playframework.com</a>
                </p>
            </footer>

        </div>
        
    </body>
</html>
"""))}
    }
    
    def render(title:Html,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 11 21:08:27 CET 2014
                    SOURCE: C:/Users/Nicolas/Documents/playProject/app/views/main.scala.html
                    HASH: d33b81ab9433917063a2d2829d05d68c30151b0d
                    MATRIX: 783->1|923->47|1011->100|1037->105|1134->167|1148->173|1208->212|1299->268|1313->274|1368->308|1465->369|1480->375|1534->407|1595->432|1610->438|1677->483|1787->566|1816->567|1869->593|1897->594|1945->614|1974->615|2059->673|2088->674|2131->689|2160->690|2250->753|2279->754|2334->781|2363->782|2425->817|2454->818|2497->833|2526->834|2587->868|2616->869|2669->894|2698->895|2847->1017|2876->1018|3092->1198|3107->1204|3149->1224|3279->1318|3333->1350|3410->1391|3425->1397|3468->1418|3597->1511|3652->1544|3729->1585|3744->1591|3788->1613|3987->1777|4016->1797|4056->1799|4210->1917|4237->1922|4403->2052|4432->2059|4534->2130
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|42->14|42->14|44->16|44->16|45->17|45->17|48->20|48->20|49->21|49->21|52->24|52->24|53->25|53->25|55->27|55->27|56->28|56->28|58->30|58->30|60->32|60->32|65->37|65->37|73->45|73->45|73->45|75->47|75->47|76->48|76->48|76->48|78->50|78->50|79->51|79->51|79->51|87->59|87->59|87->59|90->62|90->62|95->67|95->67|99->71
                    -- GENERATED --
                */
            

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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.6.4.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
        <style type="text/css">
        body """),format.raw/*12.14*/("""{"""),format.raw/*12.15*/("""
            font-family: calibri;
            background-image: url(http://www.tentelemed.com/wp-content/uploads/2013/03/Blurry-Blue-Background-IV.jpg);
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""

     input """),format.raw/*17.12*/("""{"""),format.raw/*17.13*/("""
        width: 50px;
     """),format.raw/*19.6*/("""}"""),format.raw/*19.7*/("""

     #helloform dt """),format.raw/*21.20*/("""{"""),format.raw/*21.21*/("""
display: inline-block;
width: 0px;
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""

section """),format.raw/*26.9*/("""{"""),format.raw/*26.10*/("""
    width: 960px;
    margin:auto;
    background-color: white;
    opacity: 0.9;
    margin-top: 5%;

"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""
table """),format.raw/*34.7*/("""{"""),format.raw/*34.8*/("""
    margin:auto;
    border-collapse:collapse;
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""

table tr td """),format.raw/*39.13*/("""{"""),format.raw/*39.14*/("""
    border: solid black 1px;
    padding: 1px;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""

header """),format.raw/*44.8*/("""{"""),format.raw/*44.9*/("""
padding: 10px 30px;
background: #B6B6B6;
font-size: 24px;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""
</style> 
    </head>
    <body>
        
        <header>
            <a href=""""),_display_(Seq[Any](/*54.23*/routes/*54.29*/.Application.index)),format.raw/*54.47*/("""">"""),_display_(Seq[Any](/*54.50*/title)),format.raw/*54.55*/("""</a>
        </header>
        
        <section>
            """),_display_(Seq[Any](/*58.14*/content)),format.raw/*58.21*/("""
        </section>
        
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 12 23:50:09 CET 2014
                    SOURCE: C:/Users/Oriana/Documents/GitHub/playProject/app/views/main.scala.html
                    HASH: 061f5ce9aa803017db0b5b8055677c099562a252
                    MATRIX: 778->1|902->31|990->84|1016->89|1113->151|1127->157|1182->191|1278->252|1292->258|1345->290|1406->315|1421->321|1488->366|1596->446|1625->447|1814->609|1843->610|1884->623|1913->624|1967->651|1995->652|2044->673|2073->674|2136->710|2164->711|2201->721|2230->722|2361->826|2389->827|2423->834|2451->835|2526->883|2554->884|2596->898|2625->899|2700->947|2728->948|2764->957|2792->958|2878->1017|2906->1018|3024->1100|3039->1106|3079->1124|3118->1127|3145->1132|3244->1195|3273->1202
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|43->15|43->15|45->17|45->17|47->19|47->19|49->21|49->21|52->24|52->24|54->26|54->26|61->33|61->33|62->34|62->34|65->37|65->37|67->39|67->39|70->42|70->42|72->44|72->44|76->48|76->48|82->54|82->54|82->54|82->54|82->54|86->58|86->58
                    -- GENERATED --
                */
            
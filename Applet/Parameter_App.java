import java.applet.Applet;
import java.awt.*;
/*<applet code = "Parameter_App" width = "800" height = "800">
<param name = "site" value = "ISKCON" />
</applet>*/
public class Parameter_App extends Applet
{
private String defaultMessage = "Hello!";
public void paint(Graphics G)
{
String s1 = this.getParameter("site");
if(s1 == null)
{
s1 = defaultMessage;
}
G.drawString(s1, 50, 25);
}
}	
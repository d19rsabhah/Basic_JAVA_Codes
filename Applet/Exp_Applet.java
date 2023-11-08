import java.applet.*;
import java.awt.*;
/*<applet code = "Exp_Applet" width = "800" height = "800"></applet>*/
public class Exp_Applet extends Applet
{
Label l1, l2;
TextField t1, t2;
Button b1;
public void inut()
{
l1 = new Label("First Number");
l2 = new Label("Second Number");
t1 = new TextField();
t2 = new TextField();
b1 = new Button("Add");
setLayout(null);
l1.setBounds(50, 80, 100, 20);
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
}
}
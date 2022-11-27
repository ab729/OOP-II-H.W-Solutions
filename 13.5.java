//q1
abstract interface Test {
public abstract Duration getDuration();
public abstract Result check(int a);
public abstract double getScore();
}
--------------------------------------------------
//q2
abstract interface PointingDevice {
public abstract int getXCoord();
public abstract int getYCoord();
public abstract boolean attentionRequired();
public abstract double setResolution(double a);
}
--------------------------------------------------

//q3
abstract interface CommDevice {
public abstract boolean transmit(Destination a, String b);
public abstract String receive(Duration a);
}
--------------------------------------------------

//q4
public class Window implements GUIComponent {
private int width, height, xPos = 0, yPos = 0;

public Window(int a, int b) {width = a; height = b;}

public boolean open() {
System.out.print("Window opened"); return true;
}
public boolean close() {
System.out.print("Window closed"); return true;
}
public void resize(int a, int b) {
width = a; height = b;
}
public void move(int a, int b) {
xPos = a; yPos = b;
}
}
--------------------------------------------------
//q5
public class Firewall implements CommDevice {
private String permittedReceiver;
private String buffer;

public Firewall(String a) { permittedReceiver = a; }

public void transmit(String a, String b) {
buffer = b;
System.out.print("Data scheduled for transmission to " + a);
}

public boolean receive(String a, String b) {
if(a.equals(permittedReceiver)) {
buffer = b;
return true;
} else {
buffer = "";
System.out.print("Attempted breach of firewall by " + a);
return false;
}
}
}
//q6
--------------------------------------------------
abstract interface AccessibleGUIAttribute {
public abstract String getAlternativeText();
}
--------------------------------------------------
//q7
abstract interface ActionListener {
public abstract void actionPerformed(ActionEvent e);
}
--------------------------------------------------
//q8
public class BankAccount implements Account {
private int balance;

public BankAccount(int a) { balance = a; }

public int deposit(int a) { balance += a; return balance; }

public boolean withdraw(int a) {
if (a <= balance) {
balance = balance - a;
return true;
} else {
return false;
}
//balance -= a <= balance ? a : 0; return (a <= balance);
}
}
--------------------------------------------------
//q9
abstract interface GUIComponent {
public abstract void onClick(int a);
public abstract void onCursorFocus(int a);
public abstract boolean move(int a, int b);
public abstract boolean move(Position a);
public abstract boolean move(Dimension a);
public abstract boolean resize(int a, int b);
}
--------------------------------------------------
//q10
abstract interface GUIComponent {
public abstract void open();
public abstract boolean close();
public abstract void resize(int width, int height);
public abstract void move(int x, int y);
}

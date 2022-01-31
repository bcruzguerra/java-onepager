package java.basicsyntax;


public static void main(String[] args) {

//------------------------------------------------------
// Variables:
// <visibility> <modifiers> tipe name <=value>;
// <visibilitye> = public, protected, private
// <modifiers> = static, final
// tipe = byte, short, int, long, float, double, char '', String "", boolean
// Strong typing, Case Sensitive, Can't start with numbers, $ and _ allowed
// Casting (truncates): variable = (int) value

byte b = 2;
short s1 = 512;
int testVariablePleaseIgnore = 0;
long lungo = 100000000000000L;
float floaterMan = 3.1415926535f;
int numeroThree = (int) floaterMan;
public float j = 5f;
public double J = 10d;
char initials = 'B';
final String MGMT = "Kids";
private String fastisio = "Fastisio.";
boolean boolBoolBool = false;

//------------------------------------------------------
//Operators
// var++ var-- ++var --var
// + - * / %
// = += -= *= /= %=

lungo++;
J /= 3;
s1 = b*200;

//------------------------------------------------------
// Output, printing:
// System.out.println("string here"+variable);

System.out.println("variables: " lungo + " " + (j+J) + MGMT + " " + fastisio + " " + numeroThree);
 

}
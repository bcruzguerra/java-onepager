//=============================================================
//--------------------------COMMENTS---------------------------
//=============================================================
// This is for line comments
/** This is
* for
* Block Comments
*/


package java.basicsyntax;

public class Main {
	public static void main(String[] args) {

//=============================================================
//------------------------VARIABLES----------------------------
//=============================================================
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

//=============================================================
//--------------------------OPERATORS--------------------------
//=============================================================
// var++ var-- ++var --var
// + - * / %
// = += -= *= /= %=
// && == ||

lungo++;
J /= 3;
s1 = b*200;


//=============================================================
//---------------------------OUTPUT----------------------------
//=============================================================
// System.out.println("string here"+variable);

System.out.println("variables: " lungo + " " + (j+J) + MGMT + " " + fastisio + " " + numeroThree);


//=============================================================
//---------------------------CLASSES---------------------------
//=============================================================
// <visibility> class Classname {
//   public void Classname {} } <- Constructor method

public class Testeclass {

	private String nomeinstancia;
	private final cteinstancia;

	public Testeclass(String nomeinstancia, final cteinstancia) {
		this.nomeinstancia = nomeinstancia;
		this.cteinstancia = cteinstancia;
	}
}

//=============================================================
//---------------------------METHODS---------------------------
//=============================================================
// <visibility> <returntype> methodname(<argument1tipe> <argument1>, <argument2tipe> <argument2>) {
// return returnvariable;
// }
 
	}
}

//=============================================================
/** reserved keywords:
* abstract assert boolean break byte case catch char class const continue default do double else enum extends final finally
* float goto if implements import instanceof int interface long native new package private protected public return short static strictfp
* super switch synchronized this throw throws transient try void volatile
*/

package Opd22;

/** Het Diamant Probleem:
 *
 * Het diamant probleem ontstaat door zogeheten 'multiple inheritance' of in het Nederlands: meerdere overerving.
 * Doordat in verschillende programmeertalen zoals o.a. C++, Python, R, 'multiple inheritance' op classes is toegestaan,
 * ontstaat dit probleem:
 *
 *      A
 *  B       C
 *      D
 *
 * Stel class B en C erven over van class A, en class D erft over van class B en C. Stel class A heeft een functie die
 * in class B en C op override staat, uit welke class moet class D de functie overerven?
 *
 * Voor programmeertalen zoals Java of C# is multiple inheritance niet toegestaan voor classes. Hier bestaat het probleem
 * echter ook, maar dan bij het gebruik van interfaces. Hieronder een codevoorbeeld wanneer het diamant probleem ontstaat in Java.
 *
 * Welke print functie moet worden opgeroepen van welke interface? De Java compiler weet dit niet en zal een error geven.
 * Dit komt omdat er bij beide classes een default implementatie staat. Er moet dus een override toegevoegd worden.
 * Deze override kan worden uitgevoerd door een functie toe te voegen aan class Diamant:
 * public void print() { Interface1.super.print(); } nu weet de class Diamant welke interface functie bedoeld wordt.
 *
 * interface Interface1 {
 *     default public void print() {.....}
 * }
 * interface Interface2 {
 *     default public void print() {.....}
 * }
 * public class Diamant implements Interface1, Interface2{
 *     public static void main(String []args) {
 *          new Diamant().print();
 *     }
 * }
 *
 * bronnen:
 * http://www.lambdafaq.org/what-about-the-diamond-problem/
 * https://en.wikipedia.org/wiki/Multiple_inheritance
 * https://www.quora.com/What-is-the-diamond-problem-in-programming
 *
 */

public class Main {
    public static void main(String[] arg) {
    }
}

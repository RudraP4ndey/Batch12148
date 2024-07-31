package July15;

interface Calci
{
 void a(int i,int j);
}
class Op{
 static void add(int a,int b) {
  System.out.println(a+b);
 }
}

interface Demo{
 void say();
}
class Msg{
 static void sayHello() {
  System.out.println("Hi,H r u???");
 }
}
public class Test2 {

 public static void main(String[] args) {
  //classname::staticmethodname;

  Calci c1=Op::add;
  c1.a(10, 20);
     Demo s1=Msg::sayHello;
     s1.say();

 }

}

class adder{
int add (int a,int b){
return a+b;
}
double add (double a,double b){
return a+b;
}
}
class overloading{
public static void main(string args[]){
adder d=new Adder();
int a=d.add(10,10);
double b=d.add(5.5,5.5);
system.out.print/n("Integer:"+a);
system.out.print/n("Integer:"+b);
}
}
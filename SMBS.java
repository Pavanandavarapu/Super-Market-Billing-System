import java.util.Scanner;


class bill
{
String name;
int id,n,op,quantity,b;
double price,discount;
Scanner sc=new Scanner(System.in);
void menu()
{
System.out.println("*************************************************");
System.out.println("S.NO            NAME            PRICE");
System.out.println("*************************************************");
System.out.println("1.              colgate         50");
System.out.println("2.              SoftDrinks      85");
System.out.println("3.              PalmOil         100");
System.out.println("4.              ball            50");
System.out.println("5.              Surfexcel       55");
System.out.println("6.              goodday         20");
}
void item()
{
try{
System.out.println("enter id");
id=sc.nextInt();
if(id>0 && id<7)
{
System.out.println("enter quantity");
quantity=sc.nextInt();
if(id==1)
{
name="colgate";
price=50;
discount=2.5;
}
else if(id==2)
{
name="softDrinks";
price=85;
discount=3; 
}
else if(id==3)
{
name="palmoil";
price=100;
discount=3;
}
else if(id==4)
{
name="ball";
price=50;
discount=2;
}
else if(id==5)
{
name="surfexcel";
price=55;
discount=2;
}
}

}
catch(Exception e)
{
System.out.println(e);
}
}

double bill()
{
return price;
}
double it()
{
return(quantity*(price-discount));
}
void ite()
{
System.out.println("please enter below options");
System.out.println("1.menu");
System.out.println("2.exit");
op=sc.nextInt();
do{
switch(op)
{
case 1:
menu();
item();
double pr=it();
if(id>0 && id<7)
{
System.out.println("Id   name         quantity     price   discount     totalbill");
System.out.println( id+"    "+name+"           "+quantity+"         "+price+"     "+discount+"        "+pr);
}
else
{
System.out.println("enter valid id to purchase");
}
break;
case 2:
break;
}
System.out.println("enter 1 to purchase item again");
n=sc.nextInt();
}while(n==1);
}
}
class billing
{
public static void main(String[] args)
{
bill b=new bill();
b.item();
}
}
import java.util.Scanner;
import java.text.DecimalFormat;

public class Test2_6
{
  public static void main(String[] args)
  {

int requir = 6, sessio = 3 ;
while(sessio < requir){
sessio++;
requir--;
System.out.println(sessio);
}

int n = 4;
if (n == 4 || n == 44)
System.out.print("first");
if (n == 4 && n == 44)
System.out.print("second");

    boolean getIt = true, getMe = false;
    if (getIt != getMe) getIt=false;
////#    System.out.println(getIt);
    int max = 135,nPi = 30;

    if (max <= nPi){
        System.out.print("apple ");
    }
    else {
        System.out.println("pear ");
    }
    //#System.out.print("fur");
    int bo , sal = 10000;
    if (sal < 5000)
        bo = 200;
    else if (sal < 7500) bo = 500;
    else if (sal < 10000) bo = 750;
    else if (sal < 20000) bo = 1000;
    else bo = 1250;

    System.out.println(bo);

double discountRate = 0.0;
int purchase = 1250;
char cust = 'N';
if (purchase > 1000)
if (cust == 'Y')
discountRate = .05;
else
discountRate = .04;
else if (purchase > 750)
if (cust == 'Y')
discountRate = .04;
else
discountRate = .03;
else
discountRate = 0;
System.out.println(discountRate);

int required = 6, sessions = 3 ;
while(sessions < required){
System.out.println(sessions);
sessions++;
required--;
}

int habitats = 10;
do {
--habitats;
System.out.println(habitats);
}while(habitats < 5);

for(int i = 10; i < 10; i++){
   System.out.println(i);
}

System.out.print("I can do it");
for (int ri = 1; ri < 4; ri++)

    System.out.println('!');

for (int ii = 2; ii < 4; ii++)

    System.out.println(ii);

for (int number = 5; number <= 15; number = number + 3)
System.out.println(number + ", ");

int xy = 0, sum = 0;
Scanner stdin = new Scanner(System.in);
while (xy != -1) {
xy = stdin.nextInt();
sum = sum + xy;
}
System.out.println(sum);


for (int ai = 1; ai <= 99; ai++)
    System.out.print(ai + " ");
System.out.println();
for (int bi = 99; bi > 0; bi--)
    System.out.print(bi + " ");
System.out.println();

for (int ci = 1; ci < 100; ci++)
    System.out.print(ci + " ");
System.out.println();

Scanner stdine = new Scanner(System.in);
int nObserved = stdine.nextInt();
while (nObserved > 0)
{
System.out.print(nObserved);
nObserved = stdine.nextInt();
}
System.out.println(nObserved + 1);


for (int i32 = 1; i32 <= 2; i32++) {
for(int j32 = 0; j32 < 2; j32++ )
System.out.print(j32);
}
System.out.println();
double xt = 45678.259;
DecimalFormat formatter = new DecimalFormat("#,##0.0");
System.out.println(formatter.format(xt));

int ie = 2, je = 2;
System.out.println(ie != je);

}
}

class Shufflel {
public static void main(String[] args){
int x =3;
while(x > 0){
if (x > 2) {
System.out.print("a");
System.out.print("-");
}
x = x - 1;
if (x == 2) {
System.out.print("b c");}
x = x - 1;
if (x == 1) {
System.out.print("-");
System.out.print("d");
}
x = x -1;
}
}
}



class Exercise1a {
 public static void main(String[] args) {
 int x = 1;
 while (x < 10) {
 if (x > 3) {
 System.out.println("big x");
 }else {
 System.out.println("Small x");
 x = x + 10;
 }
 }
 }
}


class Exercise1c {
public static void main(String[] args){
 int x = 5;
 while (x > 1) {
 x = x - 2;
 if (x < 3) {
 System.out.println("small x");
 }
 }
 }
}


class Test {
 public static void main(String [] args) {
 int x = 0;
 int y = 0;
 while (x < 5) {

if (y < 5) {
x = x+1;
if (y < 3) {
x = x-1;
}
}
y = y +2;


 System.out.print(x + "" + y +" ");
 x = x + 1;
 }
 }
}

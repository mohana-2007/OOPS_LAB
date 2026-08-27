interface Stack {
void push(int x);
void display();
}
class MyStack implements Stack {
int a[]=new int[3];
int top=-1;
public void push(int x) {
try {
if(top==2)
throw new Exception("Stack Overflow");
a[++top]=x;
} catch(Exception e) {
System.out.println(e.getMessage());
}
}
public void display() {
try {
if(top==-1)
throw new Exception("Stack Empty");
System.out.println("Stack Elements:");
for(int i=top;i>=0;i--)
System.out.println(a[i]);
} catch(Exception e) {
System.out.println(e.getMessage());
}
}
}
public class StackDemo {
public static void main(String[]args) {
MyStack s=new MyStack();
s.push(10);
s.push(20);
s.push(30);
s.display();
}
}

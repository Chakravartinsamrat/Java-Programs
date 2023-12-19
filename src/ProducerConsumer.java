//Write a java program for producer and consumer problem.

class Thread1
{
 int num;
 boolean vs=false;
 synchronized int pop()
 {
 if (!vs)
 try
 {
 wait();
 }
 catch (Exception e)
 {
 System.out.println("Excepton occurs at : "+e);
 }
 System.out.println("pop" +num);
 try
 {
 Thread.sleep(1000);
 }
 catch (Exception e)
 {
 System.out.println("Excepton occurs at : "+e);
 }
 vs=false;
 notify();
 return num;
 }
 synchronized int push(int num)
 {
 if (vs)
 try
 {
 wait();
 }
 catch (Exception e)
 {
 System.out.println("Excepton occur at : "+e);
 }
 this.num=num;
 vs=true;
 System.out.println("push"+num);
 try
 {
 Thread.sleep(1000);
 }
 catch (Exception e)
 {
 System.out.println("Excepton occur at : "+e);
 }
 notify();
 return num;
 }
}
class Producer implements Runnable
{
 Thread1 t;
 Producer(Thread1 t)
 {
 this.t=t;
 new Thread(this,"Producer").start();
 }
 public void run()
 {
 int x=0;
 int i = 0;
 while (x<10)
 {
 i=i+5;
 t.push(i);
 x++;
 }
 }
}
class Consumer implements Runnable
{
 Thread1 t;
 Consumer(Thread1 t)
 {
 this.t=t;
 new Thread(this,"Consumer").start();
 }
 public void run()
 {
 int x=0;
 while (x<10)
 {
 t.pop();
 x++;
 }
 }
}
public class ProducerConsumer
{
 public static void main(String[] args)
 {
 Thread1 t=new Thread1();
 new Producer(t);
 new Consumer(t);
 }
}
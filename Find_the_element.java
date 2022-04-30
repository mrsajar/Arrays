import java.util.Scanner;

public class Find_the_element {
    public static void main(String[] args) {
                int flag=0,i=0;
                Scanner s=new Scanner(System.in);
                System.out.println("enter the range of element ...");
                int R=s.nextInt();
                int a[]=new int [R];
                System.out.println("enter the element in array...");
                for(i=0;i<a.length;i++) {
                    a[i]= s.nextInt();
                }
                System.out.println("enter which element you want to find..");
                int F = s.nextInt();
                for(i=0;i<a.length;i++) {
                    if(a[i]==F){
                        flag=1;
                        break;
                    }
                    else{
                        flag=0;
                    }
                }
                if(flag==1){
                    System.out.println("the index of the element you want to find"+a[i]);
                }
                else{
                    System.out.println("index is not found.....");

                }
            }
        }


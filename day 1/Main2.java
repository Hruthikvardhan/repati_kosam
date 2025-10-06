//Write a program to find the largest of three numbers entered by the user.
public class Main{
    public static void main(String[] args) {
        int i =1;
        int j =2;
        int k =3;
        if(i>j && i>k){
            System.out.println("i is grater");
        }
        else if((j>i) && (j>k)){
            System.out.println("j is grater");
        }
        else{
            System.out.println("k is grater");
        }
    }
}
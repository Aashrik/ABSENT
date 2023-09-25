import java.util.Scanner;

public class password_loop {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int i;
        for(i=0;i<=3;i++){
            String your_username="Aashrik";
            String your_password="21";
            System.out.println("Enter your Username");
            String username = sn.nextLine();
            System.out.println("Enter your password");
            String password = sn.nextLine();

            if(username.equals(your_username)&&password.equals(your_password)){
                System.out.println("Login was Success");
                break;
            }else {
                System.out.println("Try again you noob");
            }

        }


    }
}

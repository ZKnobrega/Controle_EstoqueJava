
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        menu blz = new menu();
        Scanner in = new Scanner(System.in);
        String user, senha;
        int x = 0;
        
        while(x<1){
        System.out.println("Digite seu usuario: ");
        user = in.nextLine();
        System.out.println("Digite sua senha");
        senha = in.nextLine();
        
        if (user.equals("unifap") && senha.equals("unifap123")) {
            blz.menu();
            x = 1;
        } else {
            System.out.println("senha errada");
                    
        }
        
    }
}
}

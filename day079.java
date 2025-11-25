import java.util.Scanner;
public class Day79 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String user = u.nextLine();

        System.out.print("Masukkan password: ");
        String pass = u.nextLine();
        

        System.out.println("\nAkunn telah Berhasl dibuat!!");
        String UsernameLogin, PasswordLogin;
        
        while(true){
            System.out.print("Username: ");
            UsernameLogin = u.nextLine();

            System.out.print("Password: ");
            PasswordLogin = u.nextLine();
            
            if (!UsernameLogin.equalsIgnoreCase(user) && !PasswordLogin.equalsIgnoreCase(pass)) {
                System.out.println("Login gagal. Coba lagi");
            }else{
                System.out.println("Login Berhasil! Selamat Datang.");
                break;
            }
        }
    }
}
                
            
                


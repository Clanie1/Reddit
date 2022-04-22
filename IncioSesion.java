import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IncioSesion {

  String Posts = "./Documentos/Posts.daniel";
  String Users = "./Documentos/Users.daniel";
  File Userinfo = new File(Users);

  // constructor
  public Usuario Inicio() throws FileNotFoundException, IOException {
    String res;
    Scanner read = new Scanner(System.in);
    System.out.println("Ya estas registrado?");
    res = read.nextLine();
    if (res.equals("Si") || res.equals("si") || res.equals("S") || res.equals("s")) {
      return login();
    } else if (res.equals("No") || res.equals("no") || res.equals("N") || res.equals("n")) {
      registro();
      System.out.println("Ahora inicia sesion \n");
      return login();
    } else {
      System.out.println("Respuesta no valida \n\n");
      return new Usuario("", "");
    }
  }

  // Registra los datos que da el usuario
  public void registro() throws FileNotFoundException, IOException {
    String Users = "./Documentos/Users.daniel";

    Scanner read = new Scanner(System.in);
    FileWriter write = new FileWriter(Userinfo, true);
    String nombre;
    String password;
    System.out.println("Por favor introduce el nombre de usuario");
    nombre = read.nextLine();
    write.append(nombre + "%");
    System.out.println("Por favor crea una contraseña");
    password = read.nextLine();
    write.write(password + "\n");

    write.close();
    System.out.println("\nGracias por registrate");
  }

  public Usuario login() throws FileNotFoundException, IOException {
    String nombre;
    String password;
    Scanner scanner = new Scanner(System.in);
    while (true) {
      Scanner scannerFile = new Scanner(Userinfo);
      System.out.println("Por favor introduce el nombre de usuario");
      nombre = scanner.nextLine();
      System.out.println("Por favor introduce tu contraseña");
      password = scanner.nextLine();
      Usuario user = new Usuario(nombre, password);
      while (scannerFile.hasNextLine()) {
        String[] userInfo = scannerFile.nextLine().split("%");
        if (user.username.equals(userInfo[0]) && user.password.equals(userInfo[1])) {
          System.out.println("Gracias por hace log in!!\n\n\n");
          return user;
        }
      }
      System.out.println("No se encontro el usuario, Vuelva a intentarlo \n\n\n");
    }
  }

}

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IncioSesion {

  String Posts = "./Documentos/Posts.daniel";
  String Users = "./Documentos/Users.daniel";

  // constructor
  public IncioSesion() throws FileNotFoundException, IOException {
    String res;
    Scanner read = new Scanner(System.in);
    System.out.println("Ya estas registrado?");
    res = read.nextLine();
    if (res.equals("Si") || res.equals("si") || res.equals("S") || res.equals("s")) {
      // login()
    } else if (res.equals("No") || res.equals("no") || res.equals("N") || res.equals("n")) {
      registro();
    } else {
      System.out.println("Introduce una respuesta valida por favor");
    }
  }

  public void registro() throws FileNotFoundException, IOException {
    String Users = "./Documentos/Users.daniel";
    File Userinfo = new File(Users);
    Scanner read = new Scanner(System.in);
    FileWriter write = new FileWriter(Userinfo);
    String nombre;
    String password;

    System.out.println("Por favor introduce el nombre de usuario");
    nombre = read.nextLine();
    write.write(nombre + "%");
    System.out.println("Por favor crea una contraseña");
    password = read.nextLine();
    write.write(password);

    write.close();

  }

  }

  public void registro(){

    Scanner read = new Scanner(System.in);


    File file;
    FileWriter write;


    String nombre;
    String contraseña;
    do{
    System.out.println("Por favor introduce el nombre de usuario");
    nombre = read.nextLine();


    System.out.println("Por favor introduce la contraseña");
    contraseña = read.nextLine();

    File file2 = new File(Users);
    Scanner scannerFile = new Scanner(file2);



    

    while(scannerFile.hasNext() == true){
      String linea = scannerFile.nextLine();
      String[] line = linea.split("%");
      String nombreRegistrado = line[0];
      String contraRegistrada = line[1];
      if(nombre.equals(nombreRegistrado)&&(contraseña.equals(contraRegistrada))){
        System.out.println("INICIO EXITOSO");
        break;
      }
    }
  } while();
}

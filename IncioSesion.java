import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

public class IncioSesion {

  String Posts = "./Documentos/Posts.daniel";
  String Users = "./Documentos/Users.daniel";

  // constructor
  public IncioSesion() {
    String res;
    Scanner read = new Scanner(System.in);
    System.out.println("Ya estas registrado?");
    res = read.nextLine();
    if (res.equals("Si") || res.equals("si") || res.equals("S") || res.equals("s")) {
      // login()
    } else if (res.equals("No") || res.equals("no") || res.equals("N") || res.equals("n")) {
      // registro()
    } else {
      System.out.println("Introduce una respuesta valida por favor");
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

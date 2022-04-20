import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IncioSesion {
  // constructor
  public IncioSesion() throws FileNotFoundException ,IOException{ 
  String res;
  Scanner read = new Scanner(System.in);
  System.out.println("Ya estas registrado?");
  res = read.nextLine();
  if(res.equals("Si")|| res.equals("si")|| res.equals ("S")|| res.equals ("s")){
  //login()
  }
  else if(res.equals("No")||res.equals ("no")|| res.equals("N")||res.equals("n")){
  registro();
  }
  else{
System.out.println("Introduce una respuesta valida por favor");
  }
  }
public void registro() throws FileNotFoundException ,IOException{
  String Users ="./Documentos/Users.daniel";
  File Userinfo = new File(Users);
  Scanner read = new Scanner(System.in);
  FileWriter write = new FileWriter(Userinfo);
  String nombre;
  String password;

  System.out.println("Por favor introduce el nombre de usuario");
  nombre = read.nextLine();
  write.write(nombre+"%");
  System.out.println("Por favor crea una contraseña");
  password = read.nextLine();
  write.write(password);

  write.close();


  }
  


  }


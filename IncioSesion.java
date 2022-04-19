import java.util.Scanner;

public class IncioSesion {
  // constructor
  public IncioSesion() {
  String res;
  Scanner read = new Scanner(System.in);
  System.out.println("Ya estas registrado?");
  res = read.nextLine();
  if(res.equals("Si")|| res.equals("si")|| res.equals ("S")|| res.equals ("s")){
  //login()
  }
  else if(res.equals("No")||res.equals ("no")|| res.equals("N")||res.equals("n")){
  //registro()
  }
  else{
System.out.println("Introduce una respuesta valida por favor");
  }
  }
  


  }


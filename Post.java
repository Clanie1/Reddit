
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Post {
  String nombre;
  String hora;
  String titulo;
  String contenido;

  Scanner scn;

  FileWriter fw;
  public String datos = "./Documentos/Posts.daniel";
  public String numero = "./Documentos/NumeroPost.daniel";
  public String users = "./Documentos/Users.daniel";
  File file = new File(datos);
  File file2 = new File(numero);

  public Post() {
  }

  // constructor Con Usuario
  public Post(Usuario user, String hora, String titulo, String contenido) throws IOException {
    this.nombre = user.username;
    this.hora = hora;
    this.titulo = titulo;
    this.contenido = contenido;
  }

  public Post(String nombre, String hora, String titulo, String contenido) throws IOException {
    this.nombre = nombre;
    this.hora = hora;
    this.titulo = titulo;
    this.contenido = contenido;
  }

  public static Post creatPosts(Usuario user) throws IOException {
    Scanner scn = new Scanner(System.in);
    System.out.println("Ingrese el titulo del post");
    String titulo = scn.nextLine();
    System.out.println("ingrese la hora del post");
    String hora = scn.nextLine();
    System.out.println("ingrese el contenido del post");
    String contenido = scn.nextLine();
    return new Post(user.username, hora, titulo, contenido);
  }

  // agregar el post al documento
  public void Addposts() throws IOException {
    FileWriter fw = new FileWriter(file, true);
    Scanner scanner = new Scanner(file2);
    String numero = scanner.nextLine();
    int numeroInt = Integer.parseInt(numero);
    numero = String.valueOf(++numeroInt);
    FileWriter fx = new FileWriter(file2, false);
    fx.append(numero);
    fx.close();

    fw.append(nombre + "%");
    fw.write(hora + "%");
    fw.write(titulo + "%");
    fw.write(contenido + "\n");
    // Recibe post y con fw saca los .nombre.hora.etc y despues les agrega "%"

    fw.close();
  }

}

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;

public class postAdmin {
  Post postShown;
  boolean sesionIniciada = false;
  ArrayList<Integer> postIndex = new ArrayList<Integer>();
  String fileOrigin = "./Documentos/posts.daniel";
  String numberOrigin = "./Documentos/NumeroPost.daniel";

  public void setSesionIniciada() {
    sesionIniciada = !sesionIniciada;
  }

  // lee un post aleatorio y lo manda a mostrar
  public void loadPost() throws FileNotFoundException, IOException {
    File file = new File(fileOrigin);
    Scanner scanner = new Scanner(file);
    int num = postNumber();
    String line = "";
    for (int i = 0; i < num; i++) {
      line = scanner.nextLine();
    }
    String[] postInfo = line.split("%");
    postShown = renderPost(postInfo);
    showPost();
  }

  public int postNumber() throws FileNotFoundException, IOException {
    File file = new File(numberOrigin);
    Scanner scanner = new Scanner(file);
    Random rad = new Random();
    String line = scanner.nextLine();
    int Max = Integer.parseInt(line);
    if (postIndex.size() == Max) {
      postIndex.clear();
      System.out.println("array limpiado");
    }
    while (true) {
      int num = (int) rad.nextInt(Max) + 1;
      if (!postIndex.contains(num)) {
        postIndex.add(num);
        return num;
      }
    }
  }

  // muestra el post
  public void showPost() {
    System.out.print(postShown.nombre + " -----------  ");
    System.out.println(postShown.hora);
    System.out.println("");
    System.out.println(postShown.titulo + "\n");
    System.out.println(postShown.contenido);
    System.out.println("\n \n \n \n \n ");
  }

  public void showPrePost(Post post) {
    System.out.print(post.nombre + " -----------  ");
    System.out.println(post.hora);
    System.out.println("");
    System.out.println(post.titulo + "\n");
    System.out.println(post.contenido);
    System.out.println("\n \n \n \n \n ");
  }

  // crea un objeto Postinfo y devuelve un Post
  public static Post renderPost(String[] postInfo) throws IOException {
    String nombre = "";
    String hora = "";
    String titulo = "";
    String contenido = "";
    for (int i = 0; i < postInfo.length; i++) {
      switch (i) {
        case 0:
          nombre = postInfo[i];
          break;
        case 1:
          hora = postInfo[i];
          break;
        case 2:
          titulo = postInfo[i];
          break;
        case 3:
          contenido = postInfo[i];
          break;
        default:
          break;
      }
    }

    Post post = new Post(nombre, hora, titulo, contenido);

    return post;
  }

  // menu para saber que quiere hacer el usuario
  public int option() throws FileNotFoundException, IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1. Ver nuevo post");
    String opcion2;
    if (sesionIniciada) {
      opcion2 = "2. Crear nuevo post";
    } else {
      opcion2 = "2. Iniciar Sesion";
    }
    System.out.println(opcion2);
    System.out.println("3. Salir ");
    int option = scanner.nextInt();

    if (sesionIniciada) {
      switch (option) {
        case 1:
          System.out.println("\n \n \n \n \n \n \n \n");
          return 1;
        case 2:
          System.out.println("\n \n \n \n \n \n \n \n");
          return 4;
        case 3:
          System.out.println("Adios");
          return 3;
        default:
          System.out.println("Opcion no valida");
          break;
      }
    } else {
      switch (option) {
        case 1:
          System.out.println("\n \n \n \n \n \n \n \n");
          return 1;
        case 2:
          System.out.println("\n \n \n \n \n \n \n \n");
          return 2;
        case 3:
          System.out.println("Adios");
          return 3;
        default:
          System.out.println("Opcion no valida");
          break;
      }
    }

    return 0;
  }

}

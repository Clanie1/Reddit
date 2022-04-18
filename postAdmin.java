import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.ArrayList;

public class postAdmin {
  // array list
  Post postShown;

  String fileOrigin = "./Documentos/posts.daniel";

  public void loadPost() throws FileNotFoundException {
    File file = new File(fileOrigin);
    Scanner scanner = new Scanner(file);
    Random rad = new Random();
    int num = rad.nextInt(4) + 1;
    String line = "";
    for (int i = 0; i < num; i++) {
      line = scanner.nextLine();
    }
    String[] postInfo = line.split("%");
    postShown = renderPost(postInfo);
    showPost();
  }

  public void showPost() {
    System.out.print(postShown.nombre + " -----------  ");
    System.out.println(postShown.hora);
    System.out.println("");
    System.out.println(postShown.titulo + "\n");
    System.out.println(postShown.contenido);
    System.out.println("\n \n \n \n \n ");
  }

  public static Post renderPost(String[] postInfo) {
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
    Post postCargado = new Post(nombre, hora, titulo, contenido);
    return postCargado;
  }

  public int option() throws FileNotFoundException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1. Ver nuevo post");
    System.out.println("2. Salir");
    System.out.println("3. Inicias sesion");
    int option = scanner.nextInt();
    switch (option) {
      case 1:
        System.out.println("\n \n \n \n \n \n \n \n");
        return 1;
      case 2:
        System.out.println("Adios");
        return 2;
      case 3:
        System.out.println("Inicias sesion");
        return 3;
      default:
        System.out.println("Opcion no valida");
        break;
    }
    return 0;
  }

}

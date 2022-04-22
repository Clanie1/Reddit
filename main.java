import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    postAdmin cosa = new postAdmin();
    IncioSesion cuenta = new IncioSesion();
    Usuario usuario = new Usuario();
    Post post;

    cosa.loadPost();
    boolean flag = true;
    while (flag) {
      int answer = cosa.option();
      switch (answer) {
        case 1:
          cosa.loadPost();
          break;
        case 2:
          usuario = cuenta.Inicio();
          cosa.setSesionIniciada();
          break;
        case 4:
          Post postClase = Post.creatPosts(usuario);
          postClase.Addposts();
          System.out.println("Gracias por tu post \n \n \n");
          break;
        case 3:
          flag = false;
        default:
          break;
      }
    }
  }
}

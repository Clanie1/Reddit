import java.io.FileNotFoundException;

public class main {

  public static void main(String[] args) throws FileNotFoundException {
    postAdmin cosa = new postAdmin();
    postAdmin.loadPosts();
  }

}

import java.io.FileNotFoundException;
import java.io.IOException;

public class main {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    postAdmin cosa = new postAdmin();
    boolean flag = true;
    while (flag) {
      cosa.loadPost();
      if (cosa.option() == 3) {
        flag = false;
      }

    }
  }

}

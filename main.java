import java.io.FileNotFoundException;

public class main {

  public static void main(String[] args) throws FileNotFoundException {
    postAdmin cosa = new postAdmin();
    boolean flag = true;
    while (flag) {
      cosa.loadPost();
      if (cosa.option() == 2) {
        flag = false;
      }
    }
  }

}

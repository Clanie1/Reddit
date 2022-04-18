import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class postAdmin {
  Post[] post;

  String file = "./Documentos/posts.daniel";

  public static void loadPosts() throws FileNotFoundException {

    File file = new File("./Documentos/posts.daniel");
    Scanner scanner = new Scanner(file);
    Random rad = new Random();
    int num = rad.nextInt(4);
    System.out.println(num);
    String line = "";
    for (int i = 0; i < num; i++) {
      line = scanner.nextLine();
    }
    String[] postInfo = line.split(",");
    for (String info : postInfo) {
      System.out.println(info);
    }

  }

  public static void showPosts() {

  }

}

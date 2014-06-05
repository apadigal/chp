package fragment.submissions;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String args[]) throws Exception {

    List list = new ArrayList();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add(1, "G");

    System.out.println(list);

  }
}

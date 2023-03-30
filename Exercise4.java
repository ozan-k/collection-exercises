import java.util.HashMap;
import java.util.Map;

public class Exercise4 {

   public static void main(String[] args) {
      HashMap<String, String> config = new HashMap<>();
      config.put("font_face", "Times New Roman");
      config.put("font_size", "10");
      config.put("margin", "4");
      config.put("auto_indent", "true");

      System.out.println("Config size: " + config.size());
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("All entries except \"Font_face\":");
      for (Map.Entry m : config.entrySet()) {
         if (!m.getKey().equals("font_face"))
            System.out.println(m.getKey() + ": " + m.getValue());
      }
   }
}

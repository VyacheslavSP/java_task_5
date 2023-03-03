import java.util.*;
/**
 * java_task_5
 */
public class java_task_5 {
    public static void main(String[] args) {
        HashMap<Integer, String> Mapa = new HashMap<>();
        HashMap<Integer, String> Mapa_second = new HashMap<>();
        int i=0;
        while (i<6){
            Mapa.put(Byte.MAX_VALUE-i, build_string());
            i++;
        }
        System.out.println("Исходная мапа    " + Mapa);
        for (Integer key: Mapa.keySet())
        {
             String Tmp = Mapa.get(key);
             Mapa.put(key, Tmp+"!");
        }
        System.out.println("Мапа с '!'    " +Mapa);
        i=0;
        while (i<30){
            Mapa_second.put(Byte.MAX_VALUE-i, build_string().toLowerCase());
            i++;
        }
        System.out.println("Вторая мапа    " +Mapa_second);
        for (Integer key_ferst: Mapa.keySet())
        {
            for (Integer key_second: Mapa_second.keySet())
            {
                if(key_ferst==key_second){
                String Tmp = Mapa_second.get(key_second);
                Tmp=Tmp+Mapa.get(key_ferst);
                Mapa.put(key_ferst, Tmp);
                }
            }
        }
        System.out.println("Первая мапа с объединением    " +Mapa);
    }
    public static char randomChar() {
        Random r = new Random();
        return (char)(r.nextInt(26) + 'A');
    } 
    public static String build_string() {
        byte i=0;
        String text="";
            while(i<10){
            text=(text+randomChar()).toString();
            i++;
        }
 return text;
  } 
}  

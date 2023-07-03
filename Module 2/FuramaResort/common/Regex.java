package FuramaResort.common;

public class Regex {
    public static boolean idVilla(String id){
        return id.matches("^SVVL-\\d{4}$");
    }
    public static boolean idHouse(String id){
        return id.matches("^SVHO-\\d{4}$");
    }
    public static boolean idRoom(String id){
        return id.matches("^SVRO-\\d{4}$");
    }
    public static boolean serviceName(String serviceName){
        return serviceName.matches("^[A-Z][a-z]+(\\s[a-z]+)*$");
    }
}

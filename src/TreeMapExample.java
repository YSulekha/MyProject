import java.util.Date;
import java.util.TreeMap;
 
public class TreeMapExample {
    public static void main(String[] args) throws InterruptedException{
        TreeMap<Date, Integer> students = new TreeMap<Date, Integer>();
        Date d1 = new Date();
        Thread.sleep(2000);
        Date d2 = new Date();
        Thread.sleep(2000);
        Date d3 = new Date();
        Thread.sleep(2000);
        Date d4 = new Date();
        //Add Key/Value pairs
        students.put(d2, 47);
        students.put(d4, 34);
        students.put(d3, 65);
        students.put(d1, 44);
        System.out.println(d1.compareTo(d3));
 
        //Iterate over HashMap
        for(Date key: students.keySet()){
            System.out.println(key  +" :: "+ students.get(key));
        }
    }
}
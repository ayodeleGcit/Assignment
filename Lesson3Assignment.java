import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author ayomide
 */
public class Lesson3Assignment {
 public static void main(String[]arg){
     String str = "";
     final boolean order = true;
     int i;
 try {
FileReader myFile = new FileReader("ayo.txt");
ArrayList li=new ArrayList();
ArrayList lis=new ArrayList();
int index=1;
int sum=0;
double total=0.0;
Map<Integer,String> dr=new TreeMap<Integer,String>(new Comparator<Integer>()
                    {

                        @Override
                        public int compare(Integer first, Integer second)
                        {

                            if (order)
                            {

                                return second.compareTo(first);
                            }
                            else
                            {
                                return first.compareTo(second);

                            }
                        }
                    });
HashMap or=new HashMap<String,Integer>();

 BufferedReader buff;
     buff = new BufferedReader(myFile);
 while((str = buff.readLine())!=null){
     li.add(str);
 }
 
 for(Object ch:li){
     int u=0;
     String s=ch.toString();
     lis.add(s.replaceAll("(?>-?\\d+(?:[\\./]\\d+)?)",""));
     if(or.containsKey(s.replaceAll("(?>-?\\d+(?:[\\./]\\d+)?)",""))){
         Object l=or.get(s.replaceAll("(?>-?\\d+(?:[\\./]\\d+)?)",""));
         
         u=(Integer)l+Integer.parseInt(s.replaceAll("[\\D]", ""));
         or.put(s.replaceAll("(?>-?\\d+(?:[\\./]\\d+)?)",""), u);
         
     }else{
         or.put(s.replaceAll("(?>-?\\d+(?:[\\./]\\d+)?)",""), Integer.parseInt(s.replaceAll("[\\D]", "")));
         
     }
 
 

 }


 Map<String, String> treeMap = new TreeMap<String, String>(or);
 Iterator o= treeMap.entrySet().iterator();
  while(o.hasNext()){
     
    HashMap.Entry pair=(HashMap.Entry)o.next();
    int div;
    i=Collections.frequency(lis,pair.getKey());
    div = (Integer)pair.getValue()/i;
    dr.put(div, pair.getKey().toString());
    System.out.println(pair.getKey() +" "+i+" " + div);
    
 }
  System.out.println();
  System.out.println("Merit order ");
  System.out.println();
  Iterator k=dr.entrySet().iterator();
  while(k.hasNext()){
      
      HashMap.Entry pair=(HashMap.Entry)k.next();
      i=Collections.frequency(lis,pair.getValue());
      sum=sum+(Integer)pair.getKey();
      
       double an=(Integer)pair.getKey()-dr.size();
        total=Math.pow(an, 2)+total;
      System.out.println(index +" "+pair.getValue()+"  "+i+" "+pair.getKey());
      index++;
  }
  System.out.println();
  System.out.println("Number of student "+dr.size());
  System.out.println();
  double ans=(double)sum/dr.size();
  System.out.println("The Average is : "+ans);
  System.out.println();
   
  System.out.println("Standard Deviation : "+Math.sqrt(total/(dr.size()-1)));
 buff.close();
 
 } catch (IOException e) {
 System.out.println(e.toString());
 }
 }
    
    
    
}



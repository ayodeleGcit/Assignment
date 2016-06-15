import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author ayomide
 */
public class Lesson2Assignment {
    public static void main(String[]arg){
      ArrayList<String> li=new ArrayList<String>();
      li.add("pear");
      li.add("banana");
      li.add("tangerine");
      li.add("strawberry");
      li.add("blackberry");
      
      for(String ch:li){
          System.out.println(ch);
      }
      System.out.println();
      ArrayIterator ai=new ArrayIterator(li);
      while(ai.hasNext()){
          System.out.println(ai.next());
      }
      System.out.println();
      li.add(3, "banana");
     
      for(String ch:li){
          System.out.println(ch);
      }
    }
}
class ArrayIterator implements Iterator<String>{
      ArrayList data;
        int index;
    public ArrayIterator(ArrayList data) {
    this.data=data;
    index=data.size()-1;
    }
      
    @Override
    public boolean hasNext() {
         return !(index<0);
    }

    @Override
    public String next() {
       return (String)data.get(index--);
    }
    @Override
    public void remove(){
        data.remove(index);
    }
    public void emptyall(){
        data.clear();
    }
    
}

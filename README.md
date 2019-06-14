Quining has never been easier than with this generic [Quine]([https://en.wikipedia.org/wiki/Quine_(computing)](https://en.wikipedia.org/wiki/Quine_(computing))) class:

**Step 1.** Insert any code at the indicated location.
**Step 2.** Using your favourite IDE (tested with IntelliJ), copy the entire code and paste into String s (line 4).
**Step 3.** Compile and run.


```Java
public class Quine {  
  
    public static void main(String[] args) {  
        String s = "";  
  System.out.println(s.substring(0,87) + quote(s) +  s.substring(87));  
  }  
  
    private static String quote(String s) {  
        StringBuilder q = new StringBuilder();  
 for(int i = 0; i < s.length(); i++) {  
            if(s.charAt(i) == '\n') {  
                q.append("\\n\" +\n                \"");  
  } else if(s.charAt(i) == '\"') {  
                q.append("\\\"");  
  } else if(s.charAt(i) == '\\') {  
                q.append("\\\\");  
  } else {  
                q.append(s.charAt(i));  
  }  
        }  
        return q.toString();  
  }  
  
    // INSERT CODE HERE  
  
}
```

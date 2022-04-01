### How to use this [Quine](https://en.wikipedia.org/wiki/Quine_(computing)) class:


**Step 1.** Insert arbitrary code at the indicated location.

**Step 2.** Copy the entire code and paste into String s (line 4) using your favourite IDE (tested with IntelliJ).

**Step 3.** Compile and run.


```Java
public class Quine {

    public static void main(String[] args) {  
        String s = "";
        System.out.println(s.substring(0, 87) + quote(s) + s.substring(87));
    }

    private static String quote(String s) {  
        StringBuilder q = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case '\n': { q.append("\\n\" +\n                \""); break; }
                case '\"': { q.append("\\\""); break; }
                case '\\': { q.append("\\\\"); break; }
                default: q.append(s.charAt(i));
            }

        }
        return q.toString();
    }

    // INSERT CODE HERE  

}
```

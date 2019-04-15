public class Quine {

    public static void main(String[] args) {
        String s = "public class Quine {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        String s = \"\";\n" +
                "        System.out.println(s.substring(0,87) + quote(s) +  s.substring(87));\n" +
                "    }\n" +
                "\n" +
                "    private static String quote(String s) {\n" +
                "        StringBuilder q = new StringBuilder();\n" +
                "        for(int i = 0; i < s.length(); i++) {\n" +
                "            if(s.charAt(i) == '\\n') {\n" +
                "                q.append(\"\\\\n\\\" +\\n                \\\"\");\n" +
                "            } else if(s.charAt(i) == '\\\"') {\n" +
                "                q.append(\"\\\\\\\"\");\n" +
                "            } else if(s.charAt(i) == '\\\\') {\n" +
                "                q.append(\"\\\\\\\\\");\n" +
                "            } else {\n" +
                "                q.append(s.charAt(i));\n" +
                "            }\n" +
                "        }\n" +
                "        return q.toString();\n" +
                "    }\n" +
                "\n" +
                "}";
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

}

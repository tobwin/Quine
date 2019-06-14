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
                "            \n" +
                "            switch(s.charAt(i)) {\n" +
                "                case '\\n': { q.append(\"\\\\n\\\" +\\n                \\\"\"); break; }\n" +
                "                case '\\\"': { q.append(\"\\\\\\\"\"); break; }\n" +
                "                case '\\\\': { q.append(\"\\\\\\\\\"); break; }\n" +
                "                default: q.append(s.charAt(i));\n" +
                "            }\n" +
                "            \n" +
                "        }\n" +
                "        return q.toString();\n" +
                "    }\n" +
                "\n" +
                "    // INSERT CODE HERE\n" +
                "\n" +
                "}";
        System.out.println(s.substring(0,87) + quote(s) +  s.substring(87));
    }

    private static String quote(String s) {
        StringBuilder q = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {

            switch(s.charAt(i)) {
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

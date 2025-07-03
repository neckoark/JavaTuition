package pattern;

public class NamePattern {
        public static void main(String[] args) {
                String name = "KEDAR";
                for (char ch : name.toCharArray()) {
                        printPattern(ch);
                        System.out.print("  "); // Space between characters
                }
        }

        public static void printPattern(char ch) {
                String[] pattern;

                switch (Character.toUpperCase(ch)) {
                        case 'K':
                                pattern = new String[] {
                                                "*   *",
                                                "*  * ",
                                                "* *  ",
                                                "*  * ",
                                                "*   *"
                                };
                                break;
                        case 'E':
                                pattern = new String[] {
                                                "*****",
                                                "*    ",
                                                "*****",
                                                "*    ",
                                                "*****"
                                };
                                break;
                        case 'D':
                                pattern = new String[] {
                                                "**** ",
                                                "*   *",
                                                "*   *",
                                                "*   *",
                                                "**** "
                                };
                                break;
                        case 'A':
                                pattern = new String[] {
                                                "  *  ",
                                                " * * ",
                                                "*****",
                                                "*   *",
                                                "*   *"
                                };
                                break;
                        case 'R':
                                pattern = new String[] {
                                                "**** ",
                                                "*   *",
                                                "**** ",
                                                "*  * ",
                                                "*   *"
                                };
                                break;
                        default:
                                pattern = new String[] { " " }; // Default empty space
                }

                for (String row : pattern) {
                        System.out.println(row);
                }
        }
}

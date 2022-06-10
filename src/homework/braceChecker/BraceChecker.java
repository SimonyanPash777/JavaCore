package homework.braceChecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        StackBC stack = new StackBC();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char d;

            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    d = (char) stack.pop();
                    if (d != '(') {
                        System.out.println("ERROR at " + i + " : opened "
                                + d + " but closed " + c);
                    }
                    break;
                case ']':
                    d = (char) stack.pop();
                    if (d != '[') {
                        System.out.println("ERROR at " + i + " : opened "
                                + d + " but closed " + c);
                    }
                    break;
                case '}':
                    d = (char) stack.pop();
                    if (d != '{') {
                        System.out.println("ERROR at " + i + " : opened "
                                + d + " but closed " + c);
                    }
                    break;
            }
        }
    }
}

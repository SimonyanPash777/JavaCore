package homeworks.braceChecker;

public class BraceChecker {
    private String text;
    private StackBC stack = new StackBC();
    private StackBC stackForIndex = new StackBC();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char d;

            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    stackForIndex.push(i);
                    break;
                case ')':
                    d = (char) stack.pop();
                    stackForIndex.pop();
                    if (d != '(') {
                        System.err.println("ERROR at " + i + " : opened "
                                + d + " but closed " + c);
                    }
                    break;
                case ']':
                    d = (char) stack.pop();
                    stackForIndex.pop();
                    if (d != '[') {
                        System.err.println("ERROR at " + i + " : opened "
                                + d + " but closed " + c);
                    }
                    break;
                case '}':
                    d = (char) stack.pop();
                    stackForIndex.pop();
                if (d != '{') {
                        System.err.println("ERROR at " + i + " : opened "
                                + d + " but closed " + c);
                    }
                    break;
            }
        }

        while (!stack.isEmpty()){
            System.err.println("ERROR : opened " + (char) stack.pop() + " but not closed at " + stackForIndex.pop());
        }
    }
}

package chapters.chapters7;

public class Test3 {
    int a;
    Test3 (int i){
        a = i;
    }
    Test3 incryByTen() {
        Test3 temp = new Test3(a + 10);
        return temp;
    }
}

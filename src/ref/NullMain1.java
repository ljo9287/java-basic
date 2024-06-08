package ref;

public class NullMain1 {
    // 지역변수 예제
    public static void main(String[] args) {
        Data data = null;   // nullPointerException
        data.value = 10;
        System.out.println(data.value);
    }
}

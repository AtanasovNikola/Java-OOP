package inheritance.randomList;


public class Main {
    public static void main(String[] args) {

        RandomArrayList<Integer> list = new RandomArrayList<>();

        for (int i = 0; i <= 10 ; i++) {
            list.add(i);
        }
        System.out.println(list.getRandomElement());
    }
}

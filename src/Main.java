public class Main {
    public static void main(String[] args) {
        String [] Books = {"Пушкин А.С. - Руслан и Люмила", "Тургенев И.С. - Отцы и дети"} ;
        String arrayBooks = String.join(", ", Books );
        System.out.println(arrayBooks);
    }
}
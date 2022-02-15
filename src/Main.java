import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook b1 = new ProgrammingBook("01","Clean code",100,"Robert Martin","English","Begin");
        ProgrammingBook b2 = new ProgrammingBook("02","Ngôn ngữ lập trình C",120,"Brian","C","Begin");
        ProgrammingBook b3 = new ProgrammingBook("03","Code Complete",110,"Steve","English","Begin");
        ProgrammingBook b4 = new ProgrammingBook("04","Effective Java",130,"Joshua","Java","Begin");
        ProgrammingBook b5 = new ProgrammingBook("05","Java Puzzlers",105,"Joshua","Java","Begin");
        FictionBook b6 = new FictionBook("06","Nhà giả kim",90,"Paule","Tâm lý");
        FictionBook b7 = new FictionBook("07","Harry Porter",200,"J.K","Viễn tưởng");
        FictionBook b8 = new FictionBook("08","Ông già và biển cả",190,"Ernest","Ngụ ngôn");
        FictionBook b9 = new FictionBook("09","Mật mã Da Vince",290,"Dan","Viễn tưởng");
        FictionBook b10 = new FictionBook("10","Hoàng tử bé",90,"Antoine","Tiểu thuyết");
        Book[] books = {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10};
        int sum=0;
        for (Book b:books
             ) {
            sum+=b.getPrice();
        }
        System.out.println("Tổng 10 cuốn sách là: "+sum);
        int count=0;
        for (Book b:books
             ) {
            if (b instanceof ProgrammingBook){
                String language = ((ProgrammingBook)b).getLanguage();
                if (language.equals("Java")){
                    count++;
                }

            }
        }
        System.out.println("Số sách có language Java là: "+count);
        int count1=0;
        for (Book book:books
             ) {
            if (book instanceof FictionBook){
                String category = ((FictionBook)book).getCategory();
                if (category.equals("Viễn tưởng")){
                    count1++;
                }
            }
        }
        System.out.println("Số sách viễn tưởng là: "+count1);
        int count2=0;
        for (Book book1:books
             ) {
            if (book1 instanceof FictionBook){
                int price= ((FictionBook)book1).getPrice();
                if (price<100){
                    count2++;
                }
            }
        }
        System.out.println("Số sách Fiction có giá nhỏ hơn 100 là: "+count2);
        System.out.println("Nhập cuốn sách muốn tìm");
        Scanner scanner = new Scanner(System.in);
        String input_name = scanner.nextLine();
        boolean check= false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(input_name)){
                System.out.println("Giá: "+books[i].getPrice());
                check=true;
                break;
        }
        }
        if (!check){
            System.out.println("Không tìm thấy sách");
        }
    }
}

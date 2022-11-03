package LR_5;

public class chapter_04_05_5 {
    public static void main(String[] args) {

        NoName test1 = new NoName();
        System.out.print("обращение к классу 1 без указания аргументов: ");
        test1.Show();
        System.out.print("\n");
        test1.setNumb(15);
        System.out.print("вызов метода с присваиванием значения 15: ");
        test1.Show();
        System.out.print("\n");
        test1.setNumb();
        System.out.print("вызов метода без аргументов: ");
        test1.Show();
        System.out.print("\n");

        NoName test2 = new NoName(1004);
        System.out.print("обращение к классу 2 с указанием аргумента 1004: ");
        test2.Show();
        System.out.print("\n");
        test2.setNumb(5);
        System.out.print("вызов метода с присваиванием значения 5: ");
        test2.Show();
        System.out.print("\n");
        test2.setNumb();
        System.out.print("вызов метода с без аргументов: ");
        test2.Show();
        System.out.print("\n");
    }
    static class NoName{
        private int Numb;

        NoName(){
            Numb = 0;
        }

        NoName(int numb){
            if (numb > 99){
                Numb = 100;
            }else {
                Numb = numb;
            }
        }

        public void setNumb(int numb) {
            if (numb > 99){
                Numb = 100;
            }else {
                Numb = numb;
            }
        }
        public void setNumb() {
            Numb = 0;
        }

        public void Show(){
            System.out.println(this.Numb);
        }
    }
}

package MainFun;

import BookSystemFun.*;

public class Main{
    static AddBookInformation addBookInformation = new AddBookInformation();
    static FindBook findBook = new FindBook();
    static Show show = new Show();
    static Delete delete = new Delete();
    static Amend amend = new Amend();
    static Memu bookmemu = new Memu();

    public static void Nextline(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void main(String[] args) {
        while (true) {

            int a = bookmemu.memu();

            while (true) {
                if (a == 1) {
                    addBookInformation.add();
                    Main.Nextline();
                    break;
                } else if (a == 2) {
                    findBook.Find();
                    Main.Nextline();

                    break;
                } else if (a == 3) {
                    amend.bookamend();
                    Main.Nextline();

                    break;
                } else if (a == 4) {
                    delete.bookdelete();
                    Main.Nextline();

                    break;
                } else if (a == 5) {
                    show.bookshow();
                    Main.Nextline();

                    break;
                } else if (a == 6) {
                    System.out.println("谢谢使用，再见!");
                    System.exit(0);
                }

            }
        }
    }
}

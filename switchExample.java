public class switchExample {
    public static void main(String[] args) {
        int num = 24;
        switch(num) {
            case 1:
                System.out.println("My NUmber is 1");
                break;
            case 24:
                System.out.println("My NUmber is 24");
                break;
            case 3:
                System.out.println("My NUmber is 3");
                break;
            default:
                System.out.println("No NUmber Matched");
                break;
        }

        char letter = 'a';
        switch(letter) {
            case 'a':
            case 'b':
            case 'c':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
                break;
        }
    }
}
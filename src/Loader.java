public class Loader
{
    public static void main(String[] args)
    {
        for (int i=0; i<=512; i++) {
            System.out.println("Символ с номером: "+ i +" - " + (char)i);
        }
        System.out.println((int) 'а');
        System.out.println((int) 'я');
        System.out.println((int) 'А');
        System.out.println((int) 'Я');
    }
}

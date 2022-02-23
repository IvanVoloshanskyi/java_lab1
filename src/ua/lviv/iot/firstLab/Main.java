package ua.lviv.iot.firstLab;

public class Main
{
    public static void main(String[] args)
    {
        Helicopter test = new Helicopter();
        Helicopter test2 = new Helicopter(22, 21, "Kaba4ok");
        Helicopter test3 = new Helicopter("Petro", 10, 10, "India");
        System.out.print(test);
        System.out.println(test2);
        System.out.print(test3);
    }

}

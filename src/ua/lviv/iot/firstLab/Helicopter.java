package ua.lviv.iot.firstLab;

public record Helicopter(String name, int max_height_in_km,int max_lifting_weight, String country_produced)
{
    static final int amount_of_air = 50;

    public static int getAmount_of_air()
    {
        return amount_of_air;
    }
    public Helicopter(){
        this("Mriya",3,  1000, "Ukraine \n");
    }
    public Helicopter(int max_height_in_km, int max_lifting_weight,String country_produced)
    {
        this("AT-308", max_height_in_km, max_lifting_weight,country_produced);
    }


    @Override
    public String toString() {
        return String.format("Name: " + this.name + " | " + " Height: " + this.max_height_in_km + " | " + " Max : " + this.max_lifting_weight + " | " + " Country: " + this.country_produced);
    }

}

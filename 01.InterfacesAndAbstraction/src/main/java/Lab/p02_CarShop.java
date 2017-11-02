package Lab;

public class p02_CarShop {

    public static void main(String[] args) {
        p02_Car seat = new p02_Seat("Leon", "gray", 110, "Spain", 23999.99);

        System.out.println(String.format("%s is %s color and have %s horse power", seat.getModel(), seat.getColor(), seat.getHorsePower()));

        System.out.println(seat.toString());

        p02_Car audi = new p02_Audi("Audi", "black", 231, 2, 155.15);
        System.out.println(audi.toString());
    }

}




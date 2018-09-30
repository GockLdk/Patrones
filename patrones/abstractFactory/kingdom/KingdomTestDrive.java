package abstractfactory.kingdom;

import abstractfactory.kingdom.factories.ElfKingdomFactory;
import abstractfactory.kingdom.factories.KingdomFactory;
import abstractfactory.kingdom.factories.MenKingdomFactory;
import abstractfactory.kingdom.parts.Army;
import abstractfactory.kingdom.parts.Castle;
import abstractfactory.kingdom.parts.King;

/**
 * Prueba
 */
public class KingdomTestDrive {

    public static void main(String[] args) {
        createKingdom(new ElfKingdomFactory());
        createKingdom(new MenKingdomFactory());

    }

    public static void createKingdom(KingdomFactory factory) {
        King king = factory.makeKing();
        Castle castle = factory.makeCastle();
        Army army = factory.makeArmy();
        System.out.println("El reino esta creado... ");
        System.out.println(king);
        System.out.println(castle);
        System.out.println(army);
    }

}

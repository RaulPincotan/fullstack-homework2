package enums;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlanetService planetService = new PlanetService(List.of(HeavenlyBody.NEPTUNE,
                HeavenlyBody.GANYMEDE,
                HeavenlyBody.PLUTO,
                HeavenlyBody.VENUS,
                HeavenlyBody.MARS,
                HeavenlyBody.MERCURY,
                HeavenlyBody.EUROPA,
                HeavenlyBody.WHITE_DWARF,
                HeavenlyBody.URANUS,
                HeavenlyBody.CALLISTO,
                HeavenlyBody.SUN
        ));

        System.out.println(planetService.getHeavenlyBodies());
        System.out.println();
        System.out.println(planetService.getHeavenlyBodyWithLargerGravity(0.5));
    }
}

package enums;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PlanetService {
    private final List<HeavenlyBody> heavenlyBodies = new ArrayList<>();

    public PlanetService(Collection<HeavenlyBody> heavenlyBodies) {
        if (heavenlyBodies != null) {
            this.heavenlyBodies.addAll(heavenlyBodies);
        }
    }

    public List<HeavenlyBody> getHeavenlyBodies() {
        return Collections.unmodifiableList(heavenlyBodies);
    }

    public List<HeavenlyBody> getHeavenlyBodyWithLargerGravity(double gravity) {
        return heavenlyBodies.stream()
                .filter(heavenlyBody -> heavenlyBody.getGravity() > gravity)
                .collect(Collectors.toList());
    }
}

package Singleton.IoDH; // Initialization-on-demand holder

public class VirtualUserGenerator {
	
    private VirtualUserGenerator() {

    }

    private static class Holder {
        private static final VirtualUserGenerator virtualUserGenerator = new VirtualUserGenerator();
    }

    public static VirtualUserGenerator getInstance() {
        return Holder.virtualUserGenerator;
    }

}

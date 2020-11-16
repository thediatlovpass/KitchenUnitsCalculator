public class UnitApp {
    public static void main(String[] args) {
        double glasses = 0.5;
        double tableSpoons = 3;
        double teaSpoons = 2;
        System.out.println("Do wykonania ciasta potrzebujesz: " + glasses + " łyżki mąki, co odpowiada: "
                + UnitConverter.convertGlassIntoMl(glasses) + " ml");
        System.out.println("Do wykonania ciasta potrzebujesz: " + tableSpoons + " łyżki proszku do pieczenia, co odpowiada: "
                + UnitConverter.convertTableSpoonIntoMl(tableSpoons) + " ml");
        System.out.println("Do wykonania ciasta potrzebujesz: " + teaSpoons + " łyżki olejku zapachowego, co odpowiada: "
                + UnitConverter.convertTeaSpoonIntoMl(teaSpoons) + " ml");


    }
}

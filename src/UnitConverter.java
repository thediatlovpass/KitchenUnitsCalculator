public class UnitConverter {
    public static double mlInGlass = 250;
    public static double mlInTableSpoon = 15;
    public static double mlInTeaSpoon = 5;

    public static double convertGlassIntoMl(double glasses){
        return glasses * mlInGlass;
    }
    public static double convertTableSpoonIntoMl(double tableSpoons){
        return tableSpoons * mlInTableSpoon;
    }
    public static double convertTeaSpoonIntoMl(double teaSpoons){
        return teaSpoons * mlInTeaSpoon;
    }

}

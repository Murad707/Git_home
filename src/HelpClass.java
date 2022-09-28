public class HelpClass {
    String[]names=new String[10];
    public static void say(){
        HelpClass helpClass=new HelpClass();
        helpClass.names[0]="Ilkin";
        helpClass.names[1]="Murad";
        helpClass.names[2]="Musviq";
        helpClass.names[3]="Nermin";
        helpClass.names[4]="Gunay";
        helpClass.names[5]="Zaur";
        helpClass.names[6]="Elshan";
        helpClass.names[7]="Fidana";
        helpClass.names[8]="Selale";
        helpClass.names[9]="Kamran";
        for (String s: helpClass.names) {
            System.out.println(s);
        }
    }
}



public abstract class Icce {
    public static void main (String[] args) {

        System.out.print("Hola Icce!");
        otherOtro();
        otrometodo();

            for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
            }

        }

    public static void otherOtro() {
       System.out.print("Hola hoydenyyyy!");


        for (int k = 1; k <= 5; k++) {
           System.out.println("k = " + (k +2));
        }
    }

    public static void otrometodo() {
        String hola;
        hola = "Hola yer!";
        System.out.print(hola);
    }


}


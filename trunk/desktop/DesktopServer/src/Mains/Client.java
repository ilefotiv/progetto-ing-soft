package Mains;

public class Client { 
    public static void 
    main(String[] args) 
    { 
        int status = 0; 
        Ice.Communicator ic = null; 
        try { 
            ic = Ice.Util.initialize(args); 
            Ice.ObjectPrx base = ic.stringToProxy("SimplePrinter:default -p 10400");
            System.out.println("Immagino che adessi si blocchi in attesa della risposta del server");
            Demo.PrinterPrx printer=Demo.PrinterPrxHelper.checkedCast(base);
            if(printer == null) 
            throw new Error("Invalid proxy");
            System.out.print(args[0]);
            printer.printString(args[0]); 
        } catch (Ice.LocalException e) { 
            e.printStackTrace(); 
            status = 1; 
        } catch (Exception e) { 
            System.err.println(e.getMessage()); 
            status = 1; 
        } 
        if (ic != null) {
            try { 
                ic.destroy(); 
            } catch (Exception e) { 
                System.err.println(e.getMessage()); 
                status = 1; 
            } 
        } 
        System.exit(status); 
    } 
}

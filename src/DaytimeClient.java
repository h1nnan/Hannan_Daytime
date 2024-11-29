import javax.swing.JOptionPane;

import Utills.Client;

public class DaytimeClient extends Client {
    public DaytimeClient(String pServerIP) {
        super(pServerIP, 13);
    }

    public void processMessage(String pMessage) {
        JOptionPane.showMessageDialog(null,"Utills.Server sendet:\n" + pMessage);
    }

    public static void main(String[] args) {
        DaytimeClient dtc = new DaytimeClient("time.fu-berlin.de");
    }
}

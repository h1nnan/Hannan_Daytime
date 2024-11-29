public class Client {
    public static void main(String[] args) {
        TCPIPConnection tcpipc = new TCPIPConnection("alpha.mike-r.com",17);
        tcpipc.servernachrichtAusgeben();
    }
}

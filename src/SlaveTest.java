
/**
 * Created by I844796 on 03/04/2017.
 */
public class SlaveTest {

    public static void main(String[] args) {

        String connection = "192.168.0.110:32772";
        String ip_servidor = connection.substring(0, connection.indexOf(":"));
        int porta = Integer.parseInt(connection.substring(connection.indexOf(":") + 1));

    }


}
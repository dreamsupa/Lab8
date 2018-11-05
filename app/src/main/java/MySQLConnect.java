import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class MySQLConnect {
    private final Activity main;
        private List<String> list;
        private String URL ="http://192.168.1.7/" ,
                GET_URL ="loginapp/get_post.php",
                SENT_URL ="loginapp/sent_post.php",
                DEL_URL ="loginapp/del_post.php",
                UPD_URL ="loginapp/upd_post.php";

        public String std_id ="";
        public String std_name ="";
        public String std_tel ="";
        public String std_email ="";
        public String string ="";

      public MySQLConnect(){main = null;}

      public MySQLConnect(Activity mainA) {
        this.main = mainA;
        list = new ArrayList<String>();
    }

   public List<String> getData() {
          String url =  URL + GET_URL;

    return list;
      }

}

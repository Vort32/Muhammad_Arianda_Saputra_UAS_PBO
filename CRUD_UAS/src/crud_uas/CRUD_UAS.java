
package crud_uas;

import com.databaseCon.DB;
import com.login.LoginFrame;

/**
 *
 * @author M. ARIANDA SAPUTRA
 */
public class CRUD_UAS {

    public static void main(String[] args) {
       LoginFrame loginObj = new LoginFrame();
       loginObj.show();
       
       DB.loadConnection();
    }
    
}

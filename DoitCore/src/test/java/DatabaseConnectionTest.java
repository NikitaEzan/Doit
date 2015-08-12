import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Almaz on 13.08.2015.
 */
public class DatabaseConnectionTest {
    @Test
    public void testConnection(){
        boolean isTestPassed = false;

        try {
            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:" + "~/db/h2test.db";
            String user = "aeter";
            String password = "aeter";
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement ps2 = conn.prepareStatement("Show tables;");
            ResultSet rs = ps2.executeQuery();

            while(rs.next()){
                rs.getString(1);
            }

            isTestPassed = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertTrue(isTestPassed);
    }
}

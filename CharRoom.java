/* Part of Client module    
 * Creating package and calling Interface_Client constructor.
 * Author:Dhruv raj singh rathore
 * Creation date:3 September 2014
 */

package chat.room;

/**
 *
 * @author HP
 */
public class ChatRoom {
public String username;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Client().setVisible(true);
            }
        });
        
        
    }
    
}

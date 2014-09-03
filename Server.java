/* Part of Server module    
 * Creates server package and starts interface of server
 * Author:Dhruv raj singh rathore
 * Creation date:3 September 2014
 */

package server;

public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    
}

package procad.swing.UIManagerConfiguration;

import javax.swing.UIManager;

/**
 * Class to control the way that the options of buttons in JOptionPane will be displayed.
 * @author Marcelo
 */
public class UIManagerConfiguration {
    
        public static void setLanguageConfiguration() {
            UIManager.put("OptionPane.yesButtonText", "Sim");
            UIManager.put("OptionPane.noButtonText", "Não");
            UIManager.put("OptionPane.okButtonText", "Confirmar");
            UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        }
}

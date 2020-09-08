import java.awt.Dimension;
import java.awt.Toolkit;

public class Tela {

	public static void main(String[] args) {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
	
		Dimension dim = tk.getScreenSize();
		
		System.out.println("A resolucao da tela é: " + dim.width + "X" + dim.height);
		
		
		
		
	}

}

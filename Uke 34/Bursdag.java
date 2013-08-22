import javax.swing.JOptionPane;
import java.util.Calendar;
import javax.swing.JComboBox;


public class Bursdag
{
	public static void main(String[]args)
	{
		String fornavn;
		String førsteSifferstreng;
		Calendar cal = Calendar.getInstance();
		int årstall = cal.get(Calendar.YEAR);

		int fødselsår;
		int sum;

		fornavn = JOptionPane.showInputDialog(
			"Hva heter du?");
		førsteSifferstreng = JOptionPane.showInputDialog(
				"Hvilket år er du født?");
		fødselsår = Integer.parseInt(førsteSifferstreng);
		sum = årstall - fødselsår;
		JOptionPane.showMessageDialog(null, "Hei" + " " + fornavn + ",du fyller" + " " + sum + " " + "år i år!", "Gratulerer", JOptionPane.PLAIN_MESSAGE);
	}
}


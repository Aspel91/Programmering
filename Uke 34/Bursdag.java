import javax.swing.JOptionPane;
import java.util.Calendar;
import javax.swing.JComboBox;


public class Bursdag
{
	public static void main(String[]args)
	{
		String fornavn;
		String f�rsteSifferstreng;
		Calendar cal = Calendar.getInstance();
		int �rstall = cal.get(Calendar.YEAR);

		int f�dsels�r;
		int sum;

		fornavn = JOptionPane.showInputDialog(
			"Hva heter du?");
		f�rsteSifferstreng = JOptionPane.showInputDialog(
				"Hvilket �r er du f�dt?");
		f�dsels�r = Integer.parseInt(f�rsteSifferstreng);
		sum = �rstall - f�dsels�r;
		JOptionPane.showMessageDialog(null, "Hei" + " " + fornavn + ",du fyller" + " " + sum + " " + "�r i �r!", "Gratulerer", JOptionPane.PLAIN_MESSAGE);
	}
}


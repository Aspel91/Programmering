import javax.swing.JOptionPane;

public class Addisjon
{
	public static void main(String[]args)
	{
		String f�rsteSifferstreng;
		String andreSifferstreng;

		double f�rstetall;
		double pi;
		double sum;
		f�rsteSifferstreng = JOptionPane.showInputDialog(
			"Hva er radius?");
			andreSifferstreng = JOptionPane.showInputDialog(
				"Skriv inn pi");
				f�rstetall = Double.parseDouble( f�rsteSifferstreng );
				pi = Double.parseDouble( andreSifferstreng );
				sum = f�rstetall * f�rstetall * pi;
				JOptionPane.showMessageDialog(null, f�rstetall + "*" + f�rstetall + "*" + pi + "=" + sum, "Resultater", JOptionPane.PLAIN_MESSAGE);
			}
		}


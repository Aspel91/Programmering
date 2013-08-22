import javax.swing.JOptionPane;

public class Addisjon
{
	public static void main(String[]args)
	{
		String førsteSifferstreng;
		String andreSifferstreng;

		double førstetall;
		double pi;
		double sum;
		førsteSifferstreng = JOptionPane.showInputDialog(
			"Hva er radius?");
			andreSifferstreng = JOptionPane.showInputDialog(
				"Skriv inn pi");
				førstetall = Double.parseDouble( førsteSifferstreng );
				pi = Double.parseDouble( andreSifferstreng );
				sum = førstetall * førstetall * pi;
				JOptionPane.showMessageDialog(null, førstetall + "*" + førstetall + "*" + pi + "=" + sum, "Resultater", JOptionPane.PLAIN_MESSAGE);
			}
		}


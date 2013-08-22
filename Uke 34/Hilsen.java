import javax.swing.JOptionPane;

public class Hilsen
{
	public static void main(String[] args)
	{
		 String fornavn;
		 String etternavn;
		fornavn = JOptionPane.showInputDialog("Hva er ditt fornavn?");
		etternavn = JOptionPane.showInputDialog("Hva er ditt etternavn?");
		String utskrift;
		utskrift = "Hei på deg " + fornavn + " " + etternavn;
		JOptionPane.showMessageDialog(null, utskrift);
	}
}
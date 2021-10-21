
atul jalala007 akdakdmadmak asdfalfa,lfas xhgpiejrnpfgmniop[cejmr gpioujt.gio[c jiop[gj]]]

asddssdsadasd
/**
 * @author avinash.panicker The service class for the Alien Number system
 * some edit by sangeeth
 */
public class AlienNumberService {

	/**
	 * ORGBASE is the original base of the string passed. for decimal 10
	 */
	private final static int ORGBASE = 10;
	/**
	 * ALIENBASE is the base of the alien number system, here 3
	 */
	private final static int ALIENBASE = 3;

	/**
	 * method where base conversion to the Alien number system happens.
	 * 
	 * @param number is the number received as a string
	 * @return the function returns a string builder as the alien number.
	 */
	public String toAlien(final String number) {
		final String temporaryNum = Integer.toString(Integer.parseInt(number, ORGBASE), ALIENBASE);
		final StringBuilder actualNumber = new StringBuilder();

		for (int i = 0; i < temporaryNum.length(); i++) {
			switch (temporaryNum.charAt(i)) {
			case '0':
				actualNumber.append('0');
				break;
			case '1':
				actualNumber.append('F');
				break;
			case '2':
				actualNumber.append('8');
				break;
			}
		}
		return actualNumber.toString();
	}

	/**
	 * method where base conversion to the Decimal number system happens.
	 * 
	 * @param number is the Alien number received as a string
	 * @return the function returns a string builder as the decimal number.
	 */
	public String toDecimal(final String number) {
		final StringBuilder temporaryNum = new StringBuilder();

		for (int i = 0; i < number.length(); i++) {
			switch (number.charAt(i)) {
			case '0':
				temporaryNum.append('0');
				break;
			case 'F':
				temporaryNum.append('1');
				break;
			case '8':
				temporaryNum.append('2');
				break;
			}
		}
		final String actualNumber = Integer.toString(Integer.parseInt(temporaryNum.toString(), ALIENBASE), ORGBASE);
		return actualNumber.toString();
	}
}
iureghfxiuyerghfcruyeghourh
efiuwxghmioutwghmiutwghj
iusdfhmgiouehrtx giuj
fcgkojmrtwioughmtwiorughiortughniotghjo
ciruhgmiurthcgimuthj
jmhgiu

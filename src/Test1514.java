import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author Z.Y.T
 * 
 *         2014年6月2日 上午2:38:49
 */
public class Test1514 {
	public static StreamTokenizer stin;
	public static StringBuilder sbout;


	public static void main(String[] args) throws IOException {
		stin = new StreamTokenizer(new BufferedReader(new InputStreamReader(
				System.in)));
		sbout = new StringBuilder();

		double base, result;
		int exponent, lines;

		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setExponentSeparator("e");
		dfs.setInfinity("INF");

		DecimalFormat df = new DecimalFormat("0.00E00", dfs);

		while (stin.nextToken() != StreamTokenizer.TT_EOF) {
			lines = (int) stin.nval;
			while (lines-- > 0) {
				stin.nextToken();
				base = stin.nval;
				stin.nextToken();
				exponent = (int) stin.nval;
				result = pow(base, exponent);
				String formatOutput = df.format(result);
				if ("INF".equals(formatOutput)) {
					sbout.append("INF\n");
				} else {
					if (!formatOutput.contains("e-")) {
						formatOutput = formatOutput.replace("e", "e+");
					}
					sbout.append(formatOutput).append("f").append("\n");
				}
			}
		}

		System.out.println(sbout);
	}

	public static double pow(double d, int e) {
		if (0 == e) {
			return 1.0;
		}

		if (1 == e) {
			return d;
		}

		boolean reciprocal = false;
		if (0 > e) {
			Double zero = new Double(0.0);
			if (zero.equals(d)) {
				return Double.POSITIVE_INFINITY;
			}
			reciprocal = true;
			e = ~e + 1;
		}

		double result = pow(d, e >> 1);
		result *= result;
		if (1 == (e & 1)) {
			result *= d;
		}

		if (reciprocal) {
			result = 1.0 / result;
		}

		return result;
	}

}
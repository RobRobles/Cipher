import java.util.ArrayList;


public class Cipher {

	public static void main(String[] args) {

		//Shifting key
		int key = 9; 

		//Final List
		ArrayList<String> end = new ArrayList<String>();

		//ArrayList for the encrypted message
		ArrayList<String> secrete = new ArrayList<String>();
		String encoded = "efn kyzj zj jkfip rcc rsflk yfn dp czwv xfk wczggvu-klievu lgjzuv ufne reu z'u czbv kf krbv r dzelkv aljk jzk izxyk kyviv z'cc kvcc pfl yfn z svtrdv kyv gizetv fw r kfne trccvu svc rzi";

		//adding the string encoded to secrete ArrayList
		for(int i = 0; i < encoded.length(); i ++)
		{
			char temp = encoded.charAt(i);
			String temp1 = "";
			temp1 = temp1 + temp; 
			secrete.add(temp1);
		}

		//ArrayList for the alphabet
		ArrayList<String> alphabet = new ArrayList<String>();
		String alpha = "abcdefghijklmnopqrstuvwxyz";

		//keeping track of overflow
		int mult = encoded.length()/26; 
		//dealing with overflow
		for(int k = 0; k < mult; k++)
		{
			alpha = alpha + alpha; 
		}

		//adding the string alpha to alphabet ArrayList
		for(int j = 0; j < alpha.length(); j++)
		{
			char temp = alpha.charAt(j);
			String temp1 = "";
			temp1 = temp1 + temp; 
			alphabet.add(temp1);
		}

		for(int a = 0; a < secrete.size(); a++)
		{
			for(int k = 0; k < alphabet.size(); k++)
			{

				if(secrete.get(a).equals(" "))
				{
					end.add(" ");
					break;
				}
				if(secrete.get(a).equals("-"))
				{
					end.add("-");
					break;
				}
				if(secrete.get(a).equals("'"))
				{
					end.add("'");
					break;
				}

				if(secrete.get(a).equals(alphabet.get(k)))
				{
					end.add(alphabet.get(k + key)); 
					break;
				}
			}
		}

		for(int i = 0; i < end.size(); i ++)
		{
			System.out.print(end.get(i));
		}


	}

}

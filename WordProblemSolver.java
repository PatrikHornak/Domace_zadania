package sk.euba.fhi.tajj.kalkulacka;

public interface WordProblemSolver
{
	int solve(String sentence);
}

class MySolver implements WordProblemSolver
{
	@Override
	public int solve(String sentence)
	{
		sentence=sentence.replace("?", "");
		String[] words=sentence.split("\\s+");

		try
		{
			int result=Integer.parseInt(words[2]);

			for (int a=3; a<words.length; a++)
			{
				if (words[a].equals("plus"))
				{
					result=result+Integer.parseInt(words[a+1]);
					a++;
				}
				else if (words[a].equals("minus"))
				{
					result=result-Integer.parseInt(words[a+1]);
					a++;
				}
				else if (words[a].equals("multiplied"))
				{
					result=result*Integer.parseInt(words[a+2]);
					a+=2;
				}
				else if (words[a].equals("divided"))
				{
					result=result/Integer.parseInt(words[a+2]);
					a+=2;
				}
				else if (words[a].equals("raised"))
				{
					int tmp=Integer.parseInt(words[a+3].replace("th",""));
					int tmp2=result;

					for (int b=1; b<tmp; b++)
					{
						result = result * tmp2;
					}
					a+=4;
				}
				else
					{
					throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
					}
			}

			return result;
		}
		catch (IllegalArgumentException e)
		{
			throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
		}
	}
}
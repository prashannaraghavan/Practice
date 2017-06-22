import java.util.*;

class CallRegister
{
	static HashMap<String, Integer> register = new HashMap<String, Integer>();

	static void recordIncomingCall(String callee,int duration)
	{
		register.put(callee,duration);
	}

	static void recordOutgoingCall(String callee,int duration)
	{
		register.put(callee,duration);
	}

	static int longestCall()
	{
		int max = 0;
		for(int m:register.values())
		{
			if(m>max)
				max = m;
		}

		return max;
	}

	public static void main(String[] args) {
		recordIncomingCall("A",12);
		recordIncomingCall("B",19);
		recordOutgoingCall("C",15);
		recordOutgoingCall("D",5);

		System.out.println(longestCall());
	}
}
import java.util.*;

class CallRegister
{
	enum CallType
	{
		Incoming,
		Outgoing
	};

	static int icount=0;
	static int ocount=0;

	static HashMap<String, Integer> register = new HashMap<String, Integer>();

	static String newName(String callee,CallType type)
	{
		StringBuilder sb = new StringBuilder (String.valueOf (callee));
		if(type == CallType.Incoming)
			sb.append (++icount);
		else
			sb.append (++ocount);
		return sb.toString();
	}

	static void recordIncomingCall(String callee,int duration)
	{
		String name = "";
		if (register.containsKey(callee)) {
			name = newName(callee,CallType.Incoming);
		}

		else{
			name = callee;
		}

		register.put(name,duration);
	}

	static void recordOutgoingCall(String callee,int duration)
	{
		String name = "";
		if (register.containsKey(callee)) {
			name = newName(callee,CallType.Outgoing);
		}

		else{
			name = callee;
		}

		register.put(name,duration);
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
		
		recordIncomingCall("A",19);
		recordIncomingCall("A",12);
		recordOutgoingCall("C",15);
		recordOutgoingCall("D",5);

		System.out.println("Longest call duration was : "+longestCall()+" minutes");
	}
}
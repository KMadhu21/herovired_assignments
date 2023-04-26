class Solution {
    public static boolean ispalindrome(int st,int e,String s)
	{
		while(st<e)
		{
			if(s.charAt(st)!=s.charAt(e))
			{
				return false;
			}
			st++;
			e--;
		}
		return true;
	}
    public String longestPalindrome(String s) {
        int start=0,start2=0;
		int end=s.length()-1;
		int len=Integer.MIN_VALUE;
		String res="";
		while(start<=s.length()-1)
		{
			while(start2<=end)
			{
				if(ispalindrome(start2,end,s))
				{
					if(len>=(end-start2+1))
					{
						break;
					}
					res=s.substring(start2,end+1);
					len=end-start2+1;
					break;
				}
				end--;
				
				
			}
			start2=start+1;
			start++;
			end=s.length()-1;
		}
        return res;
        
    }
}
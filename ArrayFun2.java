
public class ArrayFun2
{
    /*
    public boolean allFactorsOfSum(int[] nums)
    {
        
    }
*/
    public boolean isThere(int[] nums, int num)
    {
        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i] == num)
            {
                return true;
            }
            
        }
        return false;
    }
    public String[] doubleArr(String[] strs)
    {
        int p = (strs.length*2);
        
        String[] concat = new String[p];
        int x = 0;
        for(int i = 0;i<strs.length-1;i++)
        {
            concat[x] = strs[i];
            x++;
            concat[x] = strs[i];
            
        }
        return concat;
    }


    public int indexOf(int[] nums, int num)
    {
        int count = 0;
         for(int i = 0; i<nums.length;i++)
        {
            if(nums[i] == num)
            {
                count++;
            }
            
        }
        if(count == 0)
        {
            return -1;
        }
        return count;
    }

    public int lastIndexOf(int[] nums, int num)
    {
        int ret = 0;
        for(int i = 0;i <nums.length;i++)
        {
            if(nums[i] == num)
            {
                ret = i;
            }
        }
        return ret;
    }

    public boolean isIncreasing(double[] nums)
    {
        for(int i = 0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public int largestSpan(int[] nums)
    {
        int max = 0;
        int largestSpan = 1;
        boolean increasing = false;
        for(int i = 0; i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                increasing = true;
                largestSpan++;
            }else
            {
                if(increasing =true)
                {
                    increasing = false;
                    if(max<largestSpan)
                    max = largestSpan;
                    largestSpan = 1;
                    
                }
            }
        }
        
        
            return max;
         
    }




    public ArrayFun2()
    {
        
    }

    
}

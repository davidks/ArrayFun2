

public class twoDimensionalArrays
{
    void print(String [][] someTable)
    {
        for(int i = 0; i<someTable.length;i++)
        {
            System.out.println("");
            for(int x = 0; x<someTable[i].length;x++)
            {
                System.out.print(someTable[i][x] + "\t");
            }
        }
    }
    public int sum(int[][] arr)
    {
        int addSum = 0;
        for(int i = 0; i<arr.length;i++)
        {
            for(int x = 0; x<arr[i].length;x++)
            {
                addSum += arr[i][x];
            }
        }
        return addSum;
    }
    
    
    
    public double mean( int[][] arr)
    {
        double addSum = 0;
        int div2 = 0;
        for(int i = 0; i<arr.length;i++)
        {
            for(int x = 0; x<arr[i].length;x++)
            {
                div2++;
                addSum += arr[i][x];
            }
        }
        return addSum/div2;
    }
    
    public void printRow(int[][] arr, int row)
    {
       
        int addSum = 0;
         for(int i = 0; i<arr.length;i++)
        {
            System.out.println(arr[row][i]);
           
        }
        
    }
    
    
    public twoDimensionalArrays()
    {
        /*
         String[][] table =  {
                        {"a","b","c"},
                        {"d","e","f","g"},                        
                        {"g","h"},
                        {}
                            };

    int table2[][] = {
                        { 1, 4, 5},
                        {5,11,12},                        
                        {22, 45},
                            };
                            
                            print(table);
                            
                            
                             System.out.println(table.length);
    System.out.println(table[0].length);
    System.out.println(table[1].length);
    System.out.println(table[2].length);
    */
    }
    
   
   
}

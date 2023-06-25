//https://practice.geeksforgeeks.org/problems/unique-rows-in-boolean-matrix/1
class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        Set<ArrayList<Integer>> uniqueRows = new LinkedHashSet<>(); // Use LinkedHashSet to maintain insertion order
        
        // Traverse the matrix row by row
        for (int i = 0; i < r; i++) {
            ArrayList<Integer> k= new ArrayList<Integer>();
            
            // Construct a string representation of the row
            for (int j = 0; j < c; j++) {
                k.add(a[i][j]);
            }
            
            // Add the row to the set if it's not already present
            if (!uniqueRows.contains(k)) {
                uniqueRows.add(k);
            }
        }
        ArrayList<ArrayList<Integer>> q = new ArrayList<ArrayList<Integer>>();
        for(ArrayList<Integer> z:uniqueRows){
            q.add(z);
        }
        return q;
    }
}

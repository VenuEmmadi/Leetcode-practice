//Here we Computing from END to START
class Solution {
  public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> row = new ArrayList();
        for(int i = 0; i < numRows; i++) {
            for(int j = row.size() - 1; j >= 1 ; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            //Append the 1 to the last of array
            row.add(1);
            res.add(new ArrayList(row));
        }
        return res;
    }
}
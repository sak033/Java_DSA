import java.util.*;

class PascalsTriangle{
    public static void main(String[] args){
     
     List<List<Integer>> res=generate(5);
     System.out.println(res);

     List<Integer> lastRowOfPascals=lastRow(res);
     System.out.println(lastRowOfPascals);

    }

    public static List<List<Integer>> generate(int numRow){
        List<List<Integer>> result=new ArrayList<>();

        if(numRow==0) return result;

        List<Integer> firstRow=new ArrayList<>();

        firstRow.add(1);
        result.add(firstRow);

        if(numRow==1) return result;

        for(int i=1; i<numRow; i++){
            List<Integer> prevRow=result.get(i-1);

            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=0; j<i-1; j++){
                row.add(prevRow.get(j)+ prevRow.get(j+1));
            }
            row.add(1);

            result.add(row);



        }

        return result;
    }

    public static List<Integer> lastRow(List<List<Integer>> list){
        List<Integer> lastrow=list.get(list.size()-1);

        return lastrow;
    }
}
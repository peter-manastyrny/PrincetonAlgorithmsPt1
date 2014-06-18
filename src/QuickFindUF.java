/**
 * Created by MANASTYP on 18.06.14.
 */
public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public String toString(){
        int length = id.length;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++ ){
            result.append(id[i]);
            result.append(" ");
        }
        return result.toString();
    }

    public boolean connected (int p, int q){
        return id[p] == id[q];
    }

    public void union (int p, int q){
        int pid = id[p];
        int qid = id[q];
        int length = id.length;

        for  (int i = 0; i < length; i++ ){
            if (id[i] == qid)
                id[i] = pid;
        }





    }
}

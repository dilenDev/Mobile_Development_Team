public class Question6 {


    public static void main(String[] args) {

        int a[] = {6, 4, 5, 7}, b[] = {1, 3, 6, 9};
        int size = a.length;
        int size1 = b.length;

        mergeArrays(a, b, size, size1);



    }

    static void mergeArrays(int a[], int b[], int n, int m)
    {


        Map<Integer,Boolean> mp = new HashMap<Integer,Boolean>();

        for(int i = 0; i < n; i++)
        {
            mp.put(a[i], true);
        }
        for(int i = 0;i < m;i++)
        {
            mp.put(b[i], true);
        }
        for (Map.Entry<Integer,Boolean> me : mp.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
    }
    }


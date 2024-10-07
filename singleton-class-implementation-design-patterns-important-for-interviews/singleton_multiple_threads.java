public class singleton_multiple_threads{
    public static int obj_count=0;
    private singleton_multiple_threads(){
        obj_count++;
    }
    private static singleton_multiple_threads uniqueinstance=new singleton_multiple_threads();
    public static singleton_multiple_threads getinstance(){
        return uniqueinstance;
    }
}
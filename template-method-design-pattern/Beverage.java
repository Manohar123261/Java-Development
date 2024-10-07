public abstract class Beverage{
    private void pour(int qty){
        System.out.println("pour "+qty+" ml of Beverage");
    }
    protected abstract void addCondiment();
    private void stir(){
        System.out.println("Stir for 30 seconds");
    }
    private void serve(){
        System.out.println("Serve with manners");
    }
    final void templateMethod(int qty){
        pour(qty);
        addCondiment();
        if(hook())
            stir();
        serve();
    }
    protected boolean hook(){
        return true;
    }
}
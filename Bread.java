public class Bread extends Product{
    
    public Bread(String name, double cost){
        super(name,cost);
        
    }


    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        return localString.toString();
    }
}

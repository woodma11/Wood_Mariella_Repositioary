abstract class Cookie{
   private String flavor;
   private int size;
   protected boolean isBaked;
   
   Cookie(String flav, int size, boolean isBaked){
       this.flavor= flav;
       this.size= size;
       this.isBaked= isBaked;
   }
   
   abstract void bake();
   
   void printInfo(){
    System.out.println("Flavor:"+this.flavor);
    System.out.println("Size:"+this.size);
    System.out.println("Baked?:"+this.isBaked);
}
}

class ChocolateChipCookie extends Cookie{
    ChocolateChipCookie(String flavor,int size, boolean isBaked){
        super(flavor,size,isBaked);
    }
    @Override
    void bake(){
        System.out.println("Preheat to 350 degrees and bake for 8 mins");
        System.out.println("Bake and be safe:p");
        this.isBaked=true;
    }
}

class Main {
    public static void main(String[] args) {  
        ChocolateChipCookie myCookie = new ChocolateChipCookie("Chocolate Chip Cookie",5,true);
        myCookie.printInfo();
        myCookie.bake();
    }
}
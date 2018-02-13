package assign7;

class Fraction {               //in file Fraction.java
   
    private int a, b;            //numerator and denominator
  
    Fraction(int x, int y) {    //constructor
      a = x; b = y;
   }
    
   public String toString(){ 
       
      return a + "/" + b; 
      
   }
   
   public Fraction sum(Fraction x){ 
       
     return new Fraction(a * x.b + b * x.a, b * x.b);
     
   }
   
   public int compareTo(Fraction x){
       
      return a * x.b - b * x.a; //result: 0, <0 o >0
      
   }
   
   public Fraction sub(Fraction x) {

       return new Fraction(x.b * this.a - this.b * x.a, x.b * this.b);

   }
   
   public Fraction div(Fraction x) {

       return new Fraction(this.a * x.b, this.b * x.a);

   }
   
   public Fraction mul(Fraction x) {
    
       return new Fraction(this.a * x.a, this.b * x.b);

   }
   
   public Fraction simple() {
   
       return new Fraction(this.a / gcd(this.a, this.b), this.b / gcd(this.a, this.b));
       
   }
   
   public int gcd(int a, int b) {
       
        if (b == 0) return a;
        return gcd(b, a % b);
        
    }
   
}
 


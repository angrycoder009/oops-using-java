package oops.Revision;

public class objectAndClasses {
    public static void main(String[] args){
        car obj1 = new car("silver","baron",2023);
        car obj2 = new car("bronze","bugati",2023);
        System.out.println(obj1);
        System.out.println(obj2);
    }
    static class car{
        String make;
        String model ;
        int year;
        public car(String make, String model, int year){
            this.make=make;
            this.model=model;
            this.year =year;
        }
        public String getMake(){
            return make;
        }
        public String getModel(){
            return model;
        }
        public int getYear(){
            return year;
        }
        @Override
        public String toString(){
            return "Car[make :"+make+",model:"+model+"year:"+year+"]";
        }
    }
}

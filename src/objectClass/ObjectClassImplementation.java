package objectClass;

public class ObjectClassImplementation {
    int id ;
    String name ;

    ObjectClassImplementation(int id , String name){
        this.id = id ;
        this.name = name ;

    }
    public String toString(){
        return id+ " " + name ;

    }
//    public boolean equals(Object obj){
//        if(this.id = obj.id){
//            return true ;
//        }
//        return false ;
//
//    }
    public static void main(String[] args) {
        ObjectClassImplementation object = new ObjectClassImplementation(1 , "test") ;
//        ObjectClassImplementation obj1 = new ObjectClassImplementation(1 , "Hello");
//        ObjectClassImplementation obj2 = new ObjectClassImplementation(1 , "Hello");
        System.out.println(object.toString());
//        obj1.equals(obj2);
//        obj2.equals(obj1);
    }



}

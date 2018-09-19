public class TriangleChecker {

    boolean isRightTriangle (Triangle trojkat){

        if( trojkat.getBokA()*trojkat.getBokA() + trojkat.getBokB()*trojkat.getBokB() == trojkat.getBokC()*trojkat.getBokC() ){
           return true;
        } else {
           return false;
        }
    }
}

class Array{
    void demoArray(){
        int[] ages={1,2,3,4,5};
        for(int i=0;i<ages.length;i++){
            System.out.println(ages[i]);
        }
    }
}
public class Main{
public static void main(String[] args){
	Array obj=new Array();
    obj.demoArray();
}
}

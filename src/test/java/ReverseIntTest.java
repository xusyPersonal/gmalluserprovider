import java.util.LinkedList;

public class ReverseIntTest {

    public static void main(String[] args) {

        int b=  123 ;  ///450  054  2147483599 0x80000000
//        int a = ft.reverseInt(b);
        ReverseIntTest ft = new ReverseIntTest();
        Long initTime = System.currentTimeMillis() ;
        int a =ft.reverseInt(b) ;
        Long endTime = System.currentTimeMillis() ;
        System.out.println("reverseInt 耗时："+(endTime-initTime)+"ms");


        initTime = System.currentTimeMillis() ;
        a =ft.reverseIntUseLinkedList(b);
        endTime = System.currentTimeMillis() ;
        System.out.println("reverseIntUseList 耗时："+(endTime-initTime)+"ms");
    }

    //    反转int型数据
    public int reverseIntUseLinkedList(int num){
        Long res= 0L;
        System.out.println("初始值num::"+num);
        LinkedList<Integer> list = new LinkedList<Integer>() ;
        while (num!=0) {
            int temp = num%10;  // 取模 取出个位数 3、 2、 1
            num=num/10; //取整 取出  12、 1、 0
            //栈
            list.addLast(temp);

        }

        while(!list.isEmpty()){
            res=res*10+list.removeFirst();
        }
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE){
            res = 0L ;
        }
        int result = new Long(res).intValue() ;

        System.out.println("反转之后 result::"+result);
        return result;

    }


    //    反转int型数据
    public int reverseInt(int num){
        Long res= 0L;
        System.out.println("初始值num::"+num);
        LinkedList<Integer> list = new LinkedList<Integer>() ;
        while (num!=0) {
            int temp = num%10;  //取出个位数 3、 2、 1
            num=num/10;
            res=res*10+temp; // 0*10+3 、3*10+2、32*10+1

        }
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE){
            res = 0L ;
        }
        int result = new Long(res).intValue() ;

        System.out.println("反转之后 result::"+result);
        return result;

    }
}

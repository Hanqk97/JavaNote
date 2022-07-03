package CommonClass.StringBuilder;

public class commonMethod {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello world!");
        //增
        sb.append("Today");
        //删
        sb.delete(1,6);//删除位置在的[3，7）字符
        System.out.println(sb);//hworld!Today

        sb.deleteCharAt(0);//删除位置在0的字符
        //改==》插入
        StringBuilder sb1=new StringBuilder("$123456");
        sb1.insert(3,",");//在3的位置插入","
        System.out.println(sb1);//$12,3456
        //改==》替换
        sb1.replace(2,5,"abc");//在[2,5)位置插入字符串
        System.out.println(sb1);//$1abc456
        sb1.setCharAt(2,'1');
        System.out.println(sb1);// $11bc456

        //查
        StringBuilder sb2=new StringBuilder("fish&meat");
        for (int i=0;i<sb2.length();i++){
            System.out.print(sb2.charAt(i)+"\t");
        }//f	i	s	h	&	m	e	a	t
        System.out.println();
        //截取
        String str=sb2.substring(2,4);//截取[2,4)返回的是一个新的String，对StringBuilder没有影响
        System.out.println(sb2);//fish&meat
        System.out.println(str);//sh
    }
}

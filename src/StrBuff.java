public class StrBuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("yo");
        sb.append(" bro");
        System.out.println(sb);
        sb.insert(3, "cool ");
        System.out.println(sb);
        sb.replace(0, 2, "hi");
        System.out.println(sb);
    }
}

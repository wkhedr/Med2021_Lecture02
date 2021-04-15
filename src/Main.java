import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int a[] = new int [50];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for(int n : a){
            System.out.println(n);
        }
        String name = JOptionPane.showInputDialog(null,"Enter your Name",
                "Name",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Hello "+name,"Hello",JOptionPane.INFORMATION_MESSAGE);
        String str1, str2;
        str1 = "lllp";
        int n1 = 0;
        try {
            n1 = Integer.parseInt(str1);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
        str2 = "111";
        int n2 = Integer.parseInt(str2);
        //String str = str1+ str2;

        System.out.println(n1+n2);
	// write your code here
    }
}

public class writeDataIntotextFile{
    public static void main(String[]args){
        FileWriter fw=new FileWriter("C:\Users\sanjay\OneDrive\Desktop\java\\test21.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Selenium with Java");
         bw.write("Selenium with c++");
          bw.write("Selenium with python");
          System.out.println("Finished!!");
          bw.close();
        
    }
}
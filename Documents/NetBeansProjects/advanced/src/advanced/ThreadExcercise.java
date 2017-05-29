package advanced;

import java.util.Scanner;

public class ThreadExcercise extends Thread {
    public static void main (String...str) throws InterruptedException{
        
        Thread1 th1=new Thread1();
         
        th1.setPriority(MIN_PRIORITY);
        th1.start();
        //Thread.yield();
        th1.setName(" Group 5"); 
        System.out.println(" ");
        System.out.println("the name of the thrread is"+  th1.getName());
        th1.join();
        Thread2 th2=new Thread2();
        th2.setPriority(MAX_PRIORITY);
        th2.start();
        th2.join();
        Thread3 th3=new Thread3();
        th3.setPriority(NORM_PRIORITY);
        th3.start();
        th3.join();
        System.out.println(th1.getSum1()+th2.getSum2()+th3.getSum3());
    }
}
class Thread1 extends Thread{
    int sum1=0;
    @Override
   public void run(){
    for(int i=1;i<=3;i++){
      sum1=sum1+i;
    }
    System.out.println("the sum of Thread 1 is= "+sum1);
   }
    public int getSum1(){
        return sum1;
    }
}
class Thread2 extends Thread{
    int sum2=0;
    @Override
    public void run(){
        for(int i=4;i<=6;i++){
            sum2=sum2+i;
        }
    System.out.println("the sum of Thread 2 is= "+sum2);
    }
    public int getSum2(){
        return sum2;
    }

}
class Thread3 extends Thread{
    int sum3=0;
    @Override
    public void run(){
        for(int i=7;i<=10;i++){
            sum3=sum3+i;
        }
    System.out.println("the sum of the thread 3 is= "+sum3);

    }
    public int getSum3(){
        return sum3;
    }
//ystem.out.println("the sum of the thread 3 is= "+sum3);
//
//    }
//    public int getSum3(){
 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(helloworld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(helloworld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(helloworld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(helloworld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new helloworld().setVisible(true);
                
            }
        });
    }
}

}

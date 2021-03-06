/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan19.saldotabungan;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : Program ini berisi program Saldo Tabungan
 */
public class PBOIF210119069Latihan19SaldoTabungan {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) 
        DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        int lama,i;
        String hasil;
        float bunga;
        double saldoAwal,saldoAkhir;
        
        System.out.print("Saldo Awal : Rp. ");
        saldoAwal = scanner.nextDouble();
        
        System.out.print("Bunga/Bulan : ");
        bunga = scanner.nextFloat();
        
        System.out.print("Lama (bulan) : ");
        lama = scanner.nextInt();
        
        bunga = (float) (bunga/100);
        System.out.println(bunga);
        
        for (i = 1; i <= lama; i++) {
            saldoAkhir = (saldoAwal * 0.15) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldoAkhir));
            saldoAwal = saldoAkhir;
        }
      
    System.out.println("-------------------------------------");
    System.out.println("Developed by : Tri Novarel Rahmadhani");
    }
    
}

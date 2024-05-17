/* Kita akan membuat aplikasi untuk perhitungan parkir, biaya parkir yang harus dibayar ditentukan oleh
beberapa hal berikut:
● 5 jam pertama biayanya $1
● Setelah itu, setiap jam akan di charge $0.5
● Apabila sampai 24 jam, biayanya menjadi flat $15
Contoh:
● Apabila kita parkir selama 26 jam, perhitungan biayanya adalah sebagai berikut: 
15+(2*0.5) = $16.0, 
karena sudah memenuhi 24 jam dan ada kelebihan 2 jam
● Apabila parkir selama 8 jam, perhitungannya sebagai berikut 5 + (0.5*3) = $6.5 */
  
public class ParkingFeeCalculator {
    public static double calculateParkingFee(int hours) {
        double fee;
        if (hours <= 5) {
            fee = hours * 1.0;
        } else if (hours <= 24) {
            fee = 5 + (hours - 5) * 0.5;
        } else {
            int extraHours = hours % 24;
            int fullDays = hours / 24;
            fee = fullDays * 15 + extraHours * 0.5;
        }
        return fee;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testHours = {2, 8, 26, 5, 24, 30};
        for (int hours : testHours) {
            double fee = calculateParkingFee(hours);
            System.out.println("Parking for " + hours + "hours costs $" + fee);
        }
    }
}

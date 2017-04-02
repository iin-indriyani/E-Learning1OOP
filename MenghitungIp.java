import java.util.Scanner;
public class MenghitungIp {
    public static void main(String[] args) {
      MenghitungIp ipmhs = new MenghitungIp();    
      Scanner input = new Scanner(System.in);
      float ip, total_ip = 0, rerata = 0;
      int jmlMhs = 0, jmlMhsLulus = 0, jmlMhsTidakLulus = 0;
      boolean exit = false;

System.out.println();
System.out.println("\n*****************\n");
System.out.println("  INPUT");
System.out.println();
      System.out.print("Masukan IP: ");
      ip = input.nextFloat();
      while(ip!=-999){
          if(ipmhs.isWithinRange(ip, 0, 4)==1){
              jmlMhs++;
          	if (ip >= 2.72 && ip<=4.0){
              	jmlMhsLulus++;
          	}
	         else {
		          jmlMhsTidakLulus++;
	         }
           total_ip += ip;
         }
         else if (ip < 0) {
            exit = true;
            while (!exit);
          }
          else {
              System.out.println("Data yang dimasukkan tidak valid");
              System.out.println("Silahkan Masukkan data yang benar !!");

          }
        System.out.print("Masukan IP: ");
        ip = input.nextFloat();
        }  

    System.out.println();
    System.out.println("\n*****************\n");
    System.out.println("  OUTPUT");
    System.out.println();
    if (jmlMhs>0){
    rerata = total_ip / jmlMhs;
		System.out.println("Jumlah Mahasiswa adalah : " +jmlMhs);
		System.out.println("Jumlah Mahasiswa Lulus adalah : " +jmlMhsLulus); 
		System.out.println("Jumlah Mahasiswa Tidak Lulus adalah : " +jmlMhsTidakLulus); 
    System.out.println("Jumlah IP Mahasiswa : " +total_ip);
    System.out.println("Rata-Rata IP Mahasiswa : " + rerata);
    }
else {
  System.out.println("Tidak ada data.");
}
    System.out.println();
    System.out.println("\n*****************\n");
    }
		int isWithinRange(Float x, int min, int max){
        if(x >= min && x <= max){
            return 1;
        }
		else{
            return 0;
        }
    }
}
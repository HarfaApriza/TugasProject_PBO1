package perpustakaan;

public class buku {
        public String bukuweb;
        public String bukuphp;
        public String bukumatematika;
        public String bukufisika;
        public String bukubahasamandarin;
        public String bukubahasaindonesia;
        public String bukuipa;
        public String bukuips;



        public void tampil(){
                System.out.println("Selamat Datang di Perpustakaan");
        }
        public void bt() {
                System.out.println("1. " +bukuweb);
                System.out.println("2. " +bukuphp);
        }
        public void ilmu(){
                System.out.println("1. " +bukumatematika);
                System.out.println("2. " +bukufisika);
        }
        public void bahasa(){
                System.out.println("1. " +bukubahasamandarin);
                System.out.println("2. " +bukubahasaindonesia);
                System.out.println("3. " +bukuipa);
                System.out.println("4. " +bukuips);
        }
    }

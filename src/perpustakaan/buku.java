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

        public String getBukuweb() {
                return bukuweb;
        }

        public void setBukuweb(String bukuweb) {
                this.bukuweb = bukuweb;
        }

        public String getBukuphp() {
                return bukuphp;
        }

        public void setBukuphp(String bukuphp) {
                this.bukuphp = bukuphp;
        }

        public String getBukumatematika() {
                return bukumatematika;
        }

        public void setBukumatematika(String bukumatematika) {
                this.bukumatematika = bukumatematika;
        }

        public String getBukufisika() {
                return bukufisika;
        }

        public void setBukufisika(String bukufisika) {
                this.bukufisika = bukufisika;
        }

        public String getBukubahasamandarin() {
                return bukubahasamandarin;
        }

        public void setBukubahasamandarin(String bukubahasamandarin) {
                this.bukubahasamandarin = bukubahasamandarin;
        }

        public String getBukubahasaindonesia() {
                return bukubahasaindonesia;
        }

        public void setBukubahasaindonesia(String bukubahasaindonesia) {
                this.bukubahasaindonesia = bukubahasaindonesia;
        }

        public String getBukuipa() {
                return bukuipa;
        }

        public void setBukuipa(String bukuipa) {
                this.bukuipa = bukuipa;
        }

        public String getBukuips() {
                return bukuips;
        }

        public void setBukuips(String bukuips) {
                this.bukuips = bukuips;
        }

        public buku() {
                this.bukuweb = "Harfa Apriza";
                this.bukuphp = "19630648";
                this.bukumatematika ="4C REG BANJARABARU";
        }

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

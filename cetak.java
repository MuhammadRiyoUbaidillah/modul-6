package interfase;

public class cetak {
    public static void main (String[] args){
        komputer [] lenopo = new komputer [3];
        
        lenopo[0]=new pc();
        lenopo[1]=new laptop();
        lenopo[2]=new netbook();
        
        for (komputer rezen : lenopo) {
            rezen.hidupkan_os();
            rezen.matikan_os();
            rezen.klik_kanan();
            rezen.klik_kiri();
            rezen.tekan_enter();
            rezen.cetak_data();
        }
    }
}

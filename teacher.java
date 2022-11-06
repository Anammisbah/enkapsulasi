package tugas;


class teacher{
    private String Nama;
    private String Nip;
    private String MataKuliah;

    teacher(String nama, String nip, String matkul) {

        this.Nama = nama;
        this.Nip = nip;
        this.MataKuliah = matkul;
    }

    //Write Only menggunakan getter

    public void SetData(String nama, String nip,String matkul) {
        this.Nama = nama;
        this.Nip = nip ;
        this.MataKuliah = matkul;
    }

    //Read Only menggunakan setter
    public String getNama() {
        System.out.println("Nama    : " + Nama);
        return Nama;
    }

    public String getNim() {
        System.out.println("Nim     : " + Nip);
        return Nip;
    }

    public String getMataKuliah() {
        System.out.println("Jurusan : " + MataKuliah);
        return MataKuliah;
    }


    public void display() {
        getNama();
        getNim();
        getMataKuliah();
        System.out.println("==============================");
    }

}
# PBO_PostTest2_Sistem-Pencatatan-Barang-Preloved
Program Java sederhana untuk sistem pencatatan barang preloved.

---

## Tema: Sistem Pencatatan Barang Preloved
<img width="3780" height="1890" alt="BANNER PBO" src="https://github.com/user-attachments/assets/54ad1130-cec5-437b-ae16-59e9bddf8db1" />

###### Nama: Adella Putri
###### NIM: 2409116006
###### Kelas: A, Sistem Informasi 2024


### Deskripsi Singkat Program
Program ini bernama Sistem Pencatatan Barang Preloved. Program ini merupakan lanjutan dari project sebelumnya, di mana pada versi kali ini telah dilakukan pengembangan lebih lanjut sesuai dengan ketentuan praktikum. Pada versi baru ini, program sudah dilengkapi dengan 3 class utama, yaitu Preloved, Main, CRUD, serta ditambah satu class model yaitu Product. Setiap class memiliki fungsi masing-masing sesuai konsep MVC (Model, View, Controller) sederhana.

Program ini juga sudah memenuhi ketentuan dengan:
- Memiliki minimal 3 properties pada class Product (nama, kategori, kondisi, harga).
- Menerapkan constructor untuk menginisialisasi data awal barang di dalam class CRUD, serta constructor pada class Product untuk membentuk objek barang baru.
- Menggunakan access modifier (private, public) untuk menjaga enkapsulasi data pada class Product.
- Menerapkan packages yang memisahkan class berdasarkan fungsinya:
  - main untuk menu utama (_class Main_),
  - service untuk logika CRUD (_class CRUD_),
  - model untuk struktur data barang (_class Product_),
  - dan com.mycompany.preloved sebagai entry point program (_class Preloved_).

Dengan pengembangan ini, program menjadi lebih rapi, terstruktur, serta mudah dikembangkan ke depannya. Selain itu, fitur-fitur utama seperti tambah, lihat, update, hapus, melihat sold out, dan search juga sudah tersedia dan berjalan sesuai kebutuhan.

### Struktur Package dan File
**1. Package** _com.mycompany.preloved._
- **File: Preloved.java**
  
   File ini berfungsi sebagai entry point utama. Program pertama kali dijalankan dari file ini.     Isi kodenya hanya memanggil class Main yang berada di package main.
  
**2. Package** _main_
- **File: Main.java**

  File ini berisi menu utama program. Menu ditampilkan ke pengguna, lalu pengguna diminta memilih menu sesuai kebutuhan. Dari file ini, setiap pilihan akan diarahkan ke method yang ada di class CRUD. Fungsi utama nya ialah untuk mengatur interaksi dengan pengguna (_user interface_ berbasis teks).
  
  Fitur dalam file ini:
  - Menampilkan menu utama.
  - Membaca input pilihan pengguna.
  - Memanggil method CRUD sesuai pilihan pengguna.
  
**3. Package** _service_
- **File: CRUD.java**

  File ini menyimpan seluruh logika bisnis program. Semua fitur CRUD (Create, Read, Update, Delete) serta fitur tambahan seperti search dan daftar Sold Out dikerjakan di sini.
  Isi file ini meliputi:
  - _ArrayList<Product>_ barang untuk menyimpan daftar barang yang tersedia.
  - _ArrayList<Product>_ soldOut untuk menyimpan daftar barang yang sudah terjual.
  - _Constructor CRUD()_ untuk otomatis menambahkan beberapa data barang contoh saat program pertama kali dijalankan.
  - _Method tambahBarang()_ untuk menambahkan barang baru berdasarkan input user.
  - _Method lihatBarang()_ untuk menampilkan daftar barang yang tersedia dalam bentuk tabel.
  - _Method updateBarang()_ untuk mengubah data barang tertentu berdasarkan nomor indeks.
  - _Method hapusBarang()_ untuk menghapus barang dari daftar utama lalu memindahkannya ke daftar Sold Out.
  - _Method lihatSoldOut()_ untuk menampilkan daftar barang yang sudah Sold Out.
  - _Method cariBarang()_ untuk mencari barang berdasarkan nama.

**4. Package** _model_
- **File: Product.java**

  File ini merepresentasikan struktur data barang. Setiap barang yang disimpan berbentuk objek Product.
  Isi File ini meliputi:
  - _Properties_: nama, kategori, kondisi, harga.
  - _Constructor_ untuk menginisialisasi data barang.
  - _Getter & Setter_ untuk mengakses dan mengubah data.
  - _toString()_ yang digunakan untuk menampilkan data barang dalam format yang rapi, termasuk pemformatan harga (Rp.70,000).


### Alur Program
**1. Opening**

Ketika program dijalankan, sistem terlebih dahulu menampilkan sambutan pembuka berupa nama aplikasi dan tujuan singkatnya.

<img width="662" height="160" alt="image" src="https://github.com/user-attachments/assets/d3a84cbc-a489-466c-a5a2-955ad466718e" />

Hal ini berfungsi sebagai pengantar sebelum pengguna masuk ke menu utama.

**2. Menu Utama**

Setelah itu, pengguna diberikan tujuh pilihan menu yang dapat dijalankan, yaitu:

<img width="297" height="230" alt="image" src="https://github.com/user-attachments/assets/c4379630-8e1b-4479-9c8c-9c02d76b9044" />

Pemilihan menu dilakukan dengan cara memasukkan angka sesuai dengan pilihan yang tersedia.

**3. Lihat Semua Barang (Read)**

Jika pengguna memilih menu untuk melihat semua barang, sistem akan menampilkan daftar barang yang ada di dalam _ArrayList_ barang.

Tampilan daftar barang:

<img width="928" height="460" alt="image" src="https://github.com/user-attachments/assets/fbec5d83-7327-4b9b-95d4-a7a6c02d9fe5" />

Apabila ternyata daftar masih kosong, program akan memberikan informasi bahwa belum ada barang yang tersedia. Untuk menampilkan data, program menggunakan perulangan _for_ sehingga setiap barang ditampilkan secara berurutan dengan nomor indeks.

**4. Tambah Barang (Create)**

Pada saat memilih menu tambah barang, pengguna diminta untuk mengisi beberapa informasi seperti:

- Nama barang,
- Kategori,
- Kondisi (baru atau second),
- Harga.

Contoh Input:

<img width="720" height="122" alt="image" src="https://github.com/user-attachments/assets/c11fdd56-8ed3-4594-9081-7383220d0d76" />

Data yang sudah diinput kemudian dimasukkan ke dalam ArrayList barang sebagai objek Product. Setelah itu, program memberikan notifikasi bahwa barang baru berhasil ditambahkan.

<img width="411" height="30" alt="image" src="https://github.com/user-attachments/assets/0a2d031a-77d9-4a50-97b5-ccc04ffeab0a" />

**5. Update Barang (Update)**

Fitur update diawali dengan menampilkan seluruh daftar barang yang ada. Selanjutnya, pengguna diminta memilih nomor barang yang ingin diperbarui.

Jika nomor yang dimasukkan sesuai dengan daftar yang tersedia, maka program akan meminta data baru untuk menggantikan data lama.

Contoh:

<img width="926" height="653" alt="image" src="https://github.com/user-attachments/assets/96a221e5-cb9a-4282-83a6-ffaea5e43114" />


Setelah semua informasi diinput, data pada indeks yang dipilih akan diperbarui menggunakan perintah set dari ArrayList.

Apabila nomor yang dimasukkan tidak valid, maka program menampilkan pesan kesalahan.

<img width="498" height="67" alt="image" src="https://github.com/user-attachments/assets/38eb2a01-2f05-4653-b5bb-bf051fc9d032" />

**6. Hapus Barang (jika di Delete maka akan pindah ke Sold Out)**

Menu hapus barang bekerja dengan menampilkan daftar barang terlebih dahulu. Pengguna kemudian memilih nomor barang yang ingin dihapus.

Contoh:

<img width="919" height="557" alt="image" src="https://github.com/user-attachments/assets/79922bbf-b295-4064-8bac-57ec3f751763" />

Barang yang terpilih akan langsung dipindahkan dari ArrayList barang ke ArrayList soldOut. Dengan demikian, data tidak benar-benar hilang, melainkan tercatat dalam daftar Sold Out.

Jika input tidak sesuai, program akan memberi peringatan bahwa nomor yang dipilih tidak valid.

<img width="614" height="60" alt="image" src="https://github.com/user-attachments/assets/8f4da522-8c9e-4d00-8920-ce9046ed2601" />


**7. Lihat Daftar Sold Out**

Selain daftar barang yang masih tersedia, program juga menyediakan menu untuk melihat barang yang sudah sold out. Jika memang ada barang yang telah dipindahkan ke daftar ini, maka semuanya akan ditampilkan secara berurutan.

Contoh tampilan:

<img width="918" height="206" alt="image" src="https://github.com/user-attachments/assets/1c4b1e79-3c6e-4e91-9997-8162d65ba067" />


Namun, jika belum ada satupun barang yang terjual, pengguna akan mendapatkan pesan khusus bahwa daftar sold out masih kosong.

<img width="554" height="58" alt="image" src="https://github.com/user-attachments/assets/4ae1358f-1d4a-450c-99f6-a5324130636c" />


**8. Cari Barang (Search)**

Fitur tambahan ini digunakan untuk mencari barang berdasarkan nama. Pengguna mengetikkan kata kunci, lalu sistem akan menampilkan barang yang sesuai.

Contoh:

<img width="662" height="83" alt="image" src="https://github.com/user-attachments/assets/7beed1eb-d63c-4521-b3a7-728d7c2ed3da" />


Jika barang tidak ditemukan:

<img width="566" height="79" alt="image" src="https://github.com/user-attachments/assets/74db57d0-fa0e-4319-be0c-6819749b492c" />


**9. Keluar Program**

Apabila pengguna memilih menu keluar, program akan berhenti berjalan.

Sebagai penutup, program menampilkan ucapan terima kasih:

<img width="817" height="406" alt="image" src="https://github.com/user-attachments/assets/1981e1cf-01cb-496c-b701-630224dd6809" />





# Raihan Ferdyanza - Unila - Software Engineer

Aplikasi sederhana untuk registrasi dan login menggunakan lokal autentikasi, ketika user berhasil login, maka akan menampilkan data api.

## Persyaratan
- Aplikasi ini dibuat menggunakan Android Studio.
- Untuk menjalankannya, Anda memerlukan Android Studio, JDK, dan dependencies tambahan di Gradle, yaitu:

implementation 'androidx.appcompat:appcompat:1.3.1'
implementation 'androidx.recyclerview:recyclerview:1.2.1'
implementation 'com.android.volley:volley:1.2.1'
implementation 'com.github.bumptech.glide:glide:4.12.0'
annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
implementation "io.coil-kt:coil-compose:1.3.0"

## Cara menjalankannya:
1. Siapkan Android Studio.
2. Build file proyek.
3. Jalankan proyek di Android Studio atau ekspor ke APK dan jalankan di perangkat fisik atau virtual.

## Alur Penggunaan Aplikasi
1. Buka aplikasi.
2. Lakukan registrasi.
3. Lakukan login.
4. Data dari API akan ditampilkan setelah berhasil login.

# Quiz 2 Mobile Stechoq – Membuat Project # 

## Deskripsi Tugas
Tugas ini berfokus pada pembuatan aplikasi Android sederhana yang terdiri dari beberapa komponen penting. Anda akan membuat layout XML dari sebuah gambar yang dipilih, mengimplementasikan halaman Login dan Register, serta menghubungkan aplikasi dengan API eksternal untuk menampilkan data dalam RecyclerView. Anda juga memiliki opsi untuk menggunakan Glide atau Picasso untuk menampilkan gambar dari API, serta menggunakan Room Library untuk menyimpan data cache ke database lokal.

## Isi Tugas

1. **Layout Gambar**
   - Pilih salah satu gambar dari [link ini](bit.ly/quiz2Android) dan buatlah layout sederhana menggunakan XML.

2. **Halaman Login**
   - Buat halaman Login dengan komponen berikut:
     - Username
     - Password
     - Tombol Login
     - Tombol Register

3. **Halaman Register**
   - Buat halaman Register dengan komponen berikut:
     - Fullname
     - Email
     - Username
     - Password
     - Confirm Password
     - Tombol Register

4. **Aplikasi dengan API Implementation**
   - Implementasikan fitur API GET dari situs [https://jsonplaceholder.typicode.com/photos](https://jsonplaceholder.typicode.com/photos)
   - Gunakan RecyclerView untuk menampilkan list dari API (opsional)
   - Tampilkan gambar dari API dalam list menggunakan Glide, Picasso, atau library lainnya (opsional)
   - Gunakan Library Room untuk menyimpan data cache ke database lokal (opsional)

## Prosedur Quiz
- Quiz dikerjakan secara individu untuk mempermudah assessment.
- Terdapat 2 jenis Quiz: quiz required (wajib) dan quiz optional (opsional).
- Quiz optional dapat meningkatkan nilai akhir jika dikerjakan dengan baik.
- Durasi pengerjaan sekitar 3 jam, namun dapat disesuaikan.
- Kirim hasil pengerjaan dalam bentuk file zip atau tautan GitHub/GitLab kode program ke alamat email riky.fathoni@gmail.com

## Sample Project
Contoh implementasi dapat ditemukan di [sini](https://github.com/rikyahmad/Android_Dasar_MBKM).




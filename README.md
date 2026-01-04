# Praktikum 3 - Mobile Programming: Menghubungkan UI dengan Logic

Repository ini berisi source code untuk **Praktikum Minggu ke-3** mata kuliah Mobile Programming. Fokus utama dari praktikum ini adalah memahami konsep dasar menghubungkan tampilan (XML Layout) dengan logika pemrograman (Kotlin Activity) di Android Studio.

## 📌 Identitas Mahasiswa
* **Nama:** Lira Anggraini
* **NIM:** 230104040207
* **Kelas:** TI23A
* **Mata Kuliah:** Mobile Programming

---

## 📖 Deskripsi Proyek
Aplikasi ini adalah aplikasi Android sederhana yang bertujuan untuk mendemonstrasikan interaksi antara pengguna dan aplikasi. Aplikasi menerima input dari pengguna melalui `EditText`, memprosesnya saat tombol ditekan, dan menampilkan hasilnya kembali ke layar menggunakan `TextView` dan `Toast`.

### 🎯 Tujuan Pembelajaran
1.  Memahami keterkaitan antara file XML Layout dan file Logic (Activity).
2.  Mengimplementasikan `findViewById` (atau View Binding) untuk akses UI.
3.  Menerapkan Event Handling (`setOnClickListener`).
4.  Mengelola Input (`EditText`) dan Output (`TextView`).
5.  Melakukan validasi input sederhana dan penanganan error.

---

## 🚀 Fitur Aplikasi

### 1. Fitur Utama (Wajib)
* **Input Nama:** Pengguna dapat memasukkan nama pada kolom yang tersedia.
* **Tombol Submit:** Memicu logika pemrosesan data.
* **Validasi Input:** Jika kolom nama kosong, aplikasi akan menampilkan pesan error pada `EditText` dan meminta fokus kembali.
* **Output Text:** Menampilkan sapaan "Halo, [Nama]! Selamat datang di Praktikum 3" setelah tombol ditekan.
* **Toast Notification:** Menampilkan pesan singkat "Input diterima" sebagai feedback tambahan.

### 2. Fitur Tambahan (Tugas Advanced)
Aplikasi ini juga mencakup implementasi tugas tambahan sebagai berikut:
* **Dynamic Form Challenge:** Menambahkan input hobi secara dinamis (tombol "Tambah Input").
* **Form Validasi Lanjutan:**
    * Validasi format Email.
    * Validasi Umur (range 1-120).
    * Tombol Submit hanya aktif/berjalan jika semua input valid.
* **Interactive Counter:** Fitur penghitung angka dengan tombol `+` (tambah) dan `-` (kurang), di mana nilai tidak boleh di bawah 0.
* **Switch Theme (Light/Dark Mode):** Mengubah warna latar belakang dan teks secara real-time menggunakan komponen `Switch`.
* **Motion Challenge (Bonus):** Implementasi animasi sederhana menggunakan `MotionLayout` saat tombol ditekan.

---

## 🛠️ Tech Stack & Tools
* **Bahasa Pemrograman:** Kotlin
* **IDE:** Android Studio
* **Minimum SDK:** API 21 (Android 5.0 Lollipop)
* **Layout:** `LinearLayout` & `ConstraintLayout`

---

## 📸 Screenshots

| Tampilan Awal | Validasi Error | Hasil Output | Dark Mode |
|:---:|:---:|:---:|:---:|
| ![Screenshot_2026-01-05-07-17-03-515_com example p3_ui_logic_230104040207](https://github.com/user-attachments/assets/412393f4-1cd2-452b-9db9-74e46d4879f2)
 | ![Screenshot_2026-01-05-07-15-03-448_com example p3_ui_logic_230104040207](https://github.com/user-attachments/assets/b3d8a4c1-3195-41b9-8c6c-c775cb73c74b)
 | ![Screenshot_2026-01-05-07-03-29-438_com example p3_ui_logic_230104040226](https://github.com/user-attachments/assets/61a228d8-0a1c-449b-a1c9-56709a1137b9)
 | ![Screenshot_2026-01-05-07-03-37-707_com example p3_ui_logic_230104040226](https://github.com/user-attachments/assets/ad7717f1-a474-43aa-94b5-fdd04ccf6539)
 |

---

## 💻 Cara Menjalankan Project
1.  **Clone** repository ini ke komputer Anda:
    ```bash
    git clone [https://github.com/username-anda/P3_UI_Logic_NimAnda.git](https://github.com/username-anda/P3_UI_Logic_NimAnda.git)
    ```
2.  Buka **Android Studio**.
3.  Pilih **Open** dan arahkan ke folder project yang baru di-clone.
4.  Tunggu hingga proses **Gradle Build** selesai.
5.  Hubungkan perangkat Android fisik atau jalankan **Emulator**.
6.  Klik tombol **Run** (Icon Play Hijau).

---

## 📝 Catatan Penting
* Pastikan ID komponen di file XML (`activity_main.xml`) sesuai dengan pemanggilan di file Kotlin (`MainActivity.kt`) untuk menghindari error `NullPointerException` atau `Unresolved Reference`.
* Proyek ini menggunakan `findViewById` sesuai modul, namun bisa dikembangkan menggunakan ViewBinding untuk praktik yang lebih modern.

---

**Dosen Pengampu:** Muhayat, M.IT

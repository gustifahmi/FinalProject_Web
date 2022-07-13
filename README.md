# FinalProject_Web

Nama: Gusti Fahmi Fadhila  
Kode Peserta: KSAT006ONL012  

## Test Case
Tes yang dilakukan pada project ini antara lain:  

### 1. Login
   Terdapat 5 test case untuk login. Sebelum melakukan test case login, pastikan sudah ada akun dibuat. Akun tersebut hanya perlu dibuat sekali dan bisa dipakai untuk semua test case login. Akun tersebut adalah sebagai berikut:  

   username: katalontest
   password: Palumix123   

   Lima test case untuk login antara lain:

   1) Login - Blank
      Mengosongkan username dan password.  

      Verify:  
      - Verify Element Visible, Object: Alert - Blank Username
      - Verify Element Visible, Object: Alert - Blank Password  
      Artinya akan muncul alert yang menandakan inputnya kosong.  

   2) Login - Incorrect Password
      Memasukkan password yang salah.  

      Verify:  
      - Verify Element Visible, Object: Alert - Incorrect Password (Above Username) (tertulis password incorrect, tapi terletak di atas username. Alert ini tetap muncul walaupun username yang kita masukkan telah sesuai).
      - Verify Element Visible, Object: Alert - Incorrect Password  
      Artinya akan muncul alert yang menandakan inputnya salah.  
      
   3) Login - Incorrect Username
      Memasukkan username yang salah.  

      Verify:  
      - Verify Element Visible, Object: Alert - Incorrect Password (Above Username) (tertulis password incorrect, tapi terletak di atas username)
      - Verify Element Visible, Object: Alert - Incorrect Password  
      Artinya akan muncul alert yang menandakan inputnya salah.  

   4) Login - Incorrect Username and Password
      Memasukkan username dan password yang salah.  

      Verify:  
      - Verify Element Visible, Object: Alert - Incorrect Password (Above Username) (tertulis password incorrect, tapi terletak di atas username)
      - Verify Element Visible, Object: Alert - Incorrect Password  
      Artinya akan muncul alert yang menandakan inputnya salah.  

   5) Login - Success  
      Memasukkan username dan password yang sesuai dengan data yang ddinput saat membuat akun. Ada sedikit bug di web ini, yaitu ketika kita menekan tombol Login dengan username dan password yang benar, maka akan redirect ke home, tapi masih ada menu Register Now dan Login, sehingga sulit untuk memastikan akun telah berhasil login, selain karena telah redirect ke home. Namun, bisa diakali dengan navigate ke suatu url di web ini maka menu Register Now dan Login akan hilang dan berganti dengan menu My Account. Saya menggunakan https://kotakoki.wijaysali.my.id/login/ untuk navigate dan memastikan username sesuai.  

      Verify:
      - Verify Element Text, Object: Text - Logged in Username = "katalontest"

### 2. Cart
   Terdapat 2 test case untuk cart. Untuk test case cart diawali dengan login terlebih dahulu. Terdapat if clause di kedua test case tersebut dan else clause di salah satu test case. Dari semua item yang ada di web ini, saya hanya menggunakan 3 item, yaitu Album, Beanie, dan Belt. Dua test case tersebut antara lain:

   1) Add to Cart
      Menambahkan Album, Beanie, dan Belt ke cart. Pertama akan mengecek ke cart terlebih dahulu. JIKA ketiga barang tersebut sudah ada, maka akan langsung close browser. Namun, JIKA ada satu barang atau lebih yang belum ada akan menambahkan barang tersebut ke cart.  

      Verify:
      - Verify Element Present, Object: Text - Album
      - Verify Element Present, Object: Text - Beanie
      - Verify Element Present, Object: Text - Belt  
      Artinya ketiga barang tersebut sudah ada di cart.

   2) Remove from Cart
      Sebelum diremove, pastikan dahulu ketiga barang tersebut sudah ada di cart. JIKA ada satu atau lebih barang yang belum ada, maka akan ditambahkan terlebih dahulu ke cart. Setelah itu baru akan di-remove ketiga barang tersebut.  

      Verify:
      - Verify Element Not Present, Object: Text - Album
      - Verify Element Not Present, Object: Text - Beanie
      - Verify Element Not Present, Object: Text - Belt  
      Artinya ketiga barang tersebut tidak ada di cart karena sudah berhasil dihapus.

### 3. Search
   Terdapat 2 test case untuk search. Untuk search bisa dilakukan tanpa perlu melakukan login terlebih dahulu. Dua test case tersebut antara lain:

   1) Search Not Found
      Contoh keyword yang dicoba pada test case ini adalah "strawberry".  

      Verify:
      - Verify Element Present, Object: Text - Search Result strawberry
      - Verify Element Present, Object: Text - No Products  
      Artinya barang tersebut tidak ditemukan di web ini.

   2) Search Success
      Melakukan pencarian pada tiga keyword, yaitu "t-shirt", "hoodie", dan "polo".

      Verify:
      - Verify Element Present, Object: Image - T-Shirt
      - Verify Element Present, Object: Image - Hoodie
      - Verify Element Present, Object: Image - Polo  
      Artinya ketiga barang tersebut berhasil ditemukan
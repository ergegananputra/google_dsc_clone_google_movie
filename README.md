# TUGAS GOOGLE DSC CLONE APLIKASI INTERFACE
## oleh: Adiel Boanerge Gananputra
## NIM: 22/500051/SV/21386

### Deskripsi
Google TV merupakan aplikasi yang dibuat oleh Google untuk menonton film. Aplikasi ini menyediakan penyewaan film dan pembelian film serta menghubungkannya ke dalam Smart TV.
Repository ini berisikan kode interface dan beberapa file kotlin yang tidak terpakai untuk membuat cloning interface aplikasi Google TV.

### Cara menjalankan
1. Clone repository ini
2. Buka folder repository ini dengan Android Studio
3. Setting emulator dengan compiler API 34 di build.gradle.kts (Module: app)
```kotlin
    // ...

    android {
        namespace = "com.latihanbyrg.googlemoviewclone"
        compileSdk = 34

        defaultConfig {
            applicationId = "com.latihanbyrg.googlemoviewclone"
            minSdk = 24
            targetSdk = 33
            versionCode = 1
            versionName = "1.0"

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }
        
        // ...
    }
```
4. Sync gradle, pastikan terhubung ke internet
5. Jalankan emulator
6. Run 'app'

### Screenshot
- Halaman Utama
    ![img.png](img.png)

- Halaman Library
    ![img_1.png](img_1.png)

- Halaman Watchlist
    ![img_2.png](img_2.png)

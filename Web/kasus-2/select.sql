--Menampilkan data nim, nama, alamat, kode_prodi, nama_prodi
SELECT * FROM mahasiswa JOIN prodi ON prodi.kode_prodi = mahasiswa.kode_prodi;

--Menampilkan data nim, nama, alamat, nama_prodi
SELECT mahasiswa.*, prodi.nama_prodi FROM mahasiswa JOIN prodi ON prodi.kode_prodi = mahasiswa.kode_prodi;
--Tidak terlalu penting WKWKWK
DELIMITER ;

--Buat Database
CREATE DATABASE IF NOT EXISTS akademik;

--Masuk ke database
USE akademik;

--Buat Table mahasiswa
CREATE TABLE IF NOT EXISTS mahasiswa(nim char(5) PRIMARY KEY, nama varchar(128), alamat text, kode_prodi char(3));

--Isi Tabel mahasiswa
INSERT INTO mahasiswa VALUES('00543', 'Muhammad', 'Kerangmalang A-50', 'P01');
INSERT INTO mahasiswa VALUES('10041', 'Sugiharti', 'Kerangmalang A-23', 'P02');
INSERT INTO mahasiswa VALUES('10043', 'Ahmad Solihin', 'Kerangmalang D-17', 'P03');

--Buat Table prodi
CREATE TABLE IF NOT EXISTS prodi(kode_prodi char(3) PRIMARY KEY, nama_prodi varchar(128), jurusan varchar(128));

--Isi Tabel prodi
INSERT INTO prodi VALUES('P01', 'Eks Ilmu Komputer', 'Matematika');
INSERT INTO prodi VALUES('P02', 'Ilmu Komputer', 'Matematika');
INSERT INTO prodi VALUES('P03', 'D3 Komisi', 'Matematika');
INSERT INTO prodi VALUES('P04', 'D3 Rekmed', 'Matematika');
INSERT INTO prodi VALUES('P05', 'D3 Ellins', 'Fisika');

--Buat Table log_mhs
CREATE TABLE IF NOT EXISTS log_mhs(kejadian varchar(25), waktu datetime);

--Buat Trigger ins_mhs
DELIMITER //
CREATE TRIGGER ins_mhs
    AFTER INSERT ON mahasiswa
    FOR EACH ROW
BEGIN
    INSERT INTO log_mhs VALUES('Tambah Data', CURRENT_DATE());
END//

--Buat Trigger updt_mhs
DELIMITER //
CREATE TRIGGER updt_mhs
    AFTER UPDATE ON mahasiswa
    FOR EACH ROW
BEGIN
    INSERT INTO log_mhs VALUES('Ubah Data', CURRENT_DATE());
END//

--Buat Trigger del_mhs
DELIMITER //
CREATE TRIGGER del_mhs
    AFTER DELETE ON mahasiswa
    FOR EACH ROW
BEGIN
    INSERT INTO log_mhs VALUES('Delete Data', CURRENT_DATE());
END//

--Buat Procedure tampilMahasiswa()
DELIMITER //
CREATE PROCEDURE tampilMahasiswaByKodeProdi(kd_pd char(3))
BEGIN
    SELECT * FROM `mahasiswa` WHERE `kode_prodi` = kd_pd;
END//

--Buat Procedure tambahMahasiswa()
DELIMITER //
CREATE PROCEDURE tambahMahasiswa(nim char(5), nama varchar(128),alamat text, kode_prodi char(3))
BEGIN
    INSERT INTO mahasiswa VALUES();
END//

--Buat Procedure hapusMahasiswa()
DELIMITER //
CREATE PROCEDURE hapusMahasiswa(nim_var char(5))
BEGIN
    DELETE FROM mahasiswa WHERE nim = nim_var;
END//

--Buat View view_mahasiswa_ilkom
CREATE VIEW view_mahasiswa_ilkom AS SELECT * FROM mahasiswa WHERE kode_prodi = 'P02' ORDER BY nama;

--Mengembalikan delimiter seperti semula tidak terlalu penting juga wkwk
DELIMITER ;
<?php
// Memeriksa apakah user sedang mencoba menginput atau mencari hasil
function hitung()
{
    if (isset($_GET['alas']) && isset($_GET['tinggi'])) {
        return true;
    } else {
        return false;
    }
}

// mendapatkan nilai alas
function alas()
{
    if (hitung()) {
        return $_GET['alas'];
    } else {
        return '';
    }
}

// mendapatkan nilai alas
function tinggi()
{
    if (hitung()) {
        return $_GET['tinggi'];
    } else {
        return '';
    }
}

// Menghitung luas
function luas()
{
    if (hitung()) {
        $alas = alas();
        $tinggi = tinggi();
        $hasil = (0.5 * $alas * $tinggi);
        return $hasil;
    } else {
        return '';
    }
}

// Menghitung keliling
function keliling()
{
    if (hitung()) {
        $a = alas() * 0.5;
        $b = tinggi();
        $c = sqrt(($a * $a) + ($b * $b));
        $hasil = $c * 2 + alas();
        return $hasil;
    } else {
        return '';
    }
}

if (hitung()) {
    // Membuat atau menulis
    if ($file = fopen('hasil.txt', 'a')) {
        fwrite($file, alas() . '/' . tinggi() . '/' . luas() . '/' . keliling() . '/' . date('H:i:s') . "\n");
        fclose($file);
    }
}

// Membaca file
if (file_exists('hasil.txt')) {
    $logs = file('hasil.txt');
    // mengurutkan berdasarkan waktu
    foreach ($logs as $key => $val) {
        $data = explode('/', $val);
        $time[$key] = strtotime($data[4]);
        var_dump($data);
    }

    array_multisort($time, SORT_DESC, SORT_NUMERIC, $logs);
} else {
    $logs = null;
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Fany Muhammad Fahmi Kamilah">
    <meta>
    <title>Menghitung Segitiga</title>
</head>

<body>
    <h3>Menghitung Luas Keliling Segitiga</h3>

    <form>
        <div>
            <label>Alas</label>
            <input type="number" name="alas" placeholder="Alas Segitiga" value="<?= alas() ?>">
        </div>
        <div>
            <label>Tinggi</label>
            <input type="number" name="tinggi" placeholder="Tinggi Segitiga" value="<?= tinggi() ?>">
        </div>
        <button type="submit">Hitung</button>
    </form>

    Luas : <?= luas() ?><br>
    Keliling : <?= keliling() ?><br>

    <table>
        <thead>
            <tr>
                <th>No.</th>
                <th>Alas</th>
                <th>Tinggi</th>
                <th>Luas</th>
                <th>Keliling</th>
                <th>Waktu</th>
            </tr>
        </thead>
        <tbody>
            <?php if (is_array($logs)) : ?>
                <?php foreach ($logs as $no => $data) : ?>
                    <?php $baris = explode('/', $data) ?>
                    <tr>
                        <td><?= $no + 1 ?></td>
                        <td><?= $baris[0] ?></td>
                        <td><?= $baris[1] ?></td>
                        <td><?= $baris[2] ?></td>
                        <td><?= $baris[3] ?></td>
                        <td><?= $baris[4] ?></td>
                    </tr>
                <?php endforeach ?>
            <?php else : ?>
                <tr>
                    <td colspan="6">Belum ada data yang tersimpan</td>
                </tr>
            <?php endif ?>
        </tbody>
    </table>
</body>

</html>
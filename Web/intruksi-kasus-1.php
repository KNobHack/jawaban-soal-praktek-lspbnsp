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
    <h5>Menghitung Luas 7 Keliling Segitiga</h5>

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
</body>

</html>
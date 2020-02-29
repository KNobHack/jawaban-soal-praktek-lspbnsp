#include<iostream>
#include<fstream>

using namespace std;

int main(){
	char nama[20];
	
	int saldo_awal;
	int rek;
	int saldo_akhir;
	int jum;
	int hasilsaldoawal;
	int bunga;
	
	ofstream save;
	save.open("transaksi.txt", ios::app);
	cout<<"Nama : ";
	cin>>nama;
	save<<"Nama : "<<nama<<endl;
	
	cout<<"Rekening : ";
	cin>>rek;
	save<<"No Rekening : "<<rek<<endl;
	
	cout<<"Masukkan Jumlah Uang Tabungan : ";
	cin>>saldo_awal;
	save<<"Jumlah Uang Tabungan :"<<saldo_awal<<endl;
	
	cout<<"Masukkan Jumlah Uang Yang Diambil : ";
	cin>>saldo_akhir;
	save<<"Jumlah Pengambilan : "<<saldo_akhir<<endl;
	
	bunga = saldo_awal * 12/100;
	hasilsaldoawal = saldo_awal + bunga;
	jum = hasilsaldoawal - saldo_akhir;
	
	cout<<"Bunga Tabungan Anda : "<<bunga<<endl;
	cout<<"Sisa Saldo : "<<jum<<endl;
	
	save<<"Bunga Tabungan Anda : "<<bunga<<endl;
	save<<"Sisa Saldo Anda : "<<jum<<endl;
	save.close();
}

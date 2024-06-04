package Thuvien;

import java.util.Scanner;

public class Sinhvien {
	String tenSV;
	String sdtDk;

	Sach Sachmuon[] = new Sach[3];
	public int demSach = 0;

	Scanner input = new Scanner(System.in);

	public Sinhvien()
	{
		System.out.println("Nhap ten Sinh vien:");

		this.tenSV = input.nextLine();

		System.out.println("Nhap so dien thoai dang ki:");
		this.sdtDk = input.nextLine();
	}
}



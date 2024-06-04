package Thuvien;

import java.util.Scanner;

public class Sach {

	// 
	public int sMa;
	public String tenSach;
	public String tenTacGia;
	public int SlgSach;
	public int SlgSach1;

	Scanner input = new Scanner(System.in);

	public Sach()
	{
		System.out.println("Nhap so Ma cua Sach:");
		this.sMa = input.nextInt();
		input.nextLine();

		System.out.println("Nhap ten Sach:");
		this.tenSach = input.nextLine();

		System.out.println("Nhap ten Tac Gia:");
		this.tenTacGia = input.nextLine();

		System.out.println("Nhap so luong cua Sach:");
		this.SlgSach = input.nextInt();
		SlgSach1 = this.SlgSach;
	}
}

package Thuvien;

import java.util.Scanner;

public class Cacsach {

	Sach Cacsach[] = new Sach[50];
	public static int count;

	Scanner input = new Scanner(System.in);
	
	public int sosanhSach(Sach s1, Sach s2)
	{
		if (s1.tenSach.equalsIgnoreCase(s2.tenSach)) {
			System.out.println("Ten cua Sach nay da ton tai!");
			return 0;
		}
		if (s1.sMa == s2.sMa) 
		{
			System.out.println("Ma cua Sach nay da ton tai!");

			return 0;
		}
		return 1;
	}
	public void themSach(Sach s)
	{

		for (int i = 0; i < count; i++) {

			if (this.sosanhSach(s, this.Cacsach[i])== 0)
				return;
		}
		if (count < 50) 
		{
			Cacsach[count] = s;
			count++;
		}
		else 
		{
			System.out.println("Khong du cho de them Sach.");
		}
	}
	public void timbangMS()
	{
		System.out.println(
			"\t\t\t\tTim kiem bang Ma Sach\n");
		int sMa;
		System.out.println("Dien Ma cua Sach:");
		sMa = input.nextInt();

		int flag = 0;
		System.out.println(
			"S.Ma\t\tTen\t\tTac Gia\t\tSo luong kha dung\t\tTong So luong");

		for (int i = 0; i < count; i++) {
			if (sMa == Cacsach[i].sMa) {
				System.out.println(
					Cacsach[i].sMa + "\t\t"
					+ Cacsach[i].tenSach + "\t\t"
					+ Cacsach[i].tenTacGia + "\t\t"
					+ Cacsach[i].SlgSach1 + "\t\t"
					+ Cacsach[i].SlgSach);
				flag++;
				return;
			}
		}
		if (flag == 0)
			System.out.println("Khong tim thay Ma "+ sMa + " tren he thong.");
	}
	public void timbangtenTG()
	{
		System.out.println("\t\t\t\tTim bang ten cua Tac Gia");
		input.nextLine();
		System.out.println("Nhap ten Tac Gia:");
		String tenTacGia = input.nextLine();

		int flag = 0;

		System.out.println("S.Ma\t\tTen\t\tTac Gia\t\tSo luong kha dung\t\tTong so luong");

		for (int i = 0; i < count; i++) {
			if (tenTacGia.equalsIgnoreCase(Cacsach[i].tenTacGia)) {
				System.out.println(
					Cacsach[i].sMa + "\t\t"
					+ Cacsach[i].tenSach + "\t\t"
					+ Cacsach[i].tenTacGia + "\t\t"
					+ Cacsach[i].SlgSach1 + "\t\t"
					+ Cacsach[i].SlgSach);
				flag++;
			}
		}
		if (flag == 0)
			System.out.println("Khong tim thay Sach nao cua" + tenTacGia+ " trong he thong.");
	}
	public void hientatcaSach()
	{

		System.out.println("\t\t\t\tHien tat ca cac Sach\n");
		System.out.println("S.Ma\t\tTen\t\tTac Gia\t\tSo luong kha dung\t\tTong so luong");

		for (int i = 0; i < count; i++) {

			System.out.println(
				Cacsach[i].sMa + "\t\t"
				+ Cacsach[i].tenSach + "\t\t"
				+ Cacsach[i].tenTacGia + "\t\t"
				+ Cacsach[i].SlgSach1 + "\t\t"
				+ Cacsach[i].SlgSach);
		}
	}
	public void capnhatSl()
	{

		System.out.println(
			"\t\t\t\tCap nhat so luong cua Sach\n");
		System.out.println("Nhap Ma so cua Sach:");

		int sMa = input.nextInt();

		for (int i = 0; i < count; i++) {

			if (sMa == Cacsach[i].sMa) {
				System.out.println("Nhap Ma so sach can cap nhat:");

				int themSL = input.nextInt();
				Cacsach[i].SlgSach += themSL;
				Cacsach[i].SlgSach1 += themSL;

				return;
			}
		}
	}
	public void hienthiMenu()
	{
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("0. Thoat khoi he thong");
		System.out.println("1. Them sach vao he thong");
		System.out.println("2. Cap nhat so luong cua Sach.");
		System.out.println("3. Tim kiem Sach ");
		System.out.println("4. Hien thi tat ca cac Sach");
		System.out.println("5. Dang ki Sinh vien.");
		System.out.println("6. Hien thi tat ca Sinh vien dang ki.");
		System.out.println("7. Xoa Sach khoi thu vien");
		System.out.println("8. Them Sach vao thu vien");
		System.out.println("-------------------------------------------------------------------------------------------------------");
	}
	public int duocKhadung(int sMa)
	{

		for (int i = 0; i < count; i++) {
			if (sMa == Cacsach[i].sMa) {
				if (Cacsach[i].SlgSach1 > 0) 
				{
					System.out.println("Sach kha dung.");
					return i;
				}
				System.out.println("Sach khong kha dung!!");
				return -1;
			}
		}

		System.out.println("Khong co Sach cua Ma " + sMa + " kha dung trong Thu vien.");
		return -1;
	}
	public Sach xoaSach()
	{

		System.out.println("Dien Ma so cua sach de kiem tra.");
		int sMa = input.nextInt();

		int ttSach = duocKhadung(sMa);

		if (ttSach != -1) {
			Cacsach[ttSach].SlgSach1--;
			return Cacsach[ttSach];
		}
		return null;
	}
	public void themSach1(Sach s)
	{
		for (int i = 0; i < count; i++) {
			if (s.equals(Cacsach[i])) {
				Cacsach[i].SlgSach1++;
				return;
			}
		}
	}
}

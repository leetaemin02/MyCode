package Thuvien;

import java.util.Scanner;

public class Thuvien {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("********************Chao Mung den voi Thu Vien VAA!********************");
		System.out.println("		      Chon nhung lua chon sau day:		         	 ");
		System.out.println("************************************************************************");

		Cacsach ob = new Cacsach();
		CacSV obSV = new CacSV();

		int Chon;
		int timChon;

		do {
			ob.hienthiMenu();
			Chon = input.nextInt();
			switch (Chon) {

			case 1:
				Sach s = new Sach();
				ob.themSach(s);
				break;

			case 2:
				ob.capnhatSl();
				break;

			case 3:
				System.out.println("1. Tim Sach voi Ma so Sach");
				System.out.println("2. Tim Sach voi ten Tac Gia");
				timChon = input.nextInt();

				switch (timChon) {
				case 1:
					ob.timbangMS();
					break;
				case 2:
					ob.timbangtenTG();
				}
				break;
			case 4:
				ob.hientatcaSach();
				break;
			case 5:
				Sinhvien sv = new Sinhvien();
				obSV.themSV(sv);
				break;
			case 6:
				obSV.hienthitatcaSV();
				break;
			case 7:
				obSV.xoaSach(ob);
				break;
			case 8:
				obSV.themSach1(ob);
				break;
			default:
				System.out.println("Nhap trong khoang 0 -> 8.");
			}

		}
		while (Chon != 0);
	}
}



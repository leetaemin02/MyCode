package Thuvien;

import java.util.Scanner;

public class CacSV {

	Scanner input = new Scanner(System.in);
	Sinhvien CacbanSV[] = new Sinhvien[50];

	public static int count = 0;

	public void themSV(Sinhvien sv)
	{
		for (int i = 0; i < count; i++) {

			if (sv.sdtDk.equalsIgnoreCase(
					CacbanSV[i].sdtDk)) {
				System.out.println("So dien thoai cua Sinh vien " + sv.sdtDk+ " da duoc dang ki roi!.");
				return;
			}
		}
		if (count <= 50) {
			CacbanSV[count] = sv;
			count++;
		}
	}
	public void hienthitatcaSV()
	{
		System.out.println("Ten Sinh vien\t\tSo dien thoai dang ki");
		for (int i = 0; i < count; i++) {
			System.out.println(CacbanSV[i].tenSV+ "\t\t"+ CacbanSV[i].sdtDk);
		}
	}
	public int Sinhvienn()
	{
		System.out.println("Dien So dien thoai dang ki:");
		String sdtDk = input.nextLine();

		for (int i = 0; i < count; i++)
		{
			if (CacbanSV[i].sdtDk.equalsIgnoreCase(sdtDk)) 
			{
				return i;
			}
		}
		System.out.println("Sinh vien chua dang ki.");
		System.out.println("Hay dang ki truoc !.");
		return -1;
	}
	public void xoaSach(Cacsach Sach)
	{
		int ttSV = this.Sinhvienn();

		if (ttSV != -1) {
			System.out.println("dang kiem tra");
			Sach.hientatcaSach();
			Sach s = Sach.xoaSach();

			System.out.println("dang kiem tra");
			if (s != null) {

				if (CacbanSV[ttSV].demSach<= 3) 
				{
					System.out.println("dang them sach");
					CacbanSV[ttSV].Sachmuon[CacbanSV[ttSV].demSach]= s;
					CacbanSV[ttSV].demSach++;
					return;
				}
				else 
				{
					System.out.println("Sinh vien khong the muon qua toi da 3 Sach.");
					return;
				}
			}
			System.out.println("Sach khong kha dung.");
		}
	}
	public void themSach1(Cacsach Sach)
	{
		int ttSV = this.Sinhvienn();
		if (ttSV != -1) {
			System.out.println("S.Ma\t\t\tTen Sach\t\t\tTen Tac Gia");
			Sinhvien sv = CacbanSV[ttSV];
			for (int i = 0; i < sv.demSach; i++) {
				System.out.println(
					sv.Sachmuon[i].sMa + "\t\t\t"
					+ sv.Sachmuon[i].tenSach + "\t\t\t"
					+ sv.Sachmuon[i].tenTacGia);
			}
			System.out.println("Nhap Ma so cua Sach de them vao Thu vien:");
			int sMa = input.nextInt();
			for (int i = 0; i < sv.demSach; i++) {
				if (sMa == sv.Sachmuon[i].sMa) {
					Sach.themSach1(sv.Sachmuon[i]);
					sv.Sachmuon[i] = null;
					return;
				}
			}
			System.out.println("Khong tim thay Sach Ma so " + sMa+ "trong thu vien");
		}
	}
}


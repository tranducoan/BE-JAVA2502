public class bai4 {

    public static void main(String[] args) {
        int tongTien = 200000;
        int menhGia1 = 1000;
        int menhGia2 = 2000;
        int menhGia3 = 5000;

        System.out.println("Các phương án có thể:");

        for (int x3 = 0; x3 <= tongTien / menhGia3; x3++) {
            for (int x2 = 0; x2 <= (tongTien - x3 * menhGia3) / menhGia2; x2++) {
                int conLai = tongTien - x3 * menhGia3 - x2 * menhGia2;
                if (conLai >= 0 && conLai % menhGia1 == 0) {
                    int x1 = conLai / menhGia1;
                    System.out.println("(x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ")");
                }
            }
        }
    }
}
package HinhHoc;

public class HinhHoc {
    public final float PI = 3.14f;
    public String ten;
    public float cv;
    public float dt;
    public float tt;

    // getter của thuộc tính PI
    public float getPI() {
        return PI;
    }

    //
    public String getTen() {
        return ten;
    }

    public void setTen(String Ten) {
        this.ten = Ten;
    }

    //
    public float getChuvi() {
        return cv;
    }

    public void setChuVi(float cv) {
        this.cv = cv;
    }

    //
    public float getDienTich() {
        return dt;
    }

    public void setDienTich(float dt) {
        this.dt = dt;
    }

    //
    public float getTheTich() {
        return tt;
    }

    public void setTheTich(float tt) {
        this.tt = tt;
    }

    public void xuatTen() {
        System.out.println("\n====== " + this.ten + " ======");
    }

    public void inChuVi() {
        System.out.println("Chu vi = " + this.cv);
    }

    public void inDientich() {
        System.out.println("Dien tich = " + this.dt);
    }

    public void inThetich() {
        System.out.println("The tich = " + this.tt);
    }
}

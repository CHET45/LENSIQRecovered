package p000;

/* JADX INFO: renamed from: nk */
/* JADX INFO: loaded from: classes6.dex */
public class C9910nk {

    /* JADX INFO: renamed from: a */
    public int f64786a;

    /* JADX INFO: renamed from: b */
    public int f64787b;

    /* JADX INFO: renamed from: c */
    public int f64788c;

    public C9910nk(int i, int i2, int i3) {
        this.f64786a = i;
        this.f64787b = i2;
        this.f64788c = i3;
    }

    public int getCode() {
        return this.f64786a;
    }

    public int getI() {
        return this.f64788c;
    }

    public int getId() {
        return this.f64787b;
    }

    public boolean isFail() {
        return !isSuccess();
    }

    public boolean isSuccess() {
        return this.f64786a == 0;
    }
}

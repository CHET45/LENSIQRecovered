package p000;

/* JADX INFO: loaded from: classes3.dex */
public class qba {

    /* JADX INFO: renamed from: a */
    public float f73863a;

    /* JADX INFO: renamed from: b */
    public int f73864b;

    public void add(float f) {
        float f2 = this.f73863a + f;
        this.f73863a = f2;
        int i = this.f73864b + 1;
        this.f73864b = i;
        if (i == Integer.MAX_VALUE) {
            this.f73863a = f2 / 2.0f;
            this.f73864b = i / 2;
        }
    }

    public float getMean() {
        int i = this.f73864b;
        if (i == 0) {
            return 0.0f;
        }
        return this.f73863a / i;
    }
}

package p000;

/* JADX INFO: loaded from: classes8.dex */
public class b18 extends dd2 {

    /* JADX INFO: renamed from: a */
    public Object f12378a;

    public b18(double d) {
        this.f12378a = Double.valueOf(d);
    }

    @Override // p000.dd2
    /* JADX INFO: renamed from: a */
    public void mo2788a(Object obj, Object obj2) {
        if (obj instanceof Double) {
            q80.assertEquals(((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), ((Double) this.f12378a).doubleValue());
        } else {
            q80.assertEquals(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) this.f12378a).floatValue());
        }
    }

    public b18(float f) {
        this.f12378a = Float.valueOf(f);
    }
}

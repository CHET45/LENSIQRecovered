package p000;

/* JADX INFO: loaded from: classes.dex */
public class uk1 extends sk1 {

    /* JADX INFO: renamed from: C */
    public float f88193C;

    public uk1(char[] cArr) {
        super(cArr);
        this.f88193C = Float.NaN;
    }

    public static sk1 allocate(char[] cArr) {
        return new uk1(cArr);
    }

    @Override // p000.sk1
    public float getFloat() {
        if (Float.isNaN(this.f88193C)) {
            this.f88193C = Float.parseFloat(content());
        }
        return this.f88193C;
    }

    @Override // p000.sk1
    public int getInt() {
        if (Float.isNaN(this.f88193C)) {
            this.f88193C = Integer.parseInt(content());
        }
        return (int) this.f88193C;
    }

    public boolean isInt() {
        float f = getFloat();
        return ((float) ((int) f)) == f;
    }

    public void putValue(float f) {
        this.f88193C = f;
    }

    @Override // p000.sk1
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        m22073a(sb, i);
        float f = getFloat();
        int i3 = (int) f;
        if (i3 == f) {
            sb.append(i3);
        } else {
            sb.append(f);
        }
        return sb.toString();
    }

    @Override // p000.sk1
    public String toJSON() {
        float f = getFloat();
        int i = (int) f;
        if (i == f) {
            return "" + i;
        }
        return "" + f;
    }

    public uk1(float f) {
        super(null);
        this.f88193C = f;
    }
}

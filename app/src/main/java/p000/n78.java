package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class n78 {

    /* JADX INFO: renamed from: b */
    public static final int f63438b = 8;

    /* JADX INFO: renamed from: a */
    public int f63439a;

    public n78() {
        this(0, 1, null);
    }

    public final int getElement() {
        return this.f63439a;
    }

    public final void setElement(int i) {
        this.f63439a = i;
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.f63439a);
        sb.append(")@");
        String string = Integer.toString(hashCode(), tw1.checkRadix(16));
        md8.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }

    public n78(int i) {
        this.f63439a = i;
    }

    public /* synthetic */ n78(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}

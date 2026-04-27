package p000;

/* JADX INFO: loaded from: classes.dex */
public class qk1 extends rk1 {
    public qk1(char[] cArr) {
        super(cArr);
    }

    public static sk1 allocate(char[] cArr) {
        return new qk1(cArr);
    }

    @Override // p000.sk1
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i2 > 0 || json.length() + i >= sk1.f82092f) {
            sb.append("[\n");
            boolean z = true;
            for (sk1 sk1Var : this.f78534C) {
                if (z) {
                    z = false;
                } else {
                    sb.append(",\n");
                }
                m22073a(sb, sk1.f82093m + i);
                sb.append(sk1Var.toFormattedJSON(sk1.f82093m + i, i2 - 1));
            }
            sb.append("\n");
            m22073a(sb, i);
            sb.append("]");
        } else {
            sb.append(json);
        }
        return sb.toString();
    }

    @Override // p000.sk1
    public String toJSON() {
        StringBuilder sb = new StringBuilder(m22074b() + "[");
        boolean z = true;
        for (int i = 0; i < this.f78534C.size(); i++) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.f78534C.get(i).toJSON());
        }
        return ((Object) sb) + "]";
    }
}

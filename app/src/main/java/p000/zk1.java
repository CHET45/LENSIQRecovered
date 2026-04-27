package p000;

/* JADX INFO: loaded from: classes.dex */
public class zk1 extends sk1 {
    public zk1(char[] cArr) {
        super(cArr);
    }

    public static sk1 allocate(char[] cArr) {
        return new zk1(cArr);
    }

    @Override // p000.sk1
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        m22073a(sb, i);
        sb.append("'");
        sb.append(content());
        sb.append("'");
        return sb.toString();
    }

    @Override // p000.sk1
    public String toJSON() {
        return "'" + content() + "'";
    }
}

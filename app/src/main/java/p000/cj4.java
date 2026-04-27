package p000;

/* JADX INFO: loaded from: classes5.dex */
public class cj4 {

    /* JADX INFO: renamed from: a */
    public final EnumC2330a f16684a;

    /* JADX INFO: renamed from: b */
    public final ph4 f16685b;

    /* JADX INFO: renamed from: cj4$a */
    public enum EnumC2330a {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    private cj4(EnumC2330a enumC2330a, ph4 ph4Var) {
        this.f16684a = enumC2330a;
        this.f16685b = ph4Var;
    }

    public static cj4 create(EnumC2330a enumC2330a, ph4 ph4Var) {
        return new cj4(enumC2330a, ph4Var);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cj4)) {
            return false;
        }
        cj4 cj4Var = (cj4) obj;
        return this.f16684a.equals(cj4Var.f16684a) && this.f16685b.equals(cj4Var.f16685b);
    }

    public ph4 getDocument() {
        return this.f16685b;
    }

    public EnumC2330a getType() {
        return this.f16684a;
    }

    public int hashCode() {
        return ((((1891 + this.f16684a.hashCode()) * 31) + this.f16685b.getKey().hashCode()) * 31) + this.f16685b.getData().hashCode();
    }

    public String toString() {
        return "DocumentViewChange(" + this.f16685b + "," + this.f16684a + c0b.f15434d;
    }
}

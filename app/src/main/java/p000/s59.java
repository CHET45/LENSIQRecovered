package p000;

/* JADX INFO: loaded from: classes5.dex */
public class s59 {

    /* JADX INFO: renamed from: a */
    public final EnumC12450a f80717a;

    /* JADX INFO: renamed from: b */
    public final ci4 f80718b;

    /* JADX INFO: renamed from: s59$a */
    public enum EnumC12450a {
        ADDED,
        REMOVED
    }

    public s59(EnumC12450a enumC12450a, ci4 ci4Var) {
        this.f80717a = enumC12450a;
        this.f80718b = ci4Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s59)) {
            return false;
        }
        s59 s59Var = (s59) obj;
        return this.f80717a.equals(s59Var.getType()) && this.f80718b.equals(s59Var.getKey());
    }

    public ci4 getKey() {
        return this.f80718b;
    }

    public EnumC12450a getType() {
        return this.f80717a;
    }

    public int hashCode() {
        return ((2077 + this.f80717a.hashCode()) * 31) + this.f80718b.hashCode();
    }
}

package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class bs5 {

    /* JADX INFO: renamed from: a */
    public final wr5 f14647a;

    /* JADX INFO: renamed from: b */
    public final xdh f14648b;

    public bs5(wr5 wr5Var, xdh xdhVar) {
        this.f14647a = wr5Var;
        this.f14648b = xdhVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bs5.class != obj.getClass()) {
            return false;
        }
        bs5 bs5Var = (bs5) obj;
        if (this.f14647a.equals(bs5Var.f14647a)) {
            return this.f14648b.equals(bs5Var.f14648b);
        }
        return false;
    }

    public wr5 getFieldPath() {
        return this.f14647a;
    }

    public xdh getOperation() {
        return this.f14648b;
    }

    public int hashCode() {
        return (this.f14647a.hashCode() * 31) + this.f14648b.hashCode();
    }
}

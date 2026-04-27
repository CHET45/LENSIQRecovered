package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class e2i {

    /* JADX INFO: renamed from: c */
    public static final int f31614c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f31615a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Object f31616b;

    public e2i(@yfb String str, @gib Object obj) {
        this.f31615a = str;
        this.f31616b = obj;
    }

    public static /* synthetic */ e2i copy$default(e2i e2iVar, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = e2iVar.f31615a;
        }
        if ((i & 2) != 0) {
            obj = e2iVar.f31616b;
        }
        return e2iVar.copy(str, obj);
    }

    @yfb
    public final String component1() {
        return this.f31615a;
    }

    @gib
    public final Object component2() {
        return this.f31616b;
    }

    @yfb
    public final e2i copy(@yfb String str, @gib Object obj) {
        return new e2i(str, obj);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2i)) {
            return false;
        }
        e2i e2iVar = (e2i) obj;
        return md8.areEqual(this.f31615a, e2iVar.f31615a) && md8.areEqual(this.f31616b, e2iVar.f31616b);
    }

    @yfb
    public final String getName() {
        return this.f31615a;
    }

    @gib
    public final Object getValue() {
        return this.f31616b;
    }

    public int hashCode() {
        int iHashCode = this.f31615a.hashCode() * 31;
        Object obj = this.f31616b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @yfb
    public String toString() {
        return "ValueElement(name=" + this.f31615a + ", value=" + this.f31616b + ')';
    }
}

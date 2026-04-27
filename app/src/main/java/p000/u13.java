package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
public final class u13 extends AbstractC13302u0 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C13318a f86542c = new C13318a(null);

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f86543b;

    /* JADX INFO: renamed from: u13$a */
    public static final class C13318a implements e13.InterfaceC5041c<u13> {
        public /* synthetic */ C13318a(jt3 jt3Var) {
            this();
        }

        private C13318a() {
        }
    }

    public u13(@yfb String str) {
        super(f86542c);
        this.f86543b = str;
    }

    public static /* synthetic */ u13 copy$default(u13 u13Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = u13Var.f86543b;
        }
        return u13Var.copy(str);
    }

    @yfb
    public final String component1() {
        return this.f86543b;
    }

    @yfb
    public final u13 copy(@yfb String str) {
        return new u13(str);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u13) && md8.areEqual(this.f86543b, ((u13) obj).f86543b);
    }

    @yfb
    public final String getName() {
        return this.f86543b;
    }

    public int hashCode() {
        return this.f86543b.hashCode();
    }

    @yfb
    public String toString() {
        return "CoroutineName(" + this.f86543b + ')';
    }
}

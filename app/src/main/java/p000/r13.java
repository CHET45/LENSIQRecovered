package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
@yr7
@yjd
public final class r13 extends AbstractC13302u0 implements nxg<String> {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C11841a f76737c = new C11841a(null);

    /* JADX INFO: renamed from: b */
    public final long f76738b;

    /* JADX INFO: renamed from: r13$a */
    public static final class C11841a implements e13.InterfaceC5041c<r13> {
        public /* synthetic */ C11841a(jt3 jt3Var) {
            this();
        }

        private C11841a() {
        }
    }

    public r13(long j) {
        super(f76737c);
        this.f76738b = j;
    }

    public static /* synthetic */ r13 copy$default(r13 r13Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = r13Var.f76738b;
        }
        return r13Var.copy(j);
    }

    public final long component1() {
        return this.f76738b;
    }

    @yfb
    public final r13 copy(long j) {
        return new r13(j);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r13) && this.f76738b == ((r13) obj).f76738b;
    }

    public final long getId() {
        return this.f76738b;
    }

    public int hashCode() {
        return Long.hashCode(this.f76738b);
    }

    @yfb
    public String toString() {
        return "CoroutineId(" + this.f76738b + ')';
    }

    @Override // p000.nxg
    public void restoreThreadContext(@yfb e13 e13Var, @yfb String str) {
        Thread.currentThread().setName(str);
    }

    @Override // p000.nxg
    @yfb
    public String updateThreadContext(@yfb e13 e13Var) {
        String name;
        u13 u13Var = (u13) e13Var.get(u13.f86542c);
        if (u13Var == null || (name = u13Var.getName()) == null) {
            name = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        int iLastIndexOf$default = m9g.lastIndexOf$default((CharSequence) name2, j13.f49326a, 0, false, 6, (Object) null);
        if (iLastIndexOf$default < 0) {
            iLastIndexOf$default = name2.length();
        }
        StringBuilder sb = new StringBuilder(name.length() + iLastIndexOf$default + 10);
        String strSubstring = name2.substring(0, iLastIndexOf$default);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append(j13.f49326a);
        sb.append(name);
        sb.append('#');
        sb.append(this.f76738b);
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        threadCurrentThread.setName(string);
        return name2;
    }
}

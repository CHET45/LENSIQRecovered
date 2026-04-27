package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class tr8 {

    /* JADX INFO: renamed from: h */
    public static final int f85664h = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public final qy6<sr8, bth> f85666a;

    /* JADX INFO: renamed from: b */
    @gib
    public final qy6<sr8, bth> f85667b;

    /* JADX INFO: renamed from: c */
    @gib
    public final qy6<sr8, bth> f85668c;

    /* JADX INFO: renamed from: d */
    @gib
    public final qy6<sr8, bth> f85669d;

    /* JADX INFO: renamed from: e */
    @gib
    public final qy6<sr8, bth> f85670e;

    /* JADX INFO: renamed from: f */
    @gib
    public final qy6<sr8, bth> f85671f;

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C13175a f85663g = new C13175a(null);

    /* JADX INFO: renamed from: i */
    @yfb
    public static final tr8 f85665i = new tr8(null, null, null, null, null, null, 63, null);

    /* JADX INFO: renamed from: tr8$a */
    public static final class C13175a {
        public /* synthetic */ C13175a(jt3 jt3Var) {
            this();
        }

        @f0g
        public static /* synthetic */ void getDefault$annotations() {
        }

        @yfb
        public final tr8 getDefault() {
            return tr8.f85665i;
        }

        private C13175a() {
        }
    }

    public tr8() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr8)) {
            return false;
        }
        tr8 tr8Var = (tr8) obj;
        return this.f85666a == tr8Var.f85666a && this.f85667b == tr8Var.f85667b && this.f85668c == tr8Var.f85668c && this.f85669d == tr8Var.f85669d && this.f85670e == tr8Var.f85670e && this.f85671f == tr8Var.f85671f;
    }

    @gib
    public final qy6<sr8, bth> getOnDone() {
        return this.f85666a;
    }

    @gib
    public final qy6<sr8, bth> getOnGo() {
        return this.f85667b;
    }

    @gib
    public final qy6<sr8, bth> getOnNext() {
        return this.f85668c;
    }

    @gib
    public final qy6<sr8, bth> getOnPrevious() {
        return this.f85669d;
    }

    @gib
    public final qy6<sr8, bth> getOnSearch() {
        return this.f85670e;
    }

    @gib
    public final qy6<sr8, bth> getOnSend() {
        return this.f85671f;
    }

    public int hashCode() {
        qy6<sr8, bth> qy6Var = this.f85666a;
        int iHashCode = (qy6Var != null ? qy6Var.hashCode() : 0) * 31;
        qy6<sr8, bth> qy6Var2 = this.f85667b;
        int iHashCode2 = (iHashCode + (qy6Var2 != null ? qy6Var2.hashCode() : 0)) * 31;
        qy6<sr8, bth> qy6Var3 = this.f85668c;
        int iHashCode3 = (iHashCode2 + (qy6Var3 != null ? qy6Var3.hashCode() : 0)) * 31;
        qy6<sr8, bth> qy6Var4 = this.f85669d;
        int iHashCode4 = (iHashCode3 + (qy6Var4 != null ? qy6Var4.hashCode() : 0)) * 31;
        qy6<sr8, bth> qy6Var5 = this.f85670e;
        int iHashCode5 = (iHashCode4 + (qy6Var5 != null ? qy6Var5.hashCode() : 0)) * 31;
        qy6<sr8, bth> qy6Var6 = this.f85671f;
        return iHashCode5 + (qy6Var6 != null ? qy6Var6.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tr8(@gib qy6<? super sr8, bth> qy6Var, @gib qy6<? super sr8, bth> qy6Var2, @gib qy6<? super sr8, bth> qy6Var3, @gib qy6<? super sr8, bth> qy6Var4, @gib qy6<? super sr8, bth> qy6Var5, @gib qy6<? super sr8, bth> qy6Var6) {
        this.f85666a = qy6Var;
        this.f85667b = qy6Var2;
        this.f85668c = qy6Var3;
        this.f85669d = qy6Var4;
        this.f85670e = qy6Var5;
        this.f85671f = qy6Var6;
    }

    public /* synthetic */ tr8(qy6 qy6Var, qy6 qy6Var2, qy6 qy6Var3, qy6 qy6Var4, qy6 qy6Var5, qy6 qy6Var6, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : qy6Var, (i & 2) != 0 ? null : qy6Var2, (i & 4) != 0 ? null : qy6Var3, (i & 8) != 0 ? null : qy6Var4, (i & 16) != 0 ? null : qy6Var5, (i & 32) != 0 ? null : qy6Var6);
    }
}

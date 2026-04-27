package p000;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
public final class pp8 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C11061a f71581c = new C11061a(null);

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public static final pp8 f71582d = new pp8(null, null);

    /* JADX INFO: renamed from: a */
    @gib
    public final rp8 f71583a;

    /* JADX INFO: renamed from: b */
    @gib
    public final mp8 f71584b;

    /* JADX INFO: renamed from: pp8$a */
    public static final class C11061a {
        public /* synthetic */ C11061a(jt3 jt3Var) {
            this();
        }

        @yjd
        public static /* synthetic */ void getStar$annotations() {
        }

        @do8
        @yfb
        public final pp8 contravariant(@yfb mp8 mp8Var) {
            md8.checkNotNullParameter(mp8Var, "type");
            return new pp8(rp8.f78979b, mp8Var);
        }

        @do8
        @yfb
        public final pp8 covariant(@yfb mp8 mp8Var) {
            md8.checkNotNullParameter(mp8Var, "type");
            return new pp8(rp8.f78980c, mp8Var);
        }

        @yfb
        public final pp8 getSTAR() {
            return pp8.f71582d;
        }

        @do8
        @yfb
        public final pp8 invariant(@yfb mp8 mp8Var) {
            md8.checkNotNullParameter(mp8Var, "type");
            return new pp8(rp8.f78978a, mp8Var);
        }

        private C11061a() {
        }
    }

    /* JADX INFO: renamed from: pp8$b */
    public /* synthetic */ class C11062b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f71585a;

        static {
            int[] iArr = new int[rp8.values().length];
            try {
                iArr[rp8.f78978a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rp8.f78979b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rp8.f78980c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71585a = iArr;
        }
    }

    public pp8(@gib rp8 rp8Var, @gib mp8 mp8Var) {
        String str;
        this.f71583a = rp8Var;
        this.f71584b = mp8Var;
        if ((rp8Var == null) == (mp8Var == null)) {
            return;
        }
        if (rp8Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + rp8Var + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @do8
    @yfb
    public static final pp8 contravariant(@yfb mp8 mp8Var) {
        return f71581c.contravariant(mp8Var);
    }

    public static /* synthetic */ pp8 copy$default(pp8 pp8Var, rp8 rp8Var, mp8 mp8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            rp8Var = pp8Var.f71583a;
        }
        if ((i & 2) != 0) {
            mp8Var = pp8Var.f71584b;
        }
        return pp8Var.copy(rp8Var, mp8Var);
    }

    @do8
    @yfb
    public static final pp8 covariant(@yfb mp8 mp8Var) {
        return f71581c.covariant(mp8Var);
    }

    @do8
    @yfb
    public static final pp8 invariant(@yfb mp8 mp8Var) {
        return f71581c.invariant(mp8Var);
    }

    @gib
    public final rp8 component1() {
        return this.f71583a;
    }

    @gib
    public final mp8 component2() {
        return this.f71584b;
    }

    @yfb
    public final pp8 copy(@gib rp8 rp8Var, @gib mp8 mp8Var) {
        return new pp8(rp8Var, mp8Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp8)) {
            return false;
        }
        pp8 pp8Var = (pp8) obj;
        return this.f71583a == pp8Var.f71583a && md8.areEqual(this.f71584b, pp8Var.f71584b);
    }

    @gib
    public final mp8 getType() {
        return this.f71584b;
    }

    @gib
    public final rp8 getVariance() {
        return this.f71583a;
    }

    public int hashCode() {
        rp8 rp8Var = this.f71583a;
        int iHashCode = (rp8Var == null ? 0 : rp8Var.hashCode()) * 31;
        mp8 mp8Var = this.f71584b;
        return iHashCode + (mp8Var != null ? mp8Var.hashCode() : 0);
    }

    @yfb
    public String toString() {
        rp8 rp8Var = this.f71583a;
        int i = rp8Var == null ? -1 : C11062b.f71585a[rp8Var.ordinal()];
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.f71584b);
        }
        if (i == 2) {
            return "in " + this.f71584b;
        }
        if (i != 3) {
            throw new ceb();
        }
        return "out " + this.f71584b;
    }
}

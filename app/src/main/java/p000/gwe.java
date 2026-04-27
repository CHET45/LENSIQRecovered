package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class gwe {

    /* JADX INFO: renamed from: d */
    public static final int f41743d = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C6633a f41744a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final C6633a f41745b;

    /* JADX INFO: renamed from: c */
    public final boolean f41746c;

    /* JADX INFO: renamed from: gwe$a */
    @vw7
    public static final class C6633a {

        /* JADX INFO: renamed from: d */
        public static final int f41747d = 0;

        /* JADX INFO: renamed from: a */
        @yfb
        public final q5e f41748a;

        /* JADX INFO: renamed from: b */
        public final int f41749b;

        /* JADX INFO: renamed from: c */
        public final long f41750c;

        public C6633a(@yfb q5e q5eVar, int i, long j) {
            this.f41748a = q5eVar;
            this.f41749b = i;
            this.f41750c = j;
        }

        public static /* synthetic */ C6633a copy$default(C6633a c6633a, q5e q5eVar, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                q5eVar = c6633a.f41748a;
            }
            if ((i2 & 2) != 0) {
                i = c6633a.f41749b;
            }
            if ((i2 & 4) != 0) {
                j = c6633a.f41750c;
            }
            return c6633a.copy(q5eVar, i, j);
        }

        @yfb
        public final q5e component1() {
            return this.f41748a;
        }

        public final int component2() {
            return this.f41749b;
        }

        public final long component3() {
            return this.f41750c;
        }

        @yfb
        public final C6633a copy(@yfb q5e q5eVar, int i, long j) {
            return new C6633a(q5eVar, i, j);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6633a)) {
                return false;
            }
            C6633a c6633a = (C6633a) obj;
            return this.f41748a == c6633a.f41748a && this.f41749b == c6633a.f41749b && this.f41750c == c6633a.f41750c;
        }

        @yfb
        public final q5e getDirection() {
            return this.f41748a;
        }

        public final int getOffset() {
            return this.f41749b;
        }

        public final long getSelectableId() {
            return this.f41750c;
        }

        public int hashCode() {
            return (((this.f41748a.hashCode() * 31) + Integer.hashCode(this.f41749b)) * 31) + Long.hashCode(this.f41750c);
        }

        @yfb
        public String toString() {
            return "AnchorInfo(direction=" + this.f41748a + ", offset=" + this.f41749b + ", selectableId=" + this.f41750c + ')';
        }
    }

    public gwe(@yfb C6633a c6633a, @yfb C6633a c6633a2, boolean z) {
        this.f41744a = c6633a;
        this.f41745b = c6633a2;
        this.f41746c = z;
    }

    public static /* synthetic */ gwe copy$default(gwe gweVar, C6633a c6633a, C6633a c6633a2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            c6633a = gweVar.f41744a;
        }
        if ((i & 2) != 0) {
            c6633a2 = gweVar.f41745b;
        }
        if ((i & 4) != 0) {
            z = gweVar.f41746c;
        }
        return gweVar.copy(c6633a, c6633a2, z);
    }

    @yfb
    public final C6633a component1() {
        return this.f41744a;
    }

    @yfb
    public final C6633a component2() {
        return this.f41745b;
    }

    public final boolean component3() {
        return this.f41746c;
    }

    @yfb
    public final gwe copy(@yfb C6633a c6633a, @yfb C6633a c6633a2, boolean z) {
        return new gwe(c6633a, c6633a2, z);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwe)) {
            return false;
        }
        gwe gweVar = (gwe) obj;
        return md8.areEqual(this.f41744a, gweVar.f41744a) && md8.areEqual(this.f41745b, gweVar.f41745b) && this.f41746c == gweVar.f41746c;
    }

    @yfb
    public final C6633a getEnd() {
        return this.f41745b;
    }

    public final boolean getHandlesCrossed() {
        return this.f41746c;
    }

    @yfb
    public final C6633a getStart() {
        return this.f41744a;
    }

    public int hashCode() {
        return (((this.f41744a.hashCode() * 31) + this.f41745b.hashCode()) * 31) + Boolean.hashCode(this.f41746c);
    }

    @yfb
    public final gwe merge(@gib gwe gweVar) {
        if (gweVar == null) {
            return this;
        }
        boolean z = this.f41746c;
        if (z || gweVar.f41746c) {
            return new gwe(gweVar.f41746c ? gweVar.f41744a : gweVar.f41745b, z ? this.f41745b : this.f41744a, true);
        }
        return copy$default(this, null, gweVar.f41745b, false, 5, null);
    }

    @yfb
    public String toString() {
        return "Selection(start=" + this.f41744a + ", end=" + this.f41745b + ", handlesCrossed=" + this.f41746c + ')';
    }

    /* JADX INFO: renamed from: toTextRange-d9O1mEE, reason: not valid java name */
    public final long m29875toTextRanged9O1mEE() {
        return kvg.TextRange(this.f41744a.getOffset(), this.f41745b.getOffset());
    }

    public /* synthetic */ gwe(C6633a c6633a, C6633a c6633a2, boolean z, int i, jt3 jt3Var) {
        this(c6633a, c6633a2, (i & 4) != 0 ? false : z);
    }
}

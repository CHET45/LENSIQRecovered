package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/ProgressBarRangeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1617:1\n1#2:1618\n*E\n"})
@e0g(parameters = 1)
public final class jed {

    /* JADX INFO: renamed from: e */
    public static final int f50395e = 0;

    /* JADX INFO: renamed from: a */
    public final float f50397a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z52<Float> f50398b;

    /* JADX INFO: renamed from: c */
    public final int f50399c;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C7880a f50394d = new C7880a(null);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final jed f50396f = new jed(0.0f, jpd.rangeTo(0.0f, 0.0f), 0, 4, null);

    /* JADX INFO: renamed from: jed$a */
    public static final class C7880a {
        public /* synthetic */ C7880a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final jed getIndeterminate() {
            return jed.f50396f;
        }

        private C7880a() {
        }
    }

    public jed(float f, @yfb z52<Float> z52Var, int i) {
        this.f50397a = f;
        this.f50398b = z52Var;
        this.f50399c = i;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jed)) {
            return false;
        }
        jed jedVar = (jed) obj;
        return this.f50397a == jedVar.f50397a && md8.areEqual(this.f50398b, jedVar.f50398b) && this.f50399c == jedVar.f50399c;
    }

    public final float getCurrent() {
        return this.f50397a;
    }

    @yfb
    public final z52<Float> getRange() {
        return this.f50398b;
    }

    public final int getSteps() {
        return this.f50399c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f50397a) * 31) + this.f50398b.hashCode()) * 31) + this.f50399c;
    }

    @yfb
    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f50397a + ", range=" + this.f50398b + ", steps=" + this.f50399c + ')';
    }

    public /* synthetic */ jed(float f, z52 z52Var, int i, int i2, jt3 jt3Var) {
        this(f, z52Var, (i2 & 4) != 0 ? 0 : i);
    }
}

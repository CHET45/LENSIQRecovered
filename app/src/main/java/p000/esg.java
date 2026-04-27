package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface esg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C5457a f33982a = C5457a.f33983a;

    /* JADX INFO: renamed from: esg$a */
    public static final class C5457a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C5457a f33983a = new C5457a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final esg f33984b;

        static {
            int i = 0;
            f33984b = new C5458b(i, i, 3, null);
        }

        private C5457a() {
        }

        @yfb
        public final esg getDefault() {
            return f33984b;
        }
    }

    /* JADX INFO: renamed from: esg$b */
    @vw7
    public static final class C5458b implements esg {

        /* JADX INFO: renamed from: d */
        public static final int f33985d = 0;

        /* JADX INFO: renamed from: b */
        public final int f33986b;

        /* JADX INFO: renamed from: c */
        public final int f33987c;

        /* JADX WARN: Illegal instructions before constructor call */
        public C5458b() {
            int i = 0;
            this(i, i, 3, null);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5458b.class != obj.getClass()) {
                return false;
            }
            C5458b c5458b = (C5458b) obj;
            return this.f33986b == c5458b.f33986b && this.f33987c == c5458b.f33987c;
        }

        public final int getMaxHeightInLines() {
            return this.f33987c;
        }

        public final int getMinHeightInLines() {
            return this.f33986b;
        }

        public int hashCode() {
            return (this.f33986b * 31) + this.f33987c;
        }

        @yfb
        public String toString() {
            return "MultiLine(minHeightInLines=" + this.f33986b + ", maxHeightInLines=" + this.f33987c + ')';
        }

        public C5458b(int i, int i2) {
            this.f33986b = i;
            this.f33987c = i2;
            if (1 > i || i > i2) {
                throw new IllegalArgumentException(("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i + ", " + i2).toString());
            }
        }

        public /* synthetic */ C5458b(int i, int i2, int i3, jt3 jt3Var) {
            this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2);
        }
    }

    /* JADX INFO: renamed from: esg$c */
    @e0g(parameters = 1)
    public static final class C5459c implements esg {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final C5459c f33988b = new C5459c();

        /* JADX INFO: renamed from: c */
        public static final int f33989c = 0;

        private C5459c() {
        }

        @yfb
        public String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }
}

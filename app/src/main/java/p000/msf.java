package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface msf {

    /* JADX INFO: renamed from: msf$a */
    @e0g(parameters = 1)
    public static final class C9499a implements msf {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C9499a f61956a = new C9499a();

        /* JADX INFO: renamed from: b */
        public static final int f61957b = 0;

        private C9499a() {
        }

        @Override // p000.msf
        public int position(int i, int i2, int i3, int i4, int i5, int i6) {
            return (((i - i3) - i4) / 2) - (i2 / 2);
        }

        @yfb
        public String toString() {
            return "Center";
        }
    }

    /* JADX INFO: renamed from: msf$b */
    @e0g(parameters = 1)
    public static final class C9500b implements msf {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C9500b f61958a = new C9500b();

        /* JADX INFO: renamed from: b */
        public static final int f61959b = 0;

        private C9500b() {
        }

        @Override // p000.msf
        public int position(int i, int i2, int i3, int i4, int i5, int i6) {
            return ((i - i3) - i4) - i2;
        }

        @yfb
        public String toString() {
            return "End";
        }
    }

    /* JADX INFO: renamed from: msf$c */
    @e0g(parameters = 1)
    public static final class C9501c implements msf {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C9501c f61960a = new C9501c();

        /* JADX INFO: renamed from: b */
        public static final int f61961b = 0;

        private C9501c() {
        }

        @Override // p000.msf
        public int position(int i, int i2, int i3, int i4, int i5, int i6) {
            return 0;
        }

        @yfb
        public String toString() {
            return "Start";
        }
    }

    int position(int i, int i2, int i3, int i4, int i5, int i6);
}

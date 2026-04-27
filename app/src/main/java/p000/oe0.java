package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class oe0 {

    /* JADX INFO: renamed from: d */
    public static final oe0 f67372d = new C10335b().build();

    /* JADX INFO: renamed from: a */
    public final boolean f67373a;

    /* JADX INFO: renamed from: b */
    public final boolean f67374b;

    /* JADX INFO: renamed from: c */
    public final boolean f67375c;

    /* JADX INFO: renamed from: oe0$b */
    public static final class C10335b {

        /* JADX INFO: renamed from: a */
        public boolean f67376a;

        /* JADX INFO: renamed from: b */
        public boolean f67377b;

        /* JADX INFO: renamed from: c */
        public boolean f67378c;

        public C10335b() {
        }

        public oe0 build() {
            if (this.f67376a || !(this.f67377b || this.f67378c)) {
                return new oe0(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        @op1
        public C10335b setIsFormatSupported(boolean z) {
            this.f67376a = z;
            return this;
        }

        @op1
        public C10335b setIsGaplessSupported(boolean z) {
            this.f67377b = z;
            return this;
        }

        @op1
        public C10335b setIsSpeedChangeSupported(boolean z) {
            this.f67378c = z;
            return this;
        }

        public C10335b(oe0 oe0Var) {
            this.f67376a = oe0Var.f67373a;
            this.f67377b = oe0Var.f67374b;
            this.f67378c = oe0Var.f67375c;
        }
    }

    public C10335b buildUpon() {
        return new C10335b(this);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oe0.class != obj.getClass()) {
            return false;
        }
        oe0 oe0Var = (oe0) obj;
        return this.f67373a == oe0Var.f67373a && this.f67374b == oe0Var.f67374b && this.f67375c == oe0Var.f67375c;
    }

    public int hashCode() {
        return ((this.f67373a ? 1 : 0) << 2) + ((this.f67374b ? 1 : 0) << 1) + (this.f67375c ? 1 : 0);
    }

    private oe0(C10335b c10335b) {
        this.f67373a = c10335b.f67376a;
        this.f67374b = c10335b.f67377b;
        this.f67375c = c10335b.f67378c;
    }
}

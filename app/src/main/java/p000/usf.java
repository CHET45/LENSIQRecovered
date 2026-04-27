package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public abstract class usf {

    /* JADX INFO: renamed from: a */
    public static final int f89046a = 0;

    /* JADX INFO: renamed from: usf$a */
    @e0g(parameters = 0)
    public static final class C13694a extends usf {

        /* JADX INFO: renamed from: c */
        public static final int f89047c = 8;

        /* JADX INFO: renamed from: b */
        @yfb
        public final ssf f89048b;

        public C13694a(@yfb ssf ssfVar) {
            super(null);
            this.f89048b = ssfVar;
        }

        @Override // p000.usf
        public void check() throws tsf {
            this.f89048b.dispose();
            throw new tsf(this.f89048b);
        }

        @yfb
        public final ssf getSnapshot() {
            return this.f89048b;
        }

        @Override // p000.usf
        public boolean getSucceeded() {
            return false;
        }
    }

    /* JADX INFO: renamed from: usf$b */
    @e0g(parameters = 1)
    public static final class C13695b extends usf {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final C13695b f89049b = new C13695b();

        /* JADX INFO: renamed from: c */
        public static final int f89050c = 0;

        private C13695b() {
            super(null);
        }

        @Override // p000.usf
        public void check() {
        }

        @Override // p000.usf
        public boolean getSucceeded() {
            return true;
        }
    }

    public /* synthetic */ usf(jt3 jt3Var) {
        this();
    }

    public abstract void check();

    public abstract boolean getSucceeded();

    private usf() {
    }
}

package p000;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class yig {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C15686a f101747e = new C15686a(null);

    /* JADX INFO: renamed from: a */
    public final int f101748a;

    /* JADX INFO: renamed from: b */
    public final int f101749b;

    /* JADX INFO: renamed from: c */
    public final int f101750c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final qy6<Resources, Boolean> f101751d;

    /* JADX INFO: renamed from: yig$a */
    public static final class C15686a {

        /* JADX INFO: renamed from: yig$a$a */
        public static final class a extends tt8 implements qy6<Resources, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final a f101752a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb Resources resources) {
                md8.checkNotNullParameter(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        /* JADX INFO: renamed from: yig$a$b */
        public static final class b extends tt8 implements qy6<Resources, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final b f101753a = new b();

            public b() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb Resources resources) {
                md8.checkNotNullParameter(resources, "<anonymous parameter 0>");
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: yig$a$c */
        public static final class c extends tt8 implements qy6<Resources, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final c f101754a = new c();

            public c() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb Resources resources) {
                md8.checkNotNullParameter(resources, "<anonymous parameter 0>");
                return Boolean.FALSE;
            }
        }

        public /* synthetic */ C15686a(jt3 jt3Var) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ yig auto$default(C15686a c15686a, int i, int i2, qy6 qy6Var, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                qy6Var = a.f101752a;
            }
            return c15686a.auto(i, i2, qy6Var);
        }

        @do8
        @yfb
        @yn8
        public final yig auto(@g92 int i, @g92 int i2) {
            return auto$default(this, i, i2, null, 4, null);
        }

        @do8
        @yfb
        public final yig dark(@g92 int i) {
            return new yig(i, i, 2, b.f101753a, null);
        }

        @do8
        @yfb
        public final yig light(@g92 int i, @g92 int i2) {
            return new yig(i, i2, 1, c.f101754a, null);
        }

        private C15686a() {
        }

        @do8
        @yfb
        @yn8
        public final yig auto(@g92 int i, @g92 int i2, @yfb qy6<? super Resources, Boolean> qy6Var) {
            md8.checkNotNullParameter(qy6Var, "detectDarkMode");
            return new yig(i, i2, 0, qy6Var, null);
        }
    }

    public /* synthetic */ yig(int i, int i2, int i3, qy6 qy6Var, jt3 jt3Var) {
        this(i, i2, i3, qy6Var);
    }

    @do8
    @yfb
    @yn8
    public static final yig auto(@g92 int i, @g92 int i2) {
        return f101747e.auto(i, i2);
    }

    @do8
    @yfb
    public static final yig dark(@g92 int i) {
        return f101747e.dark(i);
    }

    @do8
    @yfb
    public static final yig light(@g92 int i, @g92 int i2) {
        return f101747e.light(i, i2);
    }

    public final int getDarkScrim$activity_release() {
        return this.f101749b;
    }

    @yfb
    public final qy6<Resources, Boolean> getDetectDarkMode$activity_release() {
        return this.f101751d;
    }

    public final int getNightMode$activity_release() {
        return this.f101750c;
    }

    public final int getScrim$activity_release(boolean z) {
        return z ? this.f101749b : this.f101748a;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z) {
        if (this.f101750c == 0) {
            return 0;
        }
        return z ? this.f101749b : this.f101748a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private yig(int i, int i2, int i3, qy6<? super Resources, Boolean> qy6Var) {
        this.f101748a = i;
        this.f101749b = i2;
        this.f101750c = i3;
        this.f101751d = qy6Var;
    }

    @do8
    @yfb
    @yn8
    public static final yig auto(@g92 int i, @g92 int i2, @yfb qy6<? super Resources, Boolean> qy6Var) {
        return f101747e.auto(i, i2, qy6Var);
    }
}

package p000;

/* JADX INFO: loaded from: classes.dex */
@ug5
@e0g(parameters = 0)
public final class aye {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final aye f12209a = new aye();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final dye<Boolean> f12210b = new dye<>("TestTagsAsResourceId", false, C1666a.f12212a);

    /* JADX INFO: renamed from: c */
    public static final int f12211c = 8;

    /* JADX INFO: renamed from: aye$a */
    public static final class C1666a extends tt8 implements gz6<Boolean, Boolean, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C1666a f12212a = new C1666a();

        public C1666a() {
            super(2);
        }

        @gib
        public final Boolean invoke(@gib Boolean bool, boolean z) {
            return bool;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return invoke(bool, bool2.booleanValue());
        }
    }

    private aye() {
    }

    @ug5
    public static /* synthetic */ void getTestTagsAsResourceId$annotations() {
    }

    @ug5
    @yfb
    public final dye<Boolean> getTestTagsAsResourceId() {
        return f12210b;
    }
}

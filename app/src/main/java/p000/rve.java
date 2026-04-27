package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class rve {

    /* JADX INFO: renamed from: b */
    public static final int f79890b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f79891c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f79892d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f79893e = 3;

    /* JADX INFO: renamed from: a */
    @yfb
    public static final kz6<Object, Object, Object, Object> f79889a = C12320a.f79899a;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final qhg f79894f = new qhg("STATE_REG");

    /* JADX INFO: renamed from: g */
    @yfb
    public static final qhg f79895g = new qhg("STATE_COMPLETED");

    /* JADX INFO: renamed from: h */
    @yfb
    public static final qhg f79896h = new qhg("STATE_CANCELLED");

    /* JADX INFO: renamed from: i */
    @yfb
    public static final qhg f79897i = new qhg("NO_RESULT");

    /* JADX INFO: renamed from: j */
    @yfb
    public static final qhg f79898j = new qhg("PARAM_CLAUSE_0");

    /* JADX INFO: renamed from: rve$a */
    public static final class C12320a implements kz6 {

        /* JADX INFO: renamed from: a */
        public static final C12320a f79899a = new C12320a();

        @Override // p000.kz6
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    @la8
    public static /* synthetic */ void OnCancellationConstructor$annotations() {
    }

    @la8
    public static /* synthetic */ void ProcessResultFunction$annotations() {
    }

    @la8
    public static /* synthetic */ void RegistrationFunction$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sjh TrySelectDetailedResult(int i) {
        if (i == 0) {
            return sjh.f82049a;
        }
        if (i == 1) {
            return sjh.f82050b;
        }
        if (i == 2) {
            return sjh.f82051c;
        }
        if (i == 3) {
            return sjh.f82052d;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i).toString());
    }

    @yfb
    public static final qhg getPARAM_CLAUSE_0() {
        return f79898j;
    }

    @gib
    public static final <R> Object select(@yfb qy6<? super fve<? super R>, bth> qy6Var, @yfb zy2<? super R> zy2Var) {
        ove oveVar = new ove(zy2Var.getContext());
        qy6Var.invoke(oveVar);
        return oveVar.doSelect(zy2Var);
    }

    private static final <R> Object select$$forInline(qy6<? super fve<? super R>, bth> qy6Var, zy2<? super R> zy2Var) {
        o28.mark(3);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean tryResume(dq1<? super bth> dq1Var, kz6<? super Throwable, Object, ? super e13, bth> kz6Var) {
        Object objTryResume = dq1Var.tryResume(bth.f14751a, null, kz6Var);
        if (objTryResume == null) {
            return false;
        }
        dq1Var.completeResume(objTryResume);
        return true;
    }
}

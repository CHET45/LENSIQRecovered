package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
public final class s2e implements ny6<bth> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final gy6 f80442a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<Boolean> f80443b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final cuf f80444c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final qy6<ny6<Boolean>, bth> f80445d;

    /* JADX INFO: renamed from: s2e$a */
    public /* synthetic */ class C12410a extends n07 implements qy6<ny6<? extends Boolean>, bth> {
        public C12410a(Object obj) {
            super(1, obj, s2e.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ny6<? extends Boolean> ny6Var) {
            invoke2((ny6<Boolean>) ny6Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ny6<Boolean> ny6Var) {
            ((s2e) this.receiver).observeReporter(ny6Var);
        }
    }

    /* JADX INFO: renamed from: s2e$b */
    public static final class C12411b extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8114a f80446a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<Boolean> f80447b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12411b(jvd.C8114a c8114a, ny6<Boolean> ny6Var) {
            super(0);
            this.f80446a = c8114a;
            this.f80447b = ny6Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f80446a.f52103a = this.f80447b.invoke().booleanValue();
        }
    }

    /* JADX INFO: renamed from: s2e$c */
    public static final class C12412c extends tt8 implements qy6<ny6<? extends bth>, bth> {

        /* JADX INFO: renamed from: a */
        public static final C12412c f80448a = new C12412c();

        public C12412c() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ny6<bth> ny6Var) {
            ny6Var.invoke();
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ny6<? extends bth> ny6Var) {
            invoke2((ny6<bth>) ny6Var);
            return bth.f14751a;
        }
    }

    public s2e(@yfb gy6 gy6Var, @yfb ny6<Boolean> ny6Var) {
        this.f80442a = gy6Var;
        this.f80443b = ny6Var;
        cuf cufVar = new cuf(C12412c.f80448a);
        cufVar.start();
        this.f80444c = cufVar;
        this.f80445d = new C12410a(this);
        gy6Var.addOnReportDrawnListener(this);
        if (gy6Var.isFullyDrawnReported()) {
            return;
        }
        gy6Var.addReporter();
        observeReporter(ny6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(ny6<Boolean> ny6Var) {
        jvd.C8114a c8114a = new jvd.C8114a();
        this.f80444c.observeReads(ny6Var, this.f80445d, new C12411b(c8114a, ny6Var));
        if (c8114a.f52103a) {
            removeReporter();
        }
    }

    @Override // p000.ny6
    public /* bridge */ /* synthetic */ bth invoke() {
        invoke2();
        return bth.f14751a;
    }

    public final void removeReporter() {
        this.f80444c.clear(this.f80443b);
        if (!this.f80442a.isFullyDrawnReported()) {
            this.f80442a.removeReporter();
        }
        invoke2();
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2() {
        this.f80444c.clear();
        this.f80444c.stop();
    }
}

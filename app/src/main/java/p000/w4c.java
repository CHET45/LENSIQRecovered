package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nOnTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,62:1\n13#2:63\n*S KotlinDebug\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n52#1:63\n*E\n"})
public final class w4c {

    /* JADX INFO: renamed from: a */
    public final long f93242a;

    /* JADX INFO: renamed from: w4c$a */
    @dwf({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n1#1,13:1\n53#2,2:14\n*E\n"})
    public static final class RunnableC14381a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pve f93243a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w4c f93244b;

        public RunnableC14381a(pve pveVar, w4c w4cVar) {
            this.f93243a = pveVar;
            this.f93244b = w4cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f93243a.trySelect(this.f93244b, bth.f14751a);
        }
    }

    /* JADX INFO: renamed from: w4c$b */
    public /* synthetic */ class C14382b extends n07 implements kz6<w4c, pve<?>, Object, bth> {

        /* JADX INFO: renamed from: a */
        public static final C14382b f93245a = new C14382b();

        public C14382b() {
            super(3, w4c.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(w4c w4cVar, pve<?> pveVar, Object obj) {
            invoke2(w4cVar, pveVar, obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(w4c w4cVar, pve<?> pveVar, Object obj) {
            w4cVar.register(pveVar, obj);
        }
    }

    public w4c(long j) {
        this.f93242a = j;
    }

    public static /* synthetic */ void getSelectClause$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void register(pve<?> pveVar, Object obj) {
        if (this.f93242a <= 0) {
            pveVar.selectInRegistrationPhase(bth.f14751a);
            return;
        }
        RunnableC14381a runnableC14381a = new RunnableC14381a(pveVar, this);
        md8.checkNotNull(pveVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        ove oveVar = (ove) pveVar;
        e13 context = oveVar.getContext();
        oveVar.disposeOnCompletion(p34.getDelay(context).invokeOnTimeout(this.f93242a, runnableC14381a, context));
    }

    @yfb
    public final hve getSelectClause() {
        C14382b c14382b = C14382b.f93245a;
        md8.checkNotNull(c14382b, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new ive(this, (kz6) qlh.beforeCheckcastToFunctionOfArity(c14382b, 3), null, 4, null);
    }
}

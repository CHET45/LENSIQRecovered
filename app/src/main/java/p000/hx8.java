package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class hx8<E> extends C15619yd<E> {

    /* JADX INFO: renamed from: e */
    @yfb
    public zy2<? super bth> f45187e;

    /* JADX INFO: renamed from: hx8$a */
    public /* synthetic */ class C7075a extends n07 implements kz6<hx8<?>, pve<?>, Object, bth> {

        /* JADX INFO: renamed from: a */
        public static final C7075a f45188a = new C7075a();

        public C7075a() {
            super(3, hx8.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(hx8<?> hx8Var, pve<?> pveVar, Object obj) throws Throwable {
            invoke2(hx8Var, pveVar, obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(hx8<?> hx8Var, pve<?> pveVar, Object obj) throws Throwable {
            hx8Var.onSendRegFunction(pveVar, obj);
        }
    }

    public hx8(@yfb e13 e13Var, @yfb au1<E> au1Var, @yfb gz6<? super InterfaceC0187ae<E>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        super(e13Var, au1Var, false);
        this.f45187e = od8.createCoroutineUnintercepted(gz6Var, this, this);
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSendRegFunction(pve<?> pveVar, Object obj) throws Throwable {
        mo2873m();
        super.getOnSend().getRegFunc().invoke(this, pveVar, obj);
    }

    @Override // p000.du1, p000.nye
    public boolean close(@gib Throwable th) {
        boolean zClose = super.close(th);
        start();
        return zClose;
    }

    @Override // p000.du1, p000.nye
    @yfb
    public lve<E, nye<E>> getOnSend() {
        C7075a c7075a = C7075a.f45188a;
        md8.checkNotNull(c7075a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new mve(this, (kz6) qlh.beforeCheckcastToFunctionOfArity(c7075a, 3), super.getOnSend().getProcessResFunc(), null, 8, null);
    }

    @Override // p000.sj8
    /* JADX INFO: renamed from: m */
    public void mo2873m() throws Throwable {
        mq1.startCoroutineCancellable(this.f45187e, this);
    }

    @Override // p000.du1, p000.nye
    @q64(level = u64.f86866b, message = "Deprecated in the favour of 'trySend' method", replaceWith = @i2e(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        start();
        return super.offer(e);
    }

    @Override // p000.du1, p000.nye
    @gib
    public Object send(E e, @yfb zy2<? super bth> zy2Var) {
        start();
        Object objSend = super.send(e, zy2Var);
        return objSend == pd8.getCOROUTINE_SUSPENDED() ? objSend : bth.f14751a;
    }

    @Override // p000.du1, p000.nye
    @yfb
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo28705trySendJP2dKIU(E e) {
        start();
        return super.mo28705trySendJP2dKIU(e);
    }
}

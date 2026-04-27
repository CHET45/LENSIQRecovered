package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
public final class n2g {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qhg f63091a = new qhg("NONE");

    /* JADX INFO: renamed from: b */
    @yfb
    public static final qhg f63092b = new qhg("PENDING");

    @yfb
    public static final <T> a7b<T> MutableStateFlow(T t) {
        if (t == null) {
            t = (T) zhb.f105096a;
        }
        return new m2g(t);
    }

    @yfb
    public static final <T> y56<T> fuseStateFlow(@yfb l2g<? extends T> l2gVar, @yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return (((i < 0 || i >= 2) && i != -2) || gf1Var != gf1.f39658b) ? s9f.fuseSharedFlow(l2gVar, e13Var, i, gf1Var) : l2gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T getAndUpdate(@yfb a7b<T> a7bVar, @yfb qy6<? super T, ? extends T> qy6Var) {
        ?? r0;
        do {
            r0 = (Object) a7bVar.getValue();
        } while (!a7bVar.compareAndSet(r0, qy6Var.invoke(r0)));
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(@yfb a7b<T> a7bVar, @yfb qy6<? super T, ? extends T> qy6Var) {
        InterfaceC0000a interfaceC0000a;
        do {
            interfaceC0000a = (Object) a7bVar.getValue();
        } while (!a7bVar.compareAndSet(interfaceC0000a, qy6Var.invoke(interfaceC0000a)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T updateAndGet(@yfb a7b<T> a7bVar, @yfb qy6<? super T, ? extends T> qy6Var) {
        InterfaceC0000a interfaceC0000a;
        T tInvoke;
        do {
            interfaceC0000a = (Object) a7bVar.getValue();
            tInvoke = qy6Var.invoke(interfaceC0000a);
        } while (!a7bVar.compareAndSet(interfaceC0000a, tInvoke));
        return tInvoke;
    }
}

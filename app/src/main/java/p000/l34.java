package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDeferredTargetAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n81#2:92\n107#2,2:93\n1#3:95\n*S KotlinDebug\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n*L\n53#1:92\n53#1:93,2\n*E\n"})
@e0g(parameters = 0)
@hg5
public final class l34<T, V extends AbstractC16313zy> {

    /* JADX INFO: renamed from: d */
    public static final int f56060d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final alh<T, V> f56061a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b f56062b = xtf.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: c */
    @gib
    public C13257tw<T, V> f56063c;

    /* JADX INFO: renamed from: l34$a */
    @ck3(m4009c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1", m4010f = "DeferredTargetAnimation.kt", m4011i = {}, m4012l = {77}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C8595a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f56064a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C13257tw<T, V> f56065b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ l34<T, V> f56066c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ T f56067d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ fw5<T> f56068e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8595a(C13257tw<T, V> c13257tw, l34<T, V> l34Var, T t, fw5<T> fw5Var, zy2<? super C8595a> zy2Var) {
            super(2, zy2Var);
            this.f56065b = c13257tw;
            this.f56066c = l34Var;
            this.f56067d = t;
            this.f56068e = fw5Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C8595a(this.f56065b, this.f56066c, this.f56067d, this.f56068e, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C8595a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f56064a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                if (!md8.areEqual(this.f56065b.getTargetValue(), this.f56066c.get_pendingTarget())) {
                    C13257tw<T, V> c13257tw = this.f56065b;
                    T t = this.f56067d;
                    fw5<T> fw5Var = this.f56068e;
                    this.f56064a = 1;
                    if (C13257tw.animateTo$default(c13257tw, t, fw5Var, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    public l34(@yfb alh<T, V> alhVar) {
        this.f56061a = alhVar;
    }

    private final T getTarget() {
        C13257tw<T, V> c13257tw = this.f56063c;
        if (c13257tw != null) {
            return c13257tw.getTargetValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T get_pendingTarget() {
        return this.f56062b.getValue();
    }

    private final void set_pendingTarget(T t) {
        this.f56062b.setValue(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateTarget$default(l34 l34Var, Object obj, x13 x13Var, fw5 fw5Var, int i, Object obj2) {
        if ((i & 4) != 0) {
            fw5Var = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return l34Var.updateTarget(obj, x13Var, fw5Var);
    }

    @gib
    public final T getPendingTarget() {
        return get_pendingTarget();
    }

    public final boolean isIdle() {
        C13257tw<T, V> c13257tw;
        return md8.areEqual(get_pendingTarget(), getTarget()) && ((c13257tw = this.f56063c) == null || !c13257tw.isRunning());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ??, still in use, count: 1, list:
          (r0v4 ?? I:tw<T, V extends zy>) from 0x0016: IPUT (r0v4 ?? I:tw<T, V extends zy>), (r14v0 'this' ?? I:l34 A[IMMUTABLE_TYPE, THIS]) l34.c tw
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final T updateTarget(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ??, still in use, count: 1, list:
          (r0v4 ?? I:tw<T, V extends zy>) from 0x0016: IPUT (r0v4 ?? I:tw<T, V extends zy>), (r14v0 'this' ?? I:l34 A[IMMUTABLE_TYPE, THIS]) l34.c tw
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}

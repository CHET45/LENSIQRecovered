package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class s77 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final s77 f80900a = new s77();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final AtomicBoolean f80901b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final AtomicBoolean f80902c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final int f80903d = 8;

    /* JADX INFO: renamed from: s77$a */
    @ck3(m4009c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", m4010f = "GlobalSnapshotManager.android.kt", m4011i = {0}, m4012l = {67}, m4013m = "invokeSuspend", m4014n = {"$this$consume$iv$iv"}, m4015s = {"L$0"})
    @dwf({"SMAP\nGlobalSnapshotManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,59:1\n105#2:60\n82#2,6:61\n106#2,2:67\n92#2:69\n88#2,3:70\n*S KotlinDebug\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n*L\n46#1:60\n46#1:61,6\n46#1:67,2\n46#1:69\n46#1:70,3\n*E\n"})
    public static final class C12478a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f80904a;

        /* JADX INFO: renamed from: b */
        public Object f80905b;

        /* JADX INFO: renamed from: c */
        public int f80906c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ au1<bth> f80907d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12478a(au1<bth> au1Var, zy2<? super C12478a> zy2Var) {
            super(2, zy2Var);
            this.f80907d = au1Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C12478a(this.f80907d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C12478a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r5.f80906c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r5.f80905b
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r3 = r5.f80904a
                hsd r3 = (p000.hsd) r3
                p000.y7e.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r6 = move-exception
                goto L5b
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                p000.y7e.throwOnFailure(r6)
                au1<bth> r3 = r5.f80907d
                mu1 r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r6
            L2b:
                r5.f80904a = r3     // Catch: java.lang.Throwable -> L17
                r5.f80905b = r1     // Catch: java.lang.Throwable -> L17
                r5.f80906c = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = r1.hasNext(r5)     // Catch: java.lang.Throwable -> L17
                if (r6 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r6 == 0) goto L54
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
                bth r6 = (p000.bth) r6     // Catch: java.lang.Throwable -> L17
                java.util.concurrent.atomic.AtomicBoolean r6 = p000.s77.access$getSent$p()     // Catch: java.lang.Throwable -> L17
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L17
                ssf$a r6 = p000.ssf.f82790e     // Catch: java.lang.Throwable -> L17
                r6.sendApplyNotifications()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L54:
                bth r6 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L17
                r0 = 0
                p000.av1.cancelConsumed(r3, r0)
                return r6
            L5b:
                throw r6     // Catch: java.lang.Throwable -> L5c
            L5c:
                r0 = move-exception
                p000.av1.cancelConsumed(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.s77.C12478a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: s77$b */
    public static final class C12479b extends tt8 implements qy6<Object, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ au1<bth> f80908a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12479b(au1<bth> au1Var) {
            super(1);
            this.f80908a = au1Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Object obj) {
            invoke2(obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Object obj) {
            if (s77.f80902c.compareAndSet(false, true)) {
                this.f80908a.mo28705trySendJP2dKIU(bth.f14751a);
            }
        }
    }

    private s77() {
    }

    public final void ensureStarted() {
        if (f80901b.compareAndSet(false, true)) {
            au1 au1VarChannel$default = nu1.Channel$default(1, null, null, 6, null);
            fg1.launch$default(y13.CoroutineScope(C15816yv.f103016N.getMain()), null, null, new C12478a(au1VarChannel$default, null), 3, null);
            ssf.f82790e.registerGlobalWriteObserver(new C12479b(au1VarChannel$default));
        }
    }
}

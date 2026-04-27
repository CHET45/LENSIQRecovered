package p000;

import p000.ssf;
import p000.z64;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 7 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,400:1\n372#2,2:401\n374#2,2:414\n75#2,4:416\n377#2,2:446\n75#2,4:448\n372#2,2:452\n374#2,5:465\n460#3,11:403\n460#3,11:454\n401#4,4:420\n373#4,6:424\n383#4,3:431\n386#4,2:435\n406#4,2:437\n389#4,6:439\n408#4:445\n1810#5:430\n1672#5:434\n1843#6:470\n1843#6:472\n2420#6:474\n2420#6:475\n2420#6:476\n89#7:471\n89#7:473\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n179#1:401,2\n179#1:414,2\n181#1:416,4\n179#1:446,2\n195#1:448,4\n197#1:452,2\n197#1:465,5\n179#1:403,11\n197#1:454,11\n183#1:420,4\n183#1:424,6\n183#1:431,3\n183#1:435,2\n183#1:437,2\n183#1:439,6\n183#1:445\n183#1:430\n183#1:434\n220#1:470\n243#1:472\n282#1:474\n293#1:475\n301#1:476\n220#1:471\n243#1:473\n*E\n"})
public final class y64<T> extends y2g implements z64<T> {

    /* JADX INFO: renamed from: c */
    @yfb
    public final ny6<T> f100460c;

    /* JADX INFO: renamed from: d */
    @gib
    public final qtf<T> f100461d;

    /* JADX INFO: renamed from: e */
    @yfb
    public C15499a<T> f100462e = new C15499a<>();

    /* JADX INFO: renamed from: y64$a */
    @dwf({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,400:1\n1843#2:401\n1843#2:403\n1843#2:405\n89#3:402\n89#3:404\n89#3:406\n372#4,2:407\n374#4,2:420\n377#4,2:448\n460#5,11:409\n401#6,4:422\n373#6,6:426\n383#6,3:433\n386#6,2:437\n406#6,2:439\n389#6,6:441\n408#6:447\n1810#7:432\n1672#7:436\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n110#1:401\n117#1:403\n128#1:405\n110#1:402\n117#1:404\n128#1:406\n130#1:407,2\n130#1:420,2\n130#1:448,2\n130#1:409,11\n131#1:422,4\n131#1:426,6\n131#1:433,3\n131#1:437,2\n131#1:439,2\n131#1:441,6\n131#1:447\n131#1:432\n131#1:436\n*E\n"})
    @e0g(parameters = 0)
    public static final class C15499a<T> extends z2g implements z64.InterfaceC16015a<T> {

        /* JADX INFO: renamed from: i */
        @yfb
        public static final a f100463i = new a(null);

        /* JADX INFO: renamed from: j */
        public static final int f100464j = 8;

        /* JADX INFO: renamed from: k */
        @yfb
        public static final Object f100465k = new Object();

        /* JADX INFO: renamed from: d */
        public int f100466d;

        /* JADX INFO: renamed from: e */
        public int f100467e;

        /* JADX INFO: renamed from: f */
        @yfb
        public zjb<x2g> f100468f = akb.emptyObjectIntMap();

        /* JADX INFO: renamed from: g */
        @gib
        public Object f100469g = f100465k;

        /* JADX INFO: renamed from: h */
        public int f100470h;

        /* JADX INFO: renamed from: y64$a$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @yfb
            public final Object getUnset() {
                return C15499a.f100465k;
            }

            private a() {
            }
        }

        @Override // p000.z2g
        public void assign(@yfb z2g z2gVar) {
            md8.checkNotNull(z2gVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            C15499a c15499a = (C15499a) z2gVar;
            setDependencies(c15499a.getDependencies());
            this.f100469g = c15499a.f100469g;
            this.f100470h = c15499a.f100470h;
        }

        @Override // p000.z2g
        @yfb
        public z2g create() {
            return new C15499a();
        }

        @Override // p000.z64.InterfaceC16015a
        public T getCurrentValue() {
            return (T) this.f100469g;
        }

        @Override // p000.z64.InterfaceC16015a
        @yfb
        public zjb<x2g> getDependencies() {
            return this.f100468f;
        }

        @gib
        public final Object getResult() {
            return this.f100469g;
        }

        public final int getResultHash() {
            return this.f100470h;
        }

        public final int getValidSnapshotId() {
            return this.f100466d;
        }

        public final int getValidSnapshotWriteCount() {
            return this.f100467e;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean isValid(@p000.yfb p000.z64<?> r6, @p000.yfb p000.ssf r7) {
            /*
                r5 = this;
                java.lang.Object r0 = p000.gtf.getLock()
                monitor-enter(r0)
                int r1 = r5.f100466d     // Catch: java.lang.Throwable -> L1a
                int r2 = r7.getId()     // Catch: java.lang.Throwable -> L1a
                r3 = 1
                r4 = 0
                if (r1 != r2) goto L1c
                int r1 = r5.f100467e     // Catch: java.lang.Throwable -> L1a
                int r2 = r7.getWriteCount$runtime_release()     // Catch: java.lang.Throwable -> L1a
                if (r1 == r2) goto L18
                goto L1c
            L18:
                r1 = r4
                goto L1d
            L1a:
                r6 = move-exception
                goto L4d
            L1c:
                r1 = r3
            L1d:
                monitor-exit(r0)
                java.lang.Object r0 = r5.f100469g
                java.lang.Object r2 = p000.y64.C15499a.f100465k
                if (r0 == r2) goto L2f
                if (r1 == 0) goto L30
                int r0 = r5.f100470h
                int r6 = r5.readableHash(r6, r7)
                if (r0 != r6) goto L2f
                goto L30
            L2f:
                r3 = r4
            L30:
                if (r3 == 0) goto L4c
                if (r1 == 0) goto L4c
                java.lang.Object r6 = p000.gtf.getLock()
                monitor-enter(r6)
                int r0 = r7.getId()     // Catch: java.lang.Throwable -> L49
                r5.f100466d = r0     // Catch: java.lang.Throwable -> L49
                int r7 = r7.getWriteCount$runtime_release()     // Catch: java.lang.Throwable -> L49
                r5.f100467e = r7     // Catch: java.lang.Throwable -> L49
                bth r7 = p000.bth.f14751a     // Catch: java.lang.Throwable -> L49
                monitor-exit(r6)
                goto L4c
            L49:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            L4c:
                return r3
            L4d:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.y64.C15499a.isValid(z64, ssf):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00a5 A[Catch: all -> 0x007c, LOOP:1: B:16:0x003c->B:40:0x00a5, LOOP_END, TryCatch #1 {all -> 0x007c, blocks: (B:13:0x002f, B:16:0x003c, B:18:0x004c, B:20:0x0058, B:22:0x0062, B:34:0x0098, B:25:0x0071, B:27:0x0075, B:31:0x0086, B:30:0x007e, B:42:0x00aa, B:40:0x00a5), top: B:64:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00a1 A[EDGE_INSN: B:68:0x00a1->B:38:0x00a1 BREAK  A[LOOP:1: B:16:0x003c->B:40:0x00a5], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int readableHash(@p000.yfb p000.z64<?> r22, @p000.yfb p000.ssf r23) {
            /*
                Method dump skipped, instruction units count: 223
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.y64.C15499a.readableHash(z64, ssf):int");
        }

        public void setDependencies(@yfb zjb<x2g> zjbVar) {
            this.f100468f = zjbVar;
        }

        public final void setResult(@gib Object obj) {
            this.f100469g = obj;
        }

        public final void setResultHash(int i) {
            this.f100470h = i;
        }

        public final void setValidSnapshotId(int i) {
            this.f100466d = i;
        }

        public final void setValidSnapshotWriteCount(int i) {
            this.f100467e = i;
        }
    }

    /* JADX INFO: renamed from: y64$b */
    public static final class C15500b extends tt8 implements qy6<Object, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y64<T> f100471a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ n78 f100472b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e6b<x2g> f100473c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f100474d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15500b(y64<T> y64Var, n78 n78Var, e6b<x2g> e6bVar, int i) {
            super(1);
            this.f100471a = y64Var;
            this.f100472b = n78Var;
            this.f100473c = e6bVar;
            this.f100474d = i;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Object obj) {
            invoke2(obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Object obj) {
            if (obj == this.f100471a) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof x2g) {
                int element = this.f100472b.getElement();
                e6b<x2g> e6bVar = this.f100473c;
                e6bVar.set(obj, Math.min(element - this.f100474d, e6bVar.getOrDefault(obj, Integer.MAX_VALUE)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y64(@yfb ny6<? extends T> ny6Var, @gib qtf<T> qtfVar) {
        this.f100460c = ny6Var;
        this.f100461d = qtfVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p000.y64.C15499a<T> currentRecord(p000.y64.C15499a<T> r22, p000.ssf r23, boolean r24, p000.ny6<? extends T> r25) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y64.currentRecord(y64$a, ssf, boolean, ny6):y64$a");
    }

    private final String displayValue() {
        C15499a c15499a = (C15499a) gtf.current(this.f100462e);
        return c15499a.isValid(this, ssf.f82790e.getCurrent()) ? String.valueOf(c15499a.getResult()) : "<Not calculated>";
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @yfb
    public final z2g current(@yfb ssf ssfVar) {
        return currentRecord((C15499a) gtf.current(this.f100462e, ssfVar), ssfVar, false, this.f100460c);
    }

    @Override // p000.z64
    @yfb
    public z64.InterfaceC16015a<T> getCurrentRecord() {
        ssf current = ssf.f82790e.getCurrent();
        return currentRecord((C15499a) gtf.current(this.f100462e, current), current, false, this.f100460c);
    }

    @gib
    @xn8(name = "getDebuggerDisplayValue")
    public final T getDebuggerDisplayValue() {
        C15499a c15499a = (C15499a) gtf.current(this.f100462e);
        if (c15499a.isValid(this, ssf.f82790e.getCurrent())) {
            return (T) c15499a.getResult();
        }
        return null;
    }

    @Override // p000.x2g
    @yfb
    public z2g getFirstStateRecord() {
        return this.f100462e;
    }

    @Override // p000.z64
    @gib
    public qtf<T> getPolicy() {
        return this.f100461d;
    }

    @Override // p000.i2g
    public T getValue() {
        ssf.C12771a c12771a = ssf.f82790e;
        qy6<Object, bth> readObserver = c12771a.getCurrent().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        ssf current = c12771a.getCurrent();
        return (T) currentRecord((C15499a) gtf.current(this.f100462e, current), current, true, this.f100460c).getResult();
    }

    @Override // p000.x2g
    public void prependStateRecord(@yfb z2g z2gVar) {
        md8.checkNotNull(z2gVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f100462e = (C15499a) z2gVar;
    }

    @yfb
    public String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }
}

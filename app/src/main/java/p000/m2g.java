package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,433:1\n14#2:434\n14#2:442\n27#3:435\n27#3:439\n16#4:436\n16#4:440\n13346#5,2:437\n326#6:441\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n320#1:434\n401#1:442\n329#1:435\n357#1:439\n329#1:436\n357#1:440\n353#1:437,2\n390#1:441\n*E\n"})
public final class m2g<T> extends AbstractC8190k4<o2g> implements a7b<T>, kq1<T>, a17<T> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f59780f = AtomicReferenceFieldUpdater.newUpdater(m2g.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e */
    public int f59781e;

    /* JADX INFO: renamed from: m2g$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.StateFlowImpl", m4010f = "StateFlow.kt", m4011i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m4012l = {389, 401, 406}, m4013m = "collect", m4014n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C9115a extends cz2 {

        /* JADX INFO: renamed from: C */
        public int f59782C;

        /* JADX INFO: renamed from: a */
        public Object f59783a;

        /* JADX INFO: renamed from: b */
        public Object f59784b;

        /* JADX INFO: renamed from: c */
        public Object f59785c;

        /* JADX INFO: renamed from: d */
        public Object f59786d;

        /* JADX INFO: renamed from: e */
        public Object f59787e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f59788f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ m2g<T> f59789m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9115a(m2g<T> m2gVar, zy2<? super C9115a> zy2Var) {
            super(zy2Var);
            this.f59789m = m2gVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f59788f = obj;
            this.f59782C |= Integer.MIN_VALUE;
            return this.f59789m.collect(null, this);
        }
    }

    public m2g(@yfb Object obj) {
        this._state$volatile = obj;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean updateState(Object obj, Object obj2) {
        int i;
        o2g[] o2gVarArrM14490e;
        synchronized (this) {
            Object obj3 = f59780f.get(this);
            if (obj != null && !md8.areEqual(obj3, obj)) {
                return false;
            }
            if (md8.areEqual(obj3, obj2)) {
                return true;
            }
            f59780f.set(this, obj2);
            int i2 = this.f59781e;
            if ((i2 & 1) != 0) {
                this.f59781e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f59781e = i3;
            o2g[] o2gVarArrM14490e2 = m14490e();
            bth bthVar = bth.f14751a;
            while (true) {
                o2g[] o2gVarArr = o2gVarArrM14490e2;
                if (o2gVarArr != null) {
                    for (o2g o2gVar : o2gVarArr) {
                        if (o2gVar != null) {
                            o2gVar.makePending();
                        }
                    }
                }
                synchronized (this) {
                    i = this.f59781e;
                    if (i == i3) {
                        this.f59781e = i3 + 1;
                        return true;
                    }
                    o2gVarArrM14490e = m14490e();
                    bth bthVar2 = bth.f14751a;
                }
                o2gVarArrM14490e2 = o2gVarArrM14490e;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:40:0x00ba, B:42:0x00c0], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:42:0x00c0, B:40:0x00ba], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b5, B:40:0x00ba, B:50:0x00db, B:52:0x00e1, B:42:0x00c0, B:46:0x00c7, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b5, B:40:0x00ba, B:50:0x00db, B:52:0x00e1, B:42:0x00c0, B:46:0x00c7, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b5, B:40:0x00ba, B:50:0x00db, B:52:0x00e1, B:42:0x00c0, B:46:0x00c7, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [m4] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, o2g] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, t66] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00df -> B:36:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f1 -> B:36:0x00ab). Please report as a decompilation issue!!! */
    @Override // p000.q9f, p000.y56
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(@p000.yfb p000.t66<? super T> r11, @p000.yfb p000.zy2<?> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m2g.collect(t66, zy2):java.lang.Object");
    }

    @Override // p000.a7b
    public boolean compareAndSet(T t, T t2) {
        if (t == null) {
            t = (T) zhb.f105096a;
        }
        if (t2 == null) {
            t2 = (T) zhb.f105096a;
        }
        return updateState(t, t2);
    }

    @Override // p000.v6b, p000.t66
    @gib
    public Object emit(T t, @yfb zy2<? super bth> zy2Var) {
        setValue(t);
        return bth.f14751a;
    }

    @Override // p000.AbstractC8190k4
    @yfb
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public o2g createSlot() {
        return new o2g();
    }

    @Override // p000.a17
    @yfb
    public y56<T> fuse(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return n2g.fuseStateFlow(this, e13Var, i, gf1Var);
    }

    @Override // p000.AbstractC8190k4
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o2g[] createSlotArray(int i) {
        return new o2g[i];
    }

    @Override // p000.q9f
    @yfb
    public List<T> getReplayCache() {
        return k82.listOf(getValue());
    }

    @Override // p000.a7b, p000.l2g
    public T getValue() {
        qhg qhgVar = zhb.f105096a;
        T t = (T) f59780f.get(this);
        if (t == qhgVar) {
            return null;
        }
        return t;
    }

    @Override // p000.v6b
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p000.a7b
    public void setValue(T t) {
        if (t == null) {
            t = (T) zhb.f105096a;
        }
        updateState(null, t);
    }

    @Override // p000.v6b
    public boolean tryEmit(T t) {
        setValue(t);
        return true;
    }
}

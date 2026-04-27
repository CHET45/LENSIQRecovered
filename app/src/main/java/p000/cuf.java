package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,654:1\n185#1,2:659\n187#1,2:672\n191#1,2:707\n193#1,2:724\n191#1,2:726\n193#1,2:743\n185#1,2:745\n187#1,2:758\n1208#2:655\n1187#2,2:656\n1#3:658\n460#4,11:661\n460#4,11:674\n838#4,15:685\n838#4,15:709\n838#4,15:728\n460#4,11:747\n366#4,12:760\n728#4,2:772\n33#5,7:700\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n69#1:659,2\n69#1:672,2\n292#1:707,2\n292#1:724,2\n303#1:726,2\n303#1:743,2\n336#1:745,2\n336#1:758,2\n177#1:655\n177#1:656,2\n69#1:661,11\n186#1:674,11\n192#1:685,15\n292#1:709,15\n303#1:728,15\n336#1:747,11\n349#1:760,12\n352#1:772,2\n242#1:700,7\n*E\n"})
@e0g(parameters = 0)
public final class cuf {

    /* JADX INFO: renamed from: k */
    public static final int f27663k = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<ny6<bth>, bth> f27664a;

    /* JADX INFO: renamed from: c */
    public boolean f27666c;

    /* JADX INFO: renamed from: g */
    @gib
    public rxb f27670g;

    /* JADX INFO: renamed from: h */
    public boolean f27671h;

    /* JADX INFO: renamed from: i */
    @gib
    public C4513a f27672i;

    /* JADX INFO: renamed from: b */
    @yfb
    public final AtomicReference<Object> f27665b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public final gz6<Set<? extends Object>, ssf, bth> f27667d = new C4514b();

    /* JADX INFO: renamed from: e */
    @yfb
    public final qy6<Object, bth> f27668e = new C4515c();

    /* JADX INFO: renamed from: f */
    @yfb
    public final f7b<C4513a> f27669f = new f7b<>(new C4513a[16], 0);

    /* JADX INFO: renamed from: j */
    public long f27673j = -1;

    /* JADX INFO: renamed from: cuf$b */
    public static final class C4514b extends tt8 implements gz6<Set<? extends Object>, ssf, bth> {
        public C4514b() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(Set<? extends Object> set, ssf ssfVar) {
            invoke2(set, ssfVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Set<? extends Object> set, @yfb ssf ssfVar) {
            cuf.this.addChanges(set);
            if (cuf.this.drainChanges()) {
                cuf.this.sendNotifications();
            }
        }
    }

    /* JADX INFO: renamed from: cuf$c */
    public static final class C4515c extends tt8 implements qy6<Object, bth> {
        public C4515c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Object obj) {
            invoke2(obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Object obj) {
            if (cuf.this.f27671h) {
                return;
            }
            f7b f7bVar = cuf.this.f27669f;
            cuf cufVar = cuf.this;
            synchronized (f7bVar) {
                C4513a c4513a = cufVar.f27672i;
                md8.checkNotNull(c4513a);
                c4513a.recordRead(obj);
                bth bthVar = bth.f14751a;
            }
        }
    }

    /* JADX INFO: renamed from: cuf$d */
    @dwf({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,654:1\n460#2,11:655\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n*L\n88#1:655,11\n*E\n"})
    public static final class C4516d extends tt8 implements ny6<bth> {
        public C4516d() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            do {
                f7b f7bVar = cuf.this.f27669f;
                cuf cufVar = cuf.this;
                synchronized (f7bVar) {
                    try {
                        if (!cufVar.f27666c) {
                            cufVar.f27666c = true;
                            try {
                                f7b f7bVar2 = cufVar.f27669f;
                                int size = f7bVar2.getSize();
                                if (size > 0) {
                                    Object[] content = f7bVar2.getContent();
                                    int i = 0;
                                    do {
                                        ((C4513a) content[i]).notifyInvalidatedScopes();
                                        i++;
                                    } while (i < size);
                                }
                                cufVar.f27666c = false;
                            } finally {
                            }
                        }
                        bth bthVar = bth.f14751a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (cuf.this.drainChanges());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cuf(@yfb qy6<? super ny6<bth>, bth> qy6Var) {
        this.f27664a = qy6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        Object obj;
        List listPlus;
        do {
            obj = this.f27665b.get();
            if (obj == null) {
                listPlus = set;
            } else if (obj instanceof Set) {
                listPlus = l82.listOf((Object[]) new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new us8();
                }
                listPlus = v82.plus((Collection) obj, (Iterable) k82.listOf(set));
            }
        } while (!v7b.m23844a(this.f27665b, obj, listPlus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z;
        synchronized (this.f27669f) {
            z = this.f27666c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> setRemoveChanges = removeChanges();
            if (setRemoveChanges == null) {
                return z2;
            }
            synchronized (this.f27669f) {
                try {
                    f7b<C4513a> f7bVar = this.f27669f;
                    int size = f7bVar.getSize();
                    if (size > 0) {
                        C4513a[] content = f7bVar.getContent();
                        int i = 0;
                        do {
                            z2 = content[i].recordInvalidation(setRemoveChanges) || z2;
                            i++;
                        } while (i < size);
                    }
                    bth bthVar = bth.f14751a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final <T> C4513a ensureMap(qy6<? super T, bth> qy6Var) {
        C4513a c4513a;
        f7b<C4513a> f7bVar = this.f27669f;
        int size = f7bVar.getSize();
        if (size > 0) {
            C4513a[] content = f7bVar.getContent();
            int i = 0;
            do {
                c4513a = content[i];
                if (c4513a.getOnChanged() == qy6Var) {
                    break;
                }
                i++;
            } while (i < size);
            c4513a = null;
        } else {
            c4513a = null;
        }
        C4513a c4513a2 = c4513a;
        if (c4513a2 != null) {
            return c4513a2;
        }
        md8.checkNotNull(qy6Var, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        C4513a c4513a3 = new C4513a((qy6) qlh.beforeCheckcastToFunctionOfArity(qy6Var, 1));
        this.f27669f.add(c4513a3);
        return c4513a3;
    }

    private final void forEachScopeMap(qy6<? super C4513a, bth> qy6Var) {
        synchronized (this.f27669f) {
            try {
                f7b<C4513a> f7bVar = this.f27669f;
                int size = f7bVar.getSize();
                if (size > 0) {
                    C4513a[] content = f7bVar.getContent();
                    int i = 0;
                    do {
                        qy6Var.invoke(content[i]);
                        i++;
                    } while (i < size);
                }
                bth bthVar = bth.f14751a;
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.f27665b.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new us8();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!v7b.m23844a(this.f27665b, obj, objSubList));
        return set;
    }

    private final void removeScopeMapIf(qy6<? super C4513a, Boolean> qy6Var) {
        synchronized (this.f27669f) {
            try {
                f7b<C4513a> f7bVar = this.f27669f;
                int size = f7bVar.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    if (qy6Var.invoke(f7bVar.getContent()[i2]).booleanValue()) {
                        i++;
                    } else if (i > 0) {
                        f7bVar.getContent()[i2 - i] = f7bVar.getContent()[i2];
                    }
                }
                int i3 = size - i;
                u70.fill(f7bVar.getContent(), (Object) null, i3, size);
                f7bVar.setSize(i3);
                bth bthVar = bth.f14751a;
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
    }

    private final Void report() {
        gm2.composeRuntimeError("Unexpected notification");
        throw new us8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.f27664a.invoke(new C4516d());
    }

    public final void clear(@yfb Object obj) {
        synchronized (this.f27669f) {
            try {
                f7b<C4513a> f7bVar = this.f27669f;
                int size = f7bVar.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C4513a c4513a = f7bVar.getContent()[i2];
                    c4513a.clearScopeObservations(obj);
                    if (!c4513a.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        f7bVar.getContent()[i2 - i] = f7bVar.getContent()[i2];
                    }
                }
                int i3 = size - i;
                u70.fill(f7bVar.getContent(), (Object) null, i3, size);
                f7bVar.setSize(i3);
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearIf(@yfb qy6<Object, Boolean> qy6Var) {
        synchronized (this.f27669f) {
            try {
                f7b<C4513a> f7bVar = this.f27669f;
                int size = f7bVar.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C4513a c4513a = f7bVar.getContent()[i2];
                    c4513a.removeScopeIf(qy6Var);
                    if (!c4513a.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        f7bVar.getContent()[i2 - i] = f7bVar.getContent()[i2];
                    }
                }
                int i3 = size - i;
                u70.fill(f7bVar.getContent(), (Object) null, i3, size);
                f7bVar.setSize(i3);
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @dpg
    public final void notifyChanges(@yfb Set<? extends Object> set, @yfb ssf ssfVar) {
        this.f27667d.invoke(set, ssfVar);
    }

    public final <T> void observeReads(@yfb T t, @yfb qy6<? super T, bth> qy6Var, @yfb ny6<bth> ny6Var) {
        C4513a c4513aEnsureMap;
        synchronized (this.f27669f) {
            c4513aEnsureMap = ensureMap(qy6Var);
        }
        boolean z = this.f27671h;
        C4513a c4513a = this.f27672i;
        long j = this.f27673j;
        if (j != -1) {
            if (!(j == C5737fe.currentThreadId())) {
                a8d.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + C5737fe.currentThreadId() + ", name=" + C5737fe.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.f27671h = false;
            this.f27672i = c4513aEnsureMap;
            this.f27673j = Thread.currentThread().getId();
            c4513aEnsureMap.observe(t, this.f27668e, ny6Var);
        } finally {
            this.f27672i = c4513a;
            this.f27671h = z;
            this.f27673j = j;
        }
    }

    public final void start() {
        this.f27670g = ssf.f82790e.registerApplyObserver(this.f27667d);
    }

    public final void stop() {
        rxb rxbVar = this.f27670g;
        if (rxbVar != null) {
            rxbVar.dispose();
        }
    }

    @q64(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @i2e(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(@yfb ny6<bth> ny6Var) {
        boolean z = this.f27671h;
        this.f27671h = true;
        try {
            ny6Var.invoke();
        } finally {
            this.f27671h = z;
        }
    }

    /* JADX INFO: renamed from: cuf$a */
    @dwf({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 12 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,654:1\n1208#2:655\n1187#2,2:656\n415#3,3:658\n373#3,6:661\n383#3,3:668\n386#3,2:672\n419#3:674\n420#3:676\n389#3,6:677\n421#3:683\n373#3,6:695\n383#3,3:702\n386#3,2:706\n389#3,6:712\n401#3,4:719\n373#3,6:723\n383#3,3:730\n386#3,2:734\n406#3,2:736\n389#3,6:738\n408#3:744\n401#3,4:760\n373#3,6:764\n383#3,3:771\n386#3,2:775\n406#3,2:777\n389#3,6:779\n408#3:785\n1810#4:667\n1672#4:671\n1810#4:701\n1672#4:705\n1810#4:729\n1672#4:733\n1810#4:752\n1672#4:756\n1810#4:770\n1672#4:774\n1810#4:810\n1672#4:814\n1810#4:835\n1672#4:839\n1810#4:859\n1672#4:863\n1810#4:904\n1672#4:908\n1810#4:941\n1672#4:945\n1810#4:982\n1672#4:986\n1810#4:1006\n1672#4:1010\n1810#4:1051\n1672#4:1055\n1810#4:1088\n1672#4:1092\n1810#4:1137\n1672#4:1141\n1810#4:1168\n1672#4:1172\n51#5:675\n51#5:684\n51#5:818\n392#6,6:685\n398#6,2:692\n48#7:691\n460#7,11:1110\n843#8:694\n845#8,4:708\n849#8:718\n1047#9:745\n1049#9:759\n1050#9,3:786\n1053#9:795\n363#10,6:746\n373#10,3:753\n376#10,2:757\n379#10,6:789\n48#11,3:796\n53#11:969\n55#11:1109\n267#12,4:799\n237#12,7:803\n248#12,3:811\n251#12,2:815\n272#12:817\n267#12,4:824\n237#12,7:828\n248#12,3:836\n251#12,2:840\n272#12:842\n267#12,4:848\n237#12,7:852\n248#12,3:860\n251#12,2:864\n272#12,2:866\n254#12,6:868\n274#12:874\n273#12:879\n254#12,6:880\n274#12:886\n267#12,4:893\n237#12,7:897\n248#12,3:905\n251#12,2:909\n272#12,2:911\n254#12,6:913\n274#12:919\n267#12,4:930\n237#12,7:934\n248#12,3:942\n251#12,2:946\n272#12,2:948\n254#12,6:950\n274#12:956\n273#12:961\n254#12,6:962\n274#12:968\n267#12,4:971\n237#12,7:975\n248#12,3:983\n251#12,2:987\n272#12:989\n267#12,4:995\n237#12,7:999\n248#12,3:1007\n251#12,2:1011\n272#12,2:1013\n254#12,6:1015\n274#12:1021\n273#12:1026\n254#12,6:1027\n274#12:1033\n267#12,4:1040\n237#12,7:1044\n248#12,3:1052\n251#12,2:1056\n272#12,2:1058\n254#12,6:1060\n274#12:1066\n267#12,4:1077\n237#12,7:1081\n248#12,3:1089\n251#12,2:1093\n272#12,2:1095\n254#12,6:1097\n274#12:1103\n267#12,4:1126\n237#12,7:1130\n248#12,3:1138\n251#12,2:1142\n272#12,2:1144\n254#12,6:1146\n274#12:1152\n267#12,4:1157\n237#12,7:1161\n248#12,3:1169\n251#12,2:1173\n272#12,2:1175\n254#12,6:1177\n274#12:1183\n77#13,5:819\n77#13,5:843\n85#13,4:875\n85#13:887\n77#13,5:888\n85#13,4:920\n88#13:924\n77#13,5:925\n85#13,4:957\n77#13,5:990\n85#13,4:1022\n85#13:1034\n77#13,5:1035\n85#13,4:1067\n88#13:1071\n77#13,5:1072\n85#13,4:1104\n77#13,5:1121\n85#13,4:1153\n1855#14:970\n1856#14:1108\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n399#1:655\n399#1:656,2\n471#1:658,3\n471#1:661,6\n471#1:668,3\n471#1:672,2\n471#1:674\n471#1:676\n471#1:677,6\n471#1:683\n514#1:695,6\n514#1:702,3\n514#1:706,2\n514#1:712,6\n528#1:719,4\n528#1:723,6\n528#1:730,3\n528#1:734,2\n528#1:736,2\n528#1:738,6\n528#1:744\n540#1:760,4\n540#1:764,6\n540#1:771,3\n540#1:775,2\n540#1:777,2\n540#1:779,6\n540#1:785\n471#1:667\n471#1:671\n514#1:701\n514#1:705\n528#1:729\n528#1:733\n537#1:752\n537#1:756\n540#1:770\n540#1:774\n581#1:810\n581#1:814\n590#1:835\n590#1:839\n601#1:859\n601#1:863\n601#1:904\n601#1:908\n612#1:941\n612#1:945\n590#1:982\n590#1:986\n601#1:1006\n601#1:1010\n601#1:1051\n601#1:1055\n612#1:1088\n612#1:1092\n632#1:1137\n632#1:1141\n649#1:1168\n649#1:1172\n473#1:675\n481#1:684\n583#1:818\n501#1:685,6\n501#1:692,2\n501#1:691\n619#1:1110,11\n514#1:694\n514#1:708,4\n514#1:718\n537#1:745\n537#1:759\n537#1:786,3\n537#1:795\n537#1:746,6\n537#1:753,3\n537#1:757,2\n537#1:789,6\n581#1:796,3\n581#1:969\n581#1:1109\n581#1:799,4\n581#1:803,7\n581#1:811,3\n581#1:815,2\n581#1:817\n590#1:824,4\n590#1:828,7\n590#1:836,3\n590#1:840,2\n590#1:842\n601#1:848,4\n601#1:852,7\n601#1:860,3\n601#1:864,2\n601#1:866,2\n601#1:868,6\n601#1:874\n590#1:879\n590#1:880,6\n590#1:886\n601#1:893,4\n601#1:897,7\n601#1:905,3\n601#1:909,2\n601#1:911,2\n601#1:913,6\n601#1:919\n612#1:930,4\n612#1:934,7\n612#1:942,3\n612#1:946,2\n612#1:948,2\n612#1:950,6\n612#1:956\n581#1:961\n581#1:962,6\n581#1:968\n590#1:971,4\n590#1:975,7\n590#1:983,3\n590#1:987,2\n590#1:989\n601#1:995,4\n601#1:999,7\n601#1:1007,3\n601#1:1011,2\n601#1:1013,2\n601#1:1015,6\n601#1:1021\n590#1:1026\n590#1:1027,6\n590#1:1033\n601#1:1040,4\n601#1:1044,7\n601#1:1052,3\n601#1:1056,2\n601#1:1058,2\n601#1:1060,6\n601#1:1066\n612#1:1077,4\n612#1:1081,7\n612#1:1089,3\n612#1:1093,2\n612#1:1095,2\n612#1:1097,6\n612#1:1103\n632#1:1126,4\n632#1:1130,7\n632#1:1138,3\n632#1:1142,2\n632#1:1144,2\n632#1:1146,6\n632#1:1152\n649#1:1157,4\n649#1:1161,7\n649#1:1169,3\n649#1:1173,2\n649#1:1175,2\n649#1:1177,6\n649#1:1183\n590#1:819,5\n601#1:843,5\n601#1:875,4\n590#1:887\n601#1:888,5\n601#1:920,4\n590#1:924\n612#1:925,5\n612#1:957,4\n601#1:990,5\n601#1:1022,4\n590#1:1034\n601#1:1035,5\n601#1:1067,4\n590#1:1071\n612#1:1072,5\n612#1:1104,4\n632#1:1121,5\n632#1:1153,4\n581#1:970\n581#1:1108\n*E\n"})
    public static final class C4513a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final qy6<Object, bth> f27674a;

        /* JADX INFO: renamed from: b */
        @gib
        public Object f27675b;

        /* JADX INFO: renamed from: c */
        @gib
        public e6b<Object> f27676c;

        /* JADX INFO: renamed from: j */
        public int f27683j;

        /* JADX INFO: renamed from: d */
        public int f27677d = -1;

        /* JADX INFO: renamed from: e */
        @yfb
        public final wqe<Object, Object> f27678e = new wqe<>();

        /* JADX INFO: renamed from: f */
        @yfb
        public final s6b<Object, e6b<Object>> f27679f = new s6b<>(0, 1, null);

        /* JADX INFO: renamed from: g */
        @yfb
        public final u6b<Object> f27680g = new u6b<>(0, 1, null);

        /* JADX INFO: renamed from: h */
        @yfb
        public final f7b<z64<?>> f27681h = new f7b<>(new z64[16], 0);

        /* JADX INFO: renamed from: i */
        @yfb
        public final a74 f27682i = new a();

        /* JADX INFO: renamed from: k */
        @yfb
        public final wqe<Object, z64<?>> f27684k = new wqe<>();

        /* JADX INFO: renamed from: l */
        @yfb
        public final HashMap<z64<?>, Object> f27685l = new HashMap<>();

        /* JADX INFO: renamed from: cuf$a$a */
        public static final class a implements a74 {
            public a() {
            }

            @Override // p000.a74
            public void done(@yfb z64<?> z64Var) {
                C4513a c4513a = C4513a.this;
                c4513a.f27683j--;
            }

            @Override // p000.a74
            public void start(@yfb z64<?> z64Var) {
                C4513a.this.f27683j++;
            }
        }

        public C4513a(@yfb qy6<Object, bth> qy6Var) {
            this.f27674a = qy6Var;
        }

        private final void clearObsoleteStateReads(Object obj) {
            int i = this.f27677d;
            e6b<Object> e6bVar = this.f27676c;
            if (e6bVar == null) {
                return;
            }
            long[] jArr = e6bVar.f105298a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = e6bVar.f105299b[i5];
                            boolean z = e6bVar.f105300c[i5] != i;
                            if (z) {
                                removeObservation(obj, obj2);
                            }
                            if (z) {
                                e6bVar.removeValueAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        private final void removeObservation(Object obj, Object obj2) {
            this.f27678e.remove(obj2, obj);
            if (!(obj2 instanceof z64) || this.f27678e.contains(obj2)) {
                return;
            }
            this.f27684k.removeScope(obj2);
            this.f27685l.remove(obj2);
        }

        public final void clear() {
            this.f27678e.clear();
            this.f27679f.clear();
            this.f27684k.clear();
            this.f27685l.clear();
        }

        public final void clearScopeObservations(@yfb Object obj) {
            e6b<Object> e6bVarRemove = this.f27679f.remove(obj);
            if (e6bVarRemove == null) {
                return;
            }
            Object[] objArr = e6bVarRemove.f105299b;
            int[] iArr = e6bVarRemove.f105300c;
            long[] jArr = e6bVarRemove.f105298a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            removeObservation(obj, obj2);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        @yfb
        public final a74 getDerivedStateObserver() {
            return this.f27682i;
        }

        @yfb
        public final qy6<Object, bth> getOnChanged() {
            return this.f27674a;
        }

        public final boolean hasScopeObservations() {
            return this.f27679f.isNotEmpty();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void notifyInvalidatedScopes() {
            /*
                r17 = this;
                r0 = r17
                u6b<java.lang.Object> r1 = r0.f27680g
                qy6<java.lang.Object, bth> r2 = r0.f27674a
                java.lang.Object[] r3 = r1.f30278b
                long[] r4 = r1.f30277a
                int r5 = r4.length
                int r5 = r5 + (-2)
                if (r5 < 0) goto L49
                r6 = 0
                r7 = r6
            L11:
                r8 = r4[r7]
                long r10 = ~r8
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L44
                int r10 = r7 - r5
                int r10 = ~r10
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L2b:
                if (r12 >= r10) goto L42
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L3e
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]
                r2.invoke(r13)
            L3e:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L2b
            L42:
                if (r10 != r11) goto L49
            L44:
                if (r7 == r5) goto L49
                int r7 = r7 + 1
                goto L11
            L49:
                r1.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.cuf.C4513a.notifyInvalidatedScopes():void");
        }

        public final void observe(@yfb Object obj, @yfb qy6<Object, bth> qy6Var, @yfb ny6<bth> ny6Var) {
            Object obj2 = this.f27675b;
            e6b<Object> e6bVar = this.f27676c;
            int i = this.f27677d;
            this.f27675b = obj;
            this.f27676c = this.f27679f.get(obj);
            if (this.f27677d == -1) {
                this.f27677d = gtf.currentSnapshot().getId();
            }
            a74 a74Var = this.f27682i;
            f7b<a74> f7bVarDerivedStateObservers = stf.derivedStateObservers();
            try {
                f7bVarDerivedStateObservers.add(a74Var);
                ssf.f82790e.observe(qy6Var, null, ny6Var);
                f7bVarDerivedStateObservers.removeAt(f7bVarDerivedStateObservers.getSize() - 1);
                Object obj3 = this.f27675b;
                md8.checkNotNull(obj3);
                clearObsoleteStateReads(obj3);
                this.f27675b = obj2;
                this.f27676c = e6bVar;
                this.f27677d = i;
            } catch (Throwable th) {
                f7bVarDerivedStateObservers.removeAt(f7bVarDerivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:120:0x0316 A[PHI: r20
  0x0316: PHI (r20v40 boolean) = (r20v39 boolean), (r20v41 boolean) binds: [B:110:0x02e6, B:119:0x0314] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0323  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x03d1  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x04c6  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x05dd A[PHI: r20
  0x05dd: PHI (r20v11 boolean) = (r20v10 boolean), (r20v12 boolean) binds: [B:211:0x05ad, B:220:0x05db] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0295 A[PHI: r20
  0x0295: PHI (r20v46 boolean) = (r20v45 boolean), (r20v47 boolean) binds: [B:87:0x0265, B:96:0x0293] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean recordInvalidation(@p000.yfb java.util.Set<? extends java.lang.Object> r43) {
            /*
                Method dump skipped, instruction units count: 1703
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.cuf.C4513a.recordInvalidation(java.util.Set):boolean");
        }

        public final void recordRead(@yfb Object obj) {
            Object obj2 = this.f27675b;
            md8.checkNotNull(obj2);
            int i = this.f27677d;
            e6b<Object> e6bVar = this.f27676c;
            if (e6bVar == null) {
                e6bVar = new e6b<>(0, 1, null);
                this.f27676c = e6bVar;
                this.f27679f.set(obj2, e6bVar);
                bth bthVar = bth.f14751a;
            }
            recordRead(obj, i, obj2, e6bVar);
        }

        public final void removeScopeIf(@yfb qy6<Object, Boolean> qy6Var) {
            long[] jArr;
            int i;
            long[] jArr2;
            int i2;
            long j;
            int i3;
            long j2;
            int i4;
            s6b<Object, e6b<Object>> s6bVar = this.f27679f;
            long[] jArr3 = s6bVar.f14264a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j3 = jArr3[i5];
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & 255) < 128) {
                            int i9 = (i5 << 3) + i8;
                            Object obj = s6bVar.f14265b[i9];
                            e6b e6bVar = (e6b) s6bVar.f14266c[i9];
                            Boolean boolInvoke = qy6Var.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = e6bVar.f105299b;
                                int[] iArr = e6bVar.f105300c;
                                long[] jArr4 = e6bVar.f105298a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i3 = i7;
                                    int i10 = 0;
                                    while (true) {
                                        long j5 = jArr4[i10];
                                        i2 = i5;
                                        j = j3;
                                        j2 = -9187201950435737472L;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                if ((j5 & 255) < 128) {
                                                    int i13 = (i10 << 3) + i12;
                                                    Object obj2 = objArr[i13];
                                                    int i14 = iArr[i13];
                                                    removeObservation(obj, obj2);
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i11 != 8) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        i5 = i2;
                                        j3 = j;
                                    }
                                } else {
                                    i2 = i5;
                                    j = j3;
                                    i3 = i7;
                                    j2 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                j = j3;
                                i3 = i7;
                                j2 = j4;
                            }
                            if (boolInvoke.booleanValue()) {
                                s6bVar.removeValueAt(i9);
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr3;
                            i2 = i5;
                            j = j3;
                            i3 = i7;
                            j2 = j4;
                            i4 = i6;
                        }
                        j3 = j >> i4;
                        i8++;
                        i6 = i4;
                        j4 = j2;
                        jArr3 = jArr2;
                        i7 = i3;
                        i5 = i2;
                    }
                    jArr = jArr3;
                    int i15 = i5;
                    if (i7 != i6) {
                        return;
                    } else {
                        i = i15;
                    }
                } else {
                    jArr = jArr3;
                    i = i5;
                }
                if (i == length) {
                    return;
                }
                i5 = i + 1;
                jArr3 = jArr;
            }
        }

        public final void rereadDerivedState(@yfb z64<?> z64Var) {
            long[] jArr;
            long[] jArr2;
            int i;
            e6b<Object> e6bVar;
            s6b<Object, e6b<Object>> s6bVar = this.f27679f;
            int id = gtf.currentSnapshot().getId();
            Object obj = this.f27678e.getMap().get(z64Var);
            if (obj == null) {
                return;
            }
            if (!(obj instanceof u6b)) {
                e6b<Object> e6bVar2 = s6bVar.get(obj);
                if (e6bVar2 == null) {
                    e6bVar2 = new e6b<>(0, 1, null);
                    s6bVar.set(obj, e6bVar2);
                    bth bthVar = bth.f14751a;
                }
                recordRead(z64Var, id, obj, e6bVar2);
                return;
            }
            u6b u6bVar = (u6b) obj;
            Object[] objArr = u6bVar.f30278b;
            long[] jArr3 = u6bVar.f30277a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            Object obj2 = objArr[(i2 << 3) + i5];
                            e6b<Object> e6bVar3 = s6bVar.get(obj2);
                            jArr2 = jArr3;
                            if (e6bVar3 == null) {
                                e6bVar = new e6b<>(0, 1, null);
                                s6bVar.set(obj2, e6bVar);
                                bth bthVar2 = bth.f14751a;
                            } else {
                                e6bVar = e6bVar3;
                            }
                            recordRead(z64Var, id, obj2, e6bVar);
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void recordRead(java.lang.Object r21, int r22, java.lang.Object r23, p000.e6b<java.lang.Object> r24) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                int r3 = r0.f27683j
                if (r3 <= 0) goto Lb
                return
            Lb:
                r3 = -1
                r4 = r24
                int r4 = r4.put(r1, r2, r3)
                boolean r5 = r1 instanceof p000.z64
                r6 = 2
                if (r5 == 0) goto L93
                if (r4 == r2) goto L93
                r2 = r1
                z64 r2 = (p000.z64) r2
                z64$a r2 = r2.getCurrentRecord()
                java.util.HashMap<z64<?>, java.lang.Object> r5 = r0.f27685l
                java.lang.Object r7 = r2.getCurrentValue()
                r5.put(r1, r7)
                zjb r2 = r2.getDependencies()
                wqe<java.lang.Object, z64<?>> r5 = r0.f27684k
                r5.removeScope(r1)
                java.lang.Object[] r7 = r2.f105299b
                long[] r2 = r2.f105298a
                int r8 = r2.length
                int r8 = r8 - r6
                if (r8 < 0) goto L91
                r10 = 0
            L3b:
                r11 = r2[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L8b
                int r13 = r10 - r8
                int r13 = ~r13
                int r13 = r13 >>> 31
                r14 = 8
                int r13 = 8 - r13
                r15 = 0
            L55:
                if (r15 >= r13) goto L88
                r16 = 255(0xff, double:1.26E-321)
                long r16 = r11 & r16
                r18 = 128(0x80, double:6.3E-322)
                int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r16 >= 0) goto L81
                int r16 = r10 << 3
                int r16 = r16 + r15
                r16 = r7[r16]
                r9 = r16
                x2g r9 = (p000.x2g) r9
                boolean r3 = r9 instanceof p000.y2g
                if (r3 == 0) goto L7b
                r3 = r9
                y2g r3 = (p000.y2g) r3
                nrd$a r17 = p000.nrd.f65391b
                int r14 = p000.nrd.m31201constructorimpl(r6)
                r3.m33360recordReadInh_f27i8$runtime_release(r14)
            L7b:
                r5.add(r9, r1)
                r3 = 8
                goto L82
            L81:
                r3 = r14
            L82:
                long r11 = r11 >> r3
                int r15 = r15 + 1
                r14 = r3
                r3 = -1
                goto L55
            L88:
                r3 = r14
                if (r13 != r3) goto L91
            L8b:
                if (r10 == r8) goto L91
                int r10 = r10 + 1
                r3 = -1
                goto L3b
            L91:
                r2 = -1
                goto L94
            L93:
                r2 = r3
            L94:
                if (r4 != r2) goto Lad
                boolean r2 = r1 instanceof p000.y2g
                if (r2 == 0) goto La6
                r2 = r1
                y2g r2 = (p000.y2g) r2
                nrd$a r3 = p000.nrd.f65391b
                int r3 = p000.nrd.m31201constructorimpl(r6)
                r2.m33360recordReadInh_f27i8$runtime_release(r3)
            La6:
                wqe<java.lang.Object, java.lang.Object> r2 = r0.f27678e
                r3 = r23
                r2.add(r1, r3)
            Lad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.cuf.C4513a.recordRead(java.lang.Object, int, java.lang.Object, e6b):void");
        }
    }

    public final void clear() {
        synchronized (this.f27669f) {
            try {
                f7b<C4513a> f7bVar = this.f27669f;
                int size = f7bVar.getSize();
                if (size > 0) {
                    C4513a[] content = f7bVar.getContent();
                    int i = 0;
                    do {
                        content[i].clear();
                        i++;
                    } while (i < size);
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

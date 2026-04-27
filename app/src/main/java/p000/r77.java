package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n1843#2:2432\n1843#2:2434\n89#3:2433\n89#3:2435\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1444#1:2432\n1490#1:2434\n1444#1:2433\n1490#1:2435\n*E\n"})
@e0g(parameters = 1)
public final class r77 extends w6b {

    /* JADX INFO: renamed from: t */
    public static final int f77319t = 0;

    /* JADX INFO: renamed from: r77$a */
    @dwf({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,2431:1\n33#2,6:2432\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n*L\n1447#1:2432,6\n*E\n"})
    public static final class C11929a extends tt8 implements qy6<Object, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<qy6<Object, bth>> f77320a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11929a(List<? extends qy6<Object, bth>> list) {
            super(1);
            this.f77320a = list;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Object obj) {
            invoke2(obj);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb Object obj) {
            List<qy6<Object, bth>> list = this.f77320a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(obj);
            }
        }
    }

    /* JADX INFO: renamed from: r77$b */
    @dwf({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n1843#2:2432\n89#3:2433\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1\n*L\n1467#1:2432\n1467#1:2433\n*E\n"})
    public static final class C11930b extends tt8 implements qy6<ctf, w6b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Object, bth> f77321a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<Object, bth> f77322b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11930b(qy6<Object, bth> qy6Var, qy6<Object, bth> qy6Var2) {
            super(1);
            this.f77321a = qy6Var;
            this.f77322b = qy6Var2;
        }

        @Override // p000.qy6
        @yfb
        public final w6b invoke(@yfb ctf ctfVar) {
            int i;
            synchronized (gtf.getLock()) {
                i = gtf.f41100f;
                gtf.f41100f = i + 1;
            }
            return new w6b(i, ctfVar, this.f77321a, this.f77322b);
        }
    }

    /* JADX INFO: renamed from: r77$c */
    @dwf({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n1843#2:2432\n89#3:2433\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n*L\n1456#1:2432\n1456#1:2433\n*E\n"})
    public static final class C11931c extends tt8 implements qy6<ctf, prd> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Object, bth> f77323a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11931c(qy6<Object, bth> qy6Var) {
            super(1);
            this.f77323a = qy6Var;
        }

        @Override // p000.qy6
        @yfb
        public final prd invoke(@yfb ctf ctfVar) {
            int i;
            synchronized (gtf.getLock()) {
                i = gtf.f41100f;
                gtf.f41100f = i + 1;
            }
            return new prd(i, ctfVar, this.f77323a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r77(int i, @yfb ctf ctfVar) {
        qy6 c11929a;
        synchronized (gtf.getLock()) {
            List list = gtf.f41104j;
            c11929a = (qy6) v82.singleOrNull(list);
            c11929a = c11929a == null ? new C11929a(list) : c11929a;
        }
        super(i, ctfVar, null, c11929a);
    }

    @Override // p000.w6b
    @yfb
    public usf apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // p000.w6b, p000.ssf
    public void dispose() {
        synchronized (gtf.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            bth bthVar = bth.f14751a;
        }
    }

    @Override // p000.w6b, p000.ssf
    public void notifyObjectsInitialized$runtime_release() {
        gtf.advanceGlobalSnapshot();
    }

    @Override // p000.w6b
    @yfb
    public w6b takeNestedMutableSnapshot(@gib qy6<Object, bth> qy6Var, @gib qy6<Object, bth> qy6Var2) {
        return (w6b) gtf.takeNewSnapshot(new C11930b(qy6Var, qy6Var2));
    }

    @Override // p000.w6b, p000.ssf
    @yfb
    public ssf takeNestedSnapshot(@gib qy6<Object, bth> qy6Var) {
        return gtf.takeNewSnapshot(new C11931c(qy6Var));
    }

    @Override // p000.w6b, p000.ssf
    @yfb
    /* JADX INFO: renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo29704nestedActivated$runtime_release(@yfb ssf ssfVar) {
        buf.unsupported();
        throw new us8();
    }

    @Override // p000.w6b, p000.ssf
    @yfb
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo29705nestedDeactivated$runtime_release(@yfb ssf ssfVar) {
        buf.unsupported();
        throw new us8();
    }
}

package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,230:1\n81#2:231\n107#2,2:232\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n115#1:231\n115#1:232,2\n*E\n"})
@e0g(parameters = 0)
public final class fxe implements dxe {

    /* JADX INFO: renamed from: o */
    @yfb
    public static final C6033c f37988o = new C6033c(null);

    /* JADX INFO: renamed from: p */
    public static final int f37989p = 8;

    /* JADX INFO: renamed from: q */
    @yfb
    public static final dme<fxe, Long> f37990q = eme.Saver(C6031a.f38003a, C6032b.f38004a);

    /* JADX INFO: renamed from: c */
    public boolean f37991c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final List<cwe> f37992d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final u5b<cwe> f37993e;

    /* JADX INFO: renamed from: f */
    @yfb
    public AtomicLong f37994f;

    /* JADX INFO: renamed from: g */
    @gib
    public qy6<? super Long, bth> f37995g;

    /* JADX INFO: renamed from: h */
    @gib
    public oz6<? super Boolean, ? super mv8, ? super izb, ? super mwe, bth> f37996h;

    /* JADX INFO: renamed from: i */
    @gib
    public gz6<? super Boolean, ? super Long, bth> f37997i;

    /* JADX INFO: renamed from: j */
    @gib
    public uz6<? super Boolean, ? super mv8, ? super izb, ? super izb, ? super Boolean, ? super mwe, Boolean> f37998j;

    /* JADX INFO: renamed from: k */
    @gib
    public ny6<bth> f37999k;

    /* JADX INFO: renamed from: l */
    @gib
    public qy6<? super Long, bth> f38000l;

    /* JADX INFO: renamed from: m */
    @gib
    public qy6<? super Long, bth> f38001m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final z6b f38002n;

    /* JADX INFO: renamed from: fxe$a */
    public static final class C6031a extends tt8 implements gz6<fme, fxe, Long> {

        /* JADX INFO: renamed from: a */
        public static final C6031a f38003a = new C6031a();

        public C6031a() {
            super(2);
        }

        @Override // p000.gz6
        @gib
        public final Long invoke(@yfb fme fmeVar, @yfb fxe fxeVar) {
            return Long.valueOf(fxeVar.f37994f.get());
        }
    }

    /* JADX INFO: renamed from: fxe$b */
    public static final class C6032b extends tt8 implements qy6<Long, fxe> {

        /* JADX INFO: renamed from: a */
        public static final C6032b f38004a = new C6032b();

        public C6032b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ fxe invoke(Long l) {
            return invoke(l.longValue());
        }

        @gib
        public final fxe invoke(long j) {
            return new fxe(j, null);
        }
    }

    /* JADX INFO: renamed from: fxe$c */
    public static final class C6033c {
        public /* synthetic */ C6033c(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dme<fxe, Long> getSaver() {
            return fxe.f37990q;
        }

        private C6033c() {
        }
    }

    /* JADX INFO: renamed from: fxe$d */
    public static final class C6034d extends tt8 implements gz6<cwe, cwe, Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ mv8 f38005a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6034d(mv8 mv8Var) {
            super(2);
            this.f38005a = mv8Var;
        }

        @Override // p000.gz6
        @yfb
        public final Integer invoke(@yfb cwe cweVar, @yfb cwe cweVar2) {
            mv8 layoutCoordinates = cweVar.getLayoutCoordinates();
            mv8 layoutCoordinates2 = cweVar2.getLayoutCoordinates();
            long jMo30034localPositionOfR5De75A = layoutCoordinates != null ? this.f38005a.mo30034localPositionOfR5De75A(layoutCoordinates, izb.f49009b.m30445getZeroF1C5BW0()) : izb.f49009b.m30445getZeroF1C5BW0();
            long jMo30034localPositionOfR5De75A2 = layoutCoordinates2 != null ? this.f38005a.mo30034localPositionOfR5De75A(layoutCoordinates2, izb.f49009b.m30445getZeroF1C5BW0()) : izb.f49009b.m30445getZeroF1C5BW0();
            return Integer.valueOf(izb.m30430getYimpl(jMo30034localPositionOfR5De75A) == izb.m30430getYimpl(jMo30034localPositionOfR5De75A2) ? md2.compareValues(Float.valueOf(izb.m30429getXimpl(jMo30034localPositionOfR5De75A)), Float.valueOf(izb.m30429getXimpl(jMo30034localPositionOfR5De75A2))) : md2.compareValues(Float.valueOf(izb.m30430getYimpl(jMo30034localPositionOfR5De75A)), Float.valueOf(izb.m30430getYimpl(jMo30034localPositionOfR5De75A2))));
        }
    }

    public /* synthetic */ fxe(long j, jt3 jt3Var) {
        this(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(gz6 gz6Var, Object obj, Object obj2) {
        return ((Number) gz6Var.invoke(obj, obj2)).intValue();
    }

    @gib
    public final qy6<Long, bth> getAfterSelectableUnsubscribe$foundation_release() {
        return this.f38001m;
    }

    @gib
    public final qy6<Long, bth> getOnPositionChangeCallback$foundation_release() {
        return this.f37995g;
    }

    @gib
    public final qy6<Long, bth> getOnSelectableChangeCallback$foundation_release() {
        return this.f38000l;
    }

    @gib
    public final uz6<Boolean, mv8, izb, izb, Boolean, mwe, Boolean> getOnSelectionUpdateCallback$foundation_release() {
        return this.f37998j;
    }

    @gib
    public final ny6<bth> getOnSelectionUpdateEndCallback$foundation_release() {
        return this.f37999k;
    }

    @gib
    public final gz6<Boolean, Long, bth> getOnSelectionUpdateSelectAll$foundation_release() {
        return this.f37997i;
    }

    @gib
    public final oz6<Boolean, mv8, izb, mwe, bth> getOnSelectionUpdateStartCallback$foundation_release() {
        return this.f37996h;
    }

    @yfb
    public final ol9<cwe> getSelectableMap$foundation_release() {
        return this.f37993e;
    }

    @yfb
    public final List<cwe> getSelectables$foundation_release() {
        return this.f37992d;
    }

    public final boolean getSorted$foundation_release() {
        return this.f37991c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.dxe
    @yfb
    public ol9<gwe> getSubselections() {
        return (ol9) this.f38002n.getValue();
    }

    @Override // p000.dxe
    public long nextSelectableId() {
        long andIncrement = this.f37994f.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.f37994f.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // p000.dxe
    public void notifyPositionChange(long j) {
        this.f37991c = false;
        qy6<? super Long, bth> qy6Var = this.f37995g;
        if (qy6Var != null) {
            qy6Var.invoke(Long.valueOf(j));
        }
    }

    @Override // p000.dxe
    public void notifySelectableChange(long j) {
        qy6<? super Long, bth> qy6Var = this.f38000l;
        if (qy6Var != null) {
            qy6Var.invoke(Long.valueOf(j));
        }
    }

    @Override // p000.dxe
    /* JADX INFO: renamed from: notifySelectionUpdate-njBpvok */
    public boolean mo28712notifySelectionUpdatenjBpvok(@yfb mv8 mv8Var, long j, long j2, boolean z, @yfb mwe mweVar, boolean z2) {
        uz6<? super Boolean, ? super mv8, ? super izb, ? super izb, ? super Boolean, ? super mwe, Boolean> uz6Var = this.f37998j;
        if (uz6Var != null) {
            return uz6Var.invoke(Boolean.valueOf(z2), mv8Var, izb.m30418boximpl(j), izb.m30418boximpl(j2), Boolean.valueOf(z), mweVar).booleanValue();
        }
        return true;
    }

    @Override // p000.dxe
    public void notifySelectionUpdateEnd() {
        ny6<bth> ny6Var = this.f37999k;
        if (ny6Var != null) {
            ny6Var.invoke();
        }
    }

    @Override // p000.dxe
    public void notifySelectionUpdateSelectAll(long j, boolean z) {
        gz6<? super Boolean, ? super Long, bth> gz6Var = this.f37997i;
        if (gz6Var != null) {
            gz6Var.invoke(Boolean.valueOf(z), Long.valueOf(j));
        }
    }

    @Override // p000.dxe
    /* JADX INFO: renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public void mo28713notifySelectionUpdateStartubNVwUQ(@yfb mv8 mv8Var, long j, @yfb mwe mweVar, boolean z) {
        oz6<? super Boolean, ? super mv8, ? super izb, ? super mwe, bth> oz6Var = this.f37996h;
        if (oz6Var != null) {
            oz6Var.invoke(Boolean.valueOf(z), mv8Var, izb.m30418boximpl(j), mweVar);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(@gib qy6<? super Long, bth> qy6Var) {
        this.f38001m = qy6Var;
    }

    public final void setOnPositionChangeCallback$foundation_release(@gib qy6<? super Long, bth> qy6Var) {
        this.f37995g = qy6Var;
    }

    public final void setOnSelectableChangeCallback$foundation_release(@gib qy6<? super Long, bth> qy6Var) {
        this.f38000l = qy6Var;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(@gib uz6<? super Boolean, ? super mv8, ? super izb, ? super izb, ? super Boolean, ? super mwe, Boolean> uz6Var) {
        this.f37998j = uz6Var;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(@gib ny6<bth> ny6Var) {
        this.f37999k = ny6Var;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(@gib gz6<? super Boolean, ? super Long, bth> gz6Var) {
        this.f37997i = gz6Var;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(@gib oz6<? super Boolean, ? super mv8, ? super izb, ? super mwe, bth> oz6Var) {
        this.f37996h = oz6Var;
    }

    public final void setSorted$foundation_release(boolean z) {
        this.f37991c = z;
    }

    public void setSubselections(@yfb ol9<gwe> ol9Var) {
        this.f38002n.setValue(ol9Var);
    }

    @yfb
    public final List<cwe> sort(@yfb mv8 mv8Var) {
        if (!this.f37991c) {
            List<cwe> list = this.f37992d;
            final C6034d c6034d = new C6034d(mv8Var);
            p82.sortWith(list, new Comparator() { // from class: exe
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return fxe.sort$lambda$2(c6034d, obj, obj2);
                }
            });
            this.f37991c = true;
        }
        return getSelectables$foundation_release();
    }

    @Override // p000.dxe
    @yfb
    public cwe subscribe(@yfb cwe cweVar) {
        if (cweVar.getSelectableId() == 0) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + cweVar.getSelectableId()).toString());
        }
        if (!this.f37993e.containsKey(cweVar.getSelectableId())) {
            this.f37993e.set(cweVar.getSelectableId(), cweVar);
            this.f37992d.add(cweVar);
            this.f37991c = false;
            return cweVar;
        }
        throw new IllegalArgumentException(("Another selectable with the id: " + cweVar + ".selectableId has already subscribed.").toString());
    }

    @Override // p000.dxe
    public void unsubscribe(@yfb cwe cweVar) {
        if (this.f37993e.containsKey(cweVar.getSelectableId())) {
            this.f37992d.remove(cweVar);
            this.f37993e.remove(cweVar.getSelectableId());
            qy6<? super Long, bth> qy6Var = this.f38001m;
            if (qy6Var != null) {
                qy6Var.invoke(Long.valueOf(cweVar.getSelectableId()));
            }
        }
    }

    private fxe(long j) {
        this.f37992d = new ArrayList();
        this.f37993e = pl9.mutableLongObjectMapOf();
        this.f37994f = new AtomicLong(j);
        this.f38002n = xtf.mutableStateOf$default(pl9.emptyLongObjectMap(), null, 2, null);
    }

    public fxe() {
        this(1L);
    }
}

package p000;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;
import org.opencv.videoio.Videoio;
import p000.i09;
import p000.ssf;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,673:1\n81#2:674\n81#2:675\n107#2,2:676\n81#2:678\n107#2,2:679\n26#3:681\n1#4:682\n602#5,8:683\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n292#1:674\n398#1:675\n398#1:676,2\n400#1:678\n400#1:679,2\n430#1:681\n572#1:683,8\n*E\n"})
public final class m19 implements ase {

    /* JADX INFO: renamed from: z */
    public static final int f59575z = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final f19 f59576a;

    /* JADX INFO: renamed from: b */
    public boolean f59577b;

    /* JADX INFO: renamed from: c */
    @gib
    public a19 f59578c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final i19 f59579d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final n09 f59580e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final z6b<a19> f59581f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final l5b f59582g;

    /* JADX INFO: renamed from: h */
    public float f59583h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final ase f59584i;

    /* JADX INFO: renamed from: j */
    public int f59585j;

    /* JADX INFO: renamed from: k */
    public boolean f59586k;

    /* JADX INFO: renamed from: l */
    @gib
    public byd f59587l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final cyd f59588m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final dn0 f59589n;

    /* JADX INFO: renamed from: o */
    @yfb
    public final LazyLayoutItemAnimator<b19> f59590o;

    /* JADX INFO: renamed from: p */
    @yfb
    public final lz8 f59591p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final i09 f59592q;

    /* JADX INFO: renamed from: r */
    @yfb
    public final e19 f59593r;

    /* JADX INFO: renamed from: s */
    @yfb
    public final h09 f59594s;

    /* JADX INFO: renamed from: t */
    @yfb
    public final z6b<bth> f59595t;

    /* JADX INFO: renamed from: u */
    @yfb
    public final z6b f59596u;

    /* JADX INFO: renamed from: v */
    @yfb
    public final z6b f59597v;

    /* JADX INFO: renamed from: w */
    @yfb
    public final z6b<bth> f59598w;

    /* JADX INFO: renamed from: x */
    @yfb
    public C12364ry<Float, C14294vy> f59599x;

    /* JADX INFO: renamed from: y */
    @yfb
    public static final C9085c f59574y = new C9085c(null);

    /* JADX INFO: renamed from: A */
    @yfb
    public static final dme<m19, ?> f59573A = q99.listSaver(C9083a.f59600a, C9084b.f59601a);

    /* JADX INFO: renamed from: m19$a */
    public static final class C9083a extends tt8 implements gz6<fme, m19, List<? extends Integer>> {

        /* JADX INFO: renamed from: a */
        public static final C9083a f59600a = new C9083a();

        public C9083a() {
            super(2);
        }

        @Override // p000.gz6
        @yfb
        public final List<Integer> invoke(@yfb fme fmeVar, @yfb m19 m19Var) {
            return l82.listOf((Object[]) new Integer[]{Integer.valueOf(m19Var.getFirstVisibleItemIndex()), Integer.valueOf(m19Var.getFirstVisibleItemScrollOffset())});
        }
    }

    /* JADX INFO: renamed from: m19$b */
    public static final class C9084b extends tt8 implements qy6<List<? extends Integer>, m19> {

        /* JADX INFO: renamed from: a */
        public static final C9084b f59601a = new C9084b();

        public C9084b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ m19 invoke(List<? extends Integer> list) {
            return invoke2((List<Integer>) list);
        }

        @gib
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final m19 invoke2(@yfb List<Integer> list) {
            return new m19(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    /* JADX INFO: renamed from: m19$c */
    public static final class C9085c {

        /* JADX INFO: renamed from: m19$c$a */
        public static final class a extends tt8 implements gz6<fme, m19, List<? extends Integer>> {

            /* JADX INFO: renamed from: a */
            public static final a f59602a = new a();

            public a() {
                super(2);
            }

            @Override // p000.gz6
            @yfb
            public final List<Integer> invoke(@yfb fme fmeVar, @yfb m19 m19Var) {
                return l82.listOf((Object[]) new Integer[]{Integer.valueOf(m19Var.getFirstVisibleItemIndex()), Integer.valueOf(m19Var.getFirstVisibleItemScrollOffset())});
            }
        }

        /* JADX INFO: renamed from: m19$c$b */
        public static final class b extends tt8 implements qy6<List<? extends Integer>, m19> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ f19 f59603a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f19 f19Var) {
                super(1);
                this.f59603a = f19Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ m19 invoke(List<? extends Integer> list) {
                return invoke2((List<Integer>) list);
            }

            @gib
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final m19 invoke2(@yfb List<Integer> list) {
                return new m19(list.get(0).intValue(), list.get(1).intValue(), this.f59603a);
            }
        }

        public /* synthetic */ C9085c(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dme<m19, ?> getSaver() {
            return m19.f59573A;
        }

        @ah5
        @yfb
        public final dme<m19, ?> saver$foundation_release(@yfb f19 f19Var) {
            return q99.listSaver(a.f59602a, new b(f19Var));
        }

        private C9085c() {
        }
    }

    /* JADX INFO: renamed from: m19$d */
    @dwf({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState$prefetchScope$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,673:1\n602#2,8:674\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState$prefetchScope$1\n*L\n282#1:674,8\n*E\n"})
    public static final class C9086d implements e19 {
        public C9086d() {
        }

        @Override // p000.e19
        @yfb
        public i09.InterfaceC7095b schedulePrefetch(int i) {
            ssf.C12771a c12771a = ssf.f82790e;
            m19 m19Var = m19.this;
            ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
            qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                long jM27178getChildConstraintsmsEJaDk = ((a19) m19Var.f59581f.getValue()).m27178getChildConstraintsmsEJaDk();
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                return m19.this.getPrefetchState$foundation_release().m30145schedulePrefetch0kLqBqw(i, jM27178getChildConstraintsmsEJaDk);
            } catch (Throwable th) {
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m19$e */
    @dwf({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState$prefetchState$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,673:1\n602#2,8:674\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState$prefetchState$1\n*L\n272#1:674,8\n*E\n"})
    public static final class C9087e extends tt8 implements qy6<fab, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f59606b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9087e(int i) {
            super(1);
            this.f59606b = i;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(fab fabVar) {
            invoke2(fabVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb fab fabVar) {
            f19 f19Var = m19.this.f59576a;
            int i = this.f59606b;
            ssf.C12771a c12771a = ssf.f82790e;
            ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
            c12771a.restoreNonObservable(currentThreadSnapshot, c12771a.makeCurrentNonObservable(currentThreadSnapshot), currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null);
            f19Var.onNestedPrefetch(fabVar, i);
        }
    }

    /* JADX INFO: renamed from: m19$f */
    public static final class C9088f implements cyd {
        public C9088f() {
        }

        @Override // p000.cyd
        public void onRemeasurementAvailable(@yfb byd bydVar) {
            m19.this.f59587l = bydVar;
        }
    }

    /* JADX INFO: renamed from: m19$g */
    @ck3(m4009c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1", m4010f = "LazyListState.kt", m4011i = {}, m4012l = {338}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C9089g extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f59608a;

        /* JADX INFO: renamed from: m19$g$a */
        @ck3(m4009c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1", m4010f = "LazyListState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<vre, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f59610a;

            public a(zy2<? super a> zy2Var) {
                super(2, zy2Var);
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb vre vreVar, @gib zy2<? super bth> zy2Var) {
                return ((a) create(vreVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f59610a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                return bth.f14751a;
            }
        }

        public C9089g(zy2<? super C9089g> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return m19.this.new C9089g(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C9089g) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f59608a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                m19 m19Var = m19.this;
                a aVar = new a(null);
                this.f59608a = 1;
                if (ase.scroll$default(m19Var, null, aVar, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
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

    /* JADX INFO: renamed from: m19$h */
    @ck3(m4009c = "androidx.compose.foundation.lazy.LazyListState", m4010f = "LazyListState.kt", m4011i = {0, 0, 0}, m4012l = {388, 389}, m4013m = "scroll", m4014n = {"this", "scrollPriority", "block"}, m4015s = {"L$0", "L$1", "L$2"})
    public static final class C9090h extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f59611a;

        /* JADX INFO: renamed from: b */
        public Object f59612b;

        /* JADX INFO: renamed from: c */
        public Object f59613c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f59614d;

        /* JADX INFO: renamed from: f */
        public int f59616f;

        public C9090h(zy2<? super C9090h> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f59614d = obj;
            this.f59616f |= Integer.MIN_VALUE;
            return m19.this.scroll(null, null, this);
        }
    }

    /* JADX INFO: renamed from: m19$i */
    @ck3(m4009c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", m4010f = "LazyListState.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C9091i extends ugg implements gz6<vre, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f59617a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f59619c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f59620d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9091i(int i, int i2, zy2<? super C9091i> zy2Var) {
            super(2, zy2Var);
            this.f59619c = i;
            this.f59620d = i2;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return m19.this.new C9091i(this.f59619c, this.f59620d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb vre vreVar, @gib zy2<? super bth> zy2Var) {
            return ((C9091i) create(vreVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f59617a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            m19.this.snapToItemIndexInternal$foundation_release(this.f59619c, this.f59620d, true);
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: m19$j */
    public static final class C9092j extends tt8 implements qy6<Float, Float> {
        public C9092j() {
            super(1);
        }

        @yfb
        public final Float invoke(float f) {
            return Float.valueOf(-m19.this.onScroll$foundation_release(-f));
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: m19$k */
    @ck3(m4009c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$1", m4010f = "LazyListState.kt", m4011i = {}, m4012l = {578}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C9093k extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f59622a;

        public C9093k(zy2<? super C9093k> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return m19.this.new C9093k(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C9093k) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f59622a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                C12364ry c12364ry = m19.this.f59599x;
                Float fBoxFloat = wc1.boxFloat(0.0f);
                mzf mzfVarSpring$default = C11760qy.spring$default(0.0f, 400.0f, wc1.boxFloat(0.5f), 1, null);
                this.f59622a = 1;
                if (rgg.animateTo$default(c12364ry, fBoxFloat, mzfVarSpring$default, true, null, this, 8, null) == coroutine_suspended) {
                    return coroutine_suspended;
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

    /* JADX INFO: renamed from: m19$l */
    @ck3(m4009c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$2", m4010f = "LazyListState.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_TEST_PATTERN_GENERATOR_SELECTOR}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C9094l extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f59624a;

        public C9094l(zy2<? super C9094l> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return m19.this.new C9094l(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C9094l) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f59624a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                C12364ry c12364ry = m19.this.f59599x;
                Float fBoxFloat = wc1.boxFloat(0.0f);
                mzf mzfVarSpring$default = C11760qy.spring$default(0.0f, 400.0f, wc1.boxFloat(0.5f), 1, null);
                this.f59624a = 1;
                if (rgg.animateTo$default(c12364ry, fBoxFloat, mzfVarSpring$default, true, null, this, 8, null) == coroutine_suspended) {
                    return coroutine_suspended;
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

    @ah5
    public m19() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(m19 m19Var, int i, int i2, zy2 zy2Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m19Var.animateScrollToItem(i, i2, zy2Var);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(m19 m19Var, a19 a19Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        m19Var.applyMeasureResult$foundation_release(a19Var, z, z2);
    }

    private final void notifyPrefetchOnScroll(float f, y09 y09Var) {
        if (this.f59586k) {
            this.f59576a.onScroll(this.f59593r, f, y09Var);
        }
    }

    public static /* synthetic */ void requestScrollToItem$default(m19 m19Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        m19Var.requestScrollToItem(i, i2);
    }

    public static /* synthetic */ Object scrollToItem$default(m19 m19Var, int i, int i2, zy2 zy2Var, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m19Var.scrollToItem(i, i2, zy2Var);
    }

    private void setCanScrollBackward(boolean z) {
        this.f59597v.setValue(Boolean.valueOf(z));
    }

    private void setCanScrollForward(boolean z) {
        this.f59596u.setValue(Boolean.valueOf(z));
    }

    private final void updateScrollDeltaForPostLookahead(float f, c64 c64Var, x13 x13Var) {
        if (f <= c64Var.mo27173toPx0680j_4(n19.f62956a)) {
            return;
        }
        ssf.C12771a c12771a = ssf.f82790e;
        ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
        qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            float fFloatValue = this.f59599x.getValue().floatValue();
            if (this.f59599x.isRunning()) {
                this.f59599x = C12827sy.copy$default((C12364ry) this.f59599x, fFloatValue - f, 0.0f, 0L, 0L, false, 30, (Object) null);
                fg1.launch$default(x13Var, null, null, new C9093k(null), 3, null);
            } else {
                this.f59599x = new C12364ry<>(g3i.getVectorConverter(d46.f28382a), Float.valueOf(-f), null, 0L, 0L, false, 60, null);
                fg1.launch$default(x13Var, null, null, new C9094l(null), 3, null);
            }
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
        } catch (Throwable th) {
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    @gib
    public final Object animateScrollToItem(@h78(from = 0) int i, int i2, @yfb zy2<? super bth> zy2Var) {
        Object objAnimateScrollToItem = ix8.animateScrollToItem(this.f59580e, i, i2, 100, getDensity$foundation_release(), zy2Var);
        return objAnimateScrollToItem == pd8.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : bth.f14751a;
    }

    public final void applyMeasureResult$foundation_release(@yfb a19 a19Var, boolean z, boolean z2) {
        if (!z && this.f59577b) {
            this.f59578c = a19Var;
            return;
        }
        if (z) {
            this.f59577b = true;
        }
        setCanScrollBackward(a19Var.getCanScrollBackward());
        setCanScrollForward(a19Var.getCanScrollForward());
        this.f59583h -= a19Var.getConsumedScroll();
        this.f59581f.setValue(a19Var);
        if (z2) {
            this.f59579d.updateScrollOffset(a19Var.getFirstVisibleItemScrollOffset());
        } else {
            this.f59579d.updateFromMeasureResult(a19Var);
            if (this.f59586k) {
                this.f59576a.onVisibleItemsUpdated(this.f59593r, a19Var);
            }
        }
        if (z) {
            updateScrollDeltaForPostLookahead(a19Var.getScrollBackAmount(), a19Var.getDensity(), a19Var.getCoroutineScope());
        }
        this.f59585j++;
    }

    @Override // p000.ase
    public float dispatchRawDelta(float f) {
        return this.f59584i.dispatchRawDelta(f);
    }

    @yfb
    public final dn0 getAwaitLayoutModifier$foundation_release() {
        return this.f59589n;
    }

    @yfb
    public final lz8 getBeyondBoundsInfo$foundation_release() {
        return this.f59591p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ase
    public boolean getCanScrollBackward() {
        return ((Boolean) this.f59597v.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ase
    public boolean getCanScrollForward() {
        return ((Boolean) this.f59596u.getValue()).booleanValue();
    }

    @yfb
    public final c64 getDensity$foundation_release() {
        return this.f59581f.getValue().getDensity();
    }

    public final int getFirstVisibleItemIndex() {
        return this.f59579d.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.f59579d.getScrollOffset();
    }

    public final boolean getHasLookaheadPassOccurred$foundation_release() {
        return this.f59577b;
    }

    @yfb
    public final q98 getInteractionSource() {
        return this.f59582g;
    }

    @yfb
    public final l5b getInternalInteractionSource$foundation_release() {
        return this.f59582g;
    }

    @yfb
    public final LazyLayoutItemAnimator<b19> getItemAnimator$foundation_release() {
        return this.f59590o;
    }

    @Override // p000.ase
    public boolean getLastScrolledBackward() {
        return this.f59584i.getLastScrolledBackward();
    }

    @Override // p000.ase
    public boolean getLastScrolledForward() {
        return this.f59584i.getLastScrolledForward();
    }

    @yfb
    public final y09 getLayoutInfo() {
        return this.f59581f.getValue();
    }

    @yfb
    /* JADX INFO: renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final z6b<bth> m30927getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.f59595t;
    }

    @yfb
    public final f78 getNearestRange$foundation_release() {
        return this.f59579d.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.f59585j;
    }

    @yfb
    public final h09 getPinnedItems$foundation_release() {
        return this.f59594s;
    }

    @yfb
    /* JADX INFO: renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final z6b<bth> m30928getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.f59598w;
    }

    @gib
    public final a19 getPostLookaheadLayoutInfo$foundation_release() {
        return this.f59578c;
    }

    @yfb
    public final i09 getPrefetchState$foundation_release() {
        return this.f59592q;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.f59586k;
    }

    @gib
    public final byd getRemeasurement$foundation_release() {
        return this.f59587l;
    }

    @yfb
    public final cyd getRemeasurementModifier$foundation_release() {
        return this.f59588m;
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return this.f59599x.getValue().floatValue();
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.f59583h;
    }

    @Override // p000.ase
    public boolean isScrollInProgress() {
        return this.f59584i.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f) {
        if ((f < 0.0f && !getCanScrollForward()) || (f > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.f59583h) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f59583h).toString());
        }
        float f2 = this.f59583h + f;
        this.f59583h = f2;
        if (Math.abs(f2) > 0.5f) {
            a19 value = this.f59581f.getValue();
            float f3 = this.f59583h;
            int iRound = Math.round(f3);
            a19 a19Var = this.f59578c;
            boolean zTryToApplyScrollWithoutRemeasure = value.tryToApplyScrollWithoutRemeasure(iRound, !this.f59577b);
            if (zTryToApplyScrollWithoutRemeasure && a19Var != null) {
                zTryToApplyScrollWithoutRemeasure = a19Var.tryToApplyScrollWithoutRemeasure(iRound, true);
            }
            if (zTryToApplyScrollWithoutRemeasure) {
                applyMeasureResult$foundation_release(value, this.f59577b, true);
                aub.m27890invalidateScopeimpl(this.f59598w);
                notifyPrefetchOnScroll(f3 - this.f59583h, value);
            } else {
                byd bydVar = this.f59587l;
                if (bydVar != null) {
                    bydVar.forceRemeasure();
                }
                notifyPrefetchOnScroll(f3 - this.f59583h, getLayoutInfo());
            }
        }
        if (Math.abs(this.f59583h) <= 0.5f) {
            return f;
        }
        float f4 = f - this.f59583h;
        this.f59583h = 0.0f;
        return f4;
    }

    public final void requestScrollToItem(@h78(from = 0) int i, int i2) {
        if (isScrollInProgress()) {
            fg1.launch$default(this.f59581f.getValue().getCoroutineScope(), null, null, new C9089g(null), 3, null);
        }
        snapToItemIndexInternal$foundation_release(i, i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.ase
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object scroll(@p000.yfb p000.j7b r6, @p000.yfb p000.gz6<? super p000.vre, ? super p000.zy2<? super p000.bth>, ? extends java.lang.Object> r7, @p000.yfb p000.zy2<? super p000.bth> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p000.m19.C9090h
            if (r0 == 0) goto L13
            r0 = r8
            m19$h r0 = (p000.m19.C9090h) r0
            int r1 = r0.f59616f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59616f = r1
            goto L18
        L13:
            m19$h r0 = new m19$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f59614d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f59616f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p000.y7e.throwOnFailure(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f59613c
            r7 = r6
            gz6 r7 = (p000.gz6) r7
            java.lang.Object r6 = r0.f59612b
            j7b r6 = (p000.j7b) r6
            java.lang.Object r2 = r0.f59611a
            m19 r2 = (p000.m19) r2
            p000.y7e.throwOnFailure(r8)
            goto L5a
        L45:
            p000.y7e.throwOnFailure(r8)
            dn0 r8 = r5.f59589n
            r0.f59611a = r5
            r0.f59612b = r6
            r0.f59613c = r7
            r0.f59616f = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            ase r8 = r2.f59584i
            r2 = 0
            r0.f59611a = r2
            r0.f59612b = r2
            r0.f59613c = r2
            r0.f59616f = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            bth r6 = p000.bth.f14751a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m19.scroll(j7b, gz6, zy2):java.lang.Object");
    }

    @gib
    public final Object scrollToItem(@h78(from = 0) int i, int i2, @yfb zy2<? super bth> zy2Var) {
        Object objScroll$default = ase.scroll$default(this, null, new C9091i(i, i2, null), zy2Var, 1, null);
        return objScroll$default == pd8.getCOROUTINE_SUSPENDED() ? objScroll$default : bth.f14751a;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.f59586k = z;
    }

    public final void snapToItemIndexInternal$foundation_release(int i, int i2, boolean z) {
        if (this.f59579d.getIndex() != i || this.f59579d.getScrollOffset() != i2) {
            this.f59590o.reset();
        }
        this.f59579d.requestPositionAndForgetLastKnownKey(i, i2);
        if (!z) {
            aub.m27890invalidateScopeimpl(this.f59595t);
            return;
        }
        byd bydVar = this.f59587l;
        if (bydVar != null) {
            bydVar.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@yfb u09 u09Var, int i) {
        return this.f59579d.updateScrollPositionIfTheFirstItemWasMoved(u09Var, i);
    }

    @ah5
    public m19(int i, int i2, @yfb f19 f19Var) {
        this.f59576a = f19Var;
        i19 i19Var = new i19(i, i2);
        this.f59579d = i19Var;
        this.f59580e = new n09(this);
        this.f59581f = stf.mutableStateOf(n19.f62957b, stf.neverEqualPolicy());
        this.f59582g = r98.MutableInteractionSource();
        this.f59584i = bse.ScrollableState(new C9092j());
        this.f59586k = true;
        this.f59588m = new C9088f();
        this.f59589n = new dn0();
        this.f59590o = new LazyLayoutItemAnimator<>();
        this.f59591p = new lz8();
        this.f59592q = new i09(f19Var.getPrefetchScheduler(), new C9087e(i));
        this.f59593r = new C9086d();
        this.f59594s = new h09();
        i19Var.getNearestRangeState();
        this.f59595t = aub.m27886constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.f59596u = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f59597v = xtf.mutableStateOf$default(bool, null, 2, null);
        this.f59598w = aub.m27886constructorimpl$default(null, 1, null);
        alh<Float, C14294vy> vectorConverter = g3i.getVectorConverter(d46.f28382a);
        Float fValueOf = Float.valueOf(0.0f);
        this.f59599x = C12827sy.AnimationState(vectorConverter, fValueOf, fValueOf, (56 & 8) != 0 ? Long.MIN_VALUE : 0L, (56 & 16) != 0 ? Long.MIN_VALUE : 0L, (56 & 32) != 0 ? false : false);
    }

    public /* synthetic */ m19(int i, int i2, f19 f19Var, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? g19.LazyListPrefetchStrategy$default(0, 1, null) : f19Var);
    }

    public /* synthetic */ m19(int i, int i2, int i3, jt3 jt3Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public m19(int i, int i2) {
        this(i, i2, g19.LazyListPrefetchStrategy$default(0, 1, null));
    }
}

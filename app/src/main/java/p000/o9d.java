package p000;

import android.os.Trace;
import androidx.compose.foundation.lazy.layout.C0661c;
import androidx.compose.p002ui.layout.C0772y;
import java.util.List;
import p000.i09;
import p000.jvd;
import p000.shh;

/* JADX INFO: loaded from: classes.dex */
@ah5
@e0g(parameters = 0)
public final class o9d {

    /* JADX INFO: renamed from: d */
    public static final int f66923d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final tz8 f66924a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final C0772y f66925b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final s9d f66926c;

    /* JADX INFO: renamed from: o9d$a */
    @dwf({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl\n+ 2 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n+ 3 Timing.kt\nkotlin/system/TimingKt\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n177#2:506\n178#2,10:518\n193#2:534\n194#2,9:546\n31#3,5:507\n36#3:517\n31#3,5:535\n36#3:545\n26#4,5:512\n26#4,5:528\n26#4,5:540\n1#5:533\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl\n*L\n303#1:506\n303#1:518,10\n347#1:534\n347#1:546,9\n303#1:507,5\n303#1:517\n347#1:535,5\n347#1:545\n304#1:512,5\n324#1:528,5\n348#1:540,5\n*E\n"})
    @ah5
    public final class C10272a implements i09.InterfaceC7095b, q9d {

        /* JADX INFO: renamed from: a */
        public final int f66927a;

        /* JADX INFO: renamed from: b */
        public final long f66928b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final p9d f66929c;

        /* JADX INFO: renamed from: d */
        @gib
        public C0772y.a f66930d;

        /* JADX INFO: renamed from: e */
        public boolean f66931e;

        /* JADX INFO: renamed from: f */
        public boolean f66932f;

        /* JADX INFO: renamed from: g */
        public boolean f66933g;

        /* JADX INFO: renamed from: h */
        @gib
        public a f66934h;

        /* JADX INFO: renamed from: i */
        public boolean f66935i;

        /* JADX INFO: renamed from: o9d$a$a */
        @dwf({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,505:1\n1#2:506\n26#3,5:507\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController\n*L\n430#1:507,5\n*E\n"})
        public final class a {

            /* JADX INFO: renamed from: a */
            @yfb
            public final List<i09> f66937a;

            /* JADX INFO: renamed from: b */
            @yfb
            public final List<q9d>[] f66938b;

            /* JADX INFO: renamed from: c */
            public int f66939c;

            /* JADX INFO: renamed from: d */
            public int f66940d;

            public a(@yfb List<i09> list) {
                this.f66937a = list;
                this.f66938b = new List[list.size()];
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean executeNestedPrefetches(@yfb r9d r9dVar) {
                if (this.f66939c >= this.f66937a.size()) {
                    return false;
                }
                if (C10272a.this.f66932f) {
                    throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.f66939c < this.f66937a.size()) {
                    try {
                        if (this.f66938b[this.f66939c] == null) {
                            if (r9dVar.availableTimeNanos() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List<q9d>[] listArr = this.f66938b;
                            int i = this.f66939c;
                            listArr[i] = this.f66937a.get(i).collectNestedPrefetchRequests$foundation_release();
                        }
                        List<q9d> list = this.f66938b[this.f66939c];
                        md8.checkNotNull(list);
                        while (this.f66940d < list.size()) {
                            if (list.get(this.f66940d).execute(r9dVar)) {
                                Trace.endSection();
                                return true;
                            }
                            this.f66940d++;
                        }
                        this.f66940d = 0;
                        this.f66939c++;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                bth bthVar = bth.f14751a;
                Trace.endSection();
                return false;
            }
        }

        /* JADX INFO: renamed from: o9d$a$b */
        @dwf({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
        public static final class b extends tt8 implements qy6<shh, shh.C12597a.a> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8121h<List<i09>> f66942a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jvd.C8121h<List<i09>> c8121h) {
                super(1);
                this.f66942a = c8121h;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p000.qy6
            @yfb
            public final shh.C12597a.a invoke(@yfb shh shhVar) {
                T tMutableListOf;
                md8.checkNotNull(shhVar, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                i09 prefetchState = ((uhh) shhVar).getPrefetchState();
                jvd.C8121h<List<i09>> c8121h = this.f66942a;
                List<i09> list = c8121h.f52110a;
                if (list != null) {
                    list.add(prefetchState);
                    tMutableListOf = list;
                } else {
                    tMutableListOf = l82.mutableListOf(prefetchState);
                }
                c8121h.f52110a = tMutableListOf;
                return shh.C12597a.a.SkipSubtreeAndContinueTraversal;
            }
        }

        public /* synthetic */ C10272a(o9d o9dVar, int i, long j, p9d p9dVar, jt3 jt3Var) {
            this(i, j, p9dVar);
        }

        private final boolean isComposed() {
            return this.f66930d != null;
        }

        private final boolean isValid() {
            if (!this.f66932f) {
                int itemCount = o9d.this.f66924a.getItemProvider().invoke().getItemCount();
                int i = this.f66927a;
                if (i >= 0 && i < itemCount) {
                    return true;
                }
            }
            return false;
        }

        private final void performComposition() {
            if (!isValid()) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
            }
            if (this.f66930d != null) {
                throw new IllegalArgumentException("Request was already composed!");
            }
            vz8 vz8VarInvoke = o9d.this.f66924a.getItemProvider().invoke();
            Object key = vz8VarInvoke.getKey(this.f66927a);
            this.f66930d = o9d.this.f66925b.precompose(key, o9d.this.f66924a.getContent(this.f66927a, key, vz8VarInvoke.getContentType(this.f66927a)));
        }

        /* JADX INFO: renamed from: performMeasure-BRTryo0, reason: not valid java name */
        private final void m31307performMeasureBRTryo0(long j) {
            if (this.f66932f) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.f66931e) {
                throw new IllegalArgumentException("Request was already measured!");
            }
            this.f66931e = true;
            C0772y.a aVar = this.f66930d;
            if (aVar == null) {
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
            }
            int placeablesCount = aVar.getPlaceablesCount();
            for (int i = 0; i < placeablesCount; i++) {
                aVar.mo27681premeasure0kLqBqw(i, j);
            }
        }

        private final a resolveNestedPrefetchStates() {
            C0772y.a aVar = this.f66930d;
            if (aVar == null) {
                throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
            }
            jvd.C8121h c8121h = new jvd.C8121h();
            aVar.traverseDescendants(C0661c.f4908a, new b(c8121h));
            List list = (List) c8121h.f52110a;
            if (list != null) {
                return new a(list);
            }
            return null;
        }

        private final boolean shouldExecute(r9d r9dVar, long j) {
            long jAvailableTimeNanos = r9dVar.availableTimeNanos();
            return (this.f66935i && jAvailableTimeNanos > 0) || j < jAvailableTimeNanos;
        }

        @Override // p000.i09.InterfaceC7095b
        public void cancel() {
            if (this.f66932f) {
                return;
            }
            this.f66932f = true;
            C0772y.a aVar = this.f66930d;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f66930d = null;
        }

        @Override // p000.q9d
        public boolean execute(@yfb r9d r9dVar) {
            if (!isValid()) {
                return false;
            }
            Object contentType = o9d.this.f66924a.getItemProvider().invoke().getContentType(this.f66927a);
            if (!isComposed()) {
                if (!shouldExecute(r9dVar, (contentType == null || !this.f66929c.getAverageCompositionTimeNanosByContentType().contains(contentType)) ? this.f66929c.getAverageCompositionTimeNanos() : this.f66929c.getAverageCompositionTimeNanosByContentType().get(contentType))) {
                    return true;
                }
                p9d p9dVar = this.f66929c;
                long jNanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    performComposition();
                    bth bthVar = bth.f14751a;
                    Trace.endSection();
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (contentType != null) {
                        p9dVar.getAverageCompositionTimeNanosByContentType().set(contentType, p9dVar.calculateAverageTime(jNanoTime2, p9dVar.getAverageCompositionTimeNanosByContentType().getOrDefault(contentType, 0L)));
                    }
                    p9dVar.f70111c = p9dVar.calculateAverageTime(jNanoTime2, p9dVar.getAverageCompositionTimeNanos());
                } finally {
                }
            }
            if (!this.f66935i) {
                if (!this.f66933g) {
                    if (r9dVar.availableTimeNanos() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.f66934h = resolveNestedPrefetchStates();
                        this.f66933g = true;
                        bth bthVar2 = bth.f14751a;
                    } finally {
                    }
                }
                a aVar = this.f66934h;
                if (aVar != null ? aVar.executeNestedPrefetches(r9dVar) : false) {
                    return true;
                }
            }
            if (!this.f66931e && !ku2.m30767isZeroimpl(this.f66928b)) {
                if (!shouldExecute(r9dVar, (contentType == null || !this.f66929c.getAverageMeasureTimeNanosByContentType().contains(contentType)) ? this.f66929c.getAverageMeasureTimeNanos() : this.f66929c.getAverageMeasureTimeNanosByContentType().get(contentType))) {
                    return true;
                }
                p9d p9dVar2 = this.f66929c;
                long jNanoTime3 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:measure");
                try {
                    m31307performMeasureBRTryo0(this.f66928b);
                    bth bthVar3 = bth.f14751a;
                    Trace.endSection();
                    long jNanoTime4 = System.nanoTime() - jNanoTime3;
                    if (contentType != null) {
                        p9dVar2.getAverageMeasureTimeNanosByContentType().set(contentType, p9dVar2.calculateAverageTime(jNanoTime4, p9dVar2.getAverageMeasureTimeNanosByContentType().getOrDefault(contentType, 0L)));
                    }
                    p9dVar2.f70112d = p9dVar2.calculateAverageTime(jNanoTime4, p9dVar2.getAverageMeasureTimeNanos());
                } finally {
                }
            }
            return false;
        }

        @Override // p000.i09.InterfaceC7095b
        public void markAsUrgent() {
            this.f66935i = true;
        }

        @yfb
        public String toString() {
            return "HandleAndRequestImpl { index = " + this.f66927a + ", constraints = " + ((Object) ku2.m30768toStringimpl(this.f66928b)) + ", isComposed = " + isComposed() + ", isMeasured = " + this.f66931e + ", isCanceled = " + this.f66932f + " }";
        }

        private C10272a(int i, long j, p9d p9dVar) {
            this.f66927a = i;
            this.f66928b = j;
            this.f66929c = p9dVar;
        }
    }

    public o9d(@yfb tz8 tz8Var, @yfb C0772y c0772y, @yfb s9d s9dVar) {
        this.f66924a = tz8Var;
        this.f66925b = c0772y;
        this.f66926c = s9dVar;
    }

    @yfb
    /* JADX INFO: renamed from: createNestedPrefetchRequest-VKLhPVY, reason: not valid java name */
    public final q9d m31305createNestedPrefetchRequestVKLhPVY(int i, long j, @yfb p9d p9dVar) {
        return new C10272a(this, i, j, p9dVar, null);
    }

    @yfb
    /* JADX INFO: renamed from: schedulePrefetch-VKLhPVY, reason: not valid java name */
    public final i09.InterfaceC7095b m31306schedulePrefetchVKLhPVY(int i, long j, @yfb p9d p9dVar) {
        C10272a c10272a = new C10272a(this, i, j, p9dVar, null);
        this.f66926c.schedulePrefetch(c10272a);
        return c10272a;
    }
}

package p000;

import android.view.Choreographer;
import android.view.View;

/* JADX INFO: renamed from: qu */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPrefetchScheduler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1208#2:220\n1187#2,2:221\n523#3:223\n1#4:224\n*S KotlinDebug\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler\n*L\n103#1:220\n103#1:221,2\n133#1:223\n*E\n"})
@ah5
@e0g(parameters = 0)
public final class RunnableC11695qu implements s9d, eyd, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: F */
    public static long f75745F;

    /* JADX INFO: renamed from: a */
    @yfb
    public final View f75747a;

    /* JADX INFO: renamed from: c */
    public boolean f75749c;

    /* JADX INFO: renamed from: e */
    public boolean f75751e;

    /* JADX INFO: renamed from: f */
    public long f75752f;

    /* JADX INFO: renamed from: m */
    @yfb
    public static final a f75746m = new a(null);

    /* JADX INFO: renamed from: C */
    public static final int f75744C = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public final f7b<q9d> f75748b = new f7b<>(new q9d[16], 0);

    /* JADX INFO: renamed from: d */
    public final Choreographer f75750d = Choreographer.getInstance();

    /* JADX INFO: renamed from: qu$a */
    public static final class a {
        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void calculateFrameIntervalIfNeeded(android.view.View r5) {
            /*
                r4 = this;
                long r0 = p000.RunnableC11695qu.access$getFrameIntervalNs$cp()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L2c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L21
                if (r0 == 0) goto L21
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r5 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                p000.RunnableC11695qu.access$setFrameIntervalNs$cp(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC11695qu.a.calculateFrameIntervalIfNeeded(android.view.View):void");
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: qu$b */
    @e0g(parameters = 1)
    public static final class b implements r9d {

        /* JADX INFO: renamed from: b */
        public static final int f75753b = 0;

        /* JADX INFO: renamed from: a */
        public final long f75754a;

        public b(long j) {
            this.f75754a = j;
        }

        @Override // p000.r9d
        public long availableTimeNanos() {
            return Math.max(0L, this.f75754a - System.nanoTime());
        }
    }

    public RunnableC11695qu(@yfb View view) {
        this.f75747a = view;
        f75746m.calculateFrameIntervalIfNeeded(view);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f75751e) {
            this.f75752f = j;
            this.f75747a.post(this);
        }
    }

    @Override // p000.eyd
    public void onAbandoned() {
    }

    @Override // p000.eyd
    public void onForgotten() {
        this.f75751e = false;
        this.f75747a.removeCallbacks(this);
        this.f75750d.removeFrameCallback(this);
    }

    @Override // p000.eyd
    public void onRemembered() {
        this.f75751e = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f75748b.isEmpty() || !this.f75749c || !this.f75751e || this.f75747a.getWindowVisibility() != 0) {
            this.f75749c = false;
            return;
        }
        b bVar = new b(this.f75752f + f75745F);
        boolean z = false;
        while (this.f75748b.isNotEmpty() && !z) {
            if (bVar.availableTimeNanos() <= 0 || this.f75748b.getContent()[0].execute(bVar)) {
                z = true;
            } else {
                this.f75748b.removeAt(0);
            }
        }
        if (z) {
            this.f75750d.postFrameCallback(this);
        } else {
            this.f75749c = false;
        }
    }

    @Override // p000.s9d
    public void schedulePrefetch(@yfb q9d q9dVar) {
        this.f75748b.add(q9dVar);
        if (this.f75749c) {
            return;
        }
        this.f75749c = true;
        this.f75747a.post(this);
    }
}

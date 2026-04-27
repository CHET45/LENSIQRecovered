package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,276:1\n33#2,6:277\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n*L\n184#1:277,6\n*E\n"})
public final class i2d {

    /* JADX INFO: renamed from: a */
    @yfb
    public final zl9<C7123a> f45557a = new zl9<>(0, 1, null);

    /* JADX INFO: renamed from: i2d$a */
    public static final class C7123a {

        /* JADX INFO: renamed from: a */
        public final long f45558a;

        /* JADX INFO: renamed from: b */
        public final long f45559b;

        /* JADX INFO: renamed from: c */
        public final boolean f45560c;

        /* JADX INFO: renamed from: d */
        public final int f45561d;

        public /* synthetic */ C7123a(long j, long j2, boolean z, int i, jt3 jt3Var) {
            this(j, j2, z, i);
        }

        public final boolean getDown() {
            return this.f45560c;
        }

        /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m30146getPositionOnScreenF1C5BW0() {
            return this.f45559b;
        }

        /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name */
        public final int m30147getTypeT8wyACA() {
            return this.f45561d;
        }

        public final long getUptime() {
            return this.f45558a;
        }

        private C7123a(long j, long j2, boolean z, int i) {
            this.f45558a = j;
            this.f45559b = j2;
            this.f45560c = z;
            this.f45561d = i;
        }
    }

    public final void clear() {
        this.f45557a.clear();
    }

    @yfb
    public final kb8 produce(@yfb j2d j2dVar, @yfb b5d b5dVar) {
        long uptime;
        boolean down;
        long jMo27745screenToLocalMKHz9U;
        zl9 zl9Var = new zl9(j2dVar.getPointers().size());
        List<k2d> pointers = j2dVar.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            k2d k2dVar = pointers.get(i);
            C7123a c7123a = this.f45557a.get(k2dVar.m30645getIdJ3iCeTQ());
            if (c7123a == null) {
                uptime = k2dVar.getUptime();
                jMo27745screenToLocalMKHz9U = k2dVar.m30647getPositionF1C5BW0();
                down = false;
            } else {
                long uptime2 = c7123a.getUptime();
                uptime = uptime2;
                down = c7123a.getDown();
                jMo27745screenToLocalMKHz9U = b5dVar.mo27745screenToLocalMKHz9U(c7123a.m30146getPositionOnScreenF1C5BW0());
            }
            zl9Var.put(k2dVar.m30645getIdJ3iCeTQ(), new h2d(k2dVar.m30645getIdJ3iCeTQ(), k2dVar.getUptime(), k2dVar.m30647getPositionF1C5BW0(), k2dVar.getDown(), k2dVar.getPressure(), uptime, jMo27745screenToLocalMKHz9U, down, false, k2dVar.m30650getTypeT8wyACA(), k2dVar.getHistorical(), k2dVar.m30649getScrollDeltaF1C5BW0(), k2dVar.m30646getOriginalEventPositionF1C5BW0(), null));
            if (k2dVar.getDown()) {
                this.f45557a.put(k2dVar.m30645getIdJ3iCeTQ(), new C7123a(k2dVar.getUptime(), k2dVar.m30648getPositionOnScreenF1C5BW0(), k2dVar.getDown(), k2dVar.m30650getTypeT8wyACA(), null));
            } else {
                this.f45557a.remove(k2dVar.m30645getIdJ3iCeTQ());
            }
        }
        return new kb8(zl9Var, j2dVar);
    }
}

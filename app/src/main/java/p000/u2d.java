package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@ug5
@e0g(parameters = 1)
public final class u2d implements o2d {

    /* JADX INFO: renamed from: e */
    public static final int f86657e = 0;

    /* JADX INFO: renamed from: a */
    public qy6<? super MotionEvent, Boolean> f86658a;

    /* JADX INFO: renamed from: b */
    @gib
    public y3e f86659b;

    /* JADX INFO: renamed from: c */
    public boolean f86660c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final n2d f86661d = new C13336b();

    /* JADX INFO: renamed from: u2d$a */
    public enum EnumC13335a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    /* JADX INFO: renamed from: u2d$b */
    @dwf({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,352:1\n101#2,2:353\n33#2,6:355\n103#2:361\n86#2,2:362\n33#2,6:364\n88#2:370\n101#2,2:371\n33#2,6:373\n103#2:379\n33#2,6:380\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n223#1:353,2\n223#1:355,6\n223#1:361\n238#1:362,2\n238#1:364,6\n238#1:370\n280#1:371,2\n280#1:373,6\n280#1:379\n314#1:380,6\n*E\n"})
    public static final class C13336b extends n2d {

        /* JADX INFO: renamed from: d */
        @yfb
        public EnumC13335a f86666d = EnumC13335a.Unknown;

        /* JADX INFO: renamed from: u2d$b$a */
        public static final class a extends tt8 implements qy6<MotionEvent, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ u2d f86668a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u2d u2dVar) {
                super(1);
                this.f86668a = u2dVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(MotionEvent motionEvent) {
                invoke2(motionEvent);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb MotionEvent motionEvent) {
                this.f86668a.getOnTouchEvent().invoke(motionEvent);
            }
        }

        /* JADX INFO: renamed from: u2d$b$b */
        public static final class b extends tt8 implements qy6<MotionEvent, bth> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ u2d f86670b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(u2d u2dVar) {
                super(1);
                this.f86670b = u2dVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(MotionEvent motionEvent) {
                invoke2(motionEvent);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f86670b.getOnTouchEvent().invoke(motionEvent);
                } else {
                    C13336b.this.f86666d = this.f86670b.getOnTouchEvent().invoke(motionEvent).booleanValue() ? EnumC13335a.Dispatching : EnumC13335a.NotDispatching;
                }
            }
        }

        /* JADX INFO: renamed from: u2d$b$c */
        public static final class c extends tt8 implements qy6<MotionEvent, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ u2d f86671a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(u2d u2dVar) {
                super(1);
                this.f86671a = u2dVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(MotionEvent motionEvent) {
                invoke2(motionEvent);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb MotionEvent motionEvent) {
                this.f86671a.getOnTouchEvent().invoke(motionEvent);
            }
        }

        public C13336b() {
        }

        private final void dispatchToView(t1d t1dVar) {
            List<h2d> changes = t1dVar.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                if (changes.get(i).isConsumed()) {
                    if (this.f86666d == EnumC13335a.Dispatching) {
                        mv8 layoutCoordinates$ui_release = getLayoutCoordinates$ui_release();
                        if (layoutCoordinates$ui_release == null) {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                        w2d.m32845toCancelMotionEventScoped4ec7I(t1dVar, layoutCoordinates$ui_release.mo30036localToRootMKHz9U(izb.f49009b.m30445getZeroF1C5BW0()), new a(u2d.this));
                    }
                    this.f86666d = EnumC13335a.NotDispatching;
                    return;
                }
            }
            mv8 layoutCoordinates$ui_release2 = getLayoutCoordinates$ui_release();
            if (layoutCoordinates$ui_release2 == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            w2d.m32846toMotionEventScoped4ec7I(t1dVar, layoutCoordinates$ui_release2.mo30036localToRootMKHz9U(izb.f49009b.m30445getZeroF1C5BW0()), new b(u2d.this));
            if (this.f86666d == EnumC13335a.Dispatching) {
                int size2 = changes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    changes.get(i2).consume();
                }
                kb8 internalPointerEvent$ui_release = t1dVar.getInternalPointerEvent$ui_release();
                if (internalPointerEvent$ui_release == null) {
                    return;
                }
                internalPointerEvent$ui_release.setSuppressMovementConsumption(!u2d.this.getDisallowIntercept$ui_release());
            }
        }

        private final void reset() {
            this.f86666d = EnumC13335a.Unknown;
            u2d.this.setDisallowIntercept$ui_release(false);
        }

        @Override // p000.n2d
        public boolean getShareWithSiblings() {
            return true;
        }

        @Override // p000.n2d
        public void onCancel() {
            if (this.f86666d == EnumC13335a.Dispatching) {
                w2d.emptyCancelMotionEventScope(SystemClock.uptimeMillis(), new c(u2d.this));
                reset();
            }
        }

        @Override // p000.n2d
        /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
        public void mo31119onPointerEventH0pRuoY(@yfb t1d t1dVar, @yfb v1d v1dVar, long j) {
            boolean z;
            List<h2d> changes = t1dVar.getChanges();
            if (u2d.this.getDisallowIntercept$ui_release()) {
                z = true;
                break;
            }
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                h2d h2dVar = changes.get(i);
                if (u1d.changedToDownIgnoreConsumed(h2dVar) || u1d.changedToUpIgnoreConsumed(h2dVar)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (this.f86666d != EnumC13335a.NotDispatching) {
                if (v1dVar == v1d.Initial && z) {
                    dispatchToView(t1dVar);
                }
                if (v1dVar == v1d.Final && !z) {
                    dispatchToView(t1dVar);
                }
            }
            if (v1dVar == v1d.Final) {
                int size2 = changes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (!u1d.changedToUpIgnoreConsumed(changes.get(i2))) {
                        return;
                    }
                }
                reset();
            }
        }
    }

    public final boolean getDisallowIntercept$ui_release() {
        return this.f86660c;
    }

    @yfb
    public final qy6<MotionEvent, Boolean> getOnTouchEvent() {
        qy6 qy6Var = this.f86658a;
        if (qy6Var != null) {
            return qy6Var;
        }
        md8.throwUninitializedPropertyAccessException("onTouchEvent");
        return null;
    }

    @Override // p000.o2d
    @yfb
    public n2d getPointerInputFilter() {
        return this.f86661d;
    }

    @gib
    public final y3e getRequestDisallowInterceptTouchEvent() {
        return this.f86659b;
    }

    public final void setDisallowIntercept$ui_release(boolean z) {
        this.f86660c = z;
    }

    public final void setOnTouchEvent(@yfb qy6<? super MotionEvent, Boolean> qy6Var) {
        this.f86658a = qy6Var;
    }

    public final void setRequestDisallowInterceptTouchEvent(@gib y3e y3eVar) {
        y3e y3eVar2 = this.f86659b;
        if (y3eVar2 != null) {
            y3eVar2.setPointerInteropFilter$ui_release(null);
        }
        this.f86659b = y3eVar;
        if (y3eVar == null) {
            return;
        }
        y3eVar.setPointerInteropFilter$ui_release(this);
    }
}

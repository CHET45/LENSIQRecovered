package p000;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import p000.p11;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,202:1\n33#2,6:203\n33#2,6:209\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n72#1:203,6\n97#1:209,6\n*E\n"})
@e0g(parameters = 0)
public final class t1d {

    /* JADX INFO: renamed from: f */
    public static final int f83358f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<h2d> f83359a;

    /* JADX INFO: renamed from: b */
    @gib
    public final kb8 f83360b;

    /* JADX INFO: renamed from: c */
    public final int f83361c;

    /* JADX INFO: renamed from: d */
    public final int f83362d;

    /* JADX INFO: renamed from: e */
    public int f83363e;

    public t1d(@yfb List<h2d> list, @gib kb8 kb8Var) {
        this.f83359a = list;
        this.f83360b = kb8Var;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.f83361c = s1d.m32238constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.f83362d = x2d.m33175constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.f83363e = m32355calculatePointerEventType7fucELk();
    }

    /* JADX INFO: renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m32355calculatePointerEventType7fucELk() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int actionMasked = motionEvent$ui_release.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                        }
                        return x1d.f96025b.m33160getPress7fucELk();
                    }
                    return x1d.f96025b.m33159getMove7fucELk();
                }
                return x1d.f96025b.m33161getRelease7fucELk();
            }
            return x1d.f96025b.m33160getPress7fucELk();
        }
        List<h2d> list = this.f83359a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h2d h2dVar = list.get(i);
            if (u1d.changedToUpIgnoreConsumed(h2dVar)) {
                return x1d.f96025b.m33161getRelease7fucELk();
            }
            if (u1d.changedToDownIgnoreConsumed(h2dVar)) {
                return x1d.f96025b.m33160getPress7fucELk();
            }
        }
        return x1d.f96025b.m33159getMove7fucELk();
    }

    @yfb
    public final List<h2d> component1() {
        return this.f83359a;
    }

    @yfb
    public final t1d copy(@yfb List<h2d> list, @gib MotionEvent motionEvent) {
        if (motionEvent == null) {
            return new t1d(list, null);
        }
        if (md8.areEqual(motionEvent, getMotionEvent$ui_release())) {
            return new t1d(list, this.f83360b);
        }
        zl9 zl9Var = new zl9(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            h2d h2dVar = list.get(i);
            zl9Var.put(h2dVar.m29909getIdJ3iCeTQ(), h2dVar);
            long jM29909getIdJ3iCeTQ = h2dVar.m29909getIdJ3iCeTQ();
            long uptimeMillis = h2dVar.getUptimeMillis();
            long jM29911getPositionF1C5BW0 = h2dVar.m29911getPositionF1C5BW0();
            long jM29911getPositionF1C5BW02 = h2dVar.m29911getPositionF1C5BW0();
            boolean pressed = h2dVar.getPressed();
            float pressure = h2dVar.getPressure();
            int iM29914getTypeT8wyACA = h2dVar.m29914getTypeT8wyACA();
            kb8 kb8Var = this.f83360b;
            int i2 = i;
            arrayList.add(new k2d(jM29909getIdJ3iCeTQ, uptimeMillis, jM29911getPositionF1C5BW0, jM29911getPositionF1C5BW02, pressed, pressure, iM29914getTypeT8wyACA, kb8Var != null && kb8Var.m30659activeHoverEvent0FcD4WY(h2dVar.m29909getIdJ3iCeTQ()), null, 0L, 0L, p11.C10745b.f69378f, null));
            i = i2 + 1;
        }
        return new t1d(list, new kb8(zl9Var, new j2d(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* JADX INFO: renamed from: getButtons-ry648PA, reason: not valid java name */
    public final int m32356getButtonsry648PA() {
        return this.f83361c;
    }

    @yfb
    public final List<h2d> getChanges() {
        return this.f83359a;
    }

    @gib
    public final kb8 getInternalPointerEvent$ui_release() {
        return this.f83360b;
    }

    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int m32357getKeyboardModifiersk7X9c1A() {
        return this.f83362d;
    }

    @gib
    public final MotionEvent getMotionEvent$ui_release() {
        kb8 kb8Var = this.f83360b;
        if (kb8Var != null) {
            return kb8Var.getMotionEvent();
        }
        return null;
    }

    /* JADX INFO: renamed from: getType-7fucELk, reason: not valid java name */
    public final int m32358getType7fucELk() {
        return this.f83363e;
    }

    /* JADX INFO: renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m32359setTypeEhbLWgg$ui_release(int i) {
        this.f83363e = i;
    }

    public t1d(@yfb List<h2d> list) {
        this(list, null);
    }
}

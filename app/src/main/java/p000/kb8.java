package p000;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nInternalPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,39:1\n116#2,2:40\n33#2,6:42\n118#2:48\n*S KotlinDebug\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n*L\n33#1:40,2\n33#1:42,6\n33#1:48\n*E\n"})
@e0g(parameters = 0)
public final class kb8 {

    /* JADX INFO: renamed from: d */
    public static final int f53536d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final zl9<h2d> f53537a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final j2d f53538b;

    /* JADX INFO: renamed from: c */
    public boolean f53539c;

    public kb8(@yfb zl9<h2d> zl9Var, @yfb j2d j2dVar) {
        this.f53537a = zl9Var;
        this.f53538b = j2dVar;
    }

    /* JADX INFO: renamed from: activeHoverEvent-0FcD4WY, reason: not valid java name */
    public final boolean m30659activeHoverEvent0FcD4WY(long j) {
        k2d k2dVar;
        List<k2d> pointers = this.f53538b.getPointers();
        int size = pointers.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                k2dVar = null;
                break;
            }
            k2dVar = pointers.get(i);
            if (f2d.m28883equalsimpl0(k2dVar.m30645getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        k2d k2dVar2 = k2dVar;
        if (k2dVar2 != null) {
            return k2dVar2.getActiveHover();
        }
        return false;
    }

    @yfb
    public final zl9<h2d> getChanges() {
        return this.f53537a;
    }

    @yfb
    public final MotionEvent getMotionEvent() {
        return this.f53538b.getMotionEvent();
    }

    @yfb
    public final j2d getPointerInputEvent() {
        return this.f53538b;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.f53539c;
    }

    public final void setSuppressMovementConsumption(boolean z) {
        this.f53539c = z;
    }
}

package p000;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class hza {

    /* JADX INFO: renamed from: g */
    public static final int f45295g = 8;

    /* JADX INFO: renamed from: a */
    public long f45296a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final SparseLongArray f45297b = new SparseLongArray();

    /* JADX INFO: renamed from: c */
    @yfb
    public final SparseBooleanArray f45298c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    @yfb
    public final List<k2d> f45299d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f45300e = -1;

    /* JADX INFO: renamed from: f */
    public int f45301f = -1;

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f45297b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f45297b;
                long j = this.f45296a;
                this.f45296a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f45297b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f45297b;
            long j2 = this.f45296a;
            this.f45296a = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f45298c.put(pointerId2, true);
            }
        }
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f45300e && source == this.f45301f) {
            return;
        }
        this.f45300e = toolType;
        this.f45301f = source;
        this.f45298c.clear();
        this.f45297b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p000.k2d createPointerInputEventData(p000.b5d r32, android.view.MotionEvent r33, int r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hza.createPointerInputEventData(b5d, android.view.MotionEvent, int, boolean):k2d");
    }

    /* JADX INFO: renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m30144getComposePointerId_I2yYro(int i) {
        long jValueAt;
        int iIndexOfKey = this.f45297b.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f45297b.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.f45296a;
            this.f45296a = 1 + jValueAt;
            this.f45297b.put(i, jValueAt);
        }
        return f2d.m28881constructorimpl(jValueAt);
    }

    @fdi
    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f45298c.get(pointerId, false)) {
                this.f45297b.delete(pointerId);
                this.f45298c.delete(pointerId);
            }
        }
        if (this.f45297b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f45297b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f45297b.keyAt(size);
                if (!hasPointerId(motionEvent, iKeyAt)) {
                    this.f45297b.removeAt(size);
                    this.f45298c.delete(iKeyAt);
                }
            }
        }
    }

    @gib
    public final j2d convertToPointerInputEvent$ui_release(@yfb MotionEvent motionEvent, @yfb b5d b5dVar) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f45297b.clear();
            this.f45298c.clear();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.f45298c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.f45299d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        while (i < pointerCount) {
            this.f45299d.add(createPointerInputEventData(b5dVar, motionEvent, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
            i++;
        }
        removeStaleIds(motionEvent);
        return new j2d(motionEvent.getEventTime(), this.f45299d, motionEvent);
    }

    public final void endStream(int i) {
        this.f45298c.delete(i);
        this.f45297b.delete(i);
    }

    @yfb
    public final SparseLongArray getMotionEventToComposePointerIdMap$ui_release() {
        return this.f45297b;
    }
}

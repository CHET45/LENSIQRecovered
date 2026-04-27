package p000;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes3.dex */
public class sab {

    /* JADX INFO: renamed from: a */
    public ViewParent f81050a;

    /* JADX INFO: renamed from: b */
    public ViewParent f81051b;

    /* JADX INFO: renamed from: c */
    public final View f81052c;

    /* JADX INFO: renamed from: d */
    public boolean f81053d;

    /* JADX INFO: renamed from: e */
    public int[] f81054e;

    public sab(@efb View view) {
        this.f81052c = view;
    }

    private boolean dispatchNestedScrollInternal(int i, int i2, int i3, int i4, @hib int[] iArr, int i5, @hib int[] iArr2) {
        ViewParent nestedScrollingParentForType;
        int i6;
        int i7;
        int[] iArr3;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f81052c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] tempNestedScrollConsumed = getTempNestedScrollConsumed();
            tempNestedScrollConsumed[0] = 0;
            tempNestedScrollConsumed[1] = 0;
            iArr3 = tempNestedScrollConsumed;
        } else {
            iArr3 = iArr2;
        }
        abi.onNestedScroll(nestedScrollingParentForType, this.f81052c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f81052c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    private ViewParent getNestedScrollingParentForType(int i) {
        if (i == 0) {
            return this.f81050a;
        }
        if (i != 1) {
            return null;
        }
        return this.f81051b;
    }

    private int[] getTempNestedScrollConsumed() {
        if (this.f81054e == null) {
            this.f81054e = new int[2];
        }
        return this.f81054e;
    }

    private void setNestedScrollingParentForType(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f81050a = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.f81051b = viewParent;
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent nestedScrollingParentForType;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return abi.onNestedFling(nestedScrollingParentForType, this.f81052c, f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent nestedScrollingParentForType;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(0)) == null) {
            return false;
        }
        return abi.onNestedPreFling(nestedScrollingParentForType, this.f81052c, f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, @hib int[] iArr, @hib int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @hib int[] iArr) {
        return dispatchNestedScrollInternal(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f81053d;
    }

    public void onDetachedFromWindow() {
        o8i.stopNestedScroll(this.f81052c);
    }

    public void onStopNestedScroll(@efb View view) {
        o8i.stopNestedScroll(this.f81052c);
    }

    public void setNestedScrollingEnabled(boolean z) {
        if (this.f81053d) {
            o8i.stopNestedScroll(this.f81052c);
        }
        this.f81053d = z;
    }

    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, @hib int[] iArr, @hib int[] iArr2, int i3) {
        ViewParent nestedScrollingParentForType;
        int i4;
        int i5;
        if (!isNestedScrollingEnabled() || (nestedScrollingParentForType = getNestedScrollingParentForType(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f81052c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = getTempNestedScrollConsumed();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        abi.onNestedPreScroll(nestedScrollingParentForType, this.f81052c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f81052c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @hib int[] iArr, int i5) {
        return dispatchNestedScrollInternal(i, i2, i3, i4, iArr, i5, null);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getNestedScrollingParentForType(i) != null;
    }

    public boolean startNestedScroll(int i, int i2) {
        if (hasNestedScrollingParent(i2)) {
            return true;
        }
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        View view = this.f81052c;
        for (ViewParent parent = this.f81052c.getParent(); parent != null; parent = parent.getParent()) {
            if (abi.onStartNestedScroll(parent, view, this.f81052c, i, i2)) {
                setNestedScrollingParentForType(i2, parent);
                abi.onNestedScrollAccepted(parent, view, this.f81052c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void stopNestedScroll(int i) {
        ViewParent nestedScrollingParentForType = getNestedScrollingParentForType(i);
        if (nestedScrollingParentForType != null) {
            abi.onStopNestedScroll(nestedScrollingParentForType, this.f81052c, i);
            setNestedScrollingParentForType(i, null);
        }
    }

    public void dispatchNestedScroll(int i, int i2, int i3, int i4, @hib int[] iArr, int i5, @hib int[] iArr2) {
        dispatchNestedScrollInternal(i, i2, i3, i4, iArr, i5, iArr2);
    }
}

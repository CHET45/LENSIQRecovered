package com.draggable.library.core;

import java.io.Serializable;
import p000.c0b;
import p000.gib;
import p000.jt3;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
public final class DraggableParamsInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final float INVALID_RADIO = -1.0f;
    private float scaledViewWhRadio;
    private final int viewHeight;
    private final int viewLeft;
    private final int viewTop;
    private final int viewWidth;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(jt3 jt3Var) {
            this();
        }
    }

    public DraggableParamsInfo() {
        this(0, 0, 0, 0, 0.0f, 31, null);
    }

    @yfb
    public static /* synthetic */ DraggableParamsInfo copy$default(DraggableParamsInfo draggableParamsInfo, int i, int i2, int i3, int i4, float f, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = draggableParamsInfo.viewLeft;
        }
        if ((i5 & 2) != 0) {
            i2 = draggableParamsInfo.viewTop;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = draggableParamsInfo.viewWidth;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = draggableParamsInfo.viewHeight;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            f = draggableParamsInfo.scaledViewWhRadio;
        }
        return draggableParamsInfo.copy(i, i6, i7, i8, f);
    }

    public final int component1() {
        return this.viewLeft;
    }

    public final int component2() {
        return this.viewTop;
    }

    public final int component3() {
        return this.viewWidth;
    }

    public final int component4() {
        return this.viewHeight;
    }

    public final float component5() {
        return this.scaledViewWhRadio;
    }

    @yfb
    public final DraggableParamsInfo copy(int i, int i2, int i3, int i4, float f) {
        return new DraggableParamsInfo(i, i2, i3, i4, f);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableParamsInfo)) {
            return false;
        }
        DraggableParamsInfo draggableParamsInfo = (DraggableParamsInfo) obj;
        return this.viewLeft == draggableParamsInfo.viewLeft && this.viewTop == draggableParamsInfo.viewTop && this.viewWidth == draggableParamsInfo.viewWidth && this.viewHeight == draggableParamsInfo.viewHeight && Float.compare(this.scaledViewWhRadio, draggableParamsInfo.scaledViewWhRadio) == 0;
    }

    public final float getScaledViewWhRadio() {
        return this.scaledViewWhRadio;
    }

    public final int getViewHeight() {
        return this.viewHeight;
    }

    public final int getViewLeft() {
        return this.viewLeft;
    }

    public final int getViewTop() {
        return this.viewTop;
    }

    public final int getViewWidth() {
        return this.viewWidth;
    }

    public int hashCode() {
        return (((((((this.viewLeft * 31) + this.viewTop) * 31) + this.viewWidth) * 31) + this.viewHeight) * 31) + Float.floatToIntBits(this.scaledViewWhRadio);
    }

    public final boolean isValid() {
        return (this.viewWidth == 0 || this.viewHeight == 0 || this.scaledViewWhRadio == -1.0f) ? false : true;
    }

    public final void setScaledViewWhRadio(float f) {
        this.scaledViewWhRadio = f;
    }

    @yfb
    public String toString() {
        return "DraggableParamsInfo(viewLeft=" + this.viewLeft + ", viewTop=" + this.viewTop + ", viewWidth=" + this.viewWidth + ", viewHeight=" + this.viewHeight + ", scaledViewWhRadio=" + this.scaledViewWhRadio + c0b.f15434d;
    }

    public DraggableParamsInfo(int i, int i2, int i3, int i4, float f) {
        this.viewLeft = i;
        this.viewTop = i2;
        this.viewWidth = i3;
        this.viewHeight = i4;
        this.scaledViewWhRadio = f;
    }

    public /* synthetic */ DraggableParamsInfo(int i, int i2, int i3, int i4, float f, int i5, jt3 jt3Var) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? -1.0f : f);
    }
}

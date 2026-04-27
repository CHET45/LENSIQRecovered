package com.eyevue.glassapp.view.photo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.eyevue.common.C2531R;
import com.google.android.exoplayer2.p009ui.InterfaceC3120g;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p000.g92;
import p000.hib;
import p000.u80;
import p000.x0i;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultTimeBar extends View implements InterfaceC3120g {

    /* JADX INFO: renamed from: A2 */
    public static final int f18778A2 = 4;

    /* JADX INFO: renamed from: B2 */
    public static final int f18779B2 = 12;

    /* JADX INFO: renamed from: C2 */
    public static final int f18780C2 = 0;

    /* JADX INFO: renamed from: D2 */
    public static final int f18781D2 = 16;

    /* JADX INFO: renamed from: E2 */
    public static final int f18782E2 = -1;

    /* JADX INFO: renamed from: F2 */
    public static final int f18783F2 = 872415231;

    /* JADX INFO: renamed from: G2 */
    public static final int f18784G2 = -855638017;

    /* JADX INFO: renamed from: H2 */
    public static final int f18785H2 = -1;

    /* JADX INFO: renamed from: I2 */
    public static final int f18786I2 = -1291845888;

    /* JADX INFO: renamed from: J2 */
    public static final int f18787J2 = 872414976;

    /* JADX INFO: renamed from: K2 */
    public static final int f18788K2 = 0;

    /* JADX INFO: renamed from: L2 */
    public static final int f18789L2 = 1;

    /* JADX INFO: renamed from: M2 */
    public static final int f18790M2 = -50;

    /* JADX INFO: renamed from: N2 */
    public static final int f18791N2 = 3;

    /* JADX INFO: renamed from: O2 */
    public static final long f18792O2 = 1000;

    /* JADX INFO: renamed from: P2 */
    public static final int f18793P2 = 20;

    /* JADX INFO: renamed from: Q2 */
    public static final float f18794Q2 = 1.0f;

    /* JADX INFO: renamed from: R2 */
    public static final float f18795R2 = 0.0f;

    /* JADX INFO: renamed from: S2 */
    public static final String f18796S2 = "android.widget.SeekBar";

    /* JADX INFO: renamed from: y2 */
    public static final int f18797y2 = 4;

    /* JADX INFO: renamed from: z2 */
    public static final int f18798z2 = 26;

    /* JADX INFO: renamed from: C */
    public final Paint f18799C;

    /* JADX INFO: renamed from: F */
    public final Paint f18800F;

    /* JADX INFO: renamed from: H */
    public final Paint f18801H;

    /* JADX INFO: renamed from: L */
    @hib
    public final Drawable f18802L;

    /* JADX INFO: renamed from: M */
    public final int f18803M;

    /* JADX INFO: renamed from: M1 */
    public final int f18804M1;

    /* JADX INFO: renamed from: N */
    public final int f18805N;

    /* JADX INFO: renamed from: Q */
    public final int f18806Q;

    /* JADX INFO: renamed from: V1 */
    public final int f18807V1;

    /* JADX INFO: renamed from: Z1 */
    public final int f18808Z1;

    /* JADX INFO: renamed from: a */
    public final Rect f18809a;

    /* JADX INFO: renamed from: a2 */
    public final int f18810a2;

    /* JADX INFO: renamed from: b */
    public final Rect f18811b;

    /* JADX INFO: renamed from: b2 */
    public final int f18812b2;

    /* JADX INFO: renamed from: c */
    public final Rect f18813c;

    /* JADX INFO: renamed from: c2 */
    public final int f18814c2;

    /* JADX INFO: renamed from: d */
    public final Rect f18815d;

    /* JADX INFO: renamed from: d2 */
    public final StringBuilder f18816d2;

    /* JADX INFO: renamed from: e */
    public final Paint f18817e;

    /* JADX INFO: renamed from: e2 */
    public final Formatter f18818e2;

    /* JADX INFO: renamed from: f */
    public final Paint f18819f;

    /* JADX INFO: renamed from: f2 */
    public final Runnable f18820f2;

    /* JADX INFO: renamed from: g2 */
    public final CopyOnWriteArraySet<InterfaceC3120g.a> f18821g2;

    /* JADX INFO: renamed from: h2 */
    public final Point f18822h2;

    /* JADX INFO: renamed from: i2 */
    public final float f18823i2;

    /* JADX INFO: renamed from: j2 */
    public int f18824j2;

    /* JADX INFO: renamed from: k2 */
    public long f18825k2;

    /* JADX INFO: renamed from: l2 */
    public int f18826l2;

    /* JADX INFO: renamed from: m */
    public final Paint f18827m;

    /* JADX INFO: renamed from: m2 */
    public Rect f18828m2;

    /* JADX INFO: renamed from: n2 */
    public ValueAnimator f18829n2;

    /* JADX INFO: renamed from: o2 */
    public float f18830o2;

    /* JADX INFO: renamed from: p2 */
    public boolean f18831p2;

    /* JADX INFO: renamed from: q2 */
    public boolean f18832q2;

    /* JADX INFO: renamed from: r2 */
    public long f18833r2;

    /* JADX INFO: renamed from: s2 */
    public long f18834s2;

    /* JADX INFO: renamed from: t2 */
    public long f18835t2;

    /* JADX INFO: renamed from: u2 */
    public long f18836u2;

    /* JADX INFO: renamed from: v2 */
    public int f18837v2;

    /* JADX INFO: renamed from: w2 */
    @hib
    public long[] f18838w2;

    /* JADX INFO: renamed from: x2 */
    @hib
    public boolean[] f18839x2;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    private static int dpToPx(float density, int dps) {
        return (int) ((dps * density) + 0.5f);
    }

    private void drawPlayhead(Canvas canvas) {
        if (this.f18834s2 <= 0) {
            return;
        }
        Rect rect = this.f18815d;
        int iConstrainValue = x0i.constrainValue(rect.right, rect.left, this.f18811b.right);
        int iCenterY = this.f18815d.centerY();
        if (this.f18802L == null) {
            canvas.drawCircle(iConstrainValue, iCenterY, (int) ((((this.f18832q2 || isFocused()) ? this.f18810a2 : isEnabled() ? this.f18807V1 : this.f18808Z1) * this.f18830o2) / 2.0f), this.f18801H);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.f18830o2)) / 2;
        int intrinsicHeight = ((int) (this.f18802L.getIntrinsicHeight() * this.f18830o2)) / 2;
        this.f18802L.setBounds(iConstrainValue - intrinsicWidth, iCenterY - intrinsicHeight, iConstrainValue + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f18802L.draw(canvas);
    }

    private void drawTimeBar(Canvas canvas) {
        int iHeight = this.f18811b.height();
        int iCenterY = this.f18811b.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.f18834s2 <= 0) {
            float f = this.f18811b.right;
            float f2 = i;
            int i2 = this.f18803M;
            canvas.drawRoundRect(r3.left, iCenterY, f, f2, i2 / 2, i2 / 2, this.f18827m);
            return;
        }
        Rect rect = this.f18813c;
        int i3 = rect.left;
        Math.max(Math.max(this.f18811b.left, rect.right), this.f18815d.right);
        float f3 = this.f18815d.left;
        float f4 = iCenterY;
        float f5 = this.f18811b.right;
        float f6 = i;
        int i4 = this.f18803M;
        canvas.drawRoundRect(f3, f4, f5, f6, i4 / 2, i4 / 2, this.f18827m);
        Math.max(i3, this.f18815d.right);
        if (this.f18815d.width() > 0) {
            Rect rect2 = this.f18815d;
            float f7 = rect2.left;
            float f8 = rect2.right;
            int i5 = this.f18803M;
            canvas.drawRoundRect(f7, f4, f8, f6, i5 / 2, i5 / 2, this.f18817e);
        }
        if (this.f18837v2 == 0) {
            return;
        }
        long[] jArr = (long[]) u80.checkNotNull(this.f18838w2);
        boolean[] zArr = (boolean[]) u80.checkNotNull(this.f18839x2);
        int i6 = this.f18804M1 / 2;
        for (int i7 = 0; i7 < this.f18837v2; i7++) {
            int iWidth = ((int) ((((long) this.f18811b.width()) * x0i.constrainValue(jArr[i7], 0L, this.f18834s2)) / this.f18834s2)) - i6;
            Rect rect3 = this.f18811b;
            canvas.drawRect(rect3.left + Math.min(rect3.width() - this.f18804M1, Math.max(0, iWidth)), f4, r9 + this.f18804M1, f6, zArr[i7] ? this.f18800F : this.f18799C);
        }
    }

    private long getPositionIncrement() {
        long j = this.f18825k2;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f18834s2;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f18824j2);
    }

    private String getProgressText() {
        return x0i.getStringForTime(this.f18816d2, this.f18818e2, this.f18835t2);
    }

    private long getScrubberPosition() {
        if (this.f18811b.width() <= 0 || this.f18834s2 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f18815d.width()) * this.f18834s2) / ((long) this.f18811b.width());
    }

    private boolean isInSeekBar(float x, float y) {
        return this.f18809a.contains((int) x, (int) y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        stopScrubbing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(ValueAnimator valueAnimator) {
        this.f18830o2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f18809a);
    }

    private void positionScrubber(float xPosition) {
        Rect rect = this.f18815d;
        Rect rect2 = this.f18811b;
        rect.right = x0i.constrainValue((int) xPosition, rect2.left, rect2.right);
    }

    private static int pxToDp(float density, int px) {
        return (int) (px / density);
    }

    private Point resolveRelativeTouchPosition(MotionEvent motionEvent) {
        this.f18822h2.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f18822h2;
    }

    private boolean scrubIncrementally(long positionChange) {
        long j = this.f18834s2;
        if (j <= 0) {
            return false;
        }
        long j2 = this.f18832q2 ? this.f18833r2 : this.f18835t2;
        long jConstrainValue = x0i.constrainValue(j2 + positionChange, 0L, j);
        if (jConstrainValue == j2) {
            return false;
        }
        if (this.f18832q2) {
            updateScrubbing(jConstrainValue);
        } else {
            startScrubbing(jConstrainValue);
        }
        update();
        return true;
    }

    private boolean setDrawableLayoutDirection(Drawable drawable) {
        return x0i.f95978a >= 23 && setDrawableLayoutDirection(drawable, getLayoutDirection());
    }

    private void startScrubbing(long scrubPosition) {
        this.f18833r2 = scrubPosition;
        this.f18832q2 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<InterfaceC3120g.a> it = this.f18821g2.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, scrubPosition);
        }
    }

    private void stopScrubbing(boolean canceled) {
        removeCallbacks(this.f18820f2);
        this.f18832q2 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<InterfaceC3120g.a> it = this.f18821g2.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.f18833r2, canceled);
        }
    }

    private void update() {
        this.f18813c.set(this.f18811b);
        this.f18815d.set(this.f18811b);
        long j = this.f18832q2 ? this.f18833r2 : this.f18835t2;
        if (this.f18834s2 > 0) {
            int iWidth = (int) ((((long) this.f18811b.width()) * this.f18836u2) / this.f18834s2);
            Rect rect = this.f18813c;
            Rect rect2 = this.f18811b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f18811b.width()) * j) / this.f18834s2);
            Rect rect3 = this.f18815d;
            Rect rect4 = this.f18811b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f18813c;
            int i = this.f18811b.left;
            rect5.right = i;
            this.f18815d.right = i;
        }
        invalidate(this.f18809a);
    }

    private void updateDrawableState() {
        Drawable drawable = this.f18802L;
        if (drawable != null && drawable.isStateful() && this.f18802L.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void updateScrubbing(long scrubPosition) {
        if (this.f18833r2 == scrubPosition) {
            return;
        }
        this.f18833r2 = scrubPosition;
        Iterator<InterfaceC3120g.a> it = this.f18821g2.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, scrubPosition);
        }
    }

    @Override // com.google.android.exoplayer2.p009ui.InterfaceC3120g
    public void addListener(InterfaceC3120g.a listener) {
        u80.checkNotNull(listener);
        this.f18821g2.add(listener);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    @Override // com.google.android.exoplayer2.p009ui.InterfaceC3120g
    public long getPreferredUpdateDelay() {
        int iPxToDp = pxToDp(this.f18823i2, this.f18811b.width());
        if (iPxToDp != 0) {
            long j = this.f18834s2;
            if (j != 0 && j != -9223372036854775807L) {
                return j / ((long) iPxToDp);
            }
        }
        return Long.MAX_VALUE;
    }

    public void hideScrubber(boolean disableScrubberPadding) {
        if (this.f18829n2.isStarted()) {
            this.f18829n2.cancel();
        }
        this.f18831p2 = disableScrubberPadding;
        this.f18830o2 = 0.0f;
        invalidate(this.f18809a);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f18802L;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        drawTimeBar(canvas);
        drawPlayhead(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, @hib Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (!this.f18832q2 || gainFocus) {
            return;
        }
        stopScrubbing(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        if (event.getEventType() == 4) {
            event.getText().add(getProgressText());
        }
        event.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName("android.widget.SeekBar");
        info.setContentDescription(getProgressText());
        if (this.f18834s2 <= 0) {
            return;
        }
        if (x0i.f95978a >= 21) {
            info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            info.addAction(4096);
            info.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.scrubIncrementally(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f18820f2
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f18820f2
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f18832q2
            if (r0 == 0) goto L30
            r5 = 0
            r4.stopScrubbing(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.glassapp.view.photo.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingBottom;
        int iMax;
        int i = bottom - top;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (right - left) - getPaddingRight();
        int i2 = this.f18831p2 ? 0 : this.f18812b2;
        if (this.f18806Q == 1) {
            paddingBottom = (i - getPaddingBottom()) - this.f18805N;
            int paddingBottom2 = i - getPaddingBottom();
            int i3 = this.f18803M;
            iMax = (paddingBottom2 - i3) - Math.max(i2 - (i3 / 2), 0);
        } else {
            paddingBottom = (i - this.f18805N) / 2;
            iMax = (i - this.f18803M) / 2;
        }
        this.f18809a.set(paddingLeft, paddingBottom, paddingRight, this.f18805N + paddingBottom);
        Rect rect = this.f18811b;
        Rect rect2 = this.f18809a;
        rect.set(rect2.left + i2, iMax, rect2.right - i2, this.f18803M + iMax);
        update();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == 0) {
            size = this.f18805N;
        } else if (mode != 1073741824) {
            size = Math.min(this.f18805N, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), size);
        updateDrawableState();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        Drawable drawable = this.f18802L;
        if (drawable == null || !setDrawableLayoutDirection(drawable, layoutDirection)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.f18834s2
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.resolveRelativeTouchPosition(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.f18832q2
            if (r8 == 0) goto L76
            int r8 = r7.f18814c2
            if (r0 >= r8) goto L3a
            int r8 = r7.f18826l2
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.positionScrubber(r8)
            goto L40
        L3a:
            r7.f18826l2 = r2
            float r8 = (float) r2
            r7.positionScrubber(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.updateScrubbing(r0)
            r7.update()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.f18832q2
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.stopScrubbing(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.isInSeekBar(r8, r0)
            if (r0 == 0) goto L76
            r7.positionScrubber(r8)
            long r0 = r7.getScrubberPosition()
            r7.startScrubbing(r0)
            r7.update()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.glassapp.view.photo.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int action, @hib Bundle args) {
        if (super.performAccessibilityAction(action, args)) {
            return true;
        }
        if (this.f18834s2 <= 0) {
            return false;
        }
        if (action == 8192) {
            if (scrubIncrementally(-getPositionIncrement())) {
                stopScrubbing(false);
            }
        } else {
            if (action != 4096) {
                return false;
            }
            if (scrubIncrementally(getPositionIncrement())) {
                stopScrubbing(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // com.google.android.exoplayer2.p009ui.InterfaceC3120g
    public void removeListener(InterfaceC3120g.a listener) {
        this.f18821g2.remove(listener);
    }

    @Override // com.google.android.exoplayer2.p009ui.InterfaceC3120g
    public void setAdGroupTimesMs(@hib long[] adGroupTimesMs, @hib boolean[] playedAdGroups, int adGroupCount) {
        u80.checkArgument(adGroupCount == 0 || !(adGroupTimesMs == null || playedAdGroups == null));
        this.f18837v2 = adGroupCount;
        this.f18838w2 = adGroupTimesMs;
        this.f18839x2 = playedAdGroups;
        update();
    }

    public void setAdMarkerColor(@g92 int adMarkerColor) {
        this.f18799C.setColor(adMarkerColor);
        invalidate(this.f18809a);
    }

    public void setBufferedColor(@g92 int bufferedColor) {
        this.f18819f.setColor(bufferedColor);
        invalidate(this.f18809a);
    }

    @Override // com.google.android.exoplayer2.p009ui.InterfaceC3120g
    public void setBufferedPosition(long bufferedPosition) {
        if (this.f18836u2 == bufferedPosition) {
            return;
        }
        this.f18836u2 = bufferedPosition;
        update();
    }

    @Override // com.google.android.exoplayer2.p009ui.InterfaceC3120g
    public void setDuration(long duration) {
        if (this.f18834s2 == duration) {
            return;
        }
        this.f18834s2 = duration;
        if (this.f18832q2 && duration == -9223372036854775807L) {
            stopScrubbing(true);
        }
        update();
    }

    @Override // android.view.View, com.google.android.exoplayer2.p009ui.InterfaceC3120g
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (!this.f18832q2 || enabled) {
            return;
        }
        stopScrubbing(true);
    }

    @Override // com.google.android.exoplayer2.p009ui.InterfaceC3120g
    public void setKeyCountIncrement(int count) {
        u80.checkArgument(count > 0);
        this.f18824j2 = count;
        this.f18825k2 = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.p009ui.InterfaceC3120g
    public void setKeyTimeIncrement(long time) {
        u80.checkArgument(time > 0);
        this.f18824j2 = -1;
        this.f18825k2 = time;
    }

    public void setPlayedAdMarkerColor(@g92 int playedAdMarkerColor) {
        this.f18800F.setColor(playedAdMarkerColor);
        invalidate(this.f18809a);
    }

    public void setPlayedColor(@g92 int playedColor) {
        this.f18817e.setColor(playedColor);
        invalidate(this.f18809a);
    }

    @Override // com.google.android.exoplayer2.p009ui.InterfaceC3120g
    public void setPosition(long position) {
        if (this.f18835t2 == position) {
            return;
        }
        this.f18835t2 = position;
        setContentDescription(getProgressText());
        update();
    }

    public void setScrubberColor(@g92 int scrubberColor) {
        this.f18801H.setColor(scrubberColor);
        invalidate(this.f18809a);
    }

    public void setUnplayedColor(@g92 int unplayedColor) {
        this.f18827m.setColor(unplayedColor);
        invalidate(this.f18809a);
    }

    public void showScrubber() {
        if (this.f18829n2.isStarted()) {
            this.f18829n2.cancel();
        }
        this.f18831p2 = false;
        this.f18830o2 = 1.0f;
        invalidate(this.f18809a);
    }

    public DefaultTimeBar(Context context, @hib AttributeSet attrs) {
        this(context, attrs, 0);
    }

    private static boolean setDrawableLayoutDirection(Drawable drawable, int layoutDirection) {
        return x0i.f95978a >= 23 && drawable.setLayoutDirection(layoutDirection);
    }

    public DefaultTimeBar(Context context, @hib AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, attrs);
    }

    public DefaultTimeBar(Context context, @hib AttributeSet attrs, int defStyleAttr, @hib AttributeSet timebarAttrs) {
        this(context, attrs, defStyleAttr, timebarAttrs, 0);
    }

    public DefaultTimeBar(Context context, @hib AttributeSet attrs, int defStyleAttr, @hib AttributeSet timebarAttrs, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f18809a = new Rect();
        this.f18811b = new Rect();
        this.f18813c = new Rect();
        this.f18815d = new Rect();
        Paint paint = new Paint(1);
        this.f18817e = paint;
        Paint paint2 = new Paint(1);
        this.f18819f = paint2;
        Paint paint3 = new Paint(1);
        this.f18827m = paint3;
        Paint paint4 = new Paint(1);
        this.f18799C = paint4;
        Paint paint5 = new Paint(1);
        this.f18800F = paint5;
        Paint paint6 = new Paint();
        this.f18801H = paint6;
        paint6.setAntiAlias(true);
        this.f18821g2 = new CopyOnWriteArraySet<>();
        this.f18822h2 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f18823i2 = f;
        this.f18814c2 = dpToPx(f, -50);
        int iDpToPx = dpToPx(f, 4);
        int iDpToPx2 = dpToPx(f, 26);
        int iDpToPx3 = dpToPx(f, 4);
        int iDpToPx4 = dpToPx(f, 12);
        int iDpToPx5 = dpToPx(f, 0);
        int iDpToPx6 = dpToPx(f, 16);
        if (timebarAttrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(timebarAttrs, C2531R.styleable.DefaultTimeBar, defStyleAttr, defStyleRes);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C2531R.styleable.DefaultTimeBar_scrubber_drawable);
                this.f18802L = drawable;
                if (drawable != null) {
                    setDrawableLayoutDirection(drawable);
                    iDpToPx2 = Math.max(drawable.getMinimumHeight(), iDpToPx2);
                }
                this.f18803M = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2531R.styleable.DefaultTimeBar_bar_height, iDpToPx);
                this.f18805N = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2531R.styleable.DefaultTimeBar_touch_target_height, iDpToPx2);
                this.f18806Q = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.DefaultTimeBar_bar_gravity, 0);
                this.f18804M1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2531R.styleable.DefaultTimeBar_ad_marker_width, iDpToPx3);
                this.f18807V1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2531R.styleable.DefaultTimeBar_scrubber_enabled_size, iDpToPx4);
                this.f18808Z1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2531R.styleable.DefaultTimeBar_scrubber_disabled_size, iDpToPx5);
                this.f18810a2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2531R.styleable.DefaultTimeBar_scrubber_dragged_size, iDpToPx6);
                int i = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.DefaultTimeBar_played_color, -1);
                int i2 = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.DefaultTimeBar_scrubber_color, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.DefaultTimeBar_buffered_color, -855638017);
                int i4 = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.DefaultTimeBar_unplayed_color, 872415231);
                int i5 = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.DefaultTimeBar_ad_marker_color, -1291845888);
                int i6 = typedArrayObtainStyledAttributes.getInt(C2531R.styleable.DefaultTimeBar_played_ad_marker_color, 872414976);
                paint.setColor(i);
                paint6.setColor(i2);
                paint2.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint5.setColor(i6);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f18803M = iDpToPx;
            this.f18805N = iDpToPx2;
            this.f18806Q = 0;
            this.f18804M1 = iDpToPx3;
            this.f18807V1 = iDpToPx4;
            this.f18808Z1 = iDpToPx5;
            this.f18810a2 = iDpToPx6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f18802L = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f18816d2 = sb;
        this.f18818e2 = new Formatter(sb, Locale.getDefault());
        this.f18820f2 = new Runnable() { // from class: r04
            @Override // java.lang.Runnable
            public final void run() {
                this.f76634a.lambda$new$0();
            }
        };
        Drawable drawable2 = this.f18802L;
        if (drawable2 != null) {
            this.f18812b2 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f18812b2 = (Math.max(this.f18808Z1, Math.max(this.f18807V1, this.f18810a2)) + 1) / 2;
        }
        this.f18830o2 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f18829n2 = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: s04
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f80266a.lambda$new$1(valueAnimator2);
            }
        });
        this.f18834s2 = -9223372036854775807L;
        this.f18825k2 = -9223372036854775807L;
        this.f18824j2 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public void hideScrubber(long hideAnimationDurationMs) {
        if (this.f18829n2.isStarted()) {
            this.f18829n2.cancel();
        }
        this.f18829n2.setFloatValues(this.f18830o2, 0.0f);
        this.f18829n2.setDuration(hideAnimationDurationMs);
        this.f18829n2.start();
    }

    public void showScrubber(long showAnimationDurationMs) {
        if (this.f18829n2.isStarted()) {
            this.f18829n2.cancel();
        }
        this.f18831p2 = false;
        this.f18829n2.setFloatValues(this.f18830o2, 1.0f);
        this.f18829n2.setDuration(showAnimationDurationMs);
        this.f18829n2.start();
    }
}

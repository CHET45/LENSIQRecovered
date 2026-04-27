package com.eyevue.glassapp.view.photo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p000.e0g;
import p000.gib;
import p000.jt3;
import p000.md8;
import p000.v35;
import p000.x35;
import p000.yfb;
import p000.yn8;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public final class CropOverlayView extends View {

    /* JADX INFO: renamed from: L */
    @yfb
    public static final C2826a f18746L = new C2826a(null);

    /* JADX INFO: renamed from: M */
    public static final int f18747M = 8;

    /* JADX INFO: renamed from: M1 */
    public static final float f18748M1 = 5.0f;

    /* JADX INFO: renamed from: N */
    public static final float f18749N = 2.0f;

    /* JADX INFO: renamed from: Q */
    public static final float f18750Q = 30.0f;

    /* JADX INFO: renamed from: V1 */
    public static final float f18751V1 = 20.0f;

    /* JADX INFO: renamed from: Z1 */
    public static final float f18752Z1 = 50.0f;

    /* JADX INFO: renamed from: a2 */
    public static final float f18753a2 = 80.0f;

    /* JADX INFO: renamed from: b2 */
    public static final float f18754b2 = 30.0f;

    /* JADX INFO: renamed from: C */
    @gib
    public PhotoView f18755C;

    /* JADX INFO: renamed from: F */
    @gib
    public RectF f18756F;

    /* JADX INFO: renamed from: H */
    @gib
    public InterfaceC2828c f18757H;

    /* JADX INFO: renamed from: a */
    @yfb
    public RectF f18758a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Paint f18759b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Paint f18760c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Paint f18761d;

    /* JADX INFO: renamed from: e */
    public float f18762e;

    /* JADX INFO: renamed from: f */
    public float f18763f;

    /* JADX INFO: renamed from: m */
    @yfb
    public EnumC2827b f18764m;

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.CropOverlayView$a */
    public static final class C2826a {
        public /* synthetic */ C2826a(jt3 jt3Var) {
            this();
        }

        private C2826a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.CropOverlayView$b */
    public static final class EnumC2827b {

        /* JADX INFO: renamed from: L */
        public static final /* synthetic */ EnumC2827b[] f18768L;

        /* JADX INFO: renamed from: M */
        public static final /* synthetic */ v35 f18769M;

        /* JADX INFO: renamed from: a */
        public static final EnumC2827b f18770a = new EnumC2827b("TOP_LEFT", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC2827b f18771b = new EnumC2827b("TOP_RIGHT", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC2827b f18772c = new EnumC2827b("BOTTOM_LEFT", 2);

        /* JADX INFO: renamed from: d */
        public static final EnumC2827b f18773d = new EnumC2827b("BOTTOM_RIGHT", 3);

        /* JADX INFO: renamed from: e */
        public static final EnumC2827b f18774e = new EnumC2827b("TOP", 4);

        /* JADX INFO: renamed from: f */
        public static final EnumC2827b f18775f = new EnumC2827b("BOTTOM", 5);

        /* JADX INFO: renamed from: m */
        public static final EnumC2827b f18776m = new EnumC2827b("LEFT", 6);

        /* JADX INFO: renamed from: C */
        public static final EnumC2827b f18765C = new EnumC2827b("RIGHT", 7);

        /* JADX INFO: renamed from: F */
        public static final EnumC2827b f18766F = new EnumC2827b("INSIDE", 8);

        /* JADX INFO: renamed from: H */
        public static final EnumC2827b f18767H = new EnumC2827b("NONE", 9);

        private static final /* synthetic */ EnumC2827b[] $values() {
            return new EnumC2827b[]{f18770a, f18771b, f18772c, f18773d, f18774e, f18775f, f18776m, f18765C, f18766F, f18767H};
        }

        static {
            EnumC2827b[] enumC2827bArr$values = $values();
            f18768L = enumC2827bArr$values;
            f18769M = x35.enumEntries(enumC2827bArr$values);
        }

        private EnumC2827b(String str, int i) {
        }

        @yfb
        public static v35<EnumC2827b> getEntries() {
            return f18769M;
        }

        public static EnumC2827b valueOf(String str) {
            return (EnumC2827b) Enum.valueOf(EnumC2827b.class, str);
        }

        public static EnumC2827b[] values() {
            return (EnumC2827b[]) f18768L.clone();
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.CropOverlayView$c */
    public interface InterfaceC2828c {
        void onCropChanged(@yfb RectF rectF, @gib Bitmap bitmap);
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.CropOverlayView$d */
    public /* synthetic */ class C2829d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18777a;

        static {
            int[] iArr = new int[EnumC2827b.values().length];
            try {
                iArr[EnumC2827b.f18770a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2827b.f18771b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2827b.f18772c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2827b.f18773d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC2827b.f18774e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC2827b.f18775f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC2827b.f18776m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC2827b.f18765C.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC2827b.f18766F.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f18777a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public CropOverlayView(@yfb Context context) {
        this(context, null, 0, 6, null);
        md8.checkNotNullParameter(context, "context");
    }

    private final void drawCornerSafe(Canvas canvas, float f, float f2, float f3, float f4) {
        float f5 = f3 > 0.0f ? f : f + f3;
        float f6 = f3 > 0.0f ? f + f3 : f;
        if (f5 >= 0.0f && f6 <= getWidth()) {
            canvas.drawLine(f, f2, f + f3, f2, this.f18760c);
        }
        float f7 = f4 > 0.0f ? f2 : f2 + f4;
        float f8 = f4 > 0.0f ? f2 + f4 : f2;
        if (f7 < 0.0f || f8 > getHeight()) {
            return;
        }
        canvas.drawLine(f, f2, f, f2 + f4, this.f18760c);
    }

    private final void ensureRectInsideImage() {
        RectF rectF = this.f18756F;
        if (rectF == null) {
            return;
        }
        RectF rectF2 = this.f18758a;
        float f = rectF2.left;
        float f2 = rectF.left;
        if (f < f2) {
            rectF2.left = f2;
        }
        float f3 = rectF2.top;
        float f4 = rectF.top;
        if (f3 < f4) {
            rectF2.top = f4;
        }
        float f5 = rectF2.right;
        float f6 = rectF.right;
        if (f5 > f6) {
            rectF2.right = f6;
        }
        float f7 = rectF2.bottom;
        float f8 = rectF.bottom;
        if (f7 > f8) {
            rectF2.bottom = f8;
        }
        if (rectF2.left < 0.0f) {
            rectF2.left = 0.0f;
        }
        if (rectF2.top < 0.0f) {
            rectF2.top = 0.0f;
        }
        if (rectF2.right > getWidth()) {
            this.f18758a.right = getWidth();
        }
        if (this.f18758a.bottom > getHeight()) {
            this.f18758a.bottom = getHeight();
        }
        if (this.f18758a.width() < 80.0f) {
            float fCenterX = this.f18758a.centerX();
            this.f18758a.left = Math.max(0.0f, fCenterX - 40.0f);
            this.f18758a.right = Math.min(getWidth(), fCenterX + 40.0f);
        }
        if (this.f18758a.height() < 80.0f) {
            float fCenterY = this.f18758a.centerY();
            this.f18758a.top = Math.max(0.0f, fCenterY - 40.0f);
            this.f18758a.bottom = Math.min(getHeight(), fCenterY + 40.0f);
        }
    }

    private final EnumC2827b getPressedHandle(float f, float f2) {
        RectF rectF = this.f18758a;
        if (isInExtendedCorner(f, f2, rectF.left, rectF.top)) {
            return EnumC2827b.f18770a;
        }
        RectF rectF2 = this.f18758a;
        if (isInExtendedCorner(f, f2, rectF2.right, rectF2.top)) {
            return EnumC2827b.f18771b;
        }
        RectF rectF3 = this.f18758a;
        if (isInExtendedCorner(f, f2, rectF3.left, rectF3.bottom)) {
            return EnumC2827b.f18772c;
        }
        RectF rectF4 = this.f18758a;
        return isInExtendedCorner(f, f2, rectF4.right, rectF4.bottom) ? EnumC2827b.f18773d : isOnTopEdge(f, f2) ? EnumC2827b.f18774e : isOnBottomEdge(f, f2) ? EnumC2827b.f18775f : isOnLeftEdge(f, f2) ? EnumC2827b.f18776m : isOnRightEdge(f, f2) ? EnumC2827b.f18765C : this.f18758a.contains(f, f2) ? EnumC2827b.f18766F : EnumC2827b.f18767H;
    }

    private final void handleMove(float f, float f2) {
        float f3 = f - this.f18762e;
        float f4 = f2 - this.f18763f;
        switch (C2829d.f18777a[this.f18764m.ordinal()]) {
            case 1:
                resizeRect(f3, f4, 0.0f, 0.0f);
                break;
            case 2:
                resizeRect(0.0f, f4, f3, 0.0f);
                break;
            case 3:
                resizeRect(f3, 0.0f, 0.0f, f4);
                break;
            case 4:
                resizeRect(0.0f, 0.0f, f3, f4);
                break;
            case 5:
                resizeRect(0.0f, f4, 0.0f, 0.0f);
                break;
            case 6:
                resizeRect(0.0f, 0.0f, 0.0f, f4);
                break;
            case 7:
                resizeRect(f3, 0.0f, 0.0f, 0.0f);
                break;
            case 8:
                resizeRect(0.0f, 0.0f, f3, 0.0f);
                break;
            case 9:
                moveRect(f3, f4);
                break;
        }
    }

    private final boolean isInExtendedCorner(float f, float f2, float f3, float f4) {
        return new RectF(f3 - 50.0f, f4 - 50.0f, f3 + 50.0f, f4 + 50.0f).contains(f, f2);
    }

    private final boolean isOnBottomEdge(float f, float f2) {
        RectF rectF = this.f18758a;
        if (f >= rectF.left && f <= rectF.right) {
            float f3 = rectF.bottom;
            if (f2 >= f3 - 30.0f && f2 <= f3 + 30.0f) {
                return true;
            }
        }
        return false;
    }

    private final boolean isOnLeftEdge(float f, float f2) {
        RectF rectF = this.f18758a;
        if (f2 >= rectF.top && f2 <= rectF.bottom) {
            float f3 = rectF.left;
            if (f >= f3 - 30.0f && f <= f3 + 30.0f) {
                return true;
            }
        }
        return false;
    }

    private final boolean isOnRightEdge(float f, float f2) {
        RectF rectF = this.f18758a;
        if (f2 >= rectF.top && f2 <= rectF.bottom) {
            float f3 = rectF.right;
            if (f >= f3 - 30.0f && f <= f3 + 30.0f) {
                return true;
            }
        }
        return false;
    }

    private final boolean isOnTopEdge(float f, float f2) {
        RectF rectF = this.f18758a;
        if (f >= rectF.left && f <= rectF.right) {
            float f3 = rectF.top;
            if (f2 >= f3 - 30.0f && f2 <= f3 + 30.0f) {
                return true;
            }
        }
        return false;
    }

    private final void moveRect(float f, float f2) {
        RectF rectF = this.f18758a;
        float width = rectF.left + f;
        float height = rectF.top + f2;
        float width2 = rectF.right + f;
        float height2 = rectF.bottom + f2;
        RectF rectF2 = this.f18756F;
        if (rectF2 == null) {
            return;
        }
        float f3 = rectF2.left;
        if (width < f3) {
            width2 += f3 - width;
            width = f3;
        }
        float f4 = rectF2.top;
        if (height < f4) {
            height2 += f4 - height;
            height = f4;
        }
        float f5 = rectF2.right;
        if (width2 > f5) {
            width -= width2 - f5;
            width2 = f5;
        }
        float f6 = rectF2.bottom;
        if (height2 > f6) {
            height -= height2 - f6;
            height2 = f6;
        }
        if (width < 0.0f) {
            width2 += -width;
            width = 0.0f;
        }
        if (height < 0.0f) {
            height2 += -height;
            height = 0.0f;
        }
        if (width2 > getWidth()) {
            width -= width2 - getWidth();
            width2 = getWidth();
        }
        if (height2 > getHeight()) {
            height -= height2 - getHeight();
            height2 = getHeight();
        }
        this.f18758a.set(width, height, width2, height2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void resizeRect(float r5, float r6, float r7, float r8) {
        /*
            r4 = this;
            android.graphics.RectF r0 = r4.f18758a
            float r1 = r0.left
            float r1 = r1 + r5
            float r5 = r0.top
            float r5 = r5 + r6
            float r6 = r0.right
            float r6 = r6 + r7
            float r7 = r0.bottom
            float r7 = r7 + r8
            float r8 = r6 - r1
            r0 = 1117782016(0x42a00000, float:80.0)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L3d
            com.eyevue.glassapp.view.photo.CropOverlayView$b r8 = r4.f18764m
            int[] r2 = com.eyevue.glassapp.view.photo.CropOverlayView.C2829d.f18777a
            int r8 = r8.ordinal()
            r8 = r2[r8]
            r2 = 1
            if (r8 == r2) goto L39
            r2 = 2
            if (r8 == r2) goto L34
            r2 = 3
            if (r8 == r2) goto L39
            r2 = 4
            if (r8 == r2) goto L34
            r2 = 7
            if (r8 == r2) goto L39
            r2 = 8
            if (r8 == r2) goto L34
            goto L3d
        L34:
            android.graphics.RectF r6 = r4.f18758a
            float r6 = r6.right
            goto L3d
        L39:
            android.graphics.RectF r8 = r4.f18758a
            float r1 = r8.left
        L3d:
            float r8 = r7 - r5
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L5a
            com.eyevue.glassapp.view.photo.CropOverlayView$b r8 = r4.f18764m
            int[] r2 = com.eyevue.glassapp.view.photo.CropOverlayView.C2829d.f18777a
            int r8 = r8.ordinal()
            r8 = r2[r8]
            switch(r8) {
                case 1: goto L56;
                case 2: goto L56;
                case 3: goto L51;
                case 4: goto L51;
                case 5: goto L56;
                case 6: goto L51;
                default: goto L50;
            }
        L50:
            goto L5a
        L51:
            android.graphics.RectF r7 = r4.f18758a
            float r7 = r7.bottom
            goto L5a
        L56:
            android.graphics.RectF r5 = r4.f18758a
            float r5 = r5.top
        L5a:
            android.graphics.RectF r8 = r4.f18756F
            if (r8 != 0) goto L5f
            return
        L5f:
            float r2 = r8.left
            android.graphics.RectF r3 = r4.f18758a
            float r3 = r3.right
            float r3 = r3 - r0
            float r1 = p000.kpd.coerceIn(r1, r2, r3)
            float r2 = r8.top
            android.graphics.RectF r3 = r4.f18758a
            float r3 = r3.bottom
            float r3 = r3 - r0
            float r5 = p000.kpd.coerceIn(r5, r2, r3)
            android.graphics.RectF r2 = r4.f18758a
            float r2 = r2.left
            float r2 = r2 + r0
            float r3 = r8.right
            float r6 = p000.kpd.coerceIn(r6, r2, r3)
            android.graphics.RectF r2 = r4.f18758a
            float r2 = r2.top
            float r2 = r2 + r0
            float r8 = r8.bottom
            float r7 = p000.kpd.coerceIn(r7, r2, r8)
            r8 = 0
            float r0 = p000.kpd.coerceAtLeast(r1, r8)
            float r5 = p000.kpd.coerceAtLeast(r5, r8)
            int r8 = r4.getWidth()
            float r8 = (float) r8
            float r6 = p000.kpd.coerceAtMost(r6, r8)
            int r8 = r4.getHeight()
            float r8 = (float) r8
            float r7 = p000.kpd.coerceAtMost(r7, r8)
            android.graphics.RectF r8 = r4.f18758a
            r8.set(r0, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.glassapp.view.photo.CropOverlayView.resizeRect(float, float, float, float):void");
    }

    private final void updateCropRectToImageBounds() {
        RectF displayRect;
        PhotoView photoView = this.f18755C;
        if (photoView == null || (displayRect = photoView.getDisplayRect()) == null) {
            return;
        }
        this.f18756F = new RectF(displayRect);
        this.f18758a.set(displayRect);
        ensureRectInsideImage();
        invalidate();
    }

    @yfb
    public final RectF getCropRect() {
        return new RectF(this.f18758a);
    }

    @gib
    public final Bitmap getCroppedBitmap() {
        RectF displayRect;
        PhotoView photoView = this.f18755C;
        if (photoView == null || this.f18758a.isEmpty()) {
            return null;
        }
        try {
            Drawable drawable = photoView.getDrawable();
            if (drawable == null || (displayRect = photoView.getDisplayRect()) == null) {
                return null;
            }
            float intrinsicWidth = drawable.getIntrinsicWidth() / displayRect.width();
            float intrinsicHeight = drawable.getIntrinsicHeight() / displayRect.height();
            RectF rectF = this.f18758a;
            int i = (int) ((rectF.left - displayRect.left) * intrinsicWidth);
            int i2 = (int) ((rectF.top - displayRect.top) * intrinsicHeight);
            int iWidth = (int) (rectF.width() * intrinsicWidth);
            int iHeight = (int) (this.f18758a.height() * intrinsicHeight);
            int iMax = Math.max(0, i);
            int iMax2 = Math.max(0, i2);
            int iMin = Math.min(drawable.getIntrinsicWidth() - iMax, iWidth);
            int iMin2 = Math.min(drawable.getIntrinsicHeight() - iMax2, iHeight);
            if (iMin > 0 && iMin2 > 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                md8.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return Bitmap.createBitmap(bitmapCreateBitmap, iMax, iMax2, iMin, iMin2);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.view.View
    public void onDraw(@yfb Canvas canvas) {
        md8.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f18758a.isEmpty()) {
            return;
        }
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRect(this.f18758a, this.f18759b);
        RectF rectF = this.f18758a;
        drawCornerSafe(canvas, rectF.left, rectF.top, 30.0f, 30.0f);
        RectF rectF2 = this.f18758a;
        drawCornerSafe(canvas, rectF2.right, rectF2.top, -30.0f, 30.0f);
        RectF rectF3 = this.f18758a;
        drawCornerSafe(canvas, rectF3.left, rectF3.bottom, 30.0f, -30.0f);
        RectF rectF4 = this.f18758a;
        drawCornerSafe(canvas, rectF4.right, rectF4.bottom, -30.0f, -30.0f);
        RectF rectF5 = this.f18758a;
        float f = 2;
        float fWidth = rectF5.left + (rectF5.width() / f);
        RectF rectF6 = this.f18758a;
        float fHeight = rectF6.top + (rectF6.height() / f);
        float f2 = fWidth - 20.0f;
        float fMax = Math.max(this.f18758a.left, f2);
        float f3 = fWidth + 20.0f;
        float fMin = Math.min(this.f18758a.right, f3);
        if (fMax < fMin) {
            float f4 = this.f18758a.top;
            canvas.drawLine(fMax, f4, fMin, f4, this.f18761d);
        }
        float fMax2 = Math.max(this.f18758a.left, f2);
        float fMin2 = Math.min(this.f18758a.right, f3);
        if (fMax2 < fMin2) {
            float f5 = this.f18758a.bottom;
            canvas.drawLine(fMax2, f5, fMin2, f5, this.f18761d);
        }
        float f6 = fHeight - 20.0f;
        float fMax3 = Math.max(this.f18758a.top, f6);
        float f7 = fHeight + 20.0f;
        float fMin3 = Math.min(this.f18758a.bottom, f7);
        if (fMax3 < fMin3) {
            float f8 = this.f18758a.left;
            canvas.drawLine(f8, fMax3, f8, fMin3, this.f18761d);
        }
        float fMax4 = Math.max(this.f18758a.top, f6);
        float fMin4 = Math.min(this.f18758a.bottom, f7);
        if (fMax4 < fMin4) {
            float f9 = this.f18758a.right;
            canvas.drawLine(f9, fMax4, f9, fMin4, this.f18761d);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateCropRectToImageBounds();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@yfb MotionEvent motionEvent) {
        md8.checkNotNullParameter(motionEvent, "event");
        if (this.f18755C != null && this.f18756F != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.f18764m == EnumC2827b.f18767H) {
                            return false;
                        }
                        handleMove(x, y);
                        this.f18762e = x;
                        this.f18763f = y;
                        invalidate();
                        return true;
                    }
                    if (action != 3) {
                        return false;
                    }
                }
                EnumC2827b enumC2827b = this.f18764m;
                EnumC2827b enumC2827b2 = EnumC2827b.f18767H;
                if (enumC2827b == enumC2827b2) {
                    return false;
                }
                InterfaceC2828c interfaceC2828c = this.f18757H;
                if (interfaceC2828c != null) {
                    interfaceC2828c.onCropChanged(new RectF(this.f18758a), getCroppedBitmap());
                }
                this.f18764m = enumC2827b2;
                getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
            EnumC2827b pressedHandle = getPressedHandle(x, y);
            this.f18764m = pressedHandle;
            if (pressedHandle != EnumC2827b.f18767H) {
                this.f18762e = x;
                this.f18763f = y;
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        }
        return false;
    }

    public final void restoreCropRectToFullSize(@yfb PhotoView photoView) {
        md8.checkNotNullParameter(photoView, "photoView");
        RectF displayRect = photoView.getDisplayRect();
        if (displayRect == null) {
            return;
        }
        this.f18756F = new RectF(displayRect);
        this.f18758a.set(displayRect);
        ensureRectInsideImage();
        invalidate();
    }

    public final void setCropRect(@yfb RectF rectF) {
        md8.checkNotNullParameter(rectF, "rect");
        this.f18758a.set(rectF);
        ensureRectInsideImage();
        invalidate();
        InterfaceC2828c interfaceC2828c = this.f18757H;
        if (interfaceC2828c != null) {
            interfaceC2828c.onCropChanged(new RectF(this.f18758a), getCroppedBitmap());
        }
    }

    public final void setOnCropChangeListener(@yfb InterfaceC2828c interfaceC2828c) {
        md8.checkNotNullParameter(interfaceC2828c, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f18757H = interfaceC2828c;
    }

    public final void setPhotoView(@yfb PhotoView photoView) {
        md8.checkNotNullParameter(photoView, "photoView");
        if (this.f18755C == null) {
            this.f18755C = photoView;
            updateCropRectToImageBounds();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public CropOverlayView(@yfb Context context, @gib AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        md8.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CropOverlayView(Context context, AttributeSet attributeSet, int i, int i2, jt3 jt3Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public CropOverlayView(@yfb Context context, @gib AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        md8.checkNotNullParameter(context, "context");
        this.f18758a = new RectF();
        Paint paint = new Paint();
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(2.0f);
        paint.setAntiAlias(true);
        this.f18759b = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(5.0f);
        paint2.setAntiAlias(true);
        this.f18760c = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(5.0f);
        paint3.setAntiAlias(true);
        this.f18761d = paint3;
        this.f18764m = EnumC2827b.f18767H;
    }
}

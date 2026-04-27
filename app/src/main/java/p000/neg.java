package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class neg {

    /* JADX INFO: renamed from: K */
    public static final String f64179K = "SubtitlePainter";

    /* JADX INFO: renamed from: L */
    public static final float f64180L = 0.125f;

    /* JADX INFO: renamed from: A */
    public int f64181A;

    /* JADX INFO: renamed from: B */
    public int f64182B;

    /* JADX INFO: renamed from: C */
    public int f64183C;

    /* JADX INFO: renamed from: D */
    public int f64184D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f64185E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f64186F;

    /* JADX INFO: renamed from: G */
    public int f64187G;

    /* JADX INFO: renamed from: H */
    public int f64188H;

    /* JADX INFO: renamed from: I */
    public int f64189I;

    /* JADX INFO: renamed from: J */
    public Rect f64190J;

    /* JADX INFO: renamed from: a */
    public final float f64191a;

    /* JADX INFO: renamed from: b */
    public final float f64192b;

    /* JADX INFO: renamed from: c */
    public final float f64193c;

    /* JADX INFO: renamed from: d */
    public final float f64194d;

    /* JADX INFO: renamed from: e */
    public final float f64195e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f64196f;

    /* JADX INFO: renamed from: g */
    public final Paint f64197g;

    /* JADX INFO: renamed from: h */
    public final Paint f64198h;

    /* JADX INFO: renamed from: i */
    @hib
    public CharSequence f64199i;

    /* JADX INFO: renamed from: j */
    @hib
    public Layout.Alignment f64200j;

    /* JADX INFO: renamed from: k */
    @hib
    public Bitmap f64201k;

    /* JADX INFO: renamed from: l */
    public float f64202l;

    /* JADX INFO: renamed from: m */
    public int f64203m;

    /* JADX INFO: renamed from: n */
    public int f64204n;

    /* JADX INFO: renamed from: o */
    public float f64205o;

    /* JADX INFO: renamed from: p */
    public int f64206p;

    /* JADX INFO: renamed from: q */
    public float f64207q;

    /* JADX INFO: renamed from: r */
    public float f64208r;

    /* JADX INFO: renamed from: s */
    public int f64209s;

    /* JADX INFO: renamed from: t */
    public int f64210t;

    /* JADX INFO: renamed from: u */
    public int f64211u;

    /* JADX INFO: renamed from: v */
    public int f64212v;

    /* JADX INFO: renamed from: w */
    public int f64213w;

    /* JADX INFO: renamed from: x */
    public float f64214x;

    /* JADX INFO: renamed from: y */
    public float f64215y;

    /* JADX INFO: renamed from: z */
    public float f64216z;

    public neg(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f64195e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f64194d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f64191a = fRound;
        this.f64192b = fRound;
        this.f64193c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f64196f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f64197g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f64198h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean areCharSequencesEqual(@hib CharSequence charSequence, @hib CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    @g5e({"cueBitmap", "bitmapRect"})
    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.f64201k, (Rect) null, this.f64190J, this.f64198h);
    }

    private void drawLayout(Canvas canvas, boolean z) {
        if (z) {
            drawTextLayout(canvas);
            return;
        }
        v80.checkNotNull(this.f64190J);
        v80.checkNotNull(this.f64201k);
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(Canvas canvas) {
        StaticLayout staticLayout = this.f64185E;
        StaticLayout staticLayout2 = this.f64186F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f64187G, this.f64188H);
        if (Color.alpha(this.f64211u) > 0) {
            this.f64197g.setColor(this.f64211u);
            canvas.drawRect(-this.f64189I, 0.0f, staticLayout.getWidth() + this.f64189I, staticLayout.getHeight(), this.f64197g);
        }
        int i = this.f64213w;
        if (i == 1) {
            this.f64196f.setStrokeJoin(Paint.Join.ROUND);
            this.f64196f.setStrokeWidth(this.f64191a);
            this.f64196f.setColor(this.f64212v);
            this.f64196f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.f64196f;
            float f = this.f64192b;
            float f2 = this.f64193c;
            textPaint.setShadowLayer(f, f2, f2, this.f64212v);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.f64212v;
            int i3 = z ? this.f64212v : -1;
            float f3 = this.f64192b / 2.0f;
            this.f64196f.setColor(this.f64209s);
            this.f64196f.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.f64196f.setShadowLayer(this.f64192b, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.f64196f.setShadowLayer(this.f64192b, f3, f3, i3);
        }
        this.f64196f.setColor(this.f64209s);
        this.f64196f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f64196f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    @p000.g5e({"cueBitmap"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setupBitmapLayout() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f64201k
            int r1 = r7.f64183C
            int r2 = r7.f64181A
            int r1 = r1 - r2
            int r3 = r7.f64184D
            int r4 = r7.f64182B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f64205o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f64202l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f64207q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f64208r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f64206p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f64204n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f64190J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.neg.setupBitmapLayout():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a3  */
    @p000.g5e({"cueText"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setupTextLayout() {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.neg.setupTextLayout():void");
    }

    public void draw(n93 n93Var, yr1 yr1Var, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = n93Var.f63706d == null;
        if (!z) {
            i5 = -16777216;
        } else if (TextUtils.isEmpty(n93Var.f63703a)) {
            return;
        } else {
            i5 = n93Var.f63714l ? n93Var.f63715m : yr1Var.f102732c;
        }
        if (areCharSequencesEqual(this.f64199i, n93Var.f63703a) && Objects.equals(this.f64200j, n93Var.f63704b) && this.f64201k == n93Var.f63706d && this.f64202l == n93Var.f63707e && this.f64203m == n93Var.f63708f && Integer.valueOf(this.f64204n).equals(Integer.valueOf(n93Var.f63709g)) && this.f64205o == n93Var.f63710h && Integer.valueOf(this.f64206p).equals(Integer.valueOf(n93Var.f63711i)) && this.f64207q == n93Var.f63712j && this.f64208r == n93Var.f63713k && this.f64209s == yr1Var.f102730a && this.f64210t == yr1Var.f102731b && this.f64211u == i5 && this.f64213w == yr1Var.f102733d && this.f64212v == yr1Var.f102734e && Objects.equals(this.f64196f.getTypeface(), yr1Var.f102735f) && this.f64214x == f && this.f64215y == f2 && this.f64216z == f3 && this.f64181A == i && this.f64182B == i2 && this.f64183C == i3 && this.f64184D == i4) {
            drawLayout(canvas, z);
            return;
        }
        this.f64199i = n93Var.f63703a;
        this.f64200j = n93Var.f63704b;
        this.f64201k = n93Var.f63706d;
        this.f64202l = n93Var.f63707e;
        this.f64203m = n93Var.f63708f;
        this.f64204n = n93Var.f63709g;
        this.f64205o = n93Var.f63710h;
        this.f64206p = n93Var.f63711i;
        this.f64207q = n93Var.f63712j;
        this.f64208r = n93Var.f63713k;
        this.f64209s = yr1Var.f102730a;
        this.f64210t = yr1Var.f102731b;
        this.f64211u = i5;
        this.f64213w = yr1Var.f102733d;
        this.f64212v = yr1Var.f102734e;
        this.f64196f.setTypeface(yr1Var.f102735f);
        this.f64214x = f;
        this.f64215y = f2;
        this.f64216z = f3;
        this.f64181A = i;
        this.f64182B = i2;
        this.f64183C = i3;
        this.f64184D = i4;
        if (z) {
            v80.checkNotNull(this.f64199i);
            setupTextLayout();
        } else {
            v80.checkNotNull(this.f64201k);
            setupBitmapLayout();
        }
        drawLayout(canvas, z);
    }
}

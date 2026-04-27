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

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class meg {

    /* JADX INFO: renamed from: K */
    public static final String f60783K = "SubtitlePainter";

    /* JADX INFO: renamed from: L */
    public static final float f60784L = 0.125f;

    /* JADX INFO: renamed from: A */
    public int f60785A;

    /* JADX INFO: renamed from: B */
    public int f60786B;

    /* JADX INFO: renamed from: C */
    public int f60787C;

    /* JADX INFO: renamed from: D */
    public int f60788D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f60789E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f60790F;

    /* JADX INFO: renamed from: G */
    public int f60791G;

    /* JADX INFO: renamed from: H */
    public int f60792H;

    /* JADX INFO: renamed from: I */
    public int f60793I;

    /* JADX INFO: renamed from: J */
    public Rect f60794J;

    /* JADX INFO: renamed from: a */
    public final float f60795a;

    /* JADX INFO: renamed from: b */
    public final float f60796b;

    /* JADX INFO: renamed from: c */
    public final float f60797c;

    /* JADX INFO: renamed from: d */
    public final float f60798d;

    /* JADX INFO: renamed from: e */
    public final float f60799e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f60800f;

    /* JADX INFO: renamed from: g */
    public final Paint f60801g;

    /* JADX INFO: renamed from: h */
    public final Paint f60802h;

    /* JADX INFO: renamed from: i */
    @hib
    public CharSequence f60803i;

    /* JADX INFO: renamed from: j */
    @hib
    public Layout.Alignment f60804j;

    /* JADX INFO: renamed from: k */
    @hib
    public Bitmap f60805k;

    /* JADX INFO: renamed from: l */
    public float f60806l;

    /* JADX INFO: renamed from: m */
    public int f60807m;

    /* JADX INFO: renamed from: n */
    public int f60808n;

    /* JADX INFO: renamed from: o */
    public float f60809o;

    /* JADX INFO: renamed from: p */
    public int f60810p;

    /* JADX INFO: renamed from: q */
    public float f60811q;

    /* JADX INFO: renamed from: r */
    public float f60812r;

    /* JADX INFO: renamed from: s */
    public int f60813s;

    /* JADX INFO: renamed from: t */
    public int f60814t;

    /* JADX INFO: renamed from: u */
    public int f60815u;

    /* JADX INFO: renamed from: v */
    public int f60816v;

    /* JADX INFO: renamed from: w */
    public int f60817w;

    /* JADX INFO: renamed from: x */
    public float f60818x;

    /* JADX INFO: renamed from: y */
    public float f60819y;

    /* JADX INFO: renamed from: z */
    public float f60820z;

    public meg(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f60799e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f60798d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f60795a = fRound;
        this.f60796b = fRound;
        this.f60797c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f60800f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f60801g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f60802h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean areCharSequencesEqual(@hib CharSequence charSequence, @hib CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    @g5e({"cueBitmap", "bitmapRect"})
    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.f60805k, (Rect) null, this.f60794J, this.f60802h);
    }

    private void drawLayout(Canvas canvas, boolean z) {
        if (z) {
            drawTextLayout(canvas);
            return;
        }
        u80.checkNotNull(this.f60794J);
        u80.checkNotNull(this.f60805k);
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(Canvas canvas) {
        StaticLayout staticLayout = this.f60789E;
        StaticLayout staticLayout2 = this.f60790F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f60791G, this.f60792H);
        if (Color.alpha(this.f60815u) > 0) {
            this.f60801g.setColor(this.f60815u);
            canvas.drawRect(-this.f60793I, 0.0f, staticLayout.getWidth() + this.f60793I, staticLayout.getHeight(), this.f60801g);
        }
        int i = this.f60817w;
        if (i == 1) {
            this.f60800f.setStrokeJoin(Paint.Join.ROUND);
            this.f60800f.setStrokeWidth(this.f60795a);
            this.f60800f.setColor(this.f60816v);
            this.f60800f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.f60800f;
            float f = this.f60796b;
            float f2 = this.f60797c;
            textPaint.setShadowLayer(f, f2, f2, this.f60816v);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.f60816v;
            int i3 = z ? this.f60816v : -1;
            float f3 = this.f60796b / 2.0f;
            this.f60800f.setColor(this.f60813s);
            this.f60800f.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.f60800f.setShadowLayer(this.f60796b, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.f60800f.setShadowLayer(this.f60796b, f3, f3, i3);
        }
        this.f60800f.setColor(this.f60813s);
        this.f60800f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f60800f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
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
            android.graphics.Bitmap r0 = r7.f60805k
            int r1 = r7.f60787C
            int r2 = r7.f60785A
            int r1 = r1 - r2
            int r3 = r7.f60788D
            int r4 = r7.f60786B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f60809o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f60806l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f60811q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f60812r
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
            int r3 = r7.f60810p
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
            int r3 = r7.f60808n
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
            r7.f60794J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.meg.setupBitmapLayout():void");
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
        throw new UnsupportedOperationException("Method not decompiled: p000.meg.setupTextLayout():void");
    }

    public void draw(o93 o93Var, zr1 zr1Var, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = o93Var.f66877d == null;
        if (!z) {
            i5 = -16777216;
        } else if (TextUtils.isEmpty(o93Var.f66874a)) {
            return;
        } else {
            i5 = o93Var.f66868M ? o93Var.f66869N : zr1Var.f105793c;
        }
        if (areCharSequencesEqual(this.f60803i, o93Var.f66874a) && x0i.areEqual(this.f60804j, o93Var.f66875b) && this.f60805k == o93Var.f66877d && this.f60806l == o93Var.f66878e && this.f60807m == o93Var.f66879f && x0i.areEqual(Integer.valueOf(this.f60808n), Integer.valueOf(o93Var.f66880m)) && this.f60809o == o93Var.f66864C && x0i.areEqual(Integer.valueOf(this.f60810p), Integer.valueOf(o93Var.f66865F)) && this.f60811q == o93Var.f66866H && this.f60812r == o93Var.f66867L && this.f60813s == zr1Var.f105791a && this.f60814t == zr1Var.f105792b && this.f60815u == i5 && this.f60817w == zr1Var.f105794d && this.f60816v == zr1Var.f105795e && x0i.areEqual(this.f60800f.getTypeface(), zr1Var.f105796f) && this.f60818x == f && this.f60819y == f2 && this.f60820z == f3 && this.f60785A == i && this.f60786B == i2 && this.f60787C == i3 && this.f60788D == i4) {
            drawLayout(canvas, z);
            return;
        }
        this.f60803i = o93Var.f66874a;
        this.f60804j = o93Var.f66875b;
        this.f60805k = o93Var.f66877d;
        this.f60806l = o93Var.f66878e;
        this.f60807m = o93Var.f66879f;
        this.f60808n = o93Var.f66880m;
        this.f60809o = o93Var.f66864C;
        this.f60810p = o93Var.f66865F;
        this.f60811q = o93Var.f66866H;
        this.f60812r = o93Var.f66867L;
        this.f60813s = zr1Var.f105791a;
        this.f60814t = zr1Var.f105792b;
        this.f60815u = i5;
        this.f60817w = zr1Var.f105794d;
        this.f60816v = zr1Var.f105795e;
        this.f60800f.setTypeface(zr1Var.f105796f);
        this.f60818x = f;
        this.f60819y = f2;
        this.f60820z = f3;
        this.f60785A = i;
        this.f60786B = i2;
        this.f60787C = i3;
        this.f60788D = i4;
        if (z) {
            u80.checkNotNull(this.f60803i);
            setupTextLayout();
        } else {
            u80.checkNotNull(this.f60805k);
            setupBitmapLayout();
        }
        drawLayout(canvas, z);
    }
}

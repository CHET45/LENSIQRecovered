package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.vh4;

/* JADX INFO: loaded from: classes3.dex */
public class bug extends pr0 {

    /* JADX INFO: renamed from: H */
    public final StringBuilder f14819H;

    /* JADX INFO: renamed from: I */
    public final RectF f14820I;

    /* JADX INFO: renamed from: J */
    public final Matrix f14821J;

    /* JADX INFO: renamed from: K */
    public final Paint f14822K;

    /* JADX INFO: renamed from: L */
    public final Paint f14823L;

    /* JADX INFO: renamed from: M */
    public final Map<bo6, List<pv2>> f14824M;

    /* JADX INFO: renamed from: N */
    public final zl9<String> f14825N;

    /* JADX INFO: renamed from: O */
    public final aug f14826O;

    /* JADX INFO: renamed from: P */
    public final go9 f14827P;

    /* JADX INFO: renamed from: Q */
    public final bn9 f14828Q;

    /* JADX INFO: renamed from: R */
    @hib
    public nr0<Integer, Integer> f14829R;

    /* JADX INFO: renamed from: S */
    @hib
    public nr0<Integer, Integer> f14830S;

    /* JADX INFO: renamed from: T */
    @hib
    public nr0<Integer, Integer> f14831T;

    /* JADX INFO: renamed from: U */
    @hib
    public nr0<Integer, Integer> f14832U;

    /* JADX INFO: renamed from: V */
    @hib
    public nr0<Float, Float> f14833V;

    /* JADX INFO: renamed from: W */
    @hib
    public nr0<Float, Float> f14834W;

    /* JADX INFO: renamed from: X */
    @hib
    public nr0<Float, Float> f14835X;

    /* JADX INFO: renamed from: Y */
    @hib
    public nr0<Float, Float> f14836Y;

    /* JADX INFO: renamed from: Z */
    @hib
    public nr0<Float, Float> f14837Z;

    /* JADX INFO: renamed from: a0 */
    @hib
    public nr0<Typeface, Typeface> f14838a0;

    /* JADX INFO: renamed from: bug$a */
    public class C2059a extends Paint {
        public C2059a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: renamed from: bug$b */
    public class C2060b extends Paint {
        public C2060b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: renamed from: bug$c */
    public static /* synthetic */ class C2061c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14841a;

        static {
            int[] iArr = new int[vh4.EnumC14073a.values().length];
            f14841a = iArr;
            try {
                iArr[vh4.EnumC14073a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14841a[vh4.EnumC14073a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14841a[vh4.EnumC14073a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public bug(go9 go9Var, tu8 tu8Var) {
        C15326xw c15326xw;
        C15326xw c15326xw2;
        C14811ww c14811ww;
        C14811ww c14811ww2;
        super(go9Var, tu8Var);
        this.f14819H = new StringBuilder(2);
        this.f14820I = new RectF();
        this.f14821J = new Matrix();
        this.f14822K = new C2059a(1);
        this.f14823L = new C2060b(1);
        this.f14824M = new HashMap();
        this.f14825N = new zl9<>();
        this.f14827P = go9Var;
        this.f14828Q = tu8Var.m22852a();
        aug augVarCreateAnimation = tu8Var.m22866o().createAnimation();
        this.f14826O = augVarCreateAnimation;
        augVarCreateAnimation.addUpdateListener(this);
        addAnimation(augVarCreateAnimation);
        C7646ix c7646ixM22867p = tu8Var.m22867p();
        if (c7646ixM22867p != null && (c14811ww2 = c7646ixM22867p.f48731a) != null) {
            nr0<Integer, Integer> nr0VarCreateAnimation = c14811ww2.createAnimation();
            this.f14829R = nr0VarCreateAnimation;
            nr0VarCreateAnimation.addUpdateListener(this);
            addAnimation(this.f14829R);
        }
        if (c7646ixM22867p != null && (c14811ww = c7646ixM22867p.f48732b) != null) {
            nr0<Integer, Integer> nr0VarCreateAnimation2 = c14811ww.createAnimation();
            this.f14831T = nr0VarCreateAnimation2;
            nr0VarCreateAnimation2.addUpdateListener(this);
            addAnimation(this.f14831T);
        }
        if (c7646ixM22867p != null && (c15326xw2 = c7646ixM22867p.f48733c) != null) {
            nr0<Float, Float> nr0VarCreateAnimation3 = c15326xw2.createAnimation();
            this.f14833V = nr0VarCreateAnimation3;
            nr0VarCreateAnimation3.addUpdateListener(this);
            addAnimation(this.f14833V);
        }
        if (c7646ixM22867p == null || (c15326xw = c7646ixM22867p.f48734d) == null) {
            return;
        }
        nr0<Float, Float> nr0VarCreateAnimation4 = c15326xw.createAnimation();
        this.f14835X = nr0VarCreateAnimation4;
        nr0VarCreateAnimation4.addUpdateListener(this);
        addAnimation(this.f14835X);
    }

    private void applyJustification(vh4.EnumC14073a enumC14073a, Canvas canvas, float f) {
        int i = C2061c.f14841a[enumC14073a.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else {
            if (i != 3) {
                return;
            }
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    private String codePointToString(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!isModifier(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.f14825N.containsKey(j)) {
            return this.f14825N.get(j);
        }
        this.f14819H.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.f14819H.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.f14819H.toString();
        this.f14825N.put(j, string);
        return string;
    }

    private void drawCharacter(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void drawCharacterAsGlyph(bo6 bo6Var, Matrix matrix, float f, vh4 vh4Var, Canvas canvas) {
        List<pv2> contentsForCharacter = getContentsForCharacter(bo6Var);
        for (int i = 0; i < contentsForCharacter.size(); i++) {
            Path path = contentsForCharacter.get(i).getPath();
            path.computeBounds(this.f14820I, false);
            this.f14821J.set(matrix);
            this.f14821J.preTranslate(0.0f, (-vh4Var.f91183g) * e1i.dpScale());
            this.f14821J.preScale(f, f);
            path.transform(this.f14821J);
            if (vh4Var.f91187k) {
                drawGlyph(path, this.f14822K, canvas);
                drawGlyph(path, this.f14823L, canvas);
            } else {
                drawGlyph(path, this.f14823L, canvas);
                drawGlyph(path, this.f14822K, canvas);
            }
        }
    }

    private void drawCharacterFromFont(String str, vh4 vh4Var, Canvas canvas) {
        if (vh4Var.f91187k) {
            drawCharacter(str, this.f14822K, canvas);
            drawCharacter(str, this.f14823L, canvas);
        } else {
            drawCharacter(str, this.f14823L, canvas);
            drawCharacter(str, this.f14822K, canvas);
        }
    }

    private void drawFontTextLine(String str, vh4 vh4Var, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strCodePointToString = codePointToString(str, length);
            length += strCodePointToString.length();
            drawCharacterFromFont(strCodePointToString, vh4Var, canvas);
            canvas.translate(this.f14822K.measureText(strCodePointToString) + f, 0.0f);
        }
    }

    private void drawGlyph(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void drawGlyphTextLine(String str, vh4 vh4Var, Matrix matrix, yn6 yn6Var, Canvas canvas, float f, float f2) {
        float fFloatValue;
        for (int i = 0; i < str.length(); i++) {
            bo6 bo6Var = this.f14828Q.getCharacters().get(bo6.hashFor(str.charAt(i), yn6Var.getFamily(), yn6Var.getStyle()));
            if (bo6Var != null) {
                drawCharacterAsGlyph(bo6Var, matrix, f2, vh4Var, canvas);
                float width = ((float) bo6Var.getWidth()) * f2 * e1i.dpScale() * f;
                float f3 = vh4Var.f91181e / 10.0f;
                nr0<Float, Float> nr0Var = this.f14836Y;
                if (nr0Var != null) {
                    fFloatValue = nr0Var.getValue().floatValue();
                } else {
                    nr0<Float, Float> nr0Var2 = this.f14835X;
                    if (nr0Var2 != null) {
                        fFloatValue = nr0Var2.getValue().floatValue();
                    }
                    canvas.translate(width + (f3 * f), 0.0f);
                }
                f3 += fFloatValue;
                canvas.translate(width + (f3 * f), 0.0f);
            }
        }
    }

    private void drawTextGlyphs(vh4 vh4Var, Matrix matrix, yn6 yn6Var, Canvas canvas) {
        nr0<Float, Float> nr0Var = this.f14837Z;
        float fFloatValue = (nr0Var != null ? nr0Var.getValue().floatValue() : vh4Var.f91179c) / 100.0f;
        float scale = e1i.getScale(matrix);
        String str = vh4Var.f91177a;
        float fDpScale = vh4Var.f91182f * e1i.dpScale();
        List<String> textLines = getTextLines(str);
        int size = textLines.size();
        for (int i = 0; i < size; i++) {
            String str2 = textLines.get(i);
            float textLineWidthForGlyphs = getTextLineWidthForGlyphs(str2, yn6Var, fFloatValue, scale);
            canvas.save();
            applyJustification(vh4Var.f91180d, canvas, textLineWidthForGlyphs);
            canvas.translate(0.0f, (i * fDpScale) - (((size - 1) * fDpScale) / 2.0f));
            drawGlyphTextLine(str2, vh4Var, matrix, yn6Var, canvas, scale, fFloatValue);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[LOOP:0: B:20:0x008d->B:21:0x008f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void drawTextWithFont(p000.vh4 r8, p000.yn6 r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.getTypeface(r9)
            if (r9 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r8.f91177a
            go9 r1 = r7.f14827P
            tqg r1 = r1.getTextDelegate()
            if (r1 == 0) goto L19
            java.lang.String r2 = r7.getName()
            java.lang.String r0 = r1.getTextInternal(r2, r0)
        L19:
            android.graphics.Paint r1 = r7.f14822K
            r1.setTypeface(r9)
            nr0<java.lang.Float, java.lang.Float> r9 = r7.f14837Z
            if (r9 == 0) goto L2d
            java.lang.Object r9 = r9.getValue()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L2f
        L2d:
            float r9 = r8.f91179c
        L2f:
            android.graphics.Paint r1 = r7.f14822K
            float r2 = p000.e1i.dpScale()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.f14823L
            android.graphics.Paint r2 = r7.f14822K
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.f14823L
            android.graphics.Paint r2 = r7.f14822K
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f91182f
            float r2 = p000.e1i.dpScale()
            float r1 = r1 * r2
            int r2 = r8.f91181e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            nr0<java.lang.Float, java.lang.Float> r3 = r7.f14836Y
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r3.getValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6a:
            float r2 = r2 + r3
            goto L7b
        L6c:
            nr0<java.lang.Float, java.lang.Float> r3 = r7.f14835X
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r3.getValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6a
        L7b:
            float r3 = p000.e1i.dpScale()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.getTextLines(r0)
            int r0 = r9.size()
            r3 = 0
        L8d:
            if (r3 >= r0) goto Lc3
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.f14823L
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            vh4$a r6 = r8.f91180d
            r7.applyJustification(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.drawFontTextLine(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L8d
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bug.drawTextWithFont(vh4, yn6, android.graphics.Canvas):void");
    }

    private List<pv2> getContentsForCharacter(bo6 bo6Var) {
        if (this.f14824M.containsKey(bo6Var)) {
            return this.f14824M.get(bo6Var);
        }
        List<v8f> shapes = bo6Var.getShapes();
        int size = shapes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new pv2(this.f14827P, this, shapes.get(i)));
        }
        this.f14824M.put(bo6Var, arrayList);
        return arrayList;
    }

    private float getTextLineWidthForGlyphs(String str, yn6 yn6Var, float f, float f2) {
        float width = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            bo6 bo6Var = this.f14828Q.getCharacters().get(bo6.hashFor(str.charAt(i), yn6Var.getFamily(), yn6Var.getStyle()));
            if (bo6Var != null) {
                width = (float) (((double) width) + (bo6Var.getWidth() * ((double) f) * ((double) e1i.dpScale()) * ((double) f2)));
            }
        }
        return width;
    }

    private List<String> getTextLines(String str) {
        return Arrays.asList(str.replaceAll("\r\n", eu9.f34034d).replaceAll("\n", eu9.f34034d).split(eu9.f34034d));
    }

    @hib
    private Typeface getTypeface(yn6 yn6Var) {
        Typeface value;
        nr0<Typeface, Typeface> nr0Var = this.f14838a0;
        if (nr0Var != null && (value = nr0Var.getValue()) != null) {
            return value;
        }
        Typeface typeface = this.f14827P.getTypeface(yn6Var.getFamily(), yn6Var.getStyle());
        return typeface != null ? typeface : yn6Var.getTypeface();
    }

    private boolean isModifier(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    @Override // p000.pr0, p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        super.addValueCallback(t, bp9Var);
        if (t == to9.f85484a) {
            nr0<Integer, Integer> nr0Var = this.f14830S;
            if (nr0Var != null) {
                removeAnimation(nr0Var);
            }
            if (bp9Var == null) {
                this.f14830S = null;
                return;
            }
            d2i d2iVar = new d2i(bp9Var);
            this.f14830S = d2iVar;
            d2iVar.addUpdateListener(this);
            addAnimation(this.f14830S);
            return;
        }
        if (t == to9.f85485b) {
            nr0<Integer, Integer> nr0Var2 = this.f14832U;
            if (nr0Var2 != null) {
                removeAnimation(nr0Var2);
            }
            if (bp9Var == null) {
                this.f14832U = null;
                return;
            }
            d2i d2iVar2 = new d2i(bp9Var);
            this.f14832U = d2iVar2;
            d2iVar2.addUpdateListener(this);
            addAnimation(this.f14832U);
            return;
        }
        if (t == to9.f85502s) {
            nr0<Float, Float> nr0Var3 = this.f14834W;
            if (nr0Var3 != null) {
                removeAnimation(nr0Var3);
            }
            if (bp9Var == null) {
                this.f14834W = null;
                return;
            }
            d2i d2iVar3 = new d2i(bp9Var);
            this.f14834W = d2iVar3;
            d2iVar3.addUpdateListener(this);
            addAnimation(this.f14834W);
            return;
        }
        if (t == to9.f85503t) {
            nr0<Float, Float> nr0Var4 = this.f14836Y;
            if (nr0Var4 != null) {
                removeAnimation(nr0Var4);
            }
            if (bp9Var == null) {
                this.f14836Y = null;
                return;
            }
            d2i d2iVar4 = new d2i(bp9Var);
            this.f14836Y = d2iVar4;
            d2iVar4.addUpdateListener(this);
            addAnimation(this.f14836Y);
            return;
        }
        if (t == to9.f85474F) {
            nr0<Float, Float> nr0Var5 = this.f14837Z;
            if (nr0Var5 != null) {
                removeAnimation(nr0Var5);
            }
            if (bp9Var == null) {
                this.f14837Z = null;
                return;
            }
            d2i d2iVar5 = new d2i(bp9Var);
            this.f14837Z = d2iVar5;
            d2iVar5.addUpdateListener(this);
            addAnimation(this.f14837Z);
            return;
        }
        if (t != to9.f85481M) {
            if (t == to9.f85483O) {
                this.f14826O.setStringValueCallback(bp9Var);
                return;
            }
            return;
        }
        nr0<Typeface, Typeface> nr0Var6 = this.f14838a0;
        if (nr0Var6 != null) {
            removeAnimation(nr0Var6);
        }
        if (bp9Var == null) {
            this.f14838a0 = null;
            return;
        }
        d2i d2iVar6 = new d2i(bp9Var);
        this.f14838a0 = d2iVar6;
        d2iVar6.addUpdateListener(this);
        addAnimation(this.f14838a0);
    }

    @Override // p000.pr0
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f14827P.useTextGlyphs()) {
            canvas.concat(matrix);
        }
        vh4 value = this.f14826O.getValue();
        yn6 yn6Var = this.f14828Q.getFonts().get(value.f91178b);
        if (yn6Var == null) {
            canvas.restore();
            return;
        }
        nr0<Integer, Integer> nr0Var = this.f14830S;
        if (nr0Var != null) {
            this.f14822K.setColor(nr0Var.getValue().intValue());
        } else {
            nr0<Integer, Integer> nr0Var2 = this.f14829R;
            if (nr0Var2 != null) {
                this.f14822K.setColor(nr0Var2.getValue().intValue());
            } else {
                this.f14822K.setColor(value.f91184h);
            }
        }
        nr0<Integer, Integer> nr0Var3 = this.f14832U;
        if (nr0Var3 != null) {
            this.f14823L.setColor(nr0Var3.getValue().intValue());
        } else {
            nr0<Integer, Integer> nr0Var4 = this.f14831T;
            if (nr0Var4 != null) {
                this.f14823L.setColor(nr0Var4.getValue().intValue());
            } else {
                this.f14823L.setColor(value.f91185i);
            }
        }
        int iIntValue = ((this.f71721x.getOpacity() == null ? 100 : this.f71721x.getOpacity().getValue().intValue()) * 255) / 100;
        this.f14822K.setAlpha(iIntValue);
        this.f14823L.setAlpha(iIntValue);
        nr0<Float, Float> nr0Var5 = this.f14834W;
        if (nr0Var5 != null) {
            this.f14823L.setStrokeWidth(nr0Var5.getValue().floatValue());
        } else {
            nr0<Float, Float> nr0Var6 = this.f14833V;
            if (nr0Var6 != null) {
                this.f14823L.setStrokeWidth(nr0Var6.getValue().floatValue());
            } else {
                this.f14823L.setStrokeWidth(value.f91186j * e1i.dpScale() * e1i.getScale(matrix));
            }
        }
        if (this.f14827P.useTextGlyphs()) {
            drawTextGlyphs(value, matrix, yn6Var, canvas);
        } else {
            drawTextWithFont(value, yn6Var, canvas);
        }
        canvas.restore();
    }

    @Override // p000.pr0, p000.yq4
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f14828Q.getBounds().width(), this.f14828Q.getBounds().height());
    }
}

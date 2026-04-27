package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,330:1\n98#1,2:331\n98#1,2:333\n98#1,2:335\n98#1,2:337\n84#1:339\n84#1:340\n84#1:341\n84#1:342\n84#1:343\n84#1:344\n84#1:345\n84#1:346\n84#1:347\n84#1:348\n84#1:349\n84#1:350\n84#1:351\n84#1:352\n84#1:353\n84#1:354\n84#1:355\n84#1:356\n84#1:357\n84#1:358\n98#1,2:359\n98#1,2:361\n98#1,2:363\n98#1,2:365\n98#1,2:367\n98#1,2:369\n98#1,2:371\n98#1,2:373\n98#1,2:375\n98#1,2:377\n98#1,2:379\n98#1,2:381\n98#1,2:383\n98#1,2:385\n98#1,2:387\n98#1,2:389\n98#1,2:391\n98#1,2:393\n98#1,2:395\n98#1,2:397\n84#1:399\n84#1:400\n84#1:401\n84#1:402\n98#1,2:403\n98#1,2:405\n98#1,2:407\n98#1,2:409\n98#1,2:411\n98#1,2:413\n98#1,2:415\n98#1,2:417\n98#1,2:419\n98#1,2:421\n98#1,2:423\n98#1,2:425\n98#1,2:427\n134#1,5:429\n98#1,2:434\n98#1,2:436\n98#1,2:438\n98#1,2:440\n139#1:442\n134#1,5:443\n98#1,2:448\n98#1,2:450\n98#1,2:452\n98#1,2:454\n139#1:456\n134#1,5:457\n98#1,2:462\n98#1,2:464\n98#1,2:466\n98#1,2:468\n139#1:470\n98#1,2:471\n98#1,2:473\n98#1,2:475\n98#1,2:477\n98#1,2:479\n98#1,2:481\n98#1,2:483\n98#1,2:485\n98#1,2:487\n98#1,2:489\n98#1,2:491\n98#1,2:493\n98#1,2:495\n98#1,2:497\n98#1,2:499\n98#1,2:501\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n112#1:331,2\n113#1:333,2\n114#1:335,2\n115#1:337,2\n149#1:339\n150#1:340\n151#1:341\n152#1:342\n153#1:343\n159#1:344\n160#1:345\n161#1:346\n162#1:347\n163#1:348\n169#1:349\n170#1:350\n171#1:351\n172#1:352\n173#1:353\n179#1:354\n180#1:355\n181#1:356\n182#1:357\n183#1:358\n185#1:359,2\n186#1:361,2\n187#1:363,2\n188#1:365,2\n189#1:367,2\n190#1:369,2\n191#1:371,2\n192#1:373,2\n193#1:375,2\n194#1:377,2\n195#1:379,2\n196#1:381,2\n197#1:383,2\n198#1:385,2\n199#1:387,2\n200#1:389,2\n201#1:391,2\n202#1:393,2\n203#1:395,2\n204#1:397,2\n212#1:399\n213#1:400\n214#1:401\n215#1:402\n229#1:403,2\n230#1:405,2\n231#1:407,2\n232#1:409,2\n233#1:411,2\n234#1:413,2\n235#1:415,2\n236#1:417,2\n237#1:419,2\n256#1:421,2\n257#1:423,2\n258#1:425,2\n259#1:427,2\n266#1:429,5\n267#1:434,2\n268#1:436,2\n269#1:438,2\n270#1:440,2\n266#1:442\n278#1:443,5\n279#1:448,2\n280#1:450,2\n281#1:452,2\n282#1:454,2\n278#1:456\n290#1:457,5\n291#1:462,2\n292#1:464,2\n293#1:466,2\n294#1:468,2\n290#1:470\n304#1:471,2\n305#1:473,2\n306#1:475,2\n307#1:477,2\n308#1:479,2\n309#1:481,2\n310#1:483,2\n311#1:485,2\n312#1:487,2\n321#1:489,2\n322#1:491,2\n323#1:493,2\n324#1:495,2\n325#1:497,2\n326#1:499,2\n327#1:501,2\n*E\n"})
public final class l92 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final float[] f56880a;

    private /* synthetic */ l92(float[] fArr) {
        this.f56880a = fArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ l92 m30831boximpl(float[] fArr) {
        return new l92(fArr);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m30832constructorimpl(@yfb float[] fArr) {
        return fArr;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m30833constructorimpl$default(float[] fArr, int i, jt3 jt3Var) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m30832constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m30834convertRgbToYuvimpl(float[] fArr) {
        m30841resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* JADX INFO: renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m30835convertYuvToRgbimpl(float[] fArr) {
        m30841resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* JADX INFO: renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m30836dotMe4OoYI(float[] fArr, float[] fArr2, int i, float[] fArr3, int i2) {
        int i3 = i * 5;
        return (fArr2[i3] * fArr3[i2]) + (fArr2[i3 + 1] * fArr3[5 + i2]) + (fArr2[i3 + 2] * fArr3[10 + i2]) + (fArr2[i3 + 3] * fArr3[15 + i2]);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30837equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof l92) && md8.areEqual(fArr, ((l92) obj).m30852unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30838equalsimpl0(float[] fArr, float[] fArr2) {
        return md8.areEqual(fArr, fArr2);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m30839getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 5) + i2];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30840hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m30841resetimpl(float[] fArr) {
        u70.fill$default(fArr, 0.0f, 0, 0, 6, (Object) null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* JADX INFO: renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m30842rotateInternalimpl(float[] fArr, float f, gz6<? super Float, ? super Float, bth> gz6Var) {
        m30841resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        gz6Var.invoke(Float.valueOf((float) Math.cos(d)), Float.valueOf((float) Math.sin(d)));
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m30843setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 5) + i2] = f;
    }

    /* JADX INFO: renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m30844setjHGOpc(float[] fArr, @yfb float[] fArr2) {
        u70.copyInto$default(fArr2, fArr, 0, 0, 0, 14, (Object) null);
    }

    /* JADX INFO: renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m30845setToRotateBlueimpl(float[] fArr, float f) {
        m30841resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        fArr[6] = fCos;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[5] = -fSin;
    }

    /* JADX INFO: renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m30846setToRotateGreenimpl(float[] fArr, float f) {
        m30841resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        fArr[12] = fCos;
        fArr[0] = fCos;
        fArr[2] = -fSin;
        fArr[10] = fSin;
    }

    /* JADX INFO: renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m30847setToRotateRedimpl(float[] fArr, float f) {
        m30841resetimpl(fArr);
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        fArr[12] = fCos;
        fArr[6] = fCos;
        fArr[7] = fSin;
        fArr[11] = -fSin;
    }

    /* JADX INFO: renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m30848setToSaturationimpl(float[] fArr, float f) {
        m30841resetimpl(fArr);
        float f2 = 1 - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }

    /* JADX INFO: renamed from: setToScale-impl, reason: not valid java name */
    public static final void m30849setToScaleimpl(float[] fArr, float f, float f2, float f3, float f4) {
        m30841resetimpl(fArr);
        fArr[0] = f;
        fArr[6] = f2;
        fArr[12] = f3;
        fArr[18] = f4;
    }

    /* JADX INFO: renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m30850timesAssignjHGOpc(float[] fArr, @yfb float[] fArr2) {
        float fM30836dotMe4OoYI = m30836dotMe4OoYI(fArr, fArr, 0, fArr2, 0);
        float fM30836dotMe4OoYI2 = m30836dotMe4OoYI(fArr, fArr, 0, fArr2, 1);
        float fM30836dotMe4OoYI3 = m30836dotMe4OoYI(fArr, fArr, 0, fArr2, 2);
        float fM30836dotMe4OoYI4 = m30836dotMe4OoYI(fArr, fArr, 0, fArr2, 3);
        float f = (fArr[0] * fArr2[4]) + (fArr[1] * fArr2[9]) + (fArr[2] * fArr2[14]) + (fArr[3] * fArr2[19]) + fArr[4];
        float fM30836dotMe4OoYI5 = m30836dotMe4OoYI(fArr, fArr, 1, fArr2, 0);
        float fM30836dotMe4OoYI6 = m30836dotMe4OoYI(fArr, fArr, 1, fArr2, 1);
        float fM30836dotMe4OoYI7 = m30836dotMe4OoYI(fArr, fArr, 1, fArr2, 2);
        float fM30836dotMe4OoYI8 = m30836dotMe4OoYI(fArr, fArr, 1, fArr2, 3);
        float f2 = (fArr[5] * fArr2[4]) + (fArr[6] * fArr2[9]) + (fArr[7] * fArr2[14]) + (fArr[8] * fArr2[19]) + fArr[9];
        float fM30836dotMe4OoYI9 = m30836dotMe4OoYI(fArr, fArr, 2, fArr2, 0);
        float fM30836dotMe4OoYI10 = m30836dotMe4OoYI(fArr, fArr, 2, fArr2, 1);
        float fM30836dotMe4OoYI11 = m30836dotMe4OoYI(fArr, fArr, 2, fArr2, 2);
        float fM30836dotMe4OoYI12 = m30836dotMe4OoYI(fArr, fArr, 2, fArr2, 3);
        float f3 = (fArr[10] * fArr2[4]) + (fArr[11] * fArr2[9]) + (fArr[12] * fArr2[14]) + (fArr[13] * fArr2[19]) + fArr[14];
        float fM30836dotMe4OoYI13 = m30836dotMe4OoYI(fArr, fArr, 3, fArr2, 0);
        float fM30836dotMe4OoYI14 = m30836dotMe4OoYI(fArr, fArr, 3, fArr2, 1);
        float fM30836dotMe4OoYI15 = m30836dotMe4OoYI(fArr, fArr, 3, fArr2, 2);
        float fM30836dotMe4OoYI16 = m30836dotMe4OoYI(fArr, fArr, 3, fArr2, 3);
        float f4 = (fArr[15] * fArr2[4]) + (fArr[16] * fArr2[9]) + (fArr[17] * fArr2[14]) + (fArr[18] * fArr2[19]) + fArr[19];
        fArr[0] = fM30836dotMe4OoYI;
        fArr[1] = fM30836dotMe4OoYI2;
        fArr[2] = fM30836dotMe4OoYI3;
        fArr[3] = fM30836dotMe4OoYI4;
        fArr[4] = f;
        fArr[5] = fM30836dotMe4OoYI5;
        fArr[6] = fM30836dotMe4OoYI6;
        fArr[7] = fM30836dotMe4OoYI7;
        fArr[8] = fM30836dotMe4OoYI8;
        fArr[9] = f2;
        fArr[10] = fM30836dotMe4OoYI9;
        fArr[11] = fM30836dotMe4OoYI10;
        fArr[12] = fM30836dotMe4OoYI11;
        fArr[13] = fM30836dotMe4OoYI12;
        fArr[14] = f3;
        fArr[15] = fM30836dotMe4OoYI13;
        fArr[16] = fM30836dotMe4OoYI14;
        fArr[17] = fM30836dotMe4OoYI15;
        fArr[18] = fM30836dotMe4OoYI16;
        fArr[19] = f4;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30851toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m30837equalsimpl(this.f56880a, obj);
    }

    @yfb
    public final float[] getValues() {
        return this.f56880a;
    }

    public int hashCode() {
        return m30840hashCodeimpl(this.f56880a);
    }

    public String toString() {
        return m30851toStringimpl(this.f56880a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m30852unboximpl() {
        return this.f56880a;
    }
}

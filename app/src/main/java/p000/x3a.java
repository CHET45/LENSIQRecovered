package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@vn8
@dwf({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,441:1\n39#1:442\n39#1:443\n39#1:444\n42#1,2:445\n42#1,2:447\n42#1,2:449\n42#1,2:451\n42#1,2:453\n42#1,2:455\n42#1,2:457\n42#1,2:459\n42#1,2:461\n42#1,2:463\n42#1,2:465\n42#1,2:467\n42#1,2:469\n42#1,2:471\n42#1,2:473\n42#1,2:475\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n39#1:496\n42#1,2:497\n42#1,2:499\n42#1,2:501\n42#1,2:503\n42#1,2:505\n42#1,2:507\n42#1,2:509\n42#1,2:511\n42#1,2:513\n42#1,2:515\n42#1,2:517\n42#1,2:519\n42#1,2:521\n42#1,2:523\n42#1,2:525\n42#1,2:527\n42#1,2:529\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n39#1:538\n42#1,2:539\n42#1,2:541\n42#1,2:543\n42#1,2:545\n42#1,2:547\n42#1,2:549\n42#1,2:551\n42#1,2:553\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n39#1:562\n42#1,2:563\n42#1,2:565\n42#1,2:567\n42#1,2:569\n42#1,2:571\n42#1,2:573\n42#1,2:575\n42#1,2:577\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n39#1:586\n42#1,2:587\n42#1,2:589\n42#1,2:591\n42#1,2:593\n42#1,2:595\n42#1,2:597\n42#1,2:599\n42#1,2:601\n39#1,5:603\n39#1,5:608\n39#1,5:613\n39#1,5:618\n39#1,5:623\n39#1,5:628\n39#1,5:633\n39#1,5:638\n39#1,5:643\n39#1,5:648\n39#1,5:653\n39#1,5:658\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n39#1:678\n42#1,2:679\n42#1,2:681\n42#1,2:683\n42#1,2:685\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:442\n56#1:443\n57#1:444\n112#1:445,2\n113#1:447,2\n114#1:449,2\n115#1:451,2\n116#1:453,2\n117#1:455,2\n118#1:457,2\n119#1:459,2\n120#1:461,2\n121#1:463,2\n122#1:465,2\n123#1:467,2\n124#1:469,2\n125#1:471,2\n126#1:473,2\n127#1:475,2\n132#1:477\n133#1:478\n134#1:479\n135#1:480\n143#1:481\n144#1:482\n145#1:483\n146#1:484\n147#1:485\n148#1:486\n149#1:487\n150#1:488\n151#1:489\n152#1:490\n153#1:491\n154#1:492\n155#1:493\n156#1:494\n157#1:495\n158#1:496\n177#1:497,2\n178#1:499,2\n179#1:501,2\n180#1:503,2\n181#1:505,2\n182#1:507,2\n183#1:509,2\n184#1:511,2\n185#1:513,2\n186#1:515,2\n187#1:517,2\n188#1:519,2\n189#1:521,2\n190#1:523,2\n191#1:525,2\n192#1:527,2\n201#1:529,2\n220#1:531\n221#1:532\n225#1:533\n226#1:534\n230#1:535\n231#1:536\n235#1:537\n236#1:538\n240#1:539,2\n241#1:541,2\n242#1:543,2\n243#1:545,2\n244#1:547,2\n245#1:549,2\n246#1:551,2\n247#1:553,2\n257#1:555\n258#1:556\n262#1:557\n263#1:558\n267#1:559\n268#1:560\n272#1:561\n273#1:562\n277#1:563,2\n278#1:565,2\n279#1:567,2\n280#1:569,2\n281#1:571,2\n282#1:573,2\n283#1:575,2\n284#1:577,2\n294#1:579\n295#1:580\n299#1:581\n300#1:582\n304#1:583\n305#1:584\n309#1:585\n310#1:586\n314#1:587,2\n315#1:589,2\n316#1:591,2\n317#1:593,2\n318#1:595,2\n319#1:597,2\n320#1:599,2\n321#1:601,2\n326#1:603,5\n327#1:608,5\n328#1:613,5\n329#1:618,5\n330#1:623,5\n331#1:628,5\n332#1:633,5\n333#1:638,5\n334#1:643,5\n335#1:648,5\n336#1:653,5\n337#1:658,5\n342#1:663\n343#1:664\n344#1:665\n345#1:666\n346#1:667\n347#1:668\n348#1:669\n349#1:670\n350#1:671\n351#1:672\n352#1:673\n353#1:674\n354#1:675\n355#1:676\n356#1:677\n357#1:678\n358#1:679,2\n359#1:681,2\n360#1:683,2\n361#1:685,2\n*E\n"})
public final class x3a {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14894a f96127b = new C14894a(null);

    /* JADX INFO: renamed from: c */
    public static final int f96128c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f96129d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f96130e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f96131f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f96132g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f96133h = 7;

    /* JADX INFO: renamed from: i */
    public static final int f96134i = 10;

    /* JADX INFO: renamed from: j */
    public static final int f96135j = 12;

    /* JADX INFO: renamed from: k */
    public static final int f96136k = 13;

    /* JADX INFO: renamed from: l */
    public static final int f96137l = 14;

    /* JADX INFO: renamed from: m */
    public static final int f96138m = 15;

    /* JADX INFO: renamed from: a */
    @yfb
    public final float[] f96139a;

    /* JADX INFO: renamed from: x3a$a */
    public static final class C14894a {
        public /* synthetic */ C14894a(jt3 jt3Var) {
            this();
        }

        private C14894a() {
        }
    }

    private /* synthetic */ x3a(float[] fArr) {
        this.f96139a = fArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ x3a m33181boximpl(float[] fArr) {
        return new x3a(fArr);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m33182constructorimpl(@yfb float[] fArr) {
        return fArr;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m33183constructorimpl$default(float[] fArr, int i, jt3 jt3Var) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m33182constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33184equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof x3a) && md8.areEqual(fArr, ((x3a) obj).m33204unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33185equalsimpl0(float[] fArr, float[] fArr2) {
        return md8.areEqual(fArr, fArr2);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m33186getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 4) + i2];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33187hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: invert-impl, reason: not valid java name */
    public static final void m33188invertimpl(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f17 * f28) - (f18 * f27)) + (f19 * f26)) + (f20 * f25)) - (f21 * f24)) + (f22 * f23);
        if (f29 == 0.0f) {
            return;
        }
        float f30 = 1.0f / f29;
        fArr[0] = (((f6 * f28) - (f7 * f27)) + (f8 * f26)) * f30;
        fArr[1] = ((((-f2) * f28) + (f3 * f27)) - (f4 * f26)) * f30;
        fArr[2] = (((f14 * f22) - (f15 * f21)) + (f16 * f20)) * f30;
        fArr[3] = ((((-f10) * f22) + (f11 * f21)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr[4] = (((f31 * f28) + (f7 * f25)) - (f8 * f24)) * f30;
        fArr[5] = (((f28 * f) - (f3 * f25)) + (f4 * f24)) * f30;
        float f32 = -f13;
        fArr[6] = (((f32 * f22) + (f15 * f19)) - (f16 * f18)) * f30;
        fArr[7] = (((f22 * f9) - (f11 * f19)) + (f12 * f18)) * f30;
        fArr[8] = (((f5 * f27) - (f6 * f25)) + (f8 * f23)) * f30;
        fArr[9] = ((((-f) * f27) + (f25 * f2)) - (f4 * f23)) * f30;
        fArr[10] = (((f13 * f21) - (f14 * f19)) + (f16 * f17)) * f30;
        fArr[11] = ((((-f9) * f21) + (f19 * f10)) - (f12 * f17)) * f30;
        fArr[12] = (((f31 * f26) + (f6 * f24)) - (f7 * f23)) * f30;
        fArr[13] = (((f * f26) - (f2 * f24)) + (f3 * f23)) * f30;
        fArr[14] = (((f32 * f20) + (f14 * f18)) - (f15 * f17)) * f30;
        fArr[15] = (((f9 * f20) - (f10 * f18)) + (f11 * f17)) * f30;
    }

    /* JADX INFO: renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m33189mapMKHz9U(float[] fArr, long j) {
        float fM30429getXimpl = izb.m30429getXimpl(j);
        float fM30430getYimpl = izb.m30430getYimpl(j);
        float f = 1 / (((fArr[3] * fM30429getXimpl) + (fArr[7] * fM30430getYimpl)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        return mzb.Offset(((fArr[0] * fM30429getXimpl) + (fArr[4] * fM30430getYimpl) + fArr[12]) * f, f * ((fArr[1] * fM30429getXimpl) + (fArr[5] * fM30430getYimpl) + fArr[13]));
    }

    @yfb
    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final rud m33190mapimpl(float[] fArr, @yfb rud rudVar) {
        long jM33189mapMKHz9U = m33189mapMKHz9U(fArr, mzb.Offset(rudVar.getLeft(), rudVar.getTop()));
        long jM33189mapMKHz9U2 = m33189mapMKHz9U(fArr, mzb.Offset(rudVar.getLeft(), rudVar.getBottom()));
        long jM33189mapMKHz9U3 = m33189mapMKHz9U(fArr, mzb.Offset(rudVar.getRight(), rudVar.getTop()));
        long jM33189mapMKHz9U4 = m33189mapMKHz9U(fArr, mzb.Offset(rudVar.getRight(), rudVar.getBottom()));
        return new rud(Math.min(Math.min(izb.m30429getXimpl(jM33189mapMKHz9U), izb.m30429getXimpl(jM33189mapMKHz9U2)), Math.min(izb.m30429getXimpl(jM33189mapMKHz9U3), izb.m30429getXimpl(jM33189mapMKHz9U4))), Math.min(Math.min(izb.m30430getYimpl(jM33189mapMKHz9U), izb.m30430getYimpl(jM33189mapMKHz9U2)), Math.min(izb.m30430getYimpl(jM33189mapMKHz9U3), izb.m30430getYimpl(jM33189mapMKHz9U4))), Math.max(Math.max(izb.m30429getXimpl(jM33189mapMKHz9U), izb.m30429getXimpl(jM33189mapMKHz9U2)), Math.max(izb.m30429getXimpl(jM33189mapMKHz9U3), izb.m30429getXimpl(jM33189mapMKHz9U4))), Math.max(Math.max(izb.m30430getYimpl(jM33189mapMKHz9U), izb.m30430getYimpl(jM33189mapMKHz9U2)), Math.max(izb.m30430getYimpl(jM33189mapMKHz9U3), izb.m30430getYimpl(jM33189mapMKHz9U4))));
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m33192resetimpl(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: rotateX-impl, reason: not valid java name */
    public static final void m33193rotateXimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[9];
        float f7 = fArr[10];
        float f8 = fArr[13];
        float f9 = fArr[14];
        fArr[1] = (f2 * fCos) - (f3 * fSin);
        fArr[2] = (f2 * fSin) + (f3 * fCos);
        fArr[5] = (f4 * fCos) - (f5 * fSin);
        fArr[6] = (f4 * fSin) + (f5 * fCos);
        fArr[9] = (f6 * fCos) - (f7 * fSin);
        fArr[10] = (f6 * fSin) + (f7 * fCos);
        fArr[13] = (f8 * fCos) - (f9 * fSin);
        fArr[14] = (f8 * fSin) + (f9 * fCos);
    }

    /* JADX INFO: renamed from: rotateY-impl, reason: not valid java name */
    public static final void m33194rotateYimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[2];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[8];
        float f7 = fArr[10];
        float f8 = fArr[12];
        float f9 = fArr[14];
        fArr[0] = (f2 * fCos) + (f3 * fSin);
        fArr[2] = ((-f2) * fSin) + (f3 * fCos);
        fArr[4] = (f4 * fCos) + (f5 * fSin);
        fArr[6] = ((-f4) * fSin) + (f5 * fCos);
        fArr[8] = (f6 * fCos) + (f7 * fSin);
        fArr[10] = ((-f6) * fSin) + (f7 * fCos);
        fArr[12] = (f8 * fCos) + (f9 * fSin);
        fArr[14] = ((-f8) * fSin) + (f9 * fCos);
    }

    /* JADX INFO: renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m33195rotateZimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = (fCos * f2) + (fSin * f3);
        float f5 = -fSin;
        float f6 = fArr[1];
        float f7 = fArr[5];
        float f8 = (fCos * f6) + (fSin * f7);
        float f9 = fArr[2];
        float f10 = fArr[6];
        float f11 = (fCos * f9) + (fSin * f10);
        float f12 = fArr[3];
        float f13 = fArr[7];
        fArr[0] = f4;
        fArr[1] = f8;
        fArr[2] = f11;
        fArr[3] = (fCos * f12) + (fSin * f13);
        fArr[4] = (f2 * f5) + (f3 * fCos);
        fArr[5] = (f6 * f5) + (f7 * fCos);
        fArr[6] = (f9 * f5) + (f10 * fCos);
        fArr[7] = (f5 * f12) + (fCos * f13);
    }

    /* JADX INFO: renamed from: scale-impl, reason: not valid java name */
    public static final void m33196scaleimpl(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* JADX INFO: renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m33197scaleimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        m33196scaleimpl(fArr, f, f2, f3);
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m33198setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 4) + i2] = f;
    }

    /* JADX INFO: renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m33199setFrom58bKbWc(float[] fArr, @yfb float[] fArr2) {
        for (int i = 0; i < 16; i++) {
            fArr[i] = fArr2[i];
        }
    }

    /* JADX INFO: renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m33200timesAssign58bKbWc(float[] fArr, @yfb float[] fArr2) {
        float fM27188dotp89u6pk = a4a.m27188dotp89u6pk(fArr, 0, fArr2, 0);
        float fM27188dotp89u6pk2 = a4a.m27188dotp89u6pk(fArr, 0, fArr2, 1);
        float fM27188dotp89u6pk3 = a4a.m27188dotp89u6pk(fArr, 0, fArr2, 2);
        float fM27188dotp89u6pk4 = a4a.m27188dotp89u6pk(fArr, 0, fArr2, 3);
        float fM27188dotp89u6pk5 = a4a.m27188dotp89u6pk(fArr, 1, fArr2, 0);
        float fM27188dotp89u6pk6 = a4a.m27188dotp89u6pk(fArr, 1, fArr2, 1);
        float fM27188dotp89u6pk7 = a4a.m27188dotp89u6pk(fArr, 1, fArr2, 2);
        float fM27188dotp89u6pk8 = a4a.m27188dotp89u6pk(fArr, 1, fArr2, 3);
        float fM27188dotp89u6pk9 = a4a.m27188dotp89u6pk(fArr, 2, fArr2, 0);
        float fM27188dotp89u6pk10 = a4a.m27188dotp89u6pk(fArr, 2, fArr2, 1);
        float fM27188dotp89u6pk11 = a4a.m27188dotp89u6pk(fArr, 2, fArr2, 2);
        float fM27188dotp89u6pk12 = a4a.m27188dotp89u6pk(fArr, 2, fArr2, 3);
        float fM27188dotp89u6pk13 = a4a.m27188dotp89u6pk(fArr, 3, fArr2, 0);
        float fM27188dotp89u6pk14 = a4a.m27188dotp89u6pk(fArr, 3, fArr2, 1);
        float fM27188dotp89u6pk15 = a4a.m27188dotp89u6pk(fArr, 3, fArr2, 2);
        float fM27188dotp89u6pk16 = a4a.m27188dotp89u6pk(fArr, 3, fArr2, 3);
        fArr[0] = fM27188dotp89u6pk;
        fArr[1] = fM27188dotp89u6pk2;
        fArr[2] = fM27188dotp89u6pk3;
        fArr[3] = fM27188dotp89u6pk4;
        fArr[4] = fM27188dotp89u6pk5;
        fArr[5] = fM27188dotp89u6pk6;
        fArr[6] = fM27188dotp89u6pk7;
        fArr[7] = fM27188dotp89u6pk8;
        fArr[8] = fM27188dotp89u6pk9;
        fArr[9] = fM27188dotp89u6pk10;
        fArr[10] = fM27188dotp89u6pk11;
        fArr[11] = fM27188dotp89u6pk12;
        fArr[12] = fM27188dotp89u6pk13;
        fArr[13] = fM27188dotp89u6pk14;
        fArr[14] = fM27188dotp89u6pk15;
        fArr[15] = fM27188dotp89u6pk16;
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33201toStringimpl(float[] fArr) {
        return a9g.trimIndent("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* JADX INFO: renamed from: translate-impl, reason: not valid java name */
    public static final void m33202translateimpl(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        float f7 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    /* JADX INFO: renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m33203translateimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m33202translateimpl(fArr, f, f2, f3);
    }

    public boolean equals(Object obj) {
        return m33184equalsimpl(this.f96139a, obj);
    }

    @yfb
    public final float[] getValues() {
        return this.f96139a;
    }

    public int hashCode() {
        return m33187hashCodeimpl(this.f96139a);
    }

    @yfb
    public String toString() {
        return m33201toStringimpl(this.f96139a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m33204unboximpl() {
        return this.f96139a;
    }

    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final void m33191mapimpl(float[] fArr, @yfb q6b q6bVar) {
        long jM33189mapMKHz9U = m33189mapMKHz9U(fArr, mzb.Offset(q6bVar.getLeft(), q6bVar.getTop()));
        long jM33189mapMKHz9U2 = m33189mapMKHz9U(fArr, mzb.Offset(q6bVar.getLeft(), q6bVar.getBottom()));
        long jM33189mapMKHz9U3 = m33189mapMKHz9U(fArr, mzb.Offset(q6bVar.getRight(), q6bVar.getTop()));
        long jM33189mapMKHz9U4 = m33189mapMKHz9U(fArr, mzb.Offset(q6bVar.getRight(), q6bVar.getBottom()));
        q6bVar.setLeft(Math.min(Math.min(izb.m30429getXimpl(jM33189mapMKHz9U), izb.m30429getXimpl(jM33189mapMKHz9U2)), Math.min(izb.m30429getXimpl(jM33189mapMKHz9U3), izb.m30429getXimpl(jM33189mapMKHz9U4))));
        q6bVar.setTop(Math.min(Math.min(izb.m30430getYimpl(jM33189mapMKHz9U), izb.m30430getYimpl(jM33189mapMKHz9U2)), Math.min(izb.m30430getYimpl(jM33189mapMKHz9U3), izb.m30430getYimpl(jM33189mapMKHz9U4))));
        q6bVar.setRight(Math.max(Math.max(izb.m30429getXimpl(jM33189mapMKHz9U), izb.m30429getXimpl(jM33189mapMKHz9U2)), Math.max(izb.m30429getXimpl(jM33189mapMKHz9U3), izb.m30429getXimpl(jM33189mapMKHz9U4))));
        q6bVar.setBottom(Math.max(Math.max(izb.m30430getYimpl(jM33189mapMKHz9U), izb.m30430getYimpl(jM33189mapMKHz9U2)), Math.max(izb.m30430getYimpl(jM33189mapMKHz9U3), izb.m30430getYimpl(jM33189mapMKHz9U4))));
    }
}

package p000;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import p000.q51;

/* JADX INFO: renamed from: bq */
/* JADX INFO: loaded from: classes.dex */
public final class C1995bq {

    /* JADX INFO: renamed from: bq$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14452a;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f14452a = iArr;
        }
    }

    /* JADX INFO: renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m28031isSupporteds9anfk8(int i) {
        return Build.VERSION.SDK_INT >= 29 || q51.m31897equalsimpl0(i, q51.f73234b.m31928getSrcOver0nO6VwU()) || m28033toPorterDuffModes9anfk8(i) != PorterDuff.Mode.SRC_OVER;
    }

    @c5e(29)
    @yfb
    /* JADX INFO: renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final BlendMode m28032toAndroidBlendModes9anfk8(int i) {
        q51.C11309a c11309a = q51.f73234b;
        return q51.m31897equalsimpl0(i, c11309a.m31901getClear0nO6VwU()) ? BlendMode.CLEAR : q51.m31897equalsimpl0(i, c11309a.m31924getSrc0nO6VwU()) ? BlendMode.SRC : q51.m31897equalsimpl0(i, c11309a.m31907getDst0nO6VwU()) ? BlendMode.DST : q51.m31897equalsimpl0(i, c11309a.m31928getSrcOver0nO6VwU()) ? BlendMode.SRC_OVER : q51.m31897equalsimpl0(i, c11309a.m31911getDstOver0nO6VwU()) ? BlendMode.DST_OVER : q51.m31897equalsimpl0(i, c11309a.m31926getSrcIn0nO6VwU()) ? BlendMode.SRC_IN : q51.m31897equalsimpl0(i, c11309a.m31909getDstIn0nO6VwU()) ? BlendMode.DST_IN : q51.m31897equalsimpl0(i, c11309a.m31927getSrcOut0nO6VwU()) ? BlendMode.SRC_OUT : q51.m31897equalsimpl0(i, c11309a.m31910getDstOut0nO6VwU()) ? BlendMode.DST_OUT : q51.m31897equalsimpl0(i, c11309a.m31925getSrcAtop0nO6VwU()) ? BlendMode.SRC_ATOP : q51.m31897equalsimpl0(i, c11309a.m31908getDstAtop0nO6VwU()) ? BlendMode.DST_ATOP : q51.m31897equalsimpl0(i, c11309a.m31929getXor0nO6VwU()) ? BlendMode.XOR : q51.m31897equalsimpl0(i, c11309a.m31920getPlus0nO6VwU()) ? BlendMode.PLUS : q51.m31897equalsimpl0(i, c11309a.m31917getModulate0nO6VwU()) ? BlendMode.MODULATE : q51.m31897equalsimpl0(i, c11309a.m31922getScreen0nO6VwU()) ? BlendMode.SCREEN : q51.m31897equalsimpl0(i, c11309a.m31919getOverlay0nO6VwU()) ? BlendMode.OVERLAY : q51.m31897equalsimpl0(i, c11309a.m31905getDarken0nO6VwU()) ? BlendMode.DARKEN : q51.m31897equalsimpl0(i, c11309a.m31915getLighten0nO6VwU()) ? BlendMode.LIGHTEN : q51.m31897equalsimpl0(i, c11309a.m31904getColorDodge0nO6VwU()) ? BlendMode.COLOR_DODGE : q51.m31897equalsimpl0(i, c11309a.m31903getColorBurn0nO6VwU()) ? BlendMode.COLOR_BURN : q51.m31897equalsimpl0(i, c11309a.m31913getHardlight0nO6VwU()) ? BlendMode.HARD_LIGHT : q51.m31897equalsimpl0(i, c11309a.m31923getSoftlight0nO6VwU()) ? BlendMode.SOFT_LIGHT : q51.m31897equalsimpl0(i, c11309a.m31906getDifference0nO6VwU()) ? BlendMode.DIFFERENCE : q51.m31897equalsimpl0(i, c11309a.m31912getExclusion0nO6VwU()) ? BlendMode.EXCLUSION : q51.m31897equalsimpl0(i, c11309a.m31918getMultiply0nO6VwU()) ? BlendMode.MULTIPLY : q51.m31897equalsimpl0(i, c11309a.m31914getHue0nO6VwU()) ? BlendMode.HUE : q51.m31897equalsimpl0(i, c11309a.m31921getSaturation0nO6VwU()) ? BlendMode.SATURATION : q51.m31897equalsimpl0(i, c11309a.m31902getColor0nO6VwU()) ? BlendMode.COLOR : q51.m31897equalsimpl0(i, c11309a.m31916getLuminosity0nO6VwU()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    @c5e(29)
    public static final int toComposeBlendMode(@yfb BlendMode blendMode) {
        switch (a.f14452a[blendMode.ordinal()]) {
            case 1:
                return q51.f73234b.m31901getClear0nO6VwU();
            case 2:
                return q51.f73234b.m31924getSrc0nO6VwU();
            case 3:
                return q51.f73234b.m31907getDst0nO6VwU();
            case 4:
                return q51.f73234b.m31928getSrcOver0nO6VwU();
            case 5:
                return q51.f73234b.m31911getDstOver0nO6VwU();
            case 6:
                return q51.f73234b.m31926getSrcIn0nO6VwU();
            case 7:
                return q51.f73234b.m31909getDstIn0nO6VwU();
            case 8:
                return q51.f73234b.m31927getSrcOut0nO6VwU();
            case 9:
                return q51.f73234b.m31910getDstOut0nO6VwU();
            case 10:
                return q51.f73234b.m31925getSrcAtop0nO6VwU();
            case 11:
                return q51.f73234b.m31908getDstAtop0nO6VwU();
            case 12:
                return q51.f73234b.m31929getXor0nO6VwU();
            case 13:
                return q51.f73234b.m31920getPlus0nO6VwU();
            case 14:
                return q51.f73234b.m31917getModulate0nO6VwU();
            case 15:
                return q51.f73234b.m31922getScreen0nO6VwU();
            case 16:
                return q51.f73234b.m31919getOverlay0nO6VwU();
            case 17:
                return q51.f73234b.m31905getDarken0nO6VwU();
            case 18:
                return q51.f73234b.m31915getLighten0nO6VwU();
            case 19:
                return q51.f73234b.m31904getColorDodge0nO6VwU();
            case 20:
                return q51.f73234b.m31903getColorBurn0nO6VwU();
            case 21:
                return q51.f73234b.m31913getHardlight0nO6VwU();
            case 22:
                return q51.f73234b.m31923getSoftlight0nO6VwU();
            case 23:
                return q51.f73234b.m31906getDifference0nO6VwU();
            case 24:
                return q51.f73234b.m31912getExclusion0nO6VwU();
            case 25:
                return q51.f73234b.m31918getMultiply0nO6VwU();
            case 26:
                return q51.f73234b.m31914getHue0nO6VwU();
            case 27:
                return q51.f73234b.m31921getSaturation0nO6VwU();
            case 28:
                return q51.f73234b.m31902getColor0nO6VwU();
            case 29:
                return q51.f73234b.m31916getLuminosity0nO6VwU();
            default:
                return q51.f73234b.m31928getSrcOver0nO6VwU();
        }
    }

    @yfb
    /* JADX INFO: renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m28033toPorterDuffModes9anfk8(int i) {
        q51.C11309a c11309a = q51.f73234b;
        return q51.m31897equalsimpl0(i, c11309a.m31901getClear0nO6VwU()) ? PorterDuff.Mode.CLEAR : q51.m31897equalsimpl0(i, c11309a.m31924getSrc0nO6VwU()) ? PorterDuff.Mode.SRC : q51.m31897equalsimpl0(i, c11309a.m31907getDst0nO6VwU()) ? PorterDuff.Mode.DST : q51.m31897equalsimpl0(i, c11309a.m31928getSrcOver0nO6VwU()) ? PorterDuff.Mode.SRC_OVER : q51.m31897equalsimpl0(i, c11309a.m31911getDstOver0nO6VwU()) ? PorterDuff.Mode.DST_OVER : q51.m31897equalsimpl0(i, c11309a.m31926getSrcIn0nO6VwU()) ? PorterDuff.Mode.SRC_IN : q51.m31897equalsimpl0(i, c11309a.m31909getDstIn0nO6VwU()) ? PorterDuff.Mode.DST_IN : q51.m31897equalsimpl0(i, c11309a.m31927getSrcOut0nO6VwU()) ? PorterDuff.Mode.SRC_OUT : q51.m31897equalsimpl0(i, c11309a.m31910getDstOut0nO6VwU()) ? PorterDuff.Mode.DST_OUT : q51.m31897equalsimpl0(i, c11309a.m31925getSrcAtop0nO6VwU()) ? PorterDuff.Mode.SRC_ATOP : q51.m31897equalsimpl0(i, c11309a.m31908getDstAtop0nO6VwU()) ? PorterDuff.Mode.DST_ATOP : q51.m31897equalsimpl0(i, c11309a.m31929getXor0nO6VwU()) ? PorterDuff.Mode.XOR : q51.m31897equalsimpl0(i, c11309a.m31920getPlus0nO6VwU()) ? PorterDuff.Mode.ADD : q51.m31897equalsimpl0(i, c11309a.m31922getScreen0nO6VwU()) ? PorterDuff.Mode.SCREEN : q51.m31897equalsimpl0(i, c11309a.m31919getOverlay0nO6VwU()) ? PorterDuff.Mode.OVERLAY : q51.m31897equalsimpl0(i, c11309a.m31905getDarken0nO6VwU()) ? PorterDuff.Mode.DARKEN : q51.m31897equalsimpl0(i, c11309a.m31915getLighten0nO6VwU()) ? PorterDuff.Mode.LIGHTEN : q51.m31897equalsimpl0(i, c11309a.m31917getModulate0nO6VwU()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}

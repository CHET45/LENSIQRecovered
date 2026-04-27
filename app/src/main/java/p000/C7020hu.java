package p000;

import androidx.graphics.path.C1118e;
import p000.bkc;
import p000.ijc;

/* JADX INFO: renamed from: hu */
/* JADX INFO: loaded from: classes.dex */
public final class C7020hu {

    /* JADX INFO: renamed from: hu$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44869a;

        static {
            int[] iArr = new int[C1118e.a.values().length];
            try {
                iArr[C1118e.a.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1118e.a.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1118e.a.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1118e.a.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C1118e.a.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C1118e.a.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C1118e.a.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f44869a = iArr;
        }
    }

    @yfb
    public static final ijc PathIterator(@yfb vic vicVar, @yfb ijc.EnumC7321a enumC7321a, float f) {
        return new C6544gu(vicVar, enumC7321a, f);
    }

    public static /* synthetic */ ijc PathIterator$default(vic vicVar, ijc.EnumC7321a enumC7321a, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC7321a = ijc.EnumC7321a.AsQuadratics;
        }
        if ((i & 4) != 0) {
            f = 0.25f;
        }
        return PathIterator(vicVar, enumC7321a, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bkc.EnumC1929a toPathSegmentType(C1118e.a aVar) {
        switch (a.f44869a[aVar.ordinal()]) {
            case 1:
                return bkc.EnumC1929a.Move;
            case 2:
                return bkc.EnumC1929a.Line;
            case 3:
                return bkc.EnumC1929a.Quadratic;
            case 4:
                return bkc.EnumC1929a.Conic;
            case 5:
                return bkc.EnumC1929a.Cubic;
            case 6:
                return bkc.EnumC1929a.Close;
            case 7:
                return bkc.EnumC1929a.Done;
            default:
                throw new ceb();
        }
    }
}

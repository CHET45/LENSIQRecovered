package p000;

import com.blankj.utilcode.util.C2473f;
import p000.bkc;

/* JADX INFO: loaded from: classes.dex */
public final class ekc {

    /* JADX INFO: renamed from: ekc$a */
    public /* synthetic */ class C5355a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33269a;

        static {
            int[] iArr = new int[bkc.EnumC1929a.values().length];
            try {
                iArr[bkc.EnumC1929a.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bkc.EnumC1929a.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bkc.EnumC1929a.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bkc.EnumC1929a.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[bkc.EnumC1929a.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[bkc.EnumC1929a.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[bkc.EnumC1929a.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f33269a = iArr;
        }
    }

    public static final void addSvg(@yfb vic vicVar, @yfb String str) {
        new xjc().parsePathString(str).toPath(vicVar);
    }

    private static final String command(bkc.EnumC1929a enumC1929a, bkc.EnumC1929a enumC1929a2) {
        if (enumC1929a == enumC1929a2) {
            return C2473f.f17566z;
        }
        int i = C5355a.f33269a[enumC1929a.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? "" : "Z" : "C" : "Q" : "L" : "M";
    }

    @yfb
    public static final String toSvg(@yfb vic vicVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        rud bounds = vicVar.getBounds();
        if (z) {
            sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
            sb.append("viewBox=\"" + bounds.getLeft() + ' ' + bounds.getTop() + ' ' + bounds.getWidth() + ' ' + bounds.getHeight() + "\">");
            md8.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            md8.checkNotNullExpressionValue(sb, "append('\\n')");
        }
        ijc it = vicVar.iterator();
        float[] fArr = new float[8];
        bkc.EnumC1929a enumC1929a = bkc.EnumC1929a.Done;
        if (it.hasNext()) {
            if (z) {
                if (bjc.m28000equalsimpl0(vicVar.mo28698getFillTypeRgk1Os(), bjc.f13877b.m28004getEvenOddRgk1Os())) {
                    sb.append("  <path fill-rule=\"evenodd\" d=\"");
                } else {
                    sb.append("  <path d=\"");
                }
            }
            while (it.hasNext()) {
                bkc.EnumC1929a enumC1929aNext$default = ijc.next$default(it, fArr, 0, 2, null);
                switch (C5355a.f33269a[enumC1929aNext$default.ordinal()]) {
                    case 1:
                        sb.append(command(bkc.EnumC1929a.Move, enumC1929a) + fArr[0] + ' ' + fArr[1]);
                        enumC1929a = enumC1929aNext$default;
                        break;
                    case 2:
                        sb.append(command(bkc.EnumC1929a.Line, enumC1929a) + fArr[2] + ' ' + fArr[3]);
                        enumC1929a = enumC1929aNext$default;
                        break;
                    case 3:
                        sb.append(command(bkc.EnumC1929a.Quadratic, enumC1929a));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fArr[2]);
                        sb2.append(' ');
                        sb2.append(fArr[3]);
                        sb2.append(' ');
                        sb2.append(fArr[4]);
                        sb2.append(' ');
                        sb2.append(fArr[5]);
                        sb.append(sb2.toString());
                        enumC1929a = enumC1929aNext$default;
                        break;
                    case 4:
                    case 7:
                        break;
                    case 5:
                        sb.append(command(bkc.EnumC1929a.Cubic, enumC1929a));
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(fArr[2]);
                        sb3.append(' ');
                        sb3.append(fArr[3]);
                        sb3.append(' ');
                        sb.append(sb3.toString());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(fArr[4]);
                        sb4.append(' ');
                        sb4.append(fArr[5]);
                        sb4.append(' ');
                        sb.append(sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(fArr[6]);
                        sb5.append(' ');
                        sb5.append(fArr[7]);
                        sb.append(sb5.toString());
                        enumC1929a = enumC1929aNext$default;
                        break;
                    case 6:
                        sb.append(command(bkc.EnumC1929a.Close, enumC1929a));
                        enumC1929a = enumC1929aNext$default;
                        break;
                    default:
                        enumC1929a = enumC1929aNext$default;
                        break;
                }
            }
            if (z) {
                sb.append("\"/>");
                md8.checkNotNullExpressionValue(sb, "append(value)");
                sb.append('\n');
                md8.checkNotNullExpressionValue(sb, "append('\\n')");
            }
        }
        if (z) {
            sb.append("</svg>");
            md8.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            md8.checkNotNullExpressionValue(sb, "append('\\n')");
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String toSvg$default(vic vicVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toSvg(vicVar, z);
    }
}

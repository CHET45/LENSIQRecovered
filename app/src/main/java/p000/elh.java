package p000;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import p000.n93;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class elh implements peg {

    /* JADX INFO: renamed from: h */
    public static final int f33364h = 2;

    /* JADX INFO: renamed from: i */
    public static final String f33365i = "Tx3gParser";

    /* JADX INFO: renamed from: j */
    public static final int f33366j = 1937013100;

    /* JADX INFO: renamed from: k */
    public static final int f33367k = 1952608120;

    /* JADX INFO: renamed from: l */
    public static final String f33368l = "Serif";

    /* JADX INFO: renamed from: m */
    public static final int f33369m = 8;

    /* JADX INFO: renamed from: n */
    public static final int f33370n = 2;

    /* JADX INFO: renamed from: o */
    public static final int f33371o = 12;

    /* JADX INFO: renamed from: p */
    public static final int f33372p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f33373q = 2;

    /* JADX INFO: renamed from: r */
    public static final int f33374r = 4;

    /* JADX INFO: renamed from: s */
    public static final int f33375s = 16711680;

    /* JADX INFO: renamed from: t */
    public static final int f33376t = 0;

    /* JADX INFO: renamed from: u */
    public static final int f33377u = 0;

    /* JADX INFO: renamed from: v */
    public static final int f33378v = -1;

    /* JADX INFO: renamed from: w */
    public static final String f33379w = "sans-serif";

    /* JADX INFO: renamed from: x */
    public static final float f33380x = 0.85f;

    /* JADX INFO: renamed from: a */
    public final jhc f33381a = new jhc();

    /* JADX INFO: renamed from: b */
    public final boolean f33382b;

    /* JADX INFO: renamed from: c */
    public final int f33383c;

    /* JADX INFO: renamed from: d */
    public final int f33384d;

    /* JADX INFO: renamed from: e */
    public final String f33385e;

    /* JADX INFO: renamed from: f */
    public final float f33386f;

    /* JADX INFO: renamed from: g */
    public final int f33387g;

    public elh(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f33383c = 0;
            this.f33384d = -1;
            this.f33385e = "sans-serif";
            this.f33382b = false;
            this.f33386f = 0.85f;
            this.f33387g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f33383c = bArr[24];
        this.f33384d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f33385e = "Serif".equals(t0i.fromUtf8Bytes(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f33387g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f33382b = z;
        if (z) {
            this.f33386f = t0i.constrainValue(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f33386f = 0.85f;
        }
    }

    private void applyStyleRecord(jhc jhcVar, SpannableStringBuilder spannableStringBuilder) {
        v80.checkArgument(jhcVar.bytesLeft() >= 12);
        int unsignedShort = jhcVar.readUnsignedShort();
        int unsignedShort2 = jhcVar.readUnsignedShort();
        jhcVar.skipBytes(2);
        int unsignedByte = jhcVar.readUnsignedByte();
        jhcVar.skipBytes(1);
        int i = jhcVar.readInt();
        if (unsignedShort2 > spannableStringBuilder.length()) {
            xh9.m25148w(f33365i, "Truncating styl end (" + unsignedShort2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            unsignedShort2 = spannableStringBuilder.length();
        }
        if (unsignedShort < unsignedShort2) {
            int i2 = unsignedShort2;
            attachFontFace(spannableStringBuilder, unsignedByte, this.f33383c, unsignedShort, i2, 0);
            attachColor(spannableStringBuilder, i, this.f33384d, unsignedShort, i2, 0);
            return;
        }
        xh9.m25148w(f33365i, "Ignoring styl with start (" + unsignedShort + ") >= end (" + unsignedShort2 + ").");
    }

    private static void attachColor(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void attachFontFace(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    private static void attachFontFamily(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    private static String readSubtitleText(jhc jhcVar) {
        v80.checkArgument(jhcVar.bytesLeft() >= 2);
        int unsignedShort = jhcVar.readUnsignedShort();
        if (unsignedShort == 0) {
            return "";
        }
        int position = jhcVar.getPosition();
        Charset utfCharsetFromBom = jhcVar.readUtfCharsetFromBom();
        int position2 = unsignedShort - (jhcVar.getPosition() - position);
        if (utfCharsetFromBom == null) {
            utfCharsetFromBom = StandardCharsets.UTF_8;
        }
        return jhcVar.readString(position2, utfCharsetFromBom);
    }

    @Override // p000.peg
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // p000.peg
    public void parse(byte[] bArr, int i, int i2, peg.C10937b c10937b, qu2<ba3> qu2Var) {
        this.f33381a.reset(bArr, i + i2);
        this.f33381a.setPosition(i);
        String subtitleText = readSubtitleText(this.f33381a);
        if (subtitleText.isEmpty()) {
            qu2Var.accept(new ba3(kx7.m15110of(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subtitleText);
        attachFontFace(spannableStringBuilder, this.f33383c, 0, 0, spannableStringBuilder.length(), 16711680);
        attachColor(spannableStringBuilder, this.f33384d, -1, 0, spannableStringBuilder.length(), 16711680);
        attachFontFamily(spannableStringBuilder, this.f33385e, 0, spannableStringBuilder.length());
        float fConstrainValue = this.f33386f;
        while (this.f33381a.bytesLeft() >= 8) {
            int position = this.f33381a.getPosition();
            int i3 = this.f33381a.readInt();
            int i4 = this.f33381a.readInt();
            if (i4 == 1937013100) {
                v80.checkArgument(this.f33381a.bytesLeft() >= 2);
                int unsignedShort = this.f33381a.readUnsignedShort();
                for (int i5 = 0; i5 < unsignedShort; i5++) {
                    applyStyleRecord(this.f33381a, spannableStringBuilder);
                }
            } else if (i4 == 1952608120 && this.f33382b) {
                v80.checkArgument(this.f33381a.bytesLeft() >= 2);
                fConstrainValue = t0i.constrainValue(this.f33381a.readUnsignedShort() / this.f33387g, 0.0f, 0.95f);
            }
            this.f33381a.setPosition(position + i3);
        }
        qu2Var.accept(new ba3(kx7.m15111of(new n93.C9750c().setText(spannableStringBuilder).setLine(fConstrainValue, 0).setLineAnchor(0).build()), -9223372036854775807L, -9223372036854775807L));
    }
}

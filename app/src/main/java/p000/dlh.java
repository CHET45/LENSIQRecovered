package p000;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;
import p000.o93;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class dlh extends djf {

    /* JADX INFO: renamed from: A */
    public static final int f29987A = 2;

    /* JADX INFO: renamed from: B */
    public static final int f29988B = 12;

    /* JADX INFO: renamed from: C */
    public static final int f29989C = 1;

    /* JADX INFO: renamed from: D */
    public static final int f29990D = 2;

    /* JADX INFO: renamed from: E */
    public static final int f29991E = 4;

    /* JADX INFO: renamed from: F */
    public static final int f29992F = 16711680;

    /* JADX INFO: renamed from: G */
    public static final int f29993G = 0;

    /* JADX INFO: renamed from: H */
    public static final int f29994H = 0;

    /* JADX INFO: renamed from: I */
    public static final int f29995I = -1;

    /* JADX INFO: renamed from: J */
    public static final String f29996J = "sans-serif";

    /* JADX INFO: renamed from: K */
    public static final float f29997K = 0.85f;

    /* JADX INFO: renamed from: v */
    public static final String f29998v = "Tx3gDecoder";

    /* JADX INFO: renamed from: w */
    public static final int f29999w = 1937013100;

    /* JADX INFO: renamed from: x */
    public static final int f30000x = 1952608120;

    /* JADX INFO: renamed from: y */
    public static final String f30001y = "Serif";

    /* JADX INFO: renamed from: z */
    public static final int f30002z = 8;

    /* JADX INFO: renamed from: o */
    public final ihc f30003o;

    /* JADX INFO: renamed from: p */
    public final boolean f30004p;

    /* JADX INFO: renamed from: q */
    public final int f30005q;

    /* JADX INFO: renamed from: r */
    public final int f30006r;

    /* JADX INFO: renamed from: s */
    public final String f30007s;

    /* JADX INFO: renamed from: t */
    public final float f30008t;

    /* JADX INFO: renamed from: u */
    public final int f30009u;

    public dlh(List<byte[]> list) {
        super(f29998v);
        this.f30003o = new ihc();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f30005q = 0;
            this.f30006r = -1;
            this.f30007s = "sans-serif";
            this.f30004p = false;
            this.f30008t = 0.85f;
            this.f30009u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f30005q = bArr[24];
        this.f30006r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f30007s = "Serif".equals(x0i.fromUtf8Bytes(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f30009u = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f30004p = z;
        if (z) {
            this.f30008t = x0i.constrainValue(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f30008t = 0.85f;
        }
    }

    private void applyStyleRecord(ihc ihcVar, SpannableStringBuilder spannableStringBuilder) throws beg {
        assertTrue(ihcVar.bytesLeft() >= 12);
        int unsignedShort = ihcVar.readUnsignedShort();
        int unsignedShort2 = ihcVar.readUnsignedShort();
        ihcVar.skipBytes(2);
        int unsignedByte = ihcVar.readUnsignedByte();
        ihcVar.skipBytes(1);
        int i = ihcVar.readInt();
        if (unsignedShort2 > spannableStringBuilder.length()) {
            yh9.m25919w(f29998v, "Truncating styl end (" + unsignedShort2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            unsignedShort2 = spannableStringBuilder.length();
        }
        if (unsignedShort < unsignedShort2) {
            int i2 = unsignedShort2;
            attachFontFace(spannableStringBuilder, unsignedByte, this.f30005q, unsignedShort, i2, 0);
            attachColor(spannableStringBuilder, i, this.f30006r, unsignedShort, i2, 0);
            return;
        }
        yh9.m25919w(f29998v, "Ignoring styl with start (" + unsignedShort + ") >= end (" + unsignedShort2 + ").");
    }

    private static void assertTrue(boolean z) throws beg {
        if (!z) {
            throw new beg("Unexpected subtitle format.");
        }
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

    private static String readSubtitleText(ihc ihcVar) throws beg {
        assertTrue(ihcVar.bytesLeft() >= 2);
        int unsignedShort = ihcVar.readUnsignedShort();
        if (unsignedShort == 0) {
            return "";
        }
        int position = ihcVar.getPosition();
        Charset utfCharsetFromBom = ihcVar.readUtfCharsetFromBom();
        int position2 = unsignedShort - (ihcVar.getPosition() - position);
        if (utfCharsetFromBom == null) {
            utfCharsetFromBom = yw1.f103176c;
        }
        return ihcVar.readString(position2, utfCharsetFromBom);
    }

    @Override // p000.djf
    /* JADX INFO: renamed from: l */
    public xdg mo9213l(byte[] bArr, int i, boolean z) throws beg {
        this.f30003o.reset(bArr, i);
        String subtitleText = readSubtitleText(this.f30003o);
        if (subtitleText.isEmpty()) {
            return flh.f37091b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subtitleText);
        attachFontFace(spannableStringBuilder, this.f30005q, 0, 0, spannableStringBuilder.length(), 16711680);
        attachColor(spannableStringBuilder, this.f30006r, -1, 0, spannableStringBuilder.length(), 16711680);
        attachFontFamily(spannableStringBuilder, this.f30007s, 0, spannableStringBuilder.length());
        float fConstrainValue = this.f30008t;
        while (this.f30003o.bytesLeft() >= 8) {
            int position = this.f30003o.getPosition();
            int i2 = this.f30003o.readInt();
            int i3 = this.f30003o.readInt();
            if (i3 == 1937013100) {
                assertTrue(this.f30003o.bytesLeft() >= 2);
                int unsignedShort = this.f30003o.readUnsignedShort();
                for (int i4 = 0; i4 < unsignedShort; i4++) {
                    applyStyleRecord(this.f30003o, spannableStringBuilder);
                }
            } else if (i3 == 1952608120 && this.f30004p) {
                assertTrue(this.f30003o.bytesLeft() >= 2);
                fConstrainValue = x0i.constrainValue(this.f30003o.readUnsignedShort() / this.f30009u, 0.0f, 0.95f);
            }
            this.f30003o.setPosition(position + i2);
        }
        return new flh(new o93.C10261c().setText(spannableStringBuilder).setLine(fConstrainValue, 0).setLineAnchor(0).build());
    }
}

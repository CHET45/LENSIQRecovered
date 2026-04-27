package p000;

import android.os.Parcel;
import android.util.Base64;
import p000.fp6;
import p000.gp6;
import p000.jwg;
import p000.lwg;
import p000.w82;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class e15 {

    /* JADX INFO: renamed from: b */
    public static final int f31497b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public Parcel f31498a = Parcel.obtain();

    public final void encode(@yfb swf swfVar) {
        long jM32350getColor0d7_KjU = swfVar.m32350getColor0d7_KjU();
        w82.C14471a c14471a = w82.f93556b;
        if (!w82.m32952equalsimpl0(jM32350getColor0d7_KjU, c14471a.m32987getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m28724encode8_81llA(swfVar.m32350getColor0d7_KjU());
        }
        long jM32351getFontSizeXSAIIZE = swfVar.m32351getFontSizeXSAIIZE();
        jwg.C8129a c8129a = jwg.f52146b;
        if (!jwg.m30610equalsimpl0(jM32351getFontSizeXSAIIZE, c8129a.m30624getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m28721encodeR2X_6o(swfVar.m32351getFontSizeXSAIIZE());
        }
        jp6 fontWeight = swfVar.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        fp6 fp6VarM32352getFontStyle4Lr2A7w = swfVar.m32352getFontStyle4Lr2A7w();
        if (fp6VarM32352getFontStyle4Lr2A7w != null) {
            int iM29578unboximpl = fp6VarM32352getFontStyle4Lr2A7w.m29578unboximpl();
            encode((byte) 4);
            m28726encodenzbMABs(iM29578unboximpl);
        }
        gp6 gp6VarM32353getFontSynthesisZQGJjVo = swfVar.m32353getFontSynthesisZQGJjVo();
        if (gp6VarM32353getFontSynthesisZQGJjVo != null) {
            int iM29848unboximpl = gp6VarM32353getFontSynthesisZQGJjVo.m29848unboximpl();
            encode((byte) 5);
            m28723encode6p3vJLY(iM29848unboximpl);
        }
        String fontFeatureSettings = swfVar.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!jwg.m30610equalsimpl0(swfVar.m32354getLetterSpacingXSAIIZE(), c8129a.m30624getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m28721encodeR2X_6o(swfVar.m32354getLetterSpacingXSAIIZE());
        }
        gv0 gv0VarM32349getBaselineShift5SSeXJ0 = swfVar.m32349getBaselineShift5SSeXJ0();
        if (gv0VarM32349getBaselineShift5SSeXJ0 != null) {
            float fM29865unboximpl = gv0VarM32349getBaselineShift5SSeXJ0.m29865unboximpl();
            encode((byte) 8);
            m28722encode4Dl_Bck(fM29865unboximpl);
        }
        ftg textGeometricTransform = swfVar.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!w82.m32952equalsimpl0(swfVar.m32348getBackground0d7_KjU(), c14471a.m32987getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m28724encode8_81llA(swfVar.m32348getBackground0d7_KjU());
        }
        qqg textDecoration = swfVar.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        e8f shadow = swfVar.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* JADX INFO: renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m28721encodeR2X_6o(long j) {
        long jM30612getTypeUIouoOA = jwg.m30612getTypeUIouoOA(j);
        lwg.C9014a c9014a = lwg.f59101b;
        byte b = 0;
        if (!lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30924getUnspecifiedUIouoOA())) {
            if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30923getSpUIouoOA())) {
                b = 1;
            } else if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30922getEmUIouoOA())) {
                b = 2;
            }
        }
        encode(b);
        if (lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(j), c9014a.m30924getUnspecifiedUIouoOA())) {
            return;
        }
        encode(jwg.m30613getValueimpl(j));
    }

    /* JADX INFO: renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m28722encode4Dl_Bck(float f) {
        encode(f);
    }

    /* JADX INFO: renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m28723encode6p3vJLY(int i) {
        gp6.C6453a c6453a = gp6.f40694b;
        byte b = 0;
        if (!gp6.m29843equalsimpl0(i, c6453a.m29850getNoneGVVA2EU())) {
            if (gp6.m29843equalsimpl0(i, c6453a.m29849getAllGVVA2EU())) {
                b = 1;
            } else if (gp6.m29843equalsimpl0(i, c6453a.m29852getWeightGVVA2EU())) {
                b = 2;
            } else if (gp6.m29843equalsimpl0(i, c6453a.m29851getStyleGVVA2EU())) {
                b = 3;
            }
        }
        encode(b);
    }

    /* JADX INFO: renamed from: encode-8_81llA, reason: not valid java name */
    public final void m28724encode8_81llA(long j) {
        m28725encodeVKZWuLQ(j);
    }

    /* JADX INFO: renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m28725encodeVKZWuLQ(long j) {
        this.f31498a.writeLong(j);
    }

    /* JADX INFO: renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m28726encodenzbMABs(int i) {
        fp6.C5920a c5920a = fp6.f37355b;
        byte b = 0;
        if (!fp6.m29575equalsimpl0(i, c5920a.m29582getNormal_LCdwA()) && fp6.m29575equalsimpl0(i, c5920a.m29581getItalic_LCdwA())) {
            b = 1;
        }
        encode(b);
    }

    @yfb
    public final String encodedString() {
        return Base64.encodeToString(this.f31498a.marshall(), 0);
    }

    public final void reset() {
        this.f31498a.recycle();
        this.f31498a = Parcel.obtain();
    }

    public final void encode(@yfb jp6 jp6Var) {
        encode(jp6Var.getWeight());
    }

    public final void encode(@yfb ftg ftgVar) {
        encode(ftgVar.getScaleX());
        encode(ftgVar.getSkewX());
    }

    public final void encode(@yfb qqg qqgVar) {
        encode(qqgVar.getMask());
    }

    public final void encode(@yfb e8f e8fVar) {
        m28724encode8_81llA(e8fVar.m28817getColor0d7_KjU());
        encode(izb.m30429getXimpl(e8fVar.m28818getOffsetF1C5BW0()));
        encode(izb.m30430getYimpl(e8fVar.m28818getOffsetF1C5BW0()));
        encode(e8fVar.getBlurRadius());
    }

    public final void encode(byte b) {
        this.f31498a.writeByte(b);
    }

    public final void encode(int i) {
        this.f31498a.writeInt(i);
    }

    public final void encode(float f) {
        this.f31498a.writeFloat(f);
    }

    public final void encode(@yfb String str) {
        this.f31498a.writeString(str);
    }
}

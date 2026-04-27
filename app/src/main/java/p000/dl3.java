package p000;

import android.os.Parcel;
import android.util.Base64;
import p000.qqg;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class dl3 {

    /* JADX INFO: renamed from: b */
    public static final int f29936b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Parcel f29937a;

    public dl3(@yfb String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f29937a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.f29937a.dataAvail();
    }

    /* JADX INFO: renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m28648decodeBaselineShifty9eOQZs() {
        return gv0.m29860constructorimpl(decodeFloat());
    }

    private final byte decodeByte() {
        return this.f29937a.readByte();
    }

    private final float decodeFloat() {
        return this.f29937a.readFloat();
    }

    private final int decodeInt() {
        return this.f29937a.readInt();
    }

    private final e8f decodeShadow() {
        return new e8f(m28650decodeColor0d7_KjU(), mzb.Offset(decodeFloat(), decodeFloat()), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.f29937a.readString();
    }

    private final qqg decodeTextDecoration() {
        int iDecodeInt = decodeInt();
        qqg.C11588a c11588a = qqg.f75141b;
        boolean z = (c11588a.getLineThrough().getMask() & iDecodeInt) != 0;
        boolean z2 = (iDecodeInt & c11588a.getUnderline().getMask()) != 0;
        return (z && z2) ? c11588a.combine(l82.listOf((Object[]) new qqg[]{c11588a.getLineThrough(), c11588a.getUnderline()})) : z ? c11588a.getLineThrough() : z2 ? c11588a.getUnderline() : c11588a.getNone();
    }

    private final ftg decodeTextGeometricTransform() {
        return new ftg(decodeFloat(), decodeFloat());
    }

    /* JADX INFO: renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m28649decodeULongsVKNKU() {
        return oph.m31533constructorimpl(this.f29937a.readLong());
    }

    /* JADX INFO: renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m28650decodeColor0d7_KjU() {
        return w82.m32947constructorimpl(m28649decodeULongsVKNKU());
    }

    /* JADX INFO: renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m28651decodeFontStyle_LCdwA() {
        byte bDecodeByte = decodeByte();
        if (bDecodeByte != 0 && bDecodeByte == 1) {
            return fp6.f37355b.m29581getItalic_LCdwA();
        }
        return fp6.f37355b.m29582getNormal_LCdwA();
    }

    /* JADX INFO: renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m28652decodeFontSynthesisGVVA2EU() {
        byte bDecodeByte = decodeByte();
        return bDecodeByte == 0 ? gp6.f40694b.m29850getNoneGVVA2EU() : bDecodeByte == 1 ? gp6.f40694b.m29849getAllGVVA2EU() : bDecodeByte == 3 ? gp6.f40694b.m29851getStyleGVVA2EU() : bDecodeByte == 2 ? gp6.f40694b.m29852getWeightGVVA2EU() : gp6.f40694b.m29850getNoneGVVA2EU();
    }

    @yfb
    public final jp6 decodeFontWeight() {
        return new jp6(decodeInt());
    }

    @yfb
    public final swf decodeSpanStyle() {
        y6b y6bVar;
        y6b y6bVar2 = y6bVar;
        y6b y6bVar3 = new y6b(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f29937a.dataAvail() > 1) {
            byte bDecodeByte = decodeByte();
            if (bDecodeByte != 1) {
                y6bVar = y6bVar2;
                if (bDecodeByte == 2) {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    y6bVar.m33372setFontSizeR2X_6o(m28653decodeTextUnitXSAIIZE());
                    y6bVar2 = y6bVar;
                } else if (bDecodeByte == 3) {
                    if (dataAvailable() < 4) {
                        break;
                    }
                    y6bVar.setFontWeight(decodeFontWeight());
                    y6bVar2 = y6bVar;
                } else if (bDecodeByte == 4) {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    y6bVar.m33373setFontStylemLjRB2g(fp6.m29572boximpl(m28651decodeFontStyle_LCdwA()));
                    y6bVar2 = y6bVar;
                } else if (bDecodeByte != 5) {
                    if (bDecodeByte != 6) {
                        if (bDecodeByte != 7) {
                            if (bDecodeByte != 8) {
                                if (bDecodeByte != 9) {
                                    if (bDecodeByte != 10) {
                                        if (bDecodeByte != 11) {
                                            if (bDecodeByte == 12) {
                                                if (dataAvailable() < 20) {
                                                    break;
                                                }
                                                y6bVar.setShadow(decodeShadow());
                                            }
                                        } else {
                                            if (dataAvailable() < 4) {
                                                break;
                                            }
                                            y6bVar.setTextDecoration(decodeTextDecoration());
                                        }
                                    } else {
                                        if (dataAvailable() < 8) {
                                            break;
                                        }
                                        y6bVar.m33369setBackground8_81llA(m28650decodeColor0d7_KjU());
                                    }
                                } else {
                                    if (dataAvailable() < 8) {
                                        break;
                                    }
                                    y6bVar.setTextGeometricTransform(decodeTextGeometricTransform());
                                }
                            } else {
                                if (dataAvailable() < 4) {
                                    break;
                                }
                                y6bVar.m33370setBaselineShift_isdbwI(gv0.m29859boximpl(m28648decodeBaselineShifty9eOQZs()));
                            }
                        } else {
                            if (dataAvailable() < 5) {
                                break;
                            }
                            y6bVar.m33375setLetterSpacingR2X_6o(m28653decodeTextUnitXSAIIZE());
                        }
                    } else {
                        y6bVar.setFontFeatureSettings(decodeString());
                    }
                    y6bVar2 = y6bVar;
                } else {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    y6bVar.m33374setFontSynthesistDdu0R4(gp6.m29840boximpl(m28652decodeFontSynthesisGVVA2EU()));
                    y6bVar2 = y6bVar;
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                y6bVar2.m33371setColor8_81llA(m28650decodeColor0d7_KjU());
            }
        }
        y6bVar = y6bVar2;
        return y6bVar.toSpanStyle();
    }

    /* JADX INFO: renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m28653decodeTextUnitXSAIIZE() {
        byte bDecodeByte = decodeByte();
        long jM30923getSpUIouoOA = bDecodeByte == 1 ? lwg.f59101b.m30923getSpUIouoOA() : bDecodeByte == 2 ? lwg.f59101b.m30922getEmUIouoOA() : lwg.f59101b.m30924getUnspecifiedUIouoOA();
        return lwg.m30918equalsimpl0(jM30923getSpUIouoOA, lwg.f59101b.m30924getUnspecifiedUIouoOA()) ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : kwg.m30784TextUnitanM5pPY(decodeFloat(), jM30923getSpUIouoOA);
    }
}

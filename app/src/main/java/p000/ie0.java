package p000;

import java.nio.ByteBuffer;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ie0 {

    /* JADX INFO: renamed from: a */
    public static final float f46584a = -1.0f;

    /* JADX INFO: renamed from: b */
    public static final float f46585b = 1.0f;

    private ie0() {
    }

    public static boolean canMix(hf0.C6832a c6832a) {
        if (c6832a.f43350a == -1 || c6832a.f43351b == -1) {
            return false;
        }
        int i = c6832a.f43352c;
        return i == 2 || i == 4;
    }

    private static float floatSampleToInt16Pcm(float f) {
        return t0i.constrainValue(f * (f < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
    }

    private static float getPcmSample(ByteBuffer byteBuffer, boolean z, boolean z2) {
        return z2 ? z ? byteBuffer.getShort() : floatSampleToInt16Pcm(byteBuffer.getFloat()) : z ? int16SampleToFloatPcm(byteBuffer.getShort()) : byteBuffer.getFloat();
    }

    private static float int16SampleToFloatPcm(short s) {
        return s / (s < 0 ? 32768 : 32767);
    }

    public static ByteBuffer mix(ByteBuffer byteBuffer, hf0.C6832a c6832a, ByteBuffer byteBuffer2, hf0.C6832a c6832a2, wu1 wu1Var, int i, boolean z, boolean z2) {
        hf0.C6832a c6832a3;
        boolean z3;
        if (c6832a.f43352c == 2) {
            c6832a3 = c6832a2;
            z3 = true;
        } else {
            c6832a3 = c6832a2;
            z3 = false;
        }
        boolean z4 = c6832a3.f43352c == 2;
        int inputChannelCount = wu1Var.getInputChannelCount();
        int outputChannelCount = wu1Var.getOutputChannelCount();
        float[] fArr = new float[inputChannelCount];
        float[] fArr2 = new float[outputChannelCount];
        for (int i2 = 0; i2 < i; i2++) {
            if (z) {
                int iPosition = byteBuffer2.position();
                for (int i3 = 0; i3 < outputChannelCount; i3++) {
                    fArr2[i3] = getPcmSample(byteBuffer2, z4, z4);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i4 = 0; i4 < inputChannelCount; i4++) {
                fArr[i4] = getPcmSample(byteBuffer, z3, z4);
            }
            for (int i5 = 0; i5 < outputChannelCount; i5++) {
                for (int i6 = 0; i6 < inputChannelCount; i6++) {
                    fArr2[i5] = fArr2[i5] + (fArr[i6] * wu1Var.getMixingCoefficient(i6, i5));
                }
                if (z4) {
                    byteBuffer2.putShort((short) t0i.constrainValue(fArr2[i5], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(z2 ? t0i.constrainValue(fArr2[i5], -1.0f, 1.0f) : fArr2[i5]);
                }
                fArr2[i5] = 0.0f;
            }
        }
        return byteBuffer2;
    }

    public static boolean canMix(hf0.C6832a c6832a, hf0.C6832a c6832a2) {
        return c6832a.f43350a == c6832a2.f43350a && canMix(c6832a) && canMix(c6832a2);
    }
}

package p000;

import android.media.MediaFormat;
import com.arthenica.ffmpegkit.StreamInformation;
import com.watchfun.callvideo.base.BaseCallActivity;
import java.nio.ByteBuffer;
import java.util.List;
import p000.f92;
import p000.kq6;
import p000.kx7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ifa {

    /* JADX INFO: renamed from: a */
    public static final String f46731a = "exo-pixel-width-height-ratio-float";

    /* JADX INFO: renamed from: b */
    public static final String f46732b = "exo-pcm-encoding-int";

    /* JADX INFO: renamed from: c */
    public static final String f46733c = "max-bitrate";

    /* JADX INFO: renamed from: d */
    public static final int f46734d = 1073741824;

    private ifa() {
    }

    @igg({"InlinedApi"})
    public static kq6 createFormatFromMediaFormat(MediaFormat mediaFormat) {
        int i = 0;
        kq6.C8497b pcmEncoding = new kq6.C8497b().setSampleMimeType(mediaFormat.getString("mime")).setLanguage(mediaFormat.getString(BaseCallActivity.f25142j2)).setPeakBitrate(getInteger(mediaFormat, "max-bitrate", -1)).setAverageBitrate(getInteger(mediaFormat, "bitrate", -1)).setCodecs(mediaFormat.getString("codecs-string")).setFrameRate(getFrameRate(mediaFormat, -1.0f)).setWidth(getInteger(mediaFormat, StreamInformation.KEY_WIDTH, -1)).setHeight(getInteger(mediaFormat, StreamInformation.KEY_HEIGHT, -1)).setPixelWidthHeightRatio(getPixelWidthHeightRatio(mediaFormat, 1.0f)).setMaxInputSize(getInteger(mediaFormat, "max-input-size", -1)).setRotationDegrees(getInteger(mediaFormat, "rotation-degrees", 0)).setColorInfo(getColorInfo(mediaFormat, true)).setSampleRate(getInteger(mediaFormat, "sample-rate", -1)).setChannelCount(getInteger(mediaFormat, "channel-count", -1)).setPcmEncoding(getInteger(mediaFormat, "pcm-encoding", -1));
        kx7.C8541a c8541a = new kx7.C8541a();
        while (true) {
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-" + i);
            if (byteBuffer == null) {
                pcmEncoding.setInitializationData(c8541a.build());
                return pcmEncoding.build();
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            byteBuffer.rewind();
            c8541a.add(bArr);
            i++;
        }
    }

    @igg({"InlinedApi"})
    public static MediaFormat createMediaFormatFromFormat(kq6 kq6Var) {
        MediaFormat mediaFormat = new MediaFormat();
        maybeSetInteger(mediaFormat, "bitrate", kq6Var.f54985C);
        maybeSetInteger(mediaFormat, "max-bitrate", kq6Var.f55016m);
        maybeSetInteger(mediaFormat, "channel-count", kq6Var.f55007e2);
        maybeSetColorInfo(mediaFormat, kq6Var.f55005d2);
        maybeSetString(mediaFormat, "mime", kq6Var.f54989M);
        maybeSetString(mediaFormat, "codecs-string", kq6Var.f54986F);
        maybeSetFloat(mediaFormat, "frame-rate", kq6Var.f54993V1);
        maybeSetInteger(mediaFormat, StreamInformation.KEY_WIDTH, kq6Var.f54996Z);
        maybeSetInteger(mediaFormat, StreamInformation.KEY_HEIGHT, kq6Var.f54990M1);
        setCsdBuffers(mediaFormat, kq6Var.f54992Q);
        maybeSetPcmEncoding(mediaFormat, kq6Var.f55010g2);
        maybeSetString(mediaFormat, BaseCallActivity.f25142j2, kq6Var.f55002c);
        maybeSetInteger(mediaFormat, "max-input-size", kq6Var.f54991N);
        maybeSetInteger(mediaFormat, "sample-rate", kq6Var.f55009f2);
        maybeSetInteger(mediaFormat, "caption-service-number", kq6Var.f55013j2);
        mediaFormat.setInteger("rotation-degrees", kq6Var.f54997Z1);
        int i = kq6Var.f55004d;
        setBooleanAsInt(mediaFormat, "is-autoselect", i & 4);
        setBooleanAsInt(mediaFormat, "is-default", i & 1);
        setBooleanAsInt(mediaFormat, "is-forced-subtitle", i & 2);
        mediaFormat.setInteger("encoder-delay", kq6Var.f55011h2);
        mediaFormat.setInteger("encoder-padding", kq6Var.f55012i2);
        maybeSetPixelAspectRatio(mediaFormat, kq6Var.f54999a2);
        return mediaFormat;
    }

    public static byte[] getArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @hib
    public static f92 getColorInfo(MediaFormat mediaFormat) {
        return getColorInfo(mediaFormat, false);
    }

    public static float getFloat(MediaFormat mediaFormat, String str, float f) {
        return mediaFormat.containsKey(str) ? mediaFormat.getFloat(str) : f;
    }

    private static float getFrameRate(MediaFormat mediaFormat, float f) {
        if (!mediaFormat.containsKey("frame-rate")) {
            return f;
        }
        try {
            return mediaFormat.getFloat("frame-rate");
        } catch (ClassCastException unused) {
            return mediaFormat.getInteger("frame-rate");
        }
    }

    public static int getInteger(MediaFormat mediaFormat, String str, int i) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }

    @igg({"InlinedApi"})
    private static float getPixelWidthHeightRatio(MediaFormat mediaFormat, float f) {
        return (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : f;
    }

    @hib
    public static Integer getTimeLapseFrameRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) {
            return Integer.valueOf(mediaFormat.getInteger("time-lapse-fps"));
        }
        return null;
    }

    public static boolean isAudioFormat(MediaFormat mediaFormat) {
        return sva.isAudio(mediaFormat.getString("mime"));
    }

    private static boolean isValidColorRange(int i) {
        return i == 2 || i == 1 || i == -1;
    }

    private static boolean isValidColorSpace(int i) {
        return i == 2 || i == 1 || i == 6 || i == -1;
    }

    private static boolean isValidColorTransfer(int i) {
        return i == 1 || i == 3 || i == 6 || i == 7 || i == -1;
    }

    public static boolean isVideoFormat(MediaFormat mediaFormat) {
        return sva.isVideo(mediaFormat.getString("mime"));
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, @hib byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, @hib f92 f92Var) {
        if (f92Var != null) {
            maybeSetInteger(mediaFormat, "color-transfer", f92Var.f35739c);
            maybeSetInteger(mediaFormat, "color-standard", f92Var.f35737a);
            maybeSetInteger(mediaFormat, "color-range", f92Var.f35738b);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", f92Var.f35740d);
        }
    }

    public static void maybeSetFloat(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void maybeSetInteger(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @igg({"InlinedApi"})
    private static void maybeSetPcmEncoding(MediaFormat mediaFormat, int i) {
        int i2;
        if (i == -1) {
            return;
        }
        maybeSetInteger(mediaFormat, "exo-pcm-encoding-int", i);
        if (i == 0) {
            i2 = 0;
        } else if (i == 536870912) {
            i2 = 21;
        } else if (i != 805306368) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return;
                    }
                }
            }
        } else {
            i2 = 22;
        }
        mediaFormat.setInteger("pcm-encoding", i2);
    }

    @igg({"InlinedApi"})
    private static void maybeSetPixelAspectRatio(MediaFormat mediaFormat, float f) {
        int i;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f);
        int i2 = 1073741824;
        if (f < 1.0f) {
            i2 = (int) (f * 1073741824);
            i = 1073741824;
        } else if (f > 1.0f) {
            i = (int) (1073741824 / f);
        } else {
            i2 = 1;
            i = 1;
        }
        mediaFormat.setInteger("sar-width", i2);
        mediaFormat.setInteger("sar-height", i);
    }

    public static void maybeSetString(MediaFormat mediaFormat, String str, @hib String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    private static void setBooleanAsInt(MediaFormat mediaFormat, String str, int i) {
        mediaFormat.setInteger(str, i != 0 ? 1 : 0);
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }

    @hib
    private static f92 getColorInfo(MediaFormat mediaFormat, boolean z) {
        if (x0i.f95978a < 24) {
            return null;
        }
        int integer = getInteger(mediaFormat, "color-standard", -1);
        int integer2 = getInteger(mediaFormat, "color-range", -1);
        int integer3 = getInteger(mediaFormat, "color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] array = byteBuffer != null ? getArray(byteBuffer) : null;
        if (!z) {
            if (!isValidColorSpace(integer)) {
                integer = -1;
            }
            if (!isValidColorRange(integer2)) {
                integer2 = -1;
            }
            if (!isValidColorTransfer(integer3)) {
                integer3 = -1;
            }
        }
        if (integer == -1 && integer2 == -1 && integer3 == -1 && array == null) {
            return null;
        }
        return new f92.C5680b().setColorSpace(integer).setColorRange(integer2).setColorTransfer(integer3).setHdrStaticInfo(array).build();
    }
}

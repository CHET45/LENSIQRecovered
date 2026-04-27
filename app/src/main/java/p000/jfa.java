package p000;

import android.media.MediaFormat;
import androidx.media3.common.C1213a;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.watchfun.callvideo.base.BaseCallActivity;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import p000.e92;
import p000.kx7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class jfa {

    /* JADX INFO: renamed from: a */
    public static final String f50448a = "exo-pixel-width-height-ratio-float";

    /* JADX INFO: renamed from: b */
    public static final String f50449b = "exo-pcm-encoding-int";

    /* JADX INFO: renamed from: c */
    public static final String f50450c = "max-bitrate";

    /* JADX INFO: renamed from: d */
    public static final int f50451d = 1073741824;

    private jfa() {
    }

    @igg({"InlinedApi"})
    public static C1213a createFormatFromMediaFormat(MediaFormat mediaFormat) {
        int i = 0;
        C1213a.b pcmEncoding = new C1213a.b().setSampleMimeType(mediaFormat.getString("mime")).setLanguage(mediaFormat.getString(BaseCallActivity.f25142j2)).setPeakBitrate(getInteger(mediaFormat, "max-bitrate", -1)).setAverageBitrate(getInteger(mediaFormat, "bitrate", -1)).setCodecs(getCodecString(mediaFormat)).setFrameRate(getFrameRate(mediaFormat, -1.0f)).setWidth(getInteger(mediaFormat, StreamInformation.KEY_WIDTH, -1)).setHeight(getInteger(mediaFormat, StreamInformation.KEY_HEIGHT, -1)).setPixelWidthHeightRatio(getPixelWidthHeightRatio(mediaFormat, 1.0f)).setMaxInputSize(getInteger(mediaFormat, "max-input-size", -1)).setRotationDegrees(getInteger(mediaFormat, "rotation-degrees", 0)).setColorInfo(getColorInfo(mediaFormat)).setSampleRate(getInteger(mediaFormat, "sample-rate", -1)).setChannelCount(getInteger(mediaFormat, "channel-count", -1)).setPcmEncoding(getInteger(mediaFormat, "pcm-encoding", -1));
        kx7.C8541a c8541a = new kx7.C8541a();
        while (true) {
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-" + i);
            if (byteBuffer == null) {
                break;
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            byteBuffer.rewind();
            c8541a.add(bArr);
            i++;
        }
        pcmEncoding.setInitializationData(c8541a.build());
        if (mediaFormat.containsKey("track-id")) {
            pcmEncoding.setId(mediaFormat.getInteger("track-id"));
        }
        return pcmEncoding.build();
    }

    @igg({"InlinedApi"})
    public static MediaFormat createMediaFormatFromFormat(C1213a c1213a) {
        MediaFormat mediaFormat = new MediaFormat();
        maybeSetInteger(mediaFormat, "bitrate", c1213a.f8286j);
        maybeSetInteger(mediaFormat, "max-bitrate", c1213a.f8285i);
        maybeSetInteger(mediaFormat, "channel-count", c1213a.f8266G);
        maybeSetColorInfo(mediaFormat, c1213a.f8264E);
        maybeSetString(mediaFormat, "mime", c1213a.f8291o);
        maybeSetString(mediaFormat, "codecs-string", c1213a.f8287k);
        maybeSetFloat(mediaFormat, "frame-rate", c1213a.f8302z);
        maybeSetInteger(mediaFormat, StreamInformation.KEY_WIDTH, c1213a.f8298v);
        maybeSetInteger(mediaFormat, StreamInformation.KEY_HEIGHT, c1213a.f8299w);
        setCsdBuffers(mediaFormat, c1213a.f8294r);
        maybeSetPcmEncoding(mediaFormat, c1213a.f8268I);
        maybeSetString(mediaFormat, BaseCallActivity.f25142j2, c1213a.f8280d);
        maybeSetInteger(mediaFormat, "max-input-size", c1213a.f8292p);
        maybeSetInteger(mediaFormat, "sample-rate", c1213a.f8267H);
        maybeSetInteger(mediaFormat, "caption-service-number", c1213a.f8271L);
        mediaFormat.setInteger("rotation-degrees", c1213a.f8260A);
        int i = c1213a.f8281e;
        setBooleanAsInt(mediaFormat, "is-autoselect", i & 4);
        setBooleanAsInt(mediaFormat, "is-default", i & 1);
        setBooleanAsInt(mediaFormat, "is-forced-subtitle", i & 2);
        mediaFormat.setInteger("encoder-delay", c1213a.f8269J);
        mediaFormat.setInteger("encoder-padding", c1213a.f8270K);
        maybeSetPixelAspectRatio(mediaFormat, c1213a.f8261B);
        String str = c1213a.f8277a;
        if (str != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str));
            } catch (NumberFormatException unused) {
            }
        }
        return mediaFormat;
    }

    public static byte[] getArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @hib
    @igg({"InlinedApi"})
    private static String getCodecString(MediaFormat mediaFormat) {
        return (Objects.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey(Scopes.PROFILE) && mediaFormat.containsKey(FirebaseAnalytics.C3552d.f23228t)) ? d72.buildH263CodecString(mediaFormat.getInteger(Scopes.PROFILE), mediaFormat.getInteger(FirebaseAnalytics.C3552d.f23228t)) : (Objects.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey(Scopes.PROFILE) && mediaFormat.containsKey(FirebaseAnalytics.C3552d.f23228t)) ? d72.buildDolbyVisionCodecString(d72.dolbyVisionConstantToProfileNumber(mediaFormat.getInteger(Scopes.PROFILE)), d72.dolbyVisionConstantToLevelNumber(mediaFormat.getInteger(FirebaseAnalytics.C3552d.f23228t))) : getString(mediaFormat, "codecs-string", null);
    }

    @hib
    public static e92 getColorInfo(MediaFormat mediaFormat) {
        int integer = getInteger(mediaFormat, "color-standard", -1);
        int integer2 = getInteger(mediaFormat, "color-range", -1);
        int integer3 = getInteger(mediaFormat, "color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] array = byteBuffer != null ? getArray(byteBuffer) : null;
        if (!isValidColorSpace(integer)) {
            integer = -1;
        }
        if (!isValidColorRange(integer2)) {
            integer2 = -1;
        }
        if (!isValidColorTransfer(integer3)) {
            integer3 = -1;
        }
        if (integer == -1 && integer2 == -1 && integer3 == -1 && array == null) {
            return null;
        }
        return new e92.C5196b().setColorSpace(integer).setColorRange(integer2).setColorTransfer(integer3).setHdrStaticInfo(array).build();
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
    public static String getString(MediaFormat mediaFormat, String str, @hib String str2) {
        return mediaFormat.containsKey(str) ? mediaFormat.getString(str) : str2;
    }

    @hib
    public static Integer getTimeLapseFrameRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) {
            return Integer.valueOf(mediaFormat.getInteger("time-lapse-fps"));
        }
        return null;
    }

    public static boolean isAudioFormat(MediaFormat mediaFormat) {
        return rva.isAudio(mediaFormat.getString("mime"));
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
        return rva.isVideo(mediaFormat.getString("mime"));
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, @hib byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, @hib e92 e92Var) {
        if (e92Var != null) {
            maybeSetInteger(mediaFormat, "color-transfer", e92Var.f32175c);
            maybeSetInteger(mediaFormat, "color-standard", e92Var.f32173a);
            maybeSetInteger(mediaFormat, "color-range", e92Var.f32174b);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", e92Var.f32176d);
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
        if (i != 0) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 21;
                        if (i != 21) {
                            i2 = 22;
                            if (i != 22) {
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            i2 = 0;
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
}

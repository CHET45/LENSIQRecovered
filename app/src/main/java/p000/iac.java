package p000;

import android.media.MediaMetadataRetriever;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class iac {

    /* JADX INFO: renamed from: iac$a */
    public static /* synthetic */ class C7215a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46232a;

        static {
            int[] iArr = new int[EnumC7218d.values().length];
            f46232a = iArr;
            try {
                iArr[EnumC7218d.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46232a[EnumC7218d.MIN_SEC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46232a[EnumC7218d.HMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: iac$c */
    public static class C7217c {

        /* JADX INFO: renamed from: a */
        public static final int f46236a = 8000;

        /* JADX INFO: renamed from: b */
        public static final int f46237b = 16000;

        /* JADX INFO: renamed from: c */
        public static final int f46238c = 44100;

        /* JADX INFO: renamed from: d */
        public static final int f46239d = 48000;

        /* JADX INFO: renamed from: e */
        public static final int f46240e = 1;

        /* JADX INFO: renamed from: f */
        public static final int f46241f = 2;

        /* JADX INFO: renamed from: g */
        public static final int f46242g = 8;

        /* JADX INFO: renamed from: h */
        public static final int f46243h = 16;

        /* JADX INFO: renamed from: i */
        public static final int f46244i = 24;

        /* JADX INFO: renamed from: j */
        public static final int f46245j = 32;
    }

    /* JADX INFO: renamed from: iac$d */
    public enum EnumC7218d {
        FULL,
        MIN_SEC,
        HMS
    }

    /* JADX INFO: renamed from: iac$e */
    public static class C7219e {

        /* JADX INFO: renamed from: a */
        public boolean f46250a;

        /* JADX INFO: renamed from: b */
        public List<String> f46251b;

        /* JADX INFO: renamed from: c */
        public String f46252c;

        public C7219e(boolean z, List<String> list, String str) {
            this.f46250a = z;
            this.f46251b = list;
            this.f46252c = str;
        }

        public List<String> getErrors() {
            return this.f46251b;
        }

        public String getRecommendedFix() {
            return this.f46252c;
        }

        public boolean isValid() {
            return this.f46250a;
        }
    }

    public static double calculateDuration(long j, int i, int i2, int i3) {
        if (j <= 0 || i <= 0 || i2 <= 0 || i3 <= 0) {
            return 0.0d;
        }
        return j / (((double) (i * i2)) * (((double) i3) / 8.0d));
    }

    public static double calculateDurationFromAudioRecord(long j, C7216b c7216b) {
        return calculateDuration(j, c7216b.getSampleRate(), c7216b.getChannels(), c7216b.getBitsPerSample());
    }

    public static double calculateDurationFromBytes(byte[] bArr, C7216b c7216b) {
        if (bArr == null || bArr.length == 0) {
            return 0.0d;
        }
        return calculateDuration(bArr.length, c7216b.getSampleRate(), c7216b.getChannels(), c7216b.getBitsPerSample());
    }

    public static double calculateDurationFromRawPcm(File file, C7216b c7216b) {
        if (file == null || !file.exists()) {
            return 0.0d;
        }
        return calculateDuration(file.length(), c7216b.getSampleRate(), c7216b.getChannels(), c7216b.getBitsPerSample());
    }

    public static double calculateDurationFromWav(File file) throws Throwable {
        if (file == null || !file.exists() || file.length() < 44) {
            return -1.0d;
        }
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    byte[] bArr = new byte[44];
                    randomAccessFile2.readFully(bArr);
                    if (!isValidWavHeader(bArr)) {
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return -1.0d;
                    }
                    double dCalculateDuration = calculateDuration(parseDataSize(bArr), parseSampleRate(bArr), parseChannels(bArr), parseBitsPerSample(bArr));
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return dCalculateDuration;
                } catch (IOException e3) {
                    e = e3;
                    randomAccessFile = randomAccessFile2;
                    e.printStackTrace();
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return -1.0d;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e6) {
            e = e6;
        }
    }

    public static long calculateVoiceNoteDuration(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("totalBytes:");
        sb.append(j);
        if (j <= 0) {
            return 0L;
        }
        long jFloor = (long) Math.floor(j / (((double) 44100) * (((double) 16) / 8.0d)));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("calculateVoiceNoteDuration audioDuration:");
        sb2.append(jFloor);
        sb2.append(",totalBytes:");
        sb2.append(j);
        return jFloor;
    }

    public static long estimateMp3FileSize(double d, int i) {
        return (long) ((((double) (i * 1000)) / 8.0d) * d);
    }

    public static String formatDuration(double d, EnumC7218d enumC7218d) {
        long j = (long) (d * 1000.0d);
        int i = C7215a.f46232a[enumC7218d.ordinal()];
        if (i == 1) {
            return String.format("%.3f 秒", Double.valueOf(d));
        }
        if (i == 2) {
            return String.format("%d:%05.2f", Long.valueOf(j / 60000), Double.valueOf((j % 60000) / 1000.0d));
        }
        if (i != 3) {
            return String.format("%.3f 秒", Double.valueOf(d));
        }
        return String.format("%02d:%02d:%05.2f", Long.valueOf(j / 3600000), Long.valueOf((j % 3600000) / 60000), Double.valueOf((j % 60000) / 1000.0d));
    }

    public static long getMp3Duration(String str) {
        if (str == null || str.isEmpty()) {
            return -1L;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                long j = strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : -1L;
                if (j == -1) {
                    return -1L;
                }
                long jFloor = (long) Math.floor(j / 1000.0d);
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return jFloor;
            } catch (Exception e2) {
                e2.printStackTrace();
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return -1L;
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }

    private static String getRecommendedFix(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (str.contains("采样率")) {
                if (sb.length() > 0) {
                    sb.append("；");
                }
                sb.append("建议使用标准采样率：8000, 16000, 44100, 48000");
            }
            if (str.contains("声道数")) {
                if (sb.length() > 0) {
                    sb.append("；");
                }
                sb.append("建议使用：1（单声道）或2（立体声）");
            }
            if (str.contains("位深度")) {
                if (sb.length() > 0) {
                    sb.append("；");
                }
                sb.append("建议使用：16位（兼容性最好）");
            }
        }
        return sb.toString();
    }

    private static boolean isValidWavHeader(byte[] bArr) {
        if (bArr != null && bArr.length >= 44 && "RIFF".equals(new String(bArr, 0, 4)) && "WAVE".equals(new String(bArr, 8, 4)) && "fmt ".equals(new String(bArr, 12, 4))) {
            return "data".equals(new String(bArr, 36, 4));
        }
        return false;
    }

    private static int parseBitsPerSample(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 34, 2);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getShort() & iqh.f48007d;
    }

    private static int parseChannels(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 22, 2);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getShort() & iqh.f48007d;
    }

    private static int parseDataSize(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 40, 4);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getInt();
    }

    private static int parseSampleRate(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 24, 4);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getInt();
    }

    public static C7219e validateAudioParams(C7216b c7216b) {
        ArrayList arrayList = new ArrayList();
        if (!Arrays.asList(8000, 11025, 16000, 22050, 32000, 44100, 48000, 96000).contains(Integer.valueOf(c7216b.getSampleRate()))) {
            arrayList.add("非标准采样率: " + c7216b.getSampleRate() + "Hz");
        }
        if (c7216b.getChannels() != 1 && c7216b.getChannels() != 2) {
            arrayList.add("声道数必须为1或2: " + c7216b.getChannels());
        }
        if (!Arrays.asList(8, 16, 24, 32).contains(Integer.valueOf(c7216b.getBitsPerSample()))) {
            arrayList.add("不支持的位深度: " + c7216b.getBitsPerSample() + "位");
        }
        return new C7219e(arrayList.isEmpty(), arrayList, !arrayList.isEmpty() ? getRecommendedFix(arrayList) : null);
    }

    public static double calculateDuration(long j, int i) {
        return calculateDuration(j, i, 1, 16);
    }

    public static long estimateMp3FileSize(double d) {
        return estimateMp3FileSize(d, 128);
    }

    /* JADX INFO: renamed from: iac$b */
    public static class C7216b {

        /* JADX INFO: renamed from: a */
        public int f46233a;

        /* JADX INFO: renamed from: b */
        public int f46234b;

        /* JADX INFO: renamed from: c */
        public int f46235c;

        public C7216b() {
            this.f46233a = 44100;
            this.f46234b = 1;
            this.f46235c = 16;
        }

        public int getBitsPerSample() {
            return this.f46235c;
        }

        public int getBytesPerSample() {
            return this.f46234b * (this.f46235c / 8);
        }

        public double getBytesPerSecond() {
            return ((double) (this.f46233a * this.f46234b)) * (((double) this.f46235c) / 8.0d);
        }

        public int getChannels() {
            return this.f46234b;
        }

        public int getSampleRate() {
            return this.f46233a;
        }

        public void setBitsPerSample(int i) {
            this.f46235c = i;
        }

        public void setChannels(int i) {
            this.f46234b = i;
        }

        public void setSampleRate(int i) {
            this.f46233a = i;
        }

        public C7216b(int i, int i2, int i3) {
            this.f46233a = i;
            this.f46234b = i2;
            this.f46235c = i3;
        }
    }

    public static String formatDuration(double d) {
        return formatDuration(d, EnumC7218d.MIN_SEC);
    }
}

package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: s7 */
/* JADX INFO: loaded from: classes6.dex */
public class C12471s7 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f80864a = {-1, -13, -56, k95.f53214o7};

    /* JADX INFO: renamed from: b */
    public static final byte[] f80865b = new byte[Videoio.CAP_PROP_XI_DEBUG_LEVEL];

    /* JADX INFO: renamed from: c */
    public static final byte[] f80866c = {BuiltinOptions.RangeOptions, BuiltinOptions.FillOptions, 51, 3, 0, 0, 0, 0, 0, 0};

    public static byte[] generate300msSilentMp3() {
        int length = f80864a.length + f80865b.length;
        byte[] bArr = f80866c;
        byte[] bArr2 = new byte[bArr.length + (length * 9)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int length2 = bArr.length;
        for (int i = 0; i < 9; i++) {
            byte[] bArr3 = f80864a;
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 = length2 + bArr3.length + f80865b.length;
        }
        return bArr2;
    }

    public static void main(String[] strArr) {
        try {
            byte[] bArrGenerate300msSilentMp3 = generate300msSilentMp3();
            PrintStream printStream = System.out;
            printStream.println("生成的MP3数据大小: " + bArrGenerate300msSilentMp3.length + " 字节");
            printStream.println("包含MP3帧数: 9帧");
            printStream.println("总时长: 324ms (覆盖300ms需求)");
            printStream.println("采样率: 16000Hz");
            printStream.println("帧时长: 36ms");
            saveToFile(bArrGenerate300msSilentMp3, "accurate_silent_16k_300ms.mp3");
            printStream.println("精确300ms静音MP3生成成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveToFile(byte[] bArr, String str) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

package p000;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKit;
import com.arthenica.ffmpegkit.ReturnCode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes6.dex */
public class fyb {

    /* JADX INFO: renamed from: a */
    public static final String f38032a = "OfflineFileUtils";

    public static void convertPCMToMP3(File file, File file2) {
        if (file == null || file2 == null) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        if (!ReturnCode.isSuccess(FFmpegKit.execute(String.format("-y -f s16le -ar %d -ac 1 -i %s %s", Integer.valueOf(hh0.f43617o), absolutePath, absolutePath2)).getReturnCode())) {
            Log.e(f38032a, "PCM 转换为 MP3 失败");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PCM 转换为 MP3 成功:");
        sb.append(absolutePath2);
    }

    public static File createMP3File(Context context) {
        File file = new File(context.getExternalFilesDir("offline").getAbsolutePath());
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, System.currentTimeMillis() + ".mp3");
    }

    public static void deleteAllFiles(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append("deleteAllFiles: 进入子目录: ");
                sb.append(file2.getAbsolutePath());
                deleteAllFiles(file2);
            }
            file2.delete();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deleteAllFiles success: ");
            sb2.append(file2.getAbsolutePath());
        }
        boolean zDelete = file.delete();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("deleteAllFiles: ");
        sb3.append(file.getAbsolutePath());
        sb3.append(" result: ");
        sb3.append(zDelete);
    }

    public static long getAvailableSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return new StatFs(file.getAbsolutePath()).getAvailableBytes();
    }

    public static String getLanguageFromZipFileName(String str) {
        if (str != null && !str.isEmpty()) {
            if (ufh.getLanguageSupport().contains(str.replace(zyb.f106510h, "")) && str.endsWith(zyb.f106510h)) {
                return str.replace(zyb.f106510h, "");
            }
        }
        return "";
    }

    public static String getSDPath() {
        return (Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : null).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getTextFromAssets(android.content.Context r3, java.lang.String r4) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r3 == 0) goto L49
            if (r4 != 0) goto L6
            goto L49
        L6:
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            java.io.InputStream r3 = r3.open(r4)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            int r4 = r3.available()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            r3.read(r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            r3.close()     // Catch: java.io.IOException -> L22
            goto L26
        L22:
            r3 = move-exception
            r3.printStackTrace()
        L26:
            return r1
        L27:
            r4 = move-exception
            r0 = r3
            goto L3e
        L2a:
            r4 = move-exception
            goto L30
        L2c:
            r4 = move-exception
            goto L3e
        L2e:
            r4 = move-exception
            r3 = r0
        L30:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L3d
            r3.close()     // Catch: java.io.IOException -> L39
            goto L3d
        L39:
            r3 = move-exception
            r3.printStackTrace()
        L3d:
            return r0
        L3e:
            if (r0 == 0) goto L48
            r0.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r3 = move-exception
            r3.printStackTrace()
        L48:
            throw r4
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fyb.getTextFromAssets(android.content.Context, java.lang.String):java.lang.String");
    }

    public static boolean isBasicResourceZipFile(String str) {
        return str != null && !str.isEmpty() && str.startsWith("base") && str.endsWith(zyb.f106510h);
    }

    public static boolean isLanguageResourceZipFile(String str) {
        if (str != null && !str.isEmpty()) {
            if (ufh.getLanguageSupport().contains(str.replace(zyb.f106510h, "")) && str.endsWith(zyb.f106510h)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] readStream(String str) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (-1 == i) {
                byteArrayOutputStream.close();
                fileInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static void writeFile(String str, byte[] bArr) {
        boolean z;
        try {
            File file = new File(str);
            if (file.exists()) {
                z = true;
            } else {
                file.createNewFile();
                z = false;
            }
            FileChannel channel = new FileOutputStream(str, z).getChannel();
            channel.write(ByteBuffer.wrap(bArr));
            channel.force(true);
            channel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static void deleteAllFiles(String str) {
        deleteAllFiles(new File(str));
    }
}

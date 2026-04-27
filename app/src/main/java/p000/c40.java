package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.Layout;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.watchfun.base.BaseActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes4.dex */
public class c40 {

    /* JADX INFO: renamed from: a */
    public static String f15741a = "AppUtil";

    /* JADX INFO: renamed from: b */
    public static long f15742b = 0;

    /* JADX INFO: renamed from: c */
    public static final long f15743c = 2000;

    /* JADX INFO: renamed from: d */
    public static Map<String, Boolean> f15744d = new HashMap();

    /* JADX INFO: renamed from: e */
    public static String f15745e = "DeviceSupportSearchStatus";

    private static void addFileBySort(@efb File file, @efb List<File> list) {
        if (file.isFile()) {
            if (!isGif(file.getName())) {
                list.add(file);
                return;
            }
            Iterator<File> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (isGif(it.next().getName())) {
                    i++;
                }
            }
            list.add(i, file);
        }
    }

    public static void copyAssets(@efb Context context, String oldPath, String newPath) {
        try {
            String[] list = context.getAssets().list(oldPath);
            if (list != null && list.length != 0) {
                File file = new File(newPath);
                if (file.exists() || file.mkdirs()) {
                    for (String str : list) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(oldPath);
                        String str2 = File.separator;
                        sb.append(str2);
                        sb.append(str);
                        copyAssets(context, sb.toString(), newPath + str2 + str);
                    }
                    return;
                }
                return;
            }
            InputStream inputStreamOpen = context.getAssets().open(oldPath);
            File file2 = new File(newPath);
            if (file2.exists() && file2.isFile() && inputStreamOpen.available() == file2.length()) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(newPath);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i == -1) {
                    fileOutputStream.flush();
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String formatString(String format, Object... args) {
        return String.format(Locale.ENGLISH, format, args);
    }

    public static String formatWatchBgSeq(int seq) {
        if (seq < 0) {
            seq = 0;
        }
        if (seq >= 1000) {
            seq = 999;
        }
        char[] cArr = new char[3];
        cArr[0] = '0';
        cArr[1] = '0';
        cArr[2] = '0';
        char[] charArray = String.valueOf(seq).toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            cArr[2 - i] = charArray[i];
        }
        return new String(cArr);
    }

    public static String freqValueToFreqShowText(int value) {
        int i = value / 1000;
        if (i > 0) {
            return i + "K";
        }
        return value + "";
    }

    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public static String getDeviceName(BluetoothDevice device) {
        if (device == null) {
            return null;
        }
        String name = device.getName();
        return name == null ? device.getAddress() : name;
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String getFileName(String filePath) {
        return getFileName(filePath, false);
    }

    public static String getFileSuffix(String filename) {
        int iLastIndexOf = filename.lastIndexOf(".");
        return iLastIndexOf == -1 ? "" : filename.substring(iLastIndexOf + 1);
    }

    public static int getHeight(Context context) {
        return getDisplayMetrics(context).heightPixels;
    }

    public static String getNameNoSuffix(String name) {
        int iLastIndexOf = name.lastIndexOf(".");
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    public static float getScreenDensity(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int getScreenHeight(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static float[] getScreenResolution(Context context) {
        if (context == null) {
            return null;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return new float[]{0.0f, 0.0f, 0.0f};
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return new float[]{displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density};
    }

    public static int getScreenWidth(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier(xig.f98117d, "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
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
        throw new UnsupportedOperationException("Method not decompiled: p000.c40.getTextFromAssets(android.content.Context, java.lang.String):java.lang.String");
    }

    public static int getTextViewHeight(@efb TextView textView) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            return 0;
        }
        return layout.getLineTop(textView.getLineCount()) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    public static String getTimeFormatValue(int time) {
        int i = time / 60;
        int i2 = (i / 60) % 24;
        int i3 = i % 60;
        int i4 = time % 60;
        return i2 == 0 ? MessageFormat.format("{0,number,00}:{1,number,00}", Integer.valueOf(i3), Integer.valueOf(i4)) : MessageFormat.format("{0,number,00}:{1,number,00}:{2,number,00}", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static int getWidth(Context context) {
        return getDisplayMetrics(context).widthPixels;
    }

    public static boolean isFastDoubleClick() {
        return isFastDoubleClick(2000L);
    }

    public static boolean isGif(String filePath) {
        if (TextUtils.isEmpty(filePath)) {
            return false;
        }
        return filePath.endsWith(".gif") || filePath.endsWith(".GIF");
    }

    public static void savePcmToWav(String input, String output) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(input);
        FileOutputStream fileOutputStream = new FileOutputStream(output);
        int iAvailable = fileInputStream.available();
        int i = iAvailable + 36;
        fileOutputStream.write(new byte[]{BuiltinOptions.AddNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, (byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255), BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.GeluOptions, 32, 16, 0, 0, 0, 1, 0, 1, 0, (byte) 128, (byte) 62, (byte) 0, (byte) 0, (byte) 0, (byte) 125, (byte) 0, (byte) 0, (byte) 2, (byte) 0, (byte) 16, (byte) 0, 100, BuiltinOptions.ScatterNdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions, (byte) (iAvailable & 255), (byte) ((iAvailable >> 8) & 255), (byte) ((iAvailable >> 16) & 255), (byte) ((iAvailable >> 24) & 255)}, 0, 44);
        byte[] bArr = new byte[fileInputStream.available()];
        fileInputStream.read(bArr);
        fileOutputStream.write(bArr);
        fileOutputStream.flush();
    }

    public static BaseActivity scanForBaseActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof BaseActivity) {
            return (BaseActivity) context;
        }
        if (context instanceof ContextWrapper) {
            return scanForBaseActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void startTimerTask(Context context, int seconds, PendingIntent intent) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager == null) {
            return;
        }
        alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis(), intent);
    }

    public static void stopTimerTask(Context context, PendingIntent intent) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager == null) {
            return;
        }
        alarmManager.cancel(intent);
    }

    public static String getFileName(String filePath, boolean isSkipSuffix) {
        int iLastIndexOf;
        return (!TextUtils.isEmpty(filePath) && (iLastIndexOf = filePath.lastIndexOf(File.separator)) < filePath.length()) ? (!isSkipSuffix || filePath.lastIndexOf(".") == -1) ? filePath.substring(iLastIndexOf + 1) : filePath.substring(iLastIndexOf + 1, filePath.lastIndexOf(".")) : "";
    }

    public static boolean isFastDoubleClick(long interval) {
        long time = new Date().getTime();
        boolean z = time - f15742b <= interval;
        f15742b = time;
        return z;
    }
}

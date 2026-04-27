package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Process;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.C2473f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes7.dex */
public class c1i {

    /* JADX INFO: renamed from: a */
    public static final String f15556a = "Utils";

    /* JADX INFO: renamed from: b */
    public static long f15557b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f15558c = 1000;

    /* JADX INFO: renamed from: d */
    public static final int f15559d = 32;

    /* JADX INFO: renamed from: e */
    public static final int f15560e = 160;

    /* JADX INFO: renamed from: f */
    public static final int f15561f = 5120;

    /* JADX INFO: renamed from: g */
    public static final long f15562g = 2000;

    /* JADX INFO: renamed from: h */
    public static Map<String, Boolean> f15563h = new HashMap();

    /* JADX INFO: renamed from: i */
    public static String f15564i = "DeviceSupportSearchStatus";

    /* JADX INFO: renamed from: c1i$a */
    public class C2162a implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (charSequence.equals(C2473f.f17566z)) {
                return "";
            }
            return null;
        }
    }

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

    public static Bitmap blurBitmap(Context context, Bitmap bitmap, float f) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCopy = bitmap.copy(config, true);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCopy);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.setRadius(f);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCopy.getWidth(), bitmapCopy.getHeight(), config);
        allocationCreateTyped.copyTo(bitmapCreateBitmap);
        renderScriptCreate.destroy();
        return bitmapCreateBitmap;
    }

    public static GradientDrawable buildRandomDrawable() {
        Random random = new Random();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setAlpha(30);
        return gradientDrawable;
    }

    public static int bytesToTime(int i) {
        return i / 32;
    }

    public static void copyAssets(@efb Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list != null && list.length != 0) {
                File file = new File(str2);
                if (file.exists() || file.mkdirs()) {
                    for (String str3 : list) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        String str4 = File.separator;
                        sb.append(str4);
                        sb.append(str3);
                        copyAssets(context, sb.toString(), str2 + str4 + str3);
                    }
                    return;
                }
                return;
            }
            InputStream inputStreamOpen = context.getAssets().open(str);
            File file2 = new File(str2);
            if (file2.exists() && file2.isFile() && inputStreamOpen.available() == file2.length()) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
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

    public static String decodeUTF8(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            Log.e("Utils", "decodeUTF8:e:" + e.getMessage());
            return str;
        }
    }

    public static int dip2Px(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    public static String formatWatchBgSeq(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i >= 1000) {
            i = 999;
        }
        char[] cArr = new char[3];
        cArr[0] = '0';
        cArr[1] = '0';
        cArr[2] = '0';
        char[] charArray = String.valueOf(i).toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            cArr[2 - i2] = charArray[i2];
        }
        return new String(cArr);
    }

    public static String freqValueToFreqShowText(int i) {
        int i2 = i / 1000;
        if (i2 > 0) {
            return i2 + "K";
        }
        return i + "";
    }

    private static NetworkInfo getActiveNetworkInfo() {
        try {
            return ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    public static AssetManager getAsset() {
        return getResources().getAssets();
    }

    public static int getColor(Context context, int i) {
        return context.getResources().getColor(i);
    }

    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public static float getDensity() {
        return getResources().getDisplayMetrics().density;
    }

    public static int getDimenPx(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static Drawable getDrawable(int i) {
        try {
            return getResources().getDrawable(i, null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getFileName(String str) {
        return getFileName(str, false);
    }

    public static String getFileSuffix(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf + 1);
    }

    public static String getFromAssets(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getAsset().open(str)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb.toString();
                }
                sb.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static int getH(int i, float f) {
        return (int) (i * f);
    }

    public static int getHeight(Context context) {
        return getDisplayMetrics(context).heightPixels;
    }

    public static LayoutInflater getInflater() {
        return LayoutInflater.from(iy2.getAppContext());
    }

    public static String getNameNoSuffix(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    public static int getNetworkType() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    public static List<ApplicationInfo> getPackageManager(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().activityInfo.applicationInfo);
        }
        return arrayList.subList(0, 8);
    }

    public static int getPhoneHeight() {
        return getResources().getDisplayMetrics().heightPixels;
    }

    public static int getPhoneWidth() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    public static String getProcessName() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/cmdline"));
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            String line = bufferedReader.readLine();
            if (!TextUtils.isEmpty(line)) {
                line = line.trim();
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return line;
        } catch (Throwable th2) {
            th = th2;
            try {
                th.printStackTrace();
                return null;
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public static int[] getResourceArray(int i) {
        TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(i);
        int length = typedArrayObtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, 0);
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }

    public static Resources getResources() {
        return iy2.getAppContext().getResources();
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

    public static int getScreenWidth() {
        return ((WindowManager) iy2.getAppContext().getSystemService("window")).getDefaultDisplay().getWidth();
    }

    @igg({"InternalInsetResource"})
    public static int getStatusBarHeight(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier(xig.f98117d, "dimen", "android"));
    }

    public static String getString(int i) {
        return getResources().getString(i);
    }

    private static Object getSystemService(String str) {
        return iy2.getAppContext().getSystemService(str);
    }

    public static int getTextViewHeight(@efb TextView textView) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            return 0;
        }
        return layout.getLineTop(textView.getLineCount()) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    public static String getTimeFormatValue(int i) {
        int i2 = i / 60;
        int i3 = (i2 / 60) % 24;
        int i4 = i2 % 60;
        int i5 = i % 60;
        return i3 == 0 ? MessageFormat.format("{0,number,00}:{1,number,00}", Integer.valueOf(i4), Integer.valueOf(i5)) : MessageFormat.format("{0,number,00}:{1,number,00}:{2,number,00}", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String getUTF8(String str) {
        try {
            return !TextUtils.isEmpty(str) ? URLEncoder.encode(str, "UTF-8") : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static int getWidth(Context context) {
        return getDisplayMetrics(context).widthPixels;
    }

    public static boolean hasNetwork() {
        return getActiveNetworkInfo() != null && isNetworkOnline(iy2.getAppContext());
    }

    public static View inflate(int i) {
        return getInflater().inflate(i, (ViewGroup) null);
    }

    public static boolean isAllZeroEqValue(byte[] bArr) {
        return Arrays.equals(bArr, new byte[10]);
    }

    public static boolean isFastClick() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f15557b <= 1000) {
            return true;
        }
        f15557b = jCurrentTimeMillis;
        return false;
    }

    public static boolean isFastDoubleClick() {
        return isFastDoubleClick(2000L);
    }

    public static boolean isGif(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith(".gif") || str.endsWith(".GIF");
    }

    public static boolean isIntentAvailable(Context context, String str) {
        return context.getPackageManager().queryIntentActivities(new Intent(str), 65536).size() > 0;
    }

    public static boolean isNetworkOnline(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Log.e("Utils", "isNetworkOnline", e);
            return true;
        }
    }

    public static boolean isSmallScreen() {
        return getScreenWidth() <= 480;
    }

    public static boolean isSmallScreenAtManageHomeView() {
        return getScreenWidth() <= 960;
    }

    public static void savePcmToWav(String str, String str2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        FileOutputStream fileOutputStream = new FileOutputStream(str2);
        int iAvailable = fileInputStream.available();
        int i = iAvailable + 36;
        fileOutputStream.write(new byte[]{BuiltinOptions.AddNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, (byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255), BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.GeluOptions, 32, 16, 0, 0, 0, 1, 0, 1, 0, (byte) 128, (byte) 62, (byte) 0, (byte) 0, (byte) 0, (byte) 125, (byte) 0, (byte) 0, (byte) 2, (byte) 0, (byte) 16, (byte) 0, 100, BuiltinOptions.ScatterNdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions, (byte) (iAvailable & 255), (byte) ((iAvailable >> 8) & 255), (byte) ((iAvailable >> 16) & 255), (byte) ((iAvailable >> 24) & 255)}, 0, 44);
        byte[] bArr = new byte[fileInputStream.available()];
        fileInputStream.read(bArr);
        fileOutputStream.write(bArr);
        fileOutputStream.flush();
    }

    public static void setEditTextInhibitInputSpace(EditText editText) {
        editText.setFilters(new InputFilter[]{new C2162a()});
    }

    public static void setMargins(View view, int i, int i2, int i3, int i4) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMargins(i, i2, i3, i4);
            view.requestLayout();
        }
    }

    public static int sp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static List<Pair<String, String>> splitLongEnglishText(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty() && i > 0) {
            String strTrim = str.trim();
            StringBuilder sb = new StringBuilder();
            for (String str2 : strTrim.split("\\s+")) {
                if (sb.length() + str2.length() > i) {
                    arrayList.add(new Pair(sb.toString(), ""));
                    sb = new StringBuilder();
                }
                sb.append(str2);
                sb.append(C2473f.f17566z);
            }
            if (sb.length() > 0) {
                arrayList.add(new Pair(sb.toString().trim(), ""));
            }
        }
        return arrayList;
    }

    public static List<Pair<String, String>> splitLongText(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty() && i > 0) {
            for (String str2 : str.split("\n")) {
                String strTrim = str2.trim();
                int i2 = 0;
                while (i2 < strTrim.length()) {
                    int iMin = Math.min(i2 + i, strTrim.length());
                    arrayList.add(new Pair(strTrim.substring(i2, iMin), ""));
                    i2 = iMin;
                }
            }
        }
        return arrayList;
    }

    public static void startTimerTask(Context context, int i, PendingIntent pendingIntent) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager == null) {
            return;
        }
        alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis(), pendingIntent);
    }

    public static void stopTimerTask(Context context, PendingIntent pendingIntent) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager == null) {
            return;
        }
        alarmManager.cancel(pendingIntent);
    }

    public static long timeToBytes(long j) {
        return j * 32;
    }

    public static int dip2px(int i) {
        return (int) ((i * getDensity()) + 0.5f);
    }

    public static int getColor(int i) {
        return iy2.getAppContext().getResources().getColor(i, null);
    }

    public static String getFileName(String str, boolean z) {
        int iLastIndexOf;
        return (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(File.separator)) < str.length()) ? (!z || str.lastIndexOf(".") == -1) ? str.substring(iLastIndexOf + 1) : str.substring(iLastIndexOf + 1, str.lastIndexOf(".")) : "";
    }

    public static LayoutInflater getInflater(Context context) {
        return LayoutInflater.from(context);
    }

    public static String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public static View inflate(Context context, int i) {
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    public static boolean isFastDoubleClick(long j) {
        long time = new Date().getTime();
        boolean z = time - f15557b <= j;
        f15557b = time;
        return z;
    }

    public static Drawable getDrawable(Context context, int i) {
        return context.getResources().getDrawable(i);
    }

    public static View inflate(Context context, int i, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(i, viewGroup, false);
    }

    public static int getScreenWidth(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}

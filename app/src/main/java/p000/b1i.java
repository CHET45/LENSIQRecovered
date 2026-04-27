package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C2473f;
import com.watchfun.base.BaseActivity;
import com.watchfun.voicenotes.C4297R;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public class b1i {

    /* JADX INFO: renamed from: a */
    public static final String f12420a = "Utils";

    /* JADX INFO: renamed from: b */
    public static int f12421b = 0;

    /* JADX INFO: renamed from: c */
    public static long f12422c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f12423d = 1000;

    /* JADX INFO: renamed from: e */
    public static final int f12424e = 32;

    /* JADX INFO: renamed from: f */
    public static final int f12425f = 160;

    /* JADX INFO: renamed from: g */
    public static final int f12426g = 5120;

    /* JADX INFO: renamed from: b1i$a */
    public class C1699a implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (charSequence.equals(C2473f.f17566z)) {
                return "";
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b1i$b */
    public class C1700b extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f12427a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f12428b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f12429c;

        public C1700b(int i, int i2, int i3) {
            this.f12427a = i;
            this.f12428b = i2;
            this.f12429c = i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@efb Rect rect, @efb View view, @efb RecyclerView recyclerView, @efb RecyclerView.State state) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (recyclerView.getAdapter() == null) {
                return;
            }
            int iCeil = (int) Math.ceil((((double) recyclerView.getAdapter().getItemCount()) * 1.0d) / ((double) this.f12427a));
            int i = this.f12427a;
            int i2 = childAdapterPosition / i;
            int i3 = childAdapterPosition - (i2 * i);
            if (i3 == 0) {
                int i4 = this.f12428b;
                rect.left = i4;
                if (i != 1) {
                    i4 = this.f12429c;
                }
                rect.right = i4;
            } else if (i3 == i - 1) {
                rect.right = this.f12428b;
                rect.left = this.f12429c;
            } else {
                int i5 = this.f12429c;
                rect.right = i5;
                rect.left = i5;
            }
            if (i2 == 0) {
                rect.top = this.f12428b;
                rect.bottom = this.f12429c;
            } else if (i2 == iCeil - 1) {
                rect.top = this.f12429c;
                rect.bottom = this.f12428b;
            } else {
                int i6 = this.f12429c;
                rect.top = i6;
                rect.bottom = i6;
            }
        }
    }

    /* JADX INFO: renamed from: b1i$c */
    public class C1701c extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f12430a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f12431b;

        public C1701c(int i, int i2) {
            this.f12430a = i;
            this.f12431b = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@efb Rect rect, @efb View view, @efb RecyclerView recyclerView, @efb RecyclerView.State state) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (recyclerView.getAdapter() == null) {
                return;
            }
            int iCeil = (int) Math.ceil((((double) recyclerView.getAdapter().getItemCount()) * 1.0d) / ((double) this.f12430a));
            int i = this.f12430a;
            int i2 = childAdapterPosition / i;
            int i3 = childAdapterPosition - (i2 * i);
            if (i3 == 0) {
                rect.left = 0;
                rect.right = this.f12431b;
            } else if (i3 == i - 1) {
                rect.right = 0;
                rect.left = this.f12431b;
            }
            if (i2 == 0) {
                rect.top = 0;
                rect.bottom = this.f12431b;
            } else if (i2 == iCeil - 1) {
                rect.top = this.f12431b;
                rect.bottom = 0;
            } else {
                int i4 = this.f12431b;
                rect.top = i4;
                rect.bottom = i4;
            }
        }
    }

    /* JADX INFO: renamed from: b1i$d */
    public class C1702d implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f12432a;

        public C1702d(TextView textView) {
            this.f12432a = textView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() > 0) {
                this.f12432a.setEnabled(true);
                this.f12432a.setTextColor(b1i.getResources().getColor(C4297R.color.base_purple));
            } else {
                this.f12432a.setEnabled(false);
                this.f12432a.setTextColor(b1i.getResources().getColor(C4297R.color.gray_828282));
            }
        }
    }

    public static void addUnifyItemDecoration(RecyclerView recyclerView, int i) {
        if (recyclerView == null || i == 0) {
            return;
        }
        recyclerView.addItemDecoration(new C1700b(i, getDimenPx(C4297R.dimen.dp_2), getDimenPx(C4297R.dimen.dp_5)));
    }

    public static void addUnifyItemSleepDecoration(RecyclerView recyclerView, int i) {
        if (recyclerView == null || i == 0) {
            return;
        }
        getDimenPx(C4297R.dimen.dp_10);
        getDimenPx(C4297R.dimen.dp_6);
        recyclerView.addItemDecoration(new C1701c(i, getDimenPx(C4297R.dimen.dp_6)));
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

    public static float getDensity() {
        return getResources().getDisplayMetrics().density;
    }

    public static int getDimenPx(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    public static Drawable getDrawable(int i) {
        try {
            return getResources().getDrawable(i, null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
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

    public static LayoutInflater getInflater() {
        return LayoutInflater.from(C9389ml.getInstance().getAppContext());
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
        return C9389ml.getInstance().getAppContext().getResources();
    }

    public static int getScreenWidth() {
        return ((WindowManager) C9389ml.getInstance().getAppContext().getSystemService("window")).getDefaultDisplay().getWidth();
    }

    @igg({"InternalInsetResource"})
    public static int getStatusBarHeight(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier(xig.f98117d, "dimen", "android"));
    }

    public static String getString(int i) {
        return getResources().getString(i);
    }

    private static Object getSystemService(String str) {
        return C9389ml.getInstance().getAppContext().getSystemService(str);
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
        String str = "";
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return (str == null || !str.endsWith("-c")) ? str : str.substring(0, str.length() - 2);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String getVersionAbout(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean hasNetwork() {
        return getActiveNetworkInfo() != null && isNetworkOnline(C9389ml.getInstance().getAppContext());
    }

    public static View inflate(int i) {
        return getInflater().inflate(i, (ViewGroup) null);
    }

    public static boolean isAllZeroEqValue(byte[] bArr) {
        return Arrays.equals(bArr, new byte[10]);
    }

    public static boolean isFastClick() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f12422c <= 1000) {
            return true;
        }
        f12422c = jCurrentTimeMillis;
        return false;
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

    public static boolean isSamsungDevice() {
        return as9.f11748b.equalsIgnoreCase(Build.MANUFACTURER) || as9.f11748b.equalsIgnoreCase(Build.BRAND);
    }

    public static boolean isSmallScreen() {
        return getScreenWidth() <= 480;
    }

    public static boolean isSmallScreenAtManageHomeView() {
        return getScreenWidth() <= 960;
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

    public static void setEditTextInhibitInputSpace(EditText editText) {
        editText.setFilters(new InputFilter[]{new C1699a()});
    }

    public static void setMargins(View view, int i, int i2, int i3, int i4) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMargins(i, i2, i3, i4);
            view.requestLayout();
        }
    }

    public static void setupTextWatcher(EditText editText, TextView textView) {
        editText.addTextChangedListener(new C1702d(textView));
    }

    public static void sleep(long j) {
        if (j <= 0) {
            return;
        }
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
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

    public static long timeToBytes(long j) {
        return j * 32;
    }

    public static int dip2px(int i) {
        return (int) ((i * getDensity()) + 0.5f);
    }

    public static int getColor(int i) {
        return C9389ml.getInstance().getAppContext().getResources().getColor(i, null);
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

    public static Drawable getDrawable(Context context, int i) {
        return context.getResources().getDrawable(i);
    }

    public static View inflate(Context context, int i, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(i, viewGroup, false);
    }
}

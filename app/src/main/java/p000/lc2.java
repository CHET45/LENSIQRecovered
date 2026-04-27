package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import p000.ymh;

/* JADX INFO: loaded from: classes5.dex */
public class lc2 {

    /* JADX INFO: renamed from: a */
    public static final String f57149a = "SHA-1";

    /* JADX INFO: renamed from: b */
    public static final String f57150b = "goldfish";

    /* JADX INFO: renamed from: c */
    public static final String f57151c = "ranchu";

    /* JADX INFO: renamed from: d */
    public static final String f57152d = "sdk";

    /* JADX INFO: renamed from: e */
    public static final String f57153e = "com.google.firebase.crashlytics";

    /* JADX INFO: renamed from: f */
    public static final String f57154f = "com.crashlytics.prefs";

    /* JADX INFO: renamed from: g */
    public static final char[] f57155g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', sjc.f82029s, 'b', sjc.f82021k, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: h */
    public static final String f57156h = "com.google.firebase.crashlytics.mapping_file_id";

    /* JADX INFO: renamed from: i */
    public static final String f57157i = "com.crashlytics.android.build_id";

    /* JADX INFO: renamed from: j */
    public static final String f57158j = "com.google.firebase.crashlytics.build_ids_lib";

    /* JADX INFO: renamed from: k */
    public static final String f57159k = "com.google.firebase.crashlytics.build_ids_arch";

    /* JADX INFO: renamed from: l */
    public static final String f57160l = "com.google.firebase.crashlytics.build_ids_build_id";

    /* JADX INFO: renamed from: m */
    public static final String f57161m = "com.google.firebase.crashlytics.version_control_info";

    /* JADX INFO: renamed from: n */
    public static final int f57162n = 1;

    /* JADX INFO: renamed from: o */
    public static final int f57163o = 2;

    /* JADX INFO: renamed from: p */
    public static final int f57164p = 4;

    /* JADX INFO: renamed from: q */
    public static final int f57165q = 8;

    /* JADX INFO: renamed from: r */
    public static final int f57166r = 16;

    /* JADX INFO: renamed from: s */
    public static final int f57167s = 32;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 lc2$a, still in use, count: 1, list:
  (r0v0 lc2$a) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 lc2$a) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: lc2$a */
    public static final class EnumC8770a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* JADX INFO: renamed from: L */
        public static final Map<String, EnumC8770a> f57171L;

        static {
            HashMap map = new HashMap(4);
            f57171L = map;
            map.put("armeabi-v7a", new EnumC8770a());
            map.put("armeabi", new EnumC8770a());
            map.put("arm64-v8a", new EnumC8770a());
            map.put("x86", new EnumC8770a());
        }

        private EnumC8770a() {
        }

        /* JADX INFO: renamed from: a */
        public static EnumC8770a m16082a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                ej9.getLogger().m10067v("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            EnumC8770a enumC8770a = f57171L.get(str.toLowerCase(Locale.US));
            return enumC8770a == null ? UNKNOWN : enumC8770a;
        }

        public static EnumC8770a valueOf(String str) {
            return (EnumC8770a) Enum.valueOf(EnumC8770a.class, str);
        }

        public static EnumC8770a[] values() {
            return (EnumC8770a[]) f57172M.clone();
        }
    }

    public static long calculateFreeRamInBytes(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long calculateTotalRamInBytes(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static long calculateUsedDiskSpaceInBytes(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @igg({"MissingPermission"})
    public static boolean canTryConnection(Context context) {
        if (!checkPermission(context, it3.f48185b)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean checkPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void closeOrLog(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                ej9.getLogger().m10064e(str, e);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static String createInstanceIdFrom(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String string = sb.toString();
        if (string.length() > 0) {
            return sha1(string);
        }
        return null;
    }

    public static boolean getBooleanResourceValue(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int resourcesIdentifier = getResourcesIdentifier(context, str, "bool");
            if (resourcesIdentifier > 0) {
                return resources.getBoolean(resourcesIdentifier);
            }
            int resourcesIdentifier2 = getResourcesIdentifier(context, str, ymh.InterfaceC15723b.f102127e);
            if (resourcesIdentifier2 > 0) {
                return Boolean.parseBoolean(context.getString(resourcesIdentifier2));
            }
        }
        return z;
    }

    public static List<pf1> getBuildIdInfo(Context context) {
        ArrayList arrayList = new ArrayList();
        int resourcesIdentifier = getResourcesIdentifier(context, f57158j, "array");
        int resourcesIdentifier2 = getResourcesIdentifier(context, f57159k, "array");
        int resourcesIdentifier3 = getResourcesIdentifier(context, f57160l, "array");
        if (resourcesIdentifier == 0 || resourcesIdentifier2 == 0 || resourcesIdentifier3 == 0) {
            ej9.getLogger().m10061d(String.format("Could not find resources: %d %d %d", Integer.valueOf(resourcesIdentifier), Integer.valueOf(resourcesIdentifier2), Integer.valueOf(resourcesIdentifier3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(resourcesIdentifier);
        String[] stringArray2 = context.getResources().getStringArray(resourcesIdentifier2);
        String[] stringArray3 = context.getResources().getStringArray(resourcesIdentifier3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            ej9.getLogger().m10061d(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i = 0; i < stringArray3.length; i++) {
            arrayList.add(new pf1(stringArray[i], stringArray2[i], stringArray3[i]));
        }
        return arrayList;
    }

    public static int getCpuArchitectureInt() {
        return EnumC8770a.m16082a().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int getDeviceState() {
        boolean zIsEmulator = isEmulator();
        ?? r0 = zIsEmulator;
        if (isRooted()) {
            r0 = (zIsEmulator ? 1 : 0) | 2;
        }
        return isDebuggerAttached() ? r0 | 4 : r0;
    }

    public static SharedPreferences getLegacySharedPrefs(Context context) {
        return context.getSharedPreferences(f57154f, 0);
    }

    public static String getMappingFileId(Context context) {
        int resourcesIdentifier = getResourcesIdentifier(context, f57156h, ymh.InterfaceC15723b.f102127e);
        if (resourcesIdentifier == 0) {
            resourcesIdentifier = getResourcesIdentifier(context, f57157i, ymh.InterfaceC15723b.f102127e);
        }
        if (resourcesIdentifier != 0) {
            return context.getResources().getString(resourcesIdentifier);
        }
        return null;
    }

    public static boolean getProximitySensorEnabled(Context context) {
        return (isEmulator() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static String getResourcePackageName(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i);
            return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int getResourcesIdentifier(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, getResourcePackageName(context));
    }

    public static SharedPreferences getSharedPrefs(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    @hib
    public static String getVersionControlInfo(Context context) {
        int resourcesIdentifier = getResourcesIdentifier(context, f57161m, ymh.InterfaceC15723b.f102127e);
        if (resourcesIdentifier == 0) {
            return null;
        }
        return context.getResources().getString(resourcesIdentifier);
    }

    private static String hash(String str, String str2) {
        return hash(str.getBytes(), str2);
    }

    public static String hexify(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f57155g;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static boolean isAppDebuggable(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean isDebuggerAttached() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean isEmulator() {
        if (!Build.PRODUCT.contains(f57152d)) {
            String str = Build.HARDWARE;
            if (!str.contains(f57150b) && !str.contains(f57151c)) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public static boolean isLoggingEnabled(Context context) {
        return false;
    }

    public static boolean isRooted() {
        boolean zIsEmulator = isEmulator();
        String str = Build.TAGS;
        if ((zIsEmulator || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zIsEmulator && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean nullSafeEquals(@hib String str, @hib String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static String padWithZerosToMaxIntWidth(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", Integer.valueOf(i)).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String sha1(String str) {
        return hash(str, f57149a);
    }

    public static String streamToString(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static String hash(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return hexify(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            ej9.getLogger().m10064e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }
}

package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.Log;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ol1 implements il1 {

    /* JADX INFO: renamed from: j */
    public static final long f67985j = Long.MAX_VALUE;

    /* JADX INFO: renamed from: k */
    public static final int f67986k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l */
    public static final String f67987l = "cdu_";

    /* JADX INFO: renamed from: m */
    public static final String f67988m = "by_";

    /* JADX INFO: renamed from: n */
    public static final String f67989n = "st_";

    /* JADX INFO: renamed from: o */
    public static final String f67990o = "jo_";

    /* JADX INFO: renamed from: p */
    public static final String f67991p = "ja_";

    /* JADX INFO: renamed from: q */
    public static final String f67992q = "bi_";

    /* JADX INFO: renamed from: r */
    public static final String f67993r = "dr_";

    /* JADX INFO: renamed from: s */
    public static final String f67994s = "pa_";

    /* JADX INFO: renamed from: t */
    public static final String f67995t = "se_";

    /* JADX INFO: renamed from: u */
    public static final Map<String, ol1> f67996u = new HashMap();

    /* JADX INFO: renamed from: e */
    public final String f67997e;

    /* JADX INFO: renamed from: f */
    public final File f67998f;

    /* JADX INFO: renamed from: g */
    public final long f67999g;

    /* JADX INFO: renamed from: h */
    public final int f68000h;

    /* JADX INFO: renamed from: i */
    public C10449c f68001i;

    /* JADX INFO: renamed from: ol1$b */
    public static final class C10448b {

        /* JADX INFO: renamed from: a */
        public static final int f68002a = 14;

        private C10448b() {
        }

        private static byte[] copyOfRange(byte[] bArr, int i, int i2) {
            int i3 = i2 - i;
            if (i3 >= 0) {
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
                return bArr2;
            }
            throw new IllegalArgumentException(i + " > " + i2);
        }

        private static String createDueTime(int i) {
            return String.format(Locale.getDefault(), "_$%010d$_", Long.valueOf((System.currentTimeMillis() / 1000) + ((long) i)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] getDataWithoutDueTime(byte[] bArr) {
            return hasTimeInfo(bArr) ? copyOfRange(bArr, 14, bArr.length) : bArr;
        }

        private static long getDueTime(byte[] bArr) {
            if (hasTimeInfo(bArr)) {
                try {
                    return Long.parseLong(new String(copyOfRange(bArr, 2, 12))) * 1000;
                } catch (NumberFormatException unused) {
                }
            }
            return -1L;
        }

        private static boolean hasTimeInfo(byte[] bArr) {
            return bArr != null && bArr.length >= 14 && bArr[0] == 95 && bArr[1] == 36 && bArr[12] == 36 && bArr[13] == 95;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isDue(byte[] bArr) {
            long dueTime = getDueTime(bArr);
            return dueTime != -1 && System.currentTimeMillis() > dueTime;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] newByteArrayWithTime(int i, byte[] bArr) {
            byte[] bytes = createDueTime(i).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }
    }

    /* JADX INFO: renamed from: ol1$c */
    public static final class C10449c {

        /* JADX INFO: renamed from: a */
        public final AtomicLong f68003a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f68004b;

        /* JADX INFO: renamed from: c */
        public final long f68005c;

        /* JADX INFO: renamed from: d */
        public final int f68006d;

        /* JADX INFO: renamed from: e */
        public final Map<File, Long> f68007e;

        /* JADX INFO: renamed from: f */
        public final File f68008f;

        /* JADX INFO: renamed from: g */
        public final Thread f68009g;

        /* JADX INFO: renamed from: ol1$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ File f68010a;

            /* JADX INFO: renamed from: ol1$c$a$a, reason: collision with other inner class name */
            public class C16496a implements FilenameFilter {
                public C16496a() {
                }

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return str.startsWith(ol1.f67987l);
                }
            }

            public a(File file) {
                this.f68010a = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles = this.f68010a.listFiles(new C16496a());
                if (fileArrListFiles != null) {
                    int length = 0;
                    int i = 0;
                    for (File file : fileArrListFiles) {
                        length = (int) (((long) length) + file.length());
                        i++;
                        C10449c.this.f68007e.put(file, Long.valueOf(file.lastModified()));
                    }
                    C10449c.this.f68003a.getAndAdd(length);
                    C10449c.this.f68004b.getAndAdd(i);
                }
            }
        }

        /* JADX INFO: renamed from: ol1$c$b */
        public class b implements FilenameFilter {
            public b() {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith(ol1.f67987l);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean clear() {
            File[] fileArrListFiles = this.f68008f.listFiles(new b());
            boolean z = true;
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    if (file.delete()) {
                        this.f68003a.addAndGet(-file.length());
                        this.f68004b.addAndGet(-1);
                        this.f68007e.remove(file);
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    this.f68007e.clear();
                    this.f68003a.set(0L);
                    this.f68004b.set(0);
                }
            }
            return z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getCacheCount() {
            wait2InitOk();
            return this.f68004b.get();
        }

        private String getCacheNameByKey(String str) {
            return ol1.f67987l + str.substring(0, 3) + str.substring(3).hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCacheSize() {
            wait2InitOk();
            return this.f68003a.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File getFileBeforePut(String str) {
            wait2InitOk();
            File file = new File(this.f68008f, getCacheNameByKey(str));
            if (file.exists()) {
                this.f68004b.addAndGet(-1);
                this.f68003a.addAndGet(-file.length());
            }
            return file;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File getFileIfExists(String str) {
            File file = new File(this.f68008f, getCacheNameByKey(str));
            if (file.exists()) {
                return file;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void put(File file) {
            this.f68004b.addAndGet(1);
            this.f68003a.addAndGet(file.length());
            while (true) {
                if (this.f68004b.get() <= this.f68006d && this.f68003a.get() <= this.f68005c) {
                    return;
                }
                this.f68003a.addAndGet(-removeOldest());
                this.f68004b.addAndGet(-1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean removeByKey(String str) {
            File fileIfExists = getFileIfExists(str);
            if (fileIfExists == null) {
                return true;
            }
            if (!fileIfExists.delete()) {
                return false;
            }
            this.f68003a.addAndGet(-fileIfExists.length());
            this.f68004b.addAndGet(-1);
            this.f68007e.remove(fileIfExists);
            return true;
        }

        private long removeOldest() {
            File key;
            if (this.f68007e.isEmpty()) {
                return 0L;
            }
            Long l = Long.MAX_VALUE;
            Set<Map.Entry<File, Long>> setEntrySet = this.f68007e.entrySet();
            synchronized (this.f68007e) {
                try {
                    key = null;
                    for (Map.Entry<File, Long> entry : setEntrySet) {
                        Long value = entry.getValue();
                        if (value.longValue() < l.longValue()) {
                            key = entry.getKey();
                            l = value;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (key == null) {
                return 0L;
            }
            long length = key.length();
            if (!key.delete()) {
                return 0L;
            }
            this.f68007e.remove(key);
            return length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateModify(File file) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            file.setLastModified(jCurrentTimeMillis);
            this.f68007e.put(file, lValueOf);
        }

        private void wait2InitOk() {
            try {
                this.f68009g.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private C10449c(File file, long j, int i) {
            this.f68007e = Collections.synchronizedMap(new HashMap());
            this.f68008f = file;
            this.f68005c = j;
            this.f68006d = i;
            this.f68003a = new AtomicLong();
            this.f68004b = new AtomicInteger();
            Thread thread = new Thread(new a(file));
            this.f68009g = thread;
            thread.start();
        }
    }

    private ol1(String str, File file, long j, int i) {
        this.f67997e = str;
        this.f67998f = file;
        this.f67999g = j;
        this.f68000h = i;
    }

    private C10449c getDiskCacheManager() {
        if (this.f67998f.exists()) {
            if (this.f68001i == null) {
                this.f68001i = new C10449c(this.f67998f, this.f67999g, this.f68000h);
            }
        } else if (this.f67998f.mkdirs()) {
            this.f68001i = new C10449c(this.f67998f, this.f67999g, this.f68000h);
        } else {
            Log.e("CacheDiskUtils", "can't make dirs in " + this.f67998f.getAbsolutePath());
        }
        return this.f68001i;
    }

    public static ol1 getInstance() {
        return getInstance("", Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    private byte[] realGetBytes(@efb String str) {
        if (str != null) {
            return realGetBytes(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    private void realPutBytes(String str, byte[] bArr, int i) {
        C10449c diskCacheManager;
        if (bArr == null || (diskCacheManager = getDiskCacheManager()) == null) {
            return;
        }
        if (i >= 0) {
            bArr = C10448b.newByteArrayWithTime(i, bArr);
        }
        File fileBeforePut = diskCacheManager.getFileBeforePut(str);
        C2481n.m4296e1(fileBeforePut, bArr);
        diskCacheManager.updateModify(fileBeforePut);
        diskCacheManager.put(fileBeforePut);
    }

    public boolean clear() {
        C10449c diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return true;
        }
        return diskCacheManager.clear();
    }

    public Bitmap getBitmap(@efb String str) {
        if (str != null) {
            return getBitmap(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public byte[] getBytes(@efb String str) {
        if (str != null) {
            return getBytes(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public int getCacheCount() {
        C10449c diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return 0;
        }
        return diskCacheManager.getCacheCount();
    }

    public long getCacheSize() {
        C10449c diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return 0L;
        }
        return diskCacheManager.getCacheSize();
    }

    public Drawable getDrawable(@efb String str) {
        if (str != null) {
            return getDrawable(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public JSONArray getJSONArray(@efb String str) {
        if (str != null) {
            return getJSONArray(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public JSONObject getJSONObject(@efb String str) {
        if (str != null) {
            return getJSONObject(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator != null) {
            return (T) getParcelable(str, creator, null);
        }
        throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public Object getSerializable(@efb String str) {
        if (str != null) {
            return getSerializable(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public String getString(@efb String str) {
        if (str != null) {
            return getString(str, null);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, byte[] bArr) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        put(str, bArr, -1);
    }

    public boolean remove(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        C10449c diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return true;
        }
        if (diskCacheManager.removeByKey(f67988m + str)) {
            if (diskCacheManager.removeByKey(f67989n + str)) {
                if (diskCacheManager.removeByKey(f67990o + str)) {
                    if (diskCacheManager.removeByKey(f67991p + str)) {
                        if (diskCacheManager.removeByKey(f67992q + str)) {
                            if (diskCacheManager.removeByKey(f67993r + str)) {
                                if (diskCacheManager.removeByKey(f67994s + str)) {
                                    if (diskCacheManager.removeByKey(f67995t + str)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        return this.f67997e + "@" + Integer.toHexString(hashCode());
    }

    public static ol1 getInstance(String str) {
        return getInstance(str, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static ol1 getInstance(long j, int i) {
        return getInstance("", j, i);
    }

    private byte[] realGetBytes(@efb String str, byte[] bArr) {
        File fileIfExists;
        if (str != null) {
            C10449c diskCacheManager = getDiskCacheManager();
            if (diskCacheManager == null || (fileIfExists = diskCacheManager.getFileIfExists(str)) == null) {
                return bArr;
            }
            byte[] bArrM4257N0 = C2481n.m4257N0(fileIfExists);
            if (C10448b.isDue(bArrM4257N0)) {
                diskCacheManager.removeByKey(str);
                return bArr;
            }
            diskCacheManager.updateModify(fileIfExists);
            return C10448b.getDataWithoutDueTime(bArrM4257N0);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public Bitmap getBitmap(@efb String str, Bitmap bitmap) {
        if (str != null) {
            byte[] bArrRealGetBytes = realGetBytes(f67992q + str);
            return bArrRealGetBytes == null ? bitmap : C2481n.m4305i(bArrRealGetBytes);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public byte[] getBytes(@efb String str, byte[] bArr) {
        if (str != null) {
            return realGetBytes(f67988m + str, bArr);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public Drawable getDrawable(@efb String str, Drawable drawable) {
        if (str != null) {
            byte[] bArrRealGetBytes = realGetBytes(f67993r + str);
            return bArrRealGetBytes == null ? drawable : C2481n.m4307j(bArrRealGetBytes);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public JSONArray getJSONArray(@efb String str, JSONArray jSONArray) {
        if (str != null) {
            byte[] bArrRealGetBytes = realGetBytes(f67991p + str);
            return bArrRealGetBytes == null ? jSONArray : C2481n.m4311l(bArrRealGetBytes);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public JSONObject getJSONObject(@efb String str, JSONObject jSONObject) {
        if (str != null) {
            byte[] bArrRealGetBytes = realGetBytes(f67990o + str);
            return bArrRealGetBytes == null ? jSONObject : C2481n.m4313m(bArrRealGetBytes);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public Object getSerializable(@efb String str, Object obj) {
        if (str != null) {
            byte[] bArrRealGetBytes = realGetBytes(f67995t + str);
            return bArrRealGetBytes == null ? obj : C2481n.m4315n(bArrRealGetBytes);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public String getString(@efb String str, String str2) {
        if (str != null) {
            byte[] bArrRealGetBytes = realGetBytes(f67989n + str);
            return bArrRealGetBytes == null ? str2 : C2481n.m4319p(bArrRealGetBytes);
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, byte[] bArr, int i) {
        if (str != null) {
            realPutBytes(f67988m + str, bArr, i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static ol1 getInstance(String str, long j, int i) {
        if (C2481n.m4235C0(str)) {
            str = "cacheUtils";
        }
        return getInstance(new File(C2479l.getApp().getCacheDir(), str), j, i);
    }

    public <T> T getParcelable(@efb String str, @efb Parcelable.Creator<T> creator, T t) {
        if (str == null) {
            throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (creator != null) {
            byte[] bArrRealGetBytes = realGetBytes(f67994s + str);
            return bArrRealGetBytes == null ? t : (T) C2481n.m4317o(bArrRealGetBytes, creator);
        }
        throw new NullPointerException("Argument 'creator' of type Parcelable.Creator<T> (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, String str2) {
        if (str != null) {
            put(str, str2, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static ol1 getInstance(@efb File file) {
        if (file != null) {
            return getInstance(file, Long.MAX_VALUE, Integer.MAX_VALUE);
        }
        throw new NullPointerException("Argument 'cacheDir' of type File (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, String str2, int i) {
        if (str != null) {
            realPutBytes(f67989n + str, C2481n.m4277X0(str2), i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static ol1 getInstance(@efb File file, long j, int i) {
        if (file != null) {
            String str = file.getAbsoluteFile() + p43.f69617m + j + p43.f69617m + i;
            Map<String, ol1> map = f67996u;
            ol1 ol1Var = map.get(str);
            if (ol1Var == null) {
                synchronized (ol1.class) {
                    try {
                        ol1Var = map.get(str);
                        if (ol1Var == null) {
                            ol1 ol1Var2 = new ol1(str, file, j, i);
                            map.put(str, ol1Var2);
                            ol1Var = ol1Var2;
                        }
                    } finally {
                    }
                }
            }
            return ol1Var;
        }
        throw new NullPointerException("Argument 'cacheDir' of type File (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, JSONObject jSONObject) {
        if (str != null) {
            put(str, jSONObject, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, JSONObject jSONObject, int i) {
        if (str != null) {
            realPutBytes(f67990o + str, C2481n.m4241F0(jSONObject), i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, JSONArray jSONArray) {
        if (str != null) {
            put(str, jSONArray, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, JSONArray jSONArray, int i) {
        if (str != null) {
            realPutBytes(f67991p + str, C2481n.m4239E0(jSONArray), i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Bitmap bitmap) {
        if (str != null) {
            put(str, bitmap, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Bitmap bitmap, int i) {
        if (str != null) {
            realPutBytes(f67992q + str, C2481n.m4294e(bitmap), i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Drawable drawable) {
        if (str != null) {
            put(str, drawable, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Drawable drawable, int i) {
        if (str != null) {
            realPutBytes(f67993r + str, C2481n.m4335x(drawable), i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Parcelable parcelable) {
        if (str != null) {
            put(str, parcelable, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Parcelable parcelable, int i) {
        if (str != null) {
            realPutBytes(f67994s + str, C2481n.m4249J0(parcelable), i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Serializable serializable) {
        if (str != null) {
            put(str, serializable, -1);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void put(@efb String str, Serializable serializable, int i) {
        if (str != null) {
            realPutBytes(f67995t + str, C2481n.m4271U0(serializable), i);
            return;
        }
        throw new NullPointerException("Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}

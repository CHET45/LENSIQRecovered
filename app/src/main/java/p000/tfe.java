package p000;

import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.format.Formatter;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tfe {

    /* JADX INFO: renamed from: tfe$a */
    public static class C13016a {

        /* JADX INFO: renamed from: a */
        public String f84547a;

        /* JADX INFO: renamed from: b */
        public String f84548b;

        /* JADX INFO: renamed from: c */
        public boolean f84549c;

        /* JADX INFO: renamed from: d */
        public long f84550d;

        /* JADX INFO: renamed from: e */
        public long f84551e;

        public C13016a(String str, String str2, boolean z) {
            this.f84547a = str;
            this.f84548b = str2;
            this.f84549c = z;
            this.f84550d = C2481n.m4264R(str);
            this.f84551e = C2481n.m4262Q(str);
        }

        public long getAvailableSize() {
            return this.f84551e;
        }

        public String getPath() {
            return this.f84547a;
        }

        public String getState() {
            return this.f84548b;
        }

        public long getTotalSize() {
            return this.f84550d;
        }

        public boolean isRemovable() {
            return this.f84549c;
        }

        public String toString() {
            return "SDCardInfo {path = " + this.f84547a + ", state = " + this.f84548b + ", isRemovable = " + this.f84549c + ", totalSize = " + Formatter.formatFileSize(C2479l.getApp(), this.f84550d) + ", availableSize = " + Formatter.formatFileSize(C2479l.getApp(), this.f84551e) + '}';
        }
    }

    private tfe() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static long getExternalAvailableSize() {
        return C2481n.m4262Q(getSDCardPathByEnvironment());
    }

    public static long getExternalTotalSize() {
        return C2481n.m4264R(getSDCardPathByEnvironment());
    }

    public static long getInternalAvailableSize() {
        return C2481n.m4262Q(Environment.getDataDirectory().getAbsolutePath());
    }

    public static long getInternalTotalSize() {
        return C2481n.m4264R(Environment.getDataDirectory().getAbsolutePath());
    }

    public static List<String> getMountedSDCardPath() {
        ArrayList arrayList = new ArrayList();
        List<C13016a> sDCardInfo = getSDCardInfo();
        if (sDCardInfo != null && !sDCardInfo.isEmpty()) {
            for (C13016a c13016a : sDCardInfo) {
                String str = c13016a.f84548b;
                if (str != null && "mounted".equals(str.toLowerCase())) {
                    arrayList.add(c13016a.f84547a);
                }
            }
        }
        return arrayList;
    }

    public static List<C13016a> getSDCardInfo() {
        ArrayList arrayList = new ArrayList();
        StorageManager storageManager = (StorageManager) C2479l.getApp().getSystemService("storage");
        if (storageManager == null) {
            return arrayList;
        }
        List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
        try {
            Method method = StorageVolume.class.getMethod("getPath", null);
            for (StorageVolume storageVolume : storageVolumes) {
                boolean zIsRemovable = storageVolume.isRemovable();
                arrayList.add(new C13016a((String) method.invoke(storageVolume, null), storageVolume.getState(), zIsRemovable));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
        return arrayList;
    }

    public static String getSDCardPathByEnvironment() {
        return isSDCardEnableByEnvironment() ? Environment.getExternalStorageDirectory().getAbsolutePath() : "";
    }

    public static boolean isSDCardEnableByEnvironment() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}

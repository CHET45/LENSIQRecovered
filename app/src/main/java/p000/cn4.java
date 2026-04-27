package p000;

import android.net.Uri;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p000.bn4;

/* JADX INFO: loaded from: classes6.dex */
public class cn4 extends mr7 implements Comparable<cn4> {

    /* JADX INFO: renamed from: C */
    public final int f17012C;

    /* JADX INFO: renamed from: F */
    public final int f17013F;

    /* JADX INFO: renamed from: H */
    public final int f17014H;

    /* JADX INFO: renamed from: L */
    public final int f17015L;

    /* JADX INFO: renamed from: M */
    public final int f17016M;

    /* JADX INFO: renamed from: M1 */
    public volatile cm4 f17017M1;

    /* JADX INFO: renamed from: N */
    @hib
    public final Integer f17018N;

    /* JADX INFO: renamed from: Q */
    @hib
    public final Boolean f17019Q;

    /* JADX INFO: renamed from: V1 */
    public volatile SparseArray<Object> f17020V1;

    /* JADX INFO: renamed from: X */
    public final boolean f17021X;

    /* JADX INFO: renamed from: Y */
    public final boolean f17022Y;

    /* JADX INFO: renamed from: Z */
    public final int f17023Z;

    /* JADX INFO: renamed from: Z1 */
    public Object f17024Z1;

    /* JADX INFO: renamed from: a2 */
    public final boolean f17025a2;

    /* JADX INFO: renamed from: b2 */
    public final AtomicLong f17026b2 = new AtomicLong();

    /* JADX INFO: renamed from: c */
    public final int f17027c;

    /* JADX INFO: renamed from: c2 */
    public final boolean f17028c2;

    /* JADX INFO: renamed from: d */
    @efb
    public final String f17029d;

    /* JADX INFO: renamed from: d2 */
    @efb
    public final bn4.C1954a f17030d2;

    /* JADX INFO: renamed from: e */
    public final Uri f17031e;

    /* JADX INFO: renamed from: e2 */
    @efb
    public final File f17032e2;

    /* JADX INFO: renamed from: f */
    public final Map<String, List<String>> f17033f;

    /* JADX INFO: renamed from: f2 */
    @efb
    public final File f17034f2;

    /* JADX INFO: renamed from: g2 */
    @hib
    public File f17035g2;

    /* JADX INFO: renamed from: h2 */
    @hib
    public String f17036h2;

    /* JADX INFO: renamed from: m */
    @hib
    public bd1 f17037m;

    /* JADX INFO: renamed from: cn4$c */
    public static class C2403c {
        public static long getLastCallbackProcessTs(cn4 cn4Var) {
            return cn4Var.m4085d();
        }

        public static void setBreakpointInfo(@efb cn4 cn4Var, @efb bd1 bd1Var) {
            cn4Var.m4086e(bd1Var);
        }

        public static void setLastCallbackProcessTs(cn4 cn4Var, long j) {
            cn4Var.m4087f(j);
        }
    }

    public cn4(String str, Uri uri, int i, int i2, int i3, int i4, int i5, boolean z, int i6, Map<String, List<String>> map, @hib String str2, boolean z2, boolean z3, Boolean bool, @hib Integer num, @hib Boolean bool2) {
        Boolean bool3;
        String name = str2;
        this.f17029d = str;
        this.f17031e = uri;
        this.f17012C = i;
        this.f17013F = i2;
        this.f17014H = i3;
        this.f17015L = i4;
        this.f17016M = i5;
        this.f17022Y = z;
        this.f17023Z = i6;
        this.f17033f = map;
        this.f17021X = z2;
        this.f17025a2 = z3;
        this.f17018N = num;
        this.f17019Q = bool2;
        if (q0i.isUriFileScheme(uri)) {
            File file = new File(uri.getPath());
            if (bool != null) {
                if (bool.booleanValue()) {
                    if (file.exists() && file.isFile()) {
                        throw new IllegalArgumentException("If you want filename from response please make sure you provide path is directory " + file.getPath());
                    }
                    if (!q0i.isEmpty(str2)) {
                        q0i.m19916w("DownloadTask", "Discard filename[" + name + "] because you set filenameFromResponse=true");
                        name = null;
                    }
                    this.f17034f2 = file;
                } else {
                    if (file.exists() && file.isDirectory() && q0i.isEmpty(str2)) {
                        throw new IllegalArgumentException("If you don't want filename from response please make sure you have already provided valid filename or not directory path " + file.getPath());
                    }
                    if (q0i.isEmpty(str2)) {
                        name = file.getName();
                        this.f17034f2 = q0i.getParentFile(file);
                    } else {
                        this.f17034f2 = file;
                    }
                }
                bool3 = bool;
            } else if (file.exists() && file.isDirectory()) {
                bool3 = Boolean.TRUE;
                this.f17034f2 = file;
            } else {
                bool3 = Boolean.FALSE;
                if (file.exists()) {
                    if (!q0i.isEmpty(str2) && !file.getName().equals(name)) {
                        throw new IllegalArgumentException("Uri already provided filename!");
                    }
                    name = file.getName();
                    this.f17034f2 = q0i.getParentFile(file);
                } else if (q0i.isEmpty(str2)) {
                    name = file.getName();
                    this.f17034f2 = q0i.getParentFile(file);
                } else {
                    this.f17034f2 = file;
                }
            }
            this.f17028c2 = bool3.booleanValue();
        } else {
            this.f17028c2 = false;
            this.f17034f2 = new File(uri.getPath());
        }
        if (q0i.isEmpty(name)) {
            this.f17030d2 = new bn4.C1954a();
            this.f17032e2 = this.f17034f2;
        } else {
            this.f17030d2 = new bn4.C1954a(name);
            File file2 = new File(this.f17034f2, name);
            this.f17035g2 = file2;
            this.f17032e2 = file2;
        }
        this.f17027c = e0c.with().breakpointStore().findOrCreateId(this);
    }

    public static void enqueue(cn4[] cn4VarArr, cm4 cm4Var) {
        for (cn4 cn4Var : cn4VarArr) {
            cn4Var.f17017M1 = cm4Var;
        }
        e0c.with().downloadDispatcher().enqueue(cn4VarArr);
    }

    public static C2402b mockTaskForCompare(int i) {
        return new C2402b(i);
    }

    @Override // p000.mr7
    @efb
    /* JADX INFO: renamed from: a */
    public File mo4084a() {
        return this.f17032e2;
    }

    public synchronized cn4 addTag(int i, Object obj) {
        try {
            if (this.f17020V1 == null) {
                synchronized (this) {
                    try {
                        if (this.f17020V1 == null) {
                            this.f17020V1 = new SparseArray<>();
                        }
                    } finally {
                    }
                }
            }
            this.f17020V1.put(i, obj);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public void cancel() {
        e0c.with().downloadDispatcher().cancel(this);
    }

    /* JADX INFO: renamed from: d */
    public long m4085d() {
        return this.f17026b2.get();
    }

    /* JADX INFO: renamed from: e */
    public void m4086e(@efb bd1 bd1Var) {
        this.f17037m = bd1Var;
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof cn4)) {
            return false;
        }
        cn4 cn4Var = (cn4) obj;
        if (cn4Var.f17027c == this.f17027c) {
            return true;
        }
        return compareIgnoreId(cn4Var);
    }

    public void execute(cm4 cm4Var) {
        this.f17017M1 = cm4Var;
        e0c.with().downloadDispatcher().execute(this);
    }

    /* JADX INFO: renamed from: f */
    public void m4087f(long j) {
        this.f17026b2.set(j);
    }

    public int getConnectionCount() {
        bd1 bd1Var = this.f17037m;
        if (bd1Var == null) {
            return 0;
        }
        return bd1Var.getBlockCount();
    }

    @hib
    public File getFile() {
        String str = this.f17030d2.get();
        if (str == null) {
            return null;
        }
        if (this.f17035g2 == null) {
            this.f17035g2 = new File(this.f17034f2, str);
        }
        return this.f17035g2;
    }

    @Override // p000.mr7
    @hib
    public String getFilename() {
        return this.f17030d2.get();
    }

    public bn4.C1954a getFilenameHolder() {
        return this.f17030d2;
    }

    public int getFlushBufferSize() {
        return this.f17014H;
    }

    @hib
    public Map<String, List<String>> getHeaderMapFields() {
        return this.f17033f;
    }

    @Override // p000.mr7
    public int getId() {
        return this.f17027c;
    }

    @hib
    public bd1 getInfo() {
        if (this.f17037m == null) {
            this.f17037m = e0c.with().breakpointStore().get(this.f17027c);
        }
        return this.f17037m;
    }

    public cm4 getListener() {
        return this.f17017M1;
    }

    public int getMinIntervalMillisCallbackProcess() {
        return this.f17023Z;
    }

    @Override // p000.mr7
    @efb
    public File getParentFile() {
        return this.f17034f2;
    }

    public int getPriority() {
        return this.f17012C;
    }

    public int getReadBufferSize() {
        return this.f17013F;
    }

    @hib
    public String getRedirectLocation() {
        return this.f17036h2;
    }

    @hib
    public Integer getSetConnectionCount() {
        return this.f17018N;
    }

    @hib
    public Boolean getSetPreAllocateLength() {
        return this.f17019Q;
    }

    public int getSyncBufferIntervalMills() {
        return this.f17016M;
    }

    public int getSyncBufferSize() {
        return this.f17015L;
    }

    public Object getTag(int i) {
        if (this.f17020V1 == null) {
            return null;
        }
        return this.f17020V1.get(i);
    }

    public Uri getUri() {
        return this.f17031e;
    }

    @Override // p000.mr7
    @efb
    public String getUrl() {
        return this.f17029d;
    }

    public int hashCode() {
        return (this.f17029d + this.f17032e2.toString() + this.f17030d2.get()).hashCode();
    }

    public boolean isAutoCallbackToUIThread() {
        return this.f17022Y;
    }

    public boolean isFilenameFromResponse() {
        return this.f17028c2;
    }

    public boolean isPassIfAlreadyCompleted() {
        return this.f17021X;
    }

    public boolean isWifiRequired() {
        return this.f17025a2;
    }

    @efb
    public C2402b mock(int i) {
        return new C2402b(i, this);
    }

    public synchronized void removeTag(int i) {
        if (this.f17020V1 != null) {
            this.f17020V1.remove(i);
        }
    }

    public void replaceListener(@efb cm4 cm4Var) {
        this.f17017M1 = cm4Var;
    }

    public void setRedirectLocation(@hib String str) {
        this.f17036h2 = str;
    }

    public void setTag(Object obj) {
        this.f17024Z1 = obj;
    }

    public void setTags(cn4 cn4Var) {
        this.f17024Z1 = cn4Var.f17024Z1;
        this.f17020V1 = cn4Var.f17020V1;
    }

    public C2401a toBuilder(String str, Uri uri) {
        C2401a passIfAlreadyCompleted = new C2401a(str, uri).setPriority(this.f17012C).setReadBufferSize(this.f17013F).setFlushBufferSize(this.f17014H).setSyncBufferSize(this.f17015L).setSyncBufferIntervalMillis(this.f17016M).setAutoCallbackToUIThread(this.f17022Y).setMinIntervalMillisCallbackProcess(this.f17023Z).setHeaderMapFields(this.f17033f).setPassIfAlreadyCompleted(this.f17021X);
        if (q0i.isUriFileScheme(uri) && !new File(uri.getPath()).isFile() && q0i.isUriFileScheme(this.f17031e) && this.f17030d2.get() != null && !new File(this.f17031e.getPath()).getName().equals(this.f17030d2.get())) {
            passIfAlreadyCompleted.setFilename(this.f17030d2.get());
        }
        return passIfAlreadyCompleted;
    }

    public String toString() {
        return super.toString() + "@" + this.f17027c + "@" + this.f17029d + "@" + this.f17034f2.toString() + pj4.f71071b + this.f17030d2.get();
    }

    public static void cancel(cn4[] cn4VarArr) {
        e0c.with().downloadDispatcher().cancel(cn4VarArr);
    }

    @Override // java.lang.Comparable
    public int compareTo(@efb cn4 cn4Var) {
        return cn4Var.getPriority() - getPriority();
    }

    public Object getTag() {
        return this.f17024Z1;
    }

    public synchronized void removeTag() {
        this.f17024Z1 = null;
    }

    /* JADX INFO: renamed from: cn4$a */
    public static class C2401a {

        /* JADX INFO: renamed from: q */
        public static final int f17038q = 4096;

        /* JADX INFO: renamed from: r */
        public static final int f17039r = 16384;

        /* JADX INFO: renamed from: s */
        public static final int f17040s = 65536;

        /* JADX INFO: renamed from: t */
        public static final int f17041t = 2000;

        /* JADX INFO: renamed from: u */
        public static final boolean f17042u = true;

        /* JADX INFO: renamed from: v */
        public static final int f17043v = 3000;

        /* JADX INFO: renamed from: w */
        public static final boolean f17044w = true;

        /* JADX INFO: renamed from: x */
        public static final boolean f17045x = false;

        /* JADX INFO: renamed from: a */
        @efb
        public final String f17046a;

        /* JADX INFO: renamed from: b */
        @efb
        public final Uri f17047b;

        /* JADX INFO: renamed from: c */
        public volatile Map<String, List<String>> f17048c;

        /* JADX INFO: renamed from: d */
        public int f17049d;

        /* JADX INFO: renamed from: e */
        public int f17050e;

        /* JADX INFO: renamed from: f */
        public int f17051f;

        /* JADX INFO: renamed from: g */
        public int f17052g;

        /* JADX INFO: renamed from: h */
        public int f17053h;

        /* JADX INFO: renamed from: i */
        public boolean f17054i;

        /* JADX INFO: renamed from: j */
        public int f17055j;

        /* JADX INFO: renamed from: k */
        public String f17056k;

        /* JADX INFO: renamed from: l */
        public boolean f17057l;

        /* JADX INFO: renamed from: m */
        public boolean f17058m;

        /* JADX INFO: renamed from: n */
        public Boolean f17059n;

        /* JADX INFO: renamed from: o */
        public Integer f17060o;

        /* JADX INFO: renamed from: p */
        public Boolean f17061p;

        public C2401a(@efb String str, @efb String str2, @hib String str3) {
            this(str, Uri.fromFile(new File(str2)));
            if (q0i.isEmpty(str3)) {
                this.f17059n = Boolean.TRUE;
            } else {
                this.f17056k = str3;
            }
        }

        public synchronized void addHeader(String str, String str2) {
            try {
                if (this.f17048c == null) {
                    this.f17048c = new HashMap();
                }
                List<String> arrayList = this.f17048c.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f17048c.put(str, arrayList);
                }
                arrayList.add(str2);
            } catch (Throwable th) {
                throw th;
            }
        }

        public cn4 build() {
            return new cn4(this.f17046a, this.f17047b, this.f17049d, this.f17050e, this.f17051f, this.f17052g, this.f17053h, this.f17054i, this.f17055j, this.f17048c, this.f17056k, this.f17057l, this.f17058m, this.f17059n, this.f17060o, this.f17061p);
        }

        public C2401a setAutoCallbackToUIThread(boolean z) {
            this.f17054i = z;
            return this;
        }

        public C2401a setConnectionCount(@h78(from = 1) int i) {
            this.f17060o = Integer.valueOf(i);
            return this;
        }

        public C2401a setFilename(String str) {
            this.f17056k = str;
            return this;
        }

        public C2401a setFilenameFromResponse(@hib Boolean bool) {
            if (!q0i.isUriFileScheme(this.f17047b)) {
                throw new IllegalArgumentException("Uri isn't file scheme we can't let filename from response");
            }
            this.f17059n = bool;
            return this;
        }

        public C2401a setFlushBufferSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Value must be positive!");
            }
            this.f17051f = i;
            return this;
        }

        public C2401a setHeaderMapFields(Map<String, List<String>> map) {
            this.f17048c = map;
            return this;
        }

        public C2401a setMinIntervalMillisCallbackProcess(int i) {
            this.f17055j = i;
            return this;
        }

        public C2401a setPassIfAlreadyCompleted(boolean z) {
            this.f17057l = z;
            return this;
        }

        public C2401a setPreAllocateLength(boolean z) {
            this.f17061p = Boolean.valueOf(z);
            return this;
        }

        public C2401a setPriority(int i) {
            this.f17049d = i;
            return this;
        }

        public C2401a setReadBufferSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Value must be positive!");
            }
            this.f17050e = i;
            return this;
        }

        public C2401a setSyncBufferIntervalMillis(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Value must be positive!");
            }
            this.f17053h = i;
            return this;
        }

        public C2401a setSyncBufferSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Value must be positive!");
            }
            this.f17052g = i;
            return this;
        }

        public C2401a setWifiRequired(boolean z) {
            this.f17058m = z;
            return this;
        }

        public C2401a(@efb String str, @efb File file) {
            this.f17050e = 4096;
            this.f17051f = 16384;
            this.f17052g = 65536;
            this.f17053h = 2000;
            this.f17054i = true;
            this.f17055j = 3000;
            this.f17057l = true;
            this.f17058m = false;
            this.f17046a = str;
            this.f17047b = Uri.fromFile(file);
        }

        public C2401a(@efb String str, @efb Uri uri) {
            this.f17050e = 4096;
            this.f17051f = 16384;
            this.f17052g = 65536;
            this.f17053h = 2000;
            this.f17054i = true;
            this.f17055j = 3000;
            this.f17057l = true;
            this.f17058m = false;
            this.f17046a = str;
            this.f17047b = uri;
            if (q0i.isUriContentScheme(uri)) {
                this.f17056k = q0i.getFilenameFromContentUri(uri);
            }
        }
    }

    public void enqueue(cm4 cm4Var) {
        this.f17017M1 = cm4Var;
        e0c.with().downloadDispatcher().enqueue(this);
    }

    /* JADX INFO: renamed from: cn4$b */
    public static class C2402b extends mr7 {

        /* JADX INFO: renamed from: c */
        public final int f17062c;

        /* JADX INFO: renamed from: d */
        @efb
        public final String f17063d;

        /* JADX INFO: renamed from: e */
        @efb
        public final File f17064e;

        /* JADX INFO: renamed from: f */
        @hib
        public final String f17065f;

        /* JADX INFO: renamed from: m */
        @efb
        public final File f17066m;

        public C2402b(int i) {
            this.f17062c = i;
            this.f17063d = "";
            File file = mr7.f61785b;
            this.f17064e = file;
            this.f17065f = null;
            this.f17066m = file;
        }

        @Override // p000.mr7
        @efb
        /* JADX INFO: renamed from: a */
        public File mo4084a() {
            return this.f17064e;
        }

        @Override // p000.mr7
        @hib
        public String getFilename() {
            return this.f17065f;
        }

        @Override // p000.mr7
        public int getId() {
            return this.f17062c;
        }

        @Override // p000.mr7
        @efb
        public File getParentFile() {
            return this.f17066m;
        }

        @Override // p000.mr7
        @efb
        public String getUrl() {
            return this.f17063d;
        }

        public C2402b(int i, @efb cn4 cn4Var) {
            this.f17062c = i;
            this.f17063d = cn4Var.f17029d;
            this.f17066m = cn4Var.getParentFile();
            this.f17064e = cn4Var.f17032e2;
            this.f17065f = cn4Var.getFilename();
        }
    }

    public C2401a toBuilder() {
        return toBuilder(this.f17029d, this.f17031e);
    }
}

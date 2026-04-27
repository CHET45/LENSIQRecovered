package p000;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class fdd {

    /* JADX INFO: renamed from: f */
    @yfb
    public static final String f36227f = "SupportSQLiteLock";

    /* JADX INFO: renamed from: a */
    public final boolean f36229a;

    /* JADX INFO: renamed from: b */
    @gib
    public final File f36230b;

    /* JADX INFO: renamed from: c */
    @yfb
    @igg({"SyntheticAccessor"})
    public final Lock f36231c;

    /* JADX INFO: renamed from: d */
    @gib
    public FileChannel f36232d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C5733a f36226e = new C5733a(null);

    /* JADX INFO: renamed from: g */
    @yfb
    public static final Map<String, Lock> f36228g = new HashMap();

    /* JADX INFO: renamed from: fdd$a */
    public static final class C5733a {
        public /* synthetic */ C5733a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock getThreadLock(String str) {
            Lock lock;
            synchronized (fdd.f36228g) {
                try {
                    Map map = fdd.f36228g;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        private C5733a() {
        }
    }

    public fdd(@yfb String str, @gib File file, boolean z) {
        File file2;
        md8.checkNotNullParameter(str, "name");
        this.f36229a = z;
        if (file != null) {
            file2 = new File(file, str + ".lck");
        } else {
            file2 = null;
        }
        this.f36230b = file2;
        this.f36231c = f36226e.getThreadLock(str);
    }

    public static /* synthetic */ void lock$default(fdd fddVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fddVar.f36229a;
        }
        fddVar.lock(z);
    }

    public final void lock(boolean z) {
        this.f36231c.lock();
        if (z) {
            try {
                File file = this.f36230b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f36230b).getChannel();
                channel.lock();
                this.f36232d = channel;
            } catch (IOException e) {
                this.f36232d = null;
                Log.w(f36227f, "Unable to grab file lock.", e);
            }
        }
    }

    public final void unlock() {
        try {
            FileChannel fileChannel = this.f36232d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f36231c.unlock();
    }
}

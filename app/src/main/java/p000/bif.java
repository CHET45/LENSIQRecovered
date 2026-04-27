package p000;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import p000.dl1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class bif implements dl1 {

    /* JADX INFO: renamed from: m */
    public static final String f13819m = "SimpleCache";

    /* JADX INFO: renamed from: n */
    public static final int f13820n = 10;

    /* JADX INFO: renamed from: o */
    public static final String f13821o = ".uid";

    /* JADX INFO: renamed from: p */
    public static final HashSet<File> f13822p = new HashSet<>();

    /* JADX INFO: renamed from: b */
    public final File f13823b;

    /* JADX INFO: renamed from: c */
    public final xl1 f13824c;

    /* JADX INFO: renamed from: d */
    public final vm1 f13825d;

    /* JADX INFO: renamed from: e */
    @hib
    public final bm1 f13826e;

    /* JADX INFO: renamed from: f */
    public final HashMap<String, ArrayList<dl1.InterfaceC4843b>> f13827f;

    /* JADX INFO: renamed from: g */
    public final Random f13828g;

    /* JADX INFO: renamed from: h */
    public final boolean f13829h;

    /* JADX INFO: renamed from: i */
    public long f13830i;

    /* JADX INFO: renamed from: j */
    public long f13831j;

    /* JADX INFO: renamed from: k */
    public boolean f13832k;

    /* JADX INFO: renamed from: l */
    public dl1.C4842a f13833l;

    /* JADX INFO: renamed from: bif$a */
    public class C1915a extends Thread {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ConditionVariable f13834a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1915a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f13834a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (bif.this) {
                this.f13834a.open();
                bif.this.initialize();
                bif.this.f13824c.onCacheInitialized();
            }
        }
    }

    @Deprecated
    public bif(File file, xl1 xl1Var) {
        this(file, xl1Var, null, null, false, true);
    }

    private void addSpan(dif difVar) {
        this.f13825d.getOrAdd(difVar.f61456a).addSpan(difVar);
        this.f13831j += difVar.f61458c;
        notifySpanAdded(difVar);
    }

    private static void createCacheDirectories(File file) throws dl1.C4842a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        yh9.m25915e("SimpleCache", str);
        throw new dl1.C4842a(str);
    }

    private static long createUid(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    @xqi
    public static void delete(File file, @hib si3 si3Var) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (si3Var != null) {
                long jLoadUid = loadUid(fileArrListFiles);
                if (jLoadUid != -1) {
                    try {
                        bm1.delete(si3Var, jLoadUid);
                    } catch (oi3 unused) {
                        yh9.m25919w("SimpleCache", "Failed to delete file metadata: " + jLoadUid);
                    }
                    try {
                        vm1.delete(si3Var, jLoadUid);
                    } catch (oi3 unused2) {
                        yh9.m25919w("SimpleCache", "Failed to delete file metadata: " + jLoadUid);
                    }
                }
            }
            x0i.recursiveDelete(file);
        }
    }

    private dif getSpan(String str, long j, long j2) {
        dif span;
        tm1 tm1Var = this.f13825d.get(str);
        if (tm1Var == null) {
            return dif.createHole(str, j, j2);
        }
        while (true) {
            span = tm1Var.getSpan(j, j2);
            if (!span.f61459d || span.f61460e.length() == span.f61458c) {
                break;
            }
            removeStaleSpans();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize() {
        if (!this.f13823b.exists()) {
            try {
                createCacheDirectories(this.f13823b);
            } catch (dl1.C4842a e) {
                this.f13833l = e;
                return;
            }
        }
        File[] fileArrListFiles = this.f13823b.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f13823b;
            yh9.m25915e("SimpleCache", str);
            this.f13833l = new dl1.C4842a(str);
            return;
        }
        long jLoadUid = loadUid(fileArrListFiles);
        this.f13830i = jLoadUid;
        if (jLoadUid == -1) {
            try {
                this.f13830i = createUid(this.f13823b);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.f13823b;
                yh9.m25916e("SimpleCache", str2, e2);
                this.f13833l = new dl1.C4842a(str2, e2);
                return;
            }
        }
        try {
            this.f13825d.initialize(this.f13830i);
            bm1 bm1Var = this.f13826e;
            if (bm1Var != null) {
                bm1Var.initialize(this.f13830i);
                Map<String, zl1> all = this.f13826e.getAll();
                loadDirectory(this.f13823b, true, fileArrListFiles, all);
                this.f13826e.removeAll(all.keySet());
            } else {
                loadDirectory(this.f13823b, true, fileArrListFiles, null);
            }
            this.f13825d.removeEmpty();
            try {
                this.f13825d.store();
            } catch (IOException e3) {
                yh9.m25916e("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + this.f13823b;
            yh9.m25916e("SimpleCache", str3, e4);
            this.f13833l = new dl1.C4842a(str3, e4);
        }
    }

    public static synchronized boolean isCacheFolderLocked(File file) {
        return f13822p.contains(file.getAbsoluteFile());
    }

    private void loadDirectory(File file, boolean z, @hib File[] fileArr, @hib Map<String, zl1> map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                loadDirectory(file2, false, file2.listFiles(), map);
            } else if (!z || (!vm1.isIndexFile(name) && !name.endsWith(".uid"))) {
                zl1 zl1VarRemove = map != null ? map.remove(name) : null;
                if (zl1VarRemove != null) {
                    j2 = zl1VarRemove.f105370a;
                    j = zl1VarRemove.f105371b;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                dif difVarCreateCacheEntry = dif.createCacheEntry(file2, j2, j, this.f13825d);
                if (difVarCreateCacheEntry != null) {
                    addSpan(difVarCreateCacheEntry);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long loadUid(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return parseUid(name);
                } catch (NumberFormatException unused) {
                    yh9.m25915e("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static synchronized boolean lockFolder(File file) {
        return f13822p.add(file.getAbsoluteFile());
    }

    private void notifySpanAdded(dif difVar) {
        ArrayList<dl1.InterfaceC4843b> arrayList = this.f13827f.get(difVar.f61456a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanAdded(this, difVar);
            }
        }
        this.f13824c.onSpanAdded(this, difVar);
    }

    private void notifySpanRemoved(mm1 mm1Var) {
        ArrayList<dl1.InterfaceC4843b> arrayList = this.f13827f.get(mm1Var.f61456a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanRemoved(this, mm1Var);
            }
        }
        this.f13824c.onSpanRemoved(this, mm1Var);
    }

    private void notifySpanTouched(dif difVar, mm1 mm1Var) {
        ArrayList<dl1.InterfaceC4843b> arrayList = this.f13827f.get(difVar.f61456a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanTouched(this, difVar, mm1Var);
            }
        }
        this.f13824c.onSpanTouched(this, difVar, mm1Var);
    }

    private static long parseUid(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void removeSpanInternal(mm1 mm1Var) {
        tm1 tm1Var = this.f13825d.get(mm1Var.f61456a);
        if (tm1Var == null || !tm1Var.removeSpan(mm1Var)) {
            return;
        }
        this.f13831j -= mm1Var.f61458c;
        if (this.f13826e != null) {
            String name = mm1Var.f61460e.getName();
            try {
                this.f13826e.remove(name);
            } catch (IOException unused) {
                yh9.m25919w("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f13825d.maybeRemove(tm1Var.f85298b);
        notifySpanRemoved(mm1Var);
    }

    private void removeStaleSpans() {
        ArrayList arrayList = new ArrayList();
        Iterator<tm1> it = this.f13825d.getAll().iterator();
        while (it.hasNext()) {
            for (dif difVar : it.next().getSpans()) {
                if (difVar.f61460e.length() != difVar.f61458c) {
                    arrayList.add(difVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            removeSpanInternal((mm1) arrayList.get(i));
        }
    }

    private dif touchSpan(String str, dif difVar) {
        boolean z;
        if (!this.f13829h) {
            return difVar;
        }
        String name = ((File) u80.checkNotNull(difVar.f61460e)).getName();
        long j = difVar.f61458c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        bm1 bm1Var = this.f13826e;
        if (bm1Var != null) {
            try {
                bm1Var.set(name, j, jCurrentTimeMillis);
            } catch (IOException unused) {
                yh9.m25919w("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        dif lastTouchTimestamp = this.f13825d.get(str).setLastTouchTimestamp(difVar, jCurrentTimeMillis, z);
        notifySpanTouched(difVar, lastTouchTimestamp);
        return lastTouchTimestamp;
    }

    private static synchronized void unlockFolder(File file) {
        f13822p.remove(file.getAbsoluteFile());
    }

    @Override // p000.dl1
    public synchronized NavigableSet<mm1> addListener(String str, dl1.InterfaceC4843b interfaceC4843b) {
        try {
            u80.checkState(!this.f13832k);
            u80.checkNotNull(str);
            u80.checkNotNull(interfaceC4843b);
            ArrayList<dl1.InterfaceC4843b> arrayList = this.f13827f.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f13827f.put(str, arrayList);
            }
            arrayList.add(interfaceC4843b);
        } catch (Throwable th) {
            throw th;
        }
        return getCachedSpans(str);
    }

    @Override // p000.dl1
    public synchronized void applyContentMetadataMutations(String str, qw2 qw2Var) throws dl1.C4842a {
        u80.checkState(!this.f13832k);
        checkInitialization();
        this.f13825d.applyContentMetadataMutations(str, qw2Var);
        try {
            this.f13825d.store();
        } catch (IOException e) {
            throw new dl1.C4842a(e);
        }
    }

    public synchronized void checkInitialization() throws dl1.C4842a {
        dl1.C4842a c4842a = this.f13833l;
        if (c4842a != null) {
            throw c4842a;
        }
    }

    @Override // p000.dl1
    public synchronized void commitFile(File file, long j) throws dl1.C4842a {
        u80.checkState(!this.f13832k);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            dif difVar = (dif) u80.checkNotNull(dif.createCacheEntry(file, j, this.f13825d));
            tm1 tm1Var = (tm1) u80.checkNotNull(this.f13825d.get(difVar.f61456a));
            u80.checkState(tm1Var.isFullyLocked(difVar.f61457b, difVar.f61458c));
            long contentLength = ow2.getContentLength(tm1Var.getMetadata());
            if (contentLength != -1) {
                u80.checkState(difVar.f61457b + difVar.f61458c <= contentLength);
            }
            if (this.f13826e == null) {
                addSpan(difVar);
                this.f13825d.store();
                notifyAll();
                return;
            }
            try {
                this.f13826e.set(file.getName(), difVar.f61458c, difVar.f61461f);
                addSpan(difVar);
                try {
                    this.f13825d.store();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new dl1.C4842a(e);
                }
            } catch (IOException e2) {
                throw new dl1.C4842a(e2);
            }
        }
    }

    @Override // p000.dl1
    public synchronized long getCacheSpace() {
        u80.checkState(!this.f13832k);
        return this.f13831j;
    }

    @Override // p000.dl1
    public synchronized long getCachedBytes(String str, long j, long j2) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
        long j5 = j4 < 0 ? Long.MAX_VALUE : j4;
        long j6 = j;
        j3 = 0;
        while (j6 < j5) {
            long cachedLength = getCachedLength(str, j6, j5 - j6);
            if (cachedLength > 0) {
                j3 += cachedLength;
            } else {
                cachedLength = -cachedLength;
            }
            j6 += cachedLength;
        }
        return j3;
    }

    @Override // p000.dl1
    public synchronized long getCachedLength(String str, long j, long j2) {
        tm1 tm1Var;
        u80.checkState(!this.f13832k);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        tm1Var = this.f13825d.get(str);
        return tm1Var != null ? tm1Var.getCachedBytesLength(j, j2) : -j2;
    }

    @Override // p000.dl1
    public synchronized NavigableSet<mm1> getCachedSpans(String str) {
        tm1 tm1Var;
        try {
            u80.checkState(!this.f13832k);
            tm1Var = this.f13825d.get(str);
        } catch (Throwable th) {
            throw th;
        }
        return (tm1Var == null || tm1Var.isEmpty()) ? new TreeSet() : new TreeSet((Collection) tm1Var.getSpans());
    }

    @Override // p000.dl1
    public synchronized ow2 getContentMetadata(String str) {
        u80.checkState(!this.f13832k);
        return this.f13825d.getContentMetadata(str);
    }

    @Override // p000.dl1
    public synchronized Set<String> getKeys() {
        u80.checkState(!this.f13832k);
        return new HashSet(this.f13825d.getKeys());
    }

    @Override // p000.dl1
    public synchronized long getUid() {
        return this.f13830i;
    }

    @Override // p000.dl1
    public synchronized boolean isCached(String str, long j, long j2) {
        boolean z;
        z = false;
        u80.checkState(!this.f13832k);
        tm1 tm1Var = this.f13825d.get(str);
        if (tm1Var != null) {
            if (tm1Var.getCachedBytesLength(j, j2) >= j2) {
                z = true;
            }
        }
        return z;
    }

    @Override // p000.dl1
    public synchronized void release() {
        if (this.f13832k) {
            return;
        }
        this.f13827f.clear();
        removeStaleSpans();
        try {
            try {
                this.f13825d.store();
                unlockFolder(this.f13823b);
            } catch (Throwable th) {
                unlockFolder(this.f13823b);
                this.f13832k = true;
                throw th;
            }
        } catch (IOException e) {
            yh9.m25916e("SimpleCache", "Storing index file failed", e);
            unlockFolder(this.f13823b);
        }
        this.f13832k = true;
    }

    @Override // p000.dl1
    public synchronized void releaseHoleSpan(mm1 mm1Var) {
        u80.checkState(!this.f13832k);
        tm1 tm1Var = (tm1) u80.checkNotNull(this.f13825d.get(mm1Var.f61456a));
        tm1Var.unlockRange(mm1Var.f61457b);
        this.f13825d.maybeRemove(tm1Var.f85298b);
        notifyAll();
    }

    @Override // p000.dl1
    public synchronized void removeListener(String str, dl1.InterfaceC4843b interfaceC4843b) {
        if (this.f13832k) {
            return;
        }
        ArrayList<dl1.InterfaceC4843b> arrayList = this.f13827f.get(str);
        if (arrayList != null) {
            arrayList.remove(interfaceC4843b);
            if (arrayList.isEmpty()) {
                this.f13827f.remove(str);
            }
        }
    }

    @Override // p000.dl1
    public synchronized void removeResource(String str) {
        u80.checkState(!this.f13832k);
        Iterator<mm1> it = getCachedSpans(str).iterator();
        while (it.hasNext()) {
            removeSpanInternal(it.next());
        }
    }

    @Override // p000.dl1
    public synchronized void removeSpan(mm1 mm1Var) {
        u80.checkState(!this.f13832k);
        removeSpanInternal(mm1Var);
    }

    @Override // p000.dl1
    public synchronized File startFile(String str, long j, long j2) throws dl1.C4842a {
        tm1 tm1Var;
        File file;
        try {
            u80.checkState(!this.f13832k);
            checkInitialization();
            tm1Var = this.f13825d.get(str);
            u80.checkNotNull(tm1Var);
            u80.checkState(tm1Var.isFullyLocked(j, j2));
            if (!this.f13823b.exists()) {
                createCacheDirectories(this.f13823b);
                removeStaleSpans();
            }
            this.f13824c.onStartFile(this, str, j, j2);
            file = new File(this.f13823b, Integer.toString(this.f13828g.nextInt(10)));
            if (!file.exists()) {
                createCacheDirectories(file);
            }
        } catch (Throwable th) {
            throw th;
        }
        return dif.getCacheFile(file, tm1Var.f85297a, j, System.currentTimeMillis());
    }

    @Override // p000.dl1
    public synchronized mm1 startReadWrite(String str, long j, long j2) throws InterruptedException, dl1.C4842a {
        mm1 mm1VarStartReadWriteNonBlocking;
        u80.checkState(!this.f13832k);
        checkInitialization();
        while (true) {
            mm1VarStartReadWriteNonBlocking = startReadWriteNonBlocking(str, j, j2);
            if (mm1VarStartReadWriteNonBlocking == null) {
                wait();
            }
        }
        return mm1VarStartReadWriteNonBlocking;
    }

    @Override // p000.dl1
    @hib
    public synchronized mm1 startReadWriteNonBlocking(String str, long j, long j2) throws dl1.C4842a {
        u80.checkState(!this.f13832k);
        checkInitialization();
        dif span = getSpan(str, j, j2);
        if (span.f61459d) {
            return touchSpan(str, span);
        }
        if (this.f13825d.getOrAdd(str).lockRange(j, span.f61458c)) {
            return span;
        }
        return null;
    }

    public bif(File file, xl1 xl1Var, si3 si3Var) {
        this(file, xl1Var, si3Var, null, false, false);
    }

    public bif(File file, xl1 xl1Var, @hib si3 si3Var, @hib byte[] bArr, boolean z, boolean z2) {
        this(file, xl1Var, new vm1(si3Var, file, bArr, z, z2), (si3Var == null || z2) ? null : new bm1(si3Var));
    }

    public bif(File file, xl1 xl1Var, vm1 vm1Var, @hib bm1 bm1Var) {
        if (lockFolder(file)) {
            this.f13823b = file;
            this.f13824c = xl1Var;
            this.f13825d = vm1Var;
            this.f13826e = bm1Var;
            this.f13827f = new HashMap<>();
            this.f13828g = new Random();
            this.f13829h = xl1Var.requiresCacheSpanTouches();
            this.f13830i = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C1915a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}

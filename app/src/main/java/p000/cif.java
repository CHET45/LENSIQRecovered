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
import p000.cl1;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class cif implements cl1 {

    /* JADX INFO: renamed from: m */
    public static final String f16647m = "SimpleCache";

    /* JADX INFO: renamed from: n */
    public static final int f16648n = 10;

    /* JADX INFO: renamed from: o */
    public static final String f16649o = ".uid";

    /* JADX INFO: renamed from: p */
    public static final HashSet<File> f16650p = new HashSet<>();

    /* JADX INFO: renamed from: b */
    public final File f16651b;

    /* JADX INFO: renamed from: c */
    public final yl1 f16652c;

    /* JADX INFO: renamed from: d */
    public final um1 f16653d;

    /* JADX INFO: renamed from: e */
    @hib
    public final cm1 f16654e;

    /* JADX INFO: renamed from: f */
    public final HashMap<String, ArrayList<cl1.InterfaceC2375b>> f16655f;

    /* JADX INFO: renamed from: g */
    public final Random f16656g;

    /* JADX INFO: renamed from: h */
    public final boolean f16657h;

    /* JADX INFO: renamed from: i */
    public long f16658i;

    /* JADX INFO: renamed from: j */
    public long f16659j;

    /* JADX INFO: renamed from: k */
    public boolean f16660k;

    /* JADX INFO: renamed from: l */
    public cl1.C2374a f16661l;

    /* JADX INFO: renamed from: cif$a */
    public class C2325a extends Thread {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ConditionVariable f16662a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2325a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f16662a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (cif.this) {
                this.f16662a.open();
                cif.this.initialize();
                cif.this.f16652c.onCacheInitialized();
            }
        }
    }

    @Deprecated
    public cif(File file, yl1 yl1Var) {
        this(file, yl1Var, null, null, false, true);
    }

    private void addSpan(eif eifVar) {
        this.f16653d.getOrAdd(eifVar.f64969a).addSpan(eifVar);
        this.f16659j += eifVar.f64971c;
        notifySpanAdded(eifVar);
    }

    private static void createCacheDirectories(File file) throws cl1.C2374a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        xh9.m25144e("SimpleCache", str);
        throw new cl1.C2374a(str);
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
    public static void delete(File file, @hib ti3 ti3Var) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (ti3Var != null) {
                long jLoadUid = loadUid(fileArrListFiles);
                if (jLoadUid != -1) {
                    try {
                        cm1.delete(ti3Var, jLoadUid);
                    } catch (pi3 unused) {
                        xh9.m25148w("SimpleCache", "Failed to delete file metadata: " + jLoadUid);
                    }
                    try {
                        um1.delete(ti3Var, jLoadUid);
                    } catch (pi3 unused2) {
                        xh9.m25148w("SimpleCache", "Failed to delete file metadata: " + jLoadUid);
                    }
                }
            }
            t0i.recursiveDelete(file);
        }
    }

    private eif getSpan(String str, long j, long j2) {
        eif span;
        sm1 sm1Var = this.f16653d.get(str);
        if (sm1Var == null) {
            return eif.createHole(str, j, j2);
        }
        while (true) {
            span = sm1Var.getSpan(j, j2);
            if (!span.f64972d || ((File) v80.checkNotNull(span.f64973e)).length() == span.f64971c) {
                break;
            }
            removeStaleSpans();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize() {
        if (!this.f16651b.exists()) {
            try {
                createCacheDirectories(this.f16651b);
            } catch (cl1.C2374a e) {
                this.f16661l = e;
                return;
            }
        }
        File[] fileArrListFiles = this.f16651b.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f16651b;
            xh9.m25144e("SimpleCache", str);
            this.f16661l = new cl1.C2374a(str);
            return;
        }
        long jLoadUid = loadUid(fileArrListFiles);
        this.f16658i = jLoadUid;
        if (jLoadUid == -1) {
            try {
                this.f16658i = createUid(this.f16651b);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.f16651b;
                xh9.m25145e("SimpleCache", str2, e2);
                this.f16661l = new cl1.C2374a(str2, e2);
                return;
            }
        }
        try {
            this.f16653d.initialize(this.f16658i);
            cm1 cm1Var = this.f16654e;
            if (cm1Var != null) {
                cm1Var.initialize(this.f16658i);
                Map<String, am1> all = this.f16654e.getAll();
                loadDirectory(this.f16651b, true, fileArrListFiles, all);
                this.f16654e.removeAll(all.keySet());
            } else {
                loadDirectory(this.f16651b, true, fileArrListFiles, null);
            }
            this.f16653d.removeEmpty();
            try {
                this.f16653d.store();
            } catch (IOException e3) {
                xh9.m25145e("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + this.f16651b;
            xh9.m25145e("SimpleCache", str3, e4);
            this.f16661l = new cl1.C2374a(str3, e4);
        }
    }

    public static synchronized boolean isCacheFolderLocked(File file) {
        return f16650p.contains(file.getAbsoluteFile());
    }

    private void loadDirectory(File file, boolean z, @hib File[] fileArr, @hib Map<String, am1> map) {
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
            } else if (!z || (!um1.isIndexFile(name) && !name.endsWith(".uid"))) {
                am1 am1VarRemove = map != null ? map.remove(name) : null;
                if (am1VarRemove != null) {
                    j2 = am1VarRemove.f2020a;
                    j = am1VarRemove.f2021b;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                eif eifVarCreateCacheEntry = eif.createCacheEntry(file2, j2, j, this.f16653d);
                if (eifVarCreateCacheEntry != null) {
                    addSpan(eifVarCreateCacheEntry);
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
                    xh9.m25144e("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static synchronized boolean lockFolder(File file) {
        return f16650p.add(file.getAbsoluteFile());
    }

    private void notifySpanAdded(eif eifVar) {
        ArrayList<cl1.InterfaceC2375b> arrayList = this.f16655f.get(eifVar.f64969a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanAdded(this, eifVar);
            }
        }
        this.f16652c.onSpanAdded(this, eifVar);
    }

    private void notifySpanRemoved(nm1 nm1Var) {
        ArrayList<cl1.InterfaceC2375b> arrayList = this.f16655f.get(nm1Var.f64969a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanRemoved(this, nm1Var);
            }
        }
        this.f16652c.onSpanRemoved(this, nm1Var);
    }

    private void notifySpanTouched(eif eifVar, nm1 nm1Var) {
        ArrayList<cl1.InterfaceC2375b> arrayList = this.f16655f.get(eifVar.f64969a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onSpanTouched(this, eifVar, nm1Var);
            }
        }
        this.f16652c.onSpanTouched(this, eifVar, nm1Var);
    }

    private static long parseUid(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void removeSpanInternal(nm1 nm1Var) {
        sm1 sm1Var = this.f16653d.get(nm1Var.f64969a);
        if (sm1Var == null || !sm1Var.removeSpan(nm1Var)) {
            return;
        }
        this.f16659j -= nm1Var.f64971c;
        if (this.f16654e != null) {
            String name = ((File) v80.checkNotNull(nm1Var.f64973e)).getName();
            try {
                this.f16654e.remove(name);
            } catch (IOException unused) {
                xh9.m25148w("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f16653d.maybeRemove(sm1Var.f82211b);
        notifySpanRemoved(nm1Var);
    }

    private void removeStaleSpans() {
        ArrayList arrayList = new ArrayList();
        Iterator<sm1> it = this.f16653d.getAll().iterator();
        while (it.hasNext()) {
            for (eif eifVar : it.next().getSpans()) {
                if (((File) v80.checkNotNull(eifVar.f64973e)).length() != eifVar.f64971c) {
                    arrayList.add(eifVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            removeSpanInternal((nm1) arrayList.get(i));
        }
    }

    private eif touchSpan(String str, eif eifVar) {
        boolean z;
        if (!this.f16657h) {
            return eifVar;
        }
        String name = ((File) v80.checkNotNull(eifVar.f64973e)).getName();
        long j = eifVar.f64971c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        cm1 cm1Var = this.f16654e;
        if (cm1Var != null) {
            try {
                cm1Var.set(name, j, jCurrentTimeMillis);
            } catch (IOException unused) {
                xh9.m25148w("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        eif lastTouchTimestamp = ((sm1) v80.checkNotNull(this.f16653d.get(str))).setLastTouchTimestamp(eifVar, jCurrentTimeMillis, z);
        notifySpanTouched(eifVar, lastTouchTimestamp);
        return lastTouchTimestamp;
    }

    private static synchronized void unlockFolder(File file) {
        f16650p.remove(file.getAbsoluteFile());
    }

    @Override // p000.cl1
    public synchronized NavigableSet<nm1> addListener(String str, cl1.InterfaceC2375b interfaceC2375b) {
        try {
            v80.checkState(!this.f16660k);
            v80.checkNotNull(str);
            v80.checkNotNull(interfaceC2375b);
            ArrayList<cl1.InterfaceC2375b> arrayList = this.f16655f.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f16655f.put(str, arrayList);
            }
            arrayList.add(interfaceC2375b);
        } catch (Throwable th) {
            throw th;
        }
        return getCachedSpans(str);
    }

    @Override // p000.cl1
    public synchronized void applyContentMetadataMutations(String str, rw2 rw2Var) throws cl1.C2374a {
        v80.checkState(!this.f16660k);
        checkInitialization();
        this.f16653d.applyContentMetadataMutations(str, rw2Var);
        try {
            this.f16653d.store();
        } catch (IOException e) {
            throw new cl1.C2374a(e);
        }
    }

    public synchronized void checkInitialization() throws cl1.C2374a {
        cl1.C2374a c2374a = this.f16661l;
        if (c2374a != null) {
            throw c2374a;
        }
    }

    @Override // p000.cl1
    public synchronized void commitFile(File file, long j) throws cl1.C2374a {
        v80.checkState(!this.f16660k);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            eif eifVar = (eif) v80.checkNotNull(eif.createCacheEntry(file, j, this.f16653d));
            sm1 sm1Var = (sm1) v80.checkNotNull(this.f16653d.get(eifVar.f64969a));
            v80.checkState(sm1Var.isFullyLocked(eifVar.f64970b, eifVar.f64971c));
            long contentLength = pw2.getContentLength(sm1Var.getMetadata());
            if (contentLength != -1) {
                v80.checkState(eifVar.f64970b + eifVar.f64971c <= contentLength);
            }
            if (this.f16654e == null) {
                addSpan(eifVar);
                this.f16653d.store();
                notifyAll();
                return;
            }
            try {
                this.f16654e.set(file.getName(), eifVar.f64971c, eifVar.f64974f);
                addSpan(eifVar);
                try {
                    this.f16653d.store();
                    notifyAll();
                    return;
                } catch (IOException e) {
                    throw new cl1.C2374a(e);
                }
            } catch (IOException e2) {
                throw new cl1.C2374a(e2);
            }
        }
    }

    @Override // p000.cl1
    public synchronized long getCacheSpace() {
        v80.checkState(!this.f16660k);
        return this.f16659j;
    }

    @Override // p000.cl1
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

    @Override // p000.cl1
    public synchronized long getCachedLength(String str, long j, long j2) {
        sm1 sm1Var;
        v80.checkState(!this.f16660k);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        sm1Var = this.f16653d.get(str);
        return sm1Var != null ? sm1Var.getCachedBytesLength(j, j2) : -j2;
    }

    @Override // p000.cl1
    public synchronized NavigableSet<nm1> getCachedSpans(String str) {
        sm1 sm1Var;
        try {
            v80.checkState(!this.f16660k);
            sm1Var = this.f16653d.get(str);
        } catch (Throwable th) {
            throw th;
        }
        return (sm1Var == null || sm1Var.isEmpty()) ? new TreeSet() : new TreeSet((Collection) sm1Var.getSpans());
    }

    @Override // p000.cl1
    public synchronized pw2 getContentMetadata(String str) {
        v80.checkState(!this.f16660k);
        return this.f16653d.getContentMetadata(str);
    }

    @Override // p000.cl1
    public synchronized Set<String> getKeys() {
        v80.checkState(!this.f16660k);
        return new HashSet(this.f16653d.getKeys());
    }

    @Override // p000.cl1
    public synchronized long getUid() {
        return this.f16658i;
    }

    @Override // p000.cl1
    public synchronized boolean isCached(String str, long j, long j2) {
        boolean z;
        z = false;
        v80.checkState(!this.f16660k);
        sm1 sm1Var = this.f16653d.get(str);
        if (sm1Var != null) {
            if (sm1Var.getCachedBytesLength(j, j2) >= j2) {
                z = true;
            }
        }
        return z;
    }

    @Override // p000.cl1
    public synchronized void release() {
        if (this.f16660k) {
            return;
        }
        this.f16655f.clear();
        removeStaleSpans();
        try {
            try {
                this.f16653d.store();
                unlockFolder(this.f16651b);
            } catch (Throwable th) {
                unlockFolder(this.f16651b);
                this.f16660k = true;
                throw th;
            }
        } catch (IOException e) {
            xh9.m25145e("SimpleCache", "Storing index file failed", e);
            unlockFolder(this.f16651b);
        }
        this.f16660k = true;
    }

    @Override // p000.cl1
    public synchronized void releaseHoleSpan(nm1 nm1Var) {
        v80.checkState(!this.f16660k);
        sm1 sm1Var = (sm1) v80.checkNotNull(this.f16653d.get(nm1Var.f64969a));
        sm1Var.unlockRange(nm1Var.f64970b);
        this.f16653d.maybeRemove(sm1Var.f82211b);
        notifyAll();
    }

    @Override // p000.cl1
    public synchronized void removeListener(String str, cl1.InterfaceC2375b interfaceC2375b) {
        if (this.f16660k) {
            return;
        }
        ArrayList<cl1.InterfaceC2375b> arrayList = this.f16655f.get(str);
        if (arrayList != null) {
            arrayList.remove(interfaceC2375b);
            if (arrayList.isEmpty()) {
                this.f16655f.remove(str);
            }
        }
    }

    @Override // p000.cl1
    public synchronized void removeResource(String str) {
        v80.checkState(!this.f16660k);
        Iterator<nm1> it = getCachedSpans(str).iterator();
        while (it.hasNext()) {
            removeSpanInternal(it.next());
        }
    }

    @Override // p000.cl1
    public synchronized void removeSpan(nm1 nm1Var) {
        v80.checkState(!this.f16660k);
        removeSpanInternal(nm1Var);
    }

    @Override // p000.cl1
    public synchronized File startFile(String str, long j, long j2) throws cl1.C2374a {
        sm1 sm1Var;
        File file;
        try {
            v80.checkState(!this.f16660k);
            checkInitialization();
            sm1Var = this.f16653d.get(str);
            v80.checkNotNull(sm1Var);
            v80.checkState(sm1Var.isFullyLocked(j, j2));
            if (!this.f16651b.exists()) {
                createCacheDirectories(this.f16651b);
                removeStaleSpans();
            }
            this.f16652c.onStartFile(this, str, j, j2);
            file = new File(this.f16651b, Integer.toString(this.f16656g.nextInt(10)));
            if (!file.exists()) {
                createCacheDirectories(file);
            }
        } catch (Throwable th) {
            throw th;
        }
        return eif.getCacheFile(file, sm1Var.f82210a, j, System.currentTimeMillis());
    }

    @Override // p000.cl1
    public synchronized nm1 startReadWrite(String str, long j, long j2) throws cl1.C2374a, InterruptedException {
        nm1 nm1VarStartReadWriteNonBlocking;
        v80.checkState(!this.f16660k);
        checkInitialization();
        while (true) {
            nm1VarStartReadWriteNonBlocking = startReadWriteNonBlocking(str, j, j2);
            if (nm1VarStartReadWriteNonBlocking == null) {
                wait();
            }
        }
        return nm1VarStartReadWriteNonBlocking;
    }

    @Override // p000.cl1
    @hib
    public synchronized nm1 startReadWriteNonBlocking(String str, long j, long j2) throws cl1.C2374a {
        v80.checkState(!this.f16660k);
        checkInitialization();
        eif span = getSpan(str, j, j2);
        if (span.f64972d) {
            return touchSpan(str, span);
        }
        if (this.f16653d.getOrAdd(str).lockRange(j, span.f64971c)) {
            return span;
        }
        return null;
    }

    public cif(File file, yl1 yl1Var, ti3 ti3Var) {
        this(file, yl1Var, ti3Var, null, false, false);
    }

    public cif(File file, yl1 yl1Var, @hib ti3 ti3Var, @hib byte[] bArr, boolean z, boolean z2) {
        this(file, yl1Var, new um1(ti3Var, file, bArr, z, z2), (ti3Var == null || z2) ? null : new cm1(ti3Var));
    }

    public cif(File file, yl1 yl1Var, um1 um1Var, @hib cm1 cm1Var) {
        if (lockFolder(file)) {
            this.f16651b = file;
            this.f16652c = yl1Var;
            this.f16653d = um1Var;
            this.f16654e = cm1Var;
            this.f16655f = new HashMap<>();
            this.f16656g = new Random();
            this.f16657h = yl1Var.requiresCacheSpanTouches();
            this.f16658i = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C2325a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}

package p000;

import android.os.StrictMode;
import com.blankj.utilcode.util.C2473f;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class pe4 implements Closeable {

    /* JADX INFO: renamed from: M1 */
    public static final String f70504M1 = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: V1 */
    public static final String f70505V1 = "1";

    /* JADX INFO: renamed from: X */
    public static final String f70506X = "journal";

    /* JADX INFO: renamed from: Y */
    public static final String f70507Y = "journal.tmp";

    /* JADX INFO: renamed from: Z */
    public static final String f70508Z = "journal.bkp";

    /* JADX INFO: renamed from: Z1 */
    public static final long f70509Z1 = -1;

    /* JADX INFO: renamed from: a2 */
    public static final String f70510a2 = "CLEAN";

    /* JADX INFO: renamed from: b2 */
    public static final String f70511b2 = "DIRTY";

    /* JADX INFO: renamed from: c2 */
    public static final String f70512c2 = "REMOVE";

    /* JADX INFO: renamed from: d2 */
    public static final String f70513d2 = "READ";

    /* JADX INFO: renamed from: F */
    public Writer f70515F;

    /* JADX INFO: renamed from: L */
    public int f70517L;

    /* JADX INFO: renamed from: a */
    public final File f70521a;

    /* JADX INFO: renamed from: b */
    public final File f70522b;

    /* JADX INFO: renamed from: c */
    public final File f70523c;

    /* JADX INFO: renamed from: d */
    public final File f70524d;

    /* JADX INFO: renamed from: e */
    public final int f70525e;

    /* JADX INFO: renamed from: f */
    public long f70526f;

    /* JADX INFO: renamed from: m */
    public final int f70527m;

    /* JADX INFO: renamed from: C */
    public long f70514C = 0;

    /* JADX INFO: renamed from: H */
    public final LinkedHashMap<String, C10928d> f70516H = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: M */
    public long f70518M = 0;

    /* JADX INFO: renamed from: N */
    public final ThreadPoolExecutor f70519N = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC10926b(null));

    /* JADX INFO: renamed from: Q */
    public final Callable<Void> f70520Q = new CallableC10925a();

    /* JADX INFO: renamed from: pe4$a */
    public class CallableC10925a implements Callable<Void> {
        public CallableC10925a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (pe4.this) {
                try {
                    if (pe4.this.f70515F == null) {
                        return null;
                    }
                    pe4.this.trimToSize();
                    if (pe4.this.journalRebuildRequired()) {
                        pe4.this.rebuildJournal();
                        pe4.this.f70517L = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: pe4$b */
    public static final class ThreadFactoryC10926b implements ThreadFactory {
        private ThreadFactoryC10926b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ ThreadFactoryC10926b(CallableC10925a callableC10925a) {
            this();
        }
    }

    /* JADX INFO: renamed from: pe4$c */
    public final class C10927c {

        /* JADX INFO: renamed from: a */
        public final C10928d f70529a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f70530b;

        /* JADX INFO: renamed from: c */
        public boolean f70531c;

        public /* synthetic */ C10927c(pe4 pe4Var, C10928d c10928d, CallableC10925a callableC10925a) {
            this(c10928d);
        }

        private InputStream newInputStream(int i) throws IOException {
            synchronized (pe4.this) {
                if (this.f70529a.f70538f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f70529a.f70537e) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f70529a.getCleanFile(i));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public void abort() throws IOException {
            pe4.this.completeEdit(this, false);
        }

        public void abortUnlessCommitted() {
            if (this.f70531c) {
                return;
            }
            try {
                abort();
            } catch (IOException unused) {
            }
        }

        public void commit() throws IOException {
            pe4.this.completeEdit(this, true);
            this.f70531c = true;
        }

        public File getFile(int i) throws IOException {
            File dirtyFile;
            synchronized (pe4.this) {
                try {
                    if (this.f70529a.f70538f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f70529a.f70537e) {
                        this.f70530b[i] = true;
                    }
                    dirtyFile = this.f70529a.getDirtyFile(i);
                    pe4.this.f70521a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dirtyFile;
        }

        public String getString(int i) throws IOException {
            InputStream inputStreamNewInputStream = newInputStream(i);
            if (inputStreamNewInputStream != null) {
                return pe4.inputStreamToString(inputStreamNewInputStream);
            }
            return null;
        }

        public void set(int i, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter;
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(getFile(i)), u0i.f86532b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                outputStreamWriter.write(str);
                u0i.m22989a(outputStreamWriter);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                u0i.m22989a(outputStreamWriter2);
                throw th;
            }
        }

        private C10927c(C10928d c10928d) {
            this.f70529a = c10928d;
            this.f70530b = c10928d.f70537e ? null : new boolean[pe4.this.f70527m];
        }
    }

    /* JADX INFO: renamed from: pe4$d */
    public final class C10928d {

        /* JADX INFO: renamed from: a */
        public final String f70533a;

        /* JADX INFO: renamed from: b */
        public final long[] f70534b;

        /* JADX INFO: renamed from: c */
        public File[] f70535c;

        /* JADX INFO: renamed from: d */
        public File[] f70536d;

        /* JADX INFO: renamed from: e */
        public boolean f70537e;

        /* JADX INFO: renamed from: f */
        public C10927c f70538f;

        /* JADX INFO: renamed from: g */
        public long f70539g;

        public /* synthetic */ C10928d(pe4 pe4Var, String str, CallableC10925a callableC10925a) {
            this(str);
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLengths(String[] strArr) throws IOException {
            if (strArr.length != pe4.this.f70527m) {
                throw invalidLengths(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f70534b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw invalidLengths(strArr);
                }
            }
        }

        public File getCleanFile(int i) {
            return this.f70535c[i];
        }

        public File getDirtyFile(int i) {
            return this.f70536d[i];
        }

        public String getLengths() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f70534b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private C10928d(String str) {
            this.f70533a = str;
            this.f70534b = new long[pe4.this.f70527m];
            this.f70535c = new File[pe4.this.f70527m];
            this.f70536d = new File[pe4.this.f70527m];
            StringBuilder sb = new StringBuilder(str);
            sb.append(a18.f100c);
            int length = sb.length();
            for (int i = 0; i < pe4.this.f70527m; i++) {
                sb.append(i);
                this.f70535c[i] = new File(pe4.this.f70521a, sb.toString());
                sb.append(".tmp");
                this.f70536d[i] = new File(pe4.this.f70521a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* JADX INFO: renamed from: pe4$e */
    public final class C10929e {

        /* JADX INFO: renamed from: a */
        public final String f70541a;

        /* JADX INFO: renamed from: b */
        public final long f70542b;

        /* JADX INFO: renamed from: c */
        public final long[] f70543c;

        /* JADX INFO: renamed from: d */
        public final File[] f70544d;

        public /* synthetic */ C10929e(pe4 pe4Var, String str, long j, File[] fileArr, long[] jArr, CallableC10925a callableC10925a) {
            this(str, j, fileArr, jArr);
        }

        public C10927c edit() throws IOException {
            return pe4.this.edit(this.f70541a, this.f70542b);
        }

        public File getFile(int i) {
            return this.f70544d[i];
        }

        public long getLength(int i) {
            return this.f70543c[i];
        }

        public String getString(int i) throws IOException {
            return pe4.inputStreamToString(new FileInputStream(this.f70544d[i]));
        }

        private C10929e(String str, long j, File[] fileArr, long[] jArr) {
            this.f70541a = str;
            this.f70542b = j;
            this.f70544d = fileArr;
            this.f70543c = jArr;
        }
    }

    private pe4(File file, int i, int i2, long j) {
        this.f70521a = file;
        this.f70525e = i;
        this.f70522b = new File(file, f70506X);
        this.f70523c = new File(file, f70507Y);
        this.f70524d = new File(file, f70508Z);
        this.f70527m = i2;
        this.f70526f = j;
    }

    private void checkNotClosed() {
        if (this.f70515F == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @omg(26)
    private static void closeWriter(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void completeEdit(C10927c c10927c, boolean z) throws IOException {
        C10928d c10928d = c10927c.f70529a;
        if (c10928d.f70538f != c10927c) {
            throw new IllegalStateException();
        }
        if (z && !c10928d.f70537e) {
            for (int i = 0; i < this.f70527m; i++) {
                if (!c10927c.f70530b[i]) {
                    c10927c.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!c10928d.getDirtyFile(i).exists()) {
                    c10927c.abort();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f70527m; i2++) {
            File dirtyFile = c10928d.getDirtyFile(i2);
            if (!z) {
                deleteIfExists(dirtyFile);
            } else if (dirtyFile.exists()) {
                File cleanFile = c10928d.getCleanFile(i2);
                dirtyFile.renameTo(cleanFile);
                long j = c10928d.f70534b[i2];
                long length = cleanFile.length();
                c10928d.f70534b[i2] = length;
                this.f70514C = (this.f70514C - j) + length;
            }
        }
        this.f70517L++;
        c10928d.f70538f = null;
        if (c10928d.f70537e || z) {
            c10928d.f70537e = true;
            this.f70515F.append((CharSequence) f70510a2);
            this.f70515F.append(' ');
            this.f70515F.append((CharSequence) c10928d.f70533a);
            this.f70515F.append((CharSequence) c10928d.getLengths());
            this.f70515F.append('\n');
            if (z) {
                long j2 = this.f70518M;
                this.f70518M = 1 + j2;
                c10928d.f70539g = j2;
            }
        } else {
            this.f70516H.remove(c10928d.f70533a);
            this.f70515F.append((CharSequence) f70512c2);
            this.f70515F.append(' ');
            this.f70515F.append((CharSequence) c10928d.f70533a);
            this.f70515F.append('\n');
        }
        flushWriter(this.f70515F);
        if (this.f70514C > this.f70526f || journalRebuildRequired()) {
            this.f70519N.submit(this.f70520Q);
        }
    }

    private static void deleteIfExists(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @omg(26)
    private static void flushWriter(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String inputStreamToString(InputStream inputStream) throws IOException {
        return u0i.m22991c(new InputStreamReader(inputStream, u0i.f86532b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean journalRebuildRequired() {
        int i = this.f70517L;
        return i >= 2000 && i >= this.f70516H.size();
    }

    public static pe4 open(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, f70508Z);
        if (file2.exists()) {
            File file3 = new File(file, f70506X);
            if (file3.exists()) {
                file2.delete();
            } else {
                renameTo(file2, file3, false);
            }
        }
        pe4 pe4Var = new pe4(file, i, i2, j);
        if (pe4Var.f70522b.exists()) {
            try {
                pe4Var.readJournal();
                pe4Var.processJournal();
                return pe4Var;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                pe4Var.delete();
            }
        }
        file.mkdirs();
        pe4 pe4Var2 = new pe4(file, i, i2, j);
        pe4Var2.rebuildJournal();
        return pe4Var2;
    }

    private void processJournal() throws IOException {
        deleteIfExists(this.f70523c);
        Iterator<C10928d> it = this.f70516H.values().iterator();
        while (it.hasNext()) {
            C10928d next = it.next();
            int i = 0;
            if (next.f70538f == null) {
                while (i < this.f70527m) {
                    this.f70514C += next.f70534b[i];
                    i++;
                }
            } else {
                next.f70538f = null;
                while (i < this.f70527m) {
                    deleteIfExists(next.getCleanFile(i));
                    deleteIfExists(next.getDirtyFile(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private void readJournal() throws IOException {
        e7g e7gVar = new e7g(new FileInputStream(this.f70522b), u0i.f86531a);
        try {
            String line = e7gVar.readLine();
            String line2 = e7gVar.readLine();
            String line3 = e7gVar.readLine();
            String line4 = e7gVar.readLine();
            String line5 = e7gVar.readLine();
            if (!f70504M1.equals(line) || !"1".equals(line2) || !Integer.toString(this.f70525e).equals(line3) || !Integer.toString(this.f70527m).equals(line4) || !"".equals(line5)) {
                throw new IOException("unexpected journal header: [" + line + ", " + line2 + ", " + line4 + ", " + line5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(e7gVar.readLine());
                    i++;
                } catch (EOFException unused) {
                    this.f70517L = i - this.f70516H.size();
                    if (e7gVar.hasUnterminatedLine()) {
                        rebuildJournal();
                    } else {
                        this.f70515F = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f70522b, true), u0i.f86531a));
                    }
                    u0i.m22989a(e7gVar);
                    return;
                }
            }
        } catch (Throwable th) {
            u0i.m22989a(e7gVar);
            throw th;
        }
    }

    private void readJournalLine(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith(f70512c2)) {
                this.f70516H.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C10928d c10928d = this.f70516H.get(strSubstring);
        CallableC10925a callableC10925a = null;
        if (c10928d == null) {
            c10928d = new C10928d(this, strSubstring, callableC10925a);
            this.f70516H.put(strSubstring, c10928d);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(f70510a2)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(C2473f.f17566z);
            c10928d.f70537e = true;
            c10928d.f70538f = null;
            c10928d.setLengths(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(f70511b2)) {
            c10928d.f70538f = new C10927c(this, c10928d, callableC10925a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith(f70513d2)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void rebuildJournal() throws IOException {
        try {
            Writer writer = this.f70515F;
            if (writer != null) {
                closeWriter(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f70523c), u0i.f86531a));
            try {
                bufferedWriter.write(f70504M1);
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f70525e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f70527m));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (C10928d c10928d : this.f70516H.values()) {
                    if (c10928d.f70538f != null) {
                        bufferedWriter.write("DIRTY " + c10928d.f70533a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + c10928d.f70533a + c10928d.getLengths() + '\n');
                    }
                }
                closeWriter(bufferedWriter);
                if (this.f70522b.exists()) {
                    renameTo(this.f70522b, this.f70524d, true);
                }
                renameTo(this.f70523c, this.f70522b, false);
                this.f70524d.delete();
                this.f70515F = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f70522b, true), u0i.f86531a));
            } catch (Throwable th) {
                closeWriter(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void renameTo(File file, File file2, boolean z) throws IOException {
        if (z) {
            deleteIfExists(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trimToSize() throws IOException {
        while (this.f70514C > this.f70526f) {
            remove(this.f70516H.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f70515F == null) {
                return;
            }
            for (C10928d c10928d : new ArrayList(this.f70516H.values())) {
                if (c10928d.f70538f != null) {
                    c10928d.f70538f.abort();
                }
            }
            trimToSize();
            closeWriter(this.f70515F);
            this.f70515F = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void delete() throws IOException {
        close();
        u0i.m22990b(this.f70521a);
    }

    public C10927c edit(String str) throws IOException {
        return edit(str, -1L);
    }

    public synchronized void flush() throws IOException {
        checkNotClosed();
        trimToSize();
        flushWriter(this.f70515F);
    }

    public synchronized C10929e get(String str) throws IOException {
        checkNotClosed();
        C10928d c10928d = this.f70516H.get(str);
        if (c10928d == null) {
            return null;
        }
        if (!c10928d.f70537e) {
            return null;
        }
        for (File file : c10928d.f70535c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f70517L++;
        this.f70515F.append((CharSequence) f70513d2);
        this.f70515F.append(' ');
        this.f70515F.append((CharSequence) str);
        this.f70515F.append('\n');
        if (journalRebuildRequired()) {
            this.f70519N.submit(this.f70520Q);
        }
        return new C10929e(this, str, c10928d.f70539g, c10928d.f70535c, c10928d.f70534b, null);
    }

    public File getDirectory() {
        return this.f70521a;
    }

    public synchronized long getMaxSize() {
        return this.f70526f;
    }

    public synchronized boolean isClosed() {
        return this.f70515F == null;
    }

    public synchronized boolean remove(String str) throws IOException {
        try {
            checkNotClosed();
            C10928d c10928d = this.f70516H.get(str);
            if (c10928d != null && c10928d.f70538f == null) {
                for (int i = 0; i < this.f70527m; i++) {
                    File cleanFile = c10928d.getCleanFile(i);
                    if (cleanFile.exists() && !cleanFile.delete()) {
                        throw new IOException("failed to delete " + cleanFile);
                    }
                    this.f70514C -= c10928d.f70534b[i];
                    c10928d.f70534b[i] = 0;
                }
                this.f70517L++;
                this.f70515F.append((CharSequence) f70512c2);
                this.f70515F.append(' ');
                this.f70515F.append((CharSequence) str);
                this.f70515F.append('\n');
                this.f70516H.remove(str);
                if (journalRebuildRequired()) {
                    this.f70519N.submit(this.f70520Q);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public synchronized void setMaxSize(long j) {
        this.f70526f = j;
        this.f70519N.submit(this.f70520Q);
    }

    public synchronized long size() {
        return this.f70514C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized C10927c edit(String str, long j) throws IOException {
        checkNotClosed();
        C10928d c10928d = this.f70516H.get(str);
        CallableC10925a callableC10925a = null;
        if (j != -1 && (c10928d == null || c10928d.f70539g != j)) {
            return null;
        }
        if (c10928d == null) {
            c10928d = new C10928d(this, str, callableC10925a);
            this.f70516H.put(str, c10928d);
        } else if (c10928d.f70538f != null) {
            return null;
        }
        C10927c c10927c = new C10927c(this, c10928d, callableC10925a);
        c10928d.f70538f = c10927c;
        this.f70515F.append((CharSequence) f70511b2);
        this.f70515F.append(' ');
        this.f70515F.append((CharSequence) str);
        this.f70515F.append('\n');
        flushWriter(this.f70515F);
        return c10927c;
    }
}

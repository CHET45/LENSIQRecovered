package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.blankj.utilcode.util.C2473f;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p000.cn4;
import p000.dm4;

/* JADX INFO: loaded from: classes6.dex */
public class al4 {

    /* JADX INFO: renamed from: f */
    public static final String f1958f = "DownloadContext";

    /* JADX INFO: renamed from: g */
    public static final Executor f1959g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30, TimeUnit.SECONDS, new SynchronousQueue(), q0i.threadFactory("OkDownload Serial", false));

    /* JADX INFO: renamed from: a */
    public final cn4[] f1960a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f1961b;

    /* JADX INFO: renamed from: c */
    @hib
    public final bl4 f1962c;

    /* JADX INFO: renamed from: d */
    public final C0313f f1963d;

    /* JADX INFO: renamed from: e */
    public Handler f1964e;

    /* JADX INFO: renamed from: al4$a */
    public class RunnableC0308a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f1965a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ cm4 f1966b;

        public RunnableC0308a(List list, cm4 cm4Var) {
            this.f1965a = list;
            this.f1966b = cm4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (cn4 cn4Var : this.f1965a) {
                if (!al4.this.isStarted()) {
                    al4.this.callbackQueueEndOnSerialLoop(cn4Var.isAutoCallbackToUIThread());
                    return;
                }
                cn4Var.execute(this.f1966b);
            }
        }
    }

    /* JADX INFO: renamed from: al4$b */
    public class RunnableC0309b implements Runnable {
        public RunnableC0309b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            al4 al4Var = al4.this;
            al4Var.f1962c.queueEnd(al4Var);
        }
    }

    /* JADX INFO: renamed from: al4$c */
    public static class C0310c {

        /* JADX INFO: renamed from: a */
        public final al4 f1969a;

        public C0310c(al4 al4Var) {
            this.f1969a = al4Var;
        }

        public C0310c replaceTask(cn4 cn4Var, cn4 cn4Var2) {
            cn4[] cn4VarArr = this.f1969a.f1960a;
            for (int i = 0; i < cn4VarArr.length; i++) {
                if (cn4VarArr[i] == cn4Var) {
                    cn4VarArr[i] = cn4Var2;
                }
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: al4$d */
    public static class C0311d {

        /* JADX INFO: renamed from: a */
        public final ArrayList<cn4> f1970a;

        /* JADX INFO: renamed from: b */
        public final C0313f f1971b;

        /* JADX INFO: renamed from: c */
        public bl4 f1972c;

        public C0311d() {
            this(new C0313f());
        }

        public cn4 bind(@efb String str) {
            if (this.f1971b.f1977b != null) {
                return bind(new cn4.C2401a(str, this.f1971b.f1977b).setFilenameFromResponse(Boolean.TRUE));
            }
            throw new IllegalArgumentException("If you want to bind only with url, you have to provide parentPath on QueueSet!");
        }

        public C0311d bindSetTask(@efb cn4 cn4Var) {
            int iIndexOf = this.f1970a.indexOf(cn4Var);
            if (iIndexOf >= 0) {
                this.f1970a.set(iIndexOf, cn4Var);
            } else {
                this.f1970a.add(cn4Var);
            }
            return this;
        }

        public al4 build() {
            return new al4((cn4[]) this.f1970a.toArray(new cn4[this.f1970a.size()]), this.f1972c, this.f1971b);
        }

        public C0311d setListener(bl4 bl4Var) {
            this.f1972c = bl4Var;
            return this;
        }

        public void unbind(@efb cn4 cn4Var) {
            this.f1970a.remove(cn4Var);
        }

        public C0311d(C0313f c0313f) {
            this(c0313f, new ArrayList());
        }

        public void unbind(int i) {
            for (cn4 cn4Var : (List) this.f1970a.clone()) {
                if (cn4Var.getId() == i) {
                    this.f1970a.remove(cn4Var);
                }
            }
        }

        public C0311d(C0313f c0313f, ArrayList<cn4> arrayList) {
            this.f1971b = c0313f;
            this.f1970a = arrayList;
        }

        public cn4 bind(@efb cn4.C2401a c2401a) {
            if (this.f1971b.f1976a != null) {
                c2401a.setHeaderMapFields(this.f1971b.f1976a);
            }
            if (this.f1971b.f1978c != null) {
                c2401a.setReadBufferSize(this.f1971b.f1978c.intValue());
            }
            if (this.f1971b.f1979d != null) {
                c2401a.setFlushBufferSize(this.f1971b.f1979d.intValue());
            }
            if (this.f1971b.f1980e != null) {
                c2401a.setSyncBufferSize(this.f1971b.f1980e.intValue());
            }
            if (this.f1971b.f1985j != null) {
                c2401a.setWifiRequired(this.f1971b.f1985j.booleanValue());
            }
            if (this.f1971b.f1981f != null) {
                c2401a.setSyncBufferIntervalMillis(this.f1971b.f1981f.intValue());
            }
            if (this.f1971b.f1982g != null) {
                c2401a.setAutoCallbackToUIThread(this.f1971b.f1982g.booleanValue());
            }
            if (this.f1971b.f1983h != null) {
                c2401a.setMinIntervalMillisCallbackProcess(this.f1971b.f1983h.intValue());
            }
            if (this.f1971b.f1984i != null) {
                c2401a.setPassIfAlreadyCompleted(this.f1971b.f1984i.booleanValue());
            }
            cn4 cn4VarBuild = c2401a.build();
            if (this.f1971b.f1986k != null) {
                cn4VarBuild.setTag(this.f1971b.f1986k);
            }
            this.f1970a.add(cn4VarBuild);
            return cn4VarBuild;
        }
    }

    /* JADX INFO: renamed from: al4$e */
    public static class C0312e extends yl4 {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f1973a;

        /* JADX INFO: renamed from: b */
        @efb
        public final bl4 f1974b;

        /* JADX INFO: renamed from: c */
        @efb
        public final al4 f1975c;

        public C0312e(@efb al4 al4Var, @efb bl4 bl4Var, int i) {
            this.f1973a = new AtomicInteger(i);
            this.f1974b = bl4Var;
            this.f1975c = al4Var;
        }

        @Override // p000.cm4
        public void taskEnd(@efb cn4 cn4Var, @efb x15 x15Var, @hib Exception exc) {
            int iDecrementAndGet = this.f1973a.decrementAndGet();
            this.f1974b.taskEnd(this.f1975c, cn4Var, x15Var, exc, iDecrementAndGet);
            if (iDecrementAndGet <= 0) {
                this.f1974b.queueEnd(this.f1975c);
                q0i.m19913d(al4.f1958f, "taskEnd and remainCount " + iDecrementAndGet);
            }
        }

        @Override // p000.cm4
        public void taskStart(@efb cn4 cn4Var) {
        }
    }

    /* JADX INFO: renamed from: al4$f */
    public static class C0313f {

        /* JADX INFO: renamed from: a */
        public Map<String, List<String>> f1976a;

        /* JADX INFO: renamed from: b */
        public Uri f1977b;

        /* JADX INFO: renamed from: c */
        public Integer f1978c;

        /* JADX INFO: renamed from: d */
        public Integer f1979d;

        /* JADX INFO: renamed from: e */
        public Integer f1980e;

        /* JADX INFO: renamed from: f */
        public Integer f1981f;

        /* JADX INFO: renamed from: g */
        public Boolean f1982g;

        /* JADX INFO: renamed from: h */
        public Integer f1983h;

        /* JADX INFO: renamed from: i */
        public Boolean f1984i;

        /* JADX INFO: renamed from: j */
        public Boolean f1985j;

        /* JADX INFO: renamed from: k */
        public Object f1986k;

        public C0311d commit() {
            return new C0311d(this);
        }

        public Uri getDirUri() {
            return this.f1977b;
        }

        public int getFlushBufferSize() {
            Integer num = this.f1979d;
            if (num == null) {
                return 16384;
            }
            return num.intValue();
        }

        public Map<String, List<String>> getHeaderMapFields() {
            return this.f1976a;
        }

        public int getMinIntervalMillisCallbackProcess() {
            Integer num = this.f1983h;
            if (num == null) {
                return 3000;
            }
            return num.intValue();
        }

        public int getReadBufferSize() {
            Integer num = this.f1978c;
            if (num == null) {
                return 4096;
            }
            return num.intValue();
        }

        public int getSyncBufferIntervalMillis() {
            Integer num = this.f1981f;
            if (num == null) {
                return 2000;
            }
            return num.intValue();
        }

        public int getSyncBufferSize() {
            Integer num = this.f1980e;
            if (num == null) {
                return 65536;
            }
            return num.intValue();
        }

        public Object getTag() {
            return this.f1986k;
        }

        public boolean isAutoCallbackToUIThread() {
            Boolean bool = this.f1982g;
            if (bool == null) {
                return true;
            }
            return bool.booleanValue();
        }

        public boolean isPassIfAlreadyCompleted() {
            Boolean bool = this.f1984i;
            if (bool == null) {
                return true;
            }
            return bool.booleanValue();
        }

        public boolean isWifiRequired() {
            Boolean bool = this.f1985j;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }

        public C0313f setAutoCallbackToUIThread(Boolean bool) {
            this.f1982g = bool;
            return this;
        }

        public C0313f setFlushBufferSize(int i) {
            this.f1979d = Integer.valueOf(i);
            return this;
        }

        public void setHeaderMapFields(Map<String, List<String>> map) {
            this.f1976a = map;
        }

        public C0313f setMinIntervalMillisCallbackProcess(Integer num) {
            this.f1983h = num;
            return this;
        }

        public C0313f setParentPath(@efb String str) {
            return setParentPathFile(new File(str));
        }

        public C0313f setParentPathFile(@efb File file) {
            if (file.isFile()) {
                throw new IllegalArgumentException("parent path only accept directory path");
            }
            this.f1977b = Uri.fromFile(file);
            return this;
        }

        public C0313f setParentPathUri(@efb Uri uri) {
            this.f1977b = uri;
            return this;
        }

        public C0313f setPassIfAlreadyCompleted(boolean z) {
            this.f1984i = Boolean.valueOf(z);
            return this;
        }

        public C0313f setReadBufferSize(int i) {
            this.f1978c = Integer.valueOf(i);
            return this;
        }

        public C0313f setSyncBufferIntervalMillis(int i) {
            this.f1981f = Integer.valueOf(i);
            return this;
        }

        public C0313f setSyncBufferSize(int i) {
            this.f1980e = Integer.valueOf(i);
            return this;
        }

        public C0313f setTag(Object obj) {
            this.f1986k = obj;
            return this;
        }

        public C0313f setWifiRequired(Boolean bool) {
            this.f1985j = bool;
            return this;
        }
    }

    public al4(@efb cn4[] cn4VarArr, @hib bl4 bl4Var, @efb C0313f c0313f, @efb Handler handler) {
        this(cn4VarArr, bl4Var, c0313f);
        this.f1964e = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackQueueEndOnSerialLoop(boolean z) {
        bl4 bl4Var = this.f1962c;
        if (bl4Var == null) {
            return;
        }
        if (!z) {
            bl4Var.queueEnd(this);
            return;
        }
        if (this.f1964e == null) {
            this.f1964e = new Handler(Looper.getMainLooper());
        }
        this.f1964e.post(new RunnableC0309b());
    }

    public C0310c alter() {
        return new C0310c(this);
    }

    /* JADX INFO: renamed from: c */
    public void m871c(Runnable runnable) {
        f1959g.execute(runnable);
    }

    @SuppressFBWarnings(justification = "user must know change this array will effect internal job", value = {"EI"})
    public cn4[] getTasks() {
        return this.f1960a;
    }

    public boolean isStarted() {
        return this.f1961b;
    }

    public void start(@hib cm4 cm4Var, boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        q0i.m19913d(f1958f, "start " + z);
        this.f1961b = true;
        if (this.f1962c != null) {
            cm4Var = new dm4.C4858a().append(cm4Var).append(new C0312e(this, this.f1962c, this.f1960a.length)).build();
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, this.f1960a);
            Collections.sort(arrayList);
            m871c(new RunnableC0308a(arrayList, cm4Var));
        } else {
            cn4.enqueue(this.f1960a, cm4Var);
        }
        q0i.m19913d(f1958f, "start finish " + z + C2473f.f17566z + (SystemClock.uptimeMillis() - jUptimeMillis) + "ms");
    }

    public void startOnParallel(cm4 cm4Var) {
        start(cm4Var, false);
    }

    public void startOnSerial(cm4 cm4Var) {
        start(cm4Var, true);
    }

    public void stop() {
        if (this.f1961b) {
            e0c.with().downloadDispatcher().cancel(this.f1960a);
        }
        this.f1961b = false;
    }

    public C0311d toBuilder() {
        return new C0311d(this.f1963d, new ArrayList(Arrays.asList(this.f1960a))).setListener(this.f1962c);
    }

    public al4(@efb cn4[] cn4VarArr, @hib bl4 bl4Var, @efb C0313f c0313f) {
        this.f1961b = false;
        this.f1960a = cn4VarArr;
        this.f1962c = bl4Var;
        this.f1963d = c0313f;
    }
}

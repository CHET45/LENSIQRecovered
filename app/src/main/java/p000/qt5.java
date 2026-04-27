package p000;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public class qt5 {

    /* JADX INFO: renamed from: g */
    public static final String f75660g = "FileUploadManager";

    /* JADX INFO: renamed from: h */
    public static final int f75661h = 10;

    /* JADX INFO: renamed from: i */
    public static volatile qt5 f75662i;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<String, C11689h> f75663a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC11687f> f75664b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ExecutorService f75665c = new ThreadPoolExecutor(10, 10, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC11682a(), new C11683b());

    /* JADX INFO: renamed from: d */
    public final OkHttpClient f75666d;

    /* JADX INFO: renamed from: e */
    public final fd1 f75667e;

    /* JADX INFO: renamed from: f */
    public final Context f75668f;

    /* JADX INFO: renamed from: qt5$a */
    public class ThreadFactoryC11682a implements ThreadFactory {
        public ThreadFactoryC11682a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("upload-thread-" + new AtomicInteger().incrementAndGet());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: renamed from: qt5$b */
    public class C11683b extends ThreadPoolExecutor.DiscardPolicy {
        public C11683b() {
        }

        @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Log.e(qt5.f75660g, "任务被拒绝，线程池已满");
        }
    }

    /* JADX INFO: renamed from: qt5$c */
    public class RunnableC11684c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11689h f75671a;

        /* JADX INFO: renamed from: qt5$c$a */
        public class a implements Callback {
            public a() {
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                RunnableC11684c runnableC11684c = RunnableC11684c.this;
                C11689h c11689h = runnableC11684c.f75671a;
                EnumC11686e enumC11686e = c11689h.f75691c;
                if (enumC11686e == EnumC11686e.CANCELLED || enumC11686e == EnumC11686e.PAUSED) {
                    return;
                }
                c11689h.f75691c = EnumC11686e.FAILED;
                for (InterfaceC11687f interfaceC11687f : qt5.this.f75664b) {
                    if (interfaceC11687f != null) {
                        interfaceC11687f.onError(RunnableC11684c.this.f75671a.f75689a, iOException.getMessage() != null ? iOException.getMessage() : "Unknown error");
                    }
                }
                Log.e(qt5.f75660g, "Upload failed: " + iOException.getMessage(), iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful() && response.code() == 200) {
                    String strString = response.body() != null ? response.body().string() : "";
                    RunnableC11684c runnableC11684c = RunnableC11684c.this;
                    runnableC11684c.f75671a.f75691c = EnumC11686e.COMPLETED;
                    for (InterfaceC11687f interfaceC11687f : qt5.this.f75664b) {
                        if (interfaceC11687f != null) {
                            interfaceC11687f.onSuccess(RunnableC11684c.this.f75671a.f75689a, strString);
                        }
                    }
                    RunnableC11684c runnableC11684c2 = RunnableC11684c.this;
                    if (runnableC11684c2.f75671a.f75690b.f75688e) {
                        qt5.this.f75667e.clear(RunnableC11684c.this.f75671a.f75690b.f75684a.getAbsolutePath());
                    }
                } else {
                    RunnableC11684c runnableC11684c3 = RunnableC11684c.this;
                    runnableC11684c3.f75671a.f75691c = EnumC11686e.FAILED;
                    for (InterfaceC11687f interfaceC11687f2 : qt5.this.f75664b) {
                        if (interfaceC11687f2 != null) {
                            interfaceC11687f2.onError(RunnableC11684c.this.f75671a.f75689a, "Server error: " + response.code());
                        }
                    }
                }
                response.close();
            }
        }

        public RunnableC11684c(C11689h c11689h) {
            this.f75671a = c11689h;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Call callNewCall = qt5.this.f75666d.newCall(qt5.this.createUploadRequest(this.f75671a));
                this.f75671a.f75695g = callNewCall;
                callNewCall.enqueue(new a());
            } catch (Exception e) {
                this.f75671a.f75691c = EnumC11686e.FAILED;
                for (InterfaceC11687f interfaceC11687f : qt5.this.f75664b) {
                    if (interfaceC11687f != null) {
                        interfaceC11687f.onError(this.f75671a.f75689a, e.getMessage() != null ? e.getMessage() : "Unknown error");
                    }
                }
                Log.e(qt5.f75660g, "Error preparing upload: " + e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: renamed from: qt5$d */
    public class C11685d extends ned {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C11689h f75674f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ File f75675g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11685d(File file, String str, long j, boolean z, C11689h c11689h, File file2) {
            super(file, str, j, z);
            this.f75674f = c11689h;
            this.f75675g = file2;
        }

        @Override // p000.ned
        public void onProgress(long j, long j2) {
            C11689h c11689h = this.f75674f;
            if (c11689h.f75691c != EnumC11686e.UPLOADING) {
                return;
            }
            int i = (int) ((100 * j) / j2);
            long j3 = c11689h.f75693e + j;
            c11689h.f75692d = i;
            c11689h.f75693e = j3;
            for (InterfaceC11687f interfaceC11687f : qt5.this.f75664b) {
                if (interfaceC11687f != null) {
                    interfaceC11687f.onProgress(this.f75674f.f75689a, i);
                }
            }
            if (this.f75674f.f75690b.f75688e) {
                qt5.this.f75667e.saveUploadedSize(this.f75675g.getAbsolutePath(), j3);
            }
        }
    }

    /* JADX INFO: renamed from: qt5$e */
    public enum EnumC11686e {
        PENDING,
        UPLOADING,
        PAUSED,
        COMPLETED,
        FAILED,
        CANCELLED
    }

    /* JADX INFO: renamed from: qt5$f */
    public interface InterfaceC11687f {
        void onCancelled(String str);

        void onError(String str, String str2);

        void onPaused(String str);

        void onProgress(String str, int i);

        void onResumed(String str);

        void onSuccess(String str, String str2);
    }

    /* JADX INFO: renamed from: qt5$g */
    public static class C11688g {

        /* JADX INFO: renamed from: a */
        public final File f75684a;

        /* JADX INFO: renamed from: b */
        public final String f75685b;

        /* JADX INFO: renamed from: c */
        public final Map<String, String> f75686c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC11687f f75687d;

        /* JADX INFO: renamed from: e */
        public final boolean f75688e;

        public C11688g(File file, String str, Map<String, String> map, InterfaceC11687f interfaceC11687f, boolean z) {
            this.f75684a = file;
            this.f75685b = str;
            this.f75686c = map;
            this.f75687d = interfaceC11687f;
            this.f75688e = z;
        }
    }

    /* JADX INFO: renamed from: qt5$h */
    public static class C11689h {

        /* JADX INFO: renamed from: a */
        public final String f75689a;

        /* JADX INFO: renamed from: b */
        public final C11688g f75690b;

        /* JADX INFO: renamed from: c */
        public EnumC11686e f75691c = EnumC11686e.PENDING;

        /* JADX INFO: renamed from: d */
        public int f75692d = 0;

        /* JADX INFO: renamed from: e */
        public long f75693e = 0;

        /* JADX INFO: renamed from: f */
        public long f75694f = 0;

        /* JADX INFO: renamed from: g */
        public Call f75695g = null;

        public C11689h(String str, C11688g c11688g) {
            this.f75689a = str;
            this.f75690b = c11688g;
        }
    }

    private qt5(Context context) {
        this.f75668f = context;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f75666d = builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(60L, timeUnit).addInterceptor(new abb(context, true, true)).addInterceptor(new s8e(3)).hostnameVerifier(new HostnameVerifier() { // from class: pt5
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return qt5.lambda$new$0(str, sSLSession);
            }
        }).build();
        this.f75667e = new fd1(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Request createUploadRequest(C11689h c11689h) {
        File file = c11689h.f75690b.f75684a;
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        Map<String, String> map = c11689h.f75690b.f75686c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                type.addFormDataPart(entry.getKey(), entry.getValue());
            }
        }
        type.addFormDataPart("audioFile", file.getName(), new C11685d(file, "application/octet-stream", c11689h.f75693e, c11689h.f75690b.f75688e, c11689h, file));
        Request.Builder builderPost = new Request.Builder().url(c11689h.f75690b.f75685b).header("Connection", "keep-alive").post(type.build());
        if (c11689h.f75690b.f75688e && c11689h.f75693e > 0) {
            builderPost.addHeader("Range", "bytes=" + c11689h.f75693e + "-");
        }
        return builderPost.build();
    }

    private void executeTask(C11689h c11689h) {
        EnumC11686e enumC11686e = c11689h.f75691c;
        if (enumC11686e == EnumC11686e.PENDING || enumC11686e == EnumC11686e.PAUSED) {
            EnumC11686e enumC11686e2 = EnumC11686e.UPLOADING;
            c11689h.f75691c = enumC11686e2;
            if (enumC11686e2 == EnumC11686e.PAUSED) {
                for (InterfaceC11687f interfaceC11687f : this.f75664b) {
                    if (interfaceC11687f != null) {
                        interfaceC11687f.onResumed(c11689h.f75689a);
                    }
                }
            }
            this.f75665c.execute(new RunnableC11684c(c11689h));
        }
    }

    public static qt5 getInstance(Context context) {
        if (f75662i == null) {
            synchronized (qt5.class) {
                try {
                    if (f75662i == null) {
                        f75662i = new qt5(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f75662i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(String str, SSLSession sSLSession) {
        return true;
    }

    public void addListener(InterfaceC11687f interfaceC11687f) {
        if (this.f75664b.contains(interfaceC11687f)) {
            return;
        }
        this.f75664b.add(interfaceC11687f);
    }

    public String addUploadTask(C11688g c11688g) {
        String string = UUID.randomUUID().toString();
        long length = c11688g.f75684a.length();
        long uploadedSize = c11688g.f75688e ? this.f75667e.getUploadedSize(c11688g.f75684a.getAbsolutePath()) : 0L;
        C11689h c11689h = new C11689h(string, c11688g);
        c11689h.f75694f = length;
        c11689h.f75693e = uploadedSize;
        c11689h.f75692d = length > 0 ? (int) ((100 * uploadedSize) / length) : 0;
        this.f75663a.put(string, c11689h);
        if (uploadedSize < length || length <= 0) {
            executeTask(c11689h);
            return string;
        }
        for (InterfaceC11687f interfaceC11687f : this.f75664b) {
            if (interfaceC11687f != null) {
                interfaceC11687f.onSuccess(string, "Already uploaded");
            }
        }
        c11689h.f75691c = EnumC11686e.COMPLETED;
        return string;
    }

    public void cancelAllTasks() {
        Iterator<String> it = this.f75663a.keySet().iterator();
        while (it.hasNext()) {
            cancelTask(it.next());
        }
        this.f75663a.clear();
    }

    public boolean cancelTask(String str) {
        EnumC11686e enumC11686e;
        EnumC11686e enumC11686e2;
        C11689h c11689h = this.f75663a.get(str);
        if (c11689h == null || (enumC11686e = c11689h.f75691c) == EnumC11686e.COMPLETED || enumC11686e == (enumC11686e2 = EnumC11686e.CANCELLED)) {
            return false;
        }
        Call call = c11689h.f75695g;
        if (call != null) {
            call.cancel();
        }
        c11689h.f75691c = enumC11686e2;
        for (InterfaceC11687f interfaceC11687f : this.f75664b) {
            if (interfaceC11687f != null) {
                interfaceC11687f.onCancelled(str);
            }
        }
        C11688g c11688g = c11689h.f75690b;
        if (c11688g.f75688e) {
            this.f75667e.clear(c11688g.f75684a.getAbsolutePath());
        }
        this.f75663a.remove(str);
        return true;
    }

    public int getTaskProgress(String str) {
        C11689h c11689h = this.f75663a.get(str);
        if (c11689h != null) {
            return c11689h.f75692d;
        }
        return 0;
    }

    public EnumC11686e getTaskStatus(String str) {
        C11689h c11689h = this.f75663a.get(str);
        return c11689h != null ? c11689h.f75691c : EnumC11686e.PENDING;
    }

    public boolean pauseTask(String str) {
        C11689h c11689h = this.f75663a.get(str);
        if (c11689h == null || c11689h.f75691c != EnumC11686e.UPLOADING) {
            return false;
        }
        Call call = c11689h.f75695g;
        if (call != null) {
            call.cancel();
        }
        c11689h.f75691c = EnumC11686e.PAUSED;
        for (InterfaceC11687f interfaceC11687f : this.f75664b) {
            if (interfaceC11687f != null) {
                interfaceC11687f.onPaused(str);
            }
        }
        return true;
    }

    public void removeListener(InterfaceC11687f interfaceC11687f) {
        this.f75664b.remove(interfaceC11687f);
    }

    public boolean resumeTask(String str) {
        C11689h c11689h = this.f75663a.get(str);
        if (c11689h == null || c11689h.f75691c != EnumC11686e.PAUSED) {
            return false;
        }
        executeTask(c11689h);
        return true;
    }
}

package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public class j1c {

    /* JADX INFO: renamed from: d */
    public static volatile j1c f49339d;

    /* JADX INFO: renamed from: a */
    public OkHttpClient f49340a;

    /* JADX INFO: renamed from: b */
    public Handler f49341b;

    /* JADX INFO: renamed from: c */
    public Call f49342c;

    /* JADX INFO: renamed from: j1c$a */
    public class C7715a implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f49343a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f49344b;

        /* JADX INFO: renamed from: j1c$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C7715a c7715a = C7715a.this;
                j1c.this.showFailTip(c7715a.f49343a);
            }
        }

        /* JADX INFO: renamed from: j1c$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C7715a c7715a = C7715a.this;
                j1c.this.showFailTip(c7715a.f49343a);
            }
        }

        /* JADX INFO: renamed from: j1c$a$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C7715a c7715a = C7715a.this;
                j1c.this.showFailTip(c7715a.f49343a);
                File file = new File(C7715a.this.f49344b);
                if (file.exists()) {
                    file.delete();
                }
            }
        }

        public C7715a(Context context, String str) {
            this.f49343a = context;
            this.f49344b = str;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            j1c.this.f49341b.post(new a());
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            InputStream inputStreamByteStream = response.body().byteStream();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f49344b));
                byte[] bArr = new byte[2048];
                while (true) {
                    int i = inputStreamByteStream.read(bArr);
                    if (i == -1 || call.isCanceled()) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, i);
                    }
                }
                fileOutputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
                j1c.this.f49341b.post(new c());
            }
        }
    }

    /* JADX INFO: renamed from: j1c$b */
    public class C7716b implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x7e f49349a;

        /* JADX INFO: renamed from: j1c$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ x7e f49351a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f49352b;

            public a(x7e x7eVar, String str) {
                this.f49351a = x7eVar;
                this.f49352b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                x7e x7eVar = this.f49351a;
                if (x7eVar != null) {
                    try {
                        x7eVar.onResponse(this.f49352b);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: j1c$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ x7e f49354a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Request f49355b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Exception f49356c;

            public b(x7e x7eVar, Request request, Exception exc) {
                this.f49354a = x7eVar;
                this.f49355b = request;
                this.f49356c = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                x7e x7eVar = this.f49354a;
                if (x7eVar != null) {
                    x7eVar.onError(this.f49355b, this.f49356c);
                }
            }
        }

        public C7716b(x7e x7eVar) {
            this.f49349a = x7eVar;
        }

        private void sendFailedCallback(Request request, Exception exc, x7e x7eVar) {
            j1c.this.f49341b.post(new b(x7eVar, request, exc));
        }

        private void sendSuccessCallback(String str, x7e x7eVar) {
            j1c.this.f49341b.post(new a(x7eVar, str));
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            sendFailedCallback(call.request(), iOException, this.f49349a);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            sendSuccessCallback(response.body().string(), this.f49349a);
        }
    }

    private j1c(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f49340a = builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).addInterceptor(new led()).build();
        this.f49341b = new Handler(Looper.getMainLooper());
    }

    private void dealResult(Call call, x7e x7eVar) {
        call.enqueue(new C7716b(x7eVar));
    }

    public static j1c getInstance(Context context) {
        if (f49339d == null) {
            synchronized (j1c.class) {
                try {
                    if (f49339d == null) {
                        f49339d = new j1c(context);
                    }
                } finally {
                }
            }
        }
        return f49339d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFailTip(Context context) {
    }

    public void cancelRequest() {
        Call call = this.f49342c;
        if (call == null || call.isCanceled()) {
            return;
        }
        this.f49342c.cancel();
    }

    public void downFile(String str, String str2, Context context, String str3, String str4) {
        Call callNewCall = this.f49340a.newCall(new Request.Builder().url(str).build());
        this.f49342c = callNewCall;
        callNewCall.enqueue(new C7715a(context, str2));
    }

    public void getAsynHttp(String str, x7e x7eVar) {
        dealResult(this.f49340a.newCall(new Request.Builder().url(str).build()), x7eVar);
    }
}

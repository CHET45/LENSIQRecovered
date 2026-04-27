package p000;

import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.BuildConfig;
import com.google.firebase.firestore.C3603f;
import p000.fta;
import p000.w22;

/* JADX INFO: loaded from: classes5.dex */
public class tz5 {

    /* JADX INFO: renamed from: g */
    public static final fta.AbstractC5971i<String> f86358g;

    /* JADX INFO: renamed from: h */
    public static final fta.AbstractC5971i<String> f86359h;

    /* JADX INFO: renamed from: i */
    public static final fta.AbstractC5971i<String> f86360i;

    /* JADX INFO: renamed from: j */
    public static volatile String f86361j;

    /* JADX INFO: renamed from: a */
    public final ga0 f86362a;

    /* JADX INFO: renamed from: b */
    public final t83<syh> f86363b;

    /* JADX INFO: renamed from: c */
    public final t83<String> f86364c;

    /* JADX INFO: renamed from: d */
    public final lc7 f86365d;

    /* JADX INFO: renamed from: e */
    public final String f86366e;

    /* JADX INFO: renamed from: f */
    public final nc7 f86367f;

    /* JADX INFO: Add missing generic type declarations: [RespT] */
    /* JADX INFO: renamed from: tz5$a */
    public class C13292a<RespT> extends w22.AbstractC14364a<RespT> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz7 f86368a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w22[] f86369b;

        public C13292a(gz7 gz7Var, w22[] w22VarArr) {
            this.f86368a = gz7Var;
            this.f86369b = w22VarArr;
        }

        @Override // p000.w22.AbstractC14364a
        public void onClose(n4g n4gVar, fta ftaVar) {
            try {
                this.f86368a.onClose(n4gVar);
            } catch (Throwable th) {
                tz5.this.f86362a.panic(th);
            }
        }

        @Override // p000.w22.AbstractC14364a
        public void onHeaders(fta ftaVar) {
            try {
                this.f86368a.onHeaders(ftaVar);
            } catch (Throwable th) {
                tz5.this.f86362a.panic(th);
            }
        }

        @Override // p000.w22.AbstractC14364a
        public void onMessage(RespT respt) {
            try {
                this.f86368a.onNext(respt);
                this.f86369b[0].request(1);
            } catch (Throwable th) {
                tz5.this.f86362a.panic(th);
            }
        }

        @Override // p000.w22.AbstractC14364a
        public void onReady() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
    /* JADX INFO: renamed from: tz5$b */
    public class C13293b<ReqT, RespT> extends fr6<ReqT, RespT> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w22[] f86371a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Task f86372b;

        public C13293b(w22[] w22VarArr, Task task) {
            this.f86371a = w22VarArr;
            this.f86372b = task;
        }

        @Override // p000.fr6, p000.eic
        /* JADX INFO: renamed from: a */
        public w22<ReqT, RespT> mo9654a() {
            r80.hardAssert(this.f86371a[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.f86371a[0];
        }

        @Override // p000.fr6, p000.eic, p000.w22
        public void halfClose() {
            if (this.f86371a[0] == null) {
                this.f86372b.addOnSuccessListener(tz5.this.f86362a.getExecutor(), new OnSuccessListener() { // from class: uz5
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        ((w22) obj).halfClose();
                    }
                });
            } else {
                super.halfClose();
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [RespT] */
    /* JADX INFO: renamed from: tz5$c */
    public class C13294c<RespT> extends w22.AbstractC14364a<RespT> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC13296e f86374a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w22 f86375b;

        public C13294c(AbstractC13296e abstractC13296e, w22 w22Var) {
            this.f86374a = abstractC13296e;
            this.f86375b = w22Var;
        }

        @Override // p000.w22.AbstractC14364a
        public void onClose(n4g n4gVar, fta ftaVar) {
            this.f86374a.onClose(n4gVar);
        }

        @Override // p000.w22.AbstractC14364a
        public void onMessage(RespT respt) {
            this.f86374a.onMessage(respt);
            this.f86375b.request(1);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [RespT] */
    /* JADX INFO: renamed from: tz5$d */
    public class C13295d<RespT> extends w22.AbstractC14364a<RespT> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TaskCompletionSource f86377a;

        public C13295d(TaskCompletionSource taskCompletionSource) {
            this.f86377a = taskCompletionSource;
        }

        @Override // p000.w22.AbstractC14364a
        public void onClose(n4g n4gVar, fta ftaVar) {
            if (!n4gVar.isOk()) {
                this.f86377a.setException(tz5.this.exceptionFromStatus(n4gVar));
            } else {
                if (this.f86377a.getTask().isComplete()) {
                    return;
                }
                this.f86377a.setException(new C3603f("Received onClose with status OK, but no message.", C3603f.a.INTERNAL));
            }
        }

        @Override // p000.w22.AbstractC14364a
        public void onMessage(RespT respt) {
            this.f86377a.setResult(respt);
        }
    }

    /* JADX INFO: renamed from: tz5$e */
    public static abstract class AbstractC13296e<T> {
        public void onClose(n4g n4gVar) {
        }

        public void onMessage(T t) {
        }
    }

    static {
        fta.InterfaceC5967e<String> interfaceC5967e = fta.f37690f;
        f86358g = fta.AbstractC5971i.m11174of("x-goog-api-client", interfaceC5967e);
        f86359h = fta.AbstractC5971i.m11174of("google-cloud-resource-prefix", interfaceC5967e);
        f86360i = fta.AbstractC5971i.m11174of("x-goog-request-params", interfaceC5967e);
        f86361j = "gl-java/";
    }

    public tz5(ga0 ga0Var, Context context, t83<syh> t83Var, t83<String> t83Var2, ri3 ri3Var, nc7 nc7Var) {
        this(ga0Var, t83Var, t83Var2, ri3Var.getDatabaseId(), nc7Var, getGrpcCallProvider(ga0Var, context, t83Var, t83Var2, ri3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3603f exceptionFromStatus(n4g n4gVar) {
        return zi3.isMissingSslCiphers(n4gVar) ? new C3603f(zi3.f105122d, C3603f.a.fromValue(n4gVar.getCode().value()), n4gVar.getCause()) : r0i.exceptionFromStatus(n4gVar);
    }

    private String getGoogApiClientValue() {
        return String.format("%s fire/%s grpc/", f86361j, BuildConfig.VERSION_NAME);
    }

    private static lc7 getGrpcCallProvider(ga0 ga0Var, Context context, t83<syh> t83Var, t83<String> t83Var2, ri3 ri3Var) {
        return new lc7(ga0Var, context, ri3Var, new pz5(t83Var, t83Var2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runBidiStreamingRpc$0(w22[] w22VarArr, gz7 gz7Var, Task task) {
        w22 w22Var = (w22) task.getResult();
        w22VarArr[0] = w22Var;
        w22Var.start(new C13292a(gz7Var, w22VarArr), requestHeaders());
        gz7Var.onOpen();
        w22VarArr[0].request(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runRpc$2(TaskCompletionSource taskCompletionSource, Object obj, Task task) {
        w22 w22Var = (w22) task.getResult();
        w22Var.start(new C13295d(taskCompletionSource), requestHeaders());
        w22Var.request(2);
        w22Var.sendMessage(obj);
        w22Var.halfClose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runStreamingResponseRpc$1(AbstractC13296e abstractC13296e, Object obj, Task task) {
        w22 w22Var = (w22) task.getResult();
        w22Var.start(new C13294c(abstractC13296e, w22Var), requestHeaders());
        w22Var.request(1);
        w22Var.sendMessage(obj);
        w22Var.halfClose();
    }

    private fta requestHeaders() {
        fta ftaVar = new fta();
        ftaVar.put(f86358g, getGoogApiClientValue());
        ftaVar.put(f86359h, this.f86366e);
        ftaVar.put(f86360i, this.f86366e);
        nc7 nc7Var = this.f86367f;
        if (nc7Var != null) {
            nc7Var.updateMetadata(ftaVar);
        }
        return ftaVar;
    }

    public static void setClientLanguage(String str) {
        f86361j = str;
    }

    /* JADX INFO: renamed from: f */
    public <ReqT, RespT> w22<ReqT, RespT> m22937f(rua<ReqT, RespT> ruaVar, final gz7<RespT> gz7Var) {
        final w22[] w22VarArr = {null};
        Task<w22<ReqT, RespT>> taskCreateClientCall = this.f86365d.createClientCall(ruaVar);
        taskCreateClientCall.addOnCompleteListener(this.f86362a.getExecutor(), new OnCompleteListener() { // from class: qz5
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f76360a.lambda$runBidiStreamingRpc$0(w22VarArr, gz7Var, task);
            }
        });
        return new C13293b(w22VarArr, taskCreateClientCall);
    }

    /* JADX INFO: renamed from: g */
    public <ReqT, RespT> Task<RespT> m22938g(rua<ReqT, RespT> ruaVar, final ReqT reqt) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f86365d.createClientCall(ruaVar).addOnCompleteListener(this.f86362a.getExecutor(), new OnCompleteListener() { // from class: rz5
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f80178a.lambda$runRpc$2(taskCompletionSource, reqt, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: h */
    public <ReqT, RespT> void m22939h(rua<ReqT, RespT> ruaVar, final ReqT reqt, final AbstractC13296e<RespT> abstractC13296e) {
        this.f86365d.createClientCall(ruaVar).addOnCompleteListener(this.f86362a.getExecutor(), new OnCompleteListener() { // from class: sz5
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f83250a.lambda$runStreamingResponseRpc$1(abstractC13296e, reqt, task);
            }
        });
    }

    public void invalidateToken() {
        this.f86363b.invalidateToken();
        this.f86364c.invalidateToken();
    }

    public void shutdown() {
        this.f86365d.shutdown();
    }

    public tz5(ga0 ga0Var, t83<syh> t83Var, t83<String> t83Var2, qi3 qi3Var, nc7 nc7Var, lc7 lc7Var) {
        this.f86362a = ga0Var;
        this.f86367f = nc7Var;
        this.f86363b = t83Var;
        this.f86364c = t83Var2;
        this.f86365d = lc7Var;
        this.f86366e = String.format("projects/%s/databases/%s", qi3Var.getProjectId(), qi3Var.getDatabaseId());
    }
}

package p000;

import java.io.File;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import p000.j23;

/* JADX INFO: loaded from: classes7.dex */
public class j5d extends n0c {

    /* JADX INFO: renamed from: i */
    public static MediaType f49557i = MediaType.parse("application/octet-stream");

    /* JADX INFO: renamed from: g */
    public File f49558g;

    /* JADX INFO: renamed from: h */
    public MediaType f49559h;

    /* JADX INFO: renamed from: j5d$a */
    public class C7743a implements j23.InterfaceC7726b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ do1 f49560a;

        /* JADX INFO: renamed from: j5d$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f49562a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f49563b;

            public a(long j, long j2) {
                this.f49562a = j;
                this.f49563b = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C7743a c7743a = C7743a.this;
                long j = this.f49563b;
                c7743a.f49560a.inProgress((this.f49562a * 1.0f) / j, j, j5d.this.f62900e);
            }
        }

        public C7743a(do1 do1Var) {
            this.f49560a = do1Var;
        }

        @Override // p000.j23.InterfaceC7726b
        public void onRequestProgress(long j, long j2) {
            g1c.getInstance().getDelivery().execute(new a(j, j2));
        }
    }

    public j5d(String str, Object obj, Map<String, String> map, Map<String, String> map2, File file, MediaType mediaType, int i) {
        super(str, obj, map, map2, i);
        this.f49558g = file;
        this.f49559h = mediaType;
        if (file == null) {
            p75.illegalArgument("the file can not be null !", new Object[0]);
        }
        if (this.f49559h == null) {
            this.f49559h = f49557i;
        }
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: b */
    public Request mo10718b(RequestBody requestBody) {
        return this.f62901f.post(requestBody).build();
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: c */
    public RequestBody mo10719c() {
        return RequestBody.create(this.f49559h, this.f49558g);
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: d */
    public RequestBody mo13741d(RequestBody requestBody, do1 do1Var) {
        return do1Var == null ? requestBody : new j23(requestBody, new C7743a(do1Var));
    }
}

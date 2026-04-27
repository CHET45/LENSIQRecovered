package p000;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.xi7;

/* JADX INFO: loaded from: classes5.dex */
public class uv3 implements wi7, xi7 {

    /* JADX INFO: renamed from: a */
    public final eid<dj7> f89215a;

    /* JADX INFO: renamed from: b */
    public final Context f89216b;

    /* JADX INFO: renamed from: c */
    public final eid<tyh> f89217c;

    /* JADX INFO: renamed from: d */
    public final Set<ui7> f89218d;

    /* JADX INFO: renamed from: e */
    public final Executor f89219e;

    private uv3(final Context context, final String str, Set<ui7> set, eid<tyh> eidVar, Executor executor) {
        this(new dx8(new eid() { // from class: qv3
            @Override // p000.eid
            public final Object get() {
                return uv3.lambda$new$2(context, str);
            }
        }), set, executor, eidVar, context);
    }

    @efb
    public static ej2<uv3> component() {
        final pkd pkdVarQualified = pkd.qualified(ao0.class, Executor.class);
        return ej2.builder(uv3.class, wi7.class, xi7.class).add(i64.required((Class<?>) Context.class)).add(i64.required((Class<?>) lw5.class)).add(i64.setOf((Class<?>) ui7.class)).add(i64.requiredProvider((Class<?>) tyh.class)).add(i64.required((pkd<?>) pkdVarQualified)).factory(new tj2() { // from class: sv3
            @Override // p000.tj2
            public final Object create(mj2 mj2Var) {
                return uv3.lambda$component$3(pkdVarQualified, mj2Var);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ uv3 lambda$component$3(pkd pkdVar, mj2 mj2Var) {
        return new uv3((Context) mj2Var.get(Context.class), ((lw5) mj2Var.get(lw5.class)).getPersistenceKey(), (Set<ui7>) mj2Var.setOf(ui7.class), (eid<tyh>) mj2Var.getProvider(tyh.class), (Executor) mj2Var.get(pkdVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$getHeartBeatsHeader$1() throws Exception {
        String string;
        synchronized (this) {
            try {
                dj7 dj7Var = this.f89215a.get();
                List<ej7> listM9194f = dj7Var.m9194f();
                dj7Var.m9193e();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < listM9194f.size(); i++) {
                    ej7 ej7Var = listM9194f.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", ej7Var.getUserAgent());
                    jSONObject.put("dates", new JSONArray((Collection) ej7Var.getUsedDates()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", k95.f53083Y4);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dj7 lambda$new$2(Context context, String str) {
        return new dj7(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$registerHeartBeat$0() throws Exception {
        synchronized (this) {
            this.f89215a.get().m9201m(System.currentTimeMillis(), this.f89217c.get().getUserAgent());
        }
        return null;
    }

    @Override // p000.xi7
    @efb
    public synchronized xi7.EnumC15141a getHeartBeatCode(@efb String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        dj7 dj7Var = this.f89215a.get();
        if (!dj7Var.m9199k(jCurrentTimeMillis)) {
            return xi7.EnumC15141a.NONE;
        }
        dj7Var.m9198j();
        return xi7.EnumC15141a.GLOBAL;
    }

    @Override // p000.wi7
    public Task<String> getHeartBeatsHeader() {
        return !bzh.isUserUnlocked(this.f89216b) ? Tasks.forResult("") : Tasks.call(this.f89219e, new Callable() { // from class: rv3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f79721a.lambda$getHeartBeatsHeader$1();
            }
        });
    }

    public Task<Void> registerHeartBeat() {
        if (this.f89218d.size() > 0 && bzh.isUserUnlocked(this.f89216b)) {
            return Tasks.call(this.f89219e, new Callable() { // from class: tv3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f86059a.lambda$registerHeartBeat$0();
                }
            });
        }
        return Tasks.forResult(null);
    }

    @fdi
    public uv3(eid<dj7> eidVar, Set<ui7> set, Executor executor, eid<tyh> eidVar2, Context context) {
        this.f89215a = eidVar;
        this.f89218d = set;
        this.f89219e = executor;
        this.f89217c = eidVar2;
        this.f89216b = context;
    }
}

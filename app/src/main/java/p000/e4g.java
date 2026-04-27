package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class e4g implements jq7 {

    /* JADX INFO: renamed from: c */
    public static final String f31782c = "simplify_statics";

    /* JADX INFO: renamed from: a */
    public final ArrayList<jq7> f31783a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Context f31784b;

    /* JADX INFO: renamed from: e4g$a */
    public class RunnableC5114a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayMap f31785a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f31786b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f31787c;

        public RunnableC5114a(final ArrayMap val$params, final Context val$context, final String val$key) {
            this.f31785a = val$params;
            this.f31786b = val$context;
            this.f31787c = val$key;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (jq7 jq7Var : e4g.this.f31783a) {
                this.f31785a.put(d4g.f28408b, Build.BRAND);
                this.f31785a.put("model", Build.MODEL);
                this.f31785a.put(d4g.f28409c, Build.VERSION.RELEASE);
                this.f31785a.put(d4g.f28410d, c1i.getVersion(e4g.this.f31784b));
                this.f31785a.put(d4g.f28411e, c1i.getVersion(e4g.this.f31784b));
                this.f31785a.put(d4g.f28412f, vfe.getInstance().getString("KEY_DEVICE_PROJECT"));
                this.f31785a.put("userId", vfe.getInstance().getString("SP_USER_ID"));
                jq7Var.onEvent(this.f31786b, this.f31787c, this.f31785a);
            }
        }
    }

    /* JADX INFO: renamed from: e4g$b */
    public class RunnableC5115b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f31789a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f31790b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Bundle f31791c;

        public RunnableC5115b(final Context val$context, final String val$event, final Bundle val$bundle) {
            this.f31789a = val$context;
            this.f31790b = val$event;
            this.f31791c = val$bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = e4g.this.f31783a.iterator();
            while (it.hasNext()) {
                ((jq7) it.next()).onEvent(this.f31789a, this.f31790b, this.f31791c);
            }
        }
    }

    /* JADX INFO: renamed from: e4g$c */
    public static class C5116c {

        /* JADX INFO: renamed from: a */
        public static final e4g f31793a = new e4g();

        private C5116c() {
        }
    }

    public static e4g getInstance() {
        return C5116c.f31793a;
    }

    @Override // p000.jq7
    public void init(Context context) {
        this.f31784b = context;
        Iterator<jq7> it = this.f31783a.iterator();
        while (it.hasNext()) {
            it.next().init(context);
        }
    }

    @Override // p000.jq7
    public void onEvent(Context context, String key, ArrayMap<String, String> params) {
        Log.i(f31782c, "功能事件 key =" + key);
        eyg.runOnNonUIThread(new RunnableC5114a(params, context, key));
    }

    @Override // p000.jq7
    public void setEnable(boolean enable) {
        Iterator<jq7> it = this.f31783a.iterator();
        while (it.hasNext()) {
            it.next().setEnable(enable);
        }
    }

    public void setStatistics(jq7... iStatistics) {
        for (jq7 jq7Var : iStatistics) {
            this.f31783a.add(jq7Var);
        }
    }

    @Override // p000.jq7
    public void onEvent(String key, Map<String, Object> map) {
        Iterator<jq7> it = this.f31783a.iterator();
        while (it.hasNext()) {
            it.next().onEvent(key, map);
        }
    }

    @Override // p000.jq7
    public void onEvent(String key, String event) {
        Iterator<jq7> it = this.f31783a.iterator();
        while (it.hasNext()) {
            it.next().onEvent(key, event);
        }
    }

    @Override // p000.jq7
    public void onEvent(Context context, String event, Bundle bundle) {
        Log.i(f31782c, "功能事件 event =" + event);
        eyg.runOnNonUIThread(new RunnableC5115b(context, event, bundle));
    }

    @Override // p000.jq7
    public void onEvent(Context context, String title) {
        Log.i(f31782c, "功能事件 title =" + title);
        Iterator<jq7> it = this.f31783a.iterator();
        while (it.hasNext()) {
            it.next().onEvent(context, title);
        }
    }
}

package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.ArrayMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class gw5 implements jq7 {

    /* JADX INFO: renamed from: a */
    public FirebaseAnalytics f41714a;

    /* JADX INFO: renamed from: gw5$a */
    public class RunnableC6625a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayMap f41715a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f41716b;

        public RunnableC6625a(final ArrayMap val$params, final String val$key) {
            this.f41715a = val$params;
            this.f41716b = val$key;
        }

        @Override // java.lang.Runnable
        public void run() {
            String json = new Gson().toJson(this.f41715a);
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.C3552d.f23206h, "count");
            bundle.putString("content", json);
            gw5.this.f41714a.logEvent(this.f41716b, bundle);
        }
    }

    /* JADX INFO: renamed from: gw5$b */
    public class RunnableC6626b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map f41718a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f41719b;

        public RunnableC6626b(final Map val$map, final String val$key) {
            this.f41718a = val$map;
            this.f41719b = val$key;
        }

        @Override // java.lang.Runnable
        public void run() {
            String json = new Gson().toJson(this.f41718a);
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.C3552d.f23206h, "count");
            bundle.putString("content", json);
            gw5.this.f41714a.logEvent(this.f41719b, bundle);
        }
    }

    /* JADX INFO: renamed from: gw5$c */
    public class RunnableC6627c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f41721a;

        public RunnableC6627c(final String val$title) {
            this.f41721a = val$title;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.C3552d.f23206h, "count");
            gw5.this.f41714a.logEvent(this.f41721a, bundle);
        }
    }

    /* JADX INFO: renamed from: gw5$d */
    public static class C6628d {

        /* JADX INFO: renamed from: a */
        public static gw5 f41723a = new gw5();

        private C6628d() {
        }
    }

    public static gw5 getInstance() {
        return C6628d.f41723a;
    }

    @Override // p000.jq7
    public void init(Context context) {
        this.f41714a = FirebaseAnalytics.getInstance(context);
    }

    @Override // p000.jq7
    public void onEvent(Context context, String key, ArrayMap<String, String> params) {
        new Thread(new RunnableC6625a(params, key)).start();
    }

    @Override // p000.jq7
    public void setEnable(boolean enable) {
        this.f41714a.setAnalyticsCollectionEnabled(enable);
    }

    @Override // p000.jq7
    public void onEvent(String key, Map<String, Object> map) {
        new Thread(new RunnableC6626b(map, key)).start();
    }

    @Override // p000.jq7
    public void onEvent(String key, String event) {
    }

    @Override // p000.jq7
    public void onEvent(Context context, String name, Bundle b) {
        this.f41714a.logEvent(name, b);
    }

    @Override // p000.jq7
    public void onEvent(Context context, String title) {
        new Thread(new RunnableC6627c(title)).start();
    }
}

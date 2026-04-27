package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.ts2;

/* JADX INFO: loaded from: classes3.dex */
public class g4e implements ComponentCallbacks2, e59, zwa<RequestBuilder<Drawable>> {

    /* JADX INFO: renamed from: M */
    public static final RequestOptions f38744M = RequestOptions.decodeTypeOf(Bitmap.class).lock();

    /* JADX INFO: renamed from: N */
    public static final RequestOptions f38745N = RequestOptions.decodeTypeOf(GifDrawable.class).lock();

    /* JADX INFO: renamed from: Q */
    public static final RequestOptions f38746Q = RequestOptions.diskCacheStrategyOf(ne4.f64119c).priority(Priority.LOW).skipMemoryCache(true);

    /* JADX INFO: renamed from: C */
    public final ts2 f38747C;

    /* JADX INFO: renamed from: F */
    public final CopyOnWriteArrayList<e4e<Object>> f38748F;

    /* JADX INFO: renamed from: H */
    @xc7("this")
    public RequestOptions f38749H;

    /* JADX INFO: renamed from: L */
    public boolean f38750L;

    /* JADX INFO: renamed from: a */
    public final ComponentCallbacks2C2485a f38751a;

    /* JADX INFO: renamed from: b */
    public final Context f38752b;

    /* JADX INFO: renamed from: c */
    public final u49 f38753c;

    /* JADX INFO: renamed from: d */
    @xc7("this")
    public final o4e f38754d;

    /* JADX INFO: renamed from: e */
    @xc7("this")
    public final j4e f38755e;

    /* JADX INFO: renamed from: f */
    @xc7("this")
    public final jng f38756f;

    /* JADX INFO: renamed from: m */
    public final Runnable f38757m;

    /* JADX INFO: renamed from: g4e$a */
    public class RunnableC6126a implements Runnable {
        public RunnableC6126a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g4e g4eVar = g4e.this;
            g4eVar.f38753c.addListener(g4eVar);
        }
    }

    /* JADX INFO: renamed from: g4e$b */
    public static class C6127b extends he3<View, Object> {
        public C6127b(@efb View view) {
            super(view);
        }

        @Override // p000.he3
        /* JADX INFO: renamed from: a */
        public void mo3030a(@hib Drawable drawable) {
        }

        @Override // p000.jmg
        public void onLoadFailed(@hib Drawable drawable) {
        }

        @Override // p000.jmg
        public void onResourceReady(@efb Object obj, @hib afh<? super Object> afhVar) {
        }
    }

    /* JADX INFO: renamed from: g4e$c */
    public class C6128c implements ts2.InterfaceC13182a {

        /* JADX INFO: renamed from: a */
        @xc7("RequestManager.this")
        public final o4e f38759a;

        public C6128c(@efb o4e o4eVar) {
            this.f38759a = o4eVar;
        }

        @Override // p000.ts2.InterfaceC13182a
        public void onConnectivityChanged(boolean z) {
            if (z) {
                synchronized (g4e.this) {
                    this.f38759a.restartRequests();
                }
            }
        }
    }

    public g4e(@efb ComponentCallbacks2C2485a componentCallbacks2C2485a, @efb u49 u49Var, @efb j4e j4eVar, @efb Context context) {
        this(componentCallbacks2C2485a, u49Var, j4eVar, new o4e(), componentCallbacks2C2485a.m4348a(), context);
    }

    private void untrackOrDelegate(@efb jmg<?> jmgVar) {
        boolean zM11383f = m11383f(jmgVar);
        q3e request = jmgVar.getRequest();
        if (zM11383f || this.f38751a.m4351d(jmgVar) || request == null) {
            return;
        }
        jmgVar.setRequest(null);
        request.clear();
    }

    private synchronized void updateRequestOptions(@efb RequestOptions requestOptions) {
        this.f38749H = this.f38749H.apply(requestOptions);
    }

    /* JADX INFO: renamed from: a */
    public List<e4e<Object>> m11377a() {
        return this.f38748F;
    }

    public g4e addDefaultRequestListener(e4e<Object> e4eVar) {
        this.f38748F.add(e4eVar);
        return this;
    }

    @efb
    public synchronized g4e applyDefaultRequestOptions(@efb RequestOptions requestOptions) {
        updateRequestOptions(requestOptions);
        return this;
    }

    @efb
    @yx1
    /* JADX INFO: renamed from: as */
    public <ResourceType> RequestBuilder<ResourceType> m11378as(@efb Class<ResourceType> cls) {
        return new RequestBuilder<>(this.f38751a, this, cls, this.f38752b);
    }

    @efb
    @yx1
    public RequestBuilder<Bitmap> asBitmap() {
        return m11378as(Bitmap.class).apply((cu0<?>) f38744M);
    }

    @efb
    @yx1
    public RequestBuilder<Drawable> asDrawable() {
        return m11378as(Drawable.class);
    }

    @efb
    @yx1
    public RequestBuilder<File> asFile() {
        return m11378as(File.class).apply((cu0<?>) RequestOptions.skipMemoryCacheOf(true));
    }

    @efb
    @yx1
    public RequestBuilder<GifDrawable> asGif() {
        return m11378as(GifDrawable.class).apply((cu0<?>) f38745N);
    }

    /* JADX INFO: renamed from: b */
    public synchronized RequestOptions m11379b() {
        return this.f38749H;
    }

    @efb
    /* JADX INFO: renamed from: c */
    public <T> kfh<?, T> m11380c(Class<T> cls) {
        return this.f38751a.m4349b().getDefaultTransitionOptions(cls);
    }

    public void clear(@efb View view) {
        clear(new C6127b(view));
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m11381d(@efb RequestOptions requestOptions) {
        this.f38749H = requestOptions.mo28231clone().autoClone();
    }

    @efb
    @yx1
    public RequestBuilder<File> download(@hib Object obj) {
        return downloadOnly().load(obj);
    }

    @efb
    @yx1
    public RequestBuilder<File> downloadOnly() {
        return m11378as(File.class).apply((cu0<?>) f38746Q);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m11382e(@efb jmg<?> jmgVar, @efb q3e q3eVar) {
        this.f38756f.track(jmgVar);
        this.f38754d.runRequest(q3eVar);
    }

    /* JADX INFO: renamed from: f */
    public synchronized boolean m11383f(@efb jmg<?> jmgVar) {
        q3e request = jmgVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f38754d.clearAndRemove(request)) {
            return false;
        }
        this.f38756f.untrack(jmgVar);
        jmgVar.setRequest(null);
        return true;
    }

    public synchronized boolean isPaused() {
        return this.f38754d.isPaused();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // p000.e59
    public synchronized void onDestroy() {
        try {
            this.f38756f.onDestroy();
            Iterator<jmg<?>> it = this.f38756f.getAll().iterator();
            while (it.hasNext()) {
                clear(it.next());
            }
            this.f38756f.clear();
            this.f38754d.clearRequests();
            this.f38753c.removeListener(this);
            this.f38753c.removeListener(this.f38747C);
            v0i.removeCallbacksOnUiThread(this.f38757m);
            this.f38751a.m4352e(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // p000.e59
    public synchronized void onStart() {
        resumeRequests();
        this.f38756f.onStart();
    }

    @Override // p000.e59
    public synchronized void onStop() {
        pauseRequests();
        this.f38756f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.f38750L) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.f38754d.pauseAllRequests();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        Iterator<g4e> it = this.f38755e.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.f38754d.pauseRequests();
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        Iterator<g4e> it = this.f38755e.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.f38754d.resumeRequests();
    }

    public synchronized void resumeRequestsRecursive() {
        v0i.assertMainThread();
        resumeRequests();
        Iterator<g4e> it = this.f38755e.getDescendants().iterator();
        while (it.hasNext()) {
            it.next().resumeRequests();
        }
    }

    @efb
    public synchronized g4e setDefaultRequestOptions(@efb RequestOptions requestOptions) {
        m11381d(requestOptions);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z) {
        this.f38750L = z;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f38754d + ", treeNode=" + this.f38755e + "}";
    }

    public void clear(@hib jmg<?> jmgVar) {
        if (jmgVar == null) {
            return;
        }
        untrackOrDelegate(jmgVar);
    }

    public g4e(ComponentCallbacks2C2485a componentCallbacks2C2485a, u49 u49Var, j4e j4eVar, o4e o4eVar, vs2 vs2Var, Context context) {
        this.f38756f = new jng();
        RunnableC6126a runnableC6126a = new RunnableC6126a();
        this.f38757m = runnableC6126a;
        this.f38751a = componentCallbacks2C2485a;
        this.f38753c = u49Var;
        this.f38755e = j4eVar;
        this.f38754d = o4eVar;
        this.f38752b = context;
        ts2 ts2VarBuild = vs2Var.build(context.getApplicationContext(), new C6128c(o4eVar));
        this.f38747C = ts2VarBuild;
        if (v0i.isOnBackgroundThread()) {
            v0i.postOnUiThread(runnableC6126a);
        } else {
            u49Var.addListener(this);
        }
        u49Var.addListener(ts2VarBuild);
        this.f38748F = new CopyOnWriteArrayList<>(componentCallbacks2C2485a.m4349b().getDefaultRequestListeners());
        m11381d(componentCallbacks2C2485a.m4349b().getDefaultRequestOptions());
        componentCallbacks2C2485a.m4350c(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.zwa
    @efb
    @yx1
    public RequestBuilder<Drawable> load(@hib Bitmap bitmap) {
        return asDrawable().load(bitmap);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.zwa
    @efb
    @yx1
    public RequestBuilder<Drawable> load(@hib Drawable drawable) {
        return asDrawable().load(drawable);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.zwa
    @efb
    @yx1
    public RequestBuilder<Drawable> load(@hib String str) {
        return asDrawable().load(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.zwa
    @efb
    @yx1
    public RequestBuilder<Drawable> load(@hib Uri uri) {
        return asDrawable().load(uri);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.zwa
    @efb
    @yx1
    public RequestBuilder<Drawable> load(@hib File file) {
        return asDrawable().load(file);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.zwa
    @efb
    @yx1
    public RequestBuilder<Drawable> load(@hib @gq4 @wpd Integer num) {
        return asDrawable().load(num);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.zwa
    @yx1
    @Deprecated
    public RequestBuilder<Drawable> load(@hib URL url) {
        return asDrawable().load(url);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.zwa
    @efb
    @yx1
    public RequestBuilder<Drawable> load(@hib byte[] bArr) {
        return asDrawable().load(bArr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.zwa
    @efb
    @yx1
    public RequestBuilder<Drawable> load(@hib Object obj) {
        return asDrawable().load(obj);
    }
}

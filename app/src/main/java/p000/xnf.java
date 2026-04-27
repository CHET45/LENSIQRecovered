package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C2486b;
import com.bumptech.glide.C2487c;
import com.bumptech.glide.Priority;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p000.h25;

/* JADX INFO: loaded from: classes4.dex */
public final class xnf<R> implements q3e, gqf, x5e {

    /* JADX INFO: renamed from: F */
    public static final String f98641F = "Glide";

    /* JADX INFO: renamed from: A */
    @xc7("requestLock")
    public int f98643A;

    /* JADX INFO: renamed from: B */
    @xc7("requestLock")
    public int f98644B;

    /* JADX INFO: renamed from: C */
    @xc7("requestLock")
    public boolean f98645C;

    /* JADX INFO: renamed from: D */
    @hib
    public RuntimeException f98646D;

    /* JADX INFO: renamed from: a */
    public int f98647a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f98648b;

    /* JADX INFO: renamed from: c */
    public final b3g f98649c;

    /* JADX INFO: renamed from: d */
    public final Object f98650d;

    /* JADX INFO: renamed from: e */
    @hib
    public final e4e<R> f98651e;

    /* JADX INFO: renamed from: f */
    public final x3e f98652f;

    /* JADX INFO: renamed from: g */
    public final Context f98653g;

    /* JADX INFO: renamed from: h */
    public final C2487c f98654h;

    /* JADX INFO: renamed from: i */
    @hib
    public final Object f98655i;

    /* JADX INFO: renamed from: j */
    public final Class<R> f98656j;

    /* JADX INFO: renamed from: k */
    public final cu0<?> f98657k;

    /* JADX INFO: renamed from: l */
    public final int f98658l;

    /* JADX INFO: renamed from: m */
    public final int f98659m;

    /* JADX INFO: renamed from: n */
    public final Priority f98660n;

    /* JADX INFO: renamed from: o */
    public final jmg<R> f98661o;

    /* JADX INFO: renamed from: p */
    @hib
    public final List<e4e<R>> f98662p;

    /* JADX INFO: renamed from: q */
    public final efh<? super R> f98663q;

    /* JADX INFO: renamed from: r */
    public final Executor f98664r;

    /* JADX INFO: renamed from: s */
    @xc7("requestLock")
    public t5e<R> f98665s;

    /* JADX INFO: renamed from: t */
    @xc7("requestLock")
    public h25.C6684d f98666t;

    /* JADX INFO: renamed from: u */
    @xc7("requestLock")
    public long f98667u;

    /* JADX INFO: renamed from: v */
    public volatile h25 f98668v;

    /* JADX INFO: renamed from: w */
    @xc7("requestLock")
    public EnumC15215a f98669w;

    /* JADX INFO: renamed from: x */
    @xc7("requestLock")
    @hib
    public Drawable f98670x;

    /* JADX INFO: renamed from: y */
    @xc7("requestLock")
    @hib
    public Drawable f98671y;

    /* JADX INFO: renamed from: z */
    @xc7("requestLock")
    @hib
    public Drawable f98672z;

    /* JADX INFO: renamed from: E */
    public static final String f98640E = "GlideRequest";

    /* JADX INFO: renamed from: G */
    public static final boolean f98642G = Log.isLoggable(f98640E, 2);

    /* JADX INFO: renamed from: xnf$a */
    public enum EnumC15215a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private xnf(Context context, C2487c c2487c, @efb Object obj, @hib Object obj2, Class<R> cls, cu0<?> cu0Var, int i, int i2, Priority priority, jmg<R> jmgVar, @hib e4e<R> e4eVar, @hib List<e4e<R>> list, x3e x3eVar, h25 h25Var, efh<? super R> efhVar, Executor executor) {
        this.f98648b = f98642G ? String.valueOf(super.hashCode()) : null;
        this.f98649c = b3g.newInstance();
        this.f98650d = obj;
        this.f98653g = context;
        this.f98654h = c2487c;
        this.f98655i = obj2;
        this.f98656j = cls;
        this.f98657k = cu0Var;
        this.f98658l = i;
        this.f98659m = i2;
        this.f98660n = priority;
        this.f98661o = jmgVar;
        this.f98651e = e4eVar;
        this.f98662p = list;
        this.f98652f = x3eVar;
        this.f98668v = h25Var;
        this.f98663q = efhVar;
        this.f98664r = executor;
        this.f98669w = EnumC15215a.PENDING;
        if (this.f98646D == null && c2487c.getExperiments().isEnabled(C2486b.e.class)) {
            this.f98646D = new RuntimeException("Glide request origin trace");
        }
    }

    @xc7("requestLock")
    private void assertNotCallingCallbacks() {
        if (this.f98645C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @xc7("requestLock")
    private boolean canNotifyCleared() {
        x3e x3eVar = this.f98652f;
        return x3eVar == null || x3eVar.canNotifyCleared(this);
    }

    @xc7("requestLock")
    private boolean canNotifyStatusChanged() {
        x3e x3eVar = this.f98652f;
        return x3eVar == null || x3eVar.canNotifyStatusChanged(this);
    }

    @xc7("requestLock")
    private boolean canSetResource() {
        x3e x3eVar = this.f98652f;
        return x3eVar == null || x3eVar.canSetImage(this);
    }

    @xc7("requestLock")
    private void cancel() {
        assertNotCallingCallbacks();
        this.f98649c.throwIfRecycled();
        this.f98661o.removeCallback(this);
        h25.C6684d c6684d = this.f98666t;
        if (c6684d != null) {
            c6684d.cancel();
            this.f98666t = null;
        }
    }

    private void experimentalNotifyRequestStarted(Object obj) {
        List<e4e<R>> list = this.f98662p;
        if (list == null) {
            return;
        }
        for (e4e<R> e4eVar : list) {
            if (e4eVar instanceof nh5) {
                ((nh5) e4eVar).onRequestStarted(obj);
            }
        }
    }

    @xc7("requestLock")
    private Drawable getErrorDrawable() {
        if (this.f98670x == null) {
            Drawable errorPlaceholder = this.f98657k.getErrorPlaceholder();
            this.f98670x = errorPlaceholder;
            if (errorPlaceholder == null && this.f98657k.getErrorId() > 0) {
                this.f98670x = loadDrawable(this.f98657k.getErrorId());
            }
        }
        return this.f98670x;
    }

    @xc7("requestLock")
    private Drawable getFallbackDrawable() {
        if (this.f98672z == null) {
            Drawable fallbackDrawable = this.f98657k.getFallbackDrawable();
            this.f98672z = fallbackDrawable;
            if (fallbackDrawable == null && this.f98657k.getFallbackId() > 0) {
                this.f98672z = loadDrawable(this.f98657k.getFallbackId());
            }
        }
        return this.f98672z;
    }

    @xc7("requestLock")
    private Drawable getPlaceholderDrawable() {
        if (this.f98671y == null) {
            Drawable placeholderDrawable = this.f98657k.getPlaceholderDrawable();
            this.f98671y = placeholderDrawable;
            if (placeholderDrawable == null && this.f98657k.getPlaceholderId() > 0) {
                this.f98671y = loadDrawable(this.f98657k.getPlaceholderId());
            }
        }
        return this.f98671y;
    }

    @xc7("requestLock")
    private boolean isFirstReadyResource() {
        x3e x3eVar = this.f98652f;
        return x3eVar == null || !x3eVar.getRoot().isAnyResourceSet();
    }

    @xc7("requestLock")
    private Drawable loadDrawable(@gq4 int i) {
        return cq4.getDrawable(this.f98654h, i, this.f98657k.getTheme() != null ? this.f98657k.getTheme() : this.f98653g.getTheme());
    }

    private void logV(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f98648b);
    }

    private static int maybeApplySizeMultiplier(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    @xc7("requestLock")
    private void notifyLoadFailed() {
        x3e x3eVar = this.f98652f;
        if (x3eVar != null) {
            x3eVar.onRequestFailed(this);
        }
    }

    @xc7("requestLock")
    private void notifyLoadSuccess() {
        x3e x3eVar = this.f98652f;
        if (x3eVar != null) {
            x3eVar.onRequestSuccess(this);
        }
    }

    public static <R> xnf<R> obtain(Context context, C2487c c2487c, Object obj, Object obj2, Class<R> cls, cu0<?> cu0Var, int i, int i2, Priority priority, jmg<R> jmgVar, e4e<R> e4eVar, @hib List<e4e<R>> list, x3e x3eVar, h25 h25Var, efh<? super R> efhVar, Executor executor) {
        return new xnf<>(context, c2487c, obj, obj2, cls, cu0Var, i, i2, priority, jmgVar, e4eVar, list, x3eVar, h25Var, efhVar, executor);
    }

    @xc7("requestLock")
    private void setErrorPlaceholder() {
        if (canNotifyStatusChanged()) {
            Drawable fallbackDrawable = this.f98655i == null ? getFallbackDrawable() : null;
            if (fallbackDrawable == null) {
                fallbackDrawable = getErrorDrawable();
            }
            if (fallbackDrawable == null) {
                fallbackDrawable = getPlaceholderDrawable();
            }
            this.f98661o.onLoadFailed(fallbackDrawable);
        }
    }

    @Override // p000.q3e
    public void begin() {
        synchronized (this.f98650d) {
            try {
                assertNotCallingCallbacks();
                this.f98649c.throwIfRecycled();
                this.f98667u = si9.getLogTime();
                Object obj = this.f98655i;
                if (obj == null) {
                    if (v0i.isValidDimensions(this.f98658l, this.f98659m)) {
                        this.f98643A = this.f98658l;
                        this.f98644B = this.f98659m;
                    }
                    onLoadFailed(new a77("Received null model"), getFallbackDrawable() == null ? 5 : 3);
                    return;
                }
                EnumC15215a enumC15215a = this.f98669w;
                EnumC15215a enumC15215a2 = EnumC15215a.RUNNING;
                if (enumC15215a == enumC15215a2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (enumC15215a == EnumC15215a.COMPLETE) {
                    onResourceReady(this.f98665s, hh3.MEMORY_CACHE, false);
                    return;
                }
                experimentalNotifyRequestStarted(obj);
                this.f98647a = i77.beginSectionAsync(f98640E);
                EnumC15215a enumC15215a3 = EnumC15215a.WAITING_FOR_SIZE;
                this.f98669w = enumC15215a3;
                if (v0i.isValidDimensions(this.f98658l, this.f98659m)) {
                    onSizeReady(this.f98658l, this.f98659m);
                } else {
                    this.f98661o.getSize(this);
                }
                EnumC15215a enumC15215a4 = this.f98669w;
                if ((enumC15215a4 == enumC15215a2 || enumC15215a4 == enumC15215a3) && canNotifyStatusChanged()) {
                    this.f98661o.onLoadStarted(getPlaceholderDrawable());
                }
                if (f98642G) {
                    logV("finished run method in " + si9.getElapsedMillis(this.f98667u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.q3e
    public void clear() {
        synchronized (this.f98650d) {
            try {
                assertNotCallingCallbacks();
                this.f98649c.throwIfRecycled();
                EnumC15215a enumC15215a = this.f98669w;
                EnumC15215a enumC15215a2 = EnumC15215a.CLEARED;
                if (enumC15215a == enumC15215a2) {
                    return;
                }
                cancel();
                t5e<R> t5eVar = this.f98665s;
                if (t5eVar != null) {
                    this.f98665s = null;
                } else {
                    t5eVar = null;
                }
                if (canNotifyCleared()) {
                    this.f98661o.onLoadCleared(getPlaceholderDrawable());
                }
                i77.endSectionAsync(f98640E, this.f98647a);
                this.f98669w = enumC15215a2;
                if (t5eVar != null) {
                    this.f98668v.release(t5eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.x5e
    public Object getLock() {
        this.f98649c.throwIfRecycled();
        return this.f98650d;
    }

    @Override // p000.q3e
    public boolean isAnyResourceSet() {
        boolean z;
        synchronized (this.f98650d) {
            z = this.f98669w == EnumC15215a.COMPLETE;
        }
        return z;
    }

    @Override // p000.q3e
    public boolean isCleared() {
        boolean z;
        synchronized (this.f98650d) {
            z = this.f98669w == EnumC15215a.CLEARED;
        }
        return z;
    }

    @Override // p000.q3e
    public boolean isComplete() {
        boolean z;
        synchronized (this.f98650d) {
            z = this.f98669w == EnumC15215a.COMPLETE;
        }
        return z;
    }

    @Override // p000.q3e
    public boolean isEquivalentTo(q3e q3eVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        cu0<?> cu0Var;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        cu0<?> cu0Var2;
        Priority priority2;
        int size2;
        if (!(q3eVar instanceof xnf)) {
            return false;
        }
        synchronized (this.f98650d) {
            try {
                i = this.f98658l;
                i2 = this.f98659m;
                obj = this.f98655i;
                cls = this.f98656j;
                cu0Var = this.f98657k;
                priority = this.f98660n;
                List<e4e<R>> list = this.f98662p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        xnf xnfVar = (xnf) q3eVar;
        synchronized (xnfVar.f98650d) {
            try {
                i3 = xnfVar.f98658l;
                i4 = xnfVar.f98659m;
                obj2 = xnfVar.f98655i;
                cls2 = xnfVar.f98656j;
                cu0Var2 = xnfVar.f98657k;
                priority2 = xnfVar.f98660n;
                List<e4e<R>> list2 = xnfVar.f98662p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i == i3 && i2 == i4 && v0i.bothModelsNullEquivalentOrEquals(obj, obj2) && cls.equals(cls2) && cu0Var.equals(cu0Var2) && priority == priority2 && size == size2;
    }

    @Override // p000.q3e
    public boolean isRunning() {
        boolean z;
        synchronized (this.f98650d) {
            try {
                EnumC15215a enumC15215a = this.f98669w;
                z = enumC15215a == EnumC15215a.RUNNING || enumC15215a == EnumC15215a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z;
    }

    @Override // p000.x5e
    public void onLoadFailed(a77 a77Var) {
        onLoadFailed(a77Var, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.x5e
    public void onResourceReady(t5e<?> t5eVar, hh3 hh3Var, boolean z) {
        this.f98649c.throwIfRecycled();
        t5e<?> t5eVar2 = null;
        try {
            synchronized (this.f98650d) {
                try {
                    this.f98666t = null;
                    if (t5eVar == null) {
                        onLoadFailed(new a77("Expected to receive a Resource<R> with an object of " + this.f98656j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = t5eVar.get();
                    try {
                        if (obj != null && this.f98656j.isAssignableFrom(obj.getClass())) {
                            if (canSetResource()) {
                                onResourceReady(t5eVar, obj, hh3Var, z);
                                return;
                            }
                            this.f98665s = null;
                            this.f98669w = EnumC15215a.COMPLETE;
                            i77.endSectionAsync(f98640E, this.f98647a);
                            this.f98668v.release(t5eVar);
                            return;
                        }
                        this.f98665s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f98656j);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(t5eVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        onLoadFailed(new a77(sb.toString()));
                        this.f98668v.release(t5eVar);
                    } catch (Throwable th) {
                        t5eVar2 = t5eVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (t5eVar2 != null) {
                this.f98668v.release(t5eVar2);
            }
            throw th3;
        }
    }

    @Override // p000.gqf
    public void onSizeReady(int i, int i2) throws Throwable {
        Object obj;
        this.f98649c.throwIfRecycled();
        Object obj2 = this.f98650d;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f98642G;
                    if (z) {
                        logV("Got onSizeReady in " + si9.getElapsedMillis(this.f98667u));
                    }
                    if (this.f98669w == EnumC15215a.WAITING_FOR_SIZE) {
                        EnumC15215a enumC15215a = EnumC15215a.RUNNING;
                        this.f98669w = enumC15215a;
                        float sizeMultiplier = this.f98657k.getSizeMultiplier();
                        this.f98643A = maybeApplySizeMultiplier(i, sizeMultiplier);
                        this.f98644B = maybeApplySizeMultiplier(i2, sizeMultiplier);
                        if (z) {
                            logV("finished setup for calling load in " + si9.getElapsedMillis(this.f98667u));
                        }
                        obj = obj2;
                        try {
                            this.f98666t = this.f98668v.load(this.f98654h, this.f98655i, this.f98657k.getSignature(), this.f98643A, this.f98644B, this.f98657k.getResourceClass(), this.f98656j, this.f98660n, this.f98657k.getDiskCacheStrategy(), this.f98657k.getTransformations(), this.f98657k.isTransformationRequired(), this.f98657k.m8693b(), this.f98657k.getOptions(), this.f98657k.isMemoryCacheable(), this.f98657k.getUseUnlimitedSourceGeneratorsPool(), this.f98657k.getUseAnimationPool(), this.f98657k.getOnlyRetrieveFromCache(), this, this.f98664r);
                            if (this.f98669w != enumC15215a) {
                                this.f98666t = null;
                            }
                            if (z) {
                                logV("finished onSizeReady in " + si9.getElapsedMillis(this.f98667u));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // p000.q3e
    public void pause() {
        synchronized (this.f98650d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f98650d) {
            obj = this.f98655i;
            cls = this.f98656j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    private void onLoadFailed(a77 a77Var, int i) {
        boolean zOnLoadFailed;
        this.f98649c.throwIfRecycled();
        synchronized (this.f98650d) {
            try {
                a77Var.setOrigin(this.f98646D);
                int logLevel = this.f98654h.getLogLevel();
                if (logLevel <= i) {
                    Log.w("Glide", "Load failed for " + this.f98655i + " with size [" + this.f98643A + "x" + this.f98644B + "]", a77Var);
                    if (logLevel <= 4) {
                        a77Var.logRootCauses("Glide");
                    }
                }
                this.f98666t = null;
                this.f98669w = EnumC15215a.FAILED;
                boolean z = true;
                this.f98645C = true;
                try {
                    List<e4e<R>> list = this.f98662p;
                    if (list != null) {
                        Iterator<e4e<R>> it = list.iterator();
                        zOnLoadFailed = false;
                        while (it.hasNext()) {
                            zOnLoadFailed |= it.next().onLoadFailed(a77Var, this.f98655i, this.f98661o, isFirstReadyResource());
                        }
                    } else {
                        zOnLoadFailed = false;
                    }
                    e4e<R> e4eVar = this.f98651e;
                    if (e4eVar == null || !e4eVar.onLoadFailed(a77Var, this.f98655i, this.f98661o, isFirstReadyResource())) {
                        z = false;
                    }
                    if (!(zOnLoadFailed | z)) {
                        setErrorPlaceholder();
                    }
                    this.f98645C = false;
                    notifyLoadFailed();
                    i77.endSectionAsync(f98640E, this.f98647a);
                } catch (Throwable th) {
                    this.f98645C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @xc7("requestLock")
    private void onResourceReady(t5e<R> t5eVar, R r, hh3 hh3Var, boolean z) {
        boolean zOnResourceReady;
        boolean zIsFirstReadyResource = isFirstReadyResource();
        this.f98669w = EnumC15215a.COMPLETE;
        this.f98665s = t5eVar;
        if (this.f98654h.getLogLevel() <= 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Finished loading ");
            sb.append(r.getClass().getSimpleName());
            sb.append(" from ");
            sb.append(hh3Var);
            sb.append(" for ");
            sb.append(this.f98655i);
            sb.append(" with size [");
            sb.append(this.f98643A);
            sb.append("x");
            sb.append(this.f98644B);
            sb.append("] in ");
            sb.append(si9.getElapsedMillis(this.f98667u));
            sb.append(" ms");
        }
        boolean z2 = true;
        this.f98645C = true;
        try {
            List<e4e<R>> list = this.f98662p;
            if (list != null) {
                Iterator<e4e<R>> it = list.iterator();
                zOnResourceReady = false;
                while (it.hasNext()) {
                    zOnResourceReady |= it.next().onResourceReady(r, this.f98655i, this.f98661o, hh3Var, zIsFirstReadyResource);
                }
            } else {
                zOnResourceReady = false;
            }
            e4e<R> e4eVar = this.f98651e;
            if (e4eVar == null || !e4eVar.onResourceReady(r, this.f98655i, this.f98661o, hh3Var, zIsFirstReadyResource)) {
                z2 = false;
            }
            if (!(z2 | zOnResourceReady)) {
                this.f98661o.onResourceReady(r, this.f98663q.build(hh3Var, zIsFirstReadyResource));
            }
            this.f98645C = false;
            notifyLoadSuccess();
            i77.endSectionAsync(f98640E, this.f98647a);
        } catch (Throwable th) {
            this.f98645C = false;
            throw th;
        }
    }
}

package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import p000.una;
import p000.ya9;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class it0<T, PreloadStatusT> {

    /* JADX INFO: renamed from: a */
    public final Object f48166a = new Object();

    /* JADX INFO: renamed from: b */
    public final Comparator<T> f48167b;

    /* JADX INFO: renamed from: c */
    public final hng<T, PreloadStatusT> f48168c;

    /* JADX INFO: renamed from: d */
    public final una.InterfaceC13611a f48169d;

    /* JADX INFO: renamed from: e */
    public final ya9<w9d> f48170e;

    /* JADX INFO: renamed from: f */
    public final Map<nfa, it0<T, PreloadStatusT>.C7591b> f48171f;

    /* JADX INFO: renamed from: g */
    public final Handler f48172g;

    /* JADX INFO: renamed from: h */
    @xc7("lock")
    public final PriorityQueue<it0<T, PreloadStatusT>.C7591b> f48173h;

    /* JADX INFO: renamed from: i */
    @xc7("lock")
    @hib
    public PreloadStatusT f48174i;

    /* JADX INFO: renamed from: it0$a */
    public static abstract class AbstractC7590a<T, PreloadStatusT> {

        /* JADX INFO: renamed from: a */
        public final Comparator<T> f48175a;

        /* JADX INFO: renamed from: b */
        public final hng<T, PreloadStatusT> f48176b;

        /* JADX INFO: renamed from: c */
        public lfg<una.InterfaceC13611a> f48177c;

        public AbstractC7590a(Comparator<T> comparator, hng<T, PreloadStatusT> hngVar, lfg<una.InterfaceC13611a> lfgVar) {
            this.f48175a = comparator;
            this.f48176b = hngVar;
            this.f48177c = lfgVar;
        }

        public abstract it0<T, PreloadStatusT> build();
    }

    /* JADX INFO: renamed from: it0$b */
    public final class C7591b implements Comparable<it0<T, PreloadStatusT>.C7591b> {

        /* JADX INFO: renamed from: a */
        public final una f48178a;

        /* JADX INFO: renamed from: b */
        public final T f48179b;

        public C7591b(una unaVar, T t) {
            this.f48178a = unaVar;
            this.f48179b = t;
        }

        @Override // java.lang.Comparable
        public int compareTo(it0<T, PreloadStatusT>.C7591b c7591b) {
            return it0.this.f48167b.compare(this.f48179b, c7591b.f48179b);
        }
    }

    public it0(Comparator<T> comparator, hng<T, PreloadStatusT> hngVar, una.InterfaceC13611a interfaceC13611a) {
        Handler handlerCreateHandlerForCurrentOrMainLooper = t0i.createHandlerForCurrentOrMainLooper();
        this.f48172g = handlerCreateHandlerForCurrentOrMainLooper;
        this.f48167b = comparator;
        this.f48168c = hngVar;
        this.f48169d = interfaceC13611a;
        this.f48170e = new ya9<>(handlerCreateHandlerForCurrentOrMainLooper.getLooper(), j52.f49539a, new ya9.InterfaceC15591b() { // from class: ht0
            @Override // p000.ya9.InterfaceC15591b
            public final void invoke(Object obj, h36 h36Var) {
                it0.lambda$new$0((w9d) obj, h36Var);
            }
        });
        this.f48171f = new HashMap();
        this.f48173h = new PriorityQueue<>();
    }

    @xc7("lock")
    private boolean isPreloading(una unaVar) {
        return !this.f48173h.isEmpty() && ((C7591b) v80.checkNotNull(this.f48173h.peek())).f48178a == unaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(w9d w9dVar, h36 h36Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPreloadCompleted$1(una unaVar, w9d w9dVar) {
        w9dVar.onCompleted(unaVar.getMediaItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPreloadCompleted$2(final una unaVar) {
        this.f48170e.sendEvent(-1, new ya9.InterfaceC15590a() { // from class: ct0
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                it0.lambda$onPreloadCompleted$1(unaVar, (w9d) obj);
            }
        });
        lambda$onPreloadSkipped$5(unaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPreloadError$4(final v9d v9dVar, una unaVar) {
        this.f48170e.sendEvent(-1, new ya9.InterfaceC15590a() { // from class: dt0
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((w9d) obj).onError(v9dVar);
            }
        });
        lambda$onPreloadSkipped$5(unaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: maybeAdvanceToNextSource, reason: merged with bridge method [inline-methods] */
    public void lambda$onPreloadSkipped$5(una unaVar) {
        synchronized (this.f48166a) {
            try {
                if (isPreloading(unaVar)) {
                    do {
                        this.f48173h.poll();
                        if (this.f48173h.isEmpty()) {
                            break;
                        }
                    } while (!maybeStartPreloadNextSource());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @xc7("lock")
    private boolean maybeStartPreloadNextSource() {
        if (!m13397o()) {
            return false;
        }
        C7591b c7591b = (C7591b) v80.checkNotNull(this.f48173h.peek());
        PreloadStatusT targetPreloadStatus = this.f48168c.getTargetPreloadStatus(c7591b.f48179b);
        this.f48174i = targetPreloadStatus;
        mo9552l(c7591b.f48178a, targetPreloadStatus);
        return true;
    }

    private void verifyApplicationThread() {
        if (Looper.myLooper() != this.f48172g.getLooper()) {
            throw new IllegalStateException("Preload manager is accessed on the wrong thread.");
        }
    }

    public final void add(nfa nfaVar, T t) {
        add(this.f48169d.createMediaSource(nfaVar), t);
    }

    public void addListener(w9d w9dVar) {
        this.f48170e.add(w9dVar);
    }

    public void clearListeners() {
        verifyApplicationThread();
        this.f48170e.clear();
    }

    public una createMediaSourceForPreloading(una unaVar) {
        return unaVar;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo9551g(una unaVar);

    @hib
    public final una getMediaSource(nfa nfaVar) {
        if (this.f48171f.containsKey(nfaVar)) {
            return this.f48171f.get(nfaVar).f48178a;
        }
        return null;
    }

    public final int getSourceCount() {
        return this.f48171f.size();
    }

    @hib
    /* JADX INFO: renamed from: h */
    public final PreloadStatusT m13393h(una unaVar) {
        synchronized (this.f48166a) {
            try {
                if (!isPreloading(unaVar)) {
                    return null;
                }
                return this.f48174i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m13394i(final una unaVar) {
        synchronized (this.f48166a) {
            try {
                if (isPreloading(unaVar)) {
                    this.f48172g.post(new Runnable() { // from class: et0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f33991a.lambda$onPreloadCompleted$2(unaVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void invalidate() {
        synchronized (this.f48166a) {
            try {
                this.f48173h.clear();
                this.f48173h.addAll(this.f48171f.values());
                while (!this.f48173h.isEmpty() && !maybeStartPreloadNextSource()) {
                    this.f48173h.poll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m13395j(final v9d v9dVar, final una unaVar) {
        synchronized (this.f48166a) {
            try {
                if (isPreloading(unaVar)) {
                    this.f48172g.post(new Runnable() { // from class: gt0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f40956a.lambda$onPreloadError$4(v9dVar, unaVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m13396k(final una unaVar) {
        synchronized (this.f48166a) {
            try {
                if (isPreloading(unaVar)) {
                    t0i.postOrRun(this.f48172g, new Runnable() { // from class: ft0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37651a.lambda$onPreloadSkipped$5(unaVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo9552l(una unaVar, @hib PreloadStatusT preloadstatust);

    /* JADX INFO: renamed from: m */
    public void mo9553m() {
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo9554n(una unaVar);

    /* JADX INFO: renamed from: o */
    public boolean m13397o() {
        return true;
    }

    public final void release() {
        reset();
        mo9553m();
        clearListeners();
    }

    public final boolean remove(nfa nfaVar) {
        if (!this.f48171f.containsKey(nfaVar)) {
            return false;
        }
        una unaVar = this.f48171f.get(nfaVar).f48178a;
        this.f48171f.remove(nfaVar);
        mo9554n(unaVar);
        return true;
    }

    public void removeListener(w9d w9dVar) {
        verifyApplicationThread();
        this.f48170e.remove(w9dVar);
    }

    public final void reset() {
        Iterator<it0<T, PreloadStatusT>.C7591b> it = this.f48171f.values().iterator();
        while (it.hasNext()) {
            mo9554n(it.next().f48178a);
        }
        this.f48171f.clear();
        synchronized (this.f48166a) {
            this.f48173h.clear();
            this.f48174i = null;
        }
    }

    public final void add(una unaVar, T t) {
        una unaVarCreateMediaSourceForPreloading = createMediaSourceForPreloading(unaVar);
        this.f48171f.put(unaVarCreateMediaSourceForPreloading.getMediaItem(), new C7591b(unaVarCreateMediaSourceForPreloading, t));
    }

    public final boolean remove(una unaVar) {
        nfa mediaItem = unaVar.getMediaItem();
        if (!this.f48171f.containsKey(mediaItem) || unaVar != this.f48171f.get(mediaItem).f48178a) {
            return false;
        }
        this.f48171f.remove(mediaItem);
        mo9554n(unaVar);
        return true;
    }
}

package p000;

import android.util.Pair;
import com.google.android.exoplayer2.drm.InterfaceC3005e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.sbf;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ppa {

    /* JADX INFO: renamed from: m */
    public static final String f71586m = "MediaSourceList";

    /* JADX INFO: renamed from: a */
    public final k0d f71587a;

    /* JADX INFO: renamed from: e */
    public final InterfaceC11066d f71591e;

    /* JADX INFO: renamed from: h */
    public final InterfaceC12162rn f71594h;

    /* JADX INFO: renamed from: i */
    public final pe7 f71595i;

    /* JADX INFO: renamed from: k */
    public boolean f71597k;

    /* JADX INFO: renamed from: l */
    @hib
    public pdh f71598l;

    /* JADX INFO: renamed from: j */
    public sbf f71596j = new sbf.C12510a(0);

    /* JADX INFO: renamed from: c */
    public final IdentityHashMap<nja, C11065c> f71589c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d */
    public final Map<Object, C11065c> f71590d = new HashMap();

    /* JADX INFO: renamed from: b */
    public final List<C11065c> f71588b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final HashMap<C11065c, C11064b> f71592f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public final Set<C11065c> f71593g = new HashSet();

    /* JADX INFO: renamed from: ppa$a */
    public final class C11063a implements koa, InterfaceC3005e {

        /* JADX INFO: renamed from: a */
        public final C11065c f71599a;

        public C11063a(C11065c c11065c) {
            this.f71599a = c11065c;
        }

        @hib
        private Pair<Integer, vna.C14175b> getEventParameters(int i, @hib vna.C14175b c14175b) {
            vna.C14175b c14175b2 = null;
            if (c14175b != null) {
                vna.C14175b mediaPeriodIdForChildMediaPeriodId = ppa.getMediaPeriodIdForChildMediaPeriodId(this.f71599a, c14175b);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return null;
                }
                c14175b2 = mediaPeriodIdForChildMediaPeriodId;
            }
            return Pair.create(Integer.valueOf(ppa.getWindowIndexForChildWindowIndex(this.f71599a, i)), c14175b2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownstreamFormatChanged$5(Pair pair, ega egaVar) {
            ppa.this.f71594h.onDownstreamFormatChanged(((Integer) pair.first).intValue(), (vna.C14175b) pair.second, egaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmKeysLoaded$7(Pair pair) {
            ppa.this.f71594h.onDrmKeysLoaded(((Integer) pair.first).intValue(), (vna.C14175b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmKeysRemoved$10(Pair pair) {
            ppa.this.f71594h.onDrmKeysRemoved(((Integer) pair.first).intValue(), (vna.C14175b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmKeysRestored$9(Pair pair) {
            ppa.this.f71594h.onDrmKeysRestored(((Integer) pair.first).intValue(), (vna.C14175b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmSessionAcquired$6(Pair pair, int i) {
            ppa.this.f71594h.onDrmSessionAcquired(((Integer) pair.first).intValue(), (vna.C14175b) pair.second, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmSessionManagerError$8(Pair pair, Exception exc) {
            ppa.this.f71594h.onDrmSessionManagerError(((Integer) pair.first).intValue(), (vna.C14175b) pair.second, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrmSessionReleased$11(Pair pair) {
            ppa.this.f71594h.onDrmSessionReleased(((Integer) pair.first).intValue(), (vna.C14175b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadCanceled$2(Pair pair, jc9 jc9Var, ega egaVar) {
            ppa.this.f71594h.onLoadCanceled(((Integer) pair.first).intValue(), (vna.C14175b) pair.second, jc9Var, egaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadCompleted$1(Pair pair, jc9 jc9Var, ega egaVar) {
            ppa.this.f71594h.onLoadCompleted(((Integer) pair.first).intValue(), (vna.C14175b) pair.second, jc9Var, egaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadError$3(Pair pair, jc9 jc9Var, ega egaVar, IOException iOException, boolean z) {
            ppa.this.f71594h.onLoadError(((Integer) pair.first).intValue(), (vna.C14175b) pair.second, jc9Var, egaVar, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadStarted$0(Pair pair, jc9 jc9Var, ega egaVar) {
            ppa.this.f71594h.onLoadStarted(((Integer) pair.first).intValue(), (vna.C14175b) pair.second, jc9Var, egaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUpstreamDiscarded$4(Pair pair, ega egaVar) {
            ppa.this.f71594h.onUpstreamDiscarded(((Integer) pair.first).intValue(), (vna.C14175b) u80.checkNotNull((vna.C14175b) pair.second), egaVar);
        }

        @Override // p000.koa
        public void onDownstreamFormatChanged(int i, @hib vna.C14175b c14175b, final ega egaVar) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: zoa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f105601a.lambda$onDownstreamFormatChanged$5(eventParameters, egaVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmKeysLoaded(int i, @hib vna.C14175b c14175b) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: voa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f91839a.lambda$onDrmKeysLoaded$7(eventParameters);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmKeysRemoved(int i, @hib vna.C14175b c14175b) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: fpa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37359a.lambda$onDrmKeysRemoved$10(eventParameters);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmKeysRestored(int i, @hib vna.C14175b c14175b) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: xoa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f98796a.lambda$onDrmKeysRestored$9(eventParameters);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmSessionAcquired(int i, @hib vna.C14175b c14175b, final int i2) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: jpa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51411a.lambda$onDrmSessionAcquired$6(eventParameters, i2);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmSessionManagerError(int i, @hib vna.C14175b c14175b, final Exception exc) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: dpa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30330a.lambda$onDrmSessionManagerError$8(eventParameters, exc);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
        public void onDrmSessionReleased(int i, @hib vna.C14175b c14175b) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: bpa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14388a.lambda$onDrmSessionReleased$11(eventParameters);
                    }
                });
            }
        }

        @Override // p000.koa
        public void onLoadCanceled(int i, @hib vna.C14175b c14175b, final jc9 jc9Var, final ega egaVar) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: lpa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f58405a.lambda$onLoadCanceled$2(eventParameters, jc9Var, egaVar);
                    }
                });
            }
        }

        @Override // p000.koa
        public void onLoadCompleted(int i, @hib vna.C14175b c14175b, final jc9 jc9Var, final ega egaVar) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: roa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f78863a.lambda$onLoadCompleted$1(eventParameters, jc9Var, egaVar);
                    }
                });
            }
        }

        @Override // p000.koa
        public void onLoadError(int i, @hib vna.C14175b c14175b, final jc9 jc9Var, final ega egaVar, final IOException iOException, final boolean z) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: npa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65196a.lambda$onLoadError$3(eventParameters, jc9Var, egaVar, iOException, z);
                    }
                });
            }
        }

        @Override // p000.koa
        public void onLoadStarted(int i, @hib vna.C14175b c14175b, final jc9 jc9Var, final ega egaVar) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: hpa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44433a.lambda$onLoadStarted$0(eventParameters, jc9Var, egaVar);
                    }
                });
            }
        }

        @Override // p000.koa
        public void onUpstreamDiscarded(int i, @hib vna.C14175b c14175b, final ega egaVar) {
            final Pair<Integer, vna.C14175b> eventParameters = getEventParameters(i, c14175b);
            if (eventParameters != null) {
                ppa.this.f71595i.post(new Runnable() { // from class: toa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85510a.lambda$onUpstreamDiscarded$4(eventParameters, egaVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ppa$b */
    public static final class C11064b {

        /* JADX INFO: renamed from: a */
        public final vna f71601a;

        /* JADX INFO: renamed from: b */
        public final vna.InterfaceC14176c f71602b;

        /* JADX INFO: renamed from: c */
        public final C11063a f71603c;

        public C11064b(vna vnaVar, vna.InterfaceC14176c interfaceC14176c, C11063a c11063a) {
            this.f71601a = vnaVar;
            this.f71602b = interfaceC14176c;
            this.f71603c = c11063a;
        }
    }

    /* JADX INFO: renamed from: ppa$c */
    public static final class C11065c implements noa {

        /* JADX INFO: renamed from: a */
        public final rv9 f71604a;

        /* JADX INFO: renamed from: d */
        public int f71607d;

        /* JADX INFO: renamed from: e */
        public boolean f71608e;

        /* JADX INFO: renamed from: c */
        public final List<vna.C14175b> f71606c = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Object f71605b = new Object();

        public C11065c(vna vnaVar, boolean z) {
            this.f71604a = new rv9(vnaVar, z);
        }

        @Override // p000.noa
        public t1h getTimeline() {
            return this.f71604a.getTimeline();
        }

        @Override // p000.noa
        public Object getUid() {
            return this.f71605b;
        }

        public void reset(int i) {
            this.f71607d = i;
            this.f71608e = false;
            this.f71606c.clear();
        }
    }

    /* JADX INFO: renamed from: ppa$d */
    public interface InterfaceC11066d {
        void onPlaylistUpdateRequested();
    }

    public ppa(InterfaceC11066d interfaceC11066d, InterfaceC12162rn interfaceC12162rn, pe7 pe7Var, k0d k0dVar) {
        this.f71587a = k0dVar;
        this.f71591e = interfaceC11066d;
        this.f71594h = interfaceC12162rn;
        this.f71595i = pe7Var;
    }

    private void correctOffsets(int i, int i2) {
        while (i < this.f71588b.size()) {
            this.f71588b.get(i).f71607d += i2;
            i++;
        }
    }

    private void disableChildSource(C11065c c11065c) {
        C11064b c11064b = this.f71592f.get(c11065c);
        if (c11064b != null) {
            c11064b.f71601a.disable(c11064b.f71602b);
        }
    }

    private void disableUnusedMediaSources() {
        Iterator<C11065c> it = this.f71593g.iterator();
        while (it.hasNext()) {
            C11065c next = it.next();
            if (next.f71606c.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private void enableMediaSource(C11065c c11065c) {
        this.f71593g.add(c11065c);
        C11064b c11064b = this.f71592f.get(c11065c);
        if (c11064b != null) {
            c11064b.f71601a.enable(c11064b.f71602b);
        }
    }

    private static Object getChildPeriodUid(Object obj) {
        return AbstractC11774r0.getChildPeriodUidFromConcatenatedUid(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hib
    public static vna.C14175b getMediaPeriodIdForChildMediaPeriodId(C11065c c11065c, vna.C14175b c14175b) {
        for (int i = 0; i < c11065c.f71606c.size(); i++) {
            if (c11065c.f71606c.get(i).f71109d == c14175b.f71109d) {
                return c14175b.copyWithPeriodUid(getPeriodUid(c11065c, c14175b.f71106a));
            }
        }
        return null;
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return AbstractC11774r0.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object getPeriodUid(C11065c c11065c, Object obj) {
        return AbstractC11774r0.getConcatenatedUid(c11065c.f71605b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getWindowIndexForChildWindowIndex(C11065c c11065c, int i) {
        return i + c11065c.f71607d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareChildSource$0(vna vnaVar, t1h t1hVar) {
        this.f71591e.onPlaylistUpdateRequested();
    }

    private void maybeReleaseChildSource(C11065c c11065c) {
        if (c11065c.f71608e && c11065c.f71606c.isEmpty()) {
            C11064b c11064b = (C11064b) u80.checkNotNull(this.f71592f.remove(c11065c));
            c11064b.f71601a.releaseSource(c11064b.f71602b);
            c11064b.f71601a.removeEventListener(c11064b.f71603c);
            c11064b.f71601a.removeDrmEventListener(c11064b.f71603c);
            this.f71593g.remove(c11065c);
        }
    }

    private void prepareChildSource(C11065c c11065c) {
        rv9 rv9Var = c11065c.f71604a;
        vna.InterfaceC14176c interfaceC14176c = new vna.InterfaceC14176c() { // from class: poa
            @Override // p000.vna.InterfaceC14176c
            public final void onSourceInfoRefreshed(vna vnaVar, t1h t1hVar) {
                this.f71549a.lambda$prepareChildSource$0(vnaVar, t1hVar);
            }
        };
        C11063a c11063a = new C11063a(c11065c);
        this.f71592f.put(c11065c, new C11064b(rv9Var, interfaceC14176c, c11063a));
        rv9Var.addEventListener(x0i.createHandlerForCurrentOrMainLooper(), c11063a);
        rv9Var.addDrmEventListener(x0i.createHandlerForCurrentOrMainLooper(), c11063a);
        rv9Var.prepareSource(interfaceC14176c, this.f71598l, this.f71587a);
    }

    private void removeMediaSourcesInternal(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            C11065c c11065cRemove = this.f71588b.remove(i3);
            this.f71590d.remove(c11065cRemove.f71605b);
            correctOffsets(i3, -c11065cRemove.f71604a.getTimeline().getWindowCount());
            c11065cRemove.f71608e = true;
            if (this.f71597k) {
                maybeReleaseChildSource(c11065cRemove);
            }
        }
    }

    public t1h addMediaSources(int i, List<C11065c> list, sbf sbfVar) {
        if (!list.isEmpty()) {
            this.f71596j = sbfVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C11065c c11065c = list.get(i2 - i);
                if (i2 > 0) {
                    C11065c c11065c2 = this.f71588b.get(i2 - 1);
                    c11065c.reset(c11065c2.f71607d + c11065c2.f71604a.getTimeline().getWindowCount());
                } else {
                    c11065c.reset(0);
                }
                correctOffsets(i2, c11065c.f71604a.getTimeline().getWindowCount());
                this.f71588b.add(i2, c11065c);
                this.f71590d.put(c11065c.f71605b, c11065c);
                if (this.f71597k) {
                    prepareChildSource(c11065c);
                    if (this.f71589c.isEmpty()) {
                        this.f71593g.add(c11065c);
                    } else {
                        disableChildSource(c11065c);
                    }
                }
            }
        }
        return createTimeline();
    }

    public t1h clear(@hib sbf sbfVar) {
        if (sbfVar == null) {
            sbfVar = this.f71596j.cloneAndClear();
        }
        this.f71596j = sbfVar;
        removeMediaSourcesInternal(0, getSize());
        return createTimeline();
    }

    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(c14175b.f71106a);
        vna.C14175b c14175bCopyWithPeriodUid = c14175b.copyWithPeriodUid(getChildPeriodUid(c14175b.f71106a));
        C11065c c11065c = (C11065c) u80.checkNotNull(this.f71590d.get(mediaSourceHolderUid));
        enableMediaSource(c11065c);
        c11065c.f71606c.add(c14175bCopyWithPeriodUid);
        pv9 pv9VarCreatePeriod = c11065c.f71604a.createPeriod(c14175bCopyWithPeriodUid, interfaceC6430gn, j);
        this.f71589c.put(pv9VarCreatePeriod, c11065c);
        disableUnusedMediaSources();
        return pv9VarCreatePeriod;
    }

    public t1h createTimeline() {
        if (this.f71588b.isEmpty()) {
            return t1h.f83385a;
        }
        int windowCount = 0;
        for (int i = 0; i < this.f71588b.size(); i++) {
            C11065c c11065c = this.f71588b.get(i);
            c11065c.f71607d = windowCount;
            windowCount += c11065c.f71604a.getTimeline().getWindowCount();
        }
        return new a1d(this.f71588b, this.f71596j);
    }

    public sbf getShuffleOrder() {
        return this.f71596j;
    }

    public int getSize() {
        return this.f71588b.size();
    }

    public boolean isPrepared() {
        return this.f71597k;
    }

    public t1h moveMediaSource(int i, int i2, sbf sbfVar) {
        return moveMediaSourceRange(i, i + 1, i2, sbfVar);
    }

    public t1h moveMediaSourceRange(int i, int i2, int i3, sbf sbfVar) {
        u80.checkArgument(i >= 0 && i <= i2 && i2 <= getSize() && i3 >= 0);
        this.f71596j = sbfVar;
        if (i == i2 || i == i3) {
            return createTimeline();
        }
        int iMin = Math.min(i, i3);
        int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int windowCount = this.f71588b.get(iMin).f71607d;
        x0i.moveItems(this.f71588b, i, i2, i3);
        while (iMin <= iMax) {
            C11065c c11065c = this.f71588b.get(iMin);
            c11065c.f71607d = windowCount;
            windowCount += c11065c.f71604a.getTimeline().getWindowCount();
            iMin++;
        }
        return createTimeline();
    }

    public void prepare(@hib pdh pdhVar) {
        u80.checkState(!this.f71597k);
        this.f71598l = pdhVar;
        for (int i = 0; i < this.f71588b.size(); i++) {
            C11065c c11065c = this.f71588b.get(i);
            prepareChildSource(c11065c);
            this.f71593g.add(c11065c);
        }
        this.f71597k = true;
    }

    public void release() {
        for (C11064b c11064b : this.f71592f.values()) {
            try {
                c11064b.f71601a.releaseSource(c11064b.f71602b);
            } catch (RuntimeException e) {
                yh9.m25916e("MediaSourceList", "Failed to release child source.", e);
            }
            c11064b.f71601a.removeEventListener(c11064b.f71603c);
            c11064b.f71601a.removeDrmEventListener(c11064b.f71603c);
        }
        this.f71592f.clear();
        this.f71593g.clear();
        this.f71597k = false;
    }

    public void releasePeriod(nja njaVar) {
        C11065c c11065c = (C11065c) u80.checkNotNull(this.f71589c.remove(njaVar));
        c11065c.f71604a.releasePeriod(njaVar);
        c11065c.f71606c.remove(((pv9) njaVar).f72216a);
        if (!this.f71589c.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(c11065c);
    }

    public t1h removeMediaSourceRange(int i, int i2, sbf sbfVar) {
        u80.checkArgument(i >= 0 && i <= i2 && i2 <= getSize());
        this.f71596j = sbfVar;
        removeMediaSourcesInternal(i, i2);
        return createTimeline();
    }

    public t1h setMediaSources(List<C11065c> list, sbf sbfVar) {
        removeMediaSourcesInternal(0, this.f71588b.size());
        return addMediaSources(this.f71588b.size(), list, sbfVar);
    }

    public t1h setShuffleOrder(sbf sbfVar) {
        int size = getSize();
        if (sbfVar.getLength() != size) {
            sbfVar = sbfVar.cloneAndClear().cloneAndInsert(0, size);
        }
        this.f71596j = sbfVar;
        return createTimeline();
    }
}

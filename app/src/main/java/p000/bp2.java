package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.aga;
import p000.sbf;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class bp2 extends vm2<C1974e> {

    /* JADX INFO: renamed from: c2 */
    public static final int f14324c2 = 0;

    /* JADX INFO: renamed from: d2 */
    public static final int f14325d2 = 1;

    /* JADX INFO: renamed from: e2 */
    public static final int f14326e2 = 2;

    /* JADX INFO: renamed from: f2 */
    public static final int f14327f2 = 3;

    /* JADX INFO: renamed from: g2 */
    public static final int f14328g2 = 4;

    /* JADX INFO: renamed from: h2 */
    public static final int f14329h2 = 5;

    /* JADX INFO: renamed from: i2 */
    public static final aga f14330i2 = new aga.C0235c().setUri(Uri.EMPTY).build();

    /* JADX INFO: renamed from: L */
    @xc7("this")
    public final List<C1974e> f14331L;

    /* JADX INFO: renamed from: M */
    @xc7("this")
    public final Set<C1973d> f14332M;

    /* JADX INFO: renamed from: M1 */
    public final boolean f14333M1;

    /* JADX INFO: renamed from: N */
    @xc7("this")
    @hib
    public Handler f14334N;

    /* JADX INFO: renamed from: Q */
    public final List<C1974e> f14335Q;

    /* JADX INFO: renamed from: V1 */
    public final boolean f14336V1;

    /* JADX INFO: renamed from: X */
    public final IdentityHashMap<nja, C1974e> f14337X;

    /* JADX INFO: renamed from: Y */
    public final Map<Object, C1974e> f14338Y;

    /* JADX INFO: renamed from: Z */
    public final Set<C1974e> f14339Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f14340Z1;

    /* JADX INFO: renamed from: a2 */
    public Set<C1973d> f14341a2;

    /* JADX INFO: renamed from: b2 */
    public sbf f14342b2;

    /* JADX INFO: renamed from: bp2$b */
    public static final class C1971b extends AbstractC11774r0 {

        /* JADX INFO: renamed from: F */
        public final int f14343F;

        /* JADX INFO: renamed from: H */
        public final int f14344H;

        /* JADX INFO: renamed from: L */
        public final int[] f14345L;

        /* JADX INFO: renamed from: M */
        public final int[] f14346M;

        /* JADX INFO: renamed from: N */
        public final t1h[] f14347N;

        /* JADX INFO: renamed from: Q */
        public final Object[] f14348Q;

        /* JADX INFO: renamed from: X */
        public final HashMap<Object, Integer> f14349X;

        public C1971b(Collection<C1974e> collection, sbf sbfVar, boolean z) {
            super(z, sbfVar);
            int size = collection.size();
            this.f14345L = new int[size];
            this.f14346M = new int[size];
            this.f14347N = new t1h[size];
            this.f14348Q = new Object[size];
            this.f14349X = new HashMap<>();
            int windowCount = 0;
            int periodCount = 0;
            int i = 0;
            for (C1974e c1974e : collection) {
                this.f14347N[i] = c1974e.f14352a.getTimeline();
                this.f14346M[i] = windowCount;
                this.f14345L[i] = periodCount;
                windowCount += this.f14347N[i].getWindowCount();
                periodCount += this.f14347N[i].getPeriodCount();
                Object[] objArr = this.f14348Q;
                Object obj = c1974e.f14353b;
                objArr[i] = obj;
                this.f14349X.put(obj, Integer.valueOf(i));
                i++;
            }
            this.f14343F = windowCount;
            this.f14344H = periodCount;
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: b */
        public int mo18b(Object obj) {
            Integer num = this.f14349X.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: c */
        public int mo19c(int i) {
            return x0i.binarySearchFloor(this.f14346M, i + 1, false, false);
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: d */
        public Object mo20d(int i) {
            return this.f14348Q[i];
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: e */
        public int mo21e(int i) {
            return this.f14345L[i];
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: f */
        public int mo22f(int i) {
            return this.f14346M[i];
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: g */
        public t1h mo23g(int i) {
            return this.f14347N[i];
        }

        @Override // p000.AbstractC11774r0
        public int getChildIndexByPeriodIndex(int i) {
            return x0i.binarySearchFloor(this.f14345L, i + 1, false, false);
        }

        @Override // p000.t1h
        public int getPeriodCount() {
            return this.f14344H;
        }

        @Override // p000.t1h
        public int getWindowCount() {
            return this.f14343F;
        }
    }

    /* JADX INFO: renamed from: bp2$c */
    public static final class C1972c extends es0 {
        private C1972c() {
        }

        @Override // p000.vna
        public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.vna
        public aga getMediaItem() {
            return bp2.f14330i2;
        }

        @Override // p000.es0
        /* JADX INFO: renamed from: k */
        public void mo2648k(@hib pdh pdhVar) {
        }

        @Override // p000.vna
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // p000.vna
        public void releasePeriod(nja njaVar) {
        }

        @Override // p000.es0
        public void releaseSourceInternal() {
        }
    }

    /* JADX INFO: renamed from: bp2$d */
    public static final class C1973d {

        /* JADX INFO: renamed from: a */
        public final Handler f14350a;

        /* JADX INFO: renamed from: b */
        public final Runnable f14351b;

        public C1973d(Handler handler, Runnable runnable) {
            this.f14350a = handler;
            this.f14351b = runnable;
        }

        public void dispatch() {
            this.f14350a.post(this.f14351b);
        }
    }

    /* JADX INFO: renamed from: bp2$e */
    public static final class C1974e {

        /* JADX INFO: renamed from: a */
        public final rv9 f14352a;

        /* JADX INFO: renamed from: d */
        public int f14355d;

        /* JADX INFO: renamed from: e */
        public int f14356e;

        /* JADX INFO: renamed from: f */
        public boolean f14357f;

        /* JADX INFO: renamed from: c */
        public final List<vna.C14175b> f14354c = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Object f14353b = new Object();

        public C1974e(vna vnaVar, boolean z) {
            this.f14352a = new rv9(vnaVar, z);
        }

        public void reset(int i, int i2) {
            this.f14355d = i;
            this.f14356e = i2;
            this.f14357f = false;
            this.f14354c.clear();
        }
    }

    /* JADX INFO: renamed from: bp2$f */
    public static final class C1975f<T> {

        /* JADX INFO: renamed from: a */
        public final int f14358a;

        /* JADX INFO: renamed from: b */
        public final T f14359b;

        /* JADX INFO: renamed from: c */
        @hib
        public final C1973d f14360c;

        public C1975f(int i, T t, @hib C1973d c1973d) {
            this.f14358a = i;
            this.f14359b = t;
            this.f14360c = c1973d;
        }
    }

    public bp2(vna... vnaVarArr) {
        this(false, vnaVarArr);
    }

    private void addMediaSourceInternal(int i, C1974e c1974e) {
        if (i > 0) {
            C1974e c1974e2 = this.f14335Q.get(i - 1);
            c1974e.reset(i, c1974e2.f14356e + c1974e2.f14352a.getTimeline().getWindowCount());
        } else {
            c1974e.reset(i, 0);
        }
        correctOffsets(i, 1, c1974e.f14352a.getTimeline().getWindowCount());
        this.f14335Q.add(i, c1974e);
        this.f14338Y.put(c1974e.f14353b, c1974e);
        m24067t(c1974e, c1974e.f14352a);
        if (m10219j() && this.f14337X.isEmpty()) {
            this.f14339Z.add(c1974e);
        } else {
            m24065n(c1974e);
        }
    }

    private void addMediaSourcesInternal(int i, Collection<C1974e> collection) {
        Iterator<C1974e> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i, it.next());
            i++;
        }
    }

    @xc7("this")
    private void addPublicMediaSources(int i, Collection<vna> collection, @hib Handler handler, @hib Runnable runnable) {
        u80.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.f14334N;
        Iterator<vna> it = collection.iterator();
        while (it.hasNext()) {
            u80.checkNotNull(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<vna> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1974e(it2.next(), this.f14336V1));
        }
        this.f14331L.addAll(i, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new C1975f(i, arrayList, createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void correctOffsets(int i, int i2, int i3) {
        while (i < this.f14335Q.size()) {
            C1974e c1974e = this.f14335Q.get(i);
            c1974e.f14355d += i2;
            c1974e.f14356e += i3;
            i++;
        }
    }

    @xc7("this")
    @hib
    private C1973d createOnCompletionAction(@hib Handler handler, @hib Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C1973d c1973d = new C1973d(handler, runnable);
        this.f14332M.add(c1973d);
        return c1973d;
    }

    private void disableUnusedMediaSources() {
        Iterator<C1974e> it = this.f14339Z.iterator();
        while (it.hasNext()) {
            C1974e next = it.next();
            if (next.f14354c.isEmpty()) {
                m24065n(next);
                it.remove();
            }
        }
    }

    private synchronized void dispatchOnCompletionActions(Set<C1973d> set) {
        try {
            Iterator<C1973d> it = set.iterator();
            while (it.hasNext()) {
                it.next().dispatch();
            }
            this.f14332M.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void enableMediaSource(C1974e c1974e) {
        this.f14339Z.add(c1974e);
        m24066o(c1974e);
    }

    private static Object getChildPeriodUid(Object obj) {
        return AbstractC11774r0.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return AbstractC11774r0.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object getPeriodUid(C1974e c1974e, Object obj) {
        return AbstractC11774r0.getConcatenatedUid(c1974e.f14353b, obj);
    }

    private Handler getPlaybackThreadHandlerOnPlaybackThread() {
        return (Handler) u80.checkNotNull(this.f14334N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            C1975f c1975f = (C1975f) x0i.castNonNull(message.obj);
            this.f14342b2 = this.f14342b2.cloneAndInsert(c1975f.f14358a, ((Collection) c1975f.f14359b).size());
            addMediaSourcesInternal(c1975f.f14358a, (Collection) c1975f.f14359b);
            scheduleTimelineUpdate(c1975f.f14360c);
        } else if (i == 1) {
            C1975f c1975f2 = (C1975f) x0i.castNonNull(message.obj);
            int i2 = c1975f2.f14358a;
            int iIntValue = ((Integer) c1975f2.f14359b).intValue();
            if (i2 == 0 && iIntValue == this.f14342b2.getLength()) {
                this.f14342b2 = this.f14342b2.cloneAndClear();
            } else {
                this.f14342b2 = this.f14342b2.cloneAndRemove(i2, iIntValue);
            }
            for (int i3 = iIntValue - 1; i3 >= i2; i3--) {
                removeMediaSourceInternal(i3);
            }
            scheduleTimelineUpdate(c1975f2.f14360c);
        } else if (i == 2) {
            C1975f c1975f3 = (C1975f) x0i.castNonNull(message.obj);
            sbf sbfVar = this.f14342b2;
            int i4 = c1975f3.f14358a;
            sbf sbfVarCloneAndRemove = sbfVar.cloneAndRemove(i4, i4 + 1);
            this.f14342b2 = sbfVarCloneAndRemove;
            this.f14342b2 = sbfVarCloneAndRemove.cloneAndInsert(((Integer) c1975f3.f14359b).intValue(), 1);
            moveMediaSourceInternal(c1975f3.f14358a, ((Integer) c1975f3.f14359b).intValue());
            scheduleTimelineUpdate(c1975f3.f14360c);
        } else if (i == 3) {
            C1975f c1975f4 = (C1975f) x0i.castNonNull(message.obj);
            this.f14342b2 = (sbf) c1975f4.f14359b;
            scheduleTimelineUpdate(c1975f4.f14360c);
        } else if (i == 4) {
            updateTimelineAndScheduleOnCompletionActions();
        } else {
            if (i != 5) {
                throw new IllegalStateException();
            }
            dispatchOnCompletionActions((Set) x0i.castNonNull(message.obj));
        }
        return true;
    }

    private void maybeReleaseChildSource(C1974e c1974e) {
        if (c1974e.f14357f && c1974e.f14354c.isEmpty()) {
            this.f14339Z.remove(c1974e);
            m24068u(c1974e);
        }
    }

    private void moveMediaSourceInternal(int i, int i2) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int windowCount = this.f14335Q.get(iMin).f14356e;
        List<C1974e> list = this.f14335Q;
        list.add(i2, list.remove(i));
        while (iMin <= iMax) {
            C1974e c1974e = this.f14335Q.get(iMin);
            c1974e.f14355d = iMin;
            c1974e.f14356e = windowCount;
            windowCount += c1974e.f14352a.getTimeline().getWindowCount();
            iMin++;
        }
    }

    @xc7("this")
    private void movePublicMediaSource(int i, int i2, @hib Handler handler, @hib Runnable runnable) {
        u80.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.f14334N;
        List<C1974e> list = this.f14331L;
        list.add(i2, list.remove(i));
        if (handler2 != null) {
            handler2.obtainMessage(2, new C1975f(i, Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void removeMediaSourceInternal(int i) {
        C1974e c1974eRemove = this.f14335Q.remove(i);
        this.f14338Y.remove(c1974eRemove.f14353b);
        correctOffsets(i, -1, -c1974eRemove.f14352a.getTimeline().getWindowCount());
        c1974eRemove.f14357f = true;
        maybeReleaseChildSource(c1974eRemove);
    }

    @xc7("this")
    private void removePublicMediaSources(int i, int i2, @hib Handler handler, @hib Runnable runnable) {
        u80.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.f14334N;
        x0i.removeRange(this.f14331L, i, i2);
        if (handler2 != null) {
            handler2.obtainMessage(1, new C1975f(i, Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void scheduleTimelineUpdate() {
        scheduleTimelineUpdate(null);
    }

    @xc7("this")
    private void setPublicShuffleOrder(sbf sbfVar, @hib Handler handler, @hib Runnable runnable) {
        u80.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.f14334N;
        if (handler2 != null) {
            int size = getSize();
            if (sbfVar.getLength() != size) {
                sbfVar = sbfVar.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(3, new C1975f(0, sbfVar, createOnCompletionAction(handler, runnable))).sendToTarget();
            return;
        }
        if (sbfVar.getLength() > 0) {
            sbfVar = sbfVar.cloneAndClear();
        }
        this.f14342b2 = sbfVar;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private void updateMediaSourceInternal(C1974e c1974e, t1h t1hVar) {
        if (c1974e.f14355d + 1 < this.f14335Q.size()) {
            int windowCount = t1hVar.getWindowCount() - (this.f14335Q.get(c1974e.f14355d + 1).f14356e - c1974e.f14356e);
            if (windowCount != 0) {
                correctOffsets(c1974e.f14355d + 1, 0, windowCount);
            }
        }
        scheduleTimelineUpdate();
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
        this.f14340Z1 = false;
        Set<C1973d> set = this.f14341a2;
        this.f14341a2 = new HashSet();
        m10220l(new C1971b(this.f14335Q, this.f14342b2, this.f14333M1));
        getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(5, set).sendToTarget();
    }

    public synchronized void addMediaSource(vna vnaVar) {
        addMediaSource(this.f14331L.size(), vnaVar);
    }

    public synchronized void addMediaSources(Collection<vna> collection) {
        addPublicMediaSources(this.f14331L.size(), collection, null, null);
    }

    public synchronized void clear() {
        removeMediaSourceRange(0, getSize());
    }

    @Override // p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(c14175b.f71106a);
        vna.C14175b c14175bCopyWithPeriodUid = c14175b.copyWithPeriodUid(getChildPeriodUid(c14175b.f71106a));
        C1974e c1974e = this.f14338Y.get(mediaSourceHolderUid);
        if (c1974e == null) {
            c1974e = new C1974e(new C1972c(), this.f14336V1);
            c1974e.f14357f = true;
            m24067t(c1974e, c1974e.f14352a);
        }
        enableMediaSource(c1974e);
        c1974e.f14354c.add(c14175bCopyWithPeriodUid);
        pv9 pv9VarCreatePeriod = c1974e.f14352a.createPeriod(c14175bCopyWithPeriodUid, interfaceC6430gn, j);
        this.f14337X.put(pv9VarCreatePeriod, c1974e);
        disableUnusedMediaSources();
        return pv9VarCreatePeriod;
    }

    @Override // p000.vm2, p000.es0
    /* JADX INFO: renamed from: g */
    public void mo3296g() {
        super.mo3296g();
        this.f14339Z.clear();
    }

    @Override // p000.vna
    public synchronized t1h getInitialTimeline() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new C1971b(this.f14331L, this.f14342b2.getLength() != this.f14331L.size() ? this.f14342b2.cloneAndClear().cloneAndInsert(0, this.f14331L.size()) : this.f14342b2, this.f14333M1);
    }

    @Override // p000.vna
    public aga getMediaItem() {
        return f14330i2;
    }

    public synchronized vna getMediaSource(int i) {
        return this.f14331L.get(i).f14352a;
    }

    public synchronized int getSize() {
        return this.f14331L.size();
    }

    @Override // p000.vm2, p000.es0
    /* JADX INFO: renamed from: h */
    public void mo3297h() {
    }

    @Override // p000.vna
    public boolean isSingleWindow() {
        return false;
    }

    @Override // p000.vm2, p000.es0
    /* JADX INFO: renamed from: k */
    public synchronized void mo2648k(@hib pdh pdhVar) {
        try {
            super.mo2648k(pdhVar);
            this.f14334N = new Handler(new Handler.Callback() { // from class: yo2
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f102382a.handleMessage(message);
                }
            });
            if (this.f14331L.isEmpty()) {
                updateTimelineAndScheduleOnCompletionActions();
            } else {
                this.f14342b2 = this.f14342b2.cloneAndInsert(0, this.f14331L.size());
                addMediaSourcesInternal(0, this.f14331L);
                scheduleTimelineUpdate();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void moveMediaSource(int i, int i2) {
        movePublicMediaSource(i, i2, null, null);
    }

    @Override // p000.vna
    public void releasePeriod(nja njaVar) {
        C1974e c1974e = (C1974e) u80.checkNotNull(this.f14337X.remove(njaVar));
        c1974e.f14352a.releasePeriod(njaVar);
        c1974e.f14354c.remove(((pv9) njaVar).f72216a);
        if (!this.f14337X.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(c1974e);
    }

    @Override // p000.vm2, p000.es0
    public synchronized void releaseSourceInternal() {
        try {
            super.releaseSourceInternal();
            this.f14335Q.clear();
            this.f14339Z.clear();
            this.f14338Y.clear();
            this.f14342b2 = this.f14342b2.cloneAndClear();
            Handler handler = this.f14334N;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f14334N = null;
            }
            this.f14340Z1 = false;
            this.f14341a2.clear();
            dispatchOnCompletionActions(this.f14332M);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized vna removeMediaSource(int i) {
        vna mediaSource;
        mediaSource = getMediaSource(i);
        removePublicMediaSources(i, i + 1, null, null);
        return mediaSource;
    }

    public synchronized void removeMediaSourceRange(int i, int i2) {
        removePublicMediaSources(i, i2, null, null);
    }

    public synchronized void setShuffleOrder(sbf sbfVar) {
        setPublicShuffleOrder(sbfVar, null, null);
    }

    @Override // p000.vm2
    @hib
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public vna.C14175b mo2649p(C1974e c1974e, vna.C14175b c14175b) {
        for (int i = 0; i < c1974e.f14354c.size(); i++) {
            if (c1974e.f14354c.get(i).f71109d == c14175b.f71109d) {
                return c14175b.copyWithPeriodUid(getPeriodUid(c1974e, c14175b.f71106a));
            }
        }
        return null;
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public int mo3298r(C1974e c1974e, int i) {
        return i + c1974e.f14356e;
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(C1974e c1974e, vna vnaVar, t1h t1hVar) {
        updateMediaSourceInternal(c1974e, t1hVar);
    }

    public bp2(boolean z, vna... vnaVarArr) {
        this(z, new sbf.C12510a(0), vnaVarArr);
    }

    private void scheduleTimelineUpdate(@hib C1973d c1973d) {
        if (!this.f14340Z1) {
            getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(4).sendToTarget();
            this.f14340Z1 = true;
        }
        if (c1973d != null) {
            this.f14341a2.add(c1973d);
        }
    }

    public bp2(boolean z, sbf sbfVar, vna... vnaVarArr) {
        this(z, false, sbfVar, vnaVarArr);
    }

    public synchronized void addMediaSource(vna vnaVar, Handler handler, Runnable runnable) {
        addMediaSource(this.f14331L.size(), vnaVar, handler, runnable);
    }

    public synchronized void clear(Handler handler, Runnable runnable) {
        removeMediaSourceRange(0, getSize(), handler, runnable);
    }

    public synchronized void moveMediaSource(int i, int i2, Handler handler, Runnable runnable) {
        movePublicMediaSource(i, i2, handler, runnable);
    }

    public synchronized void removeMediaSourceRange(int i, int i2, Handler handler, Runnable runnable) {
        removePublicMediaSources(i, i2, handler, runnable);
    }

    public synchronized void setShuffleOrder(sbf sbfVar, Handler handler, Runnable runnable) {
        setPublicShuffleOrder(sbfVar, handler, runnable);
    }

    public bp2(boolean z, boolean z2, sbf sbfVar, vna... vnaVarArr) {
        for (vna vnaVar : vnaVarArr) {
            u80.checkNotNull(vnaVar);
        }
        this.f14342b2 = sbfVar.getLength() > 0 ? sbfVar.cloneAndClear() : sbfVar;
        this.f14337X = new IdentityHashMap<>();
        this.f14338Y = new HashMap();
        this.f14331L = new ArrayList();
        this.f14335Q = new ArrayList();
        this.f14341a2 = new HashSet();
        this.f14332M = new HashSet();
        this.f14339Z = new HashSet();
        this.f14333M1 = z;
        this.f14336V1 = z2;
        addMediaSources(Arrays.asList(vnaVarArr));
    }

    public synchronized vna removeMediaSource(int i, Handler handler, Runnable runnable) {
        vna mediaSource;
        mediaSource = getMediaSource(i);
        removePublicMediaSources(i, i + 1, handler, runnable);
        return mediaSource;
    }

    public synchronized void addMediaSource(int i, vna vnaVar) {
        addPublicMediaSources(i, Collections.singletonList(vnaVar), null, null);
    }

    public synchronized void addMediaSources(Collection<vna> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(this.f14331L.size(), collection, handler, runnable);
    }

    public synchronized void addMediaSources(int i, Collection<vna> collection) {
        addPublicMediaSources(i, collection, null, null);
    }

    public synchronized void addMediaSource(int i, vna vnaVar, Handler handler, Runnable runnable) {
        addPublicMediaSources(i, Collections.singletonList(vnaVar), handler, runnable);
    }

    public synchronized void addMediaSources(int i, Collection<vna> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(i, collection, handler, runnable);
    }
}

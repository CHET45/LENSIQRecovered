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
import p000.nfa;
import p000.rbf;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@Deprecated
public final class ap2 extends um2<C1542e> {

    /* JADX INFO: renamed from: c2 */
    public static final int f11479c2 = 1;

    /* JADX INFO: renamed from: d2 */
    public static final int f11480d2 = 2;

    /* JADX INFO: renamed from: e2 */
    public static final int f11481e2 = 3;

    /* JADX INFO: renamed from: f2 */
    public static final int f11482f2 = 4;

    /* JADX INFO: renamed from: g2 */
    public static final int f11483g2 = 5;

    /* JADX INFO: renamed from: h2 */
    public static final int f11484h2 = 6;

    /* JADX INFO: renamed from: i2 */
    public static final nfa f11485i2 = new nfa.C9851c().setUri(Uri.EMPTY).build();

    /* JADX INFO: renamed from: L */
    @xc7("this")
    public final List<C1542e> f11486L;

    /* JADX INFO: renamed from: M */
    @xc7("this")
    public final Set<C1541d> f11487M;

    /* JADX INFO: renamed from: M1 */
    public final boolean f11488M1;

    /* JADX INFO: renamed from: N */
    @xc7("this")
    @hib
    public Handler f11489N;

    /* JADX INFO: renamed from: Q */
    public final List<C1542e> f11490Q;

    /* JADX INFO: renamed from: V1 */
    public final boolean f11491V1;

    /* JADX INFO: renamed from: X */
    public final IdentityHashMap<mja, C1542e> f11492X;

    /* JADX INFO: renamed from: Y */
    public final Map<Object, C1542e> f11493Y;

    /* JADX INFO: renamed from: Z */
    public final Set<C1542e> f11494Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f11495Z1;

    /* JADX INFO: renamed from: a2 */
    public Set<C1541d> f11496a2;

    /* JADX INFO: renamed from: b2 */
    public rbf f11497b2;

    /* JADX INFO: renamed from: ap2$b */
    public static final class C1539b extends AbstractC12381s0 {

        /* JADX INFO: renamed from: h */
        public final int f11498h;

        /* JADX INFO: renamed from: i */
        public final int f11499i;

        /* JADX INFO: renamed from: j */
        public final int[] f11500j;

        /* JADX INFO: renamed from: k */
        public final int[] f11501k;

        /* JADX INFO: renamed from: l */
        public final q1h[] f11502l;

        /* JADX INFO: renamed from: m */
        public final Object[] f11503m;

        /* JADX INFO: renamed from: n */
        public final HashMap<Object, Integer> f11504n;

        public C1539b(Collection<C1542e> collection, rbf rbfVar, boolean z) {
            super(z, rbfVar);
            int size = collection.size();
            this.f11500j = new int[size];
            this.f11501k = new int[size];
            this.f11502l = new q1h[size];
            this.f11503m = new Object[size];
            this.f11504n = new HashMap<>();
            int windowCount = 0;
            int periodCount = 0;
            int i = 0;
            for (C1542e c1542e : collection) {
                this.f11502l[i] = c1542e.f11507a.getTimeline();
                this.f11501k[i] = windowCount;
                this.f11500j[i] = periodCount;
                windowCount += this.f11502l[i].getWindowCount();
                periodCount += this.f11502l[i].getPeriodCount();
                Object[] objArr = this.f11503m;
                Object obj = c1542e.f11508b;
                objArr[i] = obj;
                this.f11504n.put(obj, Integer.valueOf(i));
                i++;
            }
            this.f11498h = windowCount;
            this.f11499i = periodCount;
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: a */
        public int mo2513a(Object obj) {
            Integer num = this.f11504n.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: b */
        public int mo2514b(int i) {
            return t0i.binarySearchFloor(this.f11501k, i + 1, false, false);
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: c */
        public Object mo2515c(int i) {
            return this.f11503m[i];
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: d */
        public int mo2516d(int i) {
            return this.f11500j[i];
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: e */
        public int mo2517e(int i) {
            return this.f11501k[i];
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: f */
        public q1h mo2518f(int i) {
            return this.f11502l[i];
        }

        @Override // p000.AbstractC12381s0
        public int getChildIndexByPeriodIndex(int i) {
            return t0i.binarySearchFloor(this.f11500j, i + 1, false, false);
        }

        @Override // p000.q1h
        public int getPeriodCount() {
            return this.f11499i;
        }

        @Override // p000.q1h
        public int getWindowCount() {
            return this.f11498h;
        }
    }

    /* JADX INFO: renamed from: ap2$c */
    public static final class C1540c extends fs0 {
        private C1540c() {
        }

        @Override // p000.una
        public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.una
        public nfa getMediaItem() {
            return ap2.f11485i2;
        }

        @Override // p000.fs0
        /* JADX INFO: renamed from: l */
        public void mo2508l(@hib qdh qdhVar) {
        }

        @Override // p000.una
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // p000.una
        public void releasePeriod(mja mjaVar) {
        }

        @Override // p000.fs0
        public void releaseSourceInternal() {
        }
    }

    /* JADX INFO: renamed from: ap2$d */
    public static final class C1541d {

        /* JADX INFO: renamed from: a */
        public final Handler f11505a;

        /* JADX INFO: renamed from: b */
        public final Runnable f11506b;

        public C1541d(Handler handler, Runnable runnable) {
            this.f11505a = handler;
            this.f11506b = runnable;
        }

        public void dispatch() {
            this.f11505a.post(this.f11506b);
        }
    }

    /* JADX INFO: renamed from: ap2$e */
    public static final class C1542e {

        /* JADX INFO: renamed from: a */
        public final qv9 f11507a;

        /* JADX INFO: renamed from: d */
        public int f11510d;

        /* JADX INFO: renamed from: e */
        public int f11511e;

        /* JADX INFO: renamed from: f */
        public boolean f11512f;

        /* JADX INFO: renamed from: c */
        public final List<una.C13612b> f11509c = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Object f11508b = new Object();

        public C1542e(una unaVar, boolean z) {
            this.f11507a = new qv9(unaVar, z);
        }

        public void reset(int i, int i2) {
            this.f11510d = i;
            this.f11511e = i2;
            this.f11512f = false;
            this.f11509c.clear();
        }
    }

    /* JADX INFO: renamed from: ap2$f */
    public static final class C1543f<T> {

        /* JADX INFO: renamed from: a */
        public final int f11513a;

        /* JADX INFO: renamed from: b */
        public final T f11514b;

        /* JADX INFO: renamed from: c */
        @hib
        public final C1541d f11515c;

        public C1543f(int i, T t, @hib C1541d c1541d) {
            this.f11513a = i;
            this.f11514b = t;
            this.f11515c = c1541d;
        }
    }

    public ap2(una... unaVarArr) {
        this(false, unaVarArr);
    }

    private void addMediaSourceInternal(int i, C1542e c1542e) {
        if (i > 0) {
            C1542e c1542e2 = this.f11490Q.get(i - 1);
            c1542e.reset(i, c1542e2.f11511e + c1542e2.f11507a.getTimeline().getWindowCount());
        } else {
            c1542e.reset(i, 0);
        }
        correctOffsets(i, 1, c1542e.f11507a.getTimeline().getWindowCount());
        this.f11490Q.add(i, c1542e);
        this.f11493Y.put(c1542e.f11508b, c1542e);
        m23429v(c1542e, c1542e.f11507a);
        if (m11121j() && this.f11492X.isEmpty()) {
            this.f11494Z.add(c1542e);
        } else {
            m23427p(c1542e);
        }
    }

    private void addMediaSourcesInternal(int i, Collection<C1542e> collection) {
        Iterator<C1542e> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i, it.next());
            i++;
        }
    }

    @xc7("this")
    private void addPublicMediaSources(int i, Collection<una> collection, @hib Handler handler, @hib Runnable runnable) {
        v80.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.f11489N;
        Iterator<una> it = collection.iterator();
        while (it.hasNext()) {
            v80.checkNotNull(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<una> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1542e(it2.next(), this.f11491V1));
        }
        this.f11486L.addAll(i, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(1, new C1543f(i, arrayList, createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void correctOffsets(int i, int i2, int i3) {
        while (i < this.f11490Q.size()) {
            C1542e c1542e = this.f11490Q.get(i);
            c1542e.f11510d += i2;
            c1542e.f11511e += i3;
            i++;
        }
    }

    @xc7("this")
    @hib
    private C1541d createOnCompletionAction(@hib Handler handler, @hib Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C1541d c1541d = new C1541d(handler, runnable);
        this.f11487M.add(c1541d);
        return c1541d;
    }

    private void disableUnusedMediaSources() {
        Iterator<C1542e> it = this.f11494Z.iterator();
        while (it.hasNext()) {
            C1542e next = it.next();
            if (next.f11509c.isEmpty()) {
                m23427p(next);
                it.remove();
            }
        }
    }

    private synchronized void dispatchOnCompletionActions(Set<C1541d> set) {
        try {
            Iterator<C1541d> it = set.iterator();
            while (it.hasNext()) {
                it.next().dispatch();
            }
            this.f11487M.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void enableMediaSource(C1542e c1542e) {
        this.f11494Z.add(c1542e);
        m23428q(c1542e);
    }

    private static Object getChildPeriodUid(Object obj) {
        return AbstractC12381s0.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return AbstractC12381s0.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object getPeriodUid(C1542e c1542e, Object obj) {
        return AbstractC12381s0.getConcatenatedUid(c1542e.f11508b, obj);
    }

    private Handler getPlaybackThreadHandlerOnPlaybackThread() {
        return (Handler) v80.checkNotNull(this.f11489N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                C1543f c1543f = (C1543f) t0i.castNonNull(message.obj);
                this.f11497b2 = this.f11497b2.cloneAndInsert(c1543f.f11513a, ((Collection) c1543f.f11514b).size());
                addMediaSourcesInternal(c1543f.f11513a, (Collection) c1543f.f11514b);
                scheduleTimelineUpdate(c1543f.f11515c);
                return true;
            case 2:
                C1543f c1543f2 = (C1543f) t0i.castNonNull(message.obj);
                int i = c1543f2.f11513a;
                int iIntValue = ((Integer) c1543f2.f11514b).intValue();
                if (i == 0 && iIntValue == this.f11497b2.getLength()) {
                    this.f11497b2 = this.f11497b2.cloneAndClear();
                } else {
                    this.f11497b2 = this.f11497b2.cloneAndRemove(i, iIntValue);
                }
                for (int i2 = iIntValue - 1; i2 >= i; i2--) {
                    removeMediaSourceInternal(i2);
                }
                scheduleTimelineUpdate(c1543f2.f11515c);
                return true;
            case 3:
                C1543f c1543f3 = (C1543f) t0i.castNonNull(message.obj);
                rbf rbfVar = this.f11497b2;
                int i3 = c1543f3.f11513a;
                rbf rbfVarCloneAndRemove = rbfVar.cloneAndRemove(i3, i3 + 1);
                this.f11497b2 = rbfVarCloneAndRemove;
                this.f11497b2 = rbfVarCloneAndRemove.cloneAndInsert(((Integer) c1543f3.f11514b).intValue(), 1);
                moveMediaSourceInternal(c1543f3.f11513a, ((Integer) c1543f3.f11514b).intValue());
                scheduleTimelineUpdate(c1543f3.f11515c);
                return true;
            case 4:
                C1543f c1543f4 = (C1543f) t0i.castNonNull(message.obj);
                this.f11497b2 = (rbf) c1543f4.f11514b;
                scheduleTimelineUpdate(c1543f4.f11515c);
                return true;
            case 5:
                updateTimelineAndScheduleOnCompletionActions();
                return true;
            case 6:
                dispatchOnCompletionActions((Set) t0i.castNonNull(message.obj));
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    private void maybeReleaseChildSource(C1542e c1542e) {
        if (c1542e.f11512f && c1542e.f11509c.isEmpty()) {
            this.f11494Z.remove(c1542e);
            m23430w(c1542e);
        }
    }

    private void moveMediaSourceInternal(int i, int i2) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int windowCount = this.f11490Q.get(iMin).f11511e;
        List<C1542e> list = this.f11490Q;
        list.add(i2, list.remove(i));
        while (iMin <= iMax) {
            C1542e c1542e = this.f11490Q.get(iMin);
            c1542e.f11510d = iMin;
            c1542e.f11511e = windowCount;
            windowCount += c1542e.f11507a.getTimeline().getWindowCount();
            iMin++;
        }
    }

    @xc7("this")
    private void movePublicMediaSource(int i, int i2, @hib Handler handler, @hib Runnable runnable) {
        v80.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.f11489N;
        List<C1542e> list = this.f11486L;
        list.add(i2, list.remove(i));
        if (handler2 != null) {
            handler2.obtainMessage(3, new C1543f(i, Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void removeMediaSourceInternal(int i) {
        C1542e c1542eRemove = this.f11490Q.remove(i);
        this.f11493Y.remove(c1542eRemove.f11508b);
        correctOffsets(i, -1, -c1542eRemove.f11507a.getTimeline().getWindowCount());
        c1542eRemove.f11512f = true;
        maybeReleaseChildSource(c1542eRemove);
    }

    @xc7("this")
    private void removePublicMediaSources(int i, int i2, @hib Handler handler, @hib Runnable runnable) {
        v80.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.f11489N;
        t0i.removeRange(this.f11486L, i, i2);
        if (handler2 != null) {
            handler2.obtainMessage(2, new C1543f(i, Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
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
    private void setPublicShuffleOrder(rbf rbfVar, @hib Handler handler, @hib Runnable runnable) {
        v80.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.f11489N;
        if (handler2 != null) {
            int size = getSize();
            if (rbfVar.getLength() != size) {
                rbfVar = rbfVar.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(4, new C1543f(0, rbfVar, createOnCompletionAction(handler, runnable))).sendToTarget();
            return;
        }
        if (rbfVar.getLength() > 0) {
            rbfVar = rbfVar.cloneAndClear();
        }
        this.f11497b2 = rbfVar;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private void updateMediaSourceInternal(C1542e c1542e, q1h q1hVar) {
        if (c1542e.f11510d + 1 < this.f11490Q.size()) {
            int windowCount = q1hVar.getWindowCount() - (this.f11490Q.get(c1542e.f11510d + 1).f11511e - c1542e.f11511e);
            if (windowCount != 0) {
                correctOffsets(c1542e.f11510d + 1, 0, windowCount);
            }
        }
        scheduleTimelineUpdate();
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
        this.f11495Z1 = false;
        Set<C1541d> set = this.f11496a2;
        this.f11496a2 = new HashSet();
        m11123m(new C1539b(this.f11490Q, this.f11497b2, this.f11488M1));
        getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(6, set).sendToTarget();
    }

    @Override // p000.um2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int mo2510t(C1542e c1542e, int i) {
        return i + c1542e.f11511e;
    }

    @Override // p000.um2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(C1542e c1542e, una unaVar, q1h q1hVar) {
        updateMediaSourceInternal(c1542e, q1hVar);
    }

    public synchronized void addMediaSource(una unaVar) {
        addMediaSource(this.f11486L.size(), unaVar);
    }

    public synchronized void addMediaSources(Collection<una> collection) {
        addPublicMediaSources(this.f11486L.size(), collection, null, null);
    }

    public synchronized void clear() {
        removeMediaSourceRange(0, getSize());
    }

    @Override // p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(c13612b.f88603a);
        una.C13612b c13612bCopyWithPeriodUid = c13612b.copyWithPeriodUid(getChildPeriodUid(c13612b.f88603a));
        C1542e c1542e = this.f11493Y.get(mediaSourceHolderUid);
        if (c1542e == null) {
            c1542e = new C1542e(new C1540c(), this.f11491V1);
            c1542e.f11512f = true;
            m23429v(c1542e, c1542e.f11507a);
        }
        enableMediaSource(c1542e);
        c1542e.f11509c.add(c13612bCopyWithPeriodUid);
        ov9 ov9VarCreatePeriod = c1542e.f11507a.createPeriod(c13612bCopyWithPeriodUid, interfaceC5892fn, j);
        this.f11492X.put(ov9VarCreatePeriod, c1542e);
        disableUnusedMediaSources();
        return ov9VarCreatePeriod;
    }

    @Override // p000.um2, p000.fs0
    /* JADX INFO: renamed from: g */
    public void mo2506g() {
        super.mo2506g();
        this.f11494Z.clear();
    }

    @Override // p000.una
    public synchronized q1h getInitialTimeline() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new C1539b(this.f11486L, this.f11497b2.getLength() != this.f11486L.size() ? this.f11497b2.cloneAndClear().cloneAndInsert(0, this.f11486L.size()) : this.f11497b2, this.f11488M1);
    }

    @Override // p000.una
    public nfa getMediaItem() {
        return f11485i2;
    }

    public synchronized una getMediaSource(int i) {
        return this.f11486L.get(i).f11507a;
    }

    public synchronized int getSize() {
        return this.f11486L.size();
    }

    @Override // p000.um2, p000.fs0
    /* JADX INFO: renamed from: h */
    public void mo2507h() {
    }

    @Override // p000.una
    public boolean isSingleWindow() {
        return false;
    }

    @Override // p000.um2, p000.fs0
    /* JADX INFO: renamed from: l */
    public synchronized void mo2508l(@hib qdh qdhVar) {
        try {
            super.mo2508l(qdhVar);
            this.f11489N = new Handler(new Handler.Callback() { // from class: zo2
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f105574a.handleMessage(message);
                }
            });
            if (this.f11486L.isEmpty()) {
                updateTimelineAndScheduleOnCompletionActions();
            } else {
                this.f11497b2 = this.f11497b2.cloneAndInsert(0, this.f11486L.size());
                addMediaSourcesInternal(0, this.f11486L);
                scheduleTimelineUpdate();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void moveMediaSource(int i, int i2) {
        movePublicMediaSource(i, i2, null, null);
    }

    @Override // p000.una
    public void releasePeriod(mja mjaVar) {
        C1542e c1542e = (C1542e) v80.checkNotNull(this.f11492X.remove(mjaVar));
        c1542e.f11507a.releasePeriod(mjaVar);
        c1542e.f11509c.remove(((ov9) mjaVar).f68941a);
        if (!this.f11492X.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(c1542e);
    }

    @Override // p000.um2, p000.fs0
    public synchronized void releaseSourceInternal() {
        try {
            super.releaseSourceInternal();
            this.f11490Q.clear();
            this.f11494Z.clear();
            this.f11493Y.clear();
            this.f11497b2 = this.f11497b2.cloneAndClear();
            Handler handler = this.f11489N;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f11489N = null;
            }
            this.f11495Z1 = false;
            this.f11496a2.clear();
            dispatchOnCompletionActions(this.f11487M);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized una removeMediaSource(int i) {
        una mediaSource;
        mediaSource = getMediaSource(i);
        removePublicMediaSources(i, i + 1, null, null);
        return mediaSource;
    }

    public synchronized void removeMediaSourceRange(int i, int i2) {
        removePublicMediaSources(i, i2, null, null);
    }

    public synchronized void setShuffleOrder(rbf rbfVar) {
        setPublicShuffleOrder(rbfVar, null, null);
    }

    @Override // p000.um2
    @hib
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public una.C13612b mo2509r(C1542e c1542e, una.C13612b c13612b) {
        for (int i = 0; i < c1542e.f11509c.size(); i++) {
            if (c1542e.f11509c.get(i).f88606d == c13612b.f88606d) {
                return c13612b.copyWithPeriodUid(getPeriodUid(c1542e, c13612b.f88603a));
            }
        }
        return null;
    }

    public ap2(boolean z, una... unaVarArr) {
        this(z, new rbf.C11995a(0), unaVarArr);
    }

    private void scheduleTimelineUpdate(@hib C1541d c1541d) {
        if (!this.f11495Z1) {
            getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(5).sendToTarget();
            this.f11495Z1 = true;
        }
        if (c1541d != null) {
            this.f11496a2.add(c1541d);
        }
    }

    public ap2(boolean z, rbf rbfVar, una... unaVarArr) {
        this(z, false, rbfVar, unaVarArr);
    }

    public synchronized void addMediaSource(una unaVar, Handler handler, Runnable runnable) {
        addMediaSource(this.f11486L.size(), unaVar, handler, runnable);
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

    public synchronized void setShuffleOrder(rbf rbfVar, Handler handler, Runnable runnable) {
        setPublicShuffleOrder(rbfVar, handler, runnable);
    }

    public ap2(boolean z, boolean z2, rbf rbfVar, una... unaVarArr) {
        for (una unaVar : unaVarArr) {
            v80.checkNotNull(unaVar);
        }
        this.f11497b2 = rbfVar.getLength() > 0 ? rbfVar.cloneAndClear() : rbfVar;
        this.f11492X = new IdentityHashMap<>();
        this.f11493Y = new HashMap();
        this.f11486L = new ArrayList();
        this.f11490Q = new ArrayList();
        this.f11496a2 = new HashSet();
        this.f11487M = new HashSet();
        this.f11494Z = new HashSet();
        this.f11488M1 = z;
        this.f11491V1 = z2;
        addMediaSources(Arrays.asList(unaVarArr));
    }

    public synchronized una removeMediaSource(int i, Handler handler, Runnable runnable) {
        una mediaSource;
        mediaSource = getMediaSource(i);
        removePublicMediaSources(i, i + 1, handler, runnable);
        return mediaSource;
    }

    public synchronized void addMediaSource(int i, una unaVar) {
        addPublicMediaSources(i, Collections.singletonList(unaVar), null, null);
    }

    public synchronized void addMediaSources(Collection<una> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(this.f11486L.size(), collection, handler, runnable);
    }

    public synchronized void addMediaSources(int i, Collection<una> collection) {
        addPublicMediaSources(i, collection, null, null);
    }

    public synchronized void addMediaSource(int i, una unaVar, Handler handler, Runnable runnable) {
        addPublicMediaSources(i, Collections.singletonList(unaVar), handler, runnable);
    }

    public synchronized void addMediaSources(int i, Collection<una> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(i, collection, handler, runnable);
    }
}

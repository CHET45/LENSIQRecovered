package p000;

import android.util.Pair;
import p000.kx7;
import p000.t1h;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class uja {

    /* JADX INFO: renamed from: n */
    public static final long f88151n = 1000000000000L;

    /* JADX INFO: renamed from: o */
    public static final int f88152o = 100;

    /* JADX INFO: renamed from: a */
    public final t1h.C12849b f88153a = new t1h.C12849b();

    /* JADX INFO: renamed from: b */
    public final t1h.C12851d f88154b = new t1h.C12851d();

    /* JADX INFO: renamed from: c */
    public final InterfaceC12162rn f88155c;

    /* JADX INFO: renamed from: d */
    public final pe7 f88156d;

    /* JADX INFO: renamed from: e */
    public long f88157e;

    /* JADX INFO: renamed from: f */
    public int f88158f;

    /* JADX INFO: renamed from: g */
    public boolean f88159g;

    /* JADX INFO: renamed from: h */
    @hib
    public oja f88160h;

    /* JADX INFO: renamed from: i */
    @hib
    public oja f88161i;

    /* JADX INFO: renamed from: j */
    @hib
    public oja f88162j;

    /* JADX INFO: renamed from: k */
    public int f88163k;

    /* JADX INFO: renamed from: l */
    @hib
    public Object f88164l;

    /* JADX INFO: renamed from: m */
    public long f88165m;

    public uja(InterfaceC12162rn interfaceC12162rn, pe7 pe7Var) {
        this.f88155c = interfaceC12162rn;
        this.f88156d = pe7Var;
    }

    private boolean areDurationsCompatible(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    private boolean canKeepMediaPeriodHolder(qja qjaVar, qja qjaVar2) {
        return qjaVar.f74600b == qjaVar2.f74600b && qjaVar.f74599a.equals(qjaVar2.f74599a);
    }

    @hib
    private qja getFirstMediaPeriodInfo(myc mycVar) {
        return getMediaPeriodInfo(mycVar.f62798a, mycVar.f62799b, mycVar.f62800c, mycVar.f62815r);
    }

    @hib
    private qja getFirstMediaPeriodInfoOfNextPeriod(t1h t1hVar, oja ojaVar, long j) {
        qja qjaVar;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        long j6;
        qja qjaVar2 = ojaVar.f67825f;
        int nextPeriodIndex = t1hVar.getNextPeriodIndex(t1hVar.getIndexOfPeriod(qjaVar2.f74599a.f71106a), this.f88153a, this.f88154b, this.f88158f, this.f88159g);
        if (nextPeriodIndex == -1) {
            return null;
        }
        int i = t1hVar.getPeriod(nextPeriodIndex, this.f88153a, true).f83398c;
        Object objCheckNotNull = u80.checkNotNull(this.f88153a.f83397b);
        long j7 = qjaVar2.f74599a.f71109d;
        if (t1hVar.getWindow(i, this.f88154b).f83431X == nextPeriodIndex) {
            qjaVar = qjaVar2;
            Pair<Object, Long> periodPositionUs = t1hVar.getPeriodPositionUs(this.f88154b, this.f88153a, i, -9223372036854775807L, Math.max(0L, j));
            if (periodPositionUs == null) {
                return null;
            }
            Object obj2 = periodPositionUs.first;
            long jLongValue = ((Long) periodPositionUs.second).longValue();
            oja next = ojaVar.getNext();
            if (next == null || !next.f67821b.equals(obj2)) {
                j6 = this.f88157e;
                this.f88157e = 1 + j6;
            } else {
                j6 = next.f67825f.f74599a.f71109d;
            }
            j2 = j6;
            j3 = -9223372036854775807L;
            obj = obj2;
            j4 = jLongValue;
        } else {
            qjaVar = qjaVar2;
            j2 = j7;
            j3 = 0;
            obj = objCheckNotNull;
            j4 = 0;
        }
        vna.C14175b c14175bResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(t1hVar, obj, j4, j2, this.f88154b, this.f88153a);
        if (j3 == -9223372036854775807L || qjaVar.f74601c == -9223372036854775807L) {
            j5 = j4;
        } else {
            boolean zHasServerSideInsertedAds = hasServerSideInsertedAds(qjaVar.f74599a.f71106a, t1hVar);
            if (c14175bResolveMediaPeriodIdForAds.isAd() && zHasServerSideInsertedAds) {
                j3 = qjaVar.f74601c;
            } else if (zHasServerSideInsertedAds) {
                j5 = qjaVar.f74601c;
            }
            j5 = j4;
        }
        return getMediaPeriodInfo(t1hVar, c14175bResolveMediaPeriodIdForAds, j3, j5);
    }

    @hib
    private qja getFollowingMediaPeriodInfo(t1h t1hVar, oja ojaVar, long j) {
        qja qjaVar = ojaVar.f67825f;
        long rendererOffset = (ojaVar.getRendererOffset() + qjaVar.f74603e) - j;
        return qjaVar.f74605g ? getFirstMediaPeriodInfoOfNextPeriod(t1hVar, ojaVar, rendererOffset) : getFollowingMediaPeriodInfoOfCurrentPeriod(t1hVar, ojaVar, rendererOffset);
    }

    @hib
    private qja getFollowingMediaPeriodInfoOfCurrentPeriod(t1h t1hVar, oja ojaVar, long j) {
        qja qjaVar = ojaVar.f67825f;
        vna.C14175b c14175b = qjaVar.f74599a;
        t1hVar.getPeriodByUid(c14175b.f71106a, this.f88153a);
        if (!c14175b.isAd()) {
            int i = c14175b.f71110e;
            if (i != -1 && this.f88153a.isLivePostrollPlaceholder(i)) {
                return getFirstMediaPeriodInfoOfNextPeriod(t1hVar, ojaVar, j);
            }
            int firstAdIndexToPlay = this.f88153a.getFirstAdIndexToPlay(c14175b.f71110e);
            boolean z = this.f88153a.isServerSideInsertedAdGroup(c14175b.f71110e) && this.f88153a.getAdState(c14175b.f71110e, firstAdIndexToPlay) == 3;
            if (firstAdIndexToPlay == this.f88153a.getAdCountInAdGroup(c14175b.f71110e) || z) {
                return getMediaPeriodInfoForContent(t1hVar, c14175b.f71106a, getMinStartPositionAfterAdGroupUs(t1hVar, c14175b.f71106a, c14175b.f71110e), qjaVar.f74603e, c14175b.f71109d);
            }
            return getMediaPeriodInfoForAd(t1hVar, c14175b.f71106a, c14175b.f71110e, firstAdIndexToPlay, qjaVar.f74603e, c14175b.f71109d);
        }
        int i2 = c14175b.f71107b;
        int adCountInAdGroup = this.f88153a.getAdCountInAdGroup(i2);
        if (adCountInAdGroup == -1) {
            return null;
        }
        int nextAdIndexToPlay = this.f88153a.getNextAdIndexToPlay(i2, c14175b.f71108c);
        if (nextAdIndexToPlay < adCountInAdGroup) {
            return getMediaPeriodInfoForAd(t1hVar, c14175b.f71106a, i2, nextAdIndexToPlay, qjaVar.f74601c, c14175b.f71109d);
        }
        long jLongValue = qjaVar.f74601c;
        if (jLongValue == -9223372036854775807L) {
            t1h.C12851d c12851d = this.f88154b;
            t1h.C12849b c12849b = this.f88153a;
            Pair<Object, Long> periodPositionUs = t1hVar.getPeriodPositionUs(c12851d, c12849b, c12849b.f83398c, -9223372036854775807L, Math.max(0L, j));
            if (periodPositionUs == null) {
                return null;
            }
            jLongValue = ((Long) periodPositionUs.second).longValue();
        }
        return getMediaPeriodInfoForContent(t1hVar, c14175b.f71106a, Math.max(getMinStartPositionAfterAdGroupUs(t1hVar, c14175b.f71106a, c14175b.f71107b), jLongValue), qjaVar.f74601c, c14175b.f71109d);
    }

    @hib
    private qja getMediaPeriodInfo(t1h t1hVar, vna.C14175b c14175b, long j, long j2) {
        t1hVar.getPeriodByUid(c14175b.f71106a, this.f88153a);
        return c14175b.isAd() ? getMediaPeriodInfoForAd(t1hVar, c14175b.f71106a, c14175b.f71107b, c14175b.f71108c, j, c14175b.f71109d) : getMediaPeriodInfoForContent(t1hVar, c14175b.f71106a, j2, j, c14175b.f71109d);
    }

    private qja getMediaPeriodInfoForAd(t1h t1hVar, Object obj, int i, int i2, long j, long j2) {
        vna.C14175b c14175b = new vna.C14175b(obj, i, i2, j2);
        long adDurationUs = t1hVar.getPeriodByUid(c14175b.f71106a, this.f88153a).getAdDurationUs(c14175b.f71107b, c14175b.f71108c);
        long adResumePositionUs = i2 == this.f88153a.getFirstAdIndexToPlay(i) ? this.f88153a.getAdResumePositionUs() : 0L;
        return new qja(c14175b, (adDurationUs == -9223372036854775807L || adResumePositionUs < adDurationUs) ? adResumePositionUs : Math.max(0L, adDurationUs - 1), j, -9223372036854775807L, adDurationUs, this.f88153a.isServerSideInsertedAdGroup(c14175b.f71107b), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000.qja getMediaPeriodInfoForContent(p000.t1h r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uja.getMediaPeriodInfoForContent(t1h, java.lang.Object, long, long, long):qja");
    }

    private long getMinStartPositionAfterAdGroupUs(t1h t1hVar, Object obj, int i) {
        t1hVar.getPeriodByUid(obj, this.f88153a);
        long adGroupTimeUs = this.f88153a.getAdGroupTimeUs(i);
        return adGroupTimeUs == Long.MIN_VALUE ? this.f88153a.f83399d : adGroupTimeUs + this.f88153a.getContentResumeOffsetUs(i);
    }

    private boolean hasServerSideInsertedAds(Object obj, t1h t1hVar) {
        int adGroupCount = t1hVar.getPeriodByUid(obj, this.f88153a).getAdGroupCount();
        int removedAdGroupCount = this.f88153a.getRemovedAdGroupCount();
        return adGroupCount > 0 && this.f88153a.isServerSideInsertedAdGroup(removedAdGroupCount) && (adGroupCount > 1 || this.f88153a.getAdGroupTimeUs(removedAdGroupCount) != Long.MIN_VALUE);
    }

    private boolean isLastInPeriod(vna.C14175b c14175b) {
        return !c14175b.isAd() && c14175b.f71110e == -1;
    }

    private boolean isLastInTimeline(t1h t1hVar, vna.C14175b c14175b, boolean z) {
        int indexOfPeriod = t1hVar.getIndexOfPeriod(c14175b.f71106a);
        return !t1hVar.getWindow(t1hVar.getPeriod(indexOfPeriod, this.f88153a).f83398c, this.f88154b).f83425F && t1hVar.isLastPeriod(indexOfPeriod, this.f88153a, this.f88154b, this.f88158f, this.f88159g) && z;
    }

    private boolean isLastInWindow(t1h t1hVar, vna.C14175b c14175b) {
        if (isLastInPeriod(c14175b)) {
            return t1hVar.getWindow(t1hVar.getPeriodByUid(c14175b.f71106a, this.f88153a).f83398c, this.f88154b).f83432Y == t1hVar.getIndexOfPeriod(c14175b.f71106a);
        }
        return false;
    }

    private static boolean isSkippableAdPeriod(t1h.C12849b c12849b) {
        int adGroupCount = c12849b.getAdGroupCount();
        if (adGroupCount == 0) {
            return false;
        }
        if ((adGroupCount == 1 && c12849b.isLivePostrollPlaceholder(0)) || !c12849b.isServerSideInsertedAdGroup(c12849b.getRemovedAdGroupCount())) {
            return false;
        }
        long contentResumeOffsetUs = 0;
        if (c12849b.getAdGroupIndexForPositionUs(0L) != -1) {
            return false;
        }
        if (c12849b.f83399d == 0) {
            return true;
        }
        int i = adGroupCount - (c12849b.isLivePostrollPlaceholder(adGroupCount + (-1)) ? 2 : 1);
        for (int i2 = 0; i2 <= i; i2++) {
            contentResumeOffsetUs += c12849b.getContentResumeOffsetUs(i2);
        }
        return c12849b.f83399d <= contentResumeOffsetUs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyQueueUpdate$0(kx7.C8541a c8541a, vna.C14175b c14175b) {
        this.f88155c.updateMediaPeriodQueueInfo(c8541a.build(), c14175b);
    }

    private void notifyQueueUpdate() {
        final kx7.C8541a c8541aBuilder = kx7.builder();
        for (oja next = this.f88160h; next != null; next = next.getNext()) {
            c8541aBuilder.add(next.f67825f.f74599a);
        }
        oja ojaVar = this.f88161i;
        final vna.C14175b c14175b = ojaVar == null ? null : ojaVar.f67825f.f74599a;
        this.f88156d.post(new Runnable() { // from class: sja
            @Override // java.lang.Runnable
            public final void run() {
                this.f82005a.lambda$notifyQueueUpdate$0(c8541aBuilder, c14175b);
            }
        });
    }

    private long resolvePeriodIndexToWindowSequenceNumber(t1h t1hVar, Object obj) {
        int indexOfPeriod;
        int i = t1hVar.getPeriodByUid(obj, this.f88153a).f83398c;
        Object obj2 = this.f88164l;
        if (obj2 != null && (indexOfPeriod = t1hVar.getIndexOfPeriod(obj2)) != -1 && t1hVar.getPeriod(indexOfPeriod, this.f88153a).f83398c == i) {
            return this.f88165m;
        }
        for (oja next = this.f88160h; next != null; next = next.getNext()) {
            if (next.f67821b.equals(obj)) {
                return next.f67825f.f74599a.f71109d;
            }
        }
        for (oja next2 = this.f88160h; next2 != null; next2 = next2.getNext()) {
            int indexOfPeriod2 = t1hVar.getIndexOfPeriod(next2.f67821b);
            if (indexOfPeriod2 != -1 && t1hVar.getPeriod(indexOfPeriod2, this.f88153a).f83398c == i) {
                return next2.f67825f.f74599a.f71109d;
            }
        }
        long j = this.f88157e;
        this.f88157e = 1 + j;
        if (this.f88160h == null) {
            this.f88164l = obj;
            this.f88165m = j;
        }
        return j;
    }

    private boolean updateForPlaybackModeChange(t1h t1hVar) {
        oja next = this.f88160h;
        if (next == null) {
            return true;
        }
        int indexOfPeriod = t1hVar.getIndexOfPeriod(next.f67821b);
        while (true) {
            indexOfPeriod = t1hVar.getNextPeriodIndex(indexOfPeriod, this.f88153a, this.f88154b, this.f88158f, this.f88159g);
            while (next.getNext() != null && !next.f67825f.f74605g) {
                next = next.getNext();
            }
            oja next2 = next.getNext();
            if (indexOfPeriod == -1 || next2 == null || t1hVar.getIndexOfPeriod(next2.f67821b) != indexOfPeriod) {
                break;
            }
            next = next2;
        }
        boolean zRemoveAfter = removeAfter(next);
        next.f67825f = getUpdatedMediaPeriodInfo(t1hVar, next.f67825f);
        return !zRemoveAfter;
    }

    @hib
    public oja advancePlayingPeriod() {
        oja ojaVar = this.f88160h;
        if (ojaVar == null) {
            return null;
        }
        if (ojaVar == this.f88161i) {
            this.f88161i = ojaVar.getNext();
        }
        this.f88160h.release();
        int i = this.f88163k - 1;
        this.f88163k = i;
        if (i == 0) {
            this.f88162j = null;
            oja ojaVar2 = this.f88160h;
            this.f88164l = ojaVar2.f67821b;
            this.f88165m = ojaVar2.f67825f.f74599a.f71109d;
        }
        this.f88160h = this.f88160h.getNext();
        notifyQueueUpdate();
        return this.f88160h;
    }

    public oja advanceReadingPeriod() {
        oja ojaVar = this.f88161i;
        u80.checkState((ojaVar == null || ojaVar.getNext() == null) ? false : true);
        this.f88161i = this.f88161i.getNext();
        notifyQueueUpdate();
        return this.f88161i;
    }

    public void clear() {
        if (this.f88163k == 0) {
            return;
        }
        oja next = (oja) u80.checkStateNotNull(this.f88160h);
        this.f88164l = next.f67821b;
        this.f88165m = next.f67825f.f74599a.f71109d;
        while (next != null) {
            next.release();
            next = next.getNext();
        }
        this.f88160h = null;
        this.f88162j = null;
        this.f88161i = null;
        this.f88163k = 0;
        notifyQueueUpdate();
    }

    public oja enqueueNextMediaPeriodHolder(p1e[] p1eVarArr, p7h p7hVar, InterfaceC6430gn interfaceC6430gn, ppa ppaVar, qja qjaVar, q7h q7hVar) {
        oja ojaVar = this.f88162j;
        oja ojaVar2 = new oja(p1eVarArr, ojaVar == null ? 1000000000000L : (ojaVar.getRendererOffset() + this.f88162j.f67825f.f74603e) - qjaVar.f74600b, p7hVar, interfaceC6430gn, ppaVar, qjaVar, q7hVar);
        oja ojaVar3 = this.f88162j;
        if (ojaVar3 != null) {
            ojaVar3.setNext(ojaVar2);
        } else {
            this.f88160h = ojaVar2;
            this.f88161i = ojaVar2;
        }
        this.f88164l = null;
        this.f88162j = ojaVar2;
        this.f88163k++;
        notifyQueueUpdate();
        return ojaVar2;
    }

    @hib
    public oja getLoadingPeriod() {
        return this.f88162j;
    }

    @hib
    public qja getNextMediaPeriodInfo(long j, myc mycVar) {
        oja ojaVar = this.f88162j;
        return ojaVar == null ? getFirstMediaPeriodInfo(mycVar) : getFollowingMediaPeriodInfo(mycVar.f62798a, ojaVar, j);
    }

    @hib
    public oja getPlayingPeriod() {
        return this.f88160h;
    }

    @hib
    public oja getReadingPeriod() {
        return this.f88161i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.qja getUpdatedMediaPeriodInfo(p000.t1h r19, p000.qja r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            vna$b r3 = r2.f74599a
            boolean r12 = r0.isLastInPeriod(r3)
            boolean r13 = r0.isLastInWindow(r1, r3)
            boolean r14 = r0.isLastInTimeline(r1, r3, r12)
            vna$b r4 = r2.f74599a
            java.lang.Object r4 = r4.f71106a
            t1h$b r5 = r0.f88153a
            r1.getPeriodByUid(r4, r5)
            boolean r1 = r3.isAd()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.f71110e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            t1h$b r7 = r0.f88153a
            long r7 = r7.getAdGroupTimeUs(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L48
            t1h$b r1 = r0.f88153a
            int r4 = r3.f71107b
            int r5 = r3.f71108c
            long r4 = r1.getAdDurationUs(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            t1h$b r1 = r0.f88153a
            long r4 = r1.getDurationUs()
            goto L46
        L5c:
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L6c
            t1h$b r1 = r0.f88153a
            int r4 = r3.f71107b
            boolean r1 = r1.isServerSideInsertedAdGroup(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f71110e
            if (r1 == r6) goto L7a
            t1h$b r4 = r0.f88153a
            boolean r1 = r4.isServerSideInsertedAdGroup(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            qja r15 = new qja
            long r4 = r2.f74600b
            long r1 = r2.f74601c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uja.getUpdatedMediaPeriodInfo(t1h, qja):qja");
    }

    public boolean isLoading(nja njaVar) {
        oja ojaVar = this.f88162j;
        return ojaVar != null && ojaVar.f67820a == njaVar;
    }

    public void reevaluateBuffer(long j) {
        oja ojaVar = this.f88162j;
        if (ojaVar != null) {
            ojaVar.reevaluateBuffer(j);
        }
    }

    public boolean removeAfter(oja ojaVar) {
        boolean z = false;
        u80.checkState(ojaVar != null);
        if (ojaVar.equals(this.f88162j)) {
            return false;
        }
        this.f88162j = ojaVar;
        while (ojaVar.getNext() != null) {
            ojaVar = ojaVar.getNext();
            if (ojaVar == this.f88161i) {
                this.f88161i = this.f88160h;
                z = true;
            }
            ojaVar.release();
            this.f88163k--;
        }
        this.f88162j.setNext(null);
        notifyQueueUpdate();
        return z;
    }

    public vna.C14175b resolveMediaPeriodIdForAds(t1h t1hVar, Object obj, long j) {
        return resolveMediaPeriodIdForAds(t1hVar, obj, j, resolvePeriodIndexToWindowSequenceNumber(t1hVar, obj), this.f88154b, this.f88153a);
    }

    public vna.C14175b resolveMediaPeriodIdForAdsAfterPeriodPositionChange(t1h t1hVar, Object obj, long j) {
        long jResolvePeriodIndexToWindowSequenceNumber = resolvePeriodIndexToWindowSequenceNumber(t1hVar, obj);
        t1hVar.getPeriodByUid(obj, this.f88153a);
        t1hVar.getWindow(this.f88153a.f83398c, this.f88154b);
        boolean z = false;
        for (int indexOfPeriod = t1hVar.getIndexOfPeriod(obj); indexOfPeriod >= this.f88154b.f83431X; indexOfPeriod--) {
            t1hVar.getPeriod(indexOfPeriod, this.f88153a, true);
            boolean z2 = this.f88153a.getAdGroupCount() > 0;
            z |= z2;
            t1h.C12849b c12849b = this.f88153a;
            if (c12849b.getAdGroupIndexForPositionUs(c12849b.f83399d) != -1) {
                obj = u80.checkNotNull(this.f88153a.f83397b);
            }
            if (z && (!z2 || this.f88153a.f83399d != 0)) {
                break;
            }
        }
        return resolveMediaPeriodIdForAds(t1hVar, obj, j, jResolvePeriodIndexToWindowSequenceNumber, this.f88154b, this.f88153a);
    }

    public boolean shouldLoadNextMediaPeriod() {
        oja ojaVar = this.f88162j;
        return ojaVar == null || (!ojaVar.f67825f.f74607i && ojaVar.isFullyBuffered() && this.f88162j.f67825f.f74603e != -9223372036854775807L && this.f88163k < 100);
    }

    public boolean updateQueuedPeriods(t1h t1hVar, long j, long j2) {
        qja updatedMediaPeriodInfo;
        oja next = this.f88160h;
        oja ojaVar = null;
        while (next != null) {
            qja qjaVar = next.f67825f;
            if (ojaVar != null) {
                qja followingMediaPeriodInfo = getFollowingMediaPeriodInfo(t1hVar, ojaVar, j);
                if (followingMediaPeriodInfo != null && canKeepMediaPeriodHolder(qjaVar, followingMediaPeriodInfo)) {
                    updatedMediaPeriodInfo = followingMediaPeriodInfo;
                }
                return !removeAfter(ojaVar);
            }
            updatedMediaPeriodInfo = getUpdatedMediaPeriodInfo(t1hVar, qjaVar);
            next.f67825f = updatedMediaPeriodInfo.copyWithRequestedContentPositionUs(qjaVar.f74601c);
            if (!areDurationsCompatible(qjaVar.f74603e, updatedMediaPeriodInfo.f74603e)) {
                next.updateClipping();
                long j3 = updatedMediaPeriodInfo.f74603e;
                return (removeAfter(next) || (next == this.f88161i && !next.f67825f.f74604f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j3)) ? 1 : (j2 == ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j3)) ? 0 : -1)) >= 0))) ? false : true;
            }
            ojaVar = next;
            next = next.getNext();
        }
        return true;
    }

    public boolean updateRepeatMode(t1h t1hVar, int i) {
        this.f88158f = i;
        return updateForPlaybackModeChange(t1hVar);
    }

    public boolean updateShuffleModeEnabled(t1h t1hVar, boolean z) {
        this.f88159g = z;
        return updateForPlaybackModeChange(t1hVar);
    }

    private static vna.C14175b resolveMediaPeriodIdForAds(t1h t1hVar, Object obj, long j, long j2, t1h.C12851d c12851d, t1h.C12849b c12849b) {
        t1hVar.getPeriodByUid(obj, c12849b);
        t1hVar.getWindow(c12849b.f83398c, c12851d);
        Object objCheckNotNull = obj;
        for (int indexOfPeriod = t1hVar.getIndexOfPeriod(obj); isSkippableAdPeriod(c12849b) && indexOfPeriod <= c12851d.f83432Y; indexOfPeriod++) {
            t1hVar.getPeriod(indexOfPeriod, c12849b, true);
            objCheckNotNull = u80.checkNotNull(c12849b.f83397b);
        }
        t1hVar.getPeriodByUid(objCheckNotNull, c12849b);
        int adGroupIndexForPositionUs = c12849b.getAdGroupIndexForPositionUs(j);
        if (adGroupIndexForPositionUs == -1) {
            return new vna.C14175b(objCheckNotNull, j2, c12849b.getAdGroupIndexAfterPositionUs(j));
        }
        return new vna.C14175b(objCheckNotNull, adGroupIndexForPositionUs, c12849b.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j2);
    }
}

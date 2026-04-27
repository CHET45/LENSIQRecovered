package p000;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import p000.InterfaceC5415eo;
import p000.lzc;
import p000.ox7;
import p000.t1h;
import p000.vna;
import p000.za9;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class as3 implements InterfaceC12162rn {

    /* JADX INFO: renamed from: C */
    public pe7 f11715C;

    /* JADX INFO: renamed from: F */
    public boolean f11716F;

    /* JADX INFO: renamed from: a */
    public final h52 f11717a;

    /* JADX INFO: renamed from: b */
    public final t1h.C12849b f11718b;

    /* JADX INFO: renamed from: c */
    public final t1h.C12851d f11719c;

    /* JADX INFO: renamed from: d */
    public final C1583a f11720d;

    /* JADX INFO: renamed from: e */
    public final SparseArray<InterfaceC5415eo.b> f11721e;

    /* JADX INFO: renamed from: f */
    public za9<InterfaceC5415eo> f11722f;

    /* JADX INFO: renamed from: m */
    public lzc f11723m;

    /* JADX INFO: renamed from: as3$a */
    public static final class C1583a {

        /* JADX INFO: renamed from: a */
        public final t1h.C12849b f11724a;

        /* JADX INFO: renamed from: b */
        public kx7<vna.C14175b> f11725b = kx7.m15110of();

        /* JADX INFO: renamed from: c */
        public ox7<vna.C14175b, t1h> f11726c = ox7.m19076of();

        /* JADX INFO: renamed from: d */
        @hib
        public vna.C14175b f11727d;

        /* JADX INFO: renamed from: e */
        public vna.C14175b f11728e;

        /* JADX INFO: renamed from: f */
        public vna.C14175b f11729f;

        public C1583a(t1h.C12849b c12849b) {
            this.f11724a = c12849b;
        }

        private void addTimelineForMediaPeriodId(ox7.C10705d<vna.C14175b, t1h> c10705d, @hib vna.C14175b c14175b, t1h t1hVar) {
            if (c14175b == null) {
                return;
            }
            if (t1hVar.getIndexOfPeriod(c14175b.f71106a) != -1) {
                c10705d.put(c14175b, t1hVar);
                return;
            }
            t1h t1hVar2 = this.f11726c.get(c14175b);
            if (t1hVar2 != null) {
                c10705d.put(c14175b, t1hVar2);
            }
        }

        @hib
        private static vna.C14175b findCurrentPlayerMediaPeriodInQueue(lzc lzcVar, kx7<vna.C14175b> kx7Var, @hib vna.C14175b c14175b, t1h.C12849b c12849b) {
            t1h currentTimeline = lzcVar.getCurrentTimeline();
            int currentPeriodIndex = lzcVar.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (lzcVar.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, c12849b).getAdGroupIndexAfterPositionUs(x0i.msToUs(lzcVar.getCurrentPosition()) - c12849b.getPositionInWindowUs());
            for (int i = 0; i < kx7Var.size(); i++) {
                vna.C14175b c14175b2 = kx7Var.get(i);
                if (isMatchingMediaPeriod(c14175b2, uidOfPeriod, lzcVar.isPlayingAd(), lzcVar.getCurrentAdGroupIndex(), lzcVar.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return c14175b2;
                }
            }
            if (kx7Var.isEmpty() && c14175b != null) {
                if (isMatchingMediaPeriod(c14175b, uidOfPeriod, lzcVar.isPlayingAd(), lzcVar.getCurrentAdGroupIndex(), lzcVar.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return c14175b;
                }
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(vna.C14175b c14175b, @hib Object obj, boolean z, int i, int i2, int i3) {
            if (c14175b.f71106a.equals(obj)) {
                return (z && c14175b.f71107b == i && c14175b.f71108c == i2) || (!z && c14175b.f71107b == -1 && c14175b.f71110e == i3);
            }
            return false;
        }

        private void updateMediaPeriodTimelines(t1h t1hVar) {
            ox7.C10705d<vna.C14175b, t1h> c10705dBuilder = ox7.builder();
            if (this.f11725b.isEmpty()) {
                addTimelineForMediaPeriodId(c10705dBuilder, this.f11728e, t1hVar);
                if (!okb.equal(this.f11729f, this.f11728e)) {
                    addTimelineForMediaPeriodId(c10705dBuilder, this.f11729f, t1hVar);
                }
                if (!okb.equal(this.f11727d, this.f11728e) && !okb.equal(this.f11727d, this.f11729f)) {
                    addTimelineForMediaPeriodId(c10705dBuilder, this.f11727d, t1hVar);
                }
            } else {
                for (int i = 0; i < this.f11725b.size(); i++) {
                    addTimelineForMediaPeriodId(c10705dBuilder, this.f11725b.get(i), t1hVar);
                }
                if (!this.f11725b.contains(this.f11727d)) {
                    addTimelineForMediaPeriodId(c10705dBuilder, this.f11727d, t1hVar);
                }
            }
            this.f11726c = c10705dBuilder.buildOrThrow();
        }

        @hib
        public vna.C14175b getCurrentPlayerMediaPeriod() {
            return this.f11727d;
        }

        @hib
        public vna.C14175b getLoadingMediaPeriod() {
            if (this.f11725b.isEmpty()) {
                return null;
            }
            return (vna.C14175b) vg8.getLast(this.f11725b);
        }

        @hib
        public t1h getMediaPeriodIdTimeline(vna.C14175b c14175b) {
            return this.f11726c.get(c14175b);
        }

        @hib
        public vna.C14175b getPlayingMediaPeriod() {
            return this.f11728e;
        }

        @hib
        public vna.C14175b getReadingMediaPeriod() {
            return this.f11729f;
        }

        public void onPositionDiscontinuity(lzc lzcVar) {
            this.f11727d = findCurrentPlayerMediaPeriodInQueue(lzcVar, this.f11725b, this.f11728e, this.f11724a);
        }

        public void onQueueUpdated(List<vna.C14175b> list, @hib vna.C14175b c14175b, lzc lzcVar) {
            this.f11725b = kx7.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.f11728e = list.get(0);
                this.f11729f = (vna.C14175b) u80.checkNotNull(c14175b);
            }
            if (this.f11727d == null) {
                this.f11727d = findCurrentPlayerMediaPeriodInQueue(lzcVar, this.f11725b, this.f11728e, this.f11724a);
            }
            updateMediaPeriodTimelines(lzcVar.getCurrentTimeline());
        }

        public void onTimelineChanged(lzc lzcVar) {
            this.f11727d = findCurrentPlayerMediaPeriodInQueue(lzcVar, this.f11725b, this.f11728e, this.f11724a);
            updateMediaPeriodTimelines(lzcVar.getCurrentTimeline());
        }
    }

    public as3(h52 h52Var) {
        this.f11717a = (h52) u80.checkNotNull(h52Var);
        this.f11722f = new za9<>(x0i.getCurrentOrMainLooper(), h52Var, new za9.InterfaceC16058b() { // from class: jp3
            @Override // p000.za9.InterfaceC16058b
            public final void invoke(Object obj, i36 i36Var) {
                as3.lambda$new$0((InterfaceC5415eo) obj, i36Var);
            }
        });
        t1h.C12849b c12849b = new t1h.C12849b();
        this.f11718b = c12849b;
        this.f11719c = new t1h.C12851d();
        this.f11720d = new C1583a(c12849b);
        this.f11721e = new SparseArray<>();
    }

    private InterfaceC5415eo.b generateEventTime(@hib vna.C14175b c14175b) {
        u80.checkNotNull(this.f11723m);
        t1h mediaPeriodIdTimeline = c14175b == null ? null : this.f11720d.getMediaPeriodIdTimeline(c14175b);
        if (c14175b != null && mediaPeriodIdTimeline != null) {
            return m2629s0(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(c14175b.f71106a, this.f11718b).f83398c, c14175b);
        }
        int currentMediaItemIndex = this.f11723m.getCurrentMediaItemIndex();
        t1h currentTimeline = this.f11723m.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = t1h.f83385a;
        }
        return m2629s0(currentTimeline, currentMediaItemIndex, null);
    }

    private InterfaceC5415eo.b generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.f11720d.getLoadingMediaPeriod());
    }

    private InterfaceC5415eo.b generateMediaPeriodEventTime(int i, @hib vna.C14175b c14175b) {
        u80.checkNotNull(this.f11723m);
        if (c14175b != null) {
            return this.f11720d.getMediaPeriodIdTimeline(c14175b) != null ? generateEventTime(c14175b) : m2629s0(t1h.f83385a, i, c14175b);
        }
        t1h currentTimeline = this.f11723m.getCurrentTimeline();
        if (i >= currentTimeline.getWindowCount()) {
            currentTimeline = t1h.f83385a;
        }
        return m2629s0(currentTimeline, i, null);
    }

    private InterfaceC5415eo.b generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.f11720d.getPlayingMediaPeriod());
    }

    private InterfaceC5415eo.b generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.f11720d.getReadingMediaPeriod());
    }

    private InterfaceC5415eo.b getEventTimeForErrorEvent(@hib lyc lycVar) {
        pja pjaVar;
        return (!(lycVar instanceof ba5) || (pjaVar = ((ba5) lycVar).f13139F2) == null) ? m2628r0() : generateEventTime(new vna.C14175b(pjaVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(InterfaceC5415eo interfaceC5415eo, i36 i36Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioDecoderInitialized$4(InterfaceC5415eo.b bVar, String str, long j, long j2, InterfaceC5415eo interfaceC5415eo) {
        interfaceC5415eo.onAudioDecoderInitialized(bVar, str, j);
        interfaceC5415eo.onAudioDecoderInitialized(bVar, str, j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioInputFormatChanged$5(InterfaceC5415eo.b bVar, kq6 kq6Var, wl3 wl3Var, InterfaceC5415eo interfaceC5415eo) {
        interfaceC5415eo.onAudioInputFormatChanged(bVar, kq6Var);
        interfaceC5415eo.onAudioInputFormatChanged(bVar, kq6Var, wl3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDrmSessionAcquired$61(InterfaceC5415eo.b bVar, int i, InterfaceC5415eo interfaceC5415eo) {
        interfaceC5415eo.onDrmSessionAcquired(bVar);
        interfaceC5415eo.onDrmSessionAcquired(bVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIsLoadingChanged$32(InterfaceC5415eo.b bVar, boolean z, InterfaceC5415eo interfaceC5415eo) {
        interfaceC5415eo.onLoadingChanged(bVar, z);
        interfaceC5415eo.onIsLoadingChanged(bVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPositionDiscontinuity$43(InterfaceC5415eo.b bVar, int i, lzc.C9053k c9053k, lzc.C9053k c9053k2, InterfaceC5415eo interfaceC5415eo) {
        interfaceC5415eo.onPositionDiscontinuity(bVar, i);
        interfaceC5415eo.onPositionDiscontinuity(bVar, c9053k, c9053k2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoDecoderInitialized$14(InterfaceC5415eo.b bVar, String str, long j, long j2, InterfaceC5415eo interfaceC5415eo) {
        interfaceC5415eo.onVideoDecoderInitialized(bVar, str, j);
        interfaceC5415eo.onVideoDecoderInitialized(bVar, str, j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoInputFormatChanged$15(InterfaceC5415eo.b bVar, kq6 kq6Var, wl3 wl3Var, InterfaceC5415eo interfaceC5415eo) {
        interfaceC5415eo.onVideoInputFormatChanged(bVar, kq6Var);
        interfaceC5415eo.onVideoInputFormatChanged(bVar, kq6Var, wl3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoSizeChanged$56(InterfaceC5415eo.b bVar, z7i z7iVar, InterfaceC5415eo interfaceC5415eo) {
        interfaceC5415eo.onVideoSizeChanged(bVar, z7iVar);
        interfaceC5415eo.onVideoSizeChanged(bVar, z7iVar.f104349a, z7iVar.f104350b, z7iVar.f104351c, z7iVar.f104352d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlayer$1(lzc lzcVar, InterfaceC5415eo interfaceC5415eo, i36 i36Var) {
        interfaceC5415eo.onEvents(lzcVar, new InterfaceC5415eo.c(i36Var, this.f11721e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 1028, new za9.InterfaceC16057a() { // from class: io3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onPlayerReleased(bVarM2628r0);
            }
        });
        this.f11722f.release();
    }

    @Override // p000.InterfaceC12162rn
    @un1
    public void addListener(InterfaceC5415eo interfaceC5415eo) {
        u80.checkNotNull(interfaceC5415eo);
        this.f11722f.add(interfaceC5415eo);
    }

    @Override // p000.InterfaceC12162rn
    public final void notifySeekStarted() {
        if (this.f11716F) {
            return;
        }
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        this.f11716F = true;
        m2630t0(bVarM2628r0, -1, new za9.InterfaceC16057a() { // from class: xn3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onSeekStarted(bVarM2628r0);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onAudioAttributesChanged(final yc0 yc0Var) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 20, new za9.InterfaceC16057a() { // from class: zm3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onAudioAttributesChanged(bVarGenerateReadingMediaPeriodEventTime, yc0Var);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onAudioCodecError(final Exception exc) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1029, new za9.InterfaceC16057a() { // from class: dn3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onAudioCodecError(bVarGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onAudioDecoderInitialized(final String str, final long j, final long j2) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1008, new za9.InterfaceC16057a() { // from class: sm3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                as3.lambda$onAudioDecoderInitialized$4(bVarGenerateReadingMediaPeriodEventTime, str, j2, j, (InterfaceC5415eo) obj);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onAudioDecoderReleased(final String str) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1012, new za9.InterfaceC16057a() { // from class: pp3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onAudioDecoderReleased(bVarGenerateReadingMediaPeriodEventTime, str);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onAudioDisabled(final nl3 nl3Var) {
        final InterfaceC5415eo.b bVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        m2630t0(bVarGeneratePlayingMediaPeriodEventTime, 1013, new za9.InterfaceC16057a() { // from class: np3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onAudioDisabled(bVarGeneratePlayingMediaPeriodEventTime, nl3Var);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onAudioEnabled(final nl3 nl3Var) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1007, new za9.InterfaceC16057a() { // from class: tq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onAudioEnabled(bVarGenerateReadingMediaPeriodEventTime, nl3Var);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onAudioInputFormatChanged(final kq6 kq6Var, @hib final wl3 wl3Var) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1009, new za9.InterfaceC16057a() { // from class: hn3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                as3.lambda$onAudioInputFormatChanged$5(bVarGenerateReadingMediaPeriodEventTime, kq6Var, wl3Var, (InterfaceC5415eo) obj);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onAudioPositionAdvancing(final long j) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1010, new za9.InterfaceC16057a() { // from class: tp3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onAudioPositionAdvancing(bVarGenerateReadingMediaPeriodEventTime, j);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onAudioSessionIdChanged(final int i) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 21, new za9.InterfaceC16057a() { // from class: zn3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onAudioSessionIdChanged(bVarGenerateReadingMediaPeriodEventTime, i);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onAudioSinkError(final Exception exc) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1014, new za9.InterfaceC16057a() { // from class: jq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onAudioSinkError(bVarGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onAudioUnderrun(final int i, final long j, final long j2) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1011, new za9.InterfaceC16057a() { // from class: jn3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onAudioUnderrun(bVarGenerateReadingMediaPeriodEventTime, i, j, j2);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onAvailableCommandsChanged(final lzc.C9045c c9045c) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 13, new za9.InterfaceC16057a() { // from class: vo3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onAvailableCommandsChanged(bVarM2628r0, c9045c);
            }
        });
    }

    @Override // p000.vp0.InterfaceC14197a
    public final void onBandwidthSample(final int i, final long j, final long j2) {
        final InterfaceC5415eo.b bVarGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        m2630t0(bVarGenerateLoadingMediaPeriodEventTime, 1006, new za9.InterfaceC16057a() { // from class: ko3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onBandwidthEstimate(bVarGenerateLoadingMediaPeriodEventTime, i, j, j2);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onCues(final List<o93> list) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 27, new za9.InterfaceC16057a() { // from class: xp3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onCues(bVarM2628r0, (List<o93>) list);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onDeviceInfoChanged(final p84 p84Var) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 29, new za9.InterfaceC16057a() { // from class: fr3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onDeviceInfoChanged(bVarM2628r0, p84Var);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onDeviceVolumeChanged(final int i, final boolean z) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 30, new za9.InterfaceC16057a() { // from class: hr3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onDeviceVolumeChanged(bVarM2628r0, i, z);
            }
        });
    }

    @Override // p000.koa
    public final void onDownstreamFormatChanged(int i, @hib vna.C14175b c14175b, final ega egaVar) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1004, new za9.InterfaceC16057a() { // from class: do3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onDownstreamFormatChanged(bVarGenerateMediaPeriodEventTime, egaVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public final void onDrmKeysLoaded(int i, @hib vna.C14175b c14175b) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1023, new za9.InterfaceC16057a() { // from class: hp3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onDrmKeysLoaded(bVarGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public final void onDrmKeysRemoved(int i, @hib vna.C14175b c14175b) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1026, new za9.InterfaceC16057a() { // from class: yq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onDrmKeysRemoved(bVarGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public final void onDrmKeysRestored(int i, @hib vna.C14175b c14175b) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1025, new za9.InterfaceC16057a() { // from class: dr3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onDrmKeysRestored(bVarGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public final void onDrmSessionAcquired(int i, @hib vna.C14175b c14175b, final int i2) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1022, new za9.InterfaceC16057a() { // from class: zq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                as3.lambda$onDrmSessionAcquired$61(bVarGenerateMediaPeriodEventTime, i2, (InterfaceC5415eo) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public final void onDrmSessionManagerError(int i, @hib vna.C14175b c14175b, final Exception exc) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1024, new za9.InterfaceC16057a() { // from class: pq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onDrmSessionManagerError(bVarGenerateMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC3005e
    public final void onDrmSessionReleased(int i, @hib vna.C14175b c14175b) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1027, new za9.InterfaceC16057a() { // from class: vp3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onDrmSessionReleased(bVarGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onDroppedFrames(final int i, final long j) {
        final InterfaceC5415eo.b bVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        m2630t0(bVarGeneratePlayingMediaPeriodEventTime, 1018, new za9.InterfaceC16057a() { // from class: dq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onDroppedVideoFrames(bVarGeneratePlayingMediaPeriodEventTime, i, j);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onEvents(lzc lzcVar, lzc.C9048f c9048f) {
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onIsLoadingChanged(final boolean z) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 3, new za9.InterfaceC16057a() { // from class: tr3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                as3.lambda$onIsLoadingChanged$32(bVarM2628r0, z, (InterfaceC5415eo) obj);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onIsPlayingChanged(final boolean z) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 7, new za9.InterfaceC16057a() { // from class: xm3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onIsPlayingChanged(bVarM2628r0, z);
            }
        });
    }

    @Override // p000.koa
    public final void onLoadCanceled(int i, @hib vna.C14175b c14175b, final jc9 jc9Var, final ega egaVar) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1002, new za9.InterfaceC16057a() { // from class: xr3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onLoadCanceled(bVarGenerateMediaPeriodEventTime, jc9Var, egaVar);
            }
        });
    }

    @Override // p000.koa
    public final void onLoadCompleted(int i, @hib vna.C14175b c14175b, final jc9 jc9Var, final ega egaVar) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1001, new za9.InterfaceC16057a() { // from class: tn3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onLoadCompleted(bVarGenerateMediaPeriodEventTime, jc9Var, egaVar);
            }
        });
    }

    @Override // p000.koa
    public final void onLoadError(int i, @hib vna.C14175b c14175b, final jc9 jc9Var, final ega egaVar, final IOException iOException, final boolean z) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1003, new za9.InterfaceC16057a() { // from class: no3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onLoadError(bVarGenerateMediaPeriodEventTime, jc9Var, egaVar, iOException, z);
            }
        });
    }

    @Override // p000.koa
    public final void onLoadStarted(int i, @hib vna.C14175b c14175b, final jc9 jc9Var, final ega egaVar) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1000, new za9.InterfaceC16057a() { // from class: cq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onLoadStarted(bVarGenerateMediaPeriodEventTime, jc9Var, egaVar);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onLoadingChanged(boolean z) {
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onMaxSeekToPreviousPositionChanged(final long j) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 18, new za9.InterfaceC16057a() { // from class: nr3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onMaxSeekToPreviousPositionChanged(bVarM2628r0, j);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onMediaItemTransition(@hib final aga agaVar, final int i) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 1, new za9.InterfaceC16057a() { // from class: ro3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onMediaItemTransition(bVarM2628r0, agaVar, i);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onMediaMetadataChanged(final iga igaVar) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 14, new za9.InterfaceC16057a() { // from class: mn3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onMediaMetadataChanged(bVarM2628r0, igaVar);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onMetadata(final Metadata metadata) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 28, new za9.InterfaceC16057a() { // from class: jr3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onMetadata(bVarM2628r0, metadata);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 5, new za9.InterfaceC16057a() { // from class: on3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onPlayWhenReadyChanged(bVarM2628r0, z, i);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onPlaybackParametersChanged(final qyc qycVar) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 12, new za9.InterfaceC16057a() { // from class: rn3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onPlaybackParametersChanged(bVarM2628r0, qycVar);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onPlaybackStateChanged(final int i) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 4, new za9.InterfaceC16057a() { // from class: bp3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onPlaybackStateChanged(bVarM2628r0, i);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 6, new za9.InterfaceC16057a() { // from class: hq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onPlaybackSuppressionReasonChanged(bVarM2628r0, i);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onPlayerError(final lyc lycVar) {
        final InterfaceC5415eo.b eventTimeForErrorEvent = getEventTimeForErrorEvent(lycVar);
        m2630t0(eventTimeForErrorEvent, 10, new za9.InterfaceC16057a() { // from class: po3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onPlayerError(eventTimeForErrorEvent, lycVar);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onPlayerErrorChanged(@hib final lyc lycVar) {
        final InterfaceC5415eo.b eventTimeForErrorEvent = getEventTimeForErrorEvent(lycVar);
        m2630t0(eventTimeForErrorEvent, 10, new za9.InterfaceC16057a() { // from class: fq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onPlayerErrorChanged(eventTimeForErrorEvent, lycVar);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, -1, new za9.InterfaceC16057a() { // from class: vn3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onPlayerStateChanged(bVarM2628r0, z, i);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onPlaylistMetadataChanged(final iga igaVar) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 15, new za9.InterfaceC16057a() { // from class: fo3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onPlaylistMetadataChanged(bVarM2628r0, igaVar);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onPositionDiscontinuity(int i) {
    }

    @Override // p000.InterfaceC12162rn
    public final void onRenderedFirstFrame(final Object obj, final long j) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 26, new za9.InterfaceC16057a() { // from class: tm3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj2) {
                ((InterfaceC5415eo) obj2).onRenderedFirstFrame(bVarGenerateReadingMediaPeriodEventTime, obj, j);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onRepeatModeChanged(final int i) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 8, new za9.InterfaceC16057a() { // from class: rp3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onRepeatModeChanged(bVarM2628r0, i);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onSeekBackIncrementChanged(final long j) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 16, new za9.InterfaceC16057a() { // from class: qm3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onSeekBackIncrementChanged(bVarM2628r0, j);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onSeekForwardIncrementChanged(final long j) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 17, new za9.InterfaceC16057a() { // from class: om3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onSeekForwardIncrementChanged(bVarM2628r0, j);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onShuffleModeEnabledChanged(final boolean z) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 9, new za9.InterfaceC16057a() { // from class: fn3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onShuffleModeChanged(bVarM2628r0, z);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 23, new za9.InterfaceC16057a() { // from class: vm3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onSkipSilenceEnabledChanged(bVarGenerateReadingMediaPeriodEventTime, z);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onSurfaceSizeChanged(final int i, final int i2) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 24, new za9.InterfaceC16057a() { // from class: lo3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onSurfaceSizeChanged(bVarGenerateReadingMediaPeriodEventTime, i, i2);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onTimelineChanged(t1h t1hVar, final int i) {
        this.f11720d.onTimelineChanged((lzc) u80.checkNotNull(this.f11723m));
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 0, new za9.InterfaceC16057a() { // from class: wq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onTimelineChanged(bVarM2628r0, i);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onTrackSelectionParametersChanged(final j7h j7hVar) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 19, new za9.InterfaceC16057a() { // from class: lp3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onTrackSelectionParametersChanged(bVarM2628r0, j7hVar);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onTracksChanged(final y7h y7hVar) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 2, new za9.InterfaceC16057a() { // from class: aq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onTracksChanged(bVarM2628r0, y7hVar);
            }
        });
    }

    @Override // p000.koa
    public final void onUpstreamDiscarded(int i, @hib vna.C14175b c14175b, final ega egaVar) {
        final InterfaceC5415eo.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c14175b);
        m2630t0(bVarGenerateMediaPeriodEventTime, 1005, new za9.InterfaceC16057a() { // from class: nq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onUpstreamDiscarded(bVarGenerateMediaPeriodEventTime, egaVar);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onVideoCodecError(final Exception exc) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1030, new za9.InterfaceC16057a() { // from class: bn3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onVideoCodecError(bVarGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onVideoDecoderInitialized(final String str, final long j, final long j2) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1016, new za9.InterfaceC16057a() { // from class: ep3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                as3.lambda$onVideoDecoderInitialized$14(bVarGenerateReadingMediaPeriodEventTime, str, j2, j, (InterfaceC5415eo) obj);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onVideoDecoderReleased(final String str) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1019, new za9.InterfaceC16057a() { // from class: lr3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onVideoDecoderReleased(bVarGenerateReadingMediaPeriodEventTime, str);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onVideoDisabled(final nl3 nl3Var) {
        final InterfaceC5415eo.b bVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        m2630t0(bVarGeneratePlayingMediaPeriodEventTime, 1020, new za9.InterfaceC16057a() { // from class: gp3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onVideoDisabled(bVarGeneratePlayingMediaPeriodEventTime, nl3Var);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onVideoEnabled(final nl3 nl3Var) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1015, new za9.InterfaceC16057a() { // from class: zo3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onVideoEnabled(bVarGenerateReadingMediaPeriodEventTime, nl3Var);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onVideoFrameProcessingOffset(final long j, final int i) {
        final InterfaceC5415eo.b bVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        m2630t0(bVarGeneratePlayingMediaPeriodEventTime, 1021, new za9.InterfaceC16057a() { // from class: lq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onVideoFrameProcessingOffset(bVarGeneratePlayingMediaPeriodEventTime, j, i);
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    public final void onVideoInputFormatChanged(final kq6 kq6Var, @hib final wl3 wl3Var) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 1017, new za9.InterfaceC16057a() { // from class: xo3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                as3.lambda$onVideoInputFormatChanged$15(bVarGenerateReadingMediaPeriodEventTime, kq6Var, wl3Var, (InterfaceC5415eo) obj);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onVideoSizeChanged(final z7i z7iVar) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 25, new za9.InterfaceC16057a() { // from class: vr3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                as3.lambda$onVideoSizeChanged$56(bVarGenerateReadingMediaPeriodEventTime, z7iVar, (InterfaceC5415eo) obj);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onVolumeChanged(final float f) {
        final InterfaceC5415eo.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m2630t0(bVarGenerateReadingMediaPeriodEventTime, 22, new za9.InterfaceC16057a() { // from class: br3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onVolumeChanged(bVarGenerateReadingMediaPeriodEventTime, f);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC5415eo.b m2628r0() {
        return generateEventTime(this.f11720d.getCurrentPlayerMediaPeriod());
    }

    @Override // p000.InterfaceC12162rn
    @un1
    public void release() {
        ((pe7) u80.checkStateNotNull(this.f11715C)).post(new Runnable() { // from class: pn3
            @Override // java.lang.Runnable
            public final void run() {
                this.f71479a.releaseInternal();
            }
        });
    }

    @Override // p000.InterfaceC12162rn
    @un1
    public void removeListener(InterfaceC5415eo interfaceC5415eo) {
        this.f11722f.remove(interfaceC5415eo);
    }

    @g5e({"player"})
    /* JADX INFO: renamed from: s0 */
    public final InterfaceC5415eo.b m2629s0(t1h t1hVar, int i, @hib vna.C14175b c14175b) {
        vna.C14175b c14175b2 = t1hVar.isEmpty() ? null : c14175b;
        long jElapsedRealtime = this.f11717a.elapsedRealtime();
        boolean z = t1hVar.equals(this.f11723m.getCurrentTimeline()) && i == this.f11723m.getCurrentMediaItemIndex();
        long defaultPositionMs = 0;
        if (c14175b2 == null || !c14175b2.isAd()) {
            if (z) {
                defaultPositionMs = this.f11723m.getContentPosition();
            } else if (!t1hVar.isEmpty()) {
                defaultPositionMs = t1hVar.getWindow(i, this.f11719c).getDefaultPositionMs();
            }
        } else if (z && this.f11723m.getCurrentAdGroupIndex() == c14175b2.f71107b && this.f11723m.getCurrentAdIndexInAdGroup() == c14175b2.f71108c) {
            defaultPositionMs = this.f11723m.getCurrentPosition();
        }
        return new InterfaceC5415eo.b(jElapsedRealtime, t1hVar, i, c14175b2, defaultPositionMs, this.f11723m.getCurrentTimeline(), this.f11723m.getCurrentMediaItemIndex(), this.f11720d.getCurrentPlayerMediaPeriod(), this.f11723m.getCurrentPosition(), this.f11723m.getTotalBufferedDuration());
    }

    @Override // p000.InterfaceC12162rn
    @un1
    public void setPlayer(final lzc lzcVar, Looper looper) {
        u80.checkState(this.f11723m == null || this.f11720d.f11725b.isEmpty());
        this.f11723m = (lzc) u80.checkNotNull(lzcVar);
        this.f11715C = this.f11717a.createHandler(looper, null);
        this.f11722f = this.f11722f.copy(looper, new za9.InterfaceC16058b() { // from class: bo3
            @Override // p000.za9.InterfaceC16058b
            public final void invoke(Object obj, i36 i36Var) {
                this.f14241a.lambda$setPlayer$1(lzcVar, (InterfaceC5415eo) obj, i36Var);
            }
        });
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.f11722f.setThrowsWhenUsingWrongThread(z);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m2630t0(InterfaceC5415eo.b bVar, int i, za9.InterfaceC16057a<InterfaceC5415eo> interfaceC16057a) {
        this.f11721e.put(i, bVar);
        this.f11722f.sendEvent(i, interfaceC16057a);
    }

    @Override // p000.InterfaceC12162rn
    public final void updateMediaPeriodQueueInfo(List<vna.C14175b> list, @hib vna.C14175b c14175b) {
        this.f11720d.onQueueUpdated(list, c14175b, (lzc) u80.checkNotNull(this.f11723m));
    }

    @Override // p000.lzc.InterfaceC9049g
    public final void onPositionDiscontinuity(final lzc.C9053k c9053k, final lzc.C9053k c9053k2, final int i) {
        if (i == 1) {
            this.f11716F = false;
        }
        this.f11720d.onPositionDiscontinuity((lzc) u80.checkNotNull(this.f11723m));
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 11, new za9.InterfaceC16057a() { // from class: rq3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                as3.lambda$onPositionDiscontinuity$43(bVarM2628r0, i, c9053k, c9053k2, (InterfaceC5415eo) obj);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onCues(final y93 y93Var) {
        final InterfaceC5415eo.b bVarM2628r0 = m2628r0();
        m2630t0(bVarM2628r0, 27, new za9.InterfaceC16057a() { // from class: to3
            @Override // p000.za9.InterfaceC16057a
            public final void invoke(Object obj) {
                ((InterfaceC5415eo) obj).onCues(bVarM2628r0, y93Var);
            }
        });
    }

    @Override // p000.lzc.InterfaceC9049g
    public void onRenderedFirstFrame() {
    }
}

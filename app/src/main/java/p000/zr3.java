package p000;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.C1213a;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p000.InterfaceC2409co;
import p000.bh0;
import p000.izc;
import p000.ox7;
import p000.q1h;
import p000.una;
import p000.ya9;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class zr3 implements InterfaceC12680sn {

    /* JADX INFO: renamed from: C */
    public oe7 f105800C;

    /* JADX INFO: renamed from: F */
    public boolean f105801F;

    /* JADX INFO: renamed from: a */
    public final j52 f105802a;

    /* JADX INFO: renamed from: b */
    public final q1h.C11270b f105803b;

    /* JADX INFO: renamed from: c */
    public final q1h.C11272d f105804c;

    /* JADX INFO: renamed from: d */
    public final C16222a f105805d;

    /* JADX INFO: renamed from: e */
    public final SparseArray<InterfaceC2409co.b> f105806e;

    /* JADX INFO: renamed from: f */
    public ya9<InterfaceC2409co> f105807f;

    /* JADX INFO: renamed from: m */
    public izc f105808m;

    /* JADX INFO: renamed from: zr3$a */
    public static final class C16222a {

        /* JADX INFO: renamed from: a */
        public final q1h.C11270b f105809a;

        /* JADX INFO: renamed from: b */
        public kx7<una.C13612b> f105810b = kx7.m15110of();

        /* JADX INFO: renamed from: c */
        public ox7<una.C13612b, q1h> f105811c = ox7.m19076of();

        /* JADX INFO: renamed from: d */
        @hib
        public una.C13612b f105812d;

        /* JADX INFO: renamed from: e */
        public una.C13612b f105813e;

        /* JADX INFO: renamed from: f */
        public una.C13612b f105814f;

        public C16222a(q1h.C11270b c11270b) {
            this.f105809a = c11270b;
        }

        private void addTimelineForMediaPeriodId(ox7.C10705d<una.C13612b, q1h> c10705d, @hib una.C13612b c13612b, q1h q1hVar) {
            if (c13612b == null) {
                return;
            }
            if (q1hVar.getIndexOfPeriod(c13612b.f88603a) != -1) {
                c10705d.put(c13612b, q1hVar);
                return;
            }
            q1h q1hVar2 = this.f105811c.get(c13612b);
            if (q1hVar2 != null) {
                c10705d.put(c13612b, q1hVar2);
            }
        }

        @hib
        private static una.C13612b findCurrentPlayerMediaPeriodInQueue(izc izcVar, kx7<una.C13612b> kx7Var, @hib una.C13612b c13612b, q1h.C11270b c11270b) {
            q1h currentTimeline = izcVar.getCurrentTimeline();
            int currentPeriodIndex = izcVar.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (izcVar.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, c11270b).getAdGroupIndexAfterPositionUs(t0i.msToUs(izcVar.getCurrentPosition()) - c11270b.getPositionInWindowUs());
            for (int i = 0; i < kx7Var.size(); i++) {
                una.C13612b c13612b2 = kx7Var.get(i);
                if (isMatchingMediaPeriod(c13612b2, uidOfPeriod, izcVar.isPlayingAd(), izcVar.getCurrentAdGroupIndex(), izcVar.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return c13612b2;
                }
            }
            if (kx7Var.isEmpty() && c13612b != null) {
                if (isMatchingMediaPeriod(c13612b, uidOfPeriod, izcVar.isPlayingAd(), izcVar.getCurrentAdGroupIndex(), izcVar.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return c13612b;
                }
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(una.C13612b c13612b, @hib Object obj, boolean z, int i, int i2, int i3) {
            if (c13612b.f88603a.equals(obj)) {
                return (z && c13612b.f88604b == i && c13612b.f88605c == i2) || (!z && c13612b.f88604b == -1 && c13612b.f88607e == i3);
            }
            return false;
        }

        private void updateMediaPeriodTimelines(q1h q1hVar) {
            ox7.C10705d<una.C13612b, q1h> c10705dBuilder = ox7.builder();
            if (this.f105810b.isEmpty()) {
                addTimelineForMediaPeriodId(c10705dBuilder, this.f105813e, q1hVar);
                if (!Objects.equals(this.f105814f, this.f105813e)) {
                    addTimelineForMediaPeriodId(c10705dBuilder, this.f105814f, q1hVar);
                }
                if (!Objects.equals(this.f105812d, this.f105813e) && !Objects.equals(this.f105812d, this.f105814f)) {
                    addTimelineForMediaPeriodId(c10705dBuilder, this.f105812d, q1hVar);
                }
            } else {
                for (int i = 0; i < this.f105810b.size(); i++) {
                    addTimelineForMediaPeriodId(c10705dBuilder, this.f105810b.get(i), q1hVar);
                }
                if (!this.f105810b.contains(this.f105812d)) {
                    addTimelineForMediaPeriodId(c10705dBuilder, this.f105812d, q1hVar);
                }
            }
            this.f105811c = c10705dBuilder.buildOrThrow();
        }

        @hib
        public una.C13612b getCurrentPlayerMediaPeriod() {
            return this.f105812d;
        }

        @hib
        public una.C13612b getLoadingMediaPeriod() {
            if (this.f105810b.isEmpty()) {
                return null;
            }
            return (una.C13612b) vg8.getLast(this.f105810b);
        }

        @hib
        public q1h getMediaPeriodIdTimeline(una.C13612b c13612b) {
            return this.f105811c.get(c13612b);
        }

        @hib
        public una.C13612b getPlayingMediaPeriod() {
            return this.f105813e;
        }

        @hib
        public una.C13612b getReadingMediaPeriod() {
            return this.f105814f;
        }

        public void onPositionDiscontinuity(izc izcVar) {
            this.f105812d = findCurrentPlayerMediaPeriodInQueue(izcVar, this.f105810b, this.f105813e, this.f105809a);
        }

        public void onQueueUpdated(List<una.C13612b> list, @hib una.C13612b c13612b, izc izcVar) {
            this.f105810b = kx7.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.f105813e = list.get(0);
                this.f105814f = (una.C13612b) v80.checkNotNull(c13612b);
            }
            if (this.f105812d == null) {
                this.f105812d = findCurrentPlayerMediaPeriodInQueue(izcVar, this.f105810b, this.f105813e, this.f105809a);
            }
            updateMediaPeriodTimelines(izcVar.getCurrentTimeline());
        }

        public void onTimelineChanged(izc izcVar) {
            this.f105812d = findCurrentPlayerMediaPeriodInQueue(izcVar, this.f105810b, this.f105813e, this.f105809a);
            updateMediaPeriodTimelines(izcVar.getCurrentTimeline());
        }
    }

    public zr3(j52 j52Var) {
        this.f105802a = (j52) v80.checkNotNull(j52Var);
        this.f105807f = new ya9<>(t0i.getCurrentOrMainLooper(), j52Var, new ya9.InterfaceC15591b() { // from class: cp3
            @Override // p000.ya9.InterfaceC15591b
            public final void invoke(Object obj, h36 h36Var) {
                zr3.lambda$new$0((InterfaceC2409co) obj, h36Var);
            }
        });
        q1h.C11270b c11270b = new q1h.C11270b();
        this.f105803b = c11270b;
        this.f105804c = new q1h.C11272d();
        this.f105805d = new C16222a(c11270b);
        this.f105806e = new SparseArray<>();
    }

    private InterfaceC2409co.b generateEventTime(@hib una.C13612b c13612b) {
        v80.checkNotNull(this.f105808m);
        q1h mediaPeriodIdTimeline = c13612b == null ? null : this.f105805d.getMediaPeriodIdTimeline(c13612b);
        if (c13612b != null && mediaPeriodIdTimeline != null) {
            return m27032v0(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(c13612b.f88603a, this.f105803b).f72946c, c13612b);
        }
        int currentMediaItemIndex = this.f105808m.getCurrentMediaItemIndex();
        q1h currentTimeline = this.f105808m.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = q1h.f72935a;
        }
        return m27032v0(currentTimeline, currentMediaItemIndex, null);
    }

    private InterfaceC2409co.b generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.f105805d.getLoadingMediaPeriod());
    }

    private InterfaceC2409co.b generateMediaPeriodEventTime(int i, @hib una.C13612b c13612b) {
        v80.checkNotNull(this.f105808m);
        if (c13612b != null) {
            return this.f105805d.getMediaPeriodIdTimeline(c13612b) != null ? generateEventTime(c13612b) : m27032v0(q1h.f72935a, i, c13612b);
        }
        q1h currentTimeline = this.f105808m.getCurrentTimeline();
        if (i >= currentTimeline.getWindowCount()) {
            currentTimeline = q1h.f72935a;
        }
        return m27032v0(currentTimeline, i, null);
    }

    private InterfaceC2409co.b generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.f105805d.getPlayingMediaPeriod());
    }

    private InterfaceC2409co.b generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.f105805d.getReadingMediaPeriod());
    }

    private InterfaceC2409co.b getEventTimeForErrorEvent(@hib kyc kycVar) {
        una.C13612b c13612b;
        return (!(kycVar instanceof aa5) || (c13612b = ((aa5) kycVar).f812X2) == null) ? m27031u0() : generateEventTime(c13612b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(InterfaceC2409co interfaceC2409co, h36 h36Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioDecoderInitialized$5(InterfaceC2409co.b bVar, String str, long j, long j2, InterfaceC2409co interfaceC2409co) {
        interfaceC2409co.onAudioDecoderInitialized(bVar, str, j);
        interfaceC2409co.onAudioDecoderInitialized(bVar, str, j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDrmSessionAcquired$64(InterfaceC2409co.b bVar, int i, InterfaceC2409co interfaceC2409co) {
        interfaceC2409co.onDrmSessionAcquired(bVar);
        interfaceC2409co.onDrmSessionAcquired(bVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIsLoadingChanged$35(InterfaceC2409co.b bVar, boolean z, InterfaceC2409co interfaceC2409co) {
        interfaceC2409co.onLoadingChanged(bVar, z);
        interfaceC2409co.onIsLoadingChanged(bVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onLoadStarted$26(InterfaceC2409co.b bVar, kc9 kc9Var, fga fgaVar, int i, InterfaceC2409co interfaceC2409co) {
        interfaceC2409co.onLoadStarted(bVar, kc9Var, fgaVar);
        interfaceC2409co.onLoadStarted(bVar, kc9Var, fgaVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPositionDiscontinuity$46(InterfaceC2409co.b bVar, int i, izc.C7684k c7684k, izc.C7684k c7684k2, InterfaceC2409co interfaceC2409co) {
        interfaceC2409co.onPositionDiscontinuity(bVar, i);
        interfaceC2409co.onPositionDiscontinuity(bVar, c7684k, c7684k2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoDecoderInitialized$17(InterfaceC2409co.b bVar, String str, long j, long j2, InterfaceC2409co interfaceC2409co) {
        interfaceC2409co.onVideoDecoderInitialized(bVar, str, j);
        interfaceC2409co.onVideoDecoderInitialized(bVar, str, j2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoSizeChanged$59(InterfaceC2409co.b bVar, a8i a8iVar, InterfaceC2409co interfaceC2409co) {
        interfaceC2409co.onVideoSizeChanged(bVar, a8iVar);
        interfaceC2409co.onVideoSizeChanged(bVar, a8iVar.f647a, a8iVar.f648b, 0, a8iVar.f650d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlayer$1(izc izcVar, InterfaceC2409co interfaceC2409co, h36 h36Var) {
        interfaceC2409co.onEvents(izcVar, new InterfaceC2409co.c(h36Var, this.f105806e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 1028, new ya9.InterfaceC15590a() { // from class: um3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onPlayerReleased(bVarM27031u0);
            }
        });
        this.f105807f.release();
    }

    @Override // p000.InterfaceC12680sn
    @un1
    public void addListener(InterfaceC2409co interfaceC2409co) {
        v80.checkNotNull(interfaceC2409co);
        this.f105807f.add(interfaceC2409co);
    }

    @Override // p000.InterfaceC12680sn
    public final void notifySeekStarted() {
        if (this.f105801F) {
            return;
        }
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        this.f105801F = true;
        m27033w0(bVarM27031u0, -1, new ya9.InterfaceC15590a() { // from class: oq3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onSeekStarted(bVarM27031u0);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onAudioAttributesChanged(final uc0 uc0Var) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 20, new ya9.InterfaceC15590a() { // from class: ao3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioAttributesChanged(bVarGenerateReadingMediaPeriodEventTime, uc0Var);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onAudioCodecError(final Exception exc) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1029, new ya9.InterfaceC15590a() { // from class: gr3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioCodecError(bVarGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onAudioDecoderInitialized(final String str, final long j, final long j2) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1008, new ya9.InterfaceC15590a() { // from class: jo3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                zr3.lambda$onAudioDecoderInitialized$5(bVarGenerateReadingMediaPeriodEventTime, str, j2, j, (InterfaceC2409co) obj);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onAudioDecoderReleased(final String str) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1012, new ya9.InterfaceC15590a() { // from class: cn3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioDecoderReleased(bVarGenerateReadingMediaPeriodEventTime, str);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onAudioDisabled(final ol3 ol3Var) {
        final InterfaceC2409co.b bVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        m27033w0(bVarGeneratePlayingMediaPeriodEventTime, 1013, new ya9.InterfaceC15590a() { // from class: mp3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioDisabled(bVarGeneratePlayingMediaPeriodEventTime, ol3Var);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onAudioEnabled(final ol3 ol3Var) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1007, new ya9.InterfaceC15590a() { // from class: wm3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioEnabled(bVarGenerateReadingMediaPeriodEventTime, ol3Var);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onAudioInputFormatChanged(final C1213a c1213a, @hib final vl3 vl3Var) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1009, new ya9.InterfaceC15590a() { // from class: qq3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioInputFormatChanged(bVarGenerateReadingMediaPeriodEventTime, c1213a, vl3Var);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onAudioPositionAdvancing(final long j) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1010, new ya9.InterfaceC15590a() { // from class: eo3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioPositionAdvancing(bVarGenerateReadingMediaPeriodEventTime, j);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onAudioSessionIdChanged(final int i) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 21, new ya9.InterfaceC15590a() { // from class: iq3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioSessionIdChanged(bVarGenerateReadingMediaPeriodEventTime, i);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onAudioSinkError(final Exception exc) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1014, new ya9.InterfaceC15590a() { // from class: pr3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioSinkError(bVarGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public void onAudioTrackInitialized(final bh0.C1887a c1887a) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, InterfaceC2409co.f17184k0, new ya9.InterfaceC15590a() { // from class: eq3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioTrackInitialized(bVarGenerateReadingMediaPeriodEventTime, c1887a);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public void onAudioTrackReleased(final bh0.C1887a c1887a) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, InterfaceC2409co.f17186l0, new ya9.InterfaceC15590a() { // from class: mr3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioTrackReleased(bVarGenerateReadingMediaPeriodEventTime, c1887a);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onAudioUnderrun(final int i, final long j, final long j2) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1011, new ya9.InterfaceC15590a() { // from class: sn3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAudioUnderrun(bVarGenerateReadingMediaPeriodEventTime, i, j, j2);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onAvailableCommandsChanged(final izc.C7676c c7676c) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 13, new ya9.InterfaceC15590a() { // from class: en3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onAvailableCommandsChanged(bVarM27031u0, c7676c);
            }
        });
    }

    @Override // p000.up0.InterfaceC13636a
    public final void onBandwidthSample(final int i, final long j, final long j2) {
        final InterfaceC2409co.b bVarGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        m27033w0(bVarGenerateLoadingMediaPeriodEventTime, 1006, new ya9.InterfaceC15590a() { // from class: ln3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onBandwidthEstimate(bVarGenerateLoadingMediaPeriodEventTime, i, j, j2);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onCues(final List<n93> list) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 27, new ya9.InterfaceC15590a() { // from class: ap3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onCues(bVarM27031u0, (List<n93>) list);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onDeviceInfoChanged(final o84 o84Var) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 29, new ya9.InterfaceC15590a() { // from class: sp3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onDeviceInfoChanged(bVarM27031u0, o84Var);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onDeviceVolumeChanged(final int i, final boolean z) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 30, new ya9.InterfaceC15590a() { // from class: uo3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onDeviceVolumeChanged(bVarM27031u0, i, z);
            }
        });
    }

    @Override // p000.joa
    public final void onDownstreamFormatChanged(int i, @hib una.C13612b c13612b, final fga fgaVar) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1004, new ya9.InterfaceC15590a() { // from class: dp3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onDownstreamFormatChanged(bVarGenerateMediaPeriodEventTime, fgaVar);
            }
        });
    }

    @Override // p000.nr4
    public final void onDrmKeysLoaded(int i, @hib una.C13612b c13612b) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1023, new ya9.InterfaceC15590a() { // from class: kr3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onDrmKeysLoaded(bVarGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // p000.nr4
    public final void onDrmKeysRemoved(int i, @hib una.C13612b c13612b) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1026, new ya9.InterfaceC15590a() { // from class: up3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onDrmKeysRemoved(bVarGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // p000.nr4
    public final void onDrmKeysRestored(int i, @hib una.C13612b c13612b) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1025, new ya9.InterfaceC15590a() { // from class: gq3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onDrmKeysRestored(bVarGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // p000.nr4
    public final void onDrmSessionAcquired(int i, @hib una.C13612b c13612b, final int i2) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1022, new ya9.InterfaceC15590a() { // from class: qp3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                zr3.lambda$onDrmSessionAcquired$64(bVarGenerateMediaPeriodEventTime, i2, (InterfaceC2409co) obj);
            }
        });
    }

    @Override // p000.nr4
    public final void onDrmSessionManagerError(int i, @hib una.C13612b c13612b, final Exception exc) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1024, new ya9.InterfaceC15590a() { // from class: wp3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onDrmSessionManagerError(bVarGenerateMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // p000.nr4
    public final void onDrmSessionReleased(int i, @hib una.C13612b c13612b) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1027, new ya9.InterfaceC15590a() { // from class: or3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onDrmSessionReleased(bVarGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onDroppedFrames(final int i, final long j) {
        final InterfaceC2409co.b bVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        m27033w0(bVarGeneratePlayingMediaPeriodEventTime, 1018, new ya9.InterfaceC15590a() { // from class: qo3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onDroppedVideoFrames(bVarGeneratePlayingMediaPeriodEventTime, i, j);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onEvents(izc izcVar, izc.C7679f c7679f) {
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onIsLoadingChanged(final boolean z) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 3, new ya9.InterfaceC15590a() { // from class: an3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                zr3.lambda$onIsLoadingChanged$35(bVarM27031u0, z, (InterfaceC2409co) obj);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onIsPlayingChanged(final boolean z) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 7, new ya9.InterfaceC15590a() { // from class: go3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onIsPlayingChanged(bVarM27031u0, z);
            }
        });
    }

    @Override // p000.joa
    public final void onLoadCanceled(int i, @hib una.C13612b c13612b, final kc9 kc9Var, final fga fgaVar) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1002, new ya9.InterfaceC15590a() { // from class: ip3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onLoadCanceled(bVarGenerateMediaPeriodEventTime, kc9Var, fgaVar);
            }
        });
    }

    @Override // p000.joa
    public final void onLoadCompleted(int i, @hib una.C13612b c13612b, final kc9 kc9Var, final fga fgaVar) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1001, new ya9.InterfaceC15590a() { // from class: yp3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onLoadCompleted(bVarGenerateMediaPeriodEventTime, kc9Var, fgaVar);
            }
        });
    }

    @Override // p000.joa
    public final void onLoadError(int i, @hib una.C13612b c13612b, final kc9 kc9Var, final fga fgaVar, final IOException iOException, final boolean z) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1003, new ya9.InterfaceC15590a() { // from class: un3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onLoadError(bVarGenerateMediaPeriodEventTime, kc9Var, fgaVar, iOException, z);
            }
        });
    }

    @Override // p000.joa
    public final void onLoadStarted(int i, @hib una.C13612b c13612b, final kc9 kc9Var, final fga fgaVar, final int i2) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1000, new ya9.InterfaceC15590a() { // from class: wr3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                zr3.lambda$onLoadStarted$26(bVarGenerateMediaPeriodEventTime, kc9Var, fgaVar, i2, (InterfaceC2409co) obj);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onLoadingChanged(boolean z) {
    }

    @Override // p000.izc.InterfaceC7680g
    public void onMaxSeekToPreviousPositionChanged(final long j) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 18, new ya9.InterfaceC15590a() { // from class: yr3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onMaxSeekToPreviousPositionChanged(bVarM27031u0, j);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onMediaItemTransition(@hib final nfa nfaVar, final int i) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 1, new ya9.InterfaceC15590a() { // from class: in3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onMediaItemTransition(bVarM27031u0, nfaVar, i);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onMediaMetadataChanged(final hga hgaVar) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 14, new ya9.InterfaceC15590a() { // from class: qr3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onMediaMetadataChanged(bVarM27031u0, hgaVar);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onMetadata(final eta etaVar) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 28, new ya9.InterfaceC15590a() { // from class: co3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onMetadata(bVarM27031u0, etaVar);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 5, new ya9.InterfaceC15590a() { // from class: wo3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onPlayWhenReadyChanged(bVarM27031u0, z, i);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onPlaybackParametersChanged(final ryc rycVar) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 12, new ya9.InterfaceC15590a() { // from class: pm3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onPlaybackParametersChanged(bVarM27031u0, rycVar);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onPlaybackStateChanged(final int i) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 4, new ya9.InterfaceC15590a() { // from class: op3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onPlaybackStateChanged(bVarM27031u0, i);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 6, new ya9.InterfaceC15590a() { // from class: mo3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onPlaybackSuppressionReasonChanged(bVarM27031u0, i);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onPlayerError(final kyc kycVar) {
        final InterfaceC2409co.b eventTimeForErrorEvent = getEventTimeForErrorEvent(kycVar);
        m27033w0(eventTimeForErrorEvent, 10, new ya9.InterfaceC15590a() { // from class: kp3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onPlayerError(eventTimeForErrorEvent, kycVar);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onPlayerErrorChanged(@hib final kyc kycVar) {
        final InterfaceC2409co.b eventTimeForErrorEvent = getEventTimeForErrorEvent(kycVar);
        m27033w0(eventTimeForErrorEvent, 10, new ya9.InterfaceC15590a() { // from class: so3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onPlayerErrorChanged(eventTimeForErrorEvent, kycVar);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, -1, new ya9.InterfaceC15590a() { // from class: yn3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onPlayerStateChanged(bVarM27031u0, z, i);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onPlaylistMetadataChanged(final hga hgaVar) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 15, new ya9.InterfaceC15590a() { // from class: kq3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onPlaylistMetadataChanged(bVarM27031u0, hgaVar);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onPositionDiscontinuity(int i) {
    }

    @Override // p000.InterfaceC12680sn
    public final void onRenderedFirstFrame(final Object obj, final long j) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 26, new ya9.InterfaceC15590a() { // from class: cr3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj2) {
                ((InterfaceC2409co) obj2).onRenderedFirstFrame(bVarGenerateReadingMediaPeriodEventTime, obj, j);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public void onRendererReadyChanged(final int i, final int i2, final boolean z) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, InterfaceC2409co.f17188m0, new ya9.InterfaceC15590a() { // from class: yo3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onRendererReadyChanged(bVarGenerateReadingMediaPeriodEventTime, i, i2, z);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onRepeatModeChanged(final int i) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 8, new ya9.InterfaceC15590a() { // from class: ar3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onRepeatModeChanged(bVarM27031u0, i);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onSeekBackIncrementChanged(final long j) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 16, new ya9.InterfaceC15590a() { // from class: ur3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onSeekBackIncrementChanged(bVarM27031u0, j);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onSeekForwardIncrementChanged(final long j) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 17, new ya9.InterfaceC15590a() { // from class: ym3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onSeekForwardIncrementChanged(bVarM27031u0, j);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onShuffleModeEnabledChanged(final boolean z) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 9, new ya9.InterfaceC15590a() { // from class: rr3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onShuffleModeChanged(bVarM27031u0, z);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 23, new ya9.InterfaceC15590a() { // from class: kn3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onSkipSilenceEnabledChanged(bVarGenerateReadingMediaPeriodEventTime, z);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onSurfaceSizeChanged(final int i, final int i2) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 24, new ya9.InterfaceC15590a() { // from class: sr3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onSurfaceSizeChanged(bVarGenerateReadingMediaPeriodEventTime, i, i2);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onTimelineChanged(q1h q1hVar, final int i) {
        this.f105805d.onTimelineChanged((izc) v80.checkNotNull(this.f105808m));
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 0, new ya9.InterfaceC15590a() { // from class: gn3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onTimelineChanged(bVarM27031u0, i);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onTrackSelectionParametersChanged(final h7h h7hVar) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 19, new ya9.InterfaceC15590a() { // from class: rm3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onTrackSelectionParametersChanged(bVarM27031u0, h7hVar);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onTracksChanged(final x7h x7hVar) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 2, new ya9.InterfaceC15590a() { // from class: ho3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onTracksChanged(bVarM27031u0, x7hVar);
            }
        });
    }

    @Override // p000.joa
    public final void onUpstreamDiscarded(int i, @hib una.C13612b c13612b, final fga fgaVar) {
        final InterfaceC2409co.b bVarGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i, c13612b);
        m27033w0(bVarGenerateMediaPeriodEventTime, 1005, new ya9.InterfaceC15590a() { // from class: er3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onUpstreamDiscarded(bVarGenerateMediaPeriodEventTime, fgaVar);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onVideoCodecError(final Exception exc) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1030, new ya9.InterfaceC15590a() { // from class: qn3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onVideoCodecError(bVarGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onVideoDecoderInitialized(final String str, final long j, final long j2) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1016, new ya9.InterfaceC15590a() { // from class: ir3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                zr3.lambda$onVideoDecoderInitialized$17(bVarGenerateReadingMediaPeriodEventTime, str, j2, j, (InterfaceC2409co) obj);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onVideoDecoderReleased(final String str) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1019, new ya9.InterfaceC15590a() { // from class: oo3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onVideoDecoderReleased(bVarGenerateReadingMediaPeriodEventTime, str);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onVideoDisabled(final ol3 ol3Var) {
        final InterfaceC2409co.b bVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        m27033w0(bVarGeneratePlayingMediaPeriodEventTime, 1020, new ya9.InterfaceC15590a() { // from class: zp3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onVideoDisabled(bVarGeneratePlayingMediaPeriodEventTime, ol3Var);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onVideoEnabled(final ol3 ol3Var) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1015, new ya9.InterfaceC15590a() { // from class: uq3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onVideoEnabled(bVarGenerateReadingMediaPeriodEventTime, ol3Var);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onVideoFrameProcessingOffset(final long j, final int i) {
        final InterfaceC2409co.b bVarGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        m27033w0(bVarGeneratePlayingMediaPeriodEventTime, 1021, new ya9.InterfaceC15590a() { // from class: fp3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onVideoFrameProcessingOffset(bVarGeneratePlayingMediaPeriodEventTime, j, i);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    public final void onVideoInputFormatChanged(final C1213a c1213a, @hib final vl3 vl3Var) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 1017, new ya9.InterfaceC15590a() { // from class: bq3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onVideoInputFormatChanged(bVarGenerateReadingMediaPeriodEventTime, c1213a, vl3Var);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onVideoSizeChanged(final a8i a8iVar) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 25, new ya9.InterfaceC15590a() { // from class: mq3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                zr3.lambda$onVideoSizeChanged$59(bVarGenerateReadingMediaPeriodEventTime, a8iVar, (InterfaceC2409co) obj);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onVolumeChanged(final float f) {
        final InterfaceC2409co.b bVarGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        m27033w0(bVarGenerateReadingMediaPeriodEventTime, 22, new ya9.InterfaceC15590a() { // from class: nn3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onVolumeChanged(bVarGenerateReadingMediaPeriodEventTime, f);
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    @un1
    public void release() {
        ((oe7) v80.checkStateNotNull(this.f105800C)).post(new Runnable() { // from class: xq3
            @Override // java.lang.Runnable
            public final void run() {
                this.f98896a.releaseInternal();
            }
        });
    }

    @Override // p000.InterfaceC12680sn
    @un1
    public void removeListener(InterfaceC2409co interfaceC2409co) {
        this.f105807f.remove(interfaceC2409co);
    }

    @Override // p000.InterfaceC12680sn
    @un1
    public void setPlayer(final izc izcVar, Looper looper) {
        v80.checkState(this.f105808m == null || this.f105805d.f105810b.isEmpty());
        this.f105808m = (izc) v80.checkNotNull(izcVar);
        this.f105800C = this.f105802a.createHandler(looper, null);
        this.f105807f = this.f105807f.copy(looper, new ya9.InterfaceC15591b() { // from class: wn3
            @Override // p000.ya9.InterfaceC15591b
            public final void invoke(Object obj, h36 h36Var) {
                this.f94807a.lambda$setPlayer$1(izcVar, (InterfaceC2409co) obj, h36Var);
            }
        });
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z) {
        this.f105807f.setThrowsWhenUsingWrongThread(z);
    }

    /* JADX INFO: renamed from: u0 */
    public final InterfaceC2409co.b m27031u0() {
        return generateEventTime(this.f105805d.getCurrentPlayerMediaPeriod());
    }

    @Override // p000.InterfaceC12680sn
    public final void updateMediaPeriodQueueInfo(List<una.C13612b> list, @hib una.C13612b c13612b) {
        this.f105805d.onQueueUpdated(list, c13612b, (izc) v80.checkNotNull(this.f105808m));
    }

    @g5e({"player"})
    /* JADX INFO: renamed from: v0 */
    public final InterfaceC2409co.b m27032v0(q1h q1hVar, int i, @hib una.C13612b c13612b) {
        una.C13612b c13612b2 = q1hVar.isEmpty() ? null : c13612b;
        long jElapsedRealtime = this.f105802a.elapsedRealtime();
        boolean z = q1hVar.equals(this.f105808m.getCurrentTimeline()) && i == this.f105808m.getCurrentMediaItemIndex();
        long defaultPositionMs = 0;
        if (c13612b2 == null || !c13612b2.isAd()) {
            if (z) {
                defaultPositionMs = this.f105808m.getContentPosition();
            } else if (!q1hVar.isEmpty()) {
                defaultPositionMs = q1hVar.getWindow(i, this.f105804c).getDefaultPositionMs();
            }
        } else if (z && this.f105808m.getCurrentAdGroupIndex() == c13612b2.f88604b && this.f105808m.getCurrentAdIndexInAdGroup() == c13612b2.f88605c) {
            defaultPositionMs = this.f105808m.getCurrentPosition();
        }
        return new InterfaceC2409co.b(jElapsedRealtime, q1hVar, i, c13612b2, defaultPositionMs, this.f105808m.getCurrentTimeline(), this.f105808m.getCurrentMediaItemIndex(), this.f105805d.getCurrentPlayerMediaPeriod(), this.f105808m.getCurrentPosition(), this.f105808m.getTotalBufferedDuration());
    }

    /* JADX INFO: renamed from: w0 */
    public final void m27033w0(InterfaceC2409co.b bVar, int i, ya9.InterfaceC15590a<InterfaceC2409co> interfaceC15590a) {
        this.f105806e.put(i, bVar);
        this.f105807f.sendEvent(i, interfaceC15590a);
    }

    @Override // p000.izc.InterfaceC7680g
    public final void onPositionDiscontinuity(final izc.C7684k c7684k, final izc.C7684k c7684k2, final int i) {
        if (i == 1) {
            this.f105801F = false;
        }
        this.f105805d.onPositionDiscontinuity((izc) v80.checkNotNull(this.f105808m));
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 11, new ya9.InterfaceC15590a() { // from class: sq3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                zr3.lambda$onPositionDiscontinuity$46(bVarM27031u0, i, c7684k, c7684k2, (InterfaceC2409co) obj);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onCues(final z93 z93Var) {
        final InterfaceC2409co.b bVarM27031u0 = m27031u0();
        m27033w0(bVarM27031u0, 27, new ya9.InterfaceC15590a() { // from class: vq3
            @Override // p000.ya9.InterfaceC15590a
            public final void invoke(Object obj) {
                ((InterfaceC2409co) obj).onCues(bVarM27031u0, z93Var);
            }
        });
    }

    @Override // p000.izc.InterfaceC7680g
    public void onRenderedFirstFrame() {
    }
}

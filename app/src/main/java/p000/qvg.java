package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.AbstractC1224c;
import androidx.media3.exoplayer.InterfaceC1255s;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class qvg extends AbstractC1224c implements Handler.Callback {

    /* JADX INFO: renamed from: s2 */
    public static final String f75928s2 = "TextRenderer";

    /* JADX INFO: renamed from: t2 */
    public static final int f75929t2 = 0;

    /* JADX INFO: renamed from: u2 */
    public static final int f75930u2 = 1;

    /* JADX INFO: renamed from: v2 */
    public static final int f75931v2 = 2;

    /* JADX INFO: renamed from: w2 */
    public static final int f75932w2 = 1;

    /* JADX INFO: renamed from: V1 */
    public final q93 f75933V1;

    /* JADX INFO: renamed from: Z1 */
    public final rl3 f75934Z1;

    /* JADX INFO: renamed from: a2 */
    public aa3 f75935a2;

    /* JADX INFO: renamed from: b2 */
    public final deg f75936b2;

    /* JADX INFO: renamed from: c2 */
    public boolean f75937c2;

    /* JADX INFO: renamed from: d2 */
    public int f75938d2;

    /* JADX INFO: renamed from: e2 */
    @hib
    public aeg f75939e2;

    /* JADX INFO: renamed from: f2 */
    @hib
    public jeg f75940f2;

    /* JADX INFO: renamed from: g2 */
    @hib
    public leg f75941g2;

    /* JADX INFO: renamed from: h2 */
    @hib
    public leg f75942h2;

    /* JADX INFO: renamed from: i2 */
    public int f75943i2;

    /* JADX INFO: renamed from: j2 */
    @hib
    public final Handler f75944j2;

    /* JADX INFO: renamed from: k2 */
    public final avg f75945k2;

    /* JADX INFO: renamed from: l2 */
    public final oq6 f75946l2;

    /* JADX INFO: renamed from: m2 */
    public boolean f75947m2;

    /* JADX INFO: renamed from: n2 */
    public boolean f75948n2;

    /* JADX INFO: renamed from: o2 */
    @hib
    public C1213a f75949o2;

    /* JADX INFO: renamed from: p2 */
    public long f75950p2;

    /* JADX INFO: renamed from: q2 */
    public long f75951q2;

    /* JADX INFO: renamed from: r2 */
    public boolean f75952r2;

    public qvg(avg avgVar, @hib Looper looper) {
        this(avgVar, looper, deg.f29540a);
    }

    @g5e({"streamFormat"})
    private void assertLegacyDecodingEnabledIfRequired() {
        v80.checkState(this.f75952r2 || Objects.equals(this.f75949o2.f8291o, "application/cea-608") || Objects.equals(this.f75949o2.f8291o, "application/x-mp4-cea-608") || Objects.equals(this.f75949o2.f8291o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f75949o2.f8291o + " samples (expected " + rva.f79794T0 + ").");
    }

    private void clearOutput() {
        updateOutput(new z93(kx7.m15110of(), getPresentationTimeUs(this.f75950p2)));
    }

    @g5e({"subtitle"})
    @vbf
    private long getCurrentEventTimeUs(long j) {
        int nextEventTimeIndex = this.f75941g2.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == 0 || this.f75941g2.getEventTimeCount() == 0) {
            return this.f75941g2.f85177b;
        }
        if (nextEventTimeIndex != -1) {
            return this.f75941g2.getEventTime(nextEventTimeIndex - 1);
        }
        return this.f75941g2.getEventTime(r2.getEventTimeCount() - 1);
    }

    private long getNextEventTime() {
        if (this.f75943i2 == -1) {
            return Long.MAX_VALUE;
        }
        v80.checkNotNull(this.f75941g2);
        if (this.f75943i2 >= this.f75941g2.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.f75941g2.getEventTime(this.f75943i2);
    }

    @vbf
    private long getPresentationTimeUs(long j) {
        v80.checkState(j != -9223372036854775807L);
        return j - m1757k();
    }

    private void handleDecoderError(ceg cegVar) {
        xh9.m25145e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f75949o2, cegVar);
        clearOutput();
        replaceSubtitleDecoder();
    }

    private static boolean hasEventsAfter(@hib ydg ydgVar, long j) {
        return ydgVar != null && ydgVar.getEventTimeCount() > 0 && ydgVar.getEventTime(ydgVar.getEventTimeCount() - 1) > j;
    }

    private void initSubtitleDecoder() {
        this.f75937c2 = true;
        aeg aegVarCreateDecoder = this.f75936b2.createDecoder((C1213a) v80.checkNotNull(this.f75949o2));
        this.f75939e2 = aegVarCreateDecoder;
        aegVarCreateDecoder.setOutputStartTimeUs(m1753g());
    }

    private void invokeUpdateOutputInternal(z93 z93Var) {
        this.f75945k2.onCues(z93Var.f104441a);
        this.f75945k2.onCues(z93Var);
    }

    @vbf
    private static boolean isCuesWithTiming(C1213a c1213a) {
        return Objects.equals(c1213a.f8291o, rva.f79794T0);
    }

    @g5e({"this.cuesResolver"})
    private boolean readAndDecodeCuesWithTiming(long j) {
        if (this.f75947m2 || m1771y(this.f75946l2, this.f75934Z1, 0) != -4) {
            return false;
        }
        if (this.f75934Z1.isEndOfStream()) {
            this.f75947m2 = true;
            return false;
        }
        this.f75934Z1.flip();
        ByteBuffer byteBuffer = (ByteBuffer) v80.checkNotNull(this.f75934Z1.f78608d);
        ba3 ba3VarDecode = this.f75933V1.decode(this.f75934Z1.f78610f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f75934Z1.clear();
        return this.f75935a2.addCues(ba3VarDecode, j);
    }

    private void releaseSubtitleBuffers() {
        this.f75940f2 = null;
        this.f75943i2 = -1;
        leg legVar = this.f75941g2;
        if (legVar != null) {
            legVar.release();
            this.f75941g2 = null;
        }
        leg legVar2 = this.f75942h2;
        if (legVar2 != null) {
            legVar2.release();
            this.f75942h2 = null;
        }
    }

    private void releaseSubtitleDecoder() {
        releaseSubtitleBuffers();
        ((aeg) v80.checkNotNull(this.f75939e2)).release();
        this.f75939e2 = null;
        this.f75938d2 = 0;
    }

    @g5e({"this.cuesResolver"})
    private void renderFromCuesWithTiming(long j) {
        boolean andDecodeCuesWithTiming = readAndDecodeCuesWithTiming(j);
        long nextCueChangeTimeUs = this.f75935a2.getNextCueChangeTimeUs(this.f75950p2);
        if (nextCueChangeTimeUs == Long.MIN_VALUE && this.f75947m2 && !andDecodeCuesWithTiming) {
            this.f75948n2 = true;
        }
        if (nextCueChangeTimeUs != Long.MIN_VALUE && nextCueChangeTimeUs <= j) {
            andDecodeCuesWithTiming = true;
        }
        if (andDecodeCuesWithTiming) {
            kx7<n93> cuesAtTimeUs = this.f75935a2.getCuesAtTimeUs(j);
            long previousCueChangeTimeUs = this.f75935a2.getPreviousCueChangeTimeUs(j);
            updateOutput(new z93(cuesAtTimeUs, getPresentationTimeUs(previousCueChangeTimeUs)));
            this.f75935a2.discardCuesBeforeTimeUs(previousCueChangeTimeUs);
        }
        this.f75950p2 = j;
    }

    private void renderFromSubtitles(long j) throws ql3 {
        boolean z;
        this.f75950p2 = j;
        if (this.f75942h2 == null) {
            ((aeg) v80.checkNotNull(this.f75939e2)).setPositionUs(j);
            try {
                this.f75942h2 = ((aeg) v80.checkNotNull(this.f75939e2)).dequeueOutputBuffer();
            } catch (ceg e) {
                handleDecoderError(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f75941g2 != null) {
            long nextEventTime = getNextEventTime();
            z = false;
            while (nextEventTime <= j) {
                this.f75943i2++;
                nextEventTime = getNextEventTime();
                z = true;
            }
        } else {
            z = false;
        }
        leg legVar = this.f75942h2;
        if (legVar != null) {
            if (legVar.isEndOfStream()) {
                if (!z && getNextEventTime() == Long.MAX_VALUE) {
                    if (this.f75938d2 == 2) {
                        replaceSubtitleDecoder();
                    } else {
                        releaseSubtitleBuffers();
                        this.f75948n2 = true;
                    }
                }
            } else if (legVar.f85177b <= j) {
                leg legVar2 = this.f75941g2;
                if (legVar2 != null) {
                    legVar2.release();
                }
                this.f75943i2 = legVar.getNextEventTimeIndex(j);
                this.f75941g2 = legVar;
                this.f75942h2 = null;
                z = true;
            }
        }
        if (z) {
            v80.checkNotNull(this.f75941g2);
            updateOutput(new z93(this.f75941g2.getCues(j), getPresentationTimeUs(getCurrentEventTimeUs(j))));
        }
        if (this.f75938d2 == 2) {
            return;
        }
        while (!this.f75947m2) {
            try {
                jeg jegVarDequeueInputBuffer = this.f75940f2;
                if (jegVarDequeueInputBuffer == null) {
                    jegVarDequeueInputBuffer = ((aeg) v80.checkNotNull(this.f75939e2)).dequeueInputBuffer();
                    if (jegVarDequeueInputBuffer == null) {
                        return;
                    } else {
                        this.f75940f2 = jegVarDequeueInputBuffer;
                    }
                }
                if (this.f75938d2 == 1) {
                    jegVarDequeueInputBuffer.setFlags(4);
                    ((aeg) v80.checkNotNull(this.f75939e2)).queueInputBuffer(jegVarDequeueInputBuffer);
                    this.f75940f2 = null;
                    this.f75938d2 = 2;
                    return;
                }
                int iM1771y = m1771y(this.f75946l2, jegVarDequeueInputBuffer, 0);
                if (iM1771y == -4) {
                    if (jegVarDequeueInputBuffer.isEndOfStream()) {
                        this.f75947m2 = true;
                        this.f75937c2 = false;
                    } else {
                        C1213a c1213a = this.f75946l2.f68294b;
                        if (c1213a == null) {
                            return;
                        }
                        jegVarDequeueInputBuffer.f50407N = c1213a.f8296t;
                        jegVarDequeueInputBuffer.flip();
                        this.f75937c2 &= !jegVarDequeueInputBuffer.isKeyFrame();
                    }
                    if (!this.f75937c2) {
                        ((aeg) v80.checkNotNull(this.f75939e2)).queueInputBuffer(jegVarDequeueInputBuffer);
                        this.f75940f2 = null;
                    }
                } else if (iM1771y == -3) {
                    return;
                }
            } catch (ceg e2) {
                handleDecoderError(e2);
                return;
            }
        }
    }

    private void replaceSubtitleDecoder() {
        releaseSubtitleDecoder();
        initSubtitleDecoder();
    }

    private void updateOutput(z93 z93Var) {
        Handler handler = this.f75944j2;
        if (handler != null) {
            handler.obtainMessage(1, z93Var).sendToTarget();
        } else {
            invokeUpdateOutputInternal(z93Var);
        }
    }

    @Deprecated
    public void experimentalSetLegacyDecodingEnabled(boolean z) {
        this.f75952r2 = z;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        invokeUpdateOutputInternal((z93) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isEnded() {
        return this.f75948n2;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isReady() {
        C1213a c1213a = this.f75949o2;
        if (c1213a == null) {
            return true;
        }
        if (!isCuesWithTiming((C1213a) v80.checkNotNull(c1213a))) {
            return !this.f75948n2 && (!this.f75947m2 || hasEventsAfter(this.f75941g2, this.f75950p2) || hasEventsAfter(this.f75942h2, this.f75950p2) || this.f75940f2 == null);
        }
        if (((aa3) v80.checkNotNull(this.f75935a2)).getNextCueChangeTimeUs(this.f75950p2) != Long.MIN_VALUE) {
            return true;
        }
        try {
            maybeThrowStreamError();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: n */
    public void mo1760n() {
        this.f75949o2 = null;
        this.f75951q2 = -9223372036854775807L;
        clearOutput();
        this.f75950p2 = -9223372036854775807L;
        if (this.f75939e2 != null) {
            releaseSubtitleDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: q */
    public void mo1763q(long j, boolean z) {
        this.f75950p2 = j;
        aa3 aa3Var = this.f75935a2;
        if (aa3Var != null) {
            aa3Var.clear();
        }
        clearOutput();
        this.f75947m2 = false;
        this.f75948n2 = false;
        this.f75951q2 = -9223372036854775807L;
        C1213a c1213a = this.f75949o2;
        if (c1213a == null || isCuesWithTiming(c1213a)) {
            return;
        }
        if (this.f75938d2 != 0) {
            replaceSubtitleDecoder();
            return;
        }
        releaseSubtitleBuffers();
        aeg aegVar = (aeg) v80.checkNotNull(this.f75939e2);
        aegVar.flush();
        aegVar.setOutputStartTimeUs(m1753g());
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void render(long j, long j2) throws ql3 {
        if (isCurrentStreamFinal()) {
            long j3 = this.f75951q2;
            if (j3 != -9223372036854775807L && j >= j3) {
                releaseSubtitleBuffers();
                this.f75948n2 = true;
            }
        }
        if (this.f75948n2) {
            return;
        }
        if (isCuesWithTiming((C1213a) v80.checkNotNull(this.f75949o2))) {
            v80.checkNotNull(this.f75935a2);
            renderFromCuesWithTiming(j);
        } else {
            assertLegacyDecodingEnabledIfRequired();
            renderFromSubtitles(j);
        }
    }

    public void setFinalStreamEndPositionUs(long j) {
        v80.checkState(isCurrentStreamFinal());
        this.f75951q2 = j;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1255s
    public int supportsFormat(C1213a c1213a) {
        if (isCuesWithTiming(c1213a) || this.f75936b2.supportsFormat(c1213a)) {
            return InterfaceC1255s.create(c1213a.f8275P == 0 ? 4 : 2);
        }
        return rva.isText(c1213a.f8291o) ? InterfaceC1255s.create(1) : InterfaceC1255s.create(0);
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: w */
    public void mo1769w(C1213a[] c1213aArr, long j, long j2, una.C13612b c13612b) {
        C1213a c1213a = c1213aArr[0];
        this.f75949o2 = c1213a;
        if (isCuesWithTiming(c1213a)) {
            this.f75935a2 = this.f75949o2.f8272M == 1 ? new vra() : new k2e();
            return;
        }
        assertLegacyDecodingEnabledIfRequired();
        if (this.f75939e2 != null) {
            this.f75938d2 = 1;
        } else {
            initSubtitleDecoder();
        }
    }

    public qvg(avg avgVar, @hib Looper looper, deg degVar) {
        super(3);
        this.f75945k2 = (avg) v80.checkNotNull(avgVar);
        this.f75944j2 = looper == null ? null : t0i.createHandler(looper, this);
        this.f75936b2 = degVar;
        this.f75933V1 = new q93();
        this.f75934Z1 = new rl3(1);
        this.f75946l2 = new oq6();
        this.f75951q2 = -9223372036854775807L;
        this.f75950p2 = -9223372036854775807L;
        this.f75952r2 = false;
    }
}

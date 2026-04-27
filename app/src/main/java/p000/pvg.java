package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class pvg extends bu0 implements Handler.Callback {

    /* JADX INFO: renamed from: m2 */
    public static final String f72229m2 = "TextRenderer";

    /* JADX INFO: renamed from: n2 */
    public static final int f72230n2 = 0;

    /* JADX INFO: renamed from: o2 */
    public static final int f72231o2 = 1;

    /* JADX INFO: renamed from: p2 */
    public static final int f72232p2 = 2;

    /* JADX INFO: renamed from: q2 */
    public static final int f72233q2 = 0;

    /* JADX INFO: renamed from: M1 */
    public final eeg f72234M1;

    /* JADX INFO: renamed from: V1 */
    public final nq6 f72235V1;

    /* JADX INFO: renamed from: Y */
    @hib
    public final Handler f72236Y;

    /* JADX INFO: renamed from: Z */
    public final zug f72237Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f72238Z1;

    /* JADX INFO: renamed from: a2 */
    public boolean f72239a2;

    /* JADX INFO: renamed from: b2 */
    public boolean f72240b2;

    /* JADX INFO: renamed from: c2 */
    public int f72241c2;

    /* JADX INFO: renamed from: d2 */
    @hib
    public kq6 f72242d2;

    /* JADX INFO: renamed from: e2 */
    @hib
    public zdg f72243e2;

    /* JADX INFO: renamed from: f2 */
    @hib
    public ieg f72244f2;

    /* JADX INFO: renamed from: g2 */
    @hib
    public keg f72245g2;

    /* JADX INFO: renamed from: h2 */
    @hib
    public keg f72246h2;

    /* JADX INFO: renamed from: i2 */
    public int f72247i2;

    /* JADX INFO: renamed from: j2 */
    public long f72248j2;

    /* JADX INFO: renamed from: k2 */
    public long f72249k2;

    /* JADX INFO: renamed from: l2 */
    public long f72250l2;

    public pvg(zug zugVar, @hib Looper looper) {
        this(zugVar, looper, eeg.f32770a);
    }

    private void clearOutput() {
        updateOutput(new y93(kx7.m15110of(), getPresentationTimeUs(this.f72250l2)));
    }

    @g5e({"subtitle"})
    @vbf
    private long getCurrentEventTimeUs(long j) {
        int nextEventTimeIndex = this.f72245g2.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == 0 || this.f72245g2.getEventTimeCount() == 0) {
            return this.f72245g2.f88311b;
        }
        if (nextEventTimeIndex != -1) {
            return this.f72245g2.getEventTime(nextEventTimeIndex - 1);
        }
        return this.f72245g2.getEventTime(r2.getEventTimeCount() - 1);
    }

    private long getNextEventTime() {
        if (this.f72247i2 == -1) {
            return Long.MAX_VALUE;
        }
        u80.checkNotNull(this.f72245g2);
        if (this.f72247i2 >= this.f72245g2.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.f72245g2.getEventTime(this.f72247i2);
    }

    @vbf
    private long getPresentationTimeUs(long j) {
        u80.checkState(j != -9223372036854775807L);
        u80.checkState(this.f72249k2 != -9223372036854775807L);
        return j - this.f72249k2;
    }

    private void handleDecoderError(beg begVar) {
        yh9.m25916e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f72242d2, begVar);
        clearOutput();
        replaceDecoder();
    }

    private void initDecoder() {
        this.f72240b2 = true;
        this.f72243e2 = this.f72234M1.createDecoder((kq6) u80.checkNotNull(this.f72242d2));
    }

    private void invokeUpdateOutputInternal(y93 y93Var) {
        this.f72237Z.onCues(y93Var.f100826a);
        this.f72237Z.onCues(y93Var);
    }

    private void releaseBuffers() {
        this.f72244f2 = null;
        this.f72247i2 = -1;
        keg kegVar = this.f72245g2;
        if (kegVar != null) {
            kegVar.release();
            this.f72245g2 = null;
        }
        keg kegVar2 = this.f72246h2;
        if (kegVar2 != null) {
            kegVar2.release();
            this.f72246h2 = null;
        }
    }

    private void releaseDecoder() {
        releaseBuffers();
        ((zdg) u80.checkNotNull(this.f72243e2)).release();
        this.f72243e2 = null;
        this.f72241c2 = 0;
    }

    private void replaceDecoder() {
        releaseDecoder();
        initDecoder();
    }

    private void updateOutput(y93 y93Var) {
        Handler handler = this.f72236Y;
        if (handler != null) {
            handler.obtainMessage(0, y93Var).sendToTarget();
        } else {
            invokeUpdateOutputInternal(y93Var);
        }
    }

    @Override // p000.n1e, p000.p1e
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        invokeUpdateOutputInternal((y93) message.obj);
        return true;
    }

    @Override // p000.n1e
    public boolean isEnded() {
        return this.f72239a2;
    }

    @Override // p000.n1e
    public boolean isReady() {
        return true;
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: j */
    public void mo3412j() {
        this.f72242d2 = null;
        this.f72248j2 = -9223372036854775807L;
        clearOutput();
        this.f72249k2 = -9223372036854775807L;
        this.f72250l2 = -9223372036854775807L;
        releaseDecoder();
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: l */
    public void mo3414l(long j, boolean z) {
        this.f72250l2 = j;
        clearOutput();
        this.f72238Z1 = false;
        this.f72239a2 = false;
        this.f72248j2 = -9223372036854775807L;
        if (this.f72241c2 != 0) {
            replaceDecoder();
        } else {
            releaseBuffers();
            ((zdg) u80.checkNotNull(this.f72243e2)).flush();
        }
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: r */
    public void mo3420r(kq6[] kq6VarArr, long j, long j2) {
        this.f72249k2 = j2;
        this.f72242d2 = kq6VarArr[0];
        if (this.f72243e2 != null) {
            this.f72241c2 = 1;
        } else {
            initDecoder();
        }
    }

    @Override // p000.n1e
    public void render(long j, long j2) throws pl3 {
        boolean z;
        this.f72250l2 = j;
        if (isCurrentStreamFinal()) {
            long j3 = this.f72248j2;
            if (j3 != -9223372036854775807L && j >= j3) {
                releaseBuffers();
                this.f72239a2 = true;
            }
        }
        if (this.f72239a2) {
            return;
        }
        if (this.f72246h2 == null) {
            ((zdg) u80.checkNotNull(this.f72243e2)).setPositionUs(j);
            try {
                this.f72246h2 = ((zdg) u80.checkNotNull(this.f72243e2)).dequeueOutputBuffer();
            } catch (beg e) {
                handleDecoderError(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f72245g2 != null) {
            long nextEventTime = getNextEventTime();
            z = false;
            while (nextEventTime <= j) {
                this.f72247i2++;
                nextEventTime = getNextEventTime();
                z = true;
            }
        } else {
            z = false;
        }
        keg kegVar = this.f72246h2;
        if (kegVar != null) {
            if (kegVar.isEndOfStream()) {
                if (!z && getNextEventTime() == Long.MAX_VALUE) {
                    if (this.f72241c2 == 2) {
                        replaceDecoder();
                    } else {
                        releaseBuffers();
                        this.f72239a2 = true;
                    }
                }
            } else if (kegVar.f88311b <= j) {
                keg kegVar2 = this.f72245g2;
                if (kegVar2 != null) {
                    kegVar2.release();
                }
                this.f72247i2 = kegVar.getNextEventTimeIndex(j);
                this.f72245g2 = kegVar;
                this.f72246h2 = null;
                z = true;
            }
        }
        if (z) {
            u80.checkNotNull(this.f72245g2);
            updateOutput(new y93(this.f72245g2.getCues(j), getPresentationTimeUs(getCurrentEventTimeUs(j))));
        }
        if (this.f72241c2 == 2) {
            return;
        }
        while (!this.f72238Z1) {
            try {
                ieg iegVarDequeueInputBuffer = this.f72244f2;
                if (iegVarDequeueInputBuffer == null) {
                    iegVarDequeueInputBuffer = ((zdg) u80.checkNotNull(this.f72243e2)).dequeueInputBuffer();
                    if (iegVarDequeueInputBuffer == null) {
                        return;
                    } else {
                        this.f72244f2 = iegVarDequeueInputBuffer;
                    }
                }
                if (this.f72241c2 == 1) {
                    iegVarDequeueInputBuffer.setFlags(4);
                    ((zdg) u80.checkNotNull(this.f72243e2)).queueInputBuffer(iegVarDequeueInputBuffer);
                    this.f72244f2 = null;
                    this.f72241c2 = 2;
                    return;
                }
                int iM3421s = m3421s(this.f72235V1, iegVarDequeueInputBuffer, 0);
                if (iM3421s == -4) {
                    if (iegVarDequeueInputBuffer.isEndOfStream()) {
                        this.f72238Z1 = true;
                        this.f72240b2 = false;
                    } else {
                        kq6 kq6Var = this.f72235V1.f65258b;
                        if (kq6Var == null) {
                            return;
                        }
                        iegVarDequeueInputBuffer.f46703N = kq6Var.f54995Y;
                        iegVarDequeueInputBuffer.flip();
                        this.f72240b2 &= !iegVarDequeueInputBuffer.isKeyFrame();
                    }
                    if (!this.f72240b2) {
                        ((zdg) u80.checkNotNull(this.f72243e2)).queueInputBuffer(iegVarDequeueInputBuffer);
                        this.f72244f2 = null;
                    }
                } else if (iM3421s == -3) {
                    return;
                }
            } catch (beg e2) {
                handleDecoderError(e2);
                return;
            }
        }
    }

    public void setFinalStreamEndPositionUs(long j) {
        u80.checkState(isCurrentStreamFinal());
        this.f72248j2 = j;
    }

    @Override // p000.p1e
    public int supportsFormat(kq6 kq6Var) {
        if (this.f72234M1.supportsFormat(kq6Var)) {
            return p1e.create(kq6Var.f55017m2 == 0 ? 4 : 2);
        }
        return sva.isText(kq6Var.f54989M) ? p1e.create(1) : p1e.create(0);
    }

    public pvg(zug zugVar, @hib Looper looper, eeg eegVar) {
        super(3);
        this.f72237Z = (zug) u80.checkNotNull(zugVar);
        this.f72236Y = looper == null ? null : x0i.createHandler(looper, this);
        this.f72234M1 = eegVar;
        this.f72235V1 = new nq6();
        this.f72248j2 = -9223372036854775807L;
        this.f72249k2 = -9223372036854775807L;
        this.f72250l2 = -9223372036854775807L;
    }
}

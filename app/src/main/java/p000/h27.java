package p000;

import java.nio.ByteBuffer;
import java.util.Objects;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class h27 extends mq0 {

    /* JADX INFO: renamed from: i */
    public final InterfaceC6686a f42102i;

    /* JADX INFO: renamed from: j */
    public long f42103j;

    /* JADX INFO: renamed from: h27$a */
    public interface InterfaceC6686a {
        float getGainFactorAtSamplePosition(@h78(from = 0) long j, @h78(from = 1) int i);

        long isUnityUntil(@h78(from = 0) long j, @h78(from = 1) int i);
    }

    public h27(InterfaceC6686a interfaceC6686a) {
        this.f42102i = (InterfaceC6686a) v80.checkNotNull(interfaceC6686a);
    }

    @Override // p000.mq0, p000.hf0
    public boolean isActive() {
        return (!super.isActive() || Objects.equals(this.f61732b, hf0.C6832a.f43349e) || this.f42102i.isUnityUntil(0L, this.f61732b.f43350a) == Long.MIN_VALUE) ? false : true;
    }

    @Override // p000.mq0
    @op1
    public hf0.C6832a onConfigure(hf0.C6832a c6832a) throws hf0.C6833b {
        int i = c6832a.f43352c;
        if (i == 2 || i == 4) {
            return c6832a;
        }
        throw new hf0.C6833b("Invalid PCM encoding. Expected 16 bit PCM or float PCM.", c6832a);
    }

    @Override // p000.mq0
    public void onFlush() {
        this.f42103j = 0L;
    }

    @Override // p000.mq0
    public void onReset() {
        this.f42103j = 0L;
    }

    @Override // p000.hf0
    public void queueInput(ByteBuffer byteBuffer) {
        v80.checkState(!Objects.equals(this.f61732b, hf0.C6832a.f43349e), "Audio processor must be configured and flushed before calling queueInput().");
        if (byteBuffer.hasRemaining()) {
            v80.checkArgument(byteBuffer.remaining() % this.f61732b.f43353d == 0, "Queued an incomplete frame.");
            ByteBuffer byteBufferM17515b = m17515b(byteBuffer.remaining());
            while (byteBuffer.hasRemaining()) {
                float gainFactorAtSamplePosition = this.f42102i.getGainFactorAtSamplePosition(this.f42103j, this.f61732b.f43350a);
                if (gainFactorAtSamplePosition != 1.0f) {
                    int i = 0;
                    while (true) {
                        hf0.C6832a c6832a = this.f61732b;
                        if (i >= c6832a.f43351b) {
                            this.f42103j++;
                            break;
                        }
                        int i2 = c6832a.f43352c;
                        if (i2 == 2) {
                            byteBufferM17515b.putShort((short) (byteBuffer.getShort() * gainFactorAtSamplePosition));
                        } else {
                            if (i2 != 4) {
                                throw new IllegalStateException("Unexpected PCM encoding: " + this.f61732b.f43352c);
                            }
                            byteBufferM17515b.putFloat(byteBuffer.getFloat() * gainFactorAtSamplePosition);
                        }
                        i++;
                    }
                } else {
                    int iLimit = byteBuffer.limit();
                    long jIsUnityUntil = this.f42102i.isUnityUntil(this.f42103j, this.f61732b.f43350a);
                    v80.checkState(jIsUnityUntil != -9223372036854775807L, "Expected a valid end boundary for unity region.");
                    if (jIsUnityUntil != Long.MIN_VALUE) {
                        byteBuffer.limit(Math.min(iLimit, ((int) ((jIsUnityUntil - this.f42103j) * ((long) this.f61732b.f43353d))) + byteBuffer.position()));
                    }
                    this.f42103j += (long) (byteBuffer.remaining() / this.f61732b.f43353d);
                    byteBufferM17515b.put(byteBuffer);
                    byteBuffer.limit(iLimit);
                }
            }
            byteBufferM17515b.flip();
        }
    }
}

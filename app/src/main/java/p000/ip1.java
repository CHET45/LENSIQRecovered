package p000;

import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.AbstractC1224c;
import androidx.media3.exoplayer.InterfaceC1255s;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ip1 extends AbstractC1224c {

    /* JADX INFO: renamed from: c2 */
    public static final String f47814c2 = "CameraMotionRenderer";

    /* JADX INFO: renamed from: d2 */
    public static final int f47815d2 = 100000;

    /* JADX INFO: renamed from: V1 */
    public final rl3 f47816V1;

    /* JADX INFO: renamed from: Z1 */
    public final jhc f47817Z1;

    /* JADX INFO: renamed from: a2 */
    @hib
    public gp1 f47818a2;

    /* JADX INFO: renamed from: b2 */
    public long f47819b2;

    public ip1() {
        super(6);
        this.f47816V1 = new rl3(1);
        this.f47817Z1 = new jhc();
    }

    @hib
    private float[] parseMetadata(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f47817Z1.reset(byteBuffer.array(), byteBuffer.limit());
        this.f47817Z1.setPosition(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f47817Z1.readLittleEndianInt());
        }
        return fArr;
    }

    private void resetListener() {
        gp1 gp1Var = this.f47818a2;
        if (gp1Var != null) {
            gp1Var.onCameraMotionReset();
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c, androidx.media3.exoplayer.C1253p.b
    public void handleMessage(int i, @hib Object obj) throws aa5 {
        if (i == 8) {
            this.f47818a2 = (gp1) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: n */
    public void mo1760n() {
        resetListener();
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: q */
    public void mo1763q(long j, boolean z) {
        this.f47819b2 = Long.MIN_VALUE;
        resetListener();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void render(long j, long j2) {
        while (!hasReadStreamToEnd() && this.f47819b2 < 100000 + j) {
            this.f47816V1.clear();
            if (m1771y(m1751e(), this.f47816V1, 0) != -4 || this.f47816V1.isEndOfStream()) {
                return;
            }
            long j3 = this.f47816V1.f78610f;
            this.f47819b2 = j3;
            boolean z = j3 < m1753g();
            if (this.f47818a2 != null && !z) {
                this.f47816V1.flip();
                float[] metadata = parseMetadata((ByteBuffer) t0i.castNonNull(this.f47816V1.f78608d));
                if (metadata != null) {
                    ((gp1) t0i.castNonNull(this.f47818a2)).onCameraMotion(this.f47819b2 - m1757k(), metadata);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC1255s
    public int supportsFormat(C1213a c1213a) {
        return "application/x-camera-motion".equals(c1213a.f8291o) ? InterfaceC1255s.create(4) : InterfaceC1255s.create(0);
    }
}

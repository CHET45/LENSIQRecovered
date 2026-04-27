package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class hp1 extends bu0 {

    /* JADX INFO: renamed from: a2 */
    public static final String f44422a2 = "CameraMotionRenderer";

    /* JADX INFO: renamed from: b2 */
    public static final int f44423b2 = 100000;

    /* JADX INFO: renamed from: M1 */
    public long f44424M1;

    /* JADX INFO: renamed from: V1 */
    @hib
    public fp1 f44425V1;

    /* JADX INFO: renamed from: Y */
    public final sl3 f44426Y;

    /* JADX INFO: renamed from: Z */
    public final ihc f44427Z;

    /* JADX INFO: renamed from: Z1 */
    public long f44428Z1;

    public hp1() {
        super(6);
        this.f44426Y = new sl3(1);
        this.f44427Z = new ihc();
    }

    @hib
    private float[] parseMetadata(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f44427Z.reset(byteBuffer.array(), byteBuffer.limit());
        this.f44427Z.setPosition(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f44427Z.readLittleEndianInt());
        }
        return fArr;
    }

    private void resetListener() {
        fp1 fp1Var = this.f44425V1;
        if (fp1Var != null) {
            fp1Var.onCameraMotionReset();
        }
    }

    @Override // p000.n1e, p000.p1e
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // p000.bu0, p000.l0d.InterfaceC8571b
    public void handleMessage(int i, @hib Object obj) throws ba5 {
        if (i == 8) {
            this.f44425V1 = (fp1) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // p000.n1e
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // p000.n1e
    public boolean isReady() {
        return true;
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: j */
    public void mo3412j() {
        resetListener();
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: l */
    public void mo3414l(long j, boolean z) {
        this.f44428Z1 = Long.MIN_VALUE;
        resetListener();
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: r */
    public void mo3420r(kq6[] kq6VarArr, long j, long j2) {
        this.f44424M1 = j2;
    }

    @Override // p000.n1e
    public void render(long j, long j2) {
        while (!hasReadStreamToEnd() && this.f44428Z1 < 100000 + j) {
            this.f44426Y.clear();
            if (m3421s(m3406d(), this.f44426Y, 0) != -4 || this.f44426Y.isEndOfStream()) {
                return;
            }
            sl3 sl3Var = this.f44426Y;
            this.f44428Z1 = sl3Var.f82164f;
            if (this.f44425V1 != null && !sl3Var.isDecodeOnly()) {
                this.f44426Y.flip();
                float[] metadata = parseMetadata((ByteBuffer) x0i.castNonNull(this.f44426Y.f82162d));
                if (metadata != null) {
                    ((fp1) x0i.castNonNull(this.f44425V1)).onCameraMotion(this.f44428Z1 - this.f44424M1, metadata);
                }
            }
        }
    }

    @Override // p000.p1e
    public int supportsFormat(kq6 kq6Var) {
        return "application/x-camera-motion".equals(kq6Var.f54989M) ? p1e.create(4) : p1e.create(0);
    }
}

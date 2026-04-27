package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.AbstractC1224c;
import androidx.media3.exoplayer.InterfaceC1255s;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p000.eta;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class gua extends AbstractC1224c implements Handler.Callback {

    /* JADX INFO: renamed from: j2 */
    public static final String f41200j2 = "MetadataRenderer";

    /* JADX INFO: renamed from: k2 */
    public static final int f41201k2 = 1;

    /* JADX INFO: renamed from: V1 */
    public final xta f41202V1;

    /* JADX INFO: renamed from: Z1 */
    public final fua f41203Z1;

    /* JADX INFO: renamed from: a2 */
    @hib
    public final Handler f41204a2;

    /* JADX INFO: renamed from: b2 */
    public final aua f41205b2;

    /* JADX INFO: renamed from: c2 */
    public final boolean f41206c2;

    /* JADX INFO: renamed from: d2 */
    @hib
    public wta f41207d2;

    /* JADX INFO: renamed from: e2 */
    public boolean f41208e2;

    /* JADX INFO: renamed from: f2 */
    public boolean f41209f2;

    /* JADX INFO: renamed from: g2 */
    public long f41210g2;

    /* JADX INFO: renamed from: h2 */
    @hib
    public eta f41211h2;

    /* JADX INFO: renamed from: i2 */
    public long f41212i2;

    public gua(fua fuaVar, @hib Looper looper) {
        this(fuaVar, looper, xta.f99231a);
    }

    private void decodeWrappedMetadata(eta etaVar, List<eta.InterfaceC5464a> list) {
        for (int i = 0; i < etaVar.length(); i++) {
            C1213a wrappedMetadataFormat = etaVar.get(i).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.f41202V1.supportsFormat(wrappedMetadataFormat)) {
                list.add(etaVar.get(i));
            } else {
                wta wtaVarCreateDecoder = this.f41202V1.createDecoder(wrappedMetadataFormat);
                byte[] bArr = (byte[]) v80.checkNotNull(etaVar.get(i).getWrappedMetadataBytes());
                this.f41205b2.clear();
                this.f41205b2.ensureSpaceForWrite(bArr.length);
                ((ByteBuffer) t0i.castNonNull(this.f41205b2.f78608d)).put(bArr);
                this.f41205b2.flip();
                eta etaVarDecode = wtaVarCreateDecoder.decode(this.f41205b2);
                if (etaVarDecode != null) {
                    decodeWrappedMetadata(etaVarDecode, list);
                }
            }
        }
    }

    @vbf
    private long getPresentationTimeUs(long j) {
        v80.checkState(j != -9223372036854775807L);
        v80.checkState(this.f41212i2 != -9223372036854775807L);
        return j - this.f41212i2;
    }

    private void invokeRenderer(eta etaVar) {
        Handler handler = this.f41204a2;
        if (handler != null) {
            handler.obtainMessage(1, etaVar).sendToTarget();
        } else {
            invokeRendererInternal(etaVar);
        }
    }

    private void invokeRendererInternal(eta etaVar) {
        this.f41203Z1.onMetadata(etaVar);
    }

    private boolean outputMetadata(long j) {
        boolean z;
        eta etaVar = this.f41211h2;
        if (etaVar == null || (!this.f41206c2 && etaVar.f34010b > getPresentationTimeUs(j))) {
            z = false;
        } else {
            invokeRenderer(this.f41211h2);
            this.f41211h2 = null;
            z = true;
        }
        if (this.f41208e2 && this.f41211h2 == null) {
            this.f41209f2 = true;
        }
        return z;
    }

    private void readMetadata() {
        if (this.f41208e2 || this.f41211h2 != null) {
            return;
        }
        this.f41205b2.clear();
        oq6 oq6VarM1751e = m1751e();
        int iM1771y = m1771y(oq6VarM1751e, this.f41205b2, 0);
        if (iM1771y != -4) {
            if (iM1771y == -5) {
                this.f41210g2 = ((C1213a) v80.checkNotNull(oq6VarM1751e.f68294b)).f8296t;
                return;
            }
            return;
        }
        if (this.f41205b2.isEndOfStream()) {
            this.f41208e2 = true;
            return;
        }
        if (this.f41205b2.f78610f >= m1753g()) {
            aua auaVar = this.f41205b2;
            auaVar.f11889N = this.f41210g2;
            auaVar.flip();
            eta etaVarDecode = ((wta) t0i.castNonNull(this.f41207d2)).decode(this.f41205b2);
            if (etaVarDecode != null) {
                ArrayList arrayList = new ArrayList(etaVarDecode.length());
                decodeWrappedMetadata(etaVarDecode, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f41211h2 = new eta(getPresentationTimeUs(this.f41205b2.f78610f), arrayList);
            }
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        invokeRendererInternal((eta) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isEnded() {
        return this.f41209f2;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: n */
    public void mo1760n() {
        this.f41211h2 = null;
        this.f41207d2 = null;
        this.f41212i2 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: q */
    public void mo1763q(long j, boolean z) {
        this.f41211h2 = null;
        this.f41208e2 = false;
        this.f41209f2 = false;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void render(long j, long j2) {
        boolean zOutputMetadata = true;
        while (zOutputMetadata) {
            readMetadata();
            zOutputMetadata = outputMetadata(j);
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC1255s
    public int supportsFormat(C1213a c1213a) {
        if (this.f41202V1.supportsFormat(c1213a)) {
            return InterfaceC1255s.create(c1213a.f8275P == 0 ? 4 : 2);
        }
        return InterfaceC1255s.create(0);
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: w */
    public void mo1769w(C1213a[] c1213aArr, long j, long j2, una.C13612b c13612b) {
        this.f41207d2 = this.f41202V1.createDecoder(c1213aArr[0]);
        eta etaVar = this.f41211h2;
        if (etaVar != null) {
            this.f41211h2 = etaVar.copyWithPresentationTimeUs((etaVar.f34010b + this.f41212i2) - j2);
        }
        this.f41212i2 = j2;
    }

    public gua(fua fuaVar, @hib Looper looper, xta xtaVar) {
        this(fuaVar, looper, xtaVar, false);
    }

    public gua(fua fuaVar, @hib Looper looper, xta xtaVar, boolean z) {
        super(5);
        this.f41203Z1 = (fua) v80.checkNotNull(fuaVar);
        this.f41204a2 = looper == null ? null : t0i.createHandler(looper, this);
        this.f41202V1 = (xta) v80.checkNotNull(xtaVar);
        this.f41206c2 = z;
        this.f41205b2 = new aua();
        this.f41212i2 = -9223372036854775807L;
    }
}

package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import p000.br7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class dr7 {

    /* JADX INFO: renamed from: a */
    public final ihc f30486a = new ihc(10);

    @hib
    public Metadata peekId3Data(zj5 zj5Var, @hib br7.InterfaceC2019a interfaceC2019a) throws IOException {
        Metadata metadataDecode = null;
        int i = 0;
        while (true) {
            try {
                zj5Var.peekFully(this.f30486a.getData(), 0, 10);
                this.f30486a.setPosition(0);
                if (this.f30486a.readUnsignedInt24() != 4801587) {
                    break;
                }
                this.f30486a.skipBytes(3);
                int synchSafeInt = this.f30486a.readSynchSafeInt();
                int i2 = synchSafeInt + 10;
                if (metadataDecode == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f30486a.getData(), 0, bArr, 0, 10);
                    zj5Var.peekFully(bArr, 10, synchSafeInt);
                    metadataDecode = new br7(interfaceC2019a).decode(bArr, i2);
                } else {
                    zj5Var.advancePeekPosition(synchSafeInt);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zj5Var.resetPeekPosition();
        zj5Var.advancePeekPosition(i);
        return metadataDecode;
    }
}

package p000;

import java.io.EOFException;
import java.io.IOException;
import p000.ar7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class er7 {

    /* JADX INFO: renamed from: a */
    public final jhc f33884a = new jhc(10);

    @hib
    public eta peekId3Data(ak5 ak5Var, @hib ar7.InterfaceC1575a interfaceC1575a) throws IOException {
        eta etaVarDecode = null;
        int i = 0;
        while (true) {
            try {
                ak5Var.peekFully(this.f33884a.getData(), 0, 10);
                this.f33884a.setPosition(0);
                if (this.f33884a.readUnsignedInt24() != 4801587) {
                    break;
                }
                this.f33884a.skipBytes(3);
                int synchSafeInt = this.f33884a.readSynchSafeInt();
                int i2 = synchSafeInt + 10;
                if (etaVarDecode == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f33884a.getData(), 0, bArr, 0, 10);
                    ak5Var.peekFully(bArr, 10, synchSafeInt);
                    etaVarDecode = new ar7(interfaceC1575a).decode(bArr, i2);
                } else {
                    ak5Var.advancePeekPosition(synchSafeInt);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        ak5Var.resetPeekPosition();
        ak5Var.advancePeekPosition(i);
        return etaVarDecode;
    }
}

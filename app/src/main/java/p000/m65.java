package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class m65 extends rif {
    @Override // p000.rif
    /* JADX INFO: renamed from: a */
    public eta mo2551a(aua auaVar, ByteBuffer byteBuffer) {
        return new eta(decode(new jhc(byteBuffer.array(), byteBuffer.limit())));
    }

    public k65 decode(jhc jhcVar) {
        return new k65((String) v80.checkNotNull(jhcVar.readNullTerminatedString()), (String) v80.checkNotNull(jhcVar.readNullTerminatedString()), jhcVar.readLong(), jhcVar.readLong(), Arrays.copyOfRange(jhcVar.getData(), jhcVar.getPosition(), jhcVar.limit()));
    }
}

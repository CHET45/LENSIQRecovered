package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l65 extends qif {
    @Override // p000.qif
    /* JADX INFO: renamed from: a */
    public Metadata mo3372a(zta ztaVar, ByteBuffer byteBuffer) {
        return new Metadata(decode(new ihc(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage decode(ihc ihcVar) {
        return new EventMessage((String) u80.checkNotNull(ihcVar.readNullTerminatedString()), (String) u80.checkNotNull(ihcVar.readNullTerminatedString()), ihcVar.readLong(), ihcVar.readLong(), Arrays.copyOfRange(ihcVar.getData(), ihcVar.getPosition(), ihcVar.limit()));
    }
}

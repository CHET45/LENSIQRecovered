package p000;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n65 {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f63381a;

    /* JADX INFO: renamed from: b */
    public final DataOutputStream f63382b;

    public n65() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f63381a = byteArrayOutputStream;
        this.f63382b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void writeNullTerminatedString(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] encode(EventMessage eventMessage) {
        this.f63381a.reset();
        try {
            writeNullTerminatedString(this.f63382b, eventMessage.f19578a);
            String str = eventMessage.f19579b;
            if (str == null) {
                str = "";
            }
            writeNullTerminatedString(this.f63382b, str);
            this.f63382b.writeLong(eventMessage.f19580c);
            this.f63382b.writeLong(eventMessage.f19581d);
            this.f63382b.write(eventMessage.f19582e);
            this.f63382b.flush();
            return this.f63381a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

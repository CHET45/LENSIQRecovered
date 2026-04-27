package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class o65 {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f66545a;

    /* JADX INFO: renamed from: b */
    public final DataOutputStream f66546b;

    public o65() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f66545a = byteArrayOutputStream;
        this.f66546b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void writeNullTerminatedString(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] encode(k65 k65Var) {
        this.f66545a.reset();
        try {
            writeNullTerminatedString(this.f66546b, k65Var.f52649a);
            String str = k65Var.f52650b;
            if (str == null) {
                str = "";
            }
            writeNullTerminatedString(this.f66546b, str);
            this.f66546b.writeLong(k65Var.f52651c);
            this.f66546b.writeLong(k65Var.f52652d);
            this.f66546b.write(k65Var.f52653e);
            this.f66546b.flush();
            return this.f66545a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public interface gv6 extends Closeable {

    /* JADX INFO: renamed from: gv6$a */
    public interface InterfaceC6593a {
        void ackSettings();

        void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j);

        void data(boolean z, int i, BufferedSource bufferedSource, int i2, int i3) throws IOException;

        void goAway(int i, w45 w45Var, ByteString byteString);

        void headers(boolean z, boolean z2, int i, int i2, List<ei7> list, li7 li7Var);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<ei7> list) throws IOException;

        void rstStream(int i, w45 w45Var);

        void settings(boolean z, b7f b7fVar);

        void windowUpdate(int i, long j);
    }

    boolean nextFrame(InterfaceC6593a interfaceC6593a) throws IOException;

    void readConnectionPreface() throws IOException;
}

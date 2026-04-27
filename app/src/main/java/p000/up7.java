package p000;

/* JADX INFO: loaded from: classes8.dex */
public interface up7 {
    boolean acceptProvidedExtensionAsClient(String str);

    boolean acceptProvidedExtensionAsServer(String str);

    up7 copyInstance();

    void decodeFrame(nv6 nv6Var) throws ud8;

    void encodeFrame(nv6 nv6Var);

    String getProvidedExtensionAsClient();

    String getProvidedExtensionAsServer();

    void isFrameValid(nv6 nv6Var) throws ud8;

    void reset();

    String toString();
}

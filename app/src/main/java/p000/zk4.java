package p000;

import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface zk4 {

    /* JADX INFO: renamed from: a */
    public static final int f105338a = 0;

    /* JADX INFO: renamed from: zk4$a */
    public interface InterfaceC16164a {
        InputStream getInputStream() throws IOException;

        String getRedirectLocation();

        int getResponseCode() throws IOException;

        @hib
        String getResponseHeaderField(String str);

        @hib
        Map<String, List<String>> getResponseHeaderFields();
    }

    /* JADX INFO: renamed from: zk4$b */
    public interface InterfaceC16165b {
        zk4 create(String str) throws IOException;
    }

    void addHeader(String str, String str2);

    InterfaceC16164a execute() throws IOException;

    Map<String, List<String>> getRequestProperties();

    String getRequestProperty(String str);

    void release();

    boolean setRequestMethod(@efb String str) throws ProtocolException;
}

package p000;

import com.squareup.okhttp.CipherSuite;
import com.squareup.okhttp.ConnectionSpec;
import com.squareup.okhttp.TlsVersion;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.da8;
import p000.ls2;

/* JADX INFO: loaded from: classes7.dex */
public class h1i {

    /* JADX INFO: renamed from: a */
    public static final Logger f42047a = Logger.getLogger(h1i.class.getName());

    /* JADX INFO: renamed from: b */
    public static final float f42048b = 0.5f;

    /* JADX INFO: renamed from: c */
    public static final int f42049c = 65535;

    /* JADX INFO: renamed from: d */
    public static final int f42050d = 0;

    private h1i() {
    }

    /* JADX INFO: renamed from: a */
    public static ls2 m12080a(ConnectionSpec connectionSpec) {
        v7d.checkArgument(connectionSpec.isTls(), "plaintext ConnectionSpec is not accepted");
        List listTlsVersions = connectionSpec.tlsVersions();
        int size = listTlsVersions.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((TlsVersion) listTlsVersions.get(i)).javaName();
        }
        List listCipherSuites = connectionSpec.cipherSuites();
        int size2 = listCipherSuites.size();
        vz1[] vz1VarArr = new vz1[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            vz1VarArr[i2] = vz1.valueOf(((CipherSuite) listCipherSuites.get(i2)).name());
        }
        return new ls2.C8950b(connectionSpec.isTls()).supportsTlsExtensions(connectionSpec.supportsTlsExtensions()).tlsVersions(strArr).cipherSuites(vz1VarArr).build();
    }

    /* JADX INFO: renamed from: b */
    public static da8.C4694k m12081b(Socket socket) {
        da8.C4694k.a aVar = new da8.C4694k.a();
        try {
            aVar.setSocketOptionLingerSeconds(Integer.valueOf(socket.getSoLinger()));
        } catch (SocketException e) {
            f42047a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e);
            aVar.addOption("SO_LINGER", "channelz_internal_error");
        }
        try {
            aVar.setSocketOptionTimeoutMillis(Integer.valueOf(socket.getSoTimeout()));
        } catch (Exception e2) {
            f42047a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e2);
            aVar.addOption("SO_TIMEOUT", "channelz_internal_error");
        }
        try {
            aVar.addOption("TCP_NODELAY", socket.getTcpNoDelay());
        } catch (SocketException e3) {
            f42047a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e3);
            aVar.addOption("TCP_NODELAY", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_REUSEADDR", socket.getReuseAddress());
        } catch (SocketException e4) {
            f42047a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e4);
            aVar.addOption("SO_REUSEADDR", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_SNDBUF", socket.getSendBufferSize());
        } catch (SocketException e5) {
            f42047a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e5);
            aVar.addOption("SO_SNDBUF", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_RECVBUF", socket.getReceiveBufferSize());
        } catch (SocketException e6) {
            f42047a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e6);
            aVar.addOption("SO_RECVBUF", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_KEEPALIVE", socket.getKeepAlive());
        } catch (SocketException e7) {
            f42047a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e7);
            aVar.addOption("SO_KEEPALIVE", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_OOBINLINE", socket.getOOBInline());
        } catch (SocketException e8) {
            f42047a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e8);
            aVar.addOption("SO_OOBINLINE", "channelz_internal_error");
        }
        try {
            aVar.addOption("IP_TOS", socket.getTrafficClass());
        } catch (SocketException e9) {
            f42047a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e9);
            aVar.addOption("IP_TOS", "channelz_internal_error");
        }
        return aVar.build();
    }

    public static fta convertHeaders(List<ei7> list) {
        return fb8.newMetadata(convertHeadersToArray(list));
    }

    @dy1
    private static byte[][] convertHeadersToArray(List<ei7> list) {
        byte[][] bArr = new byte[list.size() * 2][];
        int i = 0;
        for (ei7 ei7Var : list) {
            int i2 = i + 1;
            bArr[i] = ei7Var.f33074a.toByteArray();
            i += 2;
            bArr[i2] = ei7Var.f33075b.toByteArray();
        }
        return fhh.toRawSerializedHeaders(bArr);
    }

    public static fta convertTrailers(List<ei7> list) {
        return fb8.newMetadata(convertHeadersToArray(list));
    }
}

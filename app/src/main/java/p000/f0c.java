package p000;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes7.dex */
public final class f0c implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final f0c f34647a = new f0c();

    /* JADX INFO: renamed from: b */
    public static final Pattern f34648b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* JADX INFO: renamed from: c */
    public static final int f34649c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f34650d = 7;

    private f0c() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10404a(String str) {
        return f34648b.matcher(str).matches();
    }

    public static List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        List<String> subjectAltNames2 = getSubjectAltNames(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(subjectAltNames.size() + subjectAltNames2.size());
        arrayList.addAll(subjectAltNames);
        arrayList.addAll(subjectAltNames2);
        return arrayList;
    }

    private static List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private boolean verifyHostName(String str, X509Certificate x509Certificate) {
        String strFindMostSpecific;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        int size = subjectAltNames.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (verifyHostName(lowerCase, subjectAltNames.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (z || (strFindMostSpecific = new yg4(x509Certificate.getSubjectX500Principal()).findMostSpecific("cn")) == null) {
            return false;
        }
        return verifyHostName(lowerCase, strFindMostSpecific);
    }

    private boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        int size = subjectAltNames.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(subjectAltNames.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public boolean verify(String str, X509Certificate x509Certificate) {
        if (m10404a(str)) {
            return verifyIpAddress(str, x509Certificate);
        }
        return verifyHostName(str, x509Certificate);
    }

    private boolean verifyHostName(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + a18.f100c;
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + a18.f100c;
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }
}

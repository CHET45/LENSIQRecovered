package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mac {

    /* JADX INFO: renamed from: mac$a */
    @c5e(28)
    public static class C9239a {
        private C9239a() {
        }

        @hib
        @ih4
        /* JADX INFO: renamed from: a */
        public static Signature[] m17191a(@efb SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static long m17192b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @hib
        @ih4
        /* JADX INFO: renamed from: c */
        public static Signature[] m17193c(@efb SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static boolean m17194d(@efb SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static boolean m17195e(@efb PackageManager packageManager, @efb String str, @efb byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    private mac() {
    }

    private static boolean byteArrayContains(@efb byte[][] bArr, @efb byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] computeSHA256Digest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e);
        }
    }

    public static long getLongVersionCode(@efb PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C9239a.m17192b(packageInfo) : packageInfo.versionCode;
    }

    @efb
    public static List<Signature> getSignatures(@efb PackageManager packageManager, @efb String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArrM17191a;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            signatureArrM17191a = C9239a.m17194d(signingInfo) ? C9239a.m17191a(signingInfo) : C9239a.m17193c(signingInfo);
        } else {
            signatureArrM17191a = packageManager.getPackageInfo(str, 64).signatures;
        }
        return signatureArrM17191a == null ? Collections.emptyList() : Arrays.asList(signatureArrM17191a);
    }

    public static boolean hasSignatures(@efb PackageManager packageManager, @efb String str, @efb @zpf(min = 1) Map<byte[], Integer> map, boolean z) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> setKeySet = map.keySet();
        for (byte[] bArr2 : setKeySet) {
            if (bArr2 == null) {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
            Integer num = map.get(bArr2);
            if (num == null) {
                throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
            }
            int iIntValue = num.intValue();
            if (iIntValue != 0 && iIntValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> signatures = getSignatures(packageManager, str);
        if (!z && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr3 : setKeySet) {
                if (!C9239a.m17195e(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (signatures.size() != 0 && map.size() <= signatures.size() && (!z || map.size() == signatures.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[signatures.size()][];
                for (int i = 0; i < signatures.size(); i++) {
                    bArr[i] = computeSHA256Digest(signatures.get(i).toByteArray());
                }
            } else {
                bArr = null;
            }
            Iterator<byte[]> it = setKeySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int iIntValue2 = num2.intValue();
                if (iIntValue2 != 0) {
                    if (iIntValue2 != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                    if (!byteArrayContains(bArr, next)) {
                        return false;
                    }
                } else if (!signatures.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}

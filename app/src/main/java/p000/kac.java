package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kac {

    /* JADX INFO: renamed from: a */
    public static final String f53452a = "PackageIdentity";

    /* JADX INFO: renamed from: kac$a */
    @c5e(28)
    public static class C8265a implements InterfaceC8267c {
        @Override // p000.kac.InterfaceC8267c
        @hib
        public List<byte[]> getFingerprintsForPackage(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (Signature signature : signingInfo.getApkContentsSigners()) {
                    arrayList.add(kac.m14632a(signature));
                }
            } else {
                arrayList.add(kac.m14632a(signingInfo.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }

        @Override // p000.kac.InterfaceC8267c
        public boolean packageMatchesToken(String str, PackageManager packageManager, u3h u3hVar) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> fingerprintsForPackage;
            if (u3hVar.getPackageName().equals(str) && (fingerprintsForPackage = getFingerprintsForPackage(str, packageManager)) != null) {
                return fingerprintsForPackage.size() == 1 ? packageManager.hasSigningCertificate(str, u3hVar.getFingerprint(0), 1) : u3hVar.equals(u3h.m23091b(str, fingerprintsForPackage));
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: kac$b */
    public static class C8266b implements InterfaceC8267c {
        @Override // p000.kac.InterfaceC8267c
        @hib
        @igg({"PackageManagerGetSignatures"})
        public List<byte[]> getFingerprintsForPackage(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                byte[] bArrM14632a = kac.m14632a(signature);
                if (bArrM14632a == null) {
                    return null;
                }
                arrayList.add(bArrM14632a);
            }
            return arrayList;
        }

        @Override // p000.kac.InterfaceC8267c
        public boolean packageMatchesToken(String str, PackageManager packageManager, u3h u3hVar) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> fingerprintsForPackage;
            if (str.equals(u3hVar.getPackageName()) && (fingerprintsForPackage = getFingerprintsForPackage(str, packageManager)) != null) {
                return u3hVar.equals(u3h.m23091b(str, fingerprintsForPackage));
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: kac$c */
    public interface InterfaceC8267c {
        @hib
        List<byte[]> getFingerprintsForPackage(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException;

        boolean packageMatchesToken(String str, PackageManager packageManager, u3h u3hVar) throws PackageManager.NameNotFoundException, IOException;
    }

    private kac() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static byte[] m14632a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @hib
    /* JADX INFO: renamed from: b */
    public static List<byte[]> m14633b(String str, PackageManager packageManager) {
        try {
            return getImpl().getFingerprintsForPackage(str, packageManager);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f53452a, "Could not get fingerprint for package.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14634c(String str, PackageManager packageManager, u3h u3hVar) {
        try {
            return getImpl().packageMatchesToken(str, packageManager, u3hVar);
        } catch (PackageManager.NameNotFoundException | IOException e) {
            Log.e(f53452a, "Could not check if package matches token.", e);
            return false;
        }
    }

    private static InterfaceC8267c getImpl() {
        return Build.VERSION.SDK_INT >= 28 ? new C8265a() : new C8266b();
    }
}

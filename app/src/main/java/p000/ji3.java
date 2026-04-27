package p000;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public class ji3 {

    /* JADX INFO: renamed from: f */
    public static final String f50641f = "FIREBASE_CRASHLYTICS_REPORT";

    /* JADX INFO: renamed from: a */
    public final i3e f50643a;

    /* JADX INFO: renamed from: b */
    public final leh<z33, byte[]> f50644b;

    /* JADX INFO: renamed from: c */
    public static final k43 f50638c = new k43();

    /* JADX INFO: renamed from: d */
    public static final String f50639d = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e */
    public static final String f50640e = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: g */
    public static final leh<z33, byte[]> f50642g = new leh() { // from class: ii3
        @Override // p000.leh
        public final Object apply(Object obj) {
            return ji3.lambda$static$0((z33) obj);
        }
    };

    public ji3(i3e i3eVar, leh<z33, byte[]> lehVar) {
        this.f50643a = i3eVar;
        this.f50644b = lehVar;
    }

    public static ji3 create(Context context, q7f q7fVar, n2c n2cVar) {
        nhh.initialize(context);
        dhh dhhVarNewFactory = nhh.getInstance().newFactory(new nk1(f50639d, f50640e));
        q15 q15VarM19986of = q15.m19986of("json");
        leh<z33, byte[]> lehVar = f50642g;
        return new ji3(new i3e(dhhVarNewFactory.getTransport(f50641f, z33.class, q15VarM19986of, lehVar), q7fVar.getSettingsSync(), n2cVar), lehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$static$0(z33 z33Var) {
        return f50638c.reportToJson(z33Var).getBytes(Charset.forName("UTF-8"));
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    @efb
    public Task<q43> enqueueReport(@efb q43 q43Var, boolean z) {
        return this.f50643a.m12760g(q43Var, z).getTask();
    }
}

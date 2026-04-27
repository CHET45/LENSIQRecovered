package p000;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@dwf({"SMAP\nPackageWhitelistValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageWhitelistValidator.kt\nwatchfun/image/PackageWhitelistValidator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n1#2:136\n1855#3,2:137\n1747#3,3:139\n1855#3,2:142\n*S KotlinDebug\n*F\n+ 1 PackageWhitelistValidator.kt\nwatchfun/image/PackageWhitelistValidator\n*L\n47#1:137,2\n85#1:139,3\n94#1:142,2\n*E\n"})
public final class rac {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C11970a f77599d = new C11970a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final String f77600e = "PackageWhitelistValidator";

    /* JADX INFO: renamed from: f */
    @yfb
    public static final String f77601f = "package_whitelist.txt";

    /* JADX INFO: renamed from: a */
    @yfb
    public final Context f77602a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<String> f77603b;

    /* JADX INFO: renamed from: c */
    public boolean f77604c;

    /* JADX INFO: renamed from: rac$a */
    public static final class C11970a {
        public /* synthetic */ C11970a(jt3 jt3Var) {
            this();
        }

        private C11970a() {
        }
    }

    public rac(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        this.f77602a = context;
        this.f77603b = new ArrayList();
        loadWhitelist();
    }

    private final void loadWhitelist() {
        BufferedReader bufferedReader;
        try {
            InputStream inputStreamOpen = this.f77602a.getAssets().open(f77601f);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
            } finally {
            }
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        processLine(line);
                    }
                } finally {
                }
            }
            bth bthVar = bth.f14751a;
            u52.closeFinally(bufferedReader, null);
            u52.closeFinally(inputStreamOpen, null);
            this.f77604c = true;
            StringBuilder sb = new StringBuilder();
            sb.append("✅ 白名单加载成功: ");
            sb.append(this.f77603b.size());
            sb.append(" 个授权模式");
            for (String str : this.f77603b) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("   - ");
                sb2.append(str);
            }
        } catch (Exception e) {
            Log.e(f77600e, "❌ 加载白名单失败: " + e.getMessage());
            this.f77604c = false;
        }
    }

    private final boolean matchesPattern(String str, String str2) {
        return m9g.contains$default((CharSequence) str2, (CharSequence) "*", false, 2, (Object) null) ? new owd(h9g.replace$default(h9g.replace$default(str2, ".", "\\.", false, 4, (Object) null), "*", ".*", false, 4, (Object) null)).matches(str) : md8.areEqual(str, str2);
    }

    private final void processLine(String str) {
        String string = m9g.trim((CharSequence) str).toString();
        if (string.length() == 0 || h9g.startsWith$default(string, "#", false, 2, null)) {
            return;
        }
        this.f77603b.add(string);
    }

    @yfb
    public final String getCurrentPackageName() {
        String packageName = this.f77602a.getPackageName();
        md8.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    public final boolean isAuthorized() {
        try {
            validate();
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public final void validate() {
        String packageName = this.f77602a.getPackageName();
        if (!this.f77604c) {
            Log.e(f77600e, "❌ SDK安全验证失败: 无法加载授权列表。请联系SDK提供商。");
            throw new SecurityException("SDK安全验证失败: 无法加载授权列表。请联系SDK提供商。");
        }
        List<String> list = this.f77603b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str : list) {
                md8.checkNotNull(packageName);
                if (matchesPattern(packageName, str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("✅ 包名验证通过: ");
                    sb.append(packageName);
                    return;
                }
            }
        }
        String str2 = "未授权的SDK访问: 应用包名 '" + packageName + "' 不在授权列表中。此SDK仅限授权应用使用。如需授权，请联系SDK提供商。";
        Log.e(f77600e, "❌ " + str2);
        Log.e(f77600e, "授权模式列表:");
        Iterator<T> it = this.f77603b.iterator();
        while (it.hasNext()) {
            Log.e(f77600e, "   - " + ((String) it.next()));
        }
        throw new SecurityException(str2);
    }
}

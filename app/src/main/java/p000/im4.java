package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p000.sd4;

/* JADX INFO: loaded from: classes6.dex */
public class im4 {

    /* JADX INFO: renamed from: l */
    public static final int f47387l = 100;

    /* JADX INFO: renamed from: m */
    public static im4 f47388m = null;

    /* JADX INFO: renamed from: n */
    public static final int f47389n = 6;

    /* JADX INFO: renamed from: o */
    public static final int f47390o = 1572864000;

    /* JADX INFO: renamed from: p */
    public static final int f47391p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f47392q = 2;

    /* JADX INFO: renamed from: r */
    public static final int f47393r = 3;

    /* JADX INFO: renamed from: s */
    public static final int f47394s = 4;

    /* JADX INFO: renamed from: t */
    public static final int f47395t = 5;

    /* JADX INFO: renamed from: u */
    public static final String f47396u = "DownloadManager";

    /* JADX INFO: renamed from: a */
    public final ExecutorService f47397a;

    /* JADX INFO: renamed from: b */
    public final Object f47398b;

    /* JADX INFO: renamed from: c */
    public final Queue<RunnableC7494f> f47399c;

    /* JADX INFO: renamed from: d */
    public final List<RunnableC7494f> f47400d;

    /* JADX INFO: renamed from: e */
    public final List<RunnableC7494f> f47401e;

    /* JADX INFO: renamed from: f */
    public List<RunnableC7494f> f47402f;

    /* JADX INFO: renamed from: g */
    public long f47403g;

    /* JADX INFO: renamed from: h */
    public InterfaceC7493e f47404h;

    /* JADX INFO: renamed from: i */
    public yyb f47405i;

    /* JADX INFO: renamed from: j */
    public boolean f47406j;

    /* JADX INFO: renamed from: k */
    public boolean f47407k;

    /* JADX INFO: renamed from: im4$a */
    public class C7489a extends TypeToken<List<RunnableC7494f>> {
        public C7489a() {
        }
    }

    /* JADX INFO: renamed from: im4$b */
    public class C7490b implements sd4.InterfaceC12527b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f47409a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RunnableC7494f f47410b;

        /* JADX INFO: renamed from: im4$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public C7490b(File file, RunnableC7494f runnableC7494f) {
            this.f47409a = file;
            this.f47410b = runnableC7494f;
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyComplete() {
            StringBuilder sb = new StringBuilder();
            sb.append("copy base resource: copyDir ");
            sb.append(this.f47409a);
            File file = this.f47409a;
            if (file == null || !file.exists()) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("delete path: ");
            sb2.append(this.f47409a);
            if (im4.this.f47397a != null) {
                im4.this.f47397a.submit(new a());
            }
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyError(String str) {
            yyb yybVar = yyb.getInstance();
            String str2 = yyb.f103353d + this.f47410b.f47425a;
            zm4 zm4Var = zm4.FAILED;
            yybVar.putInt(str2, zm4Var.ordinal());
            this.f47410b.f47429e = zm4Var;
            yyb.getInstance().putString(yyb.f103354e, gyb.toJson(im4.this.f47402f));
            if (im4.this.f47404h != null) {
                im4.this.f47404h.onError(this.f47410b.f47425a, 3, new IOException("复制失败: " + str));
            }
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyProgress(int i) {
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyStart() {
        }
    }

    /* JADX INFO: renamed from: im4$c */
    public class C7491c implements sd4.InterfaceC12527b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f47413a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f47414b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ RunnableC7494f f47415c;

        /* JADX INFO: renamed from: im4$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public C7491c(File file, String str, RunnableC7494f runnableC7494f) {
            this.f47413a = file;
            this.f47414b = str;
            this.f47415c = runnableC7494f;
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyComplete() {
            StringBuilder sb = new StringBuilder();
            sb.append("copy LanguageEdPath: languageEdPath ");
            sb.append(this.f47413a);
            if (this.f47413a.exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("delete path: ");
                sb2.append(this.f47413a);
                if (im4.this.f47397a != null) {
                    im4.this.f47397a.submit(new a());
                }
            }
            File file = new File(new File(zyb.f106507e + this.f47414b + File.separator), zyb.f106514l);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(zyb.f106503a + zyb.f106514l + "resource/nmt_core/");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (file.exists()) {
                im4.this.doCopyLanguageItransPath(this.f47415c, file, file2);
            } else {
                Log.e("DownloadManager", "languageItransPath not exist");
            }
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyError(String str) {
            Log.e("DownloadManager", "onCopyError: " + str);
            yyb yybVar = yyb.getInstance();
            String str2 = yyb.f103353d + this.f47415c.f47425a;
            zm4 zm4Var = zm4.FAILED;
            yybVar.putInt(str2, zm4Var.ordinal());
            this.f47415c.f47429e = zm4Var;
            yyb.getInstance().putString(yyb.f103354e, gyb.toJson(im4.this.f47402f));
            if (im4.this.f47404h != null) {
                im4.this.f47404h.onError(this.f47415c.f47425a, 3, new IOException("复制失败: " + str));
            }
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyProgress(int i) {
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyStart() {
        }
    }

    /* JADX INFO: renamed from: im4$d */
    public class C7492d implements sd4.InterfaceC12527b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f47418a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RunnableC7494f f47419b;

        /* JADX INFO: renamed from: im4$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public C7492d(File file, RunnableC7494f runnableC7494f) {
            this.f47418a = file;
            this.f47419b = runnableC7494f;
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyComplete() {
            StringBuilder sb = new StringBuilder();
            sb.append("copy LanguageItransPath: languageItransPath ");
            sb.append(this.f47418a);
            if (this.f47418a.exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("delete path: ");
                sb2.append(this.f47418a);
                if (im4.this.f47397a != null) {
                    im4.this.f47397a.submit(new a());
                }
            }
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyError(String str) {
            Log.e("DownloadManager", "onCopyError: " + str);
            yyb yybVar = yyb.getInstance();
            String str2 = yyb.f103353d + this.f47419b.f47425a;
            zm4 zm4Var = zm4.FAILED;
            yybVar.putInt(str2, zm4Var.ordinal());
            this.f47419b.f47429e = zm4Var;
            yyb.getInstance().putString(yyb.f103354e, gyb.toJson(im4.this.f47402f));
            if (im4.this.f47404h != null) {
                im4.this.f47404h.onError(this.f47419b.f47425a, 3, new IOException("复制失败: " + str));
            }
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyProgress(int i) {
        }

        @Override // p000.sd4.InterfaceC12527b
        public void onCopyStart() {
        }
    }

    /* JADX INFO: renamed from: im4$e */
    public interface InterfaceC7493e {
        void onComplete(String str, File file);

        void onCopy(String str);

        void onError(String str, int i, Exception exc);

        void onPaused(String str);

        void onProgress(String str, int i);

        void onResumed(String str);

        void onStart(String str);

        void onUnzip(String str);

        void onWaiting(String str);
    }

    /* JADX INFO: renamed from: im4$f */
    public class RunnableC7494f implements Runnable {

        /* JADX INFO: renamed from: C */
        public volatile boolean f47422C = false;

        /* JADX INFO: renamed from: F */
        public volatile boolean f47423F = false;

        /* JADX INFO: renamed from: a */
        public String f47425a;

        /* JADX INFO: renamed from: b */
        public final String f47426b;

        /* JADX INFO: renamed from: c */
        public final String f47427c;

        /* JADX INFO: renamed from: d */
        public int f47428d;

        /* JADX INFO: renamed from: e */
        public zm4 f47429e;

        /* JADX INFO: renamed from: f */
        public InterfaceC7493e f47430f;

        /* JADX INFO: renamed from: m */
        public boolean f47431m;

        public RunnableC7494f(String str, String str2, String str3, InterfaceC7493e interfaceC7493e) {
            this.f47425a = str;
            this.f47426b = str2;
            this.f47427c = str3;
            this.f47430f = interfaceC7493e;
        }

        private void onDownloadPause(long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("下载已暂停: ");
            sb.append(this.f47426b);
            yyb.getInstance().putLong(yyb.f103352c + this.f47425a, j);
            yyb yybVar = yyb.getInstance();
            String str = yyb.f103353d + this.f47425a;
            zm4 zm4Var = zm4.PAUSED;
            yybVar.putInt(str, zm4Var.ordinal());
            this.f47429e = zm4Var;
            InterfaceC7493e interfaceC7493e = this.f47430f;
            if (interfaceC7493e != null) {
                interfaceC7493e.onPaused(this.f47425a);
            }
        }

        public void cancel() {
            this.f47422C = true;
        }

        public void pause() {
            this.f47423F = true;
        }

        public void resume() {
            this.f47423F = false;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:139|140|(2:211|141)|(2:142|(5:227|144|(1:247)(1:249)|166|199)(1:248))|150|151|239|152|(1:154)|157|(2:225|159)|(1:163)|166|199) */
        /* JADX WARN: Can't wrap try/catch for region: R(6:(18:44|(3:46|(1:48)|49)|223|107|229|(6:109|110|(2:213|112)|(1:116)|119|120)(2:125|(6:127|128|(2:215|130)|(1:134)|137|138)(15:139|140|211|141|(2:142|(5:227|144|(1:247)(1:249)|166|199)(1:248))|150|151|239|152|(1:154)|157|(2:225|159)|(1:163)|166|199))|156|66|237|179|(1:181)|184|(1:188)|(2:230|190)|(1:194)|(1:253)|166|199)(1:50)|232|56|(1:60)|67|(3:68|69|(3:235|71|(6:251|73|241|74|78|79)(2:80|(7:252|82|(1:84)|233|85|89|90)(4:91|(4:93|218|94|(1:96))(1:100)|101|102)))(2:250|106))) */
        /* JADX WARN: Can't wrap try/catch for region: R(8:34|(4:217|35|(1:39)|42)|(6:(18:44|(3:46|(1:48)|49)|223|107|229|(6:109|110|(2:213|112)|(1:116)|119|120)(2:125|(6:127|128|(2:215|130)|(1:134)|137|138)(15:139|140|211|141|(2:142|(5:227|144|(1:247)(1:249)|166|199)(1:248))|150|151|239|152|(1:154)|157|(2:225|159)|(1:163)|166|199))|156|66|237|179|(1:181)|184|(1:188)|(2:230|190)|(1:194)|(1:253)|166|199)(1:50)|232|56|(1:60)|67|(3:68|69|(3:235|71|(6:251|73|241|74|78|79)(2:80|(7:252|82|(1:84)|233|85|89|90)(4:91|(4:93|218|94|(1:96))(1:100)|101|102)))(2:250|106)))|51|(1:53)|54|243|55) */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x0399, code lost:
        
            r7.f47429e = p000.zm4.SUCCESS;
         */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x03b9, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:171:0x03f7, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:172:0x03f8, code lost:
        
            r2 = r0;
            r16 = r6;
            r6 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:173:0x03fe, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:174:0x03ff, code lost:
        
            r8 = p000.yyb.f103354e;
            r16 = r6;
            r6 = r13;
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01c1, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x01c2, code lost:
        
            r8 = p000.yyb.f103354e;
            r16 = r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:181:0x044e A[Catch: all -> 0x0455, TryCatch #20 {all -> 0x0455, blocks: (B:179:0x0412, B:181:0x044e, B:184:0x0459, B:186:0x0473, B:188:0x0479), top: B:237:0x0412 }] */
        /* JADX WARN: Removed duplicated region for block: B:186:0x0473 A[Catch: all -> 0x0455, TryCatch #20 {all -> 0x0455, blocks: (B:179:0x0412, B:181:0x044e, B:184:0x0459, B:186:0x0473, B:188:0x0479), top: B:237:0x0412 }] */
        /* JADX WARN: Removed duplicated region for block: B:194:0x0486 A[Catch: IOException -> 0x0482, TRY_LEAVE, TryCatch #13 {IOException -> 0x0482, blocks: (B:190:0x047e, B:194:0x0486), top: B:230:0x047e }] */
        /* JADX WARN: Removed duplicated region for block: B:205:0x04af A[Catch: IOException -> 0x04ab, TRY_LEAVE, TryCatch #6 {IOException -> 0x04ab, blocks: (B:201:0x04a7, B:205:0x04af), top: B:221:0x04a7 }] */
        /* JADX WARN: Removed duplicated region for block: B:209:0x04cb  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x04a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:230:0x047e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:254:? A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.im4.RunnableC7494f.run():void");
        }

        public void setDownloadListener(InterfaceC7493e interfaceC7493e) {
            this.f47430f = interfaceC7493e;
        }

        public void setSupportDownloadResumption(boolean z) {
            this.f47431m = z;
        }
    }

    /* JADX INFO: renamed from: im4$g */
    public static class C7495g {

        /* JADX INFO: renamed from: a */
        public static final im4 f47432a = new im4(null);

        private C7495g() {
        }
    }

    public /* synthetic */ im4(C7489a c7489a) {
        this();
    }

    private synchronized void doCopyLanguageEdPath(RunnableC7494f runnableC7494f, File file, File file2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("doCopyLanguageItransPath: languageEdPath ");
        sb.append(file);
        sb.append(", destEdPath ");
        sb.append(file2);
        sb.append(", language ");
        sb.append(str);
        new sd4(file, file2, new C7491c(file, str, runnableC7494f)).startCopy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void doCopyLanguageItransPath(RunnableC7494f runnableC7494f, File file, File file2) {
        StringBuilder sb = new StringBuilder();
        sb.append("doCopyLanguageItransPath: languageItransPath ");
        sb.append(file);
        sb.append(", destItransPath ");
        sb.append(file2);
        new sd4(file, file2, new C7492d(file, runnableC7494f)).startCopy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void doExtractFile(RunnableC7494f runnableC7494f, File file) {
        aui auiVar;
        sd4 sd4Var;
        try {
            String name = file.getName();
            boolean zIsBasicResourceZipFile = fyb.isBasicResourceZipFile(name);
            boolean zIsLanguageResourceZipFile = fyb.isLanguageResourceZipFile(name);
            if (zIsBasicResourceZipFile) {
                File file2 = new File(zyb.f106506d);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                auiVar = new aui(file, file2);
                sd4Var = new sd4(file2, new File(zyb.f106503a), new C7490b(file2, runnableC7494f));
            } else {
                auiVar = null;
                if (zIsLanguageResourceZipFile) {
                    File file3 = new File(zyb.f106507e);
                    if (!file3.exists()) {
                        file3.mkdirs();
                    }
                    aui auiVar2 = new aui(file, file3);
                    sd4Var = null;
                    auiVar = auiVar2;
                } else {
                    sd4Var = null;
                }
            }
            yyb yybVar = yyb.getInstance();
            String str = yyb.f103353d + runnableC7494f.f47425a;
            zm4 zm4Var = zm4.UNZIPING;
            yybVar.putInt(str, zm4Var.ordinal());
            runnableC7494f.f47429e = zm4Var;
            InterfaceC7493e interfaceC7493e = this.f47404h;
            if (interfaceC7493e != null) {
                interfaceC7493e.onUnzip(runnableC7494f.f47425a);
            }
            if (auiVar != null) {
                auiVar.unzip();
            }
            if (zIsBasicResourceZipFile) {
                yyb yybVar2 = yyb.getInstance();
                String str2 = yyb.f103353d + runnableC7494f.f47425a;
                zm4 zm4Var2 = zm4.COPYING;
                yybVar2.putInt(str2, zm4Var2.ordinal());
                runnableC7494f.f47429e = zm4Var2;
                InterfaceC7493e interfaceC7493e2 = this.f47404h;
                if (interfaceC7493e2 != null) {
                    interfaceC7493e2.onCopy(runnableC7494f.f47425a);
                }
                sd4Var.startCopy();
            } else {
                String languageFromZipFileName = fyb.getLanguageFromZipFileName(name);
                File file4 = new File(new File(zyb.f106507e + languageFromZipFileName + File.separator), zyb.f106513k);
                StringBuilder sb = new StringBuilder();
                sb.append(zyb.f106503a);
                sb.append(zyb.f106513k);
                File file5 = new File(sb.toString());
                if (!file4.getParentFile().exists()) {
                    file4.getParentFile().mkdirs();
                }
                if (!file4.exists()) {
                    file4.mkdirs();
                }
                if (!file5.getParentFile().exists()) {
                    file5.getParentFile().mkdirs();
                }
                if (!file5.exists()) {
                    file5.mkdirs();
                }
                if (file4.exists()) {
                    yyb.getInstance().putInt(yyb.f103353d + runnableC7494f.f47425a, zm4.COPYING.ordinal());
                    doCopyLanguageEdPath(runnableC7494f, file4, file5, languageFromZipFileName);
                } else {
                    yyb yybVar3 = yyb.getInstance();
                    String str3 = yyb.f103353d + runnableC7494f.f47425a;
                    zm4 zm4Var3 = zm4.FAILED;
                    yybVar3.putInt(str3, zm4Var3.ordinal());
                    Log.e("DownloadManager", "languageEdPath not exist");
                    runnableC7494f.f47429e = zm4Var3;
                    yyb.getInstance().putString(yyb.f103354e, gyb.toJson(this.f47402f));
                    InterfaceC7493e interfaceC7493e3 = this.f47404h;
                    if (interfaceC7493e3 != null) {
                        interfaceC7493e3.onError(runnableC7494f.f47425a, 3, new IOException("拷贝失败: languageEdPath not exist"));
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private RunnableC7494f findTask(String str) {
        for (RunnableC7494f runnableC7494f : this.f47402f) {
            if (TextUtils.equals(runnableC7494f.f47426b, str)) {
                return runnableC7494f;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void finishDownload(RunnableC7494f runnableC7494f) {
        RunnableC7494f runnableC7494fPoll;
        try {
            this.f47400d.remove(runnableC7494f);
            StringBuilder sb = new StringBuilder();
            sb.append("完成下载任务: ");
            sb.append(runnableC7494f.f47426b);
            sb.append(", 活跃任务数: ");
            sb.append(this.f47400d.size());
            if (!this.f47399c.isEmpty() && (runnableC7494fPoll = this.f47399c.poll()) != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("从等待队列取出任务: ");
                sb2.append(runnableC7494fPoll.f47426b);
                runnableC7494fPoll.f47429e = zm4.DOWNLOADING;
                InterfaceC7493e interfaceC7493e = this.f47404h;
                if (interfaceC7493e != null) {
                    interfaceC7493e.onStart(runnableC7494f.f47425a);
                }
                startDownload(runnableC7494fPoll);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized im4 getInstance() {
        return C7495g.f47432a;
    }

    private boolean isTaskExist(String str) {
        Iterator<RunnableC7494f> it = this.f47402f.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f47426b, str)) {
                return true;
            }
        }
        return false;
    }

    private void startDownload(RunnableC7494f runnableC7494f) {
        this.f47400d.add(runnableC7494f);
        this.f47397a.submit(runnableC7494f);
        StringBuilder sb = new StringBuilder();
        sb.append("开始下载任务: ");
        sb.append(runnableC7494f.f47426b);
        sb.append(", 活跃任务数: ");
        sb.append(this.f47400d.size());
    }

    public String addDownload(String str, String str2) {
        RunnableC7494f runnableC7494f;
        String string;
        RunnableC7494f runnableC7494fFindTask = findTask(str);
        if (runnableC7494fFindTask == null) {
            string = UUID.randomUUID().toString();
            runnableC7494f = new RunnableC7494f(string, str, str2, this.f47404h);
            this.f47402f.add(runnableC7494f);
            yyb.getInstance().putString(yyb.f103354e, gyb.toJson(this.f47402f));
        } else {
            String str3 = runnableC7494fFindTask.f47425a;
            runnableC7494fFindTask.setDownloadListener(this.f47404h);
            if (isExistInActiveTasks(str3)) {
                runnableC7494fFindTask.f47429e = zm4.DOWNLOADING;
                yyb.getInstance().putString(yyb.f103354e, gyb.toJson(this.f47402f));
                return str3;
            }
            runnableC7494f = runnableC7494fFindTask;
            string = str3;
        }
        long availableSpace = fyb.getAvailableSpace(new File("/sdcard/"));
        StringBuilder sb = new StringBuilder();
        sb.append("addDownload: remainSpace ");
        sb.append(availableSpace);
        if (availableSpace >= 1572864000) {
            if (this.f47400d.size() < 100) {
                runnableC7494f.f47429e = zm4.DOWNLOADING;
                yyb.getInstance().putString(yyb.f103354e, gyb.toJson(this.f47402f));
                InterfaceC7493e interfaceC7493e = this.f47404h;
                if (interfaceC7493e != null) {
                    interfaceC7493e.onStart(runnableC7494f.f47425a);
                }
                startDownload(runnableC7494f);
            } else {
                this.f47399c.offer(runnableC7494f);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("任务加入等待队列: ");
                sb2.append(str);
                runnableC7494f.f47429e = zm4.WAITING;
                InterfaceC7493e interfaceC7493e2 = this.f47404h;
                if (interfaceC7493e2 != null) {
                    interfaceC7493e2.onWaiting(string);
                }
            }
            return string;
        }
        Log.e("DownloadManager", "SD卡空间不足，无法下载: " + str);
        yyb yybVar = yyb.getInstance();
        String str4 = yyb.f103353d + string;
        zm4 zm4Var = zm4.FAILED;
        yybVar.putInt(str4, zm4Var.ordinal());
        runnableC7494f.f47429e = zm4Var;
        yyb.getInstance().putString(yyb.f103354e, gyb.toJson(this.f47402f));
        InterfaceC7493e interfaceC7493e3 = this.f47404h;
        if (interfaceC7493e3 != null) {
            interfaceC7493e3.onError(string, 1, new IOException("SD卡空间不足"));
        }
        return string;
    }

    public synchronized void cancelAll() {
        try {
            Iterator<RunnableC7494f> it = this.f47400d.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f47400d.clear();
            this.f47401e.clear();
            this.f47399c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void download(String str) {
        addDownload(str, zyb.f106503a + System.currentTimeMillis() + zyb.f106510h);
    }

    public String downloadOfflineBasicResource(String str) {
        return addDownload(str, zyb.f106505c + zyb.f106512j);
    }

    public String downloadOfflineLanguageResource(String str, String str2) {
        String str3 = zyb.f106505c + str + zyb.f106510h;
        StringBuilder sb = new StringBuilder();
        sb.append("downloadOfflineLanguageResource: destinationPath ");
        sb.append(str3);
        return addDownload(str2, str3);
    }

    public synchronized int getActiveTaskCount() {
        return this.f47400d.size();
    }

    public List<vk4> getAllDownloadData() {
        ArrayList arrayList = new ArrayList();
        List<RunnableC7494f> list = this.f47402f;
        if (list != null) {
            for (RunnableC7494f runnableC7494f : list) {
                vk4 vk4Var = new vk4();
                vk4Var.setUrl(runnableC7494f.f47426b);
                vk4Var.setTaskId(runnableC7494f.f47425a);
                vk4Var.setDownloadStatus(runnableC7494f.f47429e);
                if ((runnableC7494f.f47429e == zm4.DOWNLOADING || runnableC7494f.f47429e == zm4.UNZIPING) && !isExistInActiveTasks(runnableC7494f.f47425a)) {
                    vk4Var.setDownloadStatus(zm4.NOT_START);
                }
                vk4Var.setProgress(runnableC7494f.f47428d);
                arrayList.add(vk4Var);
            }
        }
        return arrayList;
    }

    public synchronized int getWaitingTaskCount() {
        return this.f47399c.size();
    }

    public void init(Context context) {
        if (this.f47407k) {
            return;
        }
        this.f47405i.init(context);
        List list = (List) gyb.fromJson(yyb.getInstance().getString(yyb.f103354e, ""), new C7489a().getType());
        this.f47402f.clear();
        if (list != null) {
            this.f47402f.addAll(list);
        }
        this.f47407k = true;
    }

    public boolean isExistInActiveTasks(String str) {
        Iterator<RunnableC7494f> it = this.f47400d.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f47425a, str)) {
                return true;
            }
        }
        return false;
    }

    public boolean isExistInActiveTasksByUrl(String str) {
        Iterator<RunnableC7494f> it = this.f47400d.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f47426b, str)) {
                return true;
            }
        }
        return false;
    }

    public void pause(String str) {
        if (this.f47406j) {
            for (RunnableC7494f runnableC7494f : this.f47400d) {
                if (TextUtils.equals(runnableC7494f.f47425a, str)) {
                    this.f47401e.add(runnableC7494f);
                    this.f47400d.remove(runnableC7494f);
                    runnableC7494f.pause();
                    StringBuilder sb = new StringBuilder();
                    sb.append("暂停下载任务: ");
                    sb.append(str);
                    return;
                }
            }
        }
    }

    public void resume(String str) {
        if (this.f47406j) {
            for (RunnableC7494f runnableC7494f : this.f47401e) {
                if (TextUtils.equals(runnableC7494f.f47425a, str)) {
                    this.f47401e.remove(runnableC7494f);
                    this.f47400d.add(runnableC7494f);
                    runnableC7494f.resume();
                    this.f47397a.submit(runnableC7494f);
                    StringBuilder sb = new StringBuilder();
                    sb.append("继续下载任务: ");
                    sb.append(str);
                    return;
                }
            }
        }
    }

    public void setDownloadListener(InterfaceC7493e interfaceC7493e) {
        this.f47404h = interfaceC7493e;
        Iterator<RunnableC7494f> it = this.f47400d.iterator();
        while (it.hasNext()) {
            it.next().setDownloadListener(this.f47404h);
        }
    }

    private im4() {
        this.f47398b = new Object();
        this.f47399c = new ConcurrentLinkedQueue();
        this.f47400d = Collections.synchronizedList(new LinkedList());
        this.f47401e = Collections.synchronizedList(new LinkedList());
        this.f47402f = new ArrayList();
        this.f47397a = Executors.newFixedThreadPool(6);
        this.f47405i = yyb.getInstance();
    }
}

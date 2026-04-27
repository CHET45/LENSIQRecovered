package p000;

import android.content.Context;
import android.content.Intent;
import androidx.room.MultiInstanceInvalidationService;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p000.p7e;
import p000.uae;
import p000.xfg;

/* JADX INFO: loaded from: classes3.dex */
public class ni3 {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final Context f64636a;

    /* JADX INFO: renamed from: b */
    @gib
    @un8
    public final String f64637b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public final xfg.InterfaceC15048c f64638c;

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public final uae.C13436e f64639d;

    /* JADX INFO: renamed from: e */
    @gib
    @un8
    public final List<uae.AbstractC13433b> f64640e;

    /* JADX INFO: renamed from: f */
    @un8
    public final boolean f64641f;

    /* JADX INFO: renamed from: g */
    @un8
    @yfb
    public final uae.EnumC13435d f64642g;

    /* JADX INFO: renamed from: h */
    @un8
    @yfb
    public final Executor f64643h;

    /* JADX INFO: renamed from: i */
    @un8
    @yfb
    public final Executor f64644i;

    /* JADX INFO: renamed from: j */
    @gib
    @un8
    @p7e({p7e.EnumC10826a.f69936c})
    public final Intent f64645j;

    /* JADX INFO: renamed from: k */
    @un8
    public final boolean f64646k;

    /* JADX INFO: renamed from: l */
    @un8
    public final boolean f64647l;

    /* JADX INFO: renamed from: m */
    @gib
    public final Set<Integer> f64648m;

    /* JADX INFO: renamed from: n */
    @gib
    @un8
    public final String f64649n;

    /* JADX INFO: renamed from: o */
    @gib
    @un8
    public final File f64650o;

    /* JADX INFO: renamed from: p */
    @gib
    @un8
    public final Callable<InputStream> f64651p;

    /* JADX INFO: renamed from: q */
    @gib
    @un8
    public final uae.AbstractC13437f f64652q;

    /* JADX INFO: renamed from: r */
    @un8
    @yfb
    public final List<Object> f64653r;

    /* JADX INFO: renamed from: s */
    @un8
    @yfb
    public final List<zi0> f64654s;

    /* JADX INFO: renamed from: t */
    @un8
    public final boolean f64655t;

    /* JADX WARN: Multi-variable type inference failed */
    @igg({"LambdaLast"})
    @p7e({p7e.EnumC10826a.f69936c})
    public ni3(@yfb Context context, @gib String str, @yfb xfg.InterfaceC15048c interfaceC15048c, @yfb uae.C13436e c13436e, @gib List<? extends uae.AbstractC13433b> list, boolean z, @yfb uae.EnumC13435d enumC13435d, @yfb Executor executor, @yfb Executor executor2, @gib Intent intent, boolean z2, boolean z3, @gib Set<Integer> set, @gib String str2, @gib File file, @gib Callable<InputStream> callable, @gib uae.AbstractC13437f abstractC13437f, @yfb List<? extends Object> list2, @yfb List<? extends zi0> list3) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(interfaceC15048c, "sqliteOpenHelperFactory");
        md8.checkNotNullParameter(c13436e, "migrationContainer");
        md8.checkNotNullParameter(enumC13435d, "journalMode");
        md8.checkNotNullParameter(executor, "queryExecutor");
        md8.checkNotNullParameter(executor2, "transactionExecutor");
        md8.checkNotNullParameter(list2, "typeConverters");
        md8.checkNotNullParameter(list3, "autoMigrationSpecs");
        this.f64636a = context;
        this.f64637b = str;
        this.f64638c = interfaceC15048c;
        this.f64639d = c13436e;
        this.f64640e = list;
        this.f64641f = z;
        this.f64642g = enumC13435d;
        this.f64643h = executor;
        this.f64644i = executor2;
        this.f64645j = intent;
        this.f64646k = z2;
        this.f64647l = z3;
        this.f64648m = set;
        this.f64649n = str2;
        this.f64650o = file;
        this.f64651p = callable;
        this.f64652q = abstractC13437f;
        this.f64653r = list2;
        this.f64654s = list3;
        this.f64655t = intent != null;
    }

    public boolean isMigrationRequired(int i, int i2) {
        if ((i > i2 && this.f64647l) || !this.f64646k) {
            return false;
        }
        Set<Integer> set = this.f64648m;
        return set == null || !set.contains(Integer.valueOf(i));
    }

    @q64(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @i2e(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    public boolean isMigrationRequiredFrom(int i) {
        return isMigrationRequired(i, i + 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p7e({p7e.EnumC10826a.f69936c})
    @q64(message = "This constructor is deprecated.", replaceWith = @i2e(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public ni3(@yfb Context context, @gib String str, @yfb xfg.InterfaceC15048c interfaceC15048c, @yfb uae.C13436e c13436e, @gib List<? extends uae.AbstractC13433b> list, boolean z, @yfb uae.EnumC13435d enumC13435d, @yfb Executor executor, boolean z2, @gib Set<Integer> set) {
        this(context, str, interfaceC15048c, c13436e, list, z, enumC13435d, executor, executor, (Intent) null, z2, false, set, (String) null, (File) null, (Callable<InputStream>) null, (uae.AbstractC13437f) null, (List<? extends Object>) l82.emptyList(), (List<? extends zi0>) l82.emptyList());
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(interfaceC15048c, "sqliteOpenHelperFactory");
        md8.checkNotNullParameter(c13436e, "migrationContainer");
        md8.checkNotNullParameter(enumC13435d, "journalMode");
        md8.checkNotNullParameter(executor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p7e({p7e.EnumC10826a.f69936c})
    @q64(message = "This constructor is deprecated.", replaceWith = @i2e(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public ni3(@yfb Context context, @gib String str, @yfb xfg.InterfaceC15048c interfaceC15048c, @yfb uae.C13436e c13436e, @gib List<? extends uae.AbstractC13433b> list, boolean z, @yfb uae.EnumC13435d enumC13435d, @yfb Executor executor, @yfb Executor executor2, boolean z2, boolean z3, boolean z4, @gib Set<Integer> set) {
        this(context, str, interfaceC15048c, c13436e, list, z, enumC13435d, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, (String) null, (File) null, (Callable<InputStream>) null, (uae.AbstractC13437f) null, (List<? extends Object>) l82.emptyList(), (List<? extends zi0>) l82.emptyList());
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(interfaceC15048c, "sqliteOpenHelperFactory");
        md8.checkNotNullParameter(c13436e, "migrationContainer");
        md8.checkNotNullParameter(enumC13435d, "journalMode");
        md8.checkNotNullParameter(executor, "queryExecutor");
        md8.checkNotNullParameter(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p7e({p7e.EnumC10826a.f69936c})
    @q64(message = "This constructor is deprecated.", replaceWith = @i2e(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public ni3(@yfb Context context, @gib String str, @yfb xfg.InterfaceC15048c interfaceC15048c, @yfb uae.C13436e c13436e, @gib List<? extends uae.AbstractC13433b> list, boolean z, @yfb uae.EnumC13435d enumC13435d, @yfb Executor executor, @yfb Executor executor2, boolean z2, boolean z3, boolean z4, @gib Set<Integer> set, @gib String str2, @gib File file) {
        this(context, str, interfaceC15048c, c13436e, list, z, enumC13435d, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, (Callable<InputStream>) null, (uae.AbstractC13437f) null, (List<? extends Object>) l82.emptyList(), (List<? extends zi0>) l82.emptyList());
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(interfaceC15048c, "sqliteOpenHelperFactory");
        md8.checkNotNullParameter(c13436e, "migrationContainer");
        md8.checkNotNullParameter(enumC13435d, "journalMode");
        md8.checkNotNullParameter(executor, "queryExecutor");
        md8.checkNotNullParameter(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p7e({p7e.EnumC10826a.f69936c})
    @q64(message = "This constructor is deprecated.", replaceWith = @i2e(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public ni3(@yfb Context context, @gib String str, @yfb xfg.InterfaceC15048c interfaceC15048c, @yfb uae.C13436e c13436e, @gib List<? extends uae.AbstractC13433b> list, boolean z, @yfb uae.EnumC13435d enumC13435d, @yfb Executor executor, @yfb Executor executor2, boolean z2, boolean z3, boolean z4, @gib Set<Integer> set, @gib String str2, @gib File file, @gib Callable<InputStream> callable) {
        this(context, str, interfaceC15048c, c13436e, list, z, enumC13435d, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, (uae.AbstractC13437f) null, (List<? extends Object>) l82.emptyList(), (List<? extends zi0>) l82.emptyList());
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(interfaceC15048c, "sqliteOpenHelperFactory");
        md8.checkNotNullParameter(c13436e, "migrationContainer");
        md8.checkNotNullParameter(enumC13435d, "journalMode");
        md8.checkNotNullParameter(executor, "queryExecutor");
        md8.checkNotNullParameter(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @igg({"LambdaLast"})
    @p7e({p7e.EnumC10826a.f69936c})
    @q64(message = "This constructor is deprecated.", replaceWith = @i2e(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public ni3(@yfb Context context, @gib String str, @yfb xfg.InterfaceC15048c interfaceC15048c, @yfb uae.C13436e c13436e, @gib List<? extends uae.AbstractC13433b> list, boolean z, @yfb uae.EnumC13435d enumC13435d, @yfb Executor executor, @yfb Executor executor2, boolean z2, boolean z3, boolean z4, @gib Set<Integer> set, @gib String str2, @gib File file, @gib Callable<InputStream> callable, @gib uae.AbstractC13437f abstractC13437f) {
        this(context, str, interfaceC15048c, c13436e, list, z, enumC13435d, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, abstractC13437f, (List<? extends Object>) l82.emptyList(), (List<? extends zi0>) l82.emptyList());
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(interfaceC15048c, "sqliteOpenHelperFactory");
        md8.checkNotNullParameter(c13436e, "migrationContainer");
        md8.checkNotNullParameter(enumC13435d, "journalMode");
        md8.checkNotNullParameter(executor, "queryExecutor");
        md8.checkNotNullParameter(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @igg({"LambdaLast"})
    @p7e({p7e.EnumC10826a.f69936c})
    @q64(message = "This constructor is deprecated.", replaceWith = @i2e(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public ni3(@yfb Context context, @gib String str, @yfb xfg.InterfaceC15048c interfaceC15048c, @yfb uae.C13436e c13436e, @gib List<? extends uae.AbstractC13433b> list, boolean z, @yfb uae.EnumC13435d enumC13435d, @yfb Executor executor, @yfb Executor executor2, boolean z2, boolean z3, boolean z4, @gib Set<Integer> set, @gib String str2, @gib File file, @gib Callable<InputStream> callable, @gib uae.AbstractC13437f abstractC13437f, @yfb List<? extends Object> list2) {
        this(context, str, interfaceC15048c, c13436e, list, z, enumC13435d, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, abstractC13437f, list2, (List<? extends zi0>) l82.emptyList());
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(interfaceC15048c, "sqliteOpenHelperFactory");
        md8.checkNotNullParameter(c13436e, "migrationContainer");
        md8.checkNotNullParameter(enumC13435d, "journalMode");
        md8.checkNotNullParameter(executor, "queryExecutor");
        md8.checkNotNullParameter(executor2, "transactionExecutor");
        md8.checkNotNullParameter(list2, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @igg({"LambdaLast"})
    @p7e({p7e.EnumC10826a.f69936c})
    @q64(message = "This constructor is deprecated.", replaceWith = @i2e(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public ni3(@yfb Context context, @gib String str, @yfb xfg.InterfaceC15048c interfaceC15048c, @yfb uae.C13436e c13436e, @gib List<? extends uae.AbstractC13433b> list, boolean z, @yfb uae.EnumC13435d enumC13435d, @yfb Executor executor, @yfb Executor executor2, boolean z2, boolean z3, boolean z4, @gib Set<Integer> set, @gib String str2, @gib File file, @gib Callable<InputStream> callable, @gib uae.AbstractC13437f abstractC13437f, @yfb List<? extends Object> list2, @yfb List<? extends zi0> list3) {
        this(context, str, interfaceC15048c, c13436e, list, z, enumC13435d, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, (uae.AbstractC13437f) null, list2, list3);
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(interfaceC15048c, "sqliteOpenHelperFactory");
        md8.checkNotNullParameter(c13436e, "migrationContainer");
        md8.checkNotNullParameter(enumC13435d, "journalMode");
        md8.checkNotNullParameter(executor, "queryExecutor");
        md8.checkNotNullParameter(executor2, "transactionExecutor");
        md8.checkNotNullParameter(list2, "typeConverters");
        md8.checkNotNullParameter(list3, "autoMigrationSpecs");
    }
}

package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import p000.eh4;

/* JADX INFO: loaded from: classes7.dex */
public final class ij8 implements eh4.InterfaceC5306g {

    /* JADX INFO: renamed from: a */
    @eib
    public static final Throwable f47177a = initJndi();

    /* JADX INFO: renamed from: ij8$b */
    @gdi
    public static final class C7317b implements eh4.InterfaceC5305f {

        /* JADX INFO: renamed from: b */
        public static final Logger f47179b = Logger.getLogger(C7317b.class.getName());

        /* JADX INFO: renamed from: c */
        public static final Pattern f47180c = Pattern.compile("\\s+");

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ boolean f47181d = false;

        /* JADX INFO: renamed from: a */
        public final InterfaceC7318c f47182a;

        public C7317b(InterfaceC7318c interfaceC7318c) {
            this.f47182a = interfaceC7318c;
        }

        @gdi
        /* JADX INFO: renamed from: a */
        public static String m13134a(String str) {
            StringBuilder sb = new StringBuilder(str.length());
            int i = 0;
            boolean z = false;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (z) {
                    if (cCharAt == '\"') {
                        z = false;
                    } else {
                        if (cCharAt == '\\') {
                            i++;
                            cCharAt = str.charAt(i);
                        }
                        sb.append(cCharAt);
                    }
                } else if (cCharAt != ' ') {
                    if (cCharAt == '\"') {
                        z = true;
                    } else {
                        sb.append(cCharAt);
                    }
                }
                i++;
            }
            return sb.toString();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        @Override // p000.eh4.InterfaceC5305f
        public List<eh4.C5307h> resolveSrv(String str) throws Exception {
            Logger logger = f47179b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query SRV records for {0}", new Object[]{str});
            }
            List<String> allRecords = this.f47182a.getAllRecords("SRV", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} SRV records", new Object[]{Integer.valueOf(allRecords.size())});
            }
            ArrayList arrayList = new ArrayList(allRecords.size());
            Level level2 = Level.WARNING;
            RuntimeException runtimeException = null;
            for (String str2 : allRecords) {
                try {
                    String[] strArrSplit = f47180c.split(str2, 5);
                    s4i.verify(strArrSplit.length == 4, "Bad SRV Record: %s", str2);
                    if (!strArrSplit[3].endsWith(".")) {
                        throw new RuntimeException("Returned SRV host does not end in period: " + strArrSplit[3]);
                    }
                    arrayList.add(new eh4.C5307h(strArrSplit[3], Integer.parseInt(strArrSplit[2])));
                } catch (RuntimeException e) {
                    f47179b.log(level2, "Failed to construct SRV record " + str2, (Throwable) e);
                    if (runtimeException == null) {
                        level2 = Level.FINE;
                        runtimeException = e;
                    }
                }
            }
            if (!arrayList.isEmpty() || runtimeException == null) {
                return Collections.unmodifiableList(arrayList);
            }
            throw runtimeException;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        @Override // p000.eh4.InterfaceC5305f
        public List<String> resolveTxt(String str) throws NamingException {
            Logger logger = f47179b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            List<String> allRecords = this.f47182a.getAllRecords("TXT", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(allRecords.size())});
            }
            ArrayList arrayList = new ArrayList(allRecords.size());
            Iterator<String> it = allRecords.iterator();
            while (it.hasNext()) {
                arrayList.add(m13134a(it.next()));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    /* JADX INFO: renamed from: ij8$c */
    @gdi
    public interface InterfaceC7318c {
        List<String> getAllRecords(String str, String str2) throws NamingException;
    }

    @eib
    private static Throwable initJndi() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException | Error | RuntimeException e) {
            return e;
        }
    }

    @Override // p000.eh4.InterfaceC5306g
    @eib
    public eh4.InterfaceC5305f newResourceResolver() {
        if (unavailabilityCause() != null) {
            return null;
        }
        return new C7317b(new C7316a());
    }

    @Override // p000.eh4.InterfaceC5306g
    @eib
    public Throwable unavailabilityCause() {
        return f47177a;
    }

    /* JADX INFO: renamed from: ij8$a */
    @gdi
    @igg({"all"})
    @yr7
    public static final class C7316a implements InterfaceC7318c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ boolean f47178a = false;

        private static void checkAvailable() {
            if (ij8.f47177a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", ij8.f47177a);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        private static void closeThenThrow(NamingEnumeration<?> namingEnumeration, NamingException namingException) throws NamingException {
            try {
                namingEnumeration.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        @Override // p000.ij8.InterfaceC7318c
        public List<String> getAllRecords(String str, String str2) throws NamingException {
            checkAvailable();
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e) {
                                closeThenThrow((NamingEnumeration<?>) all2, e);
                            }
                        }
                        all2.close();
                    } catch (NamingException e2) {
                        closeThenThrow((NamingEnumeration<?>) all, e2);
                    }
                }
                all.close();
            } catch (NamingException e3) {
                closeThenThrow((DirContext) initialDirContext, e3);
            }
            initialDirContext.close();
            return arrayList;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        private static void closeThenThrow(DirContext dirContext, NamingException namingException) throws NamingException {
            try {
                dirContext.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }
    }
}

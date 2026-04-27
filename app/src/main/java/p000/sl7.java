package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tw7
@nx4
public final class sl7 implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final int f82172d = -1;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final String f82173a;

    /* JADX INFO: renamed from: b */
    public final int f82174b;

    /* JADX INFO: renamed from: c */
    public final boolean f82175c;

    private sl7(String host, int port, boolean hasBracketlessColons) {
        this.f82173a = host;
        this.f82174b = port;
        this.f82175c = hasBracketlessColons;
    }

    public static sl7 fromHost(String host) {
        sl7 sl7VarFromString = fromString(host);
        v7d.checkArgument(!sl7VarFromString.hasPort(), "Host has a port: %s", host);
        return sl7VarFromString;
    }

    public static sl7 fromParts(String host, int port) {
        v7d.checkArgument(isValidPort(port), "Port out of range: %s", port);
        sl7 sl7VarFromString = fromString(host);
        v7d.checkArgument(!sl7VarFromString.hasPort(), "Host has a port: %s", host);
        return new sl7(sl7VarFromString.f82173a, port, sl7VarFromString.f82175c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @p000.op1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.sl7 fromString(java.lang.String r8) {
        /*
            p000.v7d.checkNotNull(r8)
            java.lang.String r0 = "["
            boolean r0 = r8.startsWith(r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L19
            java.lang.String[] r0 = getHostAndPortFromBracketedHost(r8)
            r4 = r0[r3]
            r0 = r0[r2]
        L16:
            r5 = r4
            r4 = r3
            goto L3c
        L19:
            r0 = 58
            int r4 = r8.indexOf(r0)
            if (r4 < 0) goto L32
            int r5 = r4 + 1
            int r0 = r8.indexOf(r0, r5)
            if (r0 != r1) goto L32
            java.lang.String r4 = r8.substring(r3, r4)
            java.lang.String r0 = r8.substring(r5)
            goto L16
        L32:
            if (r4 < 0) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r3
        L37:
            r4 = 0
            r5 = r8
            r7 = r4
            r4 = r0
            r0 = r7
        L3c:
            boolean r6 = p000.u8g.isNullOrEmpty(r0)
            if (r6 != 0) goto L80
            java.lang.String r1 = "+"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L55
            yv1 r1 = p000.yv1.ascii()
            boolean r1 = r1.matchesAllOf(r0)
            if (r1 == 0) goto L55
            goto L56
        L55:
            r2 = r3
        L56:
            java.lang.String r1 = "Unparseable port number: %s"
            p000.v7d.checkArgument(r2, r1, r8)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L69
            boolean r0 = isValidPort(r1)
            java.lang.String r2 = "Port number out of range: %s"
            p000.v7d.checkArgument(r0, r2, r8)
            goto L80
        L69:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unparseable port number: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L80:
            sl7 r8 = new sl7
            r8.<init>(r5, r1, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sl7.fromString(java.lang.String):sl7");
    }

    private static String[] getHostAndPortFromBracketedHost(String hostPortString) {
        v7d.checkArgument(hostPortString.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", hostPortString);
        int iIndexOf = hostPortString.indexOf(58);
        int iLastIndexOf = hostPortString.lastIndexOf(93);
        v7d.checkArgument(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", hostPortString);
        String strSubstring = hostPortString.substring(1, iLastIndexOf);
        int i = iLastIndexOf + 1;
        if (i == hostPortString.length()) {
            return new String[]{strSubstring, ""};
        }
        v7d.checkArgument(hostPortString.charAt(i) == ':', "Only a colon may follow a close bracket: %s", hostPortString);
        int i2 = iLastIndexOf + 2;
        for (int i3 = i2; i3 < hostPortString.length(); i3++) {
            v7d.checkArgument(Character.isDigit(hostPortString.charAt(i3)), "Port must be numeric: %s", hostPortString);
        }
        return new String[]{strSubstring, hostPortString.substring(i2)};
    }

    private static boolean isValidPort(int port) {
        return port >= 0 && port <= 65535;
    }

    public boolean equals(@wx1 Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof sl7)) {
            return false;
        }
        sl7 sl7Var = (sl7) other;
        return okb.equal(this.f82173a, sl7Var.f82173a) && this.f82174b == sl7Var.f82174b;
    }

    public String getHost() {
        return this.f82173a;
    }

    public int getPort() {
        v7d.checkState(hasPort());
        return this.f82174b;
    }

    public int getPortOrDefault(int defaultPort) {
        return hasPort() ? this.f82174b : defaultPort;
    }

    public boolean hasPort() {
        return this.f82174b >= 0;
    }

    public int hashCode() {
        return okb.hashCode(this.f82173a, Integer.valueOf(this.f82174b));
    }

    @op1
    public sl7 requireBracketsForIPv6() {
        v7d.checkArgument(!this.f82175c, "Possible bracketless IPv6 literal: %s", this.f82173a);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f82173a.length() + 8);
        if (this.f82173a.indexOf(58) >= 0) {
            sb.append(C4584d2.f28242k);
            sb.append(this.f82173a);
            sb.append(C4584d2.f28243l);
        } else {
            sb.append(this.f82173a);
        }
        if (hasPort()) {
            sb.append(':');
            sb.append(this.f82174b);
        }
        return sb.toString();
    }

    public sl7 withDefaultPort(int defaultPort) {
        v7d.checkArgument(isValidPort(defaultPort));
        return hasPort() ? this : new sl7(this.f82173a, defaultPort, this.f82175c);
    }
}

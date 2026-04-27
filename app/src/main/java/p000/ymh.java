package p000;

/* JADX INFO: loaded from: classes.dex */
public interface ymh {

    /* JADX INFO: renamed from: a */
    public static final String f102075a = "CUSTOM";

    /* JADX INFO: renamed from: b */
    public static final int f102076b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f102077c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f102078d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f102079e = 8;

    /* JADX INFO: renamed from: f */
    public static final int f102080f = 100;

    /* JADX INFO: renamed from: g */
    public static final int f102081g = 101;

    /* JADX INFO: renamed from: ymh$a */
    public interface InterfaceC15722a {

        /* JADX INFO: renamed from: A */
        public static final String f102082A = "rotationX";

        /* JADX INFO: renamed from: B */
        public static final String f102083B = "rotationY";

        /* JADX INFO: renamed from: C */
        public static final String f102084C = "rotationZ";

        /* JADX INFO: renamed from: D */
        public static final String f102085D = "scaleX";

        /* JADX INFO: renamed from: E */
        public static final String f102086E = "scaleY";

        /* JADX INFO: renamed from: F */
        public static final String f102087F = "pivotX";

        /* JADX INFO: renamed from: G */
        public static final String f102088G = "pivotY";

        /* JADX INFO: renamed from: H */
        public static final String f102089H = "progress";

        /* JADX INFO: renamed from: I */
        public static final String f102090I = "pathRotate";

        /* JADX INFO: renamed from: J */
        public static final String f102091J = "easing";

        /* JADX INFO: renamed from: K */
        public static final String f102092K = "CUSTOM";

        /* JADX INFO: renamed from: M */
        public static final String f102094M = "target";

        /* JADX INFO: renamed from: a */
        public static final String f102097a = "KeyAttributes";

        /* JADX INFO: renamed from: b */
        public static final int f102098b = 301;

        /* JADX INFO: renamed from: c */
        public static final int f102099c = 302;

        /* JADX INFO: renamed from: d */
        public static final int f102100d = 303;

        /* JADX INFO: renamed from: e */
        public static final int f102101e = 304;

        /* JADX INFO: renamed from: f */
        public static final int f102102f = 305;

        /* JADX INFO: renamed from: g */
        public static final int f102103g = 306;

        /* JADX INFO: renamed from: h */
        public static final int f102104h = 307;

        /* JADX INFO: renamed from: i */
        public static final int f102105i = 308;

        /* JADX INFO: renamed from: j */
        public static final int f102106j = 309;

        /* JADX INFO: renamed from: k */
        public static final int f102107k = 310;

        /* JADX INFO: renamed from: l */
        public static final int f102108l = 311;

        /* JADX INFO: renamed from: m */
        public static final int f102109m = 312;

        /* JADX INFO: renamed from: n */
        public static final int f102110n = 313;

        /* JADX INFO: renamed from: o */
        public static final int f102111o = 314;

        /* JADX INFO: renamed from: p */
        public static final int f102112p = 315;

        /* JADX INFO: renamed from: q */
        public static final int f102113q = 316;

        /* JADX INFO: renamed from: r */
        public static final int f102114r = 317;

        /* JADX INFO: renamed from: s */
        public static final int f102115s = 318;

        /* JADX INFO: renamed from: t */
        public static final String f102116t = "curveFit";

        /* JADX INFO: renamed from: u */
        public static final String f102117u = "visibility";

        /* JADX INFO: renamed from: v */
        public static final String f102118v = "alpha";

        /* JADX INFO: renamed from: w */
        public static final String f102119w = "translationX";

        /* JADX INFO: renamed from: x */
        public static final String f102120x = "translationY";

        /* JADX INFO: renamed from: y */
        public static final String f102121y = "translationZ";

        /* JADX INFO: renamed from: z */
        public static final String f102122z = "elevation";

        /* JADX INFO: renamed from: L */
        public static final String f102093L = "frame";

        /* JADX INFO: renamed from: N */
        public static final String f102095N = "pivotTarget";

        /* JADX INFO: renamed from: O */
        public static final String[] f102096O = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", f102093L, "target", f102095N};

        static int getId(String str) {
            str.hashCode();
            switch (str) {
                case "easing":
                    return 317;
                case "rotationX":
                    return 308;
                case "rotationY":
                    return 309;
                case "rotationZ":
                    return 310;
                case "translationX":
                    return 304;
                case "translationY":
                    return 305;
                case "translationZ":
                    return 306;
                case "progress":
                    return 315;
                case "pivotX":
                    return 313;
                case "pivotY":
                    return 314;
                case "scaleX":
                    return 311;
                case "scaleY":
                    return 312;
                case "target":
                    return 101;
                case "elevation":
                    return 307;
                case "alpha":
                    return 303;
                case "frame":
                    return 100;
                case "curveFit":
                    return 301;
                case "pathRotate":
                    return f102113q;
                case "pivotTarget":
                    return f102115s;
                case "visibility":
                    return 302;
                default:
                    return -1;
            }
        }

        static int getType(int i) {
            if (i == 100) {
                return 2;
            }
            if (i == 101) {
                return 8;
            }
            switch (i) {
                case 301:
                case 302:
                    return 2;
                case 303:
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 315:
                case f102113q /* 316 */:
                    return 4;
                case 317:
                case f102115s /* 318 */:
                    return 8;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: renamed from: ymh$b */
    public interface InterfaceC15723b {

        /* JADX INFO: renamed from: a */
        public static final String f102123a = "Custom";

        /* JADX INFO: renamed from: b */
        public static final String f102124b = "integer";

        /* JADX INFO: renamed from: d */
        public static final String f102126d = "color";

        /* JADX INFO: renamed from: j */
        public static final int f102132j = 900;

        /* JADX INFO: renamed from: k */
        public static final int f102133k = 901;

        /* JADX INFO: renamed from: l */
        public static final int f102134l = 902;

        /* JADX INFO: renamed from: m */
        public static final int f102135m = 903;

        /* JADX INFO: renamed from: n */
        public static final int f102136n = 904;

        /* JADX INFO: renamed from: o */
        public static final int f102137o = 905;

        /* JADX INFO: renamed from: p */
        public static final int f102138p = 906;

        /* JADX INFO: renamed from: c */
        public static final String f102125c = "float";

        /* JADX INFO: renamed from: e */
        public static final String f102127e = "string";

        /* JADX INFO: renamed from: f */
        public static final String f102128f = "boolean";

        /* JADX INFO: renamed from: g */
        public static final String f102129g = "dimension";

        /* JADX INFO: renamed from: h */
        public static final String f102130h = "refrence";

        /* JADX INFO: renamed from: i */
        public static final String[] f102131i = {f102125c, "color", f102127e, f102128f, f102129g, f102130h};

        static int getId(String str) {
            str.hashCode();
            switch (str) {
                case "dimension":
                    return f102137o;
                case "string":
                    return f102135m;
                case "refrence":
                    return f102138p;
                case "boolean":
                    return f102136n;
                case "color":
                    return 902;
                case "float":
                    return 901;
                case "integer":
                    return 900;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: renamed from: ymh$c */
    public interface InterfaceC15724c {

        /* JADX INFO: renamed from: A */
        public static final String f102139A = "translationX";

        /* JADX INFO: renamed from: B */
        public static final String f102140B = "translationY";

        /* JADX INFO: renamed from: C */
        public static final String f102141C = "translationZ";

        /* JADX INFO: renamed from: D */
        public static final String f102142D = "elevation";

        /* JADX INFO: renamed from: E */
        public static final String f102143E = "rotationX";

        /* JADX INFO: renamed from: F */
        public static final String f102144F = "rotationY";

        /* JADX INFO: renamed from: G */
        public static final String f102145G = "rotationZ";

        /* JADX INFO: renamed from: H */
        public static final String f102146H = "scaleX";

        /* JADX INFO: renamed from: I */
        public static final String f102147I = "scaleY";

        /* JADX INFO: renamed from: J */
        public static final String f102148J = "pivotX";

        /* JADX INFO: renamed from: K */
        public static final String f102149K = "pivotY";

        /* JADX INFO: renamed from: L */
        public static final String f102150L = "progress";

        /* JADX INFO: renamed from: M */
        public static final String f102151M = "pathRotate";

        /* JADX INFO: renamed from: N */
        public static final String f102152N = "easing";

        /* JADX INFO: renamed from: O */
        public static final String f102153O = "waveShape";

        /* JADX INFO: renamed from: P */
        public static final String f102154P = "customWave";

        /* JADX INFO: renamed from: Q */
        public static final String f102155Q = "period";

        /* JADX INFO: renamed from: R */
        public static final String f102156R = "offset";

        /* JADX INFO: renamed from: S */
        public static final String f102157S = "phase";

        /* JADX INFO: renamed from: T */
        public static final String[] f102158T = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", f102154P, f102155Q, f102156R, f102157S};

        /* JADX INFO: renamed from: a */
        public static final String f102159a = "KeyCycle";

        /* JADX INFO: renamed from: b */
        public static final int f102160b = 401;

        /* JADX INFO: renamed from: c */
        public static final int f102161c = 402;

        /* JADX INFO: renamed from: d */
        public static final int f102162d = 403;

        /* JADX INFO: renamed from: e */
        public static final int f102163e = 304;

        /* JADX INFO: renamed from: f */
        public static final int f102164f = 305;

        /* JADX INFO: renamed from: g */
        public static final int f102165g = 306;

        /* JADX INFO: renamed from: h */
        public static final int f102166h = 307;

        /* JADX INFO: renamed from: i */
        public static final int f102167i = 308;

        /* JADX INFO: renamed from: j */
        public static final int f102168j = 309;

        /* JADX INFO: renamed from: k */
        public static final int f102169k = 310;

        /* JADX INFO: renamed from: l */
        public static final int f102170l = 311;

        /* JADX INFO: renamed from: m */
        public static final int f102171m = 312;

        /* JADX INFO: renamed from: n */
        public static final int f102172n = 313;

        /* JADX INFO: renamed from: o */
        public static final int f102173o = 314;

        /* JADX INFO: renamed from: p */
        public static final int f102174p = 315;

        /* JADX INFO: renamed from: q */
        public static final int f102175q = 416;

        /* JADX INFO: renamed from: r */
        public static final int f102176r = 420;

        /* JADX INFO: renamed from: s */
        public static final int f102177s = 421;

        /* JADX INFO: renamed from: t */
        public static final int f102178t = 422;

        /* JADX INFO: renamed from: u */
        public static final int f102179u = 423;

        /* JADX INFO: renamed from: v */
        public static final int f102180v = 424;

        /* JADX INFO: renamed from: w */
        public static final int f102181w = 425;

        /* JADX INFO: renamed from: x */
        public static final String f102182x = "curveFit";

        /* JADX INFO: renamed from: y */
        public static final String f102183y = "visibility";

        /* JADX INFO: renamed from: z */
        public static final String f102184z = "alpha";

        static int getId(String str) {
            str.hashCode();
            switch (str) {
                case "easing":
                    return 420;
                case "rotationX":
                    return 308;
                case "rotationY":
                    return 309;
                case "rotationZ":
                    return 310;
                case "translationX":
                    return 304;
                case "translationY":
                    return 305;
                case "translationZ":
                    return 306;
                case "progress":
                    return 315;
                case "pivotX":
                    return 313;
                case "pivotY":
                    return 314;
                case "scaleX":
                    return 311;
                case "scaleY":
                    return 312;
                case "alpha":
                    return 403;
                case "curveFit":
                    return 401;
                case "pathRotate":
                    return 416;
                case "visibility":
                    return 402;
                default:
                    return -1;
            }
        }

        static int getType(int i) {
            if (i == 100) {
                return 2;
            }
            if (i == 101) {
                return 8;
            }
            if (i == 416) {
                return 4;
            }
            if (i == 420 || i == 421) {
                return 8;
            }
            switch (i) {
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 315:
                    return 4;
                default:
                    switch (i) {
                        case 401:
                        case 402:
                            return 2;
                        case 403:
                            return 4;
                        default:
                            switch (i) {
                                case 423:
                                case 424:
                                case f102181w /* 425 */:
                                    return 4;
                                default:
                                    return -1;
                            }
                    }
            }
        }
    }

    /* JADX INFO: renamed from: ymh$d */
    public interface InterfaceC15725d {

        /* JADX INFO: renamed from: a */
        public static final String f102185a = "MotionScene";

        /* JADX INFO: renamed from: d */
        public static final int f102188d = 600;

        /* JADX INFO: renamed from: e */
        public static final int f102189e = 601;

        /* JADX INFO: renamed from: b */
        public static final String f102186b = "defaultDuration";

        /* JADX INFO: renamed from: c */
        public static final String f102187c = "layoutDuringTransition";

        /* JADX INFO: renamed from: f */
        public static final String[] f102190f = {f102186b, f102187c};

        static int getId(String str) {
            str.hashCode();
            if (str.equals(f102186b)) {
                return 600;
            }
            return !str.equals(f102187c) ? -1 : 601;
        }

        static int getType(int i) {
            if (i != 600) {
                return i != 601 ? -1 : 1;
            }
            return 2;
        }
    }

    /* JADX INFO: renamed from: ymh$e */
    public interface InterfaceC15726e {

        /* JADX INFO: renamed from: A */
        public static final int f102191A = 611;

        /* JADX INFO: renamed from: B */
        public static final int f102192B = 612;

        /* JADX INFO: renamed from: a */
        public static final String f102193a = "Motion";

        /* JADX INFO: renamed from: b */
        public static final String f102194b = "Stagger";

        /* JADX INFO: renamed from: c */
        public static final String f102195c = "PathRotate";

        /* JADX INFO: renamed from: d */
        public static final String f102196d = "QuantizeMotionPhase";

        /* JADX INFO: renamed from: e */
        public static final String f102197e = "TransitionEasing";

        /* JADX INFO: renamed from: f */
        public static final String f102198f = "QuantizeInterpolator";

        /* JADX INFO: renamed from: g */
        public static final String f102199g = "AnimateRelativeTo";

        /* JADX INFO: renamed from: h */
        public static final String f102200h = "AnimateCircleAngleTo";

        /* JADX INFO: renamed from: i */
        public static final String f102201i = "PathMotionArc";

        /* JADX INFO: renamed from: j */
        public static final String f102202j = "DrawPath";

        /* JADX INFO: renamed from: k */
        public static final String f102203k = "PolarRelativeTo";

        /* JADX INFO: renamed from: l */
        public static final String f102204l = "QuantizeMotionSteps";

        /* JADX INFO: renamed from: m */
        public static final String f102205m = "QuantizeInterpolatorType";

        /* JADX INFO: renamed from: n */
        public static final String f102206n = "QuantizeInterpolatorID";

        /* JADX INFO: renamed from: o */
        public static final String[] f102207o = {f102194b, f102195c, f102196d, f102197e, f102198f, f102199g, f102200h, f102201i, f102202j, f102203k, f102204l, f102205m, f102206n};

        /* JADX INFO: renamed from: p */
        public static final int f102208p = 600;

        /* JADX INFO: renamed from: q */
        public static final int f102209q = 601;

        /* JADX INFO: renamed from: r */
        public static final int f102210r = 602;

        /* JADX INFO: renamed from: s */
        public static final int f102211s = 603;

        /* JADX INFO: renamed from: t */
        public static final int f102212t = 604;

        /* JADX INFO: renamed from: u */
        public static final int f102213u = 605;

        /* JADX INFO: renamed from: v */
        public static final int f102214v = 606;

        /* JADX INFO: renamed from: w */
        public static final int f102215w = 607;

        /* JADX INFO: renamed from: x */
        public static final int f102216x = 608;

        /* JADX INFO: renamed from: y */
        public static final int f102217y = 609;

        /* JADX INFO: renamed from: z */
        public static final int f102218z = 610;

        static int getId(String str) {
            str.hashCode();
            switch (str) {
                case "AnimateCircleAngleTo":
                    return f102214v;
                case "QuantizeMotionPhase":
                    return f102210r;
                case "QuantizeMotionSteps":
                    return f102218z;
                case "PathRotate":
                    return 601;
                case "QuantizeInterpolator":
                    return f102212t;
                case "DrawPath":
                    return f102216x;
                case "Stagger":
                    return 600;
                case "PolarRelativeTo":
                    return f102217y;
                case "QuantizeInterpolatorType":
                    return f102191A;
                case "QuantizeInterpolatorID":
                    return f102192B;
                case "TransitionEasing":
                    return f102211s;
                case "AnimateRelativeTo":
                    return f102213u;
                case "PathMotionArc":
                    return f102215w;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: renamed from: ymh$f */
    public interface InterfaceC15727f {

        /* JADX INFO: renamed from: a */
        public static final String f102219a = "dragscale";

        /* JADX INFO: renamed from: b */
        public static final String f102220b = "dragthreshold";

        /* JADX INFO: renamed from: c */
        public static final String f102221c = "maxvelocity";

        /* JADX INFO: renamed from: d */
        public static final String f102222d = "maxacceleration";

        /* JADX INFO: renamed from: e */
        public static final String f102223e = "springmass";

        /* JADX INFO: renamed from: f */
        public static final String f102224f = "springstiffness";

        /* JADX INFO: renamed from: g */
        public static final String f102225g = "springdamping";

        /* JADX INFO: renamed from: h */
        public static final String f102226h = "springstopthreshold";

        /* JADX INFO: renamed from: i */
        public static final String f102227i = "dragdirection";

        /* JADX INFO: renamed from: j */
        public static final String f102228j = "touchanchorid";

        /* JADX INFO: renamed from: k */
        public static final String f102229k = "touchanchorside";

        /* JADX INFO: renamed from: l */
        public static final String f102230l = "rotationcenterid";

        /* JADX INFO: renamed from: m */
        public static final String f102231m = "touchregionid";

        /* JADX INFO: renamed from: n */
        public static final String f102232n = "limitboundsto";

        /* JADX INFO: renamed from: o */
        public static final String f102233o = "movewhenscrollattop";

        /* JADX INFO: renamed from: p */
        public static final String f102234p = "ontouchup";

        /* JADX INFO: renamed from: r */
        public static final String f102236r = "springboundary";

        /* JADX INFO: renamed from: t */
        public static final String f102238t = "autocompletemode";

        /* JADX INFO: renamed from: v */
        public static final String f102240v = "nestedscrollflags";

        /* JADX INFO: renamed from: q */
        public static final String[] f102235q = {"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", jk5.f51004j, gv4.f41443i, "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};

        /* JADX INFO: renamed from: s */
        public static final String[] f102237s = {gv4.f41448n, "bounceStart", "bounceEnd", "bounceBoth"};

        /* JADX INFO: renamed from: u */
        public static final String[] f102239u = {"continuousVelocity", "spring"};

        /* JADX INFO: renamed from: w */
        public static final String[] f102241w = {"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
    }

    /* JADX INFO: renamed from: ymh$g */
    public interface InterfaceC15728g {

        /* JADX INFO: renamed from: a */
        public static final String f102242a = "KeyPosition";

        /* JADX INFO: renamed from: b */
        public static final String f102243b = "transitionEasing";

        /* JADX INFO: renamed from: c */
        public static final String f102244c = "drawPath";

        /* JADX INFO: renamed from: d */
        public static final String f102245d = "percentWidth";

        /* JADX INFO: renamed from: e */
        public static final String f102246e = "percentHeight";

        /* JADX INFO: renamed from: f */
        public static final String f102247f = "sizePercent";

        /* JADX INFO: renamed from: g */
        public static final String f102248g = "percentX";

        /* JADX INFO: renamed from: h */
        public static final String f102249h = "percentY";

        /* JADX INFO: renamed from: i */
        public static final int f102250i = 501;

        /* JADX INFO: renamed from: j */
        public static final int f102251j = 502;

        /* JADX INFO: renamed from: k */
        public static final int f102252k = 503;

        /* JADX INFO: renamed from: l */
        public static final int f102253l = 504;

        /* JADX INFO: renamed from: m */
        public static final int f102254m = 505;

        /* JADX INFO: renamed from: n */
        public static final int f102255n = 506;

        /* JADX INFO: renamed from: o */
        public static final int f102256o = 507;

        /* JADX INFO: renamed from: p */
        public static final int f102257p = 508;

        /* JADX INFO: renamed from: q */
        public static final int f102258q = 509;

        /* JADX INFO: renamed from: r */
        public static final int f102259r = 510;

        /* JADX INFO: renamed from: s */
        public static final String[] f102260s = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};

        static int getId(String str) {
            str.hashCode();
            switch (str) {
                case "transitionEasing":
                    return f102250i;
                case "percentWidth":
                    return 503;
                case "percentHeight":
                    return 504;
                case "drawPath":
                    return 502;
                case "sizePercent":
                    return f102254m;
                case "percentX":
                    return f102255n;
                case "percentY":
                    return 507;
                default:
                    return -1;
            }
        }

        static int getType(int i) {
            if (i == 100) {
                return 2;
            }
            if (i == 101) {
                return 8;
            }
            switch (i) {
                case f102250i /* 501 */:
                case 502:
                    return 8;
                case 503:
                case 504:
                case f102254m /* 505 */:
                case f102255n /* 506 */:
                case 507:
                    return 4;
                case 508:
                    return 2;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: renamed from: ymh$h */
    public interface InterfaceC15729h {

        /* JADX INFO: renamed from: a */
        public static final String f102261a = "Transitions";

        /* JADX INFO: renamed from: b */
        public static final String f102262b = "duration";

        /* JADX INFO: renamed from: d */
        public static final String f102264d = "to";

        /* JADX INFO: renamed from: j */
        public static final int f102270j = 700;

        /* JADX INFO: renamed from: k */
        public static final int f102271k = 701;

        /* JADX INFO: renamed from: l */
        public static final int f102272l = 702;

        /* JADX INFO: renamed from: m */
        public static final int f102273m = 509;

        /* JADX INFO: renamed from: n */
        public static final int f102274n = 704;

        /* JADX INFO: renamed from: o */
        public static final int f102275o = 705;

        /* JADX INFO: renamed from: p */
        public static final int f102276p = 706;

        /* JADX INFO: renamed from: q */
        public static final int f102277q = 707;

        /* JADX INFO: renamed from: c */
        public static final String f102263c = "from";

        /* JADX INFO: renamed from: e */
        public static final String f102265e = "pathMotionArc";

        /* JADX INFO: renamed from: f */
        public static final String f102266f = "autoTransition";

        /* JADX INFO: renamed from: g */
        public static final String f102267g = "motionInterpolator";

        /* JADX INFO: renamed from: h */
        public static final String f102268h = "staggered";

        /* JADX INFO: renamed from: i */
        public static final String f102269i = "transitionFlags";

        /* JADX INFO: renamed from: r */
        public static final String[] f102278r = {"duration", f102263c, "to", f102265e, f102266f, f102267g, f102268h, f102263c, f102269i};

        static int getId(String str) {
            str.hashCode();
            switch (str) {
                case "transitionFlags":
                    return f102277q;
                case "duration":
                    return 700;
                case "motionInterpolator":
                    return f102275o;
                case "autoTransition":
                    return f102274n;
                case "to":
                    return 702;
                case "from":
                    return 701;
                case "pathMotionArc":
                    return 509;
                case "staggered":
                    return f102276p;
                default:
                    return -1;
            }
        }

        static int getType(int i) {
            if (i == 509) {
                return 2;
            }
            switch (i) {
                case 700:
                    return 2;
                case 701:
                case 702:
                    return 8;
                default:
                    switch (i) {
                        case f102275o /* 705 */:
                        case f102277q /* 707 */:
                            return 8;
                        case f102276p /* 706 */:
                            return 4;
                        default:
                            return -1;
                    }
            }
        }
    }

    /* JADX INFO: renamed from: ymh$i */
    public interface InterfaceC15730i {

        /* JADX INFO: renamed from: a */
        public static final String f102279a = "KeyTrigger";

        /* JADX INFO: renamed from: b */
        public static final String f102280b = "viewTransitionOnCross";

        /* JADX INFO: renamed from: c */
        public static final String f102281c = "viewTransitionOnPositiveCross";

        /* JADX INFO: renamed from: d */
        public static final String f102282d = "viewTransitionOnNegativeCross";

        /* JADX INFO: renamed from: e */
        public static final String f102283e = "postLayout";

        /* JADX INFO: renamed from: f */
        public static final String f102284f = "triggerSlack";

        /* JADX INFO: renamed from: g */
        public static final String f102285g = "triggerCollisionView";

        /* JADX INFO: renamed from: h */
        public static final String f102286h = "triggerCollisionId";

        /* JADX INFO: renamed from: i */
        public static final String f102287i = "triggerID";

        /* JADX INFO: renamed from: j */
        public static final String f102288j = "positiveCross";

        /* JADX INFO: renamed from: k */
        public static final String f102289k = "negativeCross";

        /* JADX INFO: renamed from: l */
        public static final String f102290l = "triggerReceiver";

        /* JADX INFO: renamed from: m */
        public static final String f102291m = "CROSS";

        /* JADX INFO: renamed from: n */
        public static final String[] f102292n = {"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};

        /* JADX INFO: renamed from: o */
        public static final int f102293o = 301;

        /* JADX INFO: renamed from: p */
        public static final int f102294p = 302;

        /* JADX INFO: renamed from: q */
        public static final int f102295q = 303;

        /* JADX INFO: renamed from: r */
        public static final int f102296r = 304;

        /* JADX INFO: renamed from: s */
        public static final int f102297s = 305;

        /* JADX INFO: renamed from: t */
        public static final int f102298t = 306;

        /* JADX INFO: renamed from: u */
        public static final int f102299u = 307;

        /* JADX INFO: renamed from: v */
        public static final int f102300v = 308;

        /* JADX INFO: renamed from: w */
        public static final int f102301w = 309;

        /* JADX INFO: renamed from: x */
        public static final int f102302x = 310;

        /* JADX INFO: renamed from: y */
        public static final int f102303y = 311;

        /* JADX INFO: renamed from: z */
        public static final int f102304z = 312;

        static int getId(String str) {
            str.hashCode();
            switch (str) {
                case "positiveCross":
                    return 309;
                case "viewTransitionOnPositiveCross":
                    return 302;
                case "triggerCollisionId":
                    return 307;
                case "triggerID":
                    return 308;
                case "negativeCross":
                    return 310;
                case "triggerCollisionView":
                    return 306;
                case "viewTransitionOnNegativeCross":
                    return 303;
                case "CROSS":
                    return 312;
                case "triggerSlack":
                    return 305;
                case "viewTransitionOnCross":
                    return 301;
                case "postLayout":
                    return 304;
                case "triggerReceiver":
                    return 311;
                default:
                    return -1;
            }
        }
    }

    int getId(String str);

    boolean setValue(int i, float f);

    boolean setValue(int i, int i2);

    boolean setValue(int i, String str);

    boolean setValue(int i, boolean z);
}

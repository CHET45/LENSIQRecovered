package com.eyevue.glassapp.view.photo;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.RequestBuilder;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.utils.photo.AutoImageEnhancer;
import com.eyevue.glassapp.utils.photo.PermissionUtils;
import com.eyevue.glassapp.utils.photo.StyleFilterUtil;
import com.eyevue.glassapp.view.photo.AdvancedPhotoView;
import com.eyevue.glassapp.view.photo.CropOverlayView;
import com.eyevue.glassapp.view.photo.ImageFragment;
import com.watchfun.base.BaseFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.ae3;
import p000.ag8;
import p000.bkb;
import p000.bth;
import p000.ck3;
import p000.df4;
import p000.dg1;
import p000.do8;
import p000.dr9;
import p000.dwf;
import p000.e0g;
import p000.fd3;
import p000.fg1;
import p000.fx8;
import p000.gib;
import p000.gz6;
import p000.h59;
import p000.h9g;
import p000.hz8;
import p000.igg;
import p000.j8i;
import p000.jt3;
import p000.jvd;
import p000.l82;
import p000.m3h;
import p000.m9g;
import p000.md8;
import p000.mtc;
import p000.mu5;
import p000.ne4;
import p000.nu6;
import p000.ny6;
import p000.p34;
import p000.pb9;
import p000.pd8;
import p000.qy6;
import p000.u52;
import p000.ugg;
import p000.wc1;
import p000.x13;
import p000.xci;
import p000.y7e;
import p000.yci;
import p000.yfb;
import p000.zy2;

/* JADX INFO: loaded from: classes4.dex */
@dwf({"SMAP\nImageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageFragment.kt\ncom/eyevue/glassapp/view/photo/ImageFragment\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1336:1\n29#2:1337\n1755#3,3:1338\n1863#3,2:1348\n1872#3,3:1350\n1872#3,3:1353\n1863#3,2:1356\n1863#3,2:1372\n254#4:1341\n256#4,2:1342\n256#4,2:1344\n256#4,2:1346\n256#4,2:1358\n256#4,2:1360\n256#4,2:1362\n256#4,2:1364\n256#4,2:1366\n256#4,2:1368\n256#4,2:1370\n256#4,2:1374\n256#4,2:1376\n256#4,2:1378\n256#4,2:1380\n256#4,2:1382\n256#4,2:1384\n256#4,2:1386\n256#4,2:1388\n256#4,2:1390\n256#4,2:1392\n256#4,2:1394\n256#4,2:1396\n256#4,2:1398\n254#4:1400\n254#4:1401\n254#4:1402\n256#4,2:1403\n256#4,2:1405\n256#4,2:1407\n256#4,2:1409\n256#4,2:1411\n256#4,2:1413\n256#4,2:1415\n256#4,2:1417\n256#4,2:1419\n256#4,2:1421\n256#4,2:1423\n256#4,2:1425\n256#4,2:1427\n256#4,2:1429\n256#4,2:1431\n256#4,2:1433\n256#4,2:1435\n256#4,2:1437\n256#4,2:1439\n254#4:1441\n256#4,2:1442\n256#4,2:1444\n256#4,2:1446\n256#4,2:1448\n254#4:1450\n256#4,2:1451\n256#4,2:1453\n256#4,2:1455\n256#4,2:1457\n256#4,2:1459\n254#4:1461\n256#4,2:1462\n256#4,2:1464\n256#4,2:1466\n256#4,2:1468\n256#4,2:1470\n256#4,2:1472\n256#4,2:1474\n256#4,2:1476\n256#4,2:1478\n256#4,2:1480\n256#4,2:1482\n256#4,2:1484\n256#4,2:1486\n256#4,2:1488\n256#4,2:1490\n256#4,2:1492\n256#4,2:1494\n256#4,2:1496\n256#4,2:1498\n256#4,2:1500\n256#4,2:1502\n256#4,2:1504\n256#4,2:1506\n256#4,2:1508\n256#4,2:1510\n256#4,2:1512\n256#4,2:1514\n256#4,2:1516\n256#4,2:1518\n256#4,2:1520\n256#4,2:1522\n256#4,2:1524\n256#4,2:1526\n256#4,2:1528\n256#4,2:1530\n256#4,2:1532\n256#4,2:1534\n256#4,2:1536\n256#4,2:1538\n256#4,2:1540\n256#4,2:1542\n256#4,2:1544\n256#4,2:1546\n256#4,2:1548\n256#4,2:1550\n256#4,2:1552\n256#4,2:1554\n256#4,2:1556\n256#4,2:1558\n256#4,2:1560\n256#4,2:1562\n256#4,2:1564\n256#4,2:1566\n256#4,2:1568\n256#4,2:1570\n256#4,2:1572\n256#4,2:1574\n256#4,2:1576\n256#4,2:1578\n*S KotlinDebug\n*F\n+ 1 ImageFragment.kt\ncom/eyevue/glassapp/view/photo/ImageFragment\n*L\n146#1:1337\n155#1:1338,3\n931#1:1348,2\n948#1:1350,3\n971#1:1353,3\n1012#1:1356,2\n1155#1:1372,2\n162#1:1341\n266#1:1342,2\n276#1:1344,2\n280#1:1346,2\n1055#1:1358,2\n1056#1:1360,2\n1058#1:1362,2\n1094#1:1364,2\n1095#1:1366,2\n1112#1:1368,2\n1113#1:1370,2\n1182#1:1374,2\n1183#1:1376,2\n1184#1:1378,2\n1185#1:1380,2\n1186#1:1382,2\n1187#1:1384,2\n1199#1:1386,2\n1207#1:1388,2\n1213#1:1390,2\n1219#1:1392,2\n1225#1:1394,2\n1231#1:1396,2\n1269#1:1398,2\n179#1:1400\n196#1:1401\n230#1:1402\n234#1:1403,2\n235#1:1405,2\n236#1:1407,2\n237#1:1409,2\n296#1:1411,2\n298#1:1413,2\n299#1:1415,2\n300#1:1417,2\n301#1:1419,2\n309#1:1421,2\n311#1:1423,2\n312#1:1425,2\n313#1:1427,2\n314#1:1429,2\n367#1:1431,2\n369#1:1433,2\n370#1:1435,2\n371#1:1437,2\n372#1:1439,2\n390#1:1441\n398#1:1442,2\n399#1:1444,2\n400#1:1446,2\n403#1:1448,2\n408#1:1450\n430#1:1451,2\n431#1:1453,2\n433#1:1455,2\n434#1:1457,2\n435#1:1459,2\n440#1:1461\n448#1:1462,2\n449#1:1464,2\n450#1:1466,2\n460#1:1468,2\n461#1:1470,2\n474#1:1472,2\n493#1:1474,2\n494#1:1476,2\n496#1:1478,2\n510#1:1480,2\n511#1:1482,2\n579#1:1484,2\n580#1:1486,2\n581#1:1488,2\n582#1:1490,2\n587#1:1492,2\n588#1:1494,2\n589#1:1496,2\n590#1:1498,2\n595#1:1500,2\n596#1:1502,2\n597#1:1504,2\n598#1:1506,2\n605#1:1508,2\n606#1:1510,2\n610#1:1512,2\n611#1:1514,2\n627#1:1516,2\n628#1:1518,2\n629#1:1520,2\n631#1:1522,2\n632#1:1524,2\n638#1:1526,2\n639#1:1528,2\n640#1:1530,2\n642#1:1532,2\n643#1:1534,2\n659#1:1536,2\n660#1:1538,2\n662#1:1540,2\n663#1:1542,2\n664#1:1544,2\n862#1:1546,2\n863#1:1548,2\n864#1:1550,2\n869#1:1552,2\n870#1:1554,2\n871#1:1556,2\n877#1:1558,2\n878#1:1560,2\n879#1:1562,2\n1240#1:1564,2\n1241#1:1566,2\n1245#1:1568,2\n1246#1:1570,2\n1256#1:1572,2\n1257#1:1574,2\n1261#1:1576,2\n1262#1:1578,2\n*E\n"})
@e0g(parameters = 0)
public final class ImageFragment extends BaseMediaFragment<nu6> {

    /* JADX INFO: renamed from: k2 */
    @yfb
    public static final C2834a f18859k2 = new C2834a(null);

    /* JADX INFO: renamed from: l2 */
    public static final int f18860l2 = 8;

    /* JADX INFO: renamed from: F */
    @gib
    public ae3 f18862F;

    /* JADX INFO: renamed from: L */
    @gib
    public Bitmap f18864L;

    /* JADX INFO: renamed from: M */
    public xci f18865M;

    /* JADX INFO: renamed from: N */
    public yci f18867N;

    /* JADX INFO: renamed from: Q */
    public boolean f18868Q;

    /* JADX INFO: renamed from: V1 */
    @gib
    public Bitmap f18869V1;

    /* JADX INFO: renamed from: X */
    public boolean f18870X;

    /* JADX INFO: renamed from: Z */
    public int f18872Z;

    /* JADX INFO: renamed from: f2 */
    public boolean f18879f2;

    /* JADX INFO: renamed from: h2 */
    @gib
    public AutoImageEnhancer.EnhancementParams f18881h2;

    /* JADX INFO: renamed from: C */
    @yfb
    public final String f18861C = "ImageFragment";

    /* JADX INFO: renamed from: H */
    @yfb
    public final fx8 f18863H = hz8.lazy(new ny6() { // from class: xu7
        @Override // p000.ny6
        public final Object invoke() {
            return ImageFragment.mLoadingDialog_delegate$lambda$0(this.f99355a);
        }
    });

    /* JADX INFO: renamed from: Y */
    @yfb
    public Matrix f18871Y = new Matrix();

    /* JADX INFO: renamed from: M1 */
    @yfb
    public final fx8 f18866M1 = hz8.lazy(new ny6() { // from class: zu7
        @Override // p000.ny6
        public final Object invoke() {
            return ImageFragment.mStyleFilterUtil_delegate$lambda$1(this.f106113a);
        }
    });

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public final Map<String, Bitmap> f18873Z1 = new LinkedHashMap();

    /* JADX INFO: renamed from: a2 */
    @yfb
    public final fx8 f18874a2 = hz8.lazy(new ny6() { // from class: av7
        @Override // p000.ny6
        public final Object invoke() {
            return ImageFragment.mStyleFilterNameList_delegate$lambda$2(this.f11919a);
        }
    });

    /* JADX INFO: renamed from: b2 */
    @yfb
    public final List<String> f18875b2 = l82.listOf((Object[]) new String[]{"", "lut/Siln.cube", "lut/Cyanate.cube", "lut/Mist.cube", "lut/Lux.cube", "lut/Frost.cube", "lut/Azure.cube", "lut/Polar.cube"});

    /* JADX INFO: renamed from: c2 */
    public int f18876c2 = -1;

    /* JADX INFO: renamed from: d2 */
    @yfb
    public String f18877d2 = "";

    /* JADX INFO: renamed from: e2 */
    @yfb
    public final List<ag8> f18878e2 = new ArrayList();

    /* JADX INFO: renamed from: g2 */
    public int f18880g2 = -1;

    /* JADX INFO: renamed from: i2 */
    @yfb
    @igg({"ClickableViewAccessibility"})
    public final View.OnTouchListener f18882i2 = new View.OnTouchListener() { // from class: bv7
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return ImageFragment.onTouchListener$lambda$66(this.f14932a, view, motionEvent);
        }
    };

    /* JADX INFO: renamed from: j2 */
    @yfb
    @igg({"ClickableViewAccessibility"})
    public final View.OnTouchListener f18883j2 = new View.OnTouchListener() { // from class: cv7
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return ImageFragment.onFilterTouchListener$lambda$67(this.f27826a, view, motionEvent);
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.ImageFragment$a */
    public static final class C2834a {
        public /* synthetic */ C2834a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final ImageFragment newInstance(@yfb String str, int i) {
            md8.checkNotNullParameter(str, "fileName");
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putInt(C2865a.f19004r, i);
            ImageFragment imageFragment = new ImageFragment();
            imageFragment.setArguments(bundle);
            return imageFragment;
        }

        private C2834a() {
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.ImageFragment$b */
    public /* synthetic */ class C2835b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18884a;

        static {
            int[] iArr = new int[AdvancedPhotoView.EnumC2814a.values().length];
            try {
                iArr[AdvancedPhotoView.EnumC2814a.f18710H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedPhotoView.EnumC2814a.f18711L.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvancedPhotoView.EnumC2814a.f18714a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvancedPhotoView.EnumC2814a.f18719f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvancedPhotoView.EnumC2814a.f18720m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdvancedPhotoView.EnumC2814a.f18716c.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdvancedPhotoView.EnumC2814a.f18715b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdvancedPhotoView.EnumC2814a.f18717d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdvancedPhotoView.EnumC2814a.f18718e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f18884a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.ImageFragment$c */
    @ck3(m4009c = "com.eyevue.glassapp.view.photo.ImageFragment$initOperationListener$3$1$1", m4010f = "ImageFragment.kt", m4011i = {}, m4012l = {358, 362}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C2836c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f18885a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8121h<File> f18887c;

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.ImageFragment$c$a */
        @ck3(m4009c = "com.eyevue.glassapp.view.photo.ImageFragment$initOperationListener$3$1$1$1", m4010f = "ImageFragment.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f18888a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ImageFragment f18889b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ImageFragment imageFragment, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f18889b = imageFragment;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return new a(this.f18889b, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f18888a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                ComponentCallbacks2C2485a.get(this.f18889b.requireContext()).clearMemory();
                return bth.f14751a;
            }
        }

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.ImageFragment$c$b */
        @ck3(m4009c = "com.eyevue.glassapp.view.photo.ImageFragment$initOperationListener$3$1$1$2", m4010f = "ImageFragment.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f18890a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ImageFragment f18891b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ jvd.C8121h<File> f18892c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ImageFragment imageFragment, jvd.C8121h<File> c8121h, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f18891b = imageFragment;
                this.f18892c = c8121h;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return new b(this.f18891b, this.f18892c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f18890a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                ImageFragment imageFragment = this.f18891b;
                String path = this.f18892c.f52110a.getPath();
                md8.checkNotNullExpressionValue(path, "getPath(...)");
                imageFragment.updateMedia(path);
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2836c(jvd.C8121h<File> c8121h, zy2<? super C2836c> zy2Var) {
            super(2, zy2Var);
            this.f18887c = c8121h;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return ImageFragment.this.new C2836c(this.f18887c, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C2836c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f18885a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                dr9 main = df4.getMain();
                a aVar = new a(ImageFragment.this, null);
                this.f18885a = 1;
                if (dg1.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    return bth.f14751a;
                }
                y7e.throwOnFailure(obj);
            }
            ComponentCallbacks2C2485a.get(ImageFragment.this.requireContext()).clearDiskCache();
            dr9 main2 = df4.getMain();
            b bVar = new b(ImageFragment.this, this.f18887c, null);
            this.f18885a = 2;
            if (dg1.withContext(main2, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.ImageFragment$d */
    @ck3(m4009c = "com.eyevue.glassapp.view.photo.ImageFragment$initOperationListener$35$1$1", m4010f = "ImageFragment.kt", m4011i = {0}, m4012l = {894}, m4013m = "invokeSuspend", m4014n = {"currentFile"}, m4015s = {"L$0"})
    public static final class C2837d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f18893a;

        /* JADX INFO: renamed from: b */
        public int f18894b;

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.ImageFragment$d$a */
        @ck3(m4009c = "com.eyevue.glassapp.view.photo.ImageFragment$initOperationListener$35$1$1$1", m4010f = "ImageFragment.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        @dwf({"SMAP\nImageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageFragment.kt\ncom/eyevue/glassapp/view/photo/ImageFragment$initOperationListener$35$1$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1336:1\n256#2,2:1337\n256#2,2:1339\n256#2,2:1341\n256#2,2:1343\n256#2,2:1345\n256#2,2:1347\n*S KotlinDebug\n*F\n+ 1 ImageFragment.kt\ncom/eyevue/glassapp/view/photo/ImageFragment$initOperationListener$35$1$1$1\n*L\n898#1:1337,2\n900#1:1339,2\n902#1:1341,2\n903#1:1343,2\n904#1:1345,2\n905#1:1347,2\n*E\n"})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f18896a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ImageFragment f18897b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ File f18898c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ImageFragment imageFragment, File file, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f18897b = imageFragment;
                this.f18898c = file;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return new a(this.f18897b, this.f18898c, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f18896a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                ComponentCallbacks2C2485a.with(this.f18897b.requireContext()).clear(((nu6) ((BaseFragment) this.f18897b).binding).f65697H);
                ImageFragment imageFragment = this.f18897b;
                String path = this.f18898c.getPath();
                md8.checkNotNullExpressionValue(path, "getPath(...)");
                imageFragment.updateMedia(path);
                yci yciVar = this.f18897b.f18867N;
                yci yciVar2 = null;
                if (yciVar == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar = null;
                }
                yciVar.f101150N.setVisibility(0);
                yci yciVar3 = this.f18897b.f18867N;
                if (yciVar3 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar3 = null;
                }
                CardView cardView = yciVar3.f101147M;
                md8.checkNotNullExpressionValue(cardView, "cvRecover");
                cardView.setVisibility(8);
                this.f18897b.resetAllImageOperation();
                yci yciVar4 = this.f18897b.f18867N;
                if (yciVar4 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar4 = null;
                }
                ConstraintLayout constraintLayout = yciVar4.f101145L;
                md8.checkNotNullExpressionValue(constraintLayout, "clTopOpera");
                constraintLayout.setVisibility(8);
                yci yciVar5 = this.f18897b.f18867N;
                if (yciVar5 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar5 = null;
                }
                yciVar5.f101134C2.clearAnimation();
                yci yciVar6 = this.f18897b.f18867N;
                if (yciVar6 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar2 = yciVar6;
                }
                LinearLayout linearLayout = yciVar2.f101134C2;
                md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
                linearLayout.setVisibility(8);
                j8i j8iVar = ((BaseFragment) this.f18897b).binding;
                md8.checkNotNull(j8iVar);
                LinearLayout linearLayout2 = ((nu6) j8iVar).f65695C;
                md8.checkNotNullExpressionValue(linearLayout2, "llImageControl");
                linearLayout2.setVisibility(0);
                j8i j8iVar2 = ((BaseFragment) this.f18897b).binding;
                md8.checkNotNull(j8iVar2);
                ImageView imageView = ((nu6) j8iVar2).f65704c;
                md8.checkNotNullExpressionValue(imageView, "btnImgDownload");
                imageView.setVisibility(0);
                j8i j8iVar3 = ((BaseFragment) this.f18897b).binding;
                md8.checkNotNull(j8iVar3);
                LinearLayout linearLayout3 = ((nu6) j8iVar3).f65696F;
                md8.checkNotNullExpressionValue(linearLayout3, "llTop");
                linearLayout3.setVisibility(0);
                this.f18897b.resetPhotoViewSize(false);
                this.f18897b.sendViewPagerScrollEnable(true);
                return bth.f14751a;
            }
        }

        public C2837d(zy2<? super C2837d> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return ImageFragment.this.new C2837d(zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C2837d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            File file;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f18894b;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                File file2 = new File(ImageFragment.this.f18737c.getPath());
                String path = file2.getPath();
                md8.checkNotNullExpressionValue(path, "getPath(...)");
                File file3 = new File(h9g.replace$default(h9g.replace$default(path, "edit_", "", false, 4, (Object) null), "_filter", "", false, 4, (Object) null));
                dr9 main = df4.getMain();
                a aVar = new a(ImageFragment.this, file3, null);
                this.f18893a = file2;
                this.f18894b = 1;
                if (dg1.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                file = file2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = (File) this.f18893a;
                y7e.throwOnFailure(obj);
            }
            file.delete();
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.ImageFragment$e */
    public static final class C2838e implements CropOverlayView.InterfaceC2828c {
        public C2838e() {
        }

        @Override // com.eyevue.glassapp.view.photo.CropOverlayView.InterfaceC2828c
        public void onCropChanged(RectF rectF, Bitmap bitmap) {
            md8.checkNotNullParameter(rectF, "cropRect");
            if (bitmap != null) {
                ((nu6) ((BaseFragment) ImageFragment.this).binding).f65697H.setRatioFreeBitmap(bitmap);
            }
            xci xciVar = ImageFragment.this.f18865M;
            if (xciVar == null) {
                md8.throwUninitializedPropertyAccessException("bindingPhoto");
                xciVar = null;
            }
            CropOverlayView cropOverlayView = xciVar.f97532b;
            j8i j8iVar = ((BaseFragment) ImageFragment.this).binding;
            md8.checkNotNull(j8iVar);
            AdvancedPhotoView advancedPhotoView = ((nu6) j8iVar).f65697H;
            md8.checkNotNullExpressionValue(advancedPhotoView, "photoView");
            cropOverlayView.restoreCropRectToFullSize(advancedPhotoView);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.ImageFragment$f */
    @ck3(m4009c = "com.eyevue.glassapp.view.photo.ImageFragment$initStyleFilterBitmap$1$1$1$1", m4010f = "ImageFragment.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C2839f extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f18900a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StyleFilterUtil.StyleFilterResult f18901b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ImageFragment f18902c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f18903d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2839f(StyleFilterUtil.StyleFilterResult styleFilterResult, ImageFragment imageFragment, String str, zy2<? super C2839f> zy2Var) {
            super(2, zy2Var);
            this.f18901b = styleFilterResult;
            this.f18902c = imageFragment;
            this.f18903d = str;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return new C2839f(this.f18901b, this.f18902c, this.f18903d, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C2839f) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f18900a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            if (this.f18901b.getErrorCode() == 0) {
                Map map = this.f18902c.f18873Z1;
                String str = this.f18903d;
                Bitmap bitmap = this.f18901b.getBitmap();
                md8.checkNotNull(bitmap);
                map.put(str, bitmap);
                this.f18902c.setStyleFilterBtimapUI(this.f18903d);
            } else {
                wc1.boxInt(Log.e("xtest", "image style filter fail " + this.f18901b.getErrorMsg()));
            }
            this.f18902c.f18872Z++;
            this.f18902c.checkStyleFilterDone();
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.ImageFragment$g */
    @ck3(m4009c = "com.eyevue.glassapp.view.photo.ImageFragment$initView$1", m4010f = "ImageFragment.kt", m4011i = {}, m4012l = {110, 111}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C2840g extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f18904a;

        /* JADX INFO: renamed from: com.eyevue.glassapp.view.photo.ImageFragment$g$a */
        @ck3(m4009c = "com.eyevue.glassapp.view.photo.ImageFragment$initView$1$1", m4010f = "ImageFragment.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f18906a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ImageFragment f18907b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ImageFragment imageFragment, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f18907b = imageFragment;
            }

            @Override // p000.tq0
            public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
                return new a(this.f18907b, zy2Var);
            }

            @Override // p000.gz6
            public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                pd8.getCOROUTINE_SUSPENDED();
                if (this.f18906a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                j8i j8iVar = ((BaseFragment) this.f18907b).binding;
                md8.checkNotNull(j8iVar);
                ((nu6) j8iVar).f65701Q.inflate();
                j8i j8iVar2 = ((BaseFragment) this.f18907b).binding;
                md8.checkNotNull(j8iVar2);
                ((nu6) j8iVar2).f65700N.inflate();
                this.f18907b.getMStyleFilterUtil().preloadAllLutFiles();
                return bth.f14751a;
            }
        }

        public C2840g(zy2<? super C2840g> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return ImageFragment.this.new C2840g(zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C2840g) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f18904a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                this.f18904a = 1;
                if (p34.delay(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    return bth.f14751a;
                }
                y7e.throwOnFailure(obj);
            }
            dr9 main = df4.getMain();
            a aVar = new a(ImageFragment.this, null);
            this.f18904a = 2;
            if (dg1.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return bth.f14751a;
        }
    }

    private final void applyRatio(AdvancedPhotoView.EnumC2814a enumC2814a) {
        T t = this.binding;
        md8.checkNotNull(t);
        if (((nu6) t).f65697H.getCurrentRatio() != enumC2814a) {
            T t2 = this.binding;
            md8.checkNotNull(t2);
            ((nu6) t2).f65697H.cropToRatio(enumC2814a);
            switchRatioUI(enumC2814a);
        }
    }

    private final void bottomOperaAnim() {
        yci yciVar = this.f18867N;
        yci yciVar2 = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        LinearLayout linearLayout = yciVar.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        linearLayout.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setFillAfter(true);
        yci yciVar3 = this.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
        } else {
            yciVar2 = yciVar3;
        }
        yciVar2.f101134C2.startAnimation(translateAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void checkImageUpdate() {
        /*
            r20 = this;
            r0 = r20
            T extends j8i r1 = r0.binding
            p000.md8.checkNotNull(r1)
            nu6 r1 = (p000.nu6) r1
            com.eyevue.glassapp.view.photo.AdvancedPhotoView r1 = r1.f65697H
            boolean r1 = r1.isAnyEffectsTransform()
            r2 = 8
            java.lang.String r3 = "cvRecover"
            java.lang.String r4 = "bindingOperation"
            r5 = 0
            r6 = 0
            if (r1 != 0) goto La9
            T extends j8i r1 = r0.binding
            p000.md8.checkNotNull(r1)
            nu6 r1 = (p000.nu6) r1
            com.eyevue.glassapp.view.photo.AdvancedPhotoView r1 = r1.f65697H
            boolean r1 = r1.isRotationMirrorRatio()
            if (r1 != 0) goto La9
            boolean r1 = r0.f18879f2
            if (r1 == 0) goto L2e
            goto La9
        L2e:
            java.io.File r1 = new java.io.File
            android.net.Uri r7 = r0.f18737c
            java.lang.String r7 = r7.getPath()
            r1.<init>(r7)
            java.lang.String r7 = p000.mu5.getNameWithoutExtension(r1)
            java.lang.String r8 = "edit_"
            r9 = 2
            boolean r7 = p000.h9g.startsWith$default(r7, r8, r6, r9, r5)
            if (r7 == 0) goto L91
            java.lang.String r7 = p000.mu5.getNameWithoutExtension(r1)
            java.lang.String r8 = "_filter"
            boolean r7 = p000.h9g.endsWith$default(r7, r8, r6, r9, r5)
            if (r7 == 0) goto L91
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r1.getPath()
            java.lang.String r1 = "getPath(...)"
            p000.md8.checkNotNullExpressionValue(r8, r1)
            r12 = 4
            r13 = 0
            java.lang.String r9 = "edit_"
            java.lang.String r10 = ""
            r11 = 0
            java.lang.String r14 = p000.h9g.replace$default(r8, r9, r10, r11, r12, r13)
            r18 = 4
            r19 = 0
            java.lang.String r15 = "_filter"
            java.lang.String r16 = ""
            r17 = 0
            java.lang.String r1 = p000.h9g.replace$default(r14, r15, r16, r17, r18, r19)
            r7.<init>(r1)
            boolean r1 = r7.exists()
            if (r1 == 0) goto L91
            yci r1 = r0.f18867N
            if (r1 != 0) goto L87
            p000.md8.throwUninitializedPropertyAccessException(r4)
            r1 = r5
        L87:
            androidx.cardview.widget.CardView r1 = r1.f101147M
            p000.md8.checkNotNullExpressionValue(r1, r3)
            r1.setVisibility(r6)
            r1 = 1
            goto L92
        L91:
            r1 = r6
        L92:
            yci r3 = r0.f18867N
            if (r3 != 0) goto L9a
            p000.md8.throwUninitializedPropertyAccessException(r4)
            goto L9b
        L9a:
            r5 = r3
        L9b:
            androidx.cardview.widget.CardView r3 = r5.f101150N
            java.lang.String r4 = "cvSave"
            p000.md8.checkNotNullExpressionValue(r3, r4)
            if (r1 != 0) goto La5
            r2 = r6
        La5:
            r3.setVisibility(r2)
            goto Lc7
        La9:
            yci r1 = r0.f18867N
            if (r1 != 0) goto Lb1
            p000.md8.throwUninitializedPropertyAccessException(r4)
            r1 = r5
        Lb1:
            androidx.cardview.widget.CardView r1 = r1.f101150N
            r1.setVisibility(r6)
            yci r1 = r0.f18867N
            if (r1 != 0) goto Lbe
            p000.md8.throwUninitializedPropertyAccessException(r4)
            goto Lbf
        Lbe:
            r5 = r1
        Lbf:
            androidx.cardview.widget.CardView r1 = r5.f101147M
            p000.md8.checkNotNullExpressionValue(r1, r3)
            r1.setVisibility(r2)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.glassapp.view.photo.ImageFragment.checkImageUpdate():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkStyleFilterDone() {
        if (this.f18872Z == this.f18875b2.size()) {
            getMLoadingDialog().dismiss();
        }
    }

    private final fd3 getMLoadingDialog() {
        return (fd3) this.f18863H.getValue();
    }

    private final List<String> getMStyleFilterNameList() {
        return (List) this.f18874a2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StyleFilterUtil getMStyleFilterUtil() {
        return (StyleFilterUtil) this.f18866M1.getValue();
    }

    private final void initMListener() {
        T t = this.binding;
        md8.checkNotNull(t);
        ((nu6) t).f65703b.setOnClickListener(new View.OnClickListener() { // from class: ou7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initMListener$lambda$5(this.f68793a, view);
            }
        });
        T t2 = this.binding;
        md8.checkNotNull(t2);
        ((nu6) t2).f65704c.setOnClickListener(new View.OnClickListener() { // from class: pu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initMListener$lambda$6(this.f72098a, view);
            }
        });
        T t3 = this.binding;
        md8.checkNotNull(t3);
        ((nu6) t3).f65707f.setOnClickListener(new View.OnClickListener() { // from class: qu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initMListener$lambda$7(this.f75779a, view);
            }
        });
        T t4 = this.binding;
        md8.checkNotNull(t4);
        ((nu6) t4).f65701Q.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: ru7
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                ImageFragment.initMListener$lambda$8(this.f79645a, viewStub, view);
            }
        });
        T t5 = this.binding;
        md8.checkNotNull(t5);
        ((nu6) t5).f65700N.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: su7
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                ImageFragment.initMListener$lambda$9(this.f82899a, viewStub, view);
            }
        });
        T t6 = this.binding;
        md8.checkNotNull(t6);
        ((nu6) t6).f65705d.setOnClickListener(new View.OnClickListener() { // from class: tu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initMListener$lambda$10(this.f85961a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMListener$lambda$10(ImageFragment imageFragment, View view) {
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        LinearLayout linearLayout = ((nu6) t).f65695C;
        md8.checkNotNullExpressionValue(linearLayout, "llImageControl");
        if (linearLayout.getVisibility() == 0 && imageFragment.f18868Q && imageFragment.f18870X) {
            T t2 = imageFragment.binding;
            md8.checkNotNull(t2);
            LinearLayout linearLayout2 = ((nu6) t2).f65695C;
            md8.checkNotNullExpressionValue(linearLayout2, "llImageControl");
            linearLayout2.setVisibility(8);
            T t3 = imageFragment.binding;
            md8.checkNotNull(t3);
            ImageView imageView = ((nu6) t3).f65704c;
            md8.checkNotNullExpressionValue(imageView, "btnImgDownload");
            imageView.setVisibility(8);
            yci yciVar = imageFragment.f18867N;
            if (yciVar == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar = null;
            }
            ConstraintLayout constraintLayout = yciVar.f101145L;
            md8.checkNotNullExpressionValue(constraintLayout, "clTopOpera");
            constraintLayout.setVisibility(0);
            T t4 = imageFragment.binding;
            md8.checkNotNull(t4);
            LinearLayout linearLayout3 = ((nu6) t4).f65696F;
            md8.checkNotNullExpressionValue(linearLayout3, "llTop");
            linearLayout3.setVisibility(8);
            imageFragment.bottomOperaAnim();
            imageFragment.resetPhotoViewSize(true);
            imageFragment.sendViewPagerScrollEnable(false);
            imageFragment.checkImageUpdate();
            T t5 = imageFragment.binding;
            md8.checkNotNull(t5);
            ((nu6) t5).f65697H.setWatermarkVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMListener$lambda$5(final ImageFragment imageFragment, View view) {
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        LinearLayout linearLayout = ((nu6) t).f65695C;
        md8.checkNotNullExpressionValue(linearLayout, "llImageControl");
        if (linearLayout.getVisibility() == 0) {
            ae3 ae3Var = imageFragment.f18862F;
            if (ae3Var != null) {
                ae3Var.dismiss();
            }
            FragmentActivity fragmentActivityRequireActivity = imageFragment.requireActivity();
            md8.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ae3.C0191a c0191a = new ae3.C0191a(fragmentActivityRequireActivity);
            String string = imageFragment.getString(C2531R.string.tips);
            md8.checkNotNullExpressionValue(string, "getString(...)");
            ae3.C0191a title = c0191a.setTitle(string);
            String string2 = imageFragment.getString(C2531R.string.confirm_delete);
            md8.checkNotNullExpressionValue(string2, "getString(...)");
            ae3.C0191a content = title.setContent(string2);
            String string3 = imageFragment.getString(C2531R.string.cancel);
            md8.checkNotNullExpressionValue(string3, "getString(...)");
            ae3.C0191a leftButton$default = ae3.C0191a.setLeftButton$default(content, string3, null, 2, null);
            String string4 = imageFragment.getString(C2531R.string.string_delete);
            md8.checkNotNullExpressionValue(string4, "getString(...)");
            ae3 ae3VarCreate = leftButton$default.setRightButton(string4, new ny6() { // from class: dv7
                @Override // p000.ny6
                public final Object invoke() {
                    return ImageFragment.initMListener$lambda$5$lambda$4(this.f30976a);
                }
            }).create();
            imageFragment.f18862F = ae3VarCreate;
            md8.checkNotNull(ae3VarCreate);
            ae3VarCreate.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth initMListener$lambda$5$lambda$4(ImageFragment imageFragment) {
        imageFragment.m4977e();
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMListener$lambda$6(ImageFragment imageFragment, View view) {
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        LinearLayout linearLayout = ((nu6) t).f65695C;
        md8.checkNotNullExpressionValue(linearLayout, "llImageControl");
        if (linearLayout.getVisibility() == 0) {
            if (PermissionUtils.checkStoragePermission(imageFragment.getContext())) {
                imageFragment.m4978g();
            } else {
                PermissionUtils.requestStoragePermission(imageFragment.getActivity());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMListener$lambda$7(ImageFragment imageFragment, View view) {
        imageFragment.requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMListener$lambda$8(ImageFragment imageFragment, ViewStub viewStub, View view) {
        imageFragment.f18865M = xci.bind(view);
        imageFragment.f18868Q = true;
        imageFragment.initPhotoListener();
        xci xciVar = imageFragment.f18865M;
        xci xciVar2 = null;
        if (xciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
            xciVar = null;
        }
        xciVar.f97534d.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RequestBuilder requestBuilderDiskCacheStrategy = ComponentCallbacks2C2485a.with(imageFragment).load(imageFragment.f18736b).diskCacheStrategy(ne4.f64121e);
        xci xciVar3 = imageFragment.f18865M;
        if (xciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
        } else {
            xciVar2 = xciVar3;
        }
        requestBuilderDiskCacheStrategy.into(xciVar2.f97534d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMListener$lambda$9(ImageFragment imageFragment, ViewStub viewStub, View view) {
        yci yciVarBind = yci.bind(view);
        imageFragment.f18867N = yciVarBind;
        imageFragment.f18870X = true;
        if (yciVarBind == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVarBind = null;
        }
        yciVarBind.f101136E2.setTag(Boolean.FALSE);
        imageFragment.initOperationListener();
        imageFragment.initStyleFilterUI();
    }

    @igg({"ClickableViewAccessibility"})
    private final void initOperationListener() {
        yci yciVar = this.f18867N;
        yci yciVar2 = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        yciVar.f101177c2.setOnClickListener(new View.OnClickListener() { // from class: rt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$12(this.f79530a, view);
            }
        });
        yci yciVar3 = this.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        yciVar3.f101199o2.setOnClickListener(new View.OnClickListener() { // from class: jt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$14(this.f51768a, view);
            }
        });
        yci yciVar4 = this.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar4 = null;
        }
        yciVar4.f101150N.setOnClickListener(new View.OnClickListener() { // from class: vt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$17(this.f92229a, view);
            }
        });
        yci yciVar5 = this.f18867N;
        if (yciVar5 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar5 = null;
        }
        yciVar5.f101179d.setOnClickListener(new View.OnClickListener() { // from class: bu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$18(this.f14773a, view);
            }
        });
        yci yciVar6 = this.f18867N;
        if (yciVar6 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar6 = null;
        }
        yciVar6.f101176c.setOnClickListener(new View.OnClickListener() { // from class: du7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$19(this.f30881a, view);
            }
        });
        yci yciVar7 = this.f18867N;
        if (yciVar7 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar7 = null;
        }
        yciVar7.f101173b.setOnClickListener(new View.OnClickListener() { // from class: eu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$20(this.f34033a, view);
            }
        });
        yci yciVar8 = this.f18867N;
        if (yciVar8 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar8 = null;
        }
        yciVar8.f101138F2.setOnClickListener(new View.OnClickListener() { // from class: fu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$21(this.f37774a, view);
            }
        });
        yci yciVar9 = this.f18867N;
        if (yciVar9 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar9 = null;
        }
        yciVar9.f101135D2.setOnClickListener(new View.OnClickListener() { // from class: gu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$22(this.f41194a, view);
            }
        });
        yci yciVar10 = this.f18867N;
        if (yciVar10 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar10 = null;
        }
        yciVar10.f101136E2.setOnClickListener(new View.OnClickListener() { // from class: hu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$23(this.f44891a, view);
            }
        });
        yci yciVar11 = this.f18867N;
        if (yciVar11 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar11 = null;
        }
        yciVar11.f101202r2.setOnClickListener(new View.OnClickListener() { // from class: iu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$24(this.f48501a, view);
            }
        });
        yci yciVar12 = this.f18867N;
        if (yciVar12 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar12 = null;
        }
        yciVar12.f101201q2.setOnClickListener(new View.OnClickListener() { // from class: cu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$25(this.f27621a, view);
            }
        });
        yci yciVar13 = this.f18867N;
        if (yciVar13 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar13 = null;
        }
        yciVar13.f101156R2.setOnClickListener(new View.OnClickListener() { // from class: nu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$26(this.f65709a, view);
            }
        });
        yci yciVar14 = this.f18867N;
        if (yciVar14 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar14 = null;
        }
        yciVar14.f101153P2.setOnClickListener(new View.OnClickListener() { // from class: yu7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$27(this.f102989a, view);
            }
        });
        yci yciVar15 = this.f18867N;
        if (yciVar15 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar15 = null;
        }
        yciVar15.f101157S2.setOnClickListener(new View.OnClickListener() { // from class: ev7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$28(this.f34136a, view);
            }
        });
        yci yciVar16 = this.f18867N;
        if (yciVar16 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar16 = null;
        }
        yciVar16.f101159U2.setOnClickListener(new View.OnClickListener() { // from class: fv7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$29(this.f37809a, view);
            }
        });
        yci yciVar17 = this.f18867N;
        if (yciVar17 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar17 = null;
        }
        yciVar17.f101161V2.setOnClickListener(new View.OnClickListener() { // from class: gv7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$30(this.f41462a, view);
            }
        });
        yci yciVar18 = this.f18867N;
        if (yciVar18 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar18 = null;
        }
        yciVar18.f101162W2.setOnClickListener(new View.OnClickListener() { // from class: hv7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$31(this.f44932a, view);
            }
        });
        yci yciVar19 = this.f18867N;
        if (yciVar19 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar19 = null;
        }
        yciVar19.f101164X2.setOnClickListener(new View.OnClickListener() { // from class: iv7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$32(this.f48549a, view);
            }
        });
        yci yciVar20 = this.f18867N;
        if (yciVar20 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar20 = null;
        }
        yciVar20.f101166Y2.setOnClickListener(new View.OnClickListener() { // from class: ht7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$33(this.f44819a, view);
            }
        });
        yci yciVar21 = this.f18867N;
        if (yciVar21 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar21 = null;
        }
        yciVar21.f101158T2.setOnClickListener(new View.OnClickListener() { // from class: it7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$34(this.f48206a, view);
            }
        });
        yci yciVar22 = this.f18867N;
        if (yciVar22 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar22 = null;
        }
        yciVar22.f101188g2.setOnClickListener(new View.OnClickListener() { // from class: kt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$36(this.f55303a, view);
            }
        });
        yci yciVar23 = this.f18867N;
        if (yciVar23 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar23 = null;
        }
        yciVar23.f101192i2.setOnClickListener(new View.OnClickListener() { // from class: lt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$37(this.f58705a, view);
            }
        });
        yci yciVar24 = this.f18867N;
        if (yciVar24 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar24 = null;
        }
        yciVar24.f101190h2.setOnTouchListener(new View.OnTouchListener() { // from class: mt7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ImageFragment.initOperationListener$lambda$38(this.f62088a, view, motionEvent);
            }
        });
        yci yciVar25 = this.f18867N;
        if (yciVar25 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar25 = null;
        }
        yciVar25.f101193j2.setOnClickListener(new View.OnClickListener() { // from class: nt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$40(this.f65644a, view);
            }
        });
        yci yciVar26 = this.f18867N;
        if (yciVar26 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar26 = null;
        }
        yciVar26.f101195l2.setOnClickListener(new View.OnClickListener() { // from class: ot7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$41(this.f68709a, view);
            }
        });
        yci yciVar27 = this.f18867N;
        if (yciVar27 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar27 = null;
        }
        yciVar27.f101203s2.setOnClickListener(new View.OnClickListener() { // from class: pt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$44(this.f71987a, view);
            }
        });
        yci yciVar28 = this.f18867N;
        if (yciVar28 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar28 = null;
        }
        yciVar28.f101204t2.setOnClickListener(new View.OnClickListener() { // from class: qt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$45(this.f75697a, view);
            }
        });
        yci yciVar29 = this.f18867N;
        if (yciVar29 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar29 = null;
        }
        yciVar29.f101205u2.setOnClickListener(new View.OnClickListener() { // from class: st7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$46(this.f82820a, view);
            }
        });
        yci yciVar30 = this.f18867N;
        if (yciVar30 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar30 = null;
        }
        yciVar30.f101207w2.setOnClickListener(new View.OnClickListener() { // from class: tt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$47(this.f85826a, view);
            }
        });
        yci yciVar31 = this.f18867N;
        if (yciVar31 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar31 = null;
        }
        yciVar31.f101208x2.setOnClickListener(new View.OnClickListener() { // from class: ut7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$48(this.f89078a, view);
            }
        });
        yci yciVar32 = this.f18867N;
        if (yciVar32 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar32 = null;
        }
        yciVar32.f101206v2.setOnClickListener(new View.OnClickListener() { // from class: wt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$49(this.f95484a, view);
            }
        });
        yci yciVar33 = this.f18867N;
        if (yciVar33 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar33 = null;
        }
        yciVar33.f101142I2.setOnValueChangeListener(new qy6() { // from class: xt7
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return ImageFragment.initOperationListener$lambda$50(this.f99226a, ((Integer) obj).intValue());
            }
        });
        yci yciVar34 = this.f18867N;
        if (yciVar34 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar34 = null;
        }
        yciVar34.f101180d2.setOnClickListener(new View.OnClickListener() { // from class: yt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$52(this.f102945a, view);
            }
        });
        yci yciVar35 = this.f18867N;
        if (yciVar35 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar35 = null;
        }
        yciVar35.f101186f2.setOnClickListener(new View.OnClickListener() { // from class: zt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$53(this.f106063a, view);
            }
        });
        yci yciVar36 = this.f18867N;
        if (yciVar36 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar36 = null;
        }
        yciVar36.f101147M.setOnClickListener(new View.OnClickListener() { // from class: au7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageFragment.initOperationListener$lambda$55(this.f11888a, view);
            }
        });
        yci yciVar37 = this.f18867N;
        if (yciVar37 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar37 = null;
        }
        yciVar37.f101190h2.setOnTouchListener(this.f18882i2);
        yci yciVar38 = this.f18867N;
        if (yciVar38 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar38 = null;
        }
        yciVar38.f101194k2.setOnTouchListener(this.f18883j2);
        yci yciVar39 = this.f18867N;
        if (yciVar39 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
        } else {
            yciVar2 = yciVar39;
        }
        yciVar2.f101183e2.setOnTouchListener(this.f18882i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$12(final ImageFragment imageFragment, View view) {
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        yci yciVar = null;
        if (!((nu6) t).f65697H.isAnyEffectsTransform()) {
            T t2 = imageFragment.binding;
            md8.checkNotNull(t2);
            if (!((nu6) t2).f65697H.isRotationMirrorRatio() && !imageFragment.f18879f2) {
                yci yciVar2 = imageFragment.f18867N;
                if (yciVar2 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar2 = null;
                }
                ConstraintLayout constraintLayout = yciVar2.f101145L;
                md8.checkNotNullExpressionValue(constraintLayout, "clTopOpera");
                constraintLayout.setVisibility(8);
                yci yciVar3 = imageFragment.f18867N;
                if (yciVar3 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar3 = null;
                }
                yciVar3.f101134C2.clearAnimation();
                yci yciVar4 = imageFragment.f18867N;
                if (yciVar4 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar4;
                }
                LinearLayout linearLayout = yciVar.f101134C2;
                md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
                linearLayout.setVisibility(8);
                T t3 = imageFragment.binding;
                md8.checkNotNull(t3);
                LinearLayout linearLayout2 = ((nu6) t3).f65695C;
                md8.checkNotNullExpressionValue(linearLayout2, "llImageControl");
                linearLayout2.setVisibility(0);
                T t4 = imageFragment.binding;
                md8.checkNotNull(t4);
                ImageView imageView = ((nu6) t4).f65704c;
                md8.checkNotNullExpressionValue(imageView, "btnImgDownload");
                imageView.setVisibility(0);
                T t5 = imageFragment.binding;
                md8.checkNotNull(t5);
                LinearLayout linearLayout3 = ((nu6) t5).f65696F;
                md8.checkNotNullExpressionValue(linearLayout3, "llTop");
                linearLayout3.setVisibility(0);
                imageFragment.resetPhotoViewSize(false);
                imageFragment.sendViewPagerScrollEnable(true);
                T t6 = imageFragment.binding;
                md8.checkNotNull(t6);
                ((nu6) t6).f65697H.setWatermarkVisible(true);
                return;
            }
        }
        ae3 ae3Var = imageFragment.f18862F;
        if (ae3Var != null) {
            ae3Var.dismiss();
        }
        FragmentActivity fragmentActivityRequireActivity = imageFragment.requireActivity();
        md8.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ae3.C0191a c0191a = new ae3.C0191a(fragmentActivityRequireActivity);
        String string = imageFragment.getString(C2531R.string.tips);
        md8.checkNotNullExpressionValue(string, "getString(...)");
        ae3.C0191a title = c0191a.setTitle(string);
        String string2 = imageFragment.getString(C2531R.string.discard_changes_confirm);
        md8.checkNotNullExpressionValue(string2, "getString(...)");
        ae3.C0191a content = title.setContent(string2);
        String string3 = imageFragment.getString(C2531R.string.cancel);
        md8.checkNotNullExpressionValue(string3, "getString(...)");
        ae3.C0191a leftButton$default = ae3.C0191a.setLeftButton$default(content, string3, null, 2, null);
        String string4 = imageFragment.getString(C2531R.string.abandon);
        md8.checkNotNullExpressionValue(string4, "getString(...)");
        ae3 ae3VarCreate = leftButton$default.setRightButton(string4, new ny6() { // from class: vu7
            @Override // p000.ny6
            public final Object invoke() {
                return ImageFragment.initOperationListener$lambda$12$lambda$11(this.f92273a);
            }
        }).create();
        imageFragment.f18862F = ae3VarCreate;
        md8.checkNotNull(ae3VarCreate);
        ae3VarCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth initOperationListener$lambda$12$lambda$11(ImageFragment imageFragment) {
        imageFragment.resetAllImageOperation();
        yci yciVar = imageFragment.f18867N;
        yci yciVar2 = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        ConstraintLayout constraintLayout = yciVar.f101145L;
        md8.checkNotNullExpressionValue(constraintLayout, "clTopOpera");
        constraintLayout.setVisibility(8);
        yci yciVar3 = imageFragment.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        yciVar3.f101134C2.clearAnimation();
        yci yciVar4 = imageFragment.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
        } else {
            yciVar2 = yciVar4;
        }
        LinearLayout linearLayout = yciVar2.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        linearLayout.setVisibility(8);
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        LinearLayout linearLayout2 = ((nu6) t).f65695C;
        md8.checkNotNullExpressionValue(linearLayout2, "llImageControl");
        linearLayout2.setVisibility(0);
        T t2 = imageFragment.binding;
        md8.checkNotNull(t2);
        ImageView imageView = ((nu6) t2).f65704c;
        md8.checkNotNullExpressionValue(imageView, "btnImgDownload");
        imageView.setVisibility(0);
        T t3 = imageFragment.binding;
        md8.checkNotNull(t3);
        LinearLayout linearLayout3 = ((nu6) t3).f65696F;
        md8.checkNotNullExpressionValue(linearLayout3, "llTop");
        linearLayout3.setVisibility(0);
        imageFragment.resetPhotoViewSize(false);
        imageFragment.sendViewPagerScrollEnable(true);
        T t4 = imageFragment.binding;
        md8.checkNotNull(t4);
        ((nu6) t4).f65697H.setWatermarkVisible(true);
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$14(final ImageFragment imageFragment, View view) {
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        if (!((nu6) t).f65697H.isAnyEffectsTransform()) {
            T t2 = imageFragment.binding;
            md8.checkNotNull(t2);
            if (!((nu6) t2).f65697H.isRotationMirrorRatio() && !imageFragment.f18879f2) {
                return;
            }
        }
        ae3 ae3Var = imageFragment.f18862F;
        if (ae3Var != null) {
            ae3Var.dismiss();
        }
        FragmentActivity fragmentActivityRequireActivity = imageFragment.requireActivity();
        md8.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ae3.C0191a c0191a = new ae3.C0191a(fragmentActivityRequireActivity);
        String string = imageFragment.getString(C2531R.string.tips);
        md8.checkNotNullExpressionValue(string, "getString(...)");
        ae3.C0191a title = c0191a.setTitle(string);
        String string2 = imageFragment.getString(C2531R.string.reset_confirm_message);
        md8.checkNotNullExpressionValue(string2, "getString(...)");
        ae3.C0191a content = title.setContent(string2);
        String string3 = imageFragment.getString(C2531R.string.cancel);
        md8.checkNotNullExpressionValue(string3, "getString(...)");
        ae3.C0191a leftButton$default = ae3.C0191a.setLeftButton$default(content, string3, null, 2, null);
        String string4 = imageFragment.getString(C2531R.string.reset);
        md8.checkNotNullExpressionValue(string4, "getString(...)");
        ae3 ae3VarCreate = leftButton$default.setRightButton(string4, new ny6() { // from class: gt7
            @Override // p000.ny6
            public final Object invoke() {
                return ImageFragment.initOperationListener$lambda$14$lambda$13(this.f40973a);
            }
        }).create();
        imageFragment.f18862F = ae3VarCreate;
        md8.checkNotNull(ae3VarCreate);
        ae3VarCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth initOperationListener$lambda$14$lambda$13(ImageFragment imageFragment) {
        imageFragment.resetAllImageOperation();
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.io.File] */
    public static final void initOperationListener$lambda$17(ImageFragment imageFragment, View view) {
        yci yciVar = imageFragment.f18867N;
        yci yciVar2 = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        yciVar.f101150N.setEnabled(false);
        imageFragment.getMLoadingDialog().show();
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        AdvancedPhotoView advancedPhotoView = ((nu6) t).f65697H;
        Uri uri = imageFragment.f18737c;
        md8.checkNotNullExpressionValue(uri, "uri");
        Bitmap dealBitmap = advancedPhotoView.getDealBitmap(uri, imageFragment.f18879f2);
        if (dealBitmap != null) {
            ?? file = new File(imageFragment.f18737c.getPath());
            jvd.C8121h c8121h = new jvd.C8121h();
            if (h9g.startsWith$default(mu5.getNameWithoutExtension(file), "edit_", false, 2, null) && h9g.endsWith$default(mu5.getNameWithoutExtension(file), "_filter", false, 2, null)) {
                c8121h.f52110a = file;
            } else {
                c8121h.f52110a = new File(imageFragment.requireActivity().getFilesDir(), "media/edit_" + mu5.getNameWithoutExtension(file) + "_filter." + mu5.getExtension(file));
            }
            if (m5035l0(imageFragment, dealBitmap, (File) c8121h.f52110a, null, 0, 12, null)) {
                fg1.launch$default(h59.getLifecycleScope(imageFragment), df4.getIO(), null, imageFragment.new C2836c(c8121h, null), 2, null);
                imageFragment.resetAllImageOperation();
                yci yciVar3 = imageFragment.f18867N;
                if (yciVar3 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar3 = null;
                }
                ConstraintLayout constraintLayout = yciVar3.f101145L;
                md8.checkNotNullExpressionValue(constraintLayout, "clTopOpera");
                constraintLayout.setVisibility(8);
                yci yciVar4 = imageFragment.f18867N;
                if (yciVar4 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar4 = null;
                }
                yciVar4.f101134C2.clearAnimation();
                yci yciVar5 = imageFragment.f18867N;
                if (yciVar5 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar5 = null;
                }
                LinearLayout linearLayout = yciVar5.f101134C2;
                md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
                linearLayout.setVisibility(8);
                T t2 = imageFragment.binding;
                md8.checkNotNull(t2);
                LinearLayout linearLayout2 = ((nu6) t2).f65695C;
                md8.checkNotNullExpressionValue(linearLayout2, "llImageControl");
                linearLayout2.setVisibility(0);
                T t3 = imageFragment.binding;
                md8.checkNotNull(t3);
                ImageView imageView = ((nu6) t3).f65704c;
                md8.checkNotNullExpressionValue(imageView, "btnImgDownload");
                imageView.setVisibility(0);
                T t4 = imageFragment.binding;
                md8.checkNotNull(t4);
                LinearLayout linearLayout3 = ((nu6) t4).f65696F;
                md8.checkNotNullExpressionValue(linearLayout3, "llTop");
                linearLayout3.setVisibility(0);
                imageFragment.resetPhotoViewSize(false);
                imageFragment.sendViewPagerScrollEnable(true);
                m3h.showToastShort(imageFragment.getResources().getString(C2531R.string.save_success));
            } else {
                m3h.showToastShort(imageFragment.getResources().getString(C2531R.string.save_image_failed));
            }
            yci yciVar6 = imageFragment.f18867N;
            if (yciVar6 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar6;
            }
            yciVar2.f101150N.setEnabled(true);
            imageFragment.getMLoadingDialog().dismiss();
        } else {
            imageFragment.getMLoadingDialog().dismiss();
            yci yciVar7 = imageFragment.f18867N;
            if (yciVar7 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar7;
            }
            yciVar2.f101150N.setEnabled(true);
            m3h.showToastShort(imageFragment.getResources().getString(C2531R.string.save_image_failed));
        }
        T t5 = imageFragment.binding;
        md8.checkNotNull(t5);
        ((nu6) t5).f65697H.setWatermarkVisible(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$18(ImageFragment imageFragment, View view) {
        yci yciVar = imageFragment.f18867N;
        xci xciVar = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        LinearLayout linearLayout = yciVar.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        if (linearLayout.getVisibility() == 0) {
            yci yciVar2 = imageFragment.f18867N;
            if (yciVar2 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar2 = null;
            }
            yciVar2.f101179d.setEnabled(false);
            if (imageFragment.f18876c2 != 0) {
                imageFragment.f18876c2 = 0;
            }
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar3 = null;
            }
            ConstraintLayout constraintLayout = yciVar3.f101145L;
            md8.checkNotNullExpressionValue(constraintLayout, "clTopOpera");
            constraintLayout.setVisibility(8);
            yci yciVar4 = imageFragment.f18867N;
            if (yciVar4 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar4 = null;
            }
            LinearLayout linearLayout2 = yciVar4.f101134C2;
            md8.checkNotNullExpressionValue(linearLayout2, "llImageEdit");
            linearLayout2.setVisibility(8);
            yci yciVar5 = imageFragment.f18867N;
            if (yciVar5 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar5 = null;
            }
            ConstraintLayout constraintLayout2 = yciVar5.f101133C;
            md8.checkNotNullExpressionValue(constraintLayout2, "clImageCrop");
            constraintLayout2.setVisibility(0);
            yci yciVar6 = imageFragment.f18867N;
            if (yciVar6 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar6 = null;
            }
            yciVar6.f101179d.setEnabled(true);
            if (((nu6) imageFragment.binding).f65697H.getCurrentRatio() == AdvancedPhotoView.EnumC2814a.f18711L) {
                xci xciVar2 = imageFragment.f18865M;
                if (xciVar2 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingPhoto");
                } else {
                    xciVar = xciVar2;
                }
                CropOverlayView cropOverlayView = xciVar.f97532b;
                md8.checkNotNullExpressionValue(cropOverlayView, "covPhotoView");
                cropOverlayView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$19(ImageFragment imageFragment, View view) {
        yci yciVar = imageFragment.f18867N;
        yci yciVar2 = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        LinearLayout linearLayout = yciVar.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        if (linearLayout.getVisibility() == 0) {
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar3 = null;
            }
            yciVar3.f101176c.setEnabled(false);
            if (imageFragment.f18876c2 != 1) {
                imageFragment.f18876c2 = 1;
                imageFragment.f18877d2 = "";
                T t = imageFragment.binding;
                md8.checkNotNull(t);
                AdvancedPhotoView advancedPhotoView = ((nu6) t).f65697H;
                Uri uri = imageFragment.f18737c;
                md8.checkNotNullExpressionValue(uri, "uri");
                Bitmap dealBitmap = advancedPhotoView.getDealBitmap(uri, imageFragment.f18879f2);
                Bitmap bitmap = imageFragment.f18864L;
                if (bitmap == null) {
                    imageFragment.f18864L = dealBitmap;
                    xci xciVar = imageFragment.f18865M;
                    if (xciVar == null) {
                        md8.throwUninitializedPropertyAccessException("bindingPhoto");
                        xciVar = null;
                    }
                    xciVar.f97533c.setImageDrawable(new BitmapDrawable(imageFragment.f18864L));
                    imageFragment.initStyleFilterBitmap();
                    imageFragment.switchFilterUI("");
                } else if (bitmap != null && !bitmap.sameAs(dealBitmap)) {
                    imageFragment.f18864L = dealBitmap;
                    xci xciVar2 = imageFragment.f18865M;
                    if (xciVar2 == null) {
                        md8.throwUninitializedPropertyAccessException("bindingPhoto");
                        xciVar2 = null;
                    }
                    xciVar2.f97533c.setImageDrawable(new BitmapDrawable(imageFragment.f18864L));
                    imageFragment.f18872Z = 0;
                    imageFragment.initStyleFilterBitmap();
                    imageFragment.switchFilterUI("");
                }
            }
            xci xciVar3 = imageFragment.f18865M;
            if (xciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingPhoto");
                xciVar3 = null;
            }
            AdvancedPhotoView advancedPhotoView2 = xciVar3.f97533c;
            md8.checkNotNullExpressionValue(advancedPhotoView2, "filterPhotoView");
            advancedPhotoView2.setVisibility(0);
            T t2 = imageFragment.binding;
            md8.checkNotNull(t2);
            AdvancedPhotoView advancedPhotoView3 = ((nu6) t2).f65697H;
            md8.checkNotNullExpressionValue(advancedPhotoView3, "photoView");
            advancedPhotoView3.setVisibility(8);
            yci yciVar4 = imageFragment.f18867N;
            if (yciVar4 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar4 = null;
            }
            ConstraintLayout constraintLayout = yciVar4.f101145L;
            md8.checkNotNullExpressionValue(constraintLayout, "clTopOpera");
            constraintLayout.setVisibility(8);
            yci yciVar5 = imageFragment.f18867N;
            if (yciVar5 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar5 = null;
            }
            LinearLayout linearLayout2 = yciVar5.f101134C2;
            md8.checkNotNullExpressionValue(linearLayout2, "llImageEdit");
            linearLayout2.setVisibility(8);
            yci yciVar6 = imageFragment.f18867N;
            if (yciVar6 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar6 = null;
            }
            ConstraintLayout constraintLayout2 = yciVar6.f101137F;
            md8.checkNotNullExpressionValue(constraintLayout2, "clImageFilter");
            constraintLayout2.setVisibility(0);
            yci yciVar7 = imageFragment.f18867N;
            if (yciVar7 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar7;
            }
            yciVar2.f101176c.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$20(ImageFragment imageFragment, View view) {
        yci yciVar = imageFragment.f18867N;
        yci yciVar2 = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        LinearLayout linearLayout = yciVar.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        if (linearLayout.getVisibility() == 0) {
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar3 = null;
            }
            yciVar3.f101173b.setEnabled(false);
            if (imageFragment.f18876c2 != 2) {
                imageFragment.f18876c2 = 2;
            }
            yci yciVar4 = imageFragment.f18867N;
            if (yciVar4 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar4 = null;
            }
            ConstraintLayout constraintLayout = yciVar4.f101145L;
            md8.checkNotNullExpressionValue(constraintLayout, "clTopOpera");
            constraintLayout.setVisibility(8);
            yci yciVar5 = imageFragment.f18867N;
            if (yciVar5 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar5 = null;
            }
            LinearLayout linearLayout2 = yciVar5.f101134C2;
            md8.checkNotNullExpressionValue(linearLayout2, "llImageEdit");
            linearLayout2.setVisibility(8);
            yci yciVar6 = imageFragment.f18867N;
            if (yciVar6 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar6 = null;
            }
            ConstraintLayout constraintLayout2 = yciVar6.f101185f;
            md8.checkNotNullExpressionValue(constraintLayout2, "clImageAdjust");
            constraintLayout2.setVisibility(0);
            imageFragment.switchAdjustUI();
            yci yciVar7 = imageFragment.f18867N;
            if (yciVar7 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar7;
            }
            yciVar2.f101173b.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$21(ImageFragment imageFragment, View view) {
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        float currentRotation = ((nu6) t).f65697H.getCurrentRotation() + 90.0f;
        T t2 = imageFragment.binding;
        md8.checkNotNull(t2);
        ((nu6) t2).f65697H.setAdvancedRotation(currentRotation);
        yci yciVar = imageFragment.f18867N;
        xci xciVar = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        LinearLayout linearLayout = yciVar.f101139G2;
        md8.checkNotNullExpressionValue(linearLayout, "llScaleOrientation");
        linearLayout.setVisibility(8);
        yci yciVar2 = imageFragment.f18867N;
        if (yciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar2 = null;
        }
        CardView cardView = yciVar2.f101154Q;
        md8.checkNotNullExpressionValue(cardView, "cvScaleDetail");
        cardView.setVisibility(8);
        yci yciVar3 = imageFragment.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        if (yciVar3.f101172a3.getCurrentTextColor() == imageFragment.requireActivity().getColor(C2531R.color.t_ecf3f3)) {
            yci yciVar4 = imageFragment.f18867N;
            if (yciVar4 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar4 = null;
            }
            yciVar4.f101200p2.setImageResource(C2531R.drawable.ic_image_rotate_selected);
            yci yciVar5 = imageFragment.f18867N;
            if (yciVar5 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar5 = null;
            }
            yciVar5.f101172a3.setTextColor(imageFragment.requireActivity().getColor(C2531R.color.t_ffd100));
        } else {
            yci yciVar6 = imageFragment.f18867N;
            if (yciVar6 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar6 = null;
            }
            yciVar6.f101200p2.setImageResource(C2531R.drawable.ic_image_rotate);
            yci yciVar7 = imageFragment.f18867N;
            if (yciVar7 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar7 = null;
            }
            yciVar7.f101172a3.setTextColor(imageFragment.requireActivity().getColor(C2531R.color.t_ecf3f3));
        }
        yci yciVar8 = imageFragment.f18867N;
        if (yciVar8 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar8 = null;
        }
        yciVar8.f101197m2.setImageResource(C2531R.drawable.ic_image_mirror);
        yci yciVar9 = imageFragment.f18867N;
        if (yciVar9 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar9 = null;
        }
        yciVar9.f101155Q2.setTextColor(imageFragment.requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar10 = imageFragment.f18867N;
        if (yciVar10 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar10 = null;
        }
        yciVar10.f101198n2.setImageResource(C2531R.drawable.ic_image_scale);
        yci yciVar11 = imageFragment.f18867N;
        if (yciVar11 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar11 = null;
        }
        yciVar11.f101169Z2.setTextColor(imageFragment.requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar12 = imageFragment.f18867N;
        if (yciVar12 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar12 = null;
        }
        yciVar12.f101136E2.setTag(Boolean.FALSE);
        xci xciVar2 = imageFragment.f18865M;
        if (xciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
        } else {
            xciVar = xciVar2;
        }
        CropOverlayView cropOverlayView = xciVar.f97532b;
        md8.checkNotNullExpressionValue(cropOverlayView, "covPhotoView");
        cropOverlayView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$22(ImageFragment imageFragment, View view) {
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        boolean zIsMirrored = ((nu6) t).f65697H.isMirrored();
        T t2 = imageFragment.binding;
        md8.checkNotNull(t2);
        ((nu6) t2).f65697H.setAdvancedMirror(!zIsMirrored);
        yci yciVar = imageFragment.f18867N;
        xci xciVar = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        if (yciVar.f101155Q2.getCurrentTextColor() == imageFragment.requireActivity().getColor(C2531R.color.t_ecf3f3)) {
            yci yciVar2 = imageFragment.f18867N;
            if (yciVar2 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar2 = null;
            }
            yciVar2.f101197m2.setImageResource(C2531R.drawable.ic_image_mirror_selected);
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar3 = null;
            }
            yciVar3.f101155Q2.setTextColor(imageFragment.requireActivity().getColor(C2531R.color.t_ffd100));
        } else {
            yci yciVar4 = imageFragment.f18867N;
            if (yciVar4 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar4 = null;
            }
            yciVar4.f101197m2.setImageResource(C2531R.drawable.ic_image_mirror);
            yci yciVar5 = imageFragment.f18867N;
            if (yciVar5 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar5 = null;
            }
            yciVar5.f101155Q2.setTextColor(imageFragment.requireActivity().getColor(C2531R.color.t_ecf3f3));
        }
        yci yciVar6 = imageFragment.f18867N;
        if (yciVar6 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar6 = null;
        }
        yciVar6.f101200p2.setImageResource(C2531R.drawable.ic_image_rotate);
        yci yciVar7 = imageFragment.f18867N;
        if (yciVar7 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar7 = null;
        }
        yciVar7.f101172a3.setTextColor(imageFragment.requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar8 = imageFragment.f18867N;
        if (yciVar8 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar8 = null;
        }
        yciVar8.f101198n2.setImageResource(C2531R.drawable.ic_image_scale);
        yci yciVar9 = imageFragment.f18867N;
        if (yciVar9 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar9 = null;
        }
        yciVar9.f101169Z2.setTextColor(imageFragment.requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar10 = imageFragment.f18867N;
        if (yciVar10 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar10 = null;
        }
        LinearLayout linearLayout = yciVar10.f101139G2;
        md8.checkNotNullExpressionValue(linearLayout, "llScaleOrientation");
        linearLayout.setVisibility(8);
        yci yciVar11 = imageFragment.f18867N;
        if (yciVar11 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar11 = null;
        }
        CardView cardView = yciVar11.f101154Q;
        md8.checkNotNullExpressionValue(cardView, "cvScaleDetail");
        cardView.setVisibility(8);
        yci yciVar12 = imageFragment.f18867N;
        if (yciVar12 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar12 = null;
        }
        yciVar12.f101136E2.setTag(Boolean.FALSE);
        xci xciVar2 = imageFragment.f18865M;
        if (xciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
        } else {
            xciVar = xciVar2;
        }
        CropOverlayView cropOverlayView = xciVar.f97532b;
        md8.checkNotNullExpressionValue(cropOverlayView, "covPhotoView");
        cropOverlayView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$23(ImageFragment imageFragment, View view) {
        yci yciVar = imageFragment.f18867N;
        xci xciVar = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        Object tag = yciVar.f101136E2.getTag();
        if (md8.areEqual(tag instanceof Boolean ? (Boolean) tag : null, Boolean.FALSE)) {
            yci yciVar2 = imageFragment.f18867N;
            if (yciVar2 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar2 = null;
            }
            yciVar2.f101136E2.setTag(Boolean.TRUE);
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar3 = null;
            }
            yciVar3.f101200p2.setImageResource(C2531R.drawable.ic_image_rotate);
            yci yciVar4 = imageFragment.f18867N;
            if (yciVar4 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar4 = null;
            }
            yciVar4.f101172a3.setTextColor(imageFragment.requireActivity().getColor(C2531R.color.t_ecf3f3));
            yci yciVar5 = imageFragment.f18867N;
            if (yciVar5 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar5 = null;
            }
            yciVar5.f101197m2.setImageResource(C2531R.drawable.ic_image_mirror);
            yci yciVar6 = imageFragment.f18867N;
            if (yciVar6 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar6 = null;
            }
            yciVar6.f101155Q2.setTextColor(imageFragment.requireActivity().getColor(C2531R.color.t_ecf3f3));
            yci yciVar7 = imageFragment.f18867N;
            if (yciVar7 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar7 = null;
            }
            yciVar7.f101198n2.setImageResource(C2531R.drawable.ic_image_scale_selected);
            yci yciVar8 = imageFragment.f18867N;
            if (yciVar8 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar8 = null;
            }
            yciVar8.f101169Z2.setTextColor(imageFragment.requireActivity().getColor(C2531R.color.t_ffd100));
            yci yciVar9 = imageFragment.f18867N;
            if (yciVar9 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar9 = null;
            }
            LinearLayout linearLayout = yciVar9.f101139G2;
            md8.checkNotNullExpressionValue(linearLayout, "llScaleOrientation");
            linearLayout.setVisibility(0);
            yci yciVar10 = imageFragment.f18867N;
            if (yciVar10 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar10 = null;
            }
            CardView cardView = yciVar10.f101154Q;
            md8.checkNotNullExpressionValue(cardView, "cvScaleDetail");
            cardView.setVisibility(0);
            xci xciVar2 = imageFragment.f18865M;
            if (xciVar2 == null) {
                md8.throwUninitializedPropertyAccessException("bindingPhoto");
            } else {
                xciVar = xciVar2;
            }
            CropOverlayView cropOverlayView = xciVar.f97532b;
            T t = imageFragment.binding;
            md8.checkNotNull(t);
            AdvancedPhotoView advancedPhotoView = ((nu6) t).f65697H;
            md8.checkNotNullExpressionValue(advancedPhotoView, "photoView");
            cropOverlayView.setPhotoView(advancedPhotoView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$24(ImageFragment imageFragment, View view) {
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        AdvancedPhotoView.EnumC2814a currentRatio = ((nu6) t).f65697H.getCurrentRatio();
        AdvancedPhotoView.EnumC2814a enumC2814a = AdvancedPhotoView.EnumC2814a.f18709F;
        if (currentRatio != enumC2814a) {
            imageFragment.applyRatio(enumC2814a);
            yci yciVar = imageFragment.f18867N;
            yci yciVar2 = null;
            if (yciVar == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar = null;
            }
            yciVar.f101202r2.setImageResource(C2531R.drawable.ic_image_vertical_selected);
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar3;
            }
            yciVar2.f101201q2.setImageResource(C2531R.drawable.ic_image_landscape);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$25(ImageFragment imageFragment, View view) {
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        AdvancedPhotoView.EnumC2814a currentRatio = ((nu6) t).f65697H.getCurrentRatio();
        AdvancedPhotoView.EnumC2814a enumC2814a = AdvancedPhotoView.EnumC2814a.f18708C;
        if (currentRatio != enumC2814a) {
            imageFragment.applyRatio(enumC2814a);
            yci yciVar = imageFragment.f18867N;
            yci yciVar2 = null;
            if (yciVar == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar = null;
            }
            yciVar.f101202r2.setImageResource(C2531R.drawable.ic_image_vertical);
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar3;
            }
            yciVar2.f101201q2.setImageResource(C2531R.drawable.ic_image_landscape_selected);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$26(ImageFragment imageFragment, View view) {
        imageFragment.applyRatio(AdvancedPhotoView.EnumC2814a.f18710H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$27(ImageFragment imageFragment, View view) {
        imageFragment.applyRatio(AdvancedPhotoView.EnumC2814a.f18711L);
        xci xciVar = imageFragment.f18865M;
        if (xciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
            xciVar = null;
        }
        CropOverlayView cropOverlayView = xciVar.f97532b;
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        AdvancedPhotoView advancedPhotoView = ((nu6) t).f65697H;
        md8.checkNotNullExpressionValue(advancedPhotoView, "photoView");
        cropOverlayView.restoreCropRectToFullSize(advancedPhotoView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$28(ImageFragment imageFragment, View view) {
        imageFragment.applyRatio(AdvancedPhotoView.EnumC2814a.f18714a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$29(ImageFragment imageFragment, View view) {
        imageFragment.applyRatio(AdvancedPhotoView.EnumC2814a.f18719f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$30(ImageFragment imageFragment, View view) {
        imageFragment.applyRatio(AdvancedPhotoView.EnumC2814a.f18720m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$31(ImageFragment imageFragment, View view) {
        imageFragment.applyRatio(AdvancedPhotoView.EnumC2814a.f18716c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$32(ImageFragment imageFragment, View view) {
        imageFragment.applyRatio(AdvancedPhotoView.EnumC2814a.f18715b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$33(ImageFragment imageFragment, View view) {
        imageFragment.applyRatio(AdvancedPhotoView.EnumC2814a.f18717d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$34(ImageFragment imageFragment, View view) {
        imageFragment.applyRatio(AdvancedPhotoView.EnumC2814a.f18718e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$36(final ImageFragment imageFragment, View view) {
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        yci yciVar = null;
        if (((nu6) t).f65697H.isRotationMirrorRatio()) {
            ae3 ae3Var = imageFragment.f18862F;
            if (ae3Var != null) {
                ae3Var.dismiss();
            }
            FragmentActivity fragmentActivityRequireActivity = imageFragment.requireActivity();
            md8.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ae3.C0191a c0191a = new ae3.C0191a(fragmentActivityRequireActivity);
            String string = imageFragment.getString(C2531R.string.tips);
            md8.checkNotNullExpressionValue(string, "getString(...)");
            ae3.C0191a title = c0191a.setTitle(string);
            String string2 = imageFragment.getString(C2531R.string.discard_changes_confirm);
            md8.checkNotNullExpressionValue(string2, "getString(...)");
            ae3.C0191a content = title.setContent(string2);
            String string3 = imageFragment.getString(C2531R.string.cancel);
            md8.checkNotNullExpressionValue(string3, "getString(...)");
            ae3.C0191a leftButton$default = ae3.C0191a.setLeftButton$default(content, string3, null, 2, null);
            String string4 = imageFragment.getString(C2531R.string.abandon);
            md8.checkNotNullExpressionValue(string4, "getString(...)");
            ae3 ae3VarCreate = leftButton$default.setRightButton(string4, new ny6() { // from class: mu7
                @Override // p000.ny6
                public final Object invoke() {
                    return ImageFragment.initOperationListener$lambda$36$lambda$35(this.f62184a);
                }
            }).create();
            imageFragment.f18862F = ae3VarCreate;
            md8.checkNotNull(ae3VarCreate);
            ae3VarCreate.show();
            return;
        }
        xci xciVar = imageFragment.f18865M;
        if (xciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
            xciVar = null;
        }
        CropOverlayView cropOverlayView = xciVar.f97532b;
        md8.checkNotNullExpressionValue(cropOverlayView, "covPhotoView");
        cropOverlayView.setVisibility(8);
        yci yciVar2 = imageFragment.f18867N;
        if (yciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar2 = null;
        }
        ConstraintLayout constraintLayout = yciVar2.f101133C;
        md8.checkNotNullExpressionValue(constraintLayout, "clImageCrop");
        constraintLayout.setVisibility(8);
        yci yciVar3 = imageFragment.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        ConstraintLayout constraintLayout2 = yciVar3.f101145L;
        md8.checkNotNullExpressionValue(constraintLayout2, "clTopOpera");
        constraintLayout2.setVisibility(0);
        yci yciVar4 = imageFragment.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
        } else {
            yciVar = yciVar4;
        }
        LinearLayout linearLayout = yciVar.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        linearLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth initOperationListener$lambda$36$lambda$35(ImageFragment imageFragment) {
        imageFragment.resetEdit();
        xci xciVar = imageFragment.f18865M;
        yci yciVar = null;
        if (xciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
            xciVar = null;
        }
        CropOverlayView cropOverlayView = xciVar.f97532b;
        md8.checkNotNullExpressionValue(cropOverlayView, "covPhotoView");
        cropOverlayView.setVisibility(8);
        yci yciVar2 = imageFragment.f18867N;
        if (yciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar2 = null;
        }
        ConstraintLayout constraintLayout = yciVar2.f101133C;
        md8.checkNotNullExpressionValue(constraintLayout, "clImageCrop");
        constraintLayout.setVisibility(8);
        yci yciVar3 = imageFragment.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        ConstraintLayout constraintLayout2 = yciVar3.f101145L;
        md8.checkNotNullExpressionValue(constraintLayout2, "clTopOpera");
        constraintLayout2.setVisibility(0);
        yci yciVar4 = imageFragment.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
        } else {
            yciVar = yciVar4;
        }
        LinearLayout linearLayout = yciVar.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        linearLayout.setVisibility(0);
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$37(ImageFragment imageFragment, View view) {
        xci xciVar = imageFragment.f18865M;
        yci yciVar = null;
        if (xciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
            xciVar = null;
        }
        CropOverlayView cropOverlayView = xciVar.f97532b;
        md8.checkNotNullExpressionValue(cropOverlayView, "covPhotoView");
        cropOverlayView.setVisibility(8);
        yci yciVar2 = imageFragment.f18867N;
        if (yciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar2 = null;
        }
        ConstraintLayout constraintLayout = yciVar2.f101133C;
        md8.checkNotNullExpressionValue(constraintLayout, "clImageCrop");
        constraintLayout.setVisibility(8);
        yci yciVar3 = imageFragment.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        ConstraintLayout constraintLayout2 = yciVar3.f101145L;
        md8.checkNotNullExpressionValue(constraintLayout2, "clTopOpera");
        constraintLayout2.setVisibility(0);
        yci yciVar4 = imageFragment.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
        } else {
            yciVar = yciVar4;
        }
        LinearLayout linearLayout = yciVar.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        linearLayout.setVisibility(0);
        imageFragment.checkImageUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean initOperationListener$lambda$38(com.eyevue.glassapp.view.photo.ImageFragment r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            int r8 = r9.getAction()
            r9 = 0
            java.lang.String r0 = "photoView"
            r1 = 8
            java.lang.String r2 = "originPhotoView"
            r3 = 0
            java.lang.String r4 = "bindingPhoto"
            r5 = 1
            if (r8 == 0) goto L38
            if (r8 == r5) goto L17
            r6 = 2
            if (r8 == r6) goto L38
            goto L58
        L17:
            xci r8 = r7.f18865M
            if (r8 != 0) goto L1f
            p000.md8.throwUninitializedPropertyAccessException(r4)
            goto L20
        L1f:
            r3 = r8
        L20:
            com.eyevue.glassapp.view.photo.AdvancedPhotoView r8 = r3.f97534d
            p000.md8.checkNotNullExpressionValue(r8, r2)
            r8.setVisibility(r1)
            T extends j8i r7 = r7.binding
            p000.md8.checkNotNull(r7)
            nu6 r7 = (p000.nu6) r7
            com.eyevue.glassapp.view.photo.AdvancedPhotoView r7 = r7.f65697H
            p000.md8.checkNotNullExpressionValue(r7, r0)
            r7.setVisibility(r9)
            goto L58
        L38:
            xci r8 = r7.f18865M
            if (r8 != 0) goto L40
            p000.md8.throwUninitializedPropertyAccessException(r4)
            goto L41
        L40:
            r3 = r8
        L41:
            com.eyevue.glassapp.view.photo.AdvancedPhotoView r8 = r3.f97534d
            p000.md8.checkNotNullExpressionValue(r8, r2)
            r8.setVisibility(r9)
            T extends j8i r7 = r7.binding
            p000.md8.checkNotNull(r7)
            nu6 r7 = (p000.nu6) r7
            com.eyevue.glassapp.view.photo.AdvancedPhotoView r7 = r7.f65697H
            p000.md8.checkNotNullExpressionValue(r7, r0)
            r7.setVisibility(r1)
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eyevue.glassapp.view.photo.ImageFragment.initOperationListener$lambda$38(com.eyevue.glassapp.view.photo.ImageFragment, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$40(final ImageFragment imageFragment, View view) {
        xci xciVar = null;
        if (imageFragment.f18877d2.length() > 0) {
            ae3 ae3Var = imageFragment.f18862F;
            if (ae3Var != null) {
                ae3Var.dismiss();
            }
            FragmentActivity fragmentActivityRequireActivity = imageFragment.requireActivity();
            md8.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ae3.C0191a c0191a = new ae3.C0191a(fragmentActivityRequireActivity);
            String string = imageFragment.getString(C2531R.string.tips);
            md8.checkNotNullExpressionValue(string, "getString(...)");
            ae3.C0191a title = c0191a.setTitle(string);
            String string2 = imageFragment.getString(C2531R.string.discard_changes_confirm);
            md8.checkNotNullExpressionValue(string2, "getString(...)");
            ae3.C0191a content = title.setContent(string2);
            String string3 = imageFragment.getString(C2531R.string.cancel);
            md8.checkNotNullExpressionValue(string3, "getString(...)");
            ae3.C0191a leftButton$default = ae3.C0191a.setLeftButton$default(content, string3, null, 2, null);
            String string4 = imageFragment.getString(C2531R.string.abandon);
            md8.checkNotNullExpressionValue(string4, "getString(...)");
            ae3 ae3VarCreate = leftButton$default.setRightButton(string4, new ny6() { // from class: uu7
                @Override // p000.ny6
                public final Object invoke() {
                    return ImageFragment.initOperationListener$lambda$40$lambda$39(this.f89151a);
                }
            }).create();
            imageFragment.f18862F = ae3VarCreate;
            md8.checkNotNull(ae3VarCreate);
            ae3VarCreate.show();
            return;
        }
        yci yciVar = imageFragment.f18867N;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        ConstraintLayout constraintLayout = yciVar.f101137F;
        md8.checkNotNullExpressionValue(constraintLayout, "clImageFilter");
        constraintLayout.setVisibility(8);
        yci yciVar2 = imageFragment.f18867N;
        if (yciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar2 = null;
        }
        ConstraintLayout constraintLayout2 = yciVar2.f101145L;
        md8.checkNotNullExpressionValue(constraintLayout2, "clTopOpera");
        constraintLayout2.setVisibility(0);
        yci yciVar3 = imageFragment.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        LinearLayout linearLayout = yciVar3.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        linearLayout.setVisibility(0);
        xci xciVar2 = imageFragment.f18865M;
        if (xciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
        } else {
            xciVar = xciVar2;
        }
        AdvancedPhotoView advancedPhotoView = xciVar.f97533c;
        md8.checkNotNullExpressionValue(advancedPhotoView, "filterPhotoView");
        advancedPhotoView.setVisibility(8);
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        AdvancedPhotoView advancedPhotoView2 = ((nu6) t).f65697H;
        md8.checkNotNullExpressionValue(advancedPhotoView2, "photoView");
        advancedPhotoView2.setVisibility(0);
        imageFragment.checkImageUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth initOperationListener$lambda$40$lambda$39(ImageFragment imageFragment) {
        imageFragment.switchFilterUI("");
        yci yciVar = imageFragment.f18867N;
        xci xciVar = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        ConstraintLayout constraintLayout = yciVar.f101137F;
        md8.checkNotNullExpressionValue(constraintLayout, "clImageFilter");
        constraintLayout.setVisibility(8);
        yci yciVar2 = imageFragment.f18867N;
        if (yciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar2 = null;
        }
        ConstraintLayout constraintLayout2 = yciVar2.f101145L;
        md8.checkNotNullExpressionValue(constraintLayout2, "clTopOpera");
        constraintLayout2.setVisibility(0);
        yci yciVar3 = imageFragment.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        LinearLayout linearLayout = yciVar3.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        linearLayout.setVisibility(0);
        xci xciVar2 = imageFragment.f18865M;
        if (xciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
        } else {
            xciVar = xciVar2;
        }
        AdvancedPhotoView advancedPhotoView = xciVar.f97533c;
        md8.checkNotNullExpressionValue(advancedPhotoView, "filterPhotoView");
        advancedPhotoView.setVisibility(8);
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        AdvancedPhotoView advancedPhotoView2 = ((nu6) t).f65697H;
        md8.checkNotNullExpressionValue(advancedPhotoView2, "photoView");
        advancedPhotoView2.setVisibility(0);
        imageFragment.checkImageUpdate();
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$41(ImageFragment imageFragment, View view) {
        if (!imageFragment.f18879f2) {
            imageFragment.f18879f2 = imageFragment.f18877d2.length() > 0;
        }
        if (imageFragment.f18877d2.length() > 0) {
            imageFragment.resetEdit();
            imageFragment.resetEffects();
            imageFragment.resetRatioUI();
            T t = imageFragment.binding;
            md8.checkNotNull(t);
            ((nu6) t).f65697H.setImageDrawable(new BitmapDrawable(imageFragment.f18873Z1.get(imageFragment.f18877d2)));
        }
        xci xciVar = imageFragment.f18865M;
        yci yciVar = null;
        if (xciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
            xciVar = null;
        }
        AdvancedPhotoView advancedPhotoView = xciVar.f97533c;
        md8.checkNotNullExpressionValue(advancedPhotoView, "filterPhotoView");
        advancedPhotoView.setVisibility(8);
        T t2 = imageFragment.binding;
        md8.checkNotNull(t2);
        AdvancedPhotoView advancedPhotoView2 = ((nu6) t2).f65697H;
        md8.checkNotNullExpressionValue(advancedPhotoView2, "photoView");
        advancedPhotoView2.setVisibility(0);
        yci yciVar2 = imageFragment.f18867N;
        if (yciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar2 = null;
        }
        ConstraintLayout constraintLayout = yciVar2.f101137F;
        md8.checkNotNullExpressionValue(constraintLayout, "clImageFilter");
        constraintLayout.setVisibility(8);
        yci yciVar3 = imageFragment.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        ConstraintLayout constraintLayout2 = yciVar3.f101145L;
        md8.checkNotNullExpressionValue(constraintLayout2, "clTopOpera");
        constraintLayout2.setVisibility(0);
        yci yciVar4 = imageFragment.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
        } else {
            yciVar = yciVar4;
        }
        LinearLayout linearLayout = yciVar.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        linearLayout.setVisibility(0);
        imageFragment.checkImageUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$44(ImageFragment imageFragment, View view) {
        Bitmap bitmap;
        if (imageFragment.f18880g2 != 0) {
            imageFragment.f18880g2 = 0;
            imageFragment.switchAdjustUI();
            if (imageFragment.f18881h2 == null && (bitmap = imageFragment.f18864L) != null) {
                imageFragment.f18881h2 = new AutoImageEnhancer().analyzeAndGetParams(bitmap);
            }
            AutoImageEnhancer.EnhancementParams enhancementParams = imageFragment.f18881h2;
            if (enhancementParams != null) {
                T t = imageFragment.binding;
                md8.checkNotNull(t);
                ((nu6) t).f65697H.setAllEffects(enhancementParams.getBrightness(), enhancementParams.getContrast(), enhancementParams.getSaturation(), enhancementParams.getExposure(), enhancementParams.getSharpness());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$45(ImageFragment imageFragment, View view) {
        String strValueOf;
        if (imageFragment.f18880g2 != 1) {
            imageFragment.f18880g2 = 1;
            T t = imageFragment.binding;
            md8.checkNotNull(t);
            int brightness = ((nu6) t).f65697H.getBrightness();
            yci yciVar = imageFragment.f18867N;
            yci yciVar2 = null;
            if (yciVar == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar = null;
            }
            yciVar.f101142I2.setCurrentValue(brightness);
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar3;
            }
            TextView textView = yciVar2.f101175b3;
            if (brightness > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append('+');
                sb.append(brightness);
                strValueOf = sb.toString();
            } else if (brightness < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('-');
                sb2.append(brightness);
                strValueOf = sb2.toString();
            } else {
                strValueOf = String.valueOf(brightness);
            }
            textView.setText(strValueOf);
            imageFragment.switchAdjustUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$46(ImageFragment imageFragment, View view) {
        String strValueOf;
        if (imageFragment.f18880g2 != 2) {
            imageFragment.f18880g2 = 2;
            T t = imageFragment.binding;
            md8.checkNotNull(t);
            int contrast = ((nu6) t).f65697H.getContrast();
            yci yciVar = imageFragment.f18867N;
            yci yciVar2 = null;
            if (yciVar == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar = null;
            }
            yciVar.f101142I2.setCurrentValue(contrast);
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar3;
            }
            TextView textView = yciVar2.f101175b3;
            if (contrast > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append('+');
                sb.append(contrast);
                strValueOf = sb.toString();
            } else if (contrast < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('-');
                sb2.append(contrast);
                strValueOf = sb2.toString();
            } else {
                strValueOf = String.valueOf(contrast);
            }
            textView.setText(strValueOf);
            imageFragment.switchAdjustUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$47(ImageFragment imageFragment, View view) {
        String strValueOf;
        if (imageFragment.f18880g2 != 3) {
            imageFragment.f18880g2 = 3;
            T t = imageFragment.binding;
            md8.checkNotNull(t);
            int saturation = ((nu6) t).f65697H.getSaturation();
            yci yciVar = imageFragment.f18867N;
            yci yciVar2 = null;
            if (yciVar == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar = null;
            }
            yciVar.f101142I2.setCurrentValue(saturation);
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar3;
            }
            TextView textView = yciVar2.f101175b3;
            if (saturation > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append('+');
                sb.append(saturation);
                strValueOf = sb.toString();
            } else if (saturation < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('-');
                sb2.append(saturation);
                strValueOf = sb2.toString();
            } else {
                strValueOf = String.valueOf(saturation);
            }
            textView.setText(strValueOf);
            imageFragment.switchAdjustUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$48(ImageFragment imageFragment, View view) {
        String strValueOf;
        if (imageFragment.f18880g2 != 4) {
            imageFragment.f18880g2 = 4;
            T t = imageFragment.binding;
            md8.checkNotNull(t);
            int sharpness = ((nu6) t).f65697H.getSharpness();
            yci yciVar = imageFragment.f18867N;
            yci yciVar2 = null;
            if (yciVar == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar = null;
            }
            yciVar.f101142I2.setCurrentValue(sharpness);
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar3;
            }
            TextView textView = yciVar2.f101175b3;
            if (sharpness > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append('+');
                sb.append(sharpness);
                strValueOf = sb.toString();
            } else if (sharpness < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('-');
                sb2.append(sharpness);
                strValueOf = sb2.toString();
            } else {
                strValueOf = String.valueOf(sharpness);
            }
            textView.setText(strValueOf);
            imageFragment.switchAdjustUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$49(ImageFragment imageFragment, View view) {
        String strValueOf;
        if (imageFragment.f18880g2 != 5) {
            imageFragment.f18880g2 = 5;
            T t = imageFragment.binding;
            md8.checkNotNull(t);
            int exposure = ((nu6) t).f65697H.getExposure();
            yci yciVar = imageFragment.f18867N;
            yci yciVar2 = null;
            if (yciVar == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar = null;
            }
            yciVar.f101142I2.setCurrentValue(exposure);
            yci yciVar3 = imageFragment.f18867N;
            if (yciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar3;
            }
            TextView textView = yciVar2.f101175b3;
            if (exposure > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append('+');
                sb.append(exposure);
                strValueOf = sb.toString();
            } else if (exposure < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('-');
                sb2.append(exposure);
                strValueOf = sb2.toString();
            } else {
                strValueOf = String.valueOf(exposure);
            }
            textView.setText(strValueOf);
            imageFragment.switchAdjustUI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth initOperationListener$lambda$50(ImageFragment imageFragment, int i) {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String strValueOf4;
        String strValueOf5;
        int i2 = imageFragment.f18880g2;
        yci yciVar = null;
        if (i2 == 1) {
            T t = imageFragment.binding;
            md8.checkNotNull(t);
            if (((nu6) t).f65697H.getBrightness() != i) {
                T t2 = imageFragment.binding;
                md8.checkNotNull(t2);
                ((nu6) t2).f65697H.setBrightnessValue(i);
                yci yciVar2 = imageFragment.f18867N;
                if (yciVar2 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar2;
                }
                TextView textView = yciVar.f101175b3;
                if (i > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('+');
                    sb.append(i);
                    strValueOf = sb.toString();
                } else if (i < 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('-');
                    sb2.append(i);
                    strValueOf = sb2.toString();
                } else {
                    strValueOf = String.valueOf(i);
                }
                textView.setText(strValueOf);
            }
        } else if (i2 == 2) {
            T t3 = imageFragment.binding;
            md8.checkNotNull(t3);
            if (((nu6) t3).f65697H.getContrast() != i) {
                T t4 = imageFragment.binding;
                md8.checkNotNull(t4);
                ((nu6) t4).f65697H.setContrastValue(i);
                yci yciVar3 = imageFragment.f18867N;
                if (yciVar3 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar3;
                }
                TextView textView2 = yciVar.f101175b3;
                if (i > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append('+');
                    sb3.append(i);
                    strValueOf2 = sb3.toString();
                } else if (i < 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append('-');
                    sb4.append(i);
                    strValueOf2 = sb4.toString();
                } else {
                    strValueOf2 = String.valueOf(i);
                }
                textView2.setText(strValueOf2);
            }
        } else if (i2 == 3) {
            T t5 = imageFragment.binding;
            md8.checkNotNull(t5);
            if (((nu6) t5).f65697H.getSaturation() != i) {
                T t6 = imageFragment.binding;
                md8.checkNotNull(t6);
                ((nu6) t6).f65697H.setSaturationValue(i);
                yci yciVar4 = imageFragment.f18867N;
                if (yciVar4 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar4;
                }
                TextView textView3 = yciVar.f101175b3;
                if (i > 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append('+');
                    sb5.append(i);
                    strValueOf3 = sb5.toString();
                } else if (i < 0) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append('-');
                    sb6.append(i);
                    strValueOf3 = sb6.toString();
                } else {
                    strValueOf3 = String.valueOf(i);
                }
                textView3.setText(strValueOf3);
            }
        } else if (i2 == 4) {
            T t7 = imageFragment.binding;
            md8.checkNotNull(t7);
            if (((nu6) t7).f65697H.getSharpness() != i) {
                T t8 = imageFragment.binding;
                md8.checkNotNull(t8);
                ((nu6) t8).f65697H.setSharpnessValue(i);
                yci yciVar5 = imageFragment.f18867N;
                if (yciVar5 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar5;
                }
                TextView textView4 = yciVar.f101175b3;
                if (i > 0) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append('+');
                    sb7.append(i);
                    strValueOf4 = sb7.toString();
                } else if (i < 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append('-');
                    sb8.append(i);
                    strValueOf4 = sb8.toString();
                } else {
                    strValueOf4 = String.valueOf(i);
                }
                textView4.setText(strValueOf4);
            }
        } else if (i2 == 5) {
            T t9 = imageFragment.binding;
            md8.checkNotNull(t9);
            if (((nu6) t9).f65697H.getExposure() != i) {
                T t10 = imageFragment.binding;
                md8.checkNotNull(t10);
                ((nu6) t10).f65697H.setExposureValue(i);
                yci yciVar6 = imageFragment.f18867N;
                if (yciVar6 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar6;
                }
                TextView textView5 = yciVar.f101175b3;
                if (i > 0) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append('+');
                    sb9.append(i);
                    strValueOf5 = sb9.toString();
                } else if (i < 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append('-');
                    sb10.append(i);
                    strValueOf5 = sb10.toString();
                } else {
                    strValueOf5 = String.valueOf(i);
                }
                textView5.setText(strValueOf5);
            }
        }
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$52(final ImageFragment imageFragment, View view) {
        T t = imageFragment.binding;
        md8.checkNotNull(t);
        yci yciVar = null;
        if (((nu6) t).f65697H.isAnyEffectsTransform()) {
            ae3 ae3Var = imageFragment.f18862F;
            if (ae3Var != null) {
                ae3Var.dismiss();
            }
            FragmentActivity fragmentActivityRequireActivity = imageFragment.requireActivity();
            md8.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ae3.C0191a c0191a = new ae3.C0191a(fragmentActivityRequireActivity);
            String string = imageFragment.getString(C2531R.string.tips);
            md8.checkNotNullExpressionValue(string, "getString(...)");
            ae3.C0191a title = c0191a.setTitle(string);
            String string2 = imageFragment.getString(C2531R.string.discard_changes_confirm);
            md8.checkNotNullExpressionValue(string2, "getString(...)");
            ae3.C0191a content = title.setContent(string2);
            String string3 = imageFragment.getString(C2531R.string.cancel);
            md8.checkNotNullExpressionValue(string3, "getString(...)");
            ae3.C0191a leftButton$default = ae3.C0191a.setLeftButton$default(content, string3, null, 2, null);
            String string4 = imageFragment.getString(C2531R.string.abandon);
            md8.checkNotNullExpressionValue(string4, "getString(...)");
            ae3 ae3VarCreate = leftButton$default.setRightButton(string4, new ny6() { // from class: lu7
                @Override // p000.ny6
                public final Object invoke() {
                    return ImageFragment.initOperationListener$lambda$52$lambda$51(this.f58786a);
                }
            }).create();
            imageFragment.f18862F = ae3VarCreate;
            md8.checkNotNull(ae3VarCreate);
            ae3VarCreate.show();
            return;
        }
        yci yciVar2 = imageFragment.f18867N;
        if (yciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar2 = null;
        }
        ConstraintLayout constraintLayout = yciVar2.f101185f;
        md8.checkNotNullExpressionValue(constraintLayout, "clImageAdjust");
        constraintLayout.setVisibility(8);
        yci yciVar3 = imageFragment.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        ConstraintLayout constraintLayout2 = yciVar3.f101145L;
        md8.checkNotNullExpressionValue(constraintLayout2, "clTopOpera");
        constraintLayout2.setVisibility(0);
        yci yciVar4 = imageFragment.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
        } else {
            yciVar = yciVar4;
        }
        LinearLayout linearLayout = yciVar.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        linearLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth initOperationListener$lambda$52$lambda$51(ImageFragment imageFragment) {
        imageFragment.resetEffects();
        yci yciVar = imageFragment.f18867N;
        yci yciVar2 = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        ConstraintLayout constraintLayout = yciVar.f101185f;
        md8.checkNotNullExpressionValue(constraintLayout, "clImageAdjust");
        constraintLayout.setVisibility(8);
        yci yciVar3 = imageFragment.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        ConstraintLayout constraintLayout2 = yciVar3.f101145L;
        md8.checkNotNullExpressionValue(constraintLayout2, "clTopOpera");
        constraintLayout2.setVisibility(0);
        yci yciVar4 = imageFragment.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
        } else {
            yciVar2 = yciVar4;
        }
        LinearLayout linearLayout = yciVar2.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        linearLayout.setVisibility(0);
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$53(ImageFragment imageFragment, View view) {
        yci yciVar = imageFragment.f18867N;
        yci yciVar2 = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        ConstraintLayout constraintLayout = yciVar.f101185f;
        md8.checkNotNullExpressionValue(constraintLayout, "clImageAdjust");
        constraintLayout.setVisibility(8);
        yci yciVar3 = imageFragment.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        ConstraintLayout constraintLayout2 = yciVar3.f101145L;
        md8.checkNotNullExpressionValue(constraintLayout2, "clTopOpera");
        constraintLayout2.setVisibility(0);
        yci yciVar4 = imageFragment.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
        } else {
            yciVar2 = yciVar4;
        }
        LinearLayout linearLayout = yciVar2.f101134C2;
        md8.checkNotNullExpressionValue(linearLayout, "llImageEdit");
        linearLayout.setVisibility(0);
        imageFragment.checkImageUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initOperationListener$lambda$55(final ImageFragment imageFragment, View view) {
        ae3 ae3Var = imageFragment.f18862F;
        if (ae3Var != null) {
            ae3Var.dismiss();
        }
        FragmentActivity fragmentActivityRequireActivity = imageFragment.requireActivity();
        md8.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ae3.C0191a c0191a = new ae3.C0191a(fragmentActivityRequireActivity);
        String string = imageFragment.getString(C2531R.string.tips);
        md8.checkNotNullExpressionValue(string, "getString(...)");
        ae3.C0191a title = c0191a.setTitle(string);
        String string2 = imageFragment.getString(C2531R.string.reset_confirm_message);
        md8.checkNotNullExpressionValue(string2, "getString(...)");
        ae3.C0191a content = title.setContent(string2);
        String string3 = imageFragment.getString(C2531R.string.cancel);
        md8.checkNotNullExpressionValue(string3, "getString(...)");
        ae3.C0191a leftButton$default = ae3.C0191a.setLeftButton$default(content, string3, null, 2, null);
        String string4 = imageFragment.getString(C2531R.string.reset);
        md8.checkNotNullExpressionValue(string4, "getString(...)");
        ae3 ae3VarCreate = leftButton$default.setRightButton(string4, new ny6() { // from class: wu7
            @Override // p000.ny6
            public final Object invoke() {
                return ImageFragment.initOperationListener$lambda$55$lambda$54(this.f95530a);
            }
        }).create();
        imageFragment.f18862F = ae3VarCreate;
        md8.checkNotNull(ae3VarCreate);
        ae3VarCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth initOperationListener$lambda$55$lambda$54(ImageFragment imageFragment) {
        fg1.launch$default(h59.getLifecycleScope(imageFragment), df4.getIO(), null, imageFragment.new C2837d(null), 2, null);
        return bth.f14751a;
    }

    private final void initPhotoListener() {
        xci xciVar = this.f18865M;
        if (xciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
            xciVar = null;
        }
        xciVar.f97532b.setOnCropChangeListener(new C2838e());
    }

    private final void initStyleFilterBitmap() {
        getMLoadingDialog().show();
        int i = 0;
        for (Object obj : this.f18875b2) {
            int i2 = i + 1;
            if (i < 0) {
                l82.throwIndexOverflow();
            }
            final String str = (String) obj;
            if (str.length() > 0) {
                Bitmap bitmap = this.f18864L;
                if (bitmap != null) {
                    getMStyleFilterUtil().applyStyleFilter(str, bitmap, new qy6() { // from class: ju7
                        @Override // p000.qy6
                        public final Object invoke(Object obj2) {
                            return ImageFragment.initStyleFilterBitmap$lambda$62$lambda$60$lambda$59(this.f51934a, str, (StyleFilterUtil.StyleFilterResult) obj2);
                        }
                    });
                }
            } else {
                Bitmap bitmap2 = this.f18864L;
                this.f18869V1 = bitmap2;
                if (bitmap2 != null) {
                    this.f18873Z1.put(str, bitmap2);
                    setStyleFilterBtimapUI(str);
                }
                this.f18872Z++;
                checkStyleFilterDone();
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth initStyleFilterBitmap$lambda$62$lambda$60$lambda$59(ImageFragment imageFragment, String str, StyleFilterUtil.StyleFilterResult styleFilterResult) {
        md8.checkNotNullParameter(styleFilterResult, "it");
        fg1.launch$default(h59.getLifecycleScope(imageFragment), df4.getMain(), null, new C2839f(styleFilterResult, imageFragment, str, null), 2, null);
        return bth.f14751a;
    }

    private final void initStyleFilterUI() {
        yci yciVar = this.f18867N;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        yciVar.f101131A2.removeAllViews();
        final int i = 0;
        for (Object obj : getMStyleFilterNameList()) {
            int i2 = i + 1;
            if (i < 0) {
                l82.throwIndexOverflow();
            }
            String str = (String) obj;
            ag8 ag8VarInflate = ag8.inflate(getLayoutInflater());
            md8.checkNotNullExpressionValue(ag8VarInflate, "inflate(...)");
            if (i != 0) {
                ViewGroup.LayoutParams layoutParams = ag8VarInflate.f1399c.getLayoutParams();
                md8.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(getResources().getDimensionPixelSize(C2531R.dimen.dp_23));
                ag8VarInflate.f1399c.setLayoutParams(layoutParams2);
                ComponentCallbacks2C2485a.with(this).asGif().load(Integer.valueOf(C2531R.drawable.ic_loading)).into(ag8VarInflate.f1398b);
            }
            ag8VarInflate.f1401e.setText(str);
            ag8VarInflate.f1399c.setTag(this.f18875b2.get(i));
            ag8VarInflate.f1399c.setOnClickListener(new View.OnClickListener() { // from class: ku7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ImageFragment.initStyleFilterUI$lambda$58$lambda$57(this.f55344a, i, view);
                }
            });
            this.f18878e2.add(ag8VarInflate);
            yci yciVar2 = this.f18867N;
            if (yciVar2 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar2 = null;
            }
            yciVar2.f101131A2.addView(ag8VarInflate.getRoot());
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initStyleFilterUI$lambda$58$lambda$57(ImageFragment imageFragment, int i, View view) {
        imageFragment.switchFilterUI(imageFragment.f18875b2.get(i));
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ boolean m5035l0(ImageFragment imageFragment, Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i2 & 8) != 0) {
            i = 90;
        }
        return imageFragment.saveBitmapToFile(bitmap, file, compressFormat, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fd3 mLoadingDialog_delegate$lambda$0(ImageFragment imageFragment) {
        FragmentActivity fragmentActivityRequireActivity = imageFragment.requireActivity();
        md8.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new fd3.C5725a(fragmentActivityRequireActivity).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mStyleFilterNameList_delegate$lambda$2(ImageFragment imageFragment) {
        return l82.listOf((Object[]) new String[]{imageFragment.getResources().getString(C2531R.string.original_image), imageFragment.getResources().getString(C2531R.string.style_filter_siln), imageFragment.getResources().getString(C2531R.string.style_filter_cyanate), imageFragment.getResources().getString(C2531R.string.style_filter_mist), imageFragment.getResources().getString(C2531R.string.style_filter_lux), imageFragment.getResources().getString(C2531R.string.style_filter_frost), imageFragment.getResources().getString(C2531R.string.style_filter_azure), imageFragment.getResources().getString(C2531R.string.style_filter_polar)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StyleFilterUtil mStyleFilterUtil_delegate$lambda$1(ImageFragment imageFragment) {
        StyleFilterUtil.Companion companion = StyleFilterUtil.Companion;
        FragmentActivity fragmentActivityRequireActivity = imageFragment.requireActivity();
        md8.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return companion.init((AppCompatActivity) fragmentActivityRequireActivity);
    }

    @do8
    @yfb
    public static final ImageFragment newInstance(@yfb String str, int i) {
        return f18859k2.newInstance(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onFilterTouchListener$lambda$67(ImageFragment imageFragment, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        xci xciVar = null;
        if (action == 0) {
            xci xciVar2 = imageFragment.f18865M;
            if (xciVar2 == null) {
                md8.throwUninitializedPropertyAccessException("bindingPhoto");
                xciVar2 = null;
            }
            AdvancedPhotoView advancedPhotoView = xciVar2.f97534d;
            md8.checkNotNullExpressionValue(advancedPhotoView, "originPhotoView");
            advancedPhotoView.setVisibility(0);
            xci xciVar3 = imageFragment.f18865M;
            if (xciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingPhoto");
            } else {
                xciVar = xciVar3;
            }
            AdvancedPhotoView advancedPhotoView2 = xciVar.f97533c;
            md8.checkNotNullExpressionValue(advancedPhotoView2, "filterPhotoView");
            advancedPhotoView2.setVisibility(8);
        } else if (action == 1) {
            xci xciVar4 = imageFragment.f18865M;
            if (xciVar4 == null) {
                md8.throwUninitializedPropertyAccessException("bindingPhoto");
                xciVar4 = null;
            }
            AdvancedPhotoView advancedPhotoView3 = xciVar4.f97533c;
            md8.checkNotNullExpressionValue(advancedPhotoView3, "filterPhotoView");
            advancedPhotoView3.setVisibility(0);
            xci xciVar5 = imageFragment.f18865M;
            if (xciVar5 == null) {
                md8.throwUninitializedPropertyAccessException("bindingPhoto");
            } else {
                xciVar = xciVar5;
            }
            AdvancedPhotoView advancedPhotoView4 = xciVar.f97534d;
            md8.checkNotNullExpressionValue(advancedPhotoView4, "originPhotoView");
            advancedPhotoView4.setVisibility(8);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTouchListener$lambda$66(ImageFragment imageFragment, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        xci xciVar = null;
        if (action == 0) {
            xci xciVar2 = imageFragment.f18865M;
            if (xciVar2 == null) {
                md8.throwUninitializedPropertyAccessException("bindingPhoto");
            } else {
                xciVar = xciVar2;
            }
            AdvancedPhotoView advancedPhotoView = xciVar.f97534d;
            md8.checkNotNullExpressionValue(advancedPhotoView, "originPhotoView");
            advancedPhotoView.setVisibility(0);
            T t = imageFragment.binding;
            md8.checkNotNull(t);
            AdvancedPhotoView advancedPhotoView2 = ((nu6) t).f65697H;
            md8.checkNotNullExpressionValue(advancedPhotoView2, "photoView");
            advancedPhotoView2.setVisibility(8);
        } else if (action == 1) {
            T t2 = imageFragment.binding;
            md8.checkNotNull(t2);
            AdvancedPhotoView advancedPhotoView3 = ((nu6) t2).f65697H;
            md8.checkNotNullExpressionValue(advancedPhotoView3, "photoView");
            advancedPhotoView3.setVisibility(0);
            xci xciVar3 = imageFragment.f18865M;
            if (xciVar3 == null) {
                md8.throwUninitializedPropertyAccessException("bindingPhoto");
            } else {
                xciVar = xciVar3;
            }
            AdvancedPhotoView advancedPhotoView4 = xciVar.f97534d;
            md8.checkNotNullExpressionValue(advancedPhotoView4, "originPhotoView");
            advancedPhotoView4.setVisibility(8);
        }
        return true;
    }

    private final void previewImage(String str) {
        boolean z;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Boolean boolValueOf = null;
        if (m9g.contains$default((CharSequence) lowerCase, (CharSequence) "thumbnail", false, 2, (Object) null)) {
            ((nu6) this.binding).f65706e.setVisibility(0);
            ((nu6) this.binding).f65704c.setVisibility(8);
        } else {
            ((nu6) this.binding).f65706e.setVisibility(8);
            ((nu6) this.binding).f65704c.setVisibility(0);
        }
        Uri uri = Uri.parse(str);
        this.f18737c = uri;
        ((nu6) this.binding).f65699M.setText(uri.getLastPathSegment());
        StringBuilder sb = new StringBuilder();
        sb.append("ImageFragment当前加载的图片地址：");
        sb.append(str);
        sb.append(",目前所有的在处理中的图片地址：");
        mtc mtcVar = mtc.f62107a;
        sb.append(mtcVar.getFilterPhotoListLiveData());
        Log.e("xtest", sb.toString());
        CopyOnWriteArrayList<Uri> filterPhotoListLiveData = mtcVar.getFilterPhotoListLiveData();
        if (filterPhotoListLiveData != null) {
            if (filterPhotoListLiveData.isEmpty()) {
                z = false;
                boolValueOf = Boolean.valueOf(z);
            } else {
                Iterator<T> it = filterPhotoListLiveData.iterator();
                while (it.hasNext()) {
                    String string = ((Uri) it.next()).toString();
                    md8.checkNotNullExpressionValue(string, "toString(...)");
                    if (m9g.contains$default((CharSequence) string, (CharSequence) h9g.replace$default(str, "_filter", "", false, 4, (Object) null), false, 2, (Object) null)) {
                        z = true;
                        break;
                    }
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
            }
        }
        Log.e("xtest", "ImageFragment当前图片是否正在降噪中：" + boolValueOf);
        if (md8.areEqual(boolValueOf, Boolean.TRUE)) {
            T t = this.binding;
            md8.checkNotNull(t);
            ((nu6) t).f65695C.setVisibility(8);
            T t2 = this.binding;
            md8.checkNotNull(t2);
            ((nu6) t2).f65704c.setVisibility(8);
        } else {
            T t3 = this.binding;
            md8.checkNotNull(t3);
            ((nu6) t3).f65695C.setVisibility(0);
            FrameLayout frameLayout = ((nu6) this.binding).f65706e;
            md8.checkNotNullExpressionValue(frameLayout, "flThumbnail");
            if (frameLayout.getVisibility() == 0) {
                T t4 = this.binding;
                md8.checkNotNull(t4);
                ((nu6) t4).f65704c.setVisibility(8);
            } else {
                T t5 = this.binding;
                md8.checkNotNull(t5);
                ((nu6) t5).f65704c.setVisibility(0);
            }
        }
        T t6 = this.binding;
        md8.checkNotNull(t6);
        ((nu6) t6).f65697H.setVisibility(0);
        T t7 = this.binding;
        md8.checkNotNull(t7);
        ((nu6) t7).f65697H.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RequestBuilder requestBuilderSignature = ComponentCallbacks2C2485a.with(this).load(str).diskCacheStrategy(ne4.f64121e).signature(new bkb(Long.valueOf(new File(str).lastModified())));
        T t8 = this.binding;
        md8.checkNotNull(t8);
        requestBuilderSignature.into(((nu6) t8).f65697H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetAllImageOperation() {
        resetEdit();
        this.f18877d2 = "";
        resetEffects();
        resetRatioUI();
        this.f18876c2 = -1;
        setStyleFilterBtimapUI(this.f18877d2);
        Iterator<T> it = this.f18878e2.iterator();
        while (it.hasNext()) {
            ComponentCallbacks2C2485a.with(this).asGif().load(Integer.valueOf(C2531R.drawable.ic_loading)).into(((ag8) it.next()).f1398b);
        }
        RequestBuilder<Drawable> requestBuilderLoad = ComponentCallbacks2C2485a.with(this).load(this.f18736b);
        ne4 ne4Var = ne4.f64121e;
        RequestBuilder requestBuilderDiskCacheStrategy = requestBuilderLoad.diskCacheStrategy(ne4Var);
        xci xciVar = this.f18865M;
        if (xciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
            xciVar = null;
        }
        requestBuilderDiskCacheStrategy.into(xciVar.f97534d);
        RequestBuilder requestBuilderDiskCacheStrategy2 = ComponentCallbacks2C2485a.with(this).load(this.f18736b).diskCacheStrategy(ne4Var);
        T t = this.binding;
        md8.checkNotNull(t);
        requestBuilderDiskCacheStrategy2.into(((nu6) t).f65697H);
    }

    private final void resetEdit() {
        yci yciVar = this.f18867N;
        xci xciVar = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        yciVar.f101200p2.setImageResource(C2531R.drawable.ic_image_rotate);
        yci yciVar2 = this.f18867N;
        if (yciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar2 = null;
        }
        yciVar2.f101172a3.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar3 = this.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        yciVar3.f101197m2.setImageResource(C2531R.drawable.ic_image_mirror);
        yci yciVar4 = this.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar4 = null;
        }
        yciVar4.f101155Q2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar5 = this.f18867N;
        if (yciVar5 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar5 = null;
        }
        yciVar5.f101198n2.setImageResource(C2531R.drawable.ic_image_scale);
        yci yciVar6 = this.f18867N;
        if (yciVar6 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar6 = null;
        }
        yciVar6.f101169Z2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar7 = this.f18867N;
        if (yciVar7 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar7 = null;
        }
        LinearLayout linearLayout = yciVar7.f101139G2;
        md8.checkNotNullExpressionValue(linearLayout, "llScaleOrientation");
        linearLayout.setVisibility(8);
        yci yciVar8 = this.f18867N;
        if (yciVar8 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar8 = null;
        }
        CardView cardView = yciVar8.f101154Q;
        md8.checkNotNullExpressionValue(cardView, "cvScaleDetail");
        cardView.setVisibility(8);
        yci yciVar9 = this.f18867N;
        if (yciVar9 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar9 = null;
        }
        yciVar9.f101136E2.setTag(Boolean.FALSE);
        xci xciVar2 = this.f18865M;
        if (xciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
        } else {
            xciVar = xciVar2;
        }
        CropOverlayView cropOverlayView = xciVar.f97532b;
        md8.checkNotNullExpressionValue(cropOverlayView, "covPhotoView");
        cropOverlayView.setVisibility(8);
        T t = this.binding;
        md8.checkNotNull(t);
        ((nu6) t).f65697H.resetAllTransform();
    }

    private final void resetEffects() {
        T t = this.binding;
        md8.checkNotNull(t);
        ((nu6) t).f65697H.resetEffects();
        yci yciVar = this.f18867N;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        yciVar.f101142I2.setCurrentValue(0);
        this.f18880g2 = -1;
        switchAdjustUI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetPhotoViewSize(boolean z) {
        T t = this.binding;
        md8.checkNotNull(t);
        ViewGroup.LayoutParams layoutParams = ((nu6) t).f65697H.getLayoutParams();
        md8.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0894b c0894b = (ConstraintLayout.C0894b) layoutParams;
        if (z) {
            ((ViewGroup.MarginLayoutParams) c0894b).width = 0;
            c0894b.f6704V = 0.8f;
            ((ViewGroup.MarginLayoutParams) c0894b).height = 0;
            c0894b.f6705W = 0.8f;
            c0894b.f6747t = 0;
            c0894b.f6751v = 0;
            c0894b.f6725i = 0;
            c0894b.f6731l = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) c0894b).width = -1;
            ((ViewGroup.MarginLayoutParams) c0894b).height = -1;
        }
        T t2 = this.binding;
        md8.checkNotNull(t2);
        ((nu6) t2).f65697H.setLayoutParams(c0894b);
    }

    private final void resetRatioUI() {
        yci yciVar = this.f18867N;
        yci yciVar2 = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        yciVar.f101156R2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar3 = this.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        yciVar3.f101153P2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar4 = this.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar4 = null;
        }
        yciVar4.f101157S2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar5 = this.f18867N;
        if (yciVar5 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar5 = null;
        }
        yciVar5.f101164X2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar6 = this.f18867N;
        if (yciVar6 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar6 = null;
        }
        yciVar6.f101162W2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar7 = this.f18867N;
        if (yciVar7 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar7 = null;
        }
        yciVar7.f101166Y2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar8 = this.f18867N;
        if (yciVar8 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar8 = null;
        }
        yciVar8.f101158T2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar9 = this.f18867N;
        if (yciVar9 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar9 = null;
        }
        yciVar9.f101159U2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar10 = this.f18867N;
        if (yciVar10 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar10 = null;
        }
        yciVar10.f101161V2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        T t = this.binding;
        md8.checkNotNull(t);
        Bitmap currentBitmap = ((nu6) t).f65697H.getCurrentBitmap();
        if (currentBitmap != null) {
            if (currentBitmap.getWidth() > currentBitmap.getHeight()) {
                yci yciVar11 = this.f18867N;
                if (yciVar11 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar11 = null;
                }
                yciVar11.f101202r2.setImageResource(C2531R.drawable.ic_image_vertical);
                yci yciVar12 = this.f18867N;
                if (yciVar12 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar2 = yciVar12;
                }
                yciVar2.f101201q2.setImageResource(C2531R.drawable.ic_image_landscape_selected);
                return;
            }
            yci yciVar13 = this.f18867N;
            if (yciVar13 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
                yciVar13 = null;
            }
            yciVar13.f101202r2.setImageResource(C2531R.drawable.ic_image_vertical_selected);
            yci yciVar14 = this.f18867N;
            if (yciVar14 == null) {
                md8.throwUninitializedPropertyAccessException("bindingOperation");
            } else {
                yciVar2 = yciVar14;
            }
            yciVar2.f101201q2.setImageResource(C2531R.drawable.ic_image_landscape);
        }
    }

    private final boolean saveBitmapToFile(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i) {
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, i, fileOutputStream);
                fileOutputStream.flush();
                bth bthVar = bth.f14751a;
                u52.closeFinally(fileOutputStream, null);
                return true;
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendViewPagerScrollEnable(boolean z) {
        pb9.get("ImageSlideEnable").post(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStyleFilterBtimapUI(String str) {
        for (ag8 ag8Var : this.f18878e2) {
            if (md8.areEqual(ag8Var.f1399c.getTag(), str)) {
                ag8Var.f1398b.setImageDrawable(new BitmapDrawable(this.f18873Z1.get(str)));
            }
        }
    }

    private final void switchAdjustUI() {
        yci yciVar = this.f18867N;
        yci yciVar2 = null;
        if (yciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar = null;
        }
        yciVar.f101167Z.setImageResource(C2531R.drawable.ic_image_auto);
        yci yciVar3 = this.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        yciVar3.f101148M1.setImageResource(C2531R.drawable.ic_image_brightness);
        yci yciVar4 = this.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar4 = null;
        }
        yciVar4.f101160V1.setImageResource(C2531R.drawable.ic_image_contrast);
        yci yciVar5 = this.f18867N;
        if (yciVar5 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar5 = null;
        }
        yciVar5.f101171a2.setImageResource(C2531R.drawable.ic_image_saturability);
        yci yciVar6 = this.f18867N;
        if (yciVar6 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar6 = null;
        }
        yciVar6.f101174b2.setImageResource(C2531R.drawable.ic_image_acutance);
        yci yciVar7 = this.f18867N;
        if (yciVar7 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar7 = null;
        }
        yciVar7.f101168Z1.setImageResource(C2531R.drawable.ic_image_sensitometry);
        yci yciVar8 = this.f18867N;
        if (yciVar8 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar8 = null;
        }
        yciVar8.f101143J2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar9 = this.f18867N;
        if (yciVar9 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar9 = null;
        }
        yciVar9.f101144K2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar10 = this.f18867N;
        if (yciVar10 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar10 = null;
        }
        yciVar10.f101146L2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar11 = this.f18867N;
        if (yciVar11 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar11 = null;
        }
        yciVar11.f101151N2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar12 = this.f18867N;
        if (yciVar12 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar12 = null;
        }
        yciVar12.f101152O2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar13 = this.f18867N;
        if (yciVar13 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar13 = null;
        }
        yciVar13.f101149M2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
        yci yciVar14 = this.f18867N;
        if (yciVar14 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar14 = null;
        }
        View view = yciVar14.f101178c3;
        md8.checkNotNullExpressionValue(view, "vAdjustAuto");
        view.setVisibility(8);
        yci yciVar15 = this.f18867N;
        if (yciVar15 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar15 = null;
        }
        View view2 = yciVar15.f101181d3;
        md8.checkNotNullExpressionValue(view2, "vAdjustBrightness");
        view2.setVisibility(8);
        yci yciVar16 = this.f18867N;
        if (yciVar16 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar16 = null;
        }
        View view3 = yciVar16.f101184e3;
        md8.checkNotNullExpressionValue(view3, "vAdjustContrast");
        view3.setVisibility(8);
        yci yciVar17 = this.f18867N;
        if (yciVar17 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar17 = null;
        }
        View view4 = yciVar17.f101189g3;
        md8.checkNotNullExpressionValue(view4, "vAdjustSaturation");
        view4.setVisibility(8);
        yci yciVar18 = this.f18867N;
        if (yciVar18 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar18 = null;
        }
        View view5 = yciVar18.f101191h3;
        md8.checkNotNullExpressionValue(view5, "vAdjustSharpness");
        view5.setVisibility(8);
        yci yciVar19 = this.f18867N;
        if (yciVar19 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar19 = null;
        }
        View view6 = yciVar19.f101187f3;
        md8.checkNotNullExpressionValue(view6, "vAdjustExposure");
        view6.setVisibility(8);
        yci yciVar20 = this.f18867N;
        if (yciVar20 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar20 = null;
        }
        yciVar20.f101142I2.setVisibility(0);
        yci yciVar21 = this.f18867N;
        if (yciVar21 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar21 = null;
        }
        yciVar21.f101175b3.setVisibility(0);
        switch (this.f18880g2) {
            case -1:
                yci yciVar22 = this.f18867N;
                if (yciVar22 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar22 = null;
                }
                yciVar22.f101142I2.setVisibility(4);
                yci yciVar23 = this.f18867N;
                if (yciVar23 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar2 = yciVar23;
                }
                yciVar2.f101175b3.setVisibility(4);
                break;
            case 0:
                yci yciVar24 = this.f18867N;
                if (yciVar24 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar24 = null;
                }
                yciVar24.f101167Z.setImageResource(C2531R.drawable.ic_image_auto_selected);
                yci yciVar25 = this.f18867N;
                if (yciVar25 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar25 = null;
                }
                yciVar25.f101143J2.setTextColor(requireActivity().getColor(C2531R.color.t_ffd100));
                yci yciVar26 = this.f18867N;
                if (yciVar26 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar26 = null;
                }
                View view7 = yciVar26.f101178c3;
                md8.checkNotNullExpressionValue(view7, "vAdjustAuto");
                view7.setVisibility(0);
                yci yciVar27 = this.f18867N;
                if (yciVar27 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar27 = null;
                }
                yciVar27.f101142I2.setVisibility(4);
                yci yciVar28 = this.f18867N;
                if (yciVar28 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar2 = yciVar28;
                }
                yciVar2.f101175b3.setVisibility(4);
                break;
            case 1:
                yci yciVar29 = this.f18867N;
                if (yciVar29 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar29 = null;
                }
                yciVar29.f101148M1.setImageResource(C2531R.drawable.ic_image_brightness_selected);
                yci yciVar30 = this.f18867N;
                if (yciVar30 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar30 = null;
                }
                yciVar30.f101144K2.setTextColor(requireActivity().getColor(C2531R.color.t_ffd100));
                yci yciVar31 = this.f18867N;
                if (yciVar31 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar2 = yciVar31;
                }
                View view8 = yciVar2.f101181d3;
                md8.checkNotNullExpressionValue(view8, "vAdjustBrightness");
                view8.setVisibility(0);
                break;
            case 2:
                yci yciVar32 = this.f18867N;
                if (yciVar32 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar32 = null;
                }
                yciVar32.f101160V1.setImageResource(C2531R.drawable.ic_image_contrast_selected);
                yci yciVar33 = this.f18867N;
                if (yciVar33 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar33 = null;
                }
                yciVar33.f101146L2.setTextColor(requireActivity().getColor(C2531R.color.t_ffd100));
                yci yciVar34 = this.f18867N;
                if (yciVar34 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar2 = yciVar34;
                }
                View view9 = yciVar2.f101184e3;
                md8.checkNotNullExpressionValue(view9, "vAdjustContrast");
                view9.setVisibility(0);
                break;
            case 3:
                yci yciVar35 = this.f18867N;
                if (yciVar35 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar35 = null;
                }
                yciVar35.f101171a2.setImageResource(C2531R.drawable.ic_image_saturability_selected);
                yci yciVar36 = this.f18867N;
                if (yciVar36 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar36 = null;
                }
                yciVar36.f101151N2.setTextColor(requireActivity().getColor(C2531R.color.t_ffd100));
                yci yciVar37 = this.f18867N;
                if (yciVar37 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar2 = yciVar37;
                }
                View view10 = yciVar2.f101189g3;
                md8.checkNotNullExpressionValue(view10, "vAdjustSaturation");
                view10.setVisibility(0);
                break;
            case 4:
                yci yciVar38 = this.f18867N;
                if (yciVar38 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar38 = null;
                }
                yciVar38.f101174b2.setImageResource(C2531R.drawable.ic_image_acutance_selected);
                yci yciVar39 = this.f18867N;
                if (yciVar39 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar39 = null;
                }
                yciVar39.f101152O2.setTextColor(requireActivity().getColor(C2531R.color.t_ffd100));
                yci yciVar40 = this.f18867N;
                if (yciVar40 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar2 = yciVar40;
                }
                View view11 = yciVar2.f101191h3;
                md8.checkNotNullExpressionValue(view11, "vAdjustSharpness");
                view11.setVisibility(0);
                break;
            case 5:
                yci yciVar41 = this.f18867N;
                if (yciVar41 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar41 = null;
                }
                yciVar41.f101168Z1.setImageResource(C2531R.drawable.ic_image_sensitometry_selected);
                yci yciVar42 = this.f18867N;
                if (yciVar42 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar42 = null;
                }
                yciVar42.f101149M2.setTextColor(requireActivity().getColor(C2531R.color.t_ffd100));
                yci yciVar43 = this.f18867N;
                if (yciVar43 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar2 = yciVar43;
                }
                View view12 = yciVar2.f101187f3;
                md8.checkNotNullExpressionValue(view12, "vAdjustExposure");
                view12.setVisibility(0);
                break;
        }
    }

    private final void switchFilterUI(String str) {
        if (!md8.areEqual(this.f18877d2, str) || this.f18877d2.length() == 0) {
            this.f18877d2 = str;
            for (ag8 ag8Var : this.f18878e2) {
                if (md8.areEqual(ag8Var.f1399c.getTag(), str)) {
                    ag8Var.f1400d.setBackgroundResource(C2531R.drawable.border_ffffff_1_corner_12);
                    ag8Var.f1401e.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
                } else {
                    ag8Var.f1400d.setBackgroundResource(0);
                    ag8Var.f1401e.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
                }
            }
            xci xciVar = this.f18865M;
            if (xciVar == null) {
                md8.throwUninitializedPropertyAccessException("bindingPhoto");
                xciVar = null;
            }
            xciVar.f97533c.setImageDrawable(new BitmapDrawable(this.f18873Z1.get(this.f18877d2)));
        }
    }

    private final void switchRatioUI(AdvancedPhotoView.EnumC2814a enumC2814a) {
        xci xciVar = this.f18865M;
        yci yciVar = null;
        if (xciVar == null) {
            md8.throwUninitializedPropertyAccessException("bindingPhoto");
            xciVar = null;
        }
        CropOverlayView cropOverlayView = xciVar.f97532b;
        md8.checkNotNullExpressionValue(cropOverlayView, "covPhotoView");
        cropOverlayView.setVisibility(8);
        yci yciVar2 = this.f18867N;
        if (yciVar2 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar2 = null;
        }
        LinearLayout linearLayout = yciVar2.f101139G2;
        md8.checkNotNullExpressionValue(linearLayout, "llScaleOrientation");
        linearLayout.setVisibility(0);
        yci yciVar3 = this.f18867N;
        if (yciVar3 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar3 = null;
        }
        yciVar3.f101156R2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar4 = this.f18867N;
        if (yciVar4 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar4 = null;
        }
        yciVar4.f101153P2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar5 = this.f18867N;
        if (yciVar5 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar5 = null;
        }
        yciVar5.f101157S2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar6 = this.f18867N;
        if (yciVar6 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar6 = null;
        }
        yciVar6.f101164X2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar7 = this.f18867N;
        if (yciVar7 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar7 = null;
        }
        yciVar7.f101162W2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar8 = this.f18867N;
        if (yciVar8 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar8 = null;
        }
        yciVar8.f101166Y2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar9 = this.f18867N;
        if (yciVar9 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar9 = null;
        }
        yciVar9.f101158T2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar10 = this.f18867N;
        if (yciVar10 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar10 = null;
        }
        yciVar10.f101159U2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        yci yciVar11 = this.f18867N;
        if (yciVar11 == null) {
            md8.throwUninitializedPropertyAccessException("bindingOperation");
            yciVar11 = null;
        }
        yciVar11.f101161V2.setTextColor(requireActivity().getColor(C2531R.color.t_818588));
        switch (C2835b.f18884a[enumC2814a.ordinal()]) {
            case 1:
                yci yciVar12 = this.f18867N;
                if (yciVar12 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar12;
                }
                yciVar.f101156R2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
                break;
            case 2:
                yci yciVar13 = this.f18867N;
                if (yciVar13 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                    yciVar13 = null;
                }
                yciVar13.f101153P2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
                xci xciVar2 = this.f18865M;
                if (xciVar2 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingPhoto");
                    xciVar2 = null;
                }
                CropOverlayView cropOverlayView2 = xciVar2.f97532b;
                md8.checkNotNullExpressionValue(cropOverlayView2, "covPhotoView");
                cropOverlayView2.setVisibility(0);
                yci yciVar14 = this.f18867N;
                if (yciVar14 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar14;
                }
                LinearLayout linearLayout2 = yciVar.f101139G2;
                md8.checkNotNullExpressionValue(linearLayout2, "llScaleOrientation");
                linearLayout2.setVisibility(8);
                break;
            case 3:
                yci yciVar15 = this.f18867N;
                if (yciVar15 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar15;
                }
                yciVar.f101157S2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
                break;
            case 4:
                yci yciVar16 = this.f18867N;
                if (yciVar16 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar16;
                }
                yciVar.f101159U2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
                break;
            case 5:
                yci yciVar17 = this.f18867N;
                if (yciVar17 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar17;
                }
                yciVar.f101161V2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
                break;
            case 6:
                yci yciVar18 = this.f18867N;
                if (yciVar18 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar18;
                }
                yciVar.f101162W2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
                break;
            case 7:
                yci yciVar19 = this.f18867N;
                if (yciVar19 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar19;
                }
                yciVar.f101164X2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
                break;
            case 8:
                yci yciVar20 = this.f18867N;
                if (yciVar20 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar20;
                }
                yciVar.f101166Y2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
                break;
            case 9:
                yci yciVar21 = this.f18867N;
                if (yciVar21 == null) {
                    md8.throwUninitializedPropertyAccessException("bindingOperation");
                } else {
                    yciVar = yciVar21;
                }
                yciVar.f101158T2.setTextColor(requireActivity().getColor(C2531R.color.t_ecf3f3));
                break;
        }
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment
    /* JADX INFO: renamed from: f */
    public void mo4972f(int i) {
        super.mo4972f(i);
        if (i < 0 || i >= 100) {
            ((nu6) this.binding).f65706e.setVisibility(8);
            ((nu6) this.binding).f65704c.setVisibility(0);
        } else {
            ((nu6) this.binding).f65706e.setVisibility(0);
            ((nu6) this.binding).f65704c.setVisibility(8);
        }
        ((nu6) this.binding).f65698L.setCurrent(i);
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment, com.watchfun.base.BaseFragment
    public void initView() {
        super.initView();
        initMListener();
        String str = this.f18736b;
        md8.checkNotNullExpressionValue(str, "curFileUri");
        previewImage(str);
        T t = this.binding;
        md8.checkNotNull(t);
        ((nu6) t).f65697H.setWatermarkResource(C2531R.drawable.ic_watermask);
        T t2 = this.binding;
        md8.checkNotNull(t2);
        ((nu6) t2).f65697H.setWatermarkVisible(true);
        fg1.launch$default(h59.getLifecycleScope(this), df4.getIO(), null, new C2840g(null), 2, null);
    }

    @Override // com.watchfun.base.BaseFragment
    @yfb
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public nu6 provideViewBinding(@gib ViewGroup viewGroup) {
        nu6 nu6VarInflate = nu6.inflate(getLayoutInflater(), viewGroup, false);
        md8.checkNotNullExpressionValue(nu6VarInflate, "inflate(...)");
        return nu6VarInflate;
    }

    @Override // com.watchfun.base.BaseFragment
    public void loadData() {
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment, com.watchfun.base.BaseFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment, com.watchfun.base.LazyLoadFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment, com.watchfun.base.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@yfb View view, @gib Bundle bundle) {
        md8.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Log.e("xtest", "ImageFragment的UI加载完毕,此时的图片地址：" + this.f18736b);
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment
    public void setCurrentPosition(int i) {
        this.f18738d = i;
    }

    @Override // com.eyevue.glassapp.view.photo.BaseMediaFragment
    public void updateMedia(@yfb String str) {
        md8.checkNotNullParameter(str, "filePath");
        super.updateMedia(str);
        this.f18736b = str;
        previewImage(str);
    }
}
